/*    */ package li.cil.oc.common.container;
/*    */ 
/*    */ import li.cil.oc.common.InventorySlots;
/*    */ import li.cil.oc.common.template.AssemblerTemplates;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.RichInt$;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001=4A!\001\002\001\033\tI\021i]:f[\ndWM\035\006\003\007\021\t\021bY8oi\006Lg.\032:\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031\"\001\001\b\021\005=\001R\"\001\002\n\005E\021!A\002)mCf,'\017C\005\024\001\t\005\t\025!\003\025A\005y\001\017\\1zKJLeN^3oi>\024\030\020\005\002\026=5\taC\003\002\0301\0051\001\017\\1zKJT!!\007\016\002\r\025tG/\033;z\025\tYB$A\005nS:,7M]1gi*\tQ$A\002oKRL!a\b\f\003\037%sg/\0328u_JL\b\013\\1zKJL!a\005\t\t\021\t\002!Q1A\005\002\r\n\021\"Y:tK6\024G.\032:\026\003\021\002\"!\n\025\016\003\031R!a\n\003\002\025QLG.Z3oi&$\0300\003\002\002M!I!\006\001B\001B\003%AeK\001\013CN\034X-\0342mKJ\004\023B\001\027\021\0039yG\017[3s\023:4XM\034;pefDQA\f\001\005\002=\na\001P5oSRtDc\001\0312eA\021q\002\001\005\006'5\002\r\001\006\005\006E5\002\r\001\n\005\006i\001!I!N\001\tg2|G/\0238g_R\021a\007\023\t\003o\025s!\001O\"\017\005e\022eB\001\036B\035\tY\004I\004\002=5\tQH\003\002?\031\0051AH]8pizJ\021aC\005\003\023)I!a\002\005\n\005\0251\021B\001#\005\0039IeN^3oi>\024\030p\0257piNL!AR$\003\033%sg/\0328u_JL8\013\\8u\025\t!E\001C\003Jg\001\007!*\001\003tY>$\bCA\bL\023\ta%A\001\013Es:\fW.[2D_6\004xN\\3oiNcw\016\036\005\006\035\002!\taT\001\rSN\f5o]3nE2LgnZ\013\002!B\021\021\013V\007\002%*\t1+A\003tG\006d\027-\003\002V%\n9!i\\8mK\006t\007\"B,\001\t\003A\026\001E1tg\026l'\r\\=Qe><'/Z:t+\005I\006CA)[\023\tY&K\001\004E_V\024G.\032\005\006;\002!\tAX\001\026CN\034X-\0342msJ+W.Y5oS:<G+[7f+\005y\006CA)a\023\t\t'KA\002J]RDQa\031\001\005R\021\fq\003Z3uK\016$8)^:u_6$\025\r^1DQ\006tw-Z:\025\005\025D\007CA)g\023\t9'K\001\003V]&$\b\"B5c\001\004Q\027a\0018ciB\0211.\\\007\002Y*\021\021NG\005\003]2\024aB\024\"U)\006<7i\\7q_VtG\r")
/*    */ public class Assembler extends Player {
/* 13 */   public li.cil.oc.common.tileentity.Assembler assembler() { return (li.cil.oc.common.tileentity.Assembler)otherInventory(); } public final class Assembler$$anon$1 extends StaticComponentSlot { public Assembler$$anon$1(Assembler $outer, int index$1) { super($outer, $outer.otherInventory(), index$1, 12, 12, "template", 2147483647); } @SideOnly(Side.CLIENT) public boolean func_111238_b() { return (!this.$outer.isAssembling() && ComponentSlot$class.func_111238_b(this)); } public IIcon func_75212_b() { return this.$outer.isAssembling() ? Icons$.MODULE$.get(-1) : super.func_75212_b(); } } public InventorySlots.InventorySlot li$cil$oc$common$container$Assembler$$slotInfo(DynamicComponentSlot slot) { InventorySlots.InventorySlot inventorySlot; Option option = AssemblerTemplates$.MODULE$.select(func_75139_a(0).func_75211_c()); if (option instanceof Some) { Some some = (Some)option; AssemblerTemplates.Template template = (AssemblerTemplates.Template)some.x(); int index = slot.getSlotIndex(); AssemblerTemplates.Slot tplSlot = RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(1), 4).contains(index) ? template.containerSlots()[index - 1] : (RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(4), 13).contains(index) ? template.upgradeSlots()[index - 4] : (RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(13), 21).contains(index) ? template.componentSlots()[index - 13] : AssemblerTemplates$.MODULE$.NoSlot())); inventorySlot = new InventorySlots.InventorySlot(tplSlot.kind(), tplSlot.tier()); } else { inventorySlot = new InventorySlots.InventorySlot(Slot$.MODULE$.None(), -1); }  return inventorySlot; } public Assembler(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Assembler assembler) { super(playerInventory, (IInventory)assembler);
/*    */ 
/*    */     
/* 16 */     int index = this.field_75151_b.size();
/* 17 */     func_75146_a(new Assembler$$anon$1(this, index)); RichInt$.MODULE$
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 40 */       .until$extension0(Predef$.MODULE$.intWrapper(0), 3).foreach$mVc$sp((Function1)new Assembler$$anonfun$1(this)); RichInt$.MODULE$
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 45 */       .until$extension0(Predef$.MODULE$.intWrapper(0), 9).foreach$mVc$sp((Function1)new Assembler$$anonfun$2(this)); RichInt$.MODULE$
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 50 */       .until$extension0(Predef$.MODULE$.intWrapper(0), 3).foreach$mVc$sp((Function1)new Assembler$$anonfun$3(this));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 55 */     addSlotToContainer(126, 12, (Function1<DynamicComponentSlot, InventorySlots.InventorySlot>)new Assembler$$anonfun$6(this)); RichInt$.MODULE$
/*    */ 
/*    */       
/* 58 */       .until$extension0(Predef$.MODULE$.intWrapper(0), 2).foreach$mVc$sp((Function1)new Assembler$$anonfun$4(this)); RichInt$.MODULE$
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 63 */       .until$extension0(Predef$.MODULE$.intWrapper(0), 3).foreach$mVc$sp((Function1)new Assembler$$anonfun$5(this));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 68 */     addPlayerInventorySlots(8, 110); } public final class Assembler$$anonfun$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } public Assembler$$anonfun$1(Assembler $outer) {} public void apply$mcVI$sp(int i) { this.$outer.addSlotToContainer(34 + i * this.$outer.slotSize(), 70, (Function1<DynamicComponentSlot, InventorySlots.InventorySlot>)new Assembler$$anonfun$1$$anonfun$apply$mcVI$sp$1(this)); } public final class Assembler$$anonfun$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1<DynamicComponentSlot, InventorySlots.InventorySlot> implements Serializable {
/* 70 */       public static final long serialVersionUID = 0L; public final InventorySlots.InventorySlot apply(DynamicComponentSlot slot) { return this.$outer.li$cil$oc$common$container$Assembler$$anonfun$$$outer().li$cil$oc$common$container$Assembler$$slotInfo(slot); } public Assembler$$anonfun$1$$anonfun$apply$mcVI$sp$1(Assembler$$anonfun$1 $outer) {} } } public final class Assembler$$anonfun$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } public Assembler$$anonfun$2(Assembler $outer) {} public void apply$mcVI$sp(int i) { this.$outer.addSlotToContainer(34 + i % 3 * this.$outer.slotSize(), 12 + i / 3 * this.$outer.slotSize(), (Function1<DynamicComponentSlot, InventorySlots.InventorySlot>)new Assembler$$anonfun$2$$anonfun$apply$mcVI$sp$2(this)); } public final class Assembler$$anonfun$2$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1<DynamicComponentSlot, InventorySlots.InventorySlot> implements Serializable { public static final long serialVersionUID = 0L; public final InventorySlots.InventorySlot apply(DynamicComponentSlot slot) { return this.$outer.li$cil$oc$common$container$Assembler$$anonfun$$$outer().li$cil$oc$common$container$Assembler$$slotInfo(slot); } public Assembler$$anonfun$2$$anonfun$apply$mcVI$sp$2(Assembler$$anonfun$2 $outer) {} } } public boolean isAssembling() { return synchronizedData().func_74767_n("isAssembling"); } public final class Assembler$$anonfun$3 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } public Assembler$$anonfun$3(Assembler $outer) {} public void apply$mcVI$sp(int i) { this.$outer.addSlotToContainer(104, 12 + i * this.$outer.slotSize(), (Function1<DynamicComponentSlot, InventorySlots.InventorySlot>)new Assembler$$anonfun$3$$anonfun$apply$mcVI$sp$3(this)); } public final class Assembler$$anonfun$3$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1<DynamicComponentSlot, InventorySlots.InventorySlot> implements Serializable {
/* 72 */       public static final long serialVersionUID = 0L; public final InventorySlots.InventorySlot apply(DynamicComponentSlot slot) { return this.$outer.li$cil$oc$common$container$Assembler$$anonfun$$$outer().li$cil$oc$common$container$Assembler$$slotInfo(slot); } public Assembler$$anonfun$3$$anonfun$apply$mcVI$sp$3(Assembler$$anonfun$3 $outer) {} } } public final class Assembler$$anonfun$6 extends AbstractFunction1<DynamicComponentSlot, InventorySlots.InventorySlot> implements Serializable { public static final long serialVersionUID = 0L; public final InventorySlots.InventorySlot apply(DynamicComponentSlot slot) { return this.$outer.li$cil$oc$common$container$Assembler$$slotInfo(slot); } public Assembler$$anonfun$6(Assembler $outer) {} } public double assemblyProgress() { return synchronizedData().func_74769_h("assemblyProgress"); } public final class Assembler$$anonfun$4 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } public Assembler$$anonfun$4(Assembler $outer) {} public void apply$mcVI$sp(int i) { this.$outer.addSlotToContainer(126, 30 + i * this.$outer.slotSize(), (Function1<DynamicComponentSlot, InventorySlots.InventorySlot>)new Assembler$$anonfun$4$$anonfun$apply$mcVI$sp$4(this)); } public final class Assembler$$anonfun$4$$anonfun$apply$mcVI$sp$4 extends AbstractFunction1<DynamicComponentSlot, InventorySlots.InventorySlot> implements Serializable {
/* 74 */       public static final long serialVersionUID = 0L; public final InventorySlots.InventorySlot apply(DynamicComponentSlot slot) { return this.$outer.li$cil$oc$common$container$Assembler$$anonfun$$$outer().li$cil$oc$common$container$Assembler$$slotInfo(slot); } public Assembler$$anonfun$4$$anonfun$apply$mcVI$sp$4(Assembler$$anonfun$4 $outer) {} } } public final class Assembler$$anonfun$5 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } public Assembler$$anonfun$5(Assembler $outer) {} public void apply$mcVI$sp(int i) { this.$outer.addSlotToContainer(148, 12 + i * this.$outer.slotSize(), (Function1<DynamicComponentSlot, InventorySlots.InventorySlot>)new Assembler$$anonfun$5$$anonfun$apply$mcVI$sp$5(this)); } public final class Assembler$$anonfun$5$$anonfun$apply$mcVI$sp$5 extends AbstractFunction1<DynamicComponentSlot, InventorySlots.InventorySlot> implements Serializable { public static final long serialVersionUID = 0L; public final InventorySlots.InventorySlot apply(DynamicComponentSlot slot) { return this.$outer.li$cil$oc$common$container$Assembler$$anonfun$$$outer().li$cil$oc$common$container$Assembler$$slotInfo(slot); } public Assembler$$anonfun$5$$anonfun$apply$mcVI$sp$5(Assembler$$anonfun$5 $outer) {} } } public int assemblyRemainingTime() { return synchronizedData().func_74762_e("assemblyRemainingTime"); }
/*    */   
/*    */   public void detectCustomDataChanges(NBTTagCompound nbt) {
/* 77 */     synchronizedData().func_74757_a("isAssembling", assembler().isAssembling());
/* 78 */     synchronizedData().func_74780_a("assemblyProgress", assembler().progress());
/* 79 */     synchronizedData().func_74768_a("assemblyRemainingTime", assembler().timeRemaining());
/* 80 */     super.detectCustomDataChanges(nbt);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Assembler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */