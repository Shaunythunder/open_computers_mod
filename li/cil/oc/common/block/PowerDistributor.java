/*    */ package li.cil.oc.common.block;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001i3A!\001\002\001\033\t\001\002k\\<fe\022K7\017\036:jEV$xN\035\006\003\007\021\tQA\0317pG.T!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\003\0019\001\"a\004\t\016\003\tI!!\005\002\003\027MKW\016\0357f\0052|7m\033\005\006'\001!\t\001F\001\007y%t\027\016\036 \025\003U\001\"a\004\001\t\013]\001A\021\013\r\002\035\r,8\017^8n)\026DH/\036:fgV\t\021\004E\002\033;}i\021a\007\006\0029\005)1oY1mC&\021ad\007\002\006\003J\024\030-\037\t\0045\001\022\023BA\021\034\005\031y\005\017^5p]B\0211E\n\b\0035\021J!!J\016\002\rA\023X\rZ3g\023\t9\003F\001\004TiJLgn\032\006\003KmAQA\013\001\005B-\n!C]3hSN$XM\035\"m_\016\\\027jY8ogR\021Af\f\t\00355J!AL\016\003\tUs\027\016\036\005\006a%\002\r!M\001\rS\016|gNU3hSN$XM\035\t\003euj\021a\r\006\003iU\nq\001^3yiV\024XM\003\0027o\005A!/\0328eKJ,'O\003\0029s\00511\r\\5f]RT!AO\036\002\0235Lg.Z2sC\032$(\"\001\037\002\0079,G/\003\002?g\ti\021*S2p]J+w-[:uKJDQ\001\021\001\005B\005\013Q\002[1t)&dW-\0228uSRLHC\001\"F!\tQ2)\003\002E7\t9!i\\8mK\006t\007\"\002$@\001\0049\025\001C7fi\006$\027\r^1\021\005iA\025BA%\034\005\rIe\016\036\005\006\027\002!\t\005T\001\021GJ,\027\r^3US2,WI\034;jif$2!\024*Z!\tq\025+D\001P\025\t\001F!\001\006uS2,WM\034;jifL!!A(\t\013MS\005\031\001+\002\013]|'\017\0343\021\005U;V\"\001,\013\005MK\024B\001-W\005\0259vN\0357e\021\0251%\n1\001H\001")
/*    */ public class PowerDistributor extends SimpleBlock {
/*    */   public PowerDistributor() {
/* 10 */     super(SimpleBlock$.MODULE$.$lessinit$greater$default$1());
/* 11 */     ModColoredLights$.MODULE$.setLightLevel(this, 5, 5, 3);
/*    */   } public Option<String>[] customTextures() {
/* 13 */     (new Option[6])[0] = 
/* 14 */       (Option)None$.MODULE$;
/* 15 */     (new Option[6])[1] = (Option)new Some("PowerDistributorTop");
/* 16 */     (new Option[6])[2] = (Option)new Some("PowerDistributorSide");
/* 17 */     (new Option[6])[3] = (Option)new Some("PowerDistributorSide");
/* 18 */     (new Option[6])[4] = (Option)new Some("PowerDistributorSide");
/* 19 */     (new Option[6])[5] = (Option)new Some("PowerDistributorSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 23 */     super.func_149651_a(iconRegister);
/* 24 */     Textures$PowerDistributor$.MODULE$.iconSideOn_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":PowerDistributorSideOn").toString()));
/* 25 */     Textures$PowerDistributor$.MODULE$.iconTopOn_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":PowerDistributorTopOn").toString()));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasTileEntity(int metadata) {
/* 30 */     return true;
/*    */   } public li.cil.oc.common.tileentity.PowerDistributor createTileEntity(World world, int metadata) {
/* 32 */     return new li.cil.oc.common.tileentity.PowerDistributor();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\PowerDistributor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */