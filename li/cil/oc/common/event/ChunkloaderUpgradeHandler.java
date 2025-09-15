/*    */ package li.cil.oc.common.event;@ScalaSignature(bytes = "\006\001\005mr!B\001\003\021\003i\021!G\"ik:\\Gn\\1eKJ,\006o\032:bI\026D\025M\0343mKJT!a\001\003\002\013\0254XM\034;\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\001\"AD\b\016\003\t1Q\001\005\002\t\002E\021\021d\0215v].dw.\0313feV\003xM]1eK\"\013g\016\0327feN\031qB\005\016\021\005MAR\"\001\013\013\005U1\022\001\0027b]\036T\021aF\001\005U\0064\030-\003\002\032)\t1qJ\0316fGR\004\"a\007\027\017\005qIcBA\017(\035\tqBE\004\002 E5\t\001E\003\002\"\031\0051AH]8pizJ\021aI\001\004]\026$\030BA\023'\0039i\027N\\3de\0064GOZ8sO\026T\021aI\005\003\013!R!!\n\024\n\005)Z\023!\005$pe\036,7\t[;oW6\013g.Y4fe*\021Q\001K\005\003[9\022q\002T8bI&twmQ1mY\n\f7m\033\006\003U-BQ\001M\b\005\002E\na\001P5oSRtD#A\007\t\017Mz!\031!C\001i\005y!/Z:u_J,G\rV5dW\026$8/F\0016!\0211ThP$\016\003]R!\001O\035\002\0175,H/\0312mK*\021!hO\001\013G>dG.Z2uS>t'\"\001\037\002\013M\034\027\r\\1\n\005y:$aA'baB\021\001\t\022\b\003\003\nk\021aO\005\003\007n\na\001\025:fI\0264\027BA#G\005\031\031FO]5oO*\0211i\017\t\0037!K!!\023\030\003\rQK7m[3u\021\031Yu\002)A\005k\005\001\"/Z:u_J,G\rV5dW\026$8\017\t\005\006\033>!\tET\001\016i&\0347.\032;t\031>\fG-\0323\025\007=\023&\f\005\002B!&\021\021k\017\002\005+:LG\017C\003T\031\002\007A+A\004uS\016\\W\r^:\021\007UCv)D\001W\025\t9f#\001\003vi&d\027BA-W\005\021a\025n\035;\t\013mc\005\031\001/\002\013]|'\017\0343\021\005u\013W\"\0010\013\005m{&B\0011'\003%i\027N\\3de\0064G/\003\002c=\n)qk\034:mI\")Am\004C\001K\006YqN\\,pe2$7+\031<f)\tye\rC\003hG\002\007\001.A\001f!\tIwN\004\002k[6\t1N\003\002\\Y*\0211\001K\005\003].\f!bV8sY\022,e/\0328u\023\t\001\030O\001\003TCZ,'B\0018lQ\t\0317\017\005\002u}6\tQO\003\002wo\006aQM^3oi\"\fg\016\0327fe*\021Q\001\037\006\003sj\f1AZ7m\025\tYH0\001\003n_\022\034(\"A?\002\007\r\004x/\003\002\000k\nq1+\0362tGJL'-Z#wK:$\bbBA\002\037\021\005\021QA\001\007_:luN^3\025\007=\0139\001C\004h\003\003\001\r!!\003\021\t\005-\021\021\004\b\005\003\033\t)\"\004\002\002\020)\0311!!\005\013\007\005Ma!A\002ba&LA!a\006\002\020\005q!k\0342pi6{g/Z#wK:$\030\002BA\016\003;\021A\001U8ti*!\021qCA\bQ\r\t\ta\035\005\b\003GyA\021AA\023\003E)\b\017Z1uK2{\027\rZ3e\007\",hn\033\013\004\037\006\035\002\002CA\025\003C\001\r!a\013\002\r1|\027\rZ3s!\021\ti#a\016\016\005\005=\"\002BA\031\003g\t\021bY8na>tWM\034;\013\007\005Ub!\001\004tKJ4XM]\005\005\003s\tyC\001\nVa\036\024\030\rZ3DQVt7\016\\8bI\026\024\b")
/*    */ public final class ChunkloaderUpgradeHandler { public static void updateLoadedChunk(UpgradeChunkloader paramUpgradeChunkloader) {
/*    */     ChunkloaderUpgradeHandler$.MODULE$.updateLoadedChunk(paramUpgradeChunkloader);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onMove(RobotMoveEvent.Post paramPost) {
/*    */     ChunkloaderUpgradeHandler$.MODULE$.onMove(paramPost);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onWorldSave(WorldEvent.Save paramSave) {
/*    */     ChunkloaderUpgradeHandler$.MODULE$.onWorldSave(paramSave);
/*    */   }
/*    */   
/*    */   public static void ticketsLoaded(List<ForgeChunkManager.Ticket> paramList, World paramWorld) {
/*    */     ChunkloaderUpgradeHandler$.MODULE$.ticketsLoaded(paramList, paramWorld);
/*    */   }
/*    */   
/*    */   public static Map<String, ForgeChunkManager.Ticket> restoredTickets() {
/*    */     return ChunkloaderUpgradeHandler$.MODULE$.restoredTickets();
/*    */   }
/*    */   
/*    */   public final class ChunkloaderUpgradeHandler$$anonfun$ticketsLoaded$1 extends AbstractFunction1<ForgeChunkManager.Ticket, BoxedUnit> implements Serializable {
/*    */     public final void apply(ForgeChunkManager.Ticket ticket) {
/* 26 */       NBTTagCompound data = ticket.getModData();
/* 27 */       String address = data.func_74779_i("address");
/* 28 */       ChunkloaderUpgradeHandler$.MODULE$.restoredTickets().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(address), ticket));
/* 29 */       if (data.func_74764_b("x") && data.func_74764_b("z")) {
/* 30 */         int x = data.func_74762_e("x");
/* 31 */         int z = data.func_74762_e("z");
/* 32 */         (new String[4])[0] = "Restoring chunk loader ticket for upgrade at chunk ("; (new String[4])[1] = ", "; (new String[4])[2] = ") with address "; (new String[4])[3] = "."; OpenComputers$.MODULE$.log().info((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(x), BoxesRunTime.boxToInteger(z), address })));
/*    */         
/* 34 */         ForgeChunkManager.forceChunk(ticket, new ChunkCoordIntPair(x, z));
/*    */       } 
/*    */     }
/*    */ 
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */   }
/*    */   
/*    */   public final class ChunkloaderUpgradeHandler$$anonfun$onWorldSave$1
/*    */     extends AbstractFunction1<ForgeChunkManager.Ticket, BoxedUnit>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(ForgeChunkManager.Ticket ticket) {
/*    */       try {
/* 50 */         NBTTagCompound data = ticket.getModData();
/* 51 */         (new String[4])[0] = "A chunk loader ticket has been orphaned! Address: "; (new String[4])[1] = ", position: ("; (new String[4])[2] = ", "; (new String[4])[3] = "). Removing..."; OpenComputers$.MODULE$.log().warn((new StringContext((Seq)Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { data.func_74779_i("address"), BoxesRunTime.boxToInteger(data.func_74762_e("x")), BoxesRunTime.boxToInteger(data.func_74762_e("z")) })));
/* 52 */         ForgeChunkManager.releaseTicket(ticket);
/*    */       } finally {}
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final class ChunkloaderUpgradeHandler$$anonfun$onMove$1
/*    */     extends AbstractFunction1<Node, BoxedUnit>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final void apply(Node x$1) {
/* 71 */       Environment environment = x$1.host();
/* 72 */       if (environment instanceof UpgradeChunkloader) { UpgradeChunkloader upgradeChunkloader = (UpgradeChunkloader)environment; ChunkloaderUpgradeHandler$.MODULE$.updateLoadedChunk(upgradeChunkloader); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 73 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/*    */     } }
/*    */   
/*    */   public final class ChunkloaderUpgradeHandler$$anonfun$1 extends AbstractFunction1<Object, IndexedSeq<ChunkCoordIntPair>> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final ChunkCoordIntPair centerChunk$1;
/*    */     
/* 80 */     public final IndexedSeq<ChunkCoordIntPair> apply(int x) { return (IndexedSeq<ChunkCoordIntPair>)RichInt$.MODULE$.to$extension0(Predef$.MODULE$.intWrapper(-1), 1).map((Function1)new ChunkloaderUpgradeHandler$$anonfun$1$$anonfun$apply$2(this, x), IndexedSeq$.MODULE$.canBuildFrom()); } public ChunkloaderUpgradeHandler$$anonfun$1(ChunkCoordIntPair centerChunk$1) {} public final class ChunkloaderUpgradeHandler$$anonfun$1$$anonfun$apply$2 extends AbstractFunction1<Object, ChunkCoordIntPair> implements Serializable { public static final long serialVersionUID = 0L; private final int x$2; public final ChunkCoordIntPair apply(int z) { return new ChunkCoordIntPair(this.$outer.centerChunk$1.field_77276_a + this.x$2, this.$outer.centerChunk$1.field_77275_b + z); }
/*    */        public ChunkloaderUpgradeHandler$$anonfun$1$$anonfun$apply$2(ChunkloaderUpgradeHandler$$anonfun$1 $outer, int x$2) {} } } public final class ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1 extends AbstractFunction1<ForgeChunkManager.Ticket, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final UpgradeChunkloader loader$1; private final ChunkCoordIntPair centerChunk$1; public final Set robotChunks$1; public ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1(UpgradeChunkloader loader$1, ChunkCoordIntPair centerChunk$1, Set robotChunks$1) {}
/*    */     public final void apply(ForgeChunkManager.Ticket ticket) {
/* 83 */       WrapAsScala$.MODULE$.asScalaSet((Set)ticket.getChunkList()).collect((PartialFunction)new ChunkloaderUpgradeHandler$$anonfun$updateLoadedChunk$1$$anonfun$apply$1(this, ticket), Set$.MODULE$.canBuildFrom());
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
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\ChunkloaderUpgradeHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */