/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import appeng.api.util.DimensionalCoord;
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.Vec3;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ 
/*    */ public final class BlockPosition$
/*    */ {
/*    */   public static final BlockPosition$ MODULE$;
/*    */   
/*    */   public Option<World> $lessinit$greater$default$4() {
/* 16 */     return (Option<World>)scala.None$.MODULE$;
/*    */   }
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
/*    */   public BlockPosition apply(int x, int y, int z, World world) {
/* 59 */     return new BlockPosition(x, y, z, scala.Option$.MODULE$.apply(world));
/*    */   } public BlockPosition apply(int x, int y, int z) {
/* 61 */     return new BlockPosition(x, y, z, (Option<World>)scala.None$.MODULE$);
/*    */   } public BlockPosition apply(double x, double y, double z, World world) {
/* 63 */     return new BlockPosition(x, y, z, scala.Option$.MODULE$.apply(world));
/*    */   } public BlockPosition apply(double x, double y, double z) {
/* 65 */     return new BlockPosition(x, y, z, (Option<World>)scala.None$.MODULE$);
/*    */   } public BlockPosition apply(Vec3 v) {
/* 67 */     return new BlockPosition(v.field_72450_a, v.field_72448_b, v.field_72449_c, (Option<World>)scala.None$.MODULE$);
/*    */   } public BlockPosition apply(Vec3 v, World world) {
/* 69 */     return new BlockPosition(v.field_72450_a, v.field_72448_b, v.field_72449_c, scala.Option$.MODULE$.apply(world));
/*    */   } public BlockPosition apply(EnvironmentHost host) {
/* 71 */     return apply(host.xPosition(), host.yPosition(), host.zPosition(), host.world());
/*    */   } public BlockPosition apply(Entity entity) {
/* 73 */     return apply(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, entity.field_70170_p);
/*    */   }
/*    */   @Method(modid = "appliedenergistics2")
/* 76 */   public BlockPosition apply(DimensionalCoord coord) { return apply(coord.x, coord.y, coord.z, coord.getWorld()); } private BlockPosition$() {
/* 77 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\BlockPosition$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */