/*    */ package li.cil.oc.common.event;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\r;Q!\001\002\t\0025\tqCR5mKNK8\017^3n\003\016\034Wm]:IC:$G.\032:\013\005\r!\021!B3wK:$(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\021\0059yQ\"\001\002\007\013A\021\001\022A\t\003/\031KG.Z*zgR,W.Q2dKN\034\b*\0318eY\026\0248CA\b\023!\t\031b#D\001\025\025\005)\022!B:dC2\f\027BA\f\025\005\031\te.\037*fM\")\021d\004C\0015\0051A(\0338jiz\"\022!\004\005\0069=!\t!H\001\023_:4\025\016\\3TsN$X-\\!dG\026\0348\017\006\002\037CA\0211cH\005\003AQ\021A!\0268ji\")!e\007a\001G\005\tQ\r\005\002%W9\021Q%K\007\002M)\0211a\n\006\003Q\031\t1!\0319j\023\tQc%A\013GS2,7+_:uK6\f5mY3tg\0263XM\034;\n\0051j#AB*feZ,'O\003\002+M!\0221d\f\t\003aij\021!\r\006\003eM\nA\"\032<f]RD\027M\0343mKJT!!\002\033\013\005U2\024a\0014nY*\021q\007O\001\005[>$7OC\001:\003\r\031\007o^\005\003wE\022abU;cg\016\024\030NY3Fm\026tG\017C\003\035\037\021\005Q\b\006\002\037}!)!\005\020a\001A\021A\005Q\005\003\0036\022aa\0217jK:$\bF\001\0370\001")
/*    */ public final class FileSystemAccessHandler {
/*    */   @SubscribeEvent
/*    */   public static void onFileSystemAccess(FileSystemAccessEvent.Client paramClient) {
/*    */     FileSystemAccessHandler$.MODULE$.onFileSystemAccess(paramClient);
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void onFileSystemAccess(FileSystemAccessEvent.Server paramServer) {
/*    */     FileSystemAccessHandler$.MODULE$.onFileSystemAccess(paramServer);
/*    */   }
/*    */   
/*    */   public final class FileSystemAccessHandler$$anonfun$onFileSystemAccess$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/* 18 */     public final void apply(int slot) { apply$mcVI$sp(slot); } private final FileSystemAccessEvent.Server e$1; private final TileEntity x2$1; public FileSystemAccessHandler$$anonfun$onFileSystemAccess$1(FileSystemAccessEvent.Server e$1, TileEntity x2$1) {} public void apply$mcVI$sp(int slot) {
/* 19 */       RackMountable rackMountable = ((Rack)this.x2$1).getMountable(slot);
/* 20 */       if (rackMountable instanceof Server) { Server server = (Server)rackMountable;
/* 21 */         boolean containsNode = (server.componentSlot(this.e$1.getNode().address()) >= 0);
/*    */         
/* 23 */         server.lastFileSystemAccess_$eq(System.currentTimeMillis());
/* 24 */         ((Rack)this.x2$1).markChanged(slot); BoxedUnit boxedUnit = containsNode ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*    */       
/* 26 */       else if (rackMountable instanceof DiskDriveMountable) { DiskDriveMountable diskDriveMountable = (DiskDriveMountable)rackMountable;
/* 27 */         boolean containsNode = diskDriveMountable.filesystemNode().contains(this.e$1.getNode());
/*    */         
/* 29 */         diskDriveMountable.lastAccess_$eq(System.currentTimeMillis());
/* 30 */         ((Rack)this.x2$1).markChanged(slot); BoxedUnit boxedUnit = containsNode ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*    */       else
/* 32 */       { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\FileSystemAccessHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */