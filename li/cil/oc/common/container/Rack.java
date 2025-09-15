/*    */ package li.cil.oc.common.container;
/*    */ 
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Serializable;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001i3A!\001\002\001\033\t!!+Y2l\025\t\031A!A\005d_:$\030-\0338fe*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001a\005\002\001\035A\021q\002E\007\002\005%\021\021C\001\002\007!2\f\0270\032:\t\023M\001!\021!Q\001\nQ\001\023a\0049mCf,'/\0238wK:$xN]=\021\005UqR\"\001\f\013\005]A\022A\0029mCf,'O\003\002\0325\0051QM\034;jifT!a\007\017\002\0235Lg.Z2sC\032$(\"A\017\002\0079,G/\003\002 -\ty\021J\034<f]R|'/\037)mCf,'/\003\002\024!!A!\005\001BC\002\023\0051%\001\003sC\016\\W#\001\023\021\005\025BS\"\001\024\013\005\035\"\021A\003;jY\026,g\016^5us&\021\021A\n\005\nU\001\021\t\021)A\005I-\nQA]1dW\002J!\001\f\t\002\035=$\b.\032:J]Z,g\016^8ss\")a\006\001C\001_\0051A(\0338jiz\"2\001M\0313!\ty\001\001C\003\024[\001\007A\003C\003#[\001\007A\005C\0045\001\t\007IQA\033\002\0355\013\007pQ8o]\026\034G/[8ogV\tagD\0018;\005!\001BB\035\001A\0035a'A\bNCb\034uN\0348fGRLwN\\:!\021\035Y\004A1A\005\002q\nAB\\8eKB\023Xm]3oG\026,\022!\020\t\004}\005\033U\"A \013\003\001\013Qa]2bY\006L!AQ \003\013\005\023(/Y=\021\007y\nE\t\005\002?\013&\021ai\020\002\b\005>|G.Z1o\021\031A\005\001)A\005{\005ian\0343f!J,7/\0328dK\002BQA\023\001\005B-\013\001#\0369eCR,7)^:u_6$\025\r^1\025\0051{\005C\001 N\023\tquH\001\003V]&$\b\"\002)J\001\004\t\026a\0018ciB\021!\013V\007\002'*\021\001KG\005\003+N\023aB\024\"U)\006<7i\\7q_VtG\rC\003X\001\021E\003,A\feKR,7\r^\"vgR|W\016R1uC\016C\027M\\4fgR\021A*\027\005\006!Z\003\r!\025")
/*    */ public class Rack extends Player {
/*    */   private final int MaxConnections;
/*    */   
/* 13 */   public li.cil.oc.common.tileentity.Rack rack() { return (li.cil.oc.common.tileentity.Rack)otherInventory(); } private final boolean[][] nodePresence; public Rack(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Rack rack) { super(playerInventory, (IInventory)rack);
/* 14 */     addSlotToContainer(20, 23, Slot$.MODULE$.RackMountable(), addSlotToContainer$default$4());
/* 15 */     addSlotToContainer(20, 43, Slot$.MODULE$.RackMountable(), addSlotToContainer$default$4());
/* 16 */     addSlotToContainer(20, 63, Slot$.MODULE$.RackMountable(), addSlotToContainer$default$4());
/* 17 */     addSlotToContainer(20, 83, Slot$.MODULE$.RackMountable(), addSlotToContainer$default$4());
/* 18 */     addPlayerInventorySlots(8, 128);
/*    */ 
/*    */     
/* 21 */     this.nodePresence = (boolean[][])Array$.MODULE$.fill(4, (Function0)new Rack$$anonfun$1(this), ClassTag$.MODULE$.apply(ScalaRunTime$.MODULE$.arrayClass(boolean.class))); } public final int MaxConnections() { return 4; } public boolean[][] nodePresence() { return this.nodePresence; } public final class Rack$$anonfun$1 extends AbstractFunction0<boolean[]> implements Serializable { public static final long serialVersionUID = 0L; public final boolean[] apply() { return (boolean[])Array$.MODULE$.fill(4, (Function0)new Rack$$anonfun$1$$anonfun$apply$1(this), ClassTag$.MODULE$.Boolean()); } public Rack$$anonfun$1(Rack $outer) {} public final class Rack$$anonfun$1$$anonfun$apply$1 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return false; }
/*    */       
/*    */       public Rack$$anonfun$1$$anonfun$apply$1(Rack$$anonfun$1 $outer) {} } }
/* 24 */   public void updateCustomData(NBTTagCompound nbt) { super.updateCustomData(nbt);
/* 25 */     ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c("nodeMapping", 11)).map((Function1)new Rack$$anonfun$updateCustomData$1(this))
/*    */       
/* 27 */       .copyToArray(rack().nodeMapping());
/* 28 */     Predef$.MODULE$.booleanArrayOps(ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).getBooleanArray("nodePresence")).grouped(4).copyToArray(nodePresence());
/* 29 */     rack().isRelayEnabled_$eq(nbt.func_74767_n("isRelayEnabled")); } public final class Rack$$anonfun$updateCustomData$1 extends AbstractFunction1<NBTTagIntArray, Option<ForgeDirection>[]> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public Rack$$anonfun$updateCustomData$1(Rack $outer) {} public final Option<ForgeDirection>[] apply(NBTTagIntArray sides) { return (Option<ForgeDirection>[])Predef$.MODULE$.intArrayOps(sides.func_150302_c()).map((Function1)new Rack$$anonfun$updateCustomData$1$$anonfun$apply$4(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(Option.class))); } public final class Rack$$anonfun$updateCustomData$1$$anonfun$apply$4 extends AbstractFunction1<Object, Option<ForgeDirection>> implements Serializable {
/*    */       public static final long serialVersionUID = 0L; public final Option<ForgeDirection> apply(int side) { return (side >= 0) ? Option$.MODULE$.apply(ForgeDirection.getOrientation(side)) : (Option<ForgeDirection>)None$.MODULE$; }
/*    */       public Rack$$anonfun$updateCustomData$1$$anonfun$apply$4(Rack$$anonfun$updateCustomData$1 $outer) {} } }
/* 33 */   public void detectCustomDataChanges(NBTTagCompound nbt) { super.detectCustomDataChanges(nbt);
/* 34 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList("nodeMapping", (Iterable)Predef$.MODULE$.wrapRefArray((Object[])Predef$.MODULE$.refArrayOps((Object[])rack().nodeMapping()).map((Function1)new Rack$$anonfun$detectCustomDataChanges$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(NBTTagIntArray.class)))));
/*    */ 
/*    */ 
/*    */     
/* 38 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setBooleanArray("nodePresence", (boolean[])((TraversableOnce)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), rack().func_70302_i_()).flatMap((Function1)new Rack$$anonfun$detectCustomDataChanges$2(this), IndexedSeq$.MODULE$.canBuildFrom()))
/*    */ 
/*    */         
/* 41 */         .toArray(ClassTag$.MODULE$.Boolean()));
/* 42 */     nbt.func_74757_a("isRelayEnabled", rack().isRelayEnabled()); }
/*    */ 
/*    */   
/*    */   public final class Rack$$anonfun$detectCustomDataChanges$1 extends AbstractFunction1<Option<ForgeDirection>[], NBTTagIntArray> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final NBTTagIntArray apply(Option[] sides) {
/*    */       return ExtendedNBT$.MODULE$.toNbt((int[])Predef$.MODULE$.refArrayOps((Object[])sides).map((Function1)new Rack$$anonfun$detectCustomDataChanges$1$$anonfun$apply$5(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int())));
/*    */     }
/*    */     
/*    */     public Rack$$anonfun$detectCustomDataChanges$1(Rack $outer) {}
/*    */     
/*    */     public final class Rack$$anonfun$detectCustomDataChanges$1$$anonfun$apply$5 extends AbstractFunction1<Option<ForgeDirection>, Object> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final int apply(Option x0$1) {
/*    */         byte b;
/*    */         Option option = x0$1;
/*    */         if (option instanceof Some) {
/*    */           Some some = (Some)option;
/*    */           ForgeDirection side = (ForgeDirection)some.x();
/*    */           b = side.ordinal();
/*    */         } else {
/*    */           b = -1;
/*    */         } 
/*    */         return b;
/*    */       }
/*    */       
/*    */       public Rack$$anonfun$detectCustomDataChanges$1$$anonfun$apply$5(Rack$$anonfun$detectCustomDataChanges$1 $outer) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class Rack$$anonfun$detectCustomDataChanges$2 extends AbstractFunction1<Object, SeqLike<Object, Object>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final SeqLike<Object, Object> apply(int slot) {
/*    */       ArrayOps arrayOps;
/*    */       RackMountable rackMountable = this.$outer.rack().getMountable(slot);
/*    */       if (rackMountable != null) {
/*    */         RackMountable rackMountable1 = rackMountable;
/*    */         SeqLike seqLike = (SeqLike)((SeqLike)((TraversableLike)Seq$.MODULE$.apply((Seq)Predef$.MODULE$.wrapBooleanArray(new boolean[] { true }))).$plus$plus((GenTraversableOnce)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), package$.MODULE$.min(3, rackMountable1.getConnectableCount())).map((Function1)new Rack$$anonfun$detectCustomDataChanges$2$$anonfun$apply$2(this, rackMountable1), IndexedSeq$.MODULE$.canBuildFrom()), Seq$.MODULE$.canBuildFrom())).padTo(4, BoxesRunTime.boxToBoolean(false), Seq$.MODULE$.canBuildFrom());
/*    */       } else {
/*    */         arrayOps = Predef$.MODULE$.booleanArrayOps((boolean[])Array$.MODULE$.fill(4, (Function0)new Rack$$anonfun$detectCustomDataChanges$2$$anonfun$apply$3(this), ClassTag$.MODULE$.Boolean()));
/*    */       } 
/*    */       return (SeqLike<Object, Object>)arrayOps;
/*    */     }
/*    */     
/*    */     public Rack$$anonfun$detectCustomDataChanges$2(Rack $outer) {}
/*    */     
/*    */     public final class Rack$$anonfun$detectCustomDataChanges$2$$anonfun$apply$2 extends AbstractFunction1.mcZI.sp implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final RackMountable x2$1;
/*    */       
/*    */       public final boolean apply(int index) {
/*    */         return apply$mcZI$sp(index);
/*    */       }
/*    */       
/*    */       public boolean apply$mcZI$sp(int index) {
/*    */         return !(this.x2$1.getConnectableAt(index) == null);
/*    */       }
/*    */       
/*    */       public Rack$$anonfun$detectCustomDataChanges$2$$anonfun$apply$2(Rack$$anonfun$detectCustomDataChanges$2 $outer, RackMountable x2$1) {}
/*    */     }
/*    */     
/*    */     public final class Rack$$anonfun$detectCustomDataChanges$2$$anonfun$apply$3 extends AbstractFunction0.mcZ.sp implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final boolean apply() {
/*    */         return apply$mcZ$sp();
/*    */       }
/*    */       
/*    */       public boolean apply$mcZ$sp() {
/*    */         return false;
/*    */       }
/*    */       
/*    */       public Rack$$anonfun$detectCustomDataChanges$2$$anonfun$apply$3(Rack$$anonfun$detectCustomDataChanges$2 $outer) {}
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Rack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */