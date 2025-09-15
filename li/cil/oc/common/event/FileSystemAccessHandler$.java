/*    */ package li.cil.oc.common.event;
/*    */ 
/*    */ import li.cil.oc.api.component.RackMountable;
/*    */ import li.cil.oc.api.event.FileSystemAccessEvent;
/*    */ import li.cil.oc.api.internal.Rack;
/*    */ import li.cil.oc.common.tileentity.Case;
/*    */ import li.cil.oc.server.component.DiskDriveMountable;
/*    */ import li.cil.oc.server.component.Server;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ public final class FileSystemAccessHandler$ {
/*    */   public static final FileSystemAccessHandler$ MODULE$;
/*    */   
/*    */   @SubscribeEvent
/* 16 */   public void onFileSystemAccess(FileSystemAccessEvent.Server e) { TileEntity tileEntity = e.getTileEntity();
/* 17 */     if (tileEntity instanceof Rack) { TileEntity tileEntity1 = tileEntity; scala.runtime.RichInt$.MODULE$
/* 18 */         .until$extension0(scala.Predef$.MODULE$.intWrapper(0), ((IInventory)tileEntity1).func_70302_i_()).foreach$mVc$sp((Function1)new FileSystemAccessHandler$$anonfun$onFileSystemAccess$1(e, tileEntity1)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */        }
/*    */     
/*    */     else
/*    */     
/*    */     { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 35 */       BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */      }
/*    */ 
/*    */   
/*    */   @SubscribeEvent
/*    */   public void onFileSystemAccess(FileSystemAccessEvent.Client e) {
/* 41 */     float volume = li.cil.oc.Settings$.MODULE$.get().soundVolume();
/* 42 */     e.getWorld().func_72980_b(e.getX(), e.getY(), e.getZ(), e.getSound(), volume, 1.0F, false);
/* 43 */     TileEntity tileEntity = e.getTileEntity();
/* 44 */     if (tileEntity instanceof DiskDrive) { DiskDrive diskDrive = (DiskDrive)tileEntity; diskDrive.lastAccess_$eq(System.currentTimeMillis()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 45 */     else if (tileEntity instanceof Case) { Case case_ = (Case)tileEntity; case_.lastFileSystemAccess_$eq(System.currentTimeMillis()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 46 */     else if (tileEntity instanceof Raid) { Raid raid = (Raid)tileEntity; raid.lastAccess_$eq(System.currentTimeMillis()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 47 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; } 
/*    */   }
/*    */   public final class FileSystemAccessHandler$$anonfun$onFileSystemAccess$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/* 50 */     public static final long serialVersionUID = 0L; private final FileSystemAccessEvent.Server e$1; private final TileEntity x2$1; public final void apply(int slot) { apply$mcVI$sp(slot); } public FileSystemAccessHandler$$anonfun$onFileSystemAccess$1(FileSystemAccessEvent.Server e$1, TileEntity x2$1) {} public void apply$mcVI$sp(int slot) { RackMountable rackMountable = ((Rack)this.x2$1).getMountable(slot); if (rackMountable instanceof Server) { Server server = (Server)rackMountable; boolean containsNode = (server.componentSlot(this.e$1.getNode().address()) >= 0); server.lastFileSystemAccess_$eq(System.currentTimeMillis()); ((Rack)this.x2$1).markChanged(slot); BoxedUnit boxedUnit = containsNode ? BoxedUnit.UNIT : BoxedUnit.UNIT; } else if (rackMountable instanceof DiskDriveMountable) { DiskDriveMountable diskDriveMountable = (DiskDriveMountable)rackMountable; boolean containsNode = diskDriveMountable.filesystemNode().contains(this.e$1.getNode()); diskDriveMountable.lastAccess_$eq(System.currentTimeMillis()); ((Rack)this.x2$1).markChanged(slot); BoxedUnit boxedUnit = containsNode ? BoxedUnit.UNIT : BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  } } private FileSystemAccessHandler$() { MODULE$ = this; }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\event\FileSystemAccessHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */