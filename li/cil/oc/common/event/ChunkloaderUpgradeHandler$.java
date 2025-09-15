/*    */ package li.cil.oc.common.event;
/*    */ 
/*    */ import li.cil.oc.api.network.Node;
/*    */ import li.cil.oc.server.component.UpgradeChunkloader;
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.world.ChunkCoordIntPair;
/*    */ import net.minecraftforge.common.ForgeChunkManager;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.immutable.Set;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class ChunkloaderUpgradeHandler$ implements ForgeChunkManager.LoadingCallback {
/*    */   public static final ChunkloaderUpgradeHandler$ MODULE$;
/*    */   private final Map<String, ForgeChunkManager.Ticket> restoredTickets;
/*    */   
/* 21 */   private ChunkloaderUpgradeHandler$() { MODULE$ = this;
/* 22 */     this.restoredTickets = scala.collection.mutable.Map$.MODULE$.empty(); } public Map<String, ForgeChunkManager.Ticket> restoredTickets() { return this.restoredTickets; }
/*    */ 
/*    */   
/* 25 */   public void ticketsLoaded(List tickets, World world) { scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(tickets).foreach((Function1)new ChunkloaderUpgradeHandler$$anonfun$ticketsLoaded$1()); } public final class ChunkloaderUpgradeHandler$$anonfun$ticketsLoaded$1 extends AbstractFunction1<ForgeChunkManager.Ticket, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ForgeChunkManager.Ticket ticket) {
/* 26 */       NBTTagCompound data = ticket.getModData();
/* 27 */       String address = data.func_74779_i("address");
/* 28 */       ChunkloaderUpgradeHandler$.MODULE$.restoredTickets().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(address), ticket));
/* 29 */       if (data.func_74764_b("x") && data.func_74764_b("z")) {
/* 30 */         int x = data.func_74762_e("x");
/* 31 */         int z = data.func_74762_e("z");
/* 32 */         (new String[4])[0] = "Restoring chunk loader ticket for upgrade at chunk ("; (new String[4])[1] = ", "; (new String[4])[2] = ") with address "; (new String[4])[3] = "."; li.cil.oc.OpenComputers$.MODULE$.log().info((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(x), BoxesRunTime.boxToInteger(z), address })));
/*    */         
/* 34 */         ForgeChunkManager.forceChunk(ticket, new ChunkCoordIntPair(x, z));
/*    */       } 
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @SubscribeEvent
/*    */   public void onWorldSave(WorldEvent.Save e) {
/* 48 */     restoredTickets().values().foreach((Function1)new ChunkloaderUpgradeHandler$$anonfun$onWorldSave$1());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 58 */     restoredTickets().clear();
/*    */   } public final class ChunkloaderUpgradeHandler$$anonfun$onWorldSave$1 extends AbstractFunction1<ForgeChunkManager.Ticket, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final void apply(ForgeChunkManager.Ticket ticket) { try {
/*    */         NBTTagCompound data = ticket.getModData();
/*    */         (new String[4])[0] = "A chunk loader ticket has been orphaned! Address: ";
/*    */         (new String[4])[1] = ", position: (";
/*    */         (new String[4])[2] = ", ";
/*    */         (new String[4])[3] = "). Removing...";
/*    */         li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { data.func_74779_i("address"), BoxesRunTime.boxToInteger(data.func_74762_e("x")), BoxesRunTime.boxToInteger(data.func_74762_e("z")) })));
/*    */         ForgeChunkManager.releaseTicket(ticket);
/*    */       } finally {} } }
/*    */   @SubscribeEvent
/* 70 */   public void onMove(RobotMoveEvent.Post e) { Node machineNode = e.agent.machine().node();
/* 71 */     scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable(machineNode.reachableNodes()).foreach((Function1)new ChunkloaderUpgradeHandler$$anonfun$onMove$1()); } public final class ChunkloaderUpgradeHandler$$anonfun$onMove$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Node x$1) { Environment environment = x$1.host();
/* 72 */       if (environment instanceof UpgradeChunkloader) { UpgradeChunkloader upgradeChunkloader = (UpgradeChunkloader)environment; ChunkloaderUpgradeHandler$.MODULE$.updateLoadedChunk(upgradeChunkloader); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 73 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */        } }
/*    */   
/*    */   public final class ChunkloaderUpgradeHandler$$anonfun$1 extends AbstractFunction1<Object, IndexedSeq<ChunkCoordIntPair>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final ChunkCoordIntPair centerChunk$1; public final IndexedSeq<ChunkCoordIntPair> apply(int x) { return (IndexedSeq<ChunkCoordIntPair>)scala.runtime.RichInt$.MODULE$.to$extension0(scala.Predef$.MODULE$.intWrapper(-1), 1).map((Function1)new ChunkloaderUpgradeHandler$$anonfun$1$$anonfun$apply$2(this, x), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()); } public ChunkloaderUpgradeHandler$$anonfun$1(ChunkCoordIntPair centerChunk$1) {} public final class ChunkloaderUpgradeHandler$$anonfun$1$$anonfun$apply$2 extends AbstractFunction1<Object, ChunkCoordIntPair> implements Serializable { public static final long serialVersionUID = 0L; private final int x$2; public final ChunkCoordIntPair apply(int z) { return new ChunkCoordIntPair(this.$outer.centerChunk$1.field_77276_a + this.x$2, this.$outer.centerChunk$1.field_77275_b + z); } public ChunkloaderUpgradeHandler$$anonfun$1$$anonfun$apply$2(ChunkloaderUpgradeHandler$$anonfun$1 $outer, int x$2) {} }
/* 78 */   } public void updateLoadedChunk(UpgradeChunkloader loader) { BlockPosition blockPos = li.cil.oc.util.BlockPosition$.MODULE$.apply(loader.host());
/* 79 */     ChunkCoordIntPair centerChunk = new ChunkCoordIntPair(blockPos.x() >> 4, blockPos.z() >> 4);
/* 80 */     Set robotChunks = ((TraversableOnce)scala.runtime.RichInt$.MODULE$.to$extension0(scala.Predef$.MODULE$.intWrapper(-1), 1).flatMap((Function1)new ChunkloaderUpgradeHandler$$anonfun$1(centerChunk), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom())).toSet();
/*    */     
/* 82 */     loader.ticket().foreach((Function1)new ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1(loader, centerChunk, robotChunks)); } public final class ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1 extends AbstractFunction1<ForgeChunkManager.Ticket, BoxedUnit> implements Serializable { public final void apply(ForgeChunkManager.Ticket ticket) {
/* 83 */       scala.collection.convert.WrapAsScala$.MODULE$.asScalaSet((Set)ticket.getChunkList()).collect((PartialFunction)new ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1$$anonfun$apply$1(this, ticket), scala.collection.mutable.Set$.MODULE$.canBuildFrom());
/*    */ 
/*    */ 
/*    */       
/* 87 */       this.robotChunks$1.foreach((Function1)new ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1$$anonfun$apply$3(this, ticket));
/*    */ 
/*    */ 
/*    */       
/* 91 */       ticket.getModData().func_74778_a("address", this.loader$1.node().address());
/* 92 */       ticket.getModData().func_74768_a("x", this.centerChunk$1.field_77276_a);
/* 93 */       ticket.getModData().func_74768_a("z", this.centerChunk$1.field_77275_b);
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final UpgradeChunkloader loader$1;
/*    */     private final ChunkCoordIntPair centerChunk$1;
/*    */     public final Set robotChunks$1;
/*    */     
/*    */     public ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1(UpgradeChunkloader loader$1, ChunkCoordIntPair centerChunk$1, Set robotChunks$1) {}
/*    */     
/*    */     public final class ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1$$anonfun$apply$1 extends AbstractPartialFunction<ChunkCoordIntPair, BoxedUnit> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final ForgeChunkManager.Ticket ticket$1;
/*    */       
/*    */       public final <A1 extends ChunkCoordIntPair, B1> B1 applyOrElse(ChunkCoordIntPair x1, Function1 default) {
/*    */         ChunkCoordIntPair chunkCoordIntPair = x1;
/*    */         if (chunkCoordIntPair != null) {
/*    */           ChunkCoordIntPair chunkCoordIntPair1 = chunkCoordIntPair;
/*    */           if (!this.$outer.robotChunks$1.contains(chunkCoordIntPair1)) {
/*    */             ForgeChunkManager.unforceChunk(this.ticket$1, chunkCoordIntPair1);
/*    */             return (B1)BoxedUnit.UNIT;
/*    */           } 
/*    */         } 
/*    */         return (B1)default.apply(x1);
/*    */       }
/*    */       
/*    */       public final boolean isDefinedAt(ChunkCoordIntPair x1) {
/*    */         ChunkCoordIntPair chunkCoordIntPair = x1;
/*    */         if (chunkCoordIntPair != null) {
/*    */           ChunkCoordIntPair chunkCoordIntPair1 = chunkCoordIntPair;
/*    */           if (!this.$outer.robotChunks$1.contains(chunkCoordIntPair1))
/*    */             return true; 
/*    */         } 
/*    */         return false;
/*    */       }
/*    */       
/*    */       public ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1$$anonfun$apply$1(ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1 $outer, ForgeChunkManager.Ticket ticket$1) {}
/*    */     }
/*    */     
/*    */     public final class ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1$$anonfun$apply$3 extends AbstractFunction1<ChunkCoordIntPair, BoxedUnit> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final ForgeChunkManager.Ticket ticket$1;
/*    */       
/*    */       public ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1$$anonfun$apply$3(ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1 $outer, ForgeChunkManager.Ticket ticket$1) {}
/*    */       
/*    */       public final void apply(ChunkCoordIntPair chunk) {
/*    */         ForgeChunkManager.forceChunk(this.ticket$1, chunk);
/*    */       }
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\ChunkloaderUpgradeHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */