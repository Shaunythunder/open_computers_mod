/*    */ package li.cil.oc.common.inventory;
/*    */ 
/*    */ import li.cil.oc.util.ExtendedNBT$;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Function1;
/*    */ import scala.MatchError;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.Some;
/*    */ import scala.Tuple2;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.AbstractPartialFunction;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.IntRef;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001)4q!\001\002\021\002\007\005QBA\005J]Z,g\016^8ss*\0211\001B\001\nS:4XM\034;pefT!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\004\00191\002CA\b\025\033\005\001\"BA\t\023\003\021a\027M\\4\013\003M\tAA[1wC&\021Q\003\005\002\007\037\nTWm\031;\021\005]AR\"\001\002\n\005e\021!aD*j[BdW-\0238wK:$xN]=\t\013m\001A\021\001\017\002\r\021Jg.\033;%)\005i\002C\001\020\"\033\005y\"\"\001\021\002\013M\034\027\r\\1\n\005\tz\"\001B+oSRDQ\001\n\001\007\002\025\nQ!\033;f[N,\022A\n\t\004=\035J\023B\001\025 \005\025\t%O]1z!\rq\"\006L\005\003W}\021aa\0249uS>t\007CA\0275\033\005q#BA\0301\003\021IG/Z7\013\005E\022\024!C7j]\026\034'/\0314u\025\005\031\024a\0018fi&\021QG\f\002\n\023R,Wn\025;bG.DQa\016\001\005\002a\n1\"\0369eCR,\027\n^3ngR\031Q$\017 \t\013i2\004\031A\036\002\tMdw\016\036\t\003=qJ!!P\020\003\007%sG\017C\003@m\001\007A&A\003ti\006\0347\016C\003B\001\021\005#)\001\bhKR\034F/Y2l\023:\034Fn\034;\025\0051\032\005\"\002\036A\001\004Y\004\"B#\001\t\0032\025\001G:fi&sg/\0328u_JL8\013\\8u\007>tG/\0328ugR\031Qd\022%\t\013i\"\005\031A\036\t\013}\"\005\031\001\027\t\013)\003A\021I&\002!\035,G/\0238wK:$xN]=OC6,G#\001'\021\005=i\025B\001(\021\005\031\031FO]5oO\")\001\013\001C\t#\006i\021N\034<f]R|'/\037(b[\026,\022\001\024\005\006'\002!\t\001V\001\005Y>\fG\r\006\002\036+\")aK\025a\001/\006\031aN\031;\021\005aSV\"A-\013\005Y\003\024BA.Z\0059q%\t\026+bO\016{W\016]8v]\022DQ!\030\001\005\002y\013Aa]1wKR\021Qd\030\005\006-r\003\ra\026\005\006C\002!\tBY\001\f_:LE/Z7BI\022,G\rF\002\036G\022DQA\0171A\002mBQa\0201A\0021BQA\032\001\005\022\035\fQb\0348Ji\026l'+Z7pm\026$GcA\017iS\")!(\032a\001w!)q(\032a\001Y\001")
/*    */ public interface Inventory
/*    */   extends SimpleInventory
/*    */ {
/*    */   Option<ItemStack>[] items();
/*    */   
/*    */   void updateItems(int paramInt, ItemStack paramItemStack);
/*    */   
/*    */   ItemStack func_70301_a(int paramInt);
/*    */   
/*    */   void func_70299_a(int paramInt, ItemStack paramItemStack);
/*    */   
/*    */   String func_145825_b();
/*    */   
/*    */   String inventoryName();
/*    */   
/*    */   void load(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   void save(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   void onItemAdded(int paramInt, ItemStack paramItemStack);
/*    */   
/*    */   void onItemRemoved(int paramInt, ItemStack paramItemStack);
/*    */   
/*    */   public final class Inventory$$anonfun$load$1
/*    */     extends AbstractFunction1<NBTTagCompound, BoxedUnit>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final IntRef count$1;
/*    */     
/*    */     public Inventory$$anonfun$load$1(Inventory $outer, IntRef count$1) {}
/*    */     
/*    */     public final void apply(NBTTagCompound tag) {
/* 60 */       if (tag.func_74764_b("slot")) {
/* 61 */         byte slot = tag.func_74771_c("slot");
/* 62 */         if (slot >= 0 && slot < (this.$outer.items()).length) {
/* 63 */           this.$outer.updateItems(slot, ItemStack.func_77949_a(tag.func_74775_l("item")));
/*    */         }
/*    */       } else {
/*    */         
/* 67 */         int slot = this.count$1.elem;
/* 68 */         if (slot >= 0 && slot < (this.$outer.items()).length) {
/* 69 */           this.$outer.updateItems(slot, ItemStack.func_77949_a(tag));
/*    */         }
/*    */       } 
/* 72 */       this.count$1.elem++;
/*    */     }
/*    */   }
/*    */   
/*    */   public final class Inventory$$anonfun$save$1 extends AbstractPartialFunction<Tuple2<Option<ItemStack>, Object>, Tuple2<ItemStack, Object>> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/* 78 */     public final <A1 extends Tuple2<Option<ItemStack>, Object>, B1> B1 applyOrElse(Tuple2 x1, Function1 default) { Tuple2 tuple2 = x1; if (tuple2 != null)
/* 79 */       { Option option = (Option)tuple2._1(); int slot = tuple2._2$mcI$sp(); if (option instanceof Some) { Some some = (Some)option; ItemStack stack = (ItemStack)some.x(); return (B1)new Tuple2(stack, BoxesRunTime.boxToInteger(slot)); }  }  return (B1)default.apply(x1); } public Inventory$$anonfun$save$1(Inventory $outer) {} public final boolean isDefinedAt(Tuple2 x1) { Tuple2 tuple2 = x1; if (tuple2 != null) { Option option = (Option)tuple2._1(); if (option instanceof Some)
/* 80 */           return true;  }  return false; } } public final class Inventory$$anonfun$save$2 extends AbstractFunction1<Tuple2<ItemStack, Object>, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; public final NBTTagCompound apply(Tuple2 x0$1) { Tuple2 tuple2 = x0$1; if (tuple2 != null)
/* 81 */       { ItemStack stack = (ItemStack)tuple2._1(); int slot = tuple2._2$mcI$sp();
/* 82 */         NBTTagCompound slotNbt = new NBTTagCompound();
/* 83 */         slotNbt.func_74774_a("slot", (byte)slot);
/* 84 */         return ExtendedNBT$.MODULE$.extendNBTTagCompound(slotNbt).setNewCompoundTag("item", (Function1)new Inventory$$anonfun$save$2$$anonfun$apply$1(this, stack)); }  throw new MatchError(tuple2); } public Inventory$$anonfun$save$2(Inventory $outer) {} public final class Inventory$$anonfun$save$2$$anonfun$apply$1 extends AbstractFunction1<NBTTagCompound, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final NBTTagCompound apply(NBTTagCompound x$1) { return this.stack$1.func_77955_b(x$1); }
/*    */ 
/*    */       
/*    */       public Inventory$$anonfun$save$2$$anonfun$apply$1(Inventory$$anonfun$save$2 $outer, ItemStack stack$1) {} }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\inventory\Inventory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */