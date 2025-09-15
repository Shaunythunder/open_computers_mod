/*    */ package li.cil.oc.common.container;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005=b\001B\001\003\0015\021aaU3sm\026\024(BA\002\005\003%\031wN\034;bS:,'O\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\t\001a\002\005\002\020!5\t!!\003\002\022\005\t1\001\013\\1zKJD\021b\005\001\003\002\003\006I\001\006\021\002\037Ad\027-_3s\023:4XM\034;pef\004\"!\006\020\016\003YQ!a\006\r\002\rAd\027-_3s\025\tI\"$\001\004f]RLG/\037\006\0037q\t\021\"\\5oK\016\024\030M\032;\013\003u\t1A\\3u\023\tybCA\bJ]Z,g\016^8ssBc\027-_3s\023\t\031\002\003C\005#\001\t\005\t\025!\003$S\005y1/\032:wKJLeN^3oi>\024\030\020\005\002%O5\tQE\003\002'\t\005I\021N\034<f]R|'/_\005\003Q\025\022qbU3sm\026\024\030J\034<f]R|'/_\005\003UA\tab\034;iKJLeN^3oi>\024\030\020\003\005-\001\t\025\r\021\"\001.\003\031\031XM\035<feV\ta\006E\0020eQj\021\001\r\006\002c\005)1oY1mC&\0211\007\r\002\007\037B$\030n\0348\021\005UJT\"\001\034\013\005]B\024!C2p[B|g.\0328u\025\tac!\003\002\002m!A1\b\001B\001B\003%a&A\004tKJ4XM\035\021\t\013u\002A\021\001 \002\rqJg.\033;?)\021y\004)\021\"\021\005=\001\001\"B\n=\001\004!\002\"\002\022=\001\004\031\003b\002\027=!\003\005\rA\f\005\b\t\002\021\r\021\"\001F\00351XM\035;jG\006d7\013\\8ugV\ta\t\005\0020\017&\021\001\n\r\002\004\023:$\bB\002&\001A\003%a)\001\bwKJ$\030nY1m'2|Go\035\021\t\0131\003A\021I'\002\037\r\fg.\0238uKJ\f7\r^,ji\"$\"AT)\021\005=z\025B\001)1\005\035\021un\0347fC:DQaF&A\002I\003\"!F*\n\005Q3\"\001D#oi&$\030\020\0257bs\026\024\bb\002,\001\001\004%\taV\001\nSN\024VO\0348j]\036,\022A\024\005\b3\002\001\r\021\"\001[\0035I7OU;o]&twm\030\023fcR\0211L\030\t\003_qK!!\030\031\003\tUs\027\016\036\005\b?b\013\t\0211\001O\003\rAH%\r\005\007C\002\001\013\025\002(\002\025%\034(+\0368oS:<\007\005C\004d\001\001\007I\021A,\002\r%\034\030\n^3n\021\035)\007\0011A\005\002\031\f!\"[:Ji\026lw\fJ3r)\tYv\rC\004`I\006\005\t\031\001(\t\r%\004\001\025)\003O\003\035I7/\023;f[\002BQa\033\001\005B1\f\001#\0369eCR,7)^:u_6$\025\r^1\025\005mk\007\"\0028k\001\004y\027a\0018ciB\021\001O]\007\002c*\021aNG\005\003gF\024aB\024\"U)\006<7i\\7q_VtG\rC\003v\001\021Ec/A\feKR,7\r^\"vgR|W\016R1uC\016C\027M\\4fgR\0211l\036\005\006]R\004\ra\034\005\fs\002\001\n1!A\001\n\023Q\030&\001\013tkB,'\017J8uQ\026\024\030J\034<f]R|'/_\013\002wB\021AP`\007\002{*\021aEG\005\003v\024!\"S%om\026tGo\034:z\017%\t\031AAA\001\022\003\t)!\001\004TKJ4XM\035\t\004\037\005\035a\001C\001\003\003\003E\t!!\003\024\t\005\035\0211\002\t\004_\0055\021bAA\ba\t1\021I\\=SK\032Dq!PA\004\t\003\t\031\002\006\002\002\006!Q\021qCA\004#\003%\t!!\007\0027\021bWm]:j]&$He\032:fCR,'\017\n3fM\006,H\016\036\0234+\t\tYBK\002/\003;Y#!a\b\021\t\005\005\0221F\007\003\003GQA!!\n\002(\005IQO\\2iK\016\\W\r\032\006\004\003S\001\024AC1o]>$\030\r^5p]&!\021QFA\022\005E)hn\0315fG.,GMV1sS\006t7-\032")
/*    */ public class Server extends Player {
/*    */   private final Option<li.cil.oc.server.component.Server> server;
/*    */   private final int verticalSlots;
/*    */   private boolean isRunning;
/*    */   private boolean isItem;
/*    */   
/* 10 */   public Option<li.cil.oc.server.component.Server> server() { return this.server; } public Server(InventoryPlayer playerInventory, ServerInventory serverInventory, Option<li.cil.oc.server.component.Server> server) { super(playerInventory, (IInventory)serverInventory); RichInt$.MODULE$
/* 11 */       .to$extension0(Predef$.MODULE$.intWrapper(0), 1).foreach$mVc$sp((Function1)new Server$$anonfun$1(this));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     this.verticalSlots = package$.MODULE$.min(3, 1 + ((ServerInventory)otherInventory()).tier()); RichInt$.MODULE$
/* 17 */       .to$extension0(Predef$.MODULE$.intWrapper(0), verticalSlots()).foreach$mVc$sp((Function1)new Server$$anonfun$2(this)); RichInt$.MODULE$
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 22 */       .to$extension0(Predef$.MODULE$.intWrapper(0), verticalSlots()).foreach$mVc$sp((Function1)new Server$$anonfun$3(this)); RichInt$.MODULE$
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 27 */       .to$extension0(Predef$.MODULE$.intWrapper(0), verticalSlots()).foreach$mVc$sp((Function1)new Server$$anonfun$4(this)); RichInt$.MODULE$
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 32 */       .to$extension0(Predef$.MODULE$.intWrapper(2), verticalSlots()).foreach$mVc$sp((Function1)new Server$$anonfun$5(this));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     InventorySlots.InventorySlot slot = InventorySlots$.MODULE$.server()[((ServerInventory)otherInventory()).tier()][func_75138_a().size()];
/* 39 */     addSlotToContainer(26, 34, slot.slot(), slot.tier());
/*    */ 
/*    */ 
/*    */     
/* 43 */     addPlayerInventorySlots(8, 84);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     this.isRunning = false;
/* 51 */     this.isItem = true; } public final class Server$$anonfun$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } public Server$$anonfun$1(Server $outer) {} public void apply$mcVI$sp(int i) { InventorySlots.InventorySlot slot = InventorySlots$.MODULE$.server()[((ServerInventory)this.$outer.li$cil$oc$common$container$Server$$super$otherInventory()).tier()][this.$outer.func_75138_a().size()]; this.$outer.addSlotToContainer(76, 7 + i * this.$outer.slotSize(), slot.slot(), slot.tier()); } } public int verticalSlots() { return this.verticalSlots; } public final class Server$$anonfun$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } public Server$$anonfun$2(Server $outer) {} public void apply$mcVI$sp(int i) { InventorySlots.InventorySlot slot = InventorySlots$.MODULE$.server()[((ServerInventory)this.$outer.li$cil$oc$common$container$Server$$super$otherInventory()).tier()][this.$outer.func_75138_a().size()]; this.$outer.addSlotToContainer(100, 7 + i * this.$outer.slotSize(), slot.slot(), slot.tier()); } } public final class Server$$anonfun$3 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } public Server$$anonfun$3(Server $outer) {} public void apply$mcVI$sp(int i) { InventorySlots.InventorySlot slot = InventorySlots$.MODULE$.server()[((ServerInventory)this.$outer.li$cil$oc$common$container$Server$$super$otherInventory()).tier()][this.$outer.func_75138_a().size()]; this.$outer.addSlotToContainer(124, 7 + i * this.$outer.slotSize(), slot.slot(), slot.tier()); } } public boolean isItem() { return this.isItem; } public final class Server$$anonfun$4 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } public Server$$anonfun$4(Server $outer) {} public void apply$mcVI$sp(int i) { InventorySlots.InventorySlot slot = InventorySlots$.MODULE$.server()[((ServerInventory)this.$outer.li$cil$oc$common$container$Server$$super$otherInventory()).tier()][this.$outer.func_75138_a().size()]; this.$outer.addSlotToContainer(148, 7 + i * this.$outer.slotSize(), slot.slot(), slot.tier()); } } public final class Server$$anonfun$5 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } public Server$$anonfun$5(Server $outer) {} public void apply$mcVI$sp(int i) { InventorySlots.InventorySlot slot = InventorySlots$.MODULE$.server()[((ServerInventory)this.$outer.li$cil$oc$common$container$Server$$super$otherInventory()).tier()][this.$outer.func_75138_a().size()]; this.$outer.addSlotToContainer(76, 7 + i * this.$outer.slotSize(), slot.slot(), slot.tier()); } } public boolean func_75145_c(EntityPlayer player) { if (server().isDefined()) {  } else { EntityPlayer entityPlayer = (playerInventory()).field_70458_d; if (player == null) { if (entityPlayer != null); } else if (player.equals(entityPlayer)) {  }  }  return true; } public boolean isRunning() { return this.isRunning; } public void isRunning_$eq(boolean x$1) { this.isRunning = x$1; } public void isItem_$eq(boolean x$1) { this.isItem = x$1; }
/*    */   
/*    */   public void updateCustomData(NBTTagCompound nbt) {
/* 54 */     super.updateCustomData(nbt);
/* 55 */     isRunning_$eq(nbt.func_74767_n("isRunning"));
/* 56 */     isItem_$eq(nbt.func_74767_n("isItem"));
/*    */   }
/*    */   
/*    */   public void detectCustomDataChanges(NBTTagCompound nbt) {
/* 60 */     super.detectCustomDataChanges(nbt);
/* 61 */     Option<li.cil.oc.server.component.Server> option = server();
/* 62 */     if (option instanceof Some) { Some some = (Some)option; li.cil.oc.server.component.Server s = (li.cil.oc.server.component.Server)some.x(); nbt.func_74757_a("isRunning", s.machine().isRunning()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 63 */     else { nbt.func_74757_a("isItem", true); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */   
/*    */   public static Option<li.cil.oc.server.component.Server> $lessinit$greater$default$3() {
/*    */     return Server$.MODULE$.$lessinit$greater$default$3();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Server.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */