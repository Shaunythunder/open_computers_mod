/*    */ package li.cil.oc.common.item.data;
/*    */ 
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001}4A!\001\002\001\037\t\031R*[2s_\016|g\016\036:pY2,'\017R1uC*\0211\001B\001\005I\006$\030M\003\002\006\r\005!\021\016^3n\025\t9\001\"\001\004d_6lwN\034\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011C\001\001\021!\t\t\"#D\001\003\023\t\031\"A\001\005Ji\026lG)\031;b\021%)\002A!A!\002\0231\002%\001\005ji\026lg*Y7f!\t9RD\004\002\03175\t\021DC\001\033\003\025\0318-\0317b\023\ta\022$\001\004Qe\026$WMZ\005\003=}\021aa\025;sS:<'B\001\017\032\023\t)\"\003C\003#\001\021\0051%\001\004=S:LGO\020\013\003I\025\002\"!\005\001\t\017U\t\003\023!a\001-!)!\005\001C\001OQ\021A\005\013\005\006S\031\002\rAK\001\006gR\f7m\033\t\003WEj\021\001\f\006\003\0135R!AL\030\002\0235Lg.Z2sC\032$(\"\001\031\002\0079,G/\003\0023Y\tI\021\n^3n'R\f7m\033\005\bi\001\001\r\021\"\0016\003\021!\030.\032:\026\003Y\002\"\001G\034\n\005aJ\"aA%oi\"9!\b\001a\001\n\003Y\024\001\003;jKJ|F%Z9\025\005qz\004C\001\r>\023\tq\024D\001\003V]&$\bb\002!:\003\003\005\rAN\001\004q\022\n\004B\002\"\001A\003&a'A\003uS\026\024\b\005C\004E\001\001\007I\021A#\002\025\r|W\016]8oK:$8/F\001G!\rArIK\005\003\021f\021Q!\021:sCfDqA\023\001A\002\023\0051*\001\bd_6\004xN\\3oiN|F%Z9\025\005qb\005b\002!J\003\003\005\rA\022\005\007\035\002\001\013\025\002$\002\027\r|W\016]8oK:$8\017\t\005\b!\002\001\r\021\"\0016\0031\031Ho\034:fI\026sWM]4z\021\035\021\006\0011A\005\002M\013\001c\035;pe\026$WI\\3sOf|F%Z9\025\005q\"\006b\002!R\003\003\005\rA\016\005\007-\002\001\013\025\002\034\002\033M$xN]3e\013:,'oZ=!\021\025A\006\001\"\021Z\003\021aw.\0313\025\005qR\006\"B.X\001\004a\026a\0018ciB\021QlX\007\002=*\0211,L\005\003Az\023aB\024\"U)\006<7i\\7q_VtG\rC\003c\001\021\0053-\001\003tCZ,GC\001\037e\021\025Y\026\r1\001]\021\0251\007\001\"\001h\0035\031w\016]=Ji\026l7\013^1dWR\t!fB\004j\005\005\005\t\022\0016\002'5K7M]8d_:$(o\0347mKJ$\025\r^1\021\005EYgaB\001\003\003\003E\t\001\\\n\003W6\004\"\001\0078\n\005=L\"AB!osJ+g\rC\003#W\022\005\021\017F\001k\021\035\0318.%A\005\002Q\f1\004\n7fgNLg.\033;%OJ,\027\r^3sI\021,g-Y;mi\022\nT#A;+\005Y18&A<\021\005alX\"A=\013\005i\\\030!C;oG\",7m[3e\025\ta\030$\001\006b]:|G/\031;j_:L!A`=\003#Ut7\r[3dW\026$g+\031:jC:\034W\r")
/*    */ public class MicrocontrollerData extends ItemData {
/*    */   private int tier;
/*    */   private ItemStack[] components;
/*    */   private int storedEnergy;
/*    */   
/* 12 */   public MicrocontrollerData(String itemName) { super(itemName);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 18 */     this.tier = 0;
/*    */     
/* 20 */     (new ItemStack[1])[0] = null; this.components = new ItemStack[1];
/*    */     
/* 22 */     this.storedEnergy = 0; } public MicrocontrollerData(ItemStack stack) { this(MicrocontrollerData$.MODULE$.$lessinit$greater$default$1()); load(stack); } public int tier() { return this.tier; } public void tier_$eq(int x$1) { this.tier = x$1; } public ItemStack[] components() { return this.components; } public void components_$eq(ItemStack[] x$1) { this.components = x$1; } public int storedEnergy() { return this.storedEnergy; } public void storedEnergy_$eq(int x$1) { this.storedEnergy = x$1; }
/*    */   public final class MicrocontrollerData$$anonfun$load$1 extends AbstractFunction1<NBTTagCompound, ItemStack> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final ItemStack apply(NBTTagCompound x$1) { return ItemStack.func_77949_a(x$1); } public MicrocontrollerData$$anonfun$load$1(MicrocontrollerData $outer) {} } public final class MicrocontrollerData$$anonfun$load$2 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/* 25 */     public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$1) { return !(x$1 == null); } public MicrocontrollerData$$anonfun$load$2(MicrocontrollerData $outer) {} } public void load(NBTTagCompound nbt) { tier_$eq(nbt.func_74771_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tier").toString()));
/* 26 */     components_$eq(
/* 27 */         (ItemStack[])Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("components").toString(), 10)).toArray(ClassTag$.MODULE$.apply(NBTTagCompound.class))).map((Function1)new MicrocontrollerData$$anonfun$load$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ItemStack.class)))).filter((Function1)new MicrocontrollerData$$anonfun$load$2(this)));
/* 28 */     storedEnergy_$eq(nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("storedEnergy").toString()));
/*    */ 
/*    */ 
/*    */     
/* 32 */     if (!Predef$.MODULE$.refArrayOps((Object[])components()).exists((Function1)new MicrocontrollerData$$anonfun$load$3(this)))
/* 33 */       components_$eq((ItemStack[])Predef$.MODULE$.refArrayOps((Object[])components()).$colon$plus(null, ClassTag$.MODULE$.apply(ItemStack.class)));  }
/*    */   public final class MicrocontrollerData$$anonfun$load$3 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(ItemStack stack) { ItemInfo itemInfo = Items.get("eeprom"); if (Items.get(stack) == null) { Items.get(stack); if (itemInfo != null); }
/*    */       else if (Items.get(stack).equals(itemInfo))
/*    */       {  }
/* 38 */        } public MicrocontrollerData$$anonfun$load$3(MicrocontrollerData $outer) {} } public void save(NBTTagCompound nbt) { nbt.func_74774_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("tier").toString(), (byte)tier());
/* 39 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("components").toString(), ExtendedNBT$.MODULE$.itemStackIterableToNbt(Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])components()).filter((Function1)new MicrocontrollerData$$anonfun$save$1(this))).toIterable()));
/* 40 */     nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("storedEnergy").toString(), storedEnergy()); } public final class MicrocontrollerData$$anonfun$save$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(ItemStack x$2) {
/*    */       return !(x$2 == null);
/*    */     } public MicrocontrollerData$$anonfun$save$1(MicrocontrollerData $outer) {} } public ItemStack copyItemStack() {
/* 44 */     ItemStack stack = createItemStack();
/* 45 */     MicrocontrollerData newInfo = new MicrocontrollerData(stack);
/* 46 */     newInfo.save(stack);
/* 47 */     return stack;
/*    */   }
/*    */   
/*    */   public static String $lessinit$greater$default$1() {
/*    */     return MicrocontrollerData$.MODULE$.$lessinit$greater$default$1();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\MicrocontrollerData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */