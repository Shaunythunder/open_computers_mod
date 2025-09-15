/*     */ package li.cil.oc.api.prefab;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.TreeMap;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.nbt.NBTTagList;
/*     */ 
/*     */ public class ItemStackArrayValue extends AbstractValue {
/*  14 */   private ItemStack[] array = null;
/*     */   
/*     */   private int iteratorIndex;
/*  17 */   private static final byte TAGLIST_ID = (new NBTTagList()).func_74732_a();
/*  18 */   private static final byte COMPOUND_ID = (new NBTTagCompound()).func_74732_a();
/*     */   
/*     */   private static final String ARRAY_KEY = "Array";
/*     */   private static final String INDEX_KEY = "Index";
/*  22 */   private static final HashMap<Object, Object> emptyMap = new HashMap<>();
/*     */   
/*     */   public ItemStackArrayValue(ItemStack[] arr) {
/*  25 */     if (arr != null) {
/*  26 */       this.array = new ItemStack[arr.length];
/*  27 */       for (int i = 0; i < arr.length; i++) {
/*  28 */         this.array[i] = (arr[i] != null) ? arr[i].func_77946_l() : null;
/*     */       }
/*     */     } 
/*  31 */     this.iteratorIndex = 0;
/*     */   }
/*     */   
/*     */   public ItemStackArrayValue() {
/*  35 */     this(null);
/*     */   }
/*     */ 
/*     */   
/*     */   public Object[] call(Context context, Arguments arguments) {
/*  40 */     if (this.array == null) return null; 
/*  41 */     if (this.iteratorIndex >= this.array.length) return null; 
/*  42 */     int index = this.iteratorIndex++;
/*  43 */     if (this.array[index] == null)
/*  44 */       return new Object[] { emptyMap }; 
/*  45 */     return new Object[] { (this.array[index] != null) ? this.array[index] : emptyMap };
/*     */   }
/*     */ 
/*     */   
/*     */   public Object apply(Context context, Arguments arguments) {
/*  50 */     if (arguments.count() == 0 || this.array == null) return null; 
/*  51 */     if (arguments.isInteger(0)) {
/*  52 */       int luaIndex = arguments.checkInteger(0);
/*  53 */       if (luaIndex > this.array.length || luaIndex < 1) {
/*  54 */         return null;
/*     */       }
/*  56 */       return this.array[luaIndex - 1];
/*     */     } 
/*  58 */     if (arguments.isString(0)) {
/*  59 */       String arg = arguments.checkString(0);
/*  60 */       if (arg.equals("n")) {
/*  61 */         return Integer.valueOf(this.array.length);
/*     */       }
/*     */     } 
/*  64 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void load(NBTTagCompound nbt) {
/*  69 */     if (nbt.func_150297_b("Array", TAGLIST_ID))
/*  70 */     { NBTTagList tagList = nbt.func_150295_c("Array", COMPOUND_ID);
/*  71 */       this.array = new ItemStack[tagList.func_74745_c()];
/*  72 */       for (int i = 0; i < tagList.func_74745_c(); i++) {
/*  73 */         NBTTagCompound el = tagList.func_150305_b(i);
/*  74 */         if (el.func_82582_d()) { this.array[i] = null; }
/*  75 */         else { this.array[i] = ItemStack.func_77949_a(el); }
/*     */       
/*     */       }  }
/*  78 */     else { this.array = null; }
/*     */     
/*  80 */     this.iteratorIndex = nbt.func_74762_e("Index");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void save(NBTTagCompound nbt) {
/*  86 */     NBTTagCompound nullnbt = new NBTTagCompound();
/*     */     
/*  88 */     if (this.array != null) {
/*  89 */       NBTTagList nbttaglist = new NBTTagList();
/*  90 */       for (ItemStack stack : this.array) {
/*  91 */         if (stack != null) {
/*  92 */           NBTTagCompound nbttagcompound = new NBTTagCompound();
/*  93 */           stack.func_77955_b(nbttagcompound);
/*  94 */           nbttaglist.func_74742_a((NBTBase)nbttagcompound);
/*     */         } else {
/*  96 */           nbttaglist.func_74742_a((NBTBase)nullnbt);
/*     */         } 
/*     */       } 
/*     */       
/* 100 */       nbt.func_74782_a("Array", (NBTBase)nbttaglist);
/*     */     } 
/*     */     
/* 103 */     nbt.func_74768_a("Index", this.iteratorIndex);
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():nil -- Reset the iterator index so that the next call will return the first element.")
/*     */   public Object[] reset(Context context, Arguments arguments) throws Exception {
/* 108 */     this.iteratorIndex = 0;
/* 109 */     return null;
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():number -- Returns the number of elements in the this.array.")
/*     */   public Object[] count(Context context, Arguments arguments) throws Exception {
/* 114 */     return new Object[] { Integer.valueOf((this.array != null) ? this.array.length : 0) };
/*     */   }
/*     */   
/*     */   @Callback(doc = "function():table -- Returns ALL the stack in the this.array. Memory intensive.")
/*     */   public Object[] getAll(Context context, Arguments arguments) throws Exception {
/* 119 */     TreeMap<Integer, Object> map = new TreeMap<>();
/* 120 */     for (int i = 0; i < this.array.length; i++) {
/* 121 */       map.put(Integer.valueOf(i), (this.array[i] != null) ? this.array[i] : emptyMap);
/*     */     }
/* 123 */     return new Object[] { map };
/*     */   }
/*     */   
/*     */   public String toString() {
/* 127 */     return "{ItemStack Array}";
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\ItemStackArrayValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */