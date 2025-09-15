/*    */ package li.cil.oc.common.block;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001q4A!\001\002\001\033\tI1)\0319bG&$xN\035\006\003\007\021\tQA\0317pG.T!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\003\0019\001\"a\004\t\016\003\tI!!\005\002\003\027MKW\016\0357f\0052|7m\033\005\006'\001!\t\001F\001\007y%t\027\016\036 \025\003U\001\"a\004\001\t\013]\001A\021\013\r\002\035\r,8\017^8n)\026DH/\036:fgV\t\021\004E\002\033;}i\021a\007\006\0029\005)1oY1mC&\021ad\007\002\006\003J\024\030-\037\t\0045\001\022\023BA\021\034\005\031y\005\017^5p]B\0211E\n\b\0035\021J!!J\016\002\rA\023X\rZ3g\023\t9\003F\001\004TiJLgn\032\006\003KmAQA\013\001\005B-\nQ\002[1t)&dW-\0228uSRLHC\001\0270!\tQR&\003\002/7\t9!i\\8mK\006t\007\"\002\031*\001\004\t\024\001C7fi\006$\027\r^1\021\005i\021\024BA\032\034\005\rIe\016\036\005\006k\001!\tEN\001\021GJ,\027\r^3US2,WI\034;jif$2a\016\037H!\tA4(D\001:\025\tQD!\001\006uS2,WM\034;jifL!!A\035\t\013u\"\004\031\001 \002\013]|'\017\0343\021\005}*U\"\001!\013\005u\n%B\001\"D\003%i\027N\\3de\0064GOC\001E\003\rqW\r^\005\003\r\002\023QaV8sY\022DQ\001\r\033A\002EBQ!\023\001\005B)\013!\004[1t\007>l\007/\031:bi>\024\030J\0349vi>3XM\035:jI\026$\022\001\f\005\006\031\002!\t%T\001\033O\026$8i\\7qCJ\fGo\034:J]B,Ho\024<feJLG-\032\013\007c9{\025kU+\t\013uZ\005\031\001 \t\013A[\005\031A\031\002\003aDQAU&A\002E\n\021!\037\005\006).\003\r!M\001\002u\")ak\023a\001c\005!1/\0333f\021\025A\006\001\"\021Z\003))\b\017Z1uKRK7m\033\013\0075vsv\fY1\021\005iY\026B\001/\034\005\021)f.\033;\t\013u:\006\031\001 \t\013A;\006\031A\031\t\013I;\006\031A\031\t\013Q;\006\031A\031\t\013\t<\006\031A2\002\007Itw\r\005\002eS6\tQM\003\002gO\006!Q\017^5m\025\005A\027\001\0026bm\006L!A[3\003\rI\013g\016Z8n\021\025a\007\001\"\021n\003!!\030nY6SCR,GCA\031o\021\025i4\0161\001?\021\025\001\b\001\"\021r\003UygNT3jO\"\024wN\035\"m_\016\\7\t[1oO\026$bA\027:tiV4\b\"B\037p\001\004q\004\"\002)p\001\004\t\004\"\002*p\001\004\t\004\"\002+p\001\004\t\004\"B\002p\001\0049\bC\001={\033\005I(BA\002B\023\tY\030PA\003CY>\0347\016")
/*    */ public class Capacitor extends SimpleBlock {
/*    */   public Capacitor() {
/* 10 */     super(SimpleBlock$.MODULE$.$lessinit$greater$default$1());
/* 11 */     ModColoredLights$.MODULE$.setLightLevel(this, 5, 5, 5);
/*    */     
/* 13 */     func_149675_a(true);
/*    */   } public Option<String>[] customTextures() {
/* 15 */     (new Option[6])[0] = 
/* 16 */       (Option)None$.MODULE$;
/* 17 */     (new Option[6])[1] = (Option)new Some("CapacitorTop");
/* 18 */     (new Option[6])[2] = (Option)new Some("CapacitorSide");
/* 19 */     (new Option[6])[3] = (Option)new Some("CapacitorSide");
/* 20 */     (new Option[6])[4] = (Option)new Some("CapacitorSide");
/* 21 */     (new Option[6])[5] = (Option)new Some("CapacitorSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   
/*    */   public boolean hasTileEntity(int metadata) {
/* 26 */     return true;
/*    */   } public li.cil.oc.common.tileentity.Capacitor createTileEntity(World world, int metadata) {
/* 28 */     return new li.cil.oc.common.tileentity.Capacitor();
/*    */   }
/*    */   
/*    */   public boolean func_149740_M() {
/* 32 */     return true;
/*    */   }
/*    */   public int func_149736_g(World world, int x, int y, int z, int side) {
/* 35 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 36 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Capacitor) { li.cil.oc.common.tileentity.Capacitor capacitor = (li.cil.oc.common.tileentity.Capacitor)tileEntity; if (!world.field_72995_K)
/* 37 */         return (int)package$.MODULE$.round(15 * capacitor.node().localBuffer() / capacitor.node().localBufferSize());  }
/* 38 */      return 0;
/*    */   }
/*    */   
/*    */   public void func_149674_a(World world, int x, int y, int z, Random rng) {
/* 42 */     world.func_147459_d(x, y, z, this);
/*    */   }
/*    */   public int func_149738_a(World world) {
/* 45 */     return 1;
/*    */   }
/*    */   public void func_149695_a(World world, int x, int y, int z, Block block) {
/* 48 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 49 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Capacitor) { li.cil.oc.common.tileentity.Capacitor capacitor = (li.cil.oc.common.tileentity.Capacitor)tileEntity; capacitor.recomputeCapacity(capacitor.recomputeCapacity$default$1()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 50 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Capacitor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */