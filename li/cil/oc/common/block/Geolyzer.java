/*    */ package li.cil.oc.common.block;
/*    */ import li.cil.oc.Settings$;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\00154A!\001\002\001\033\tAq)Z8msj,'O\003\002\004\t\005)!\r\\8dW*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001a\005\002\001\035A\021q\002E\007\002\005%\021\021C\001\002\f'&l\007\017\\3CY>\0347\016C\003\024\001\021\005A#\001\004=S:LGO\020\013\002+A\021q\002\001\005\006/\001!\t\006G\001\017GV\034Ho\\7UKb$XO]3t+\005I\002c\001\016\036?5\t1DC\001\035\003\025\0318-\0317b\023\tq2DA\003BeJ\f\027\020E\002\033A\tJ!!I\016\003\r=\003H/[8o!\t\031cE\004\002\033I%\021QeG\001\007!J,G-\0324\n\005\035B#AB*ue&twM\003\002&7!)!\006\001C!W\005\021\"/Z4jgR,'O\0217pG.L5m\0348t)\tas\006\005\002\033[%\021af\007\002\005+:LG\017C\0031S\001\007\021'\001\007jG>t'+Z4jgR,'\017\005\0023{5\t1G\003\0025k\0059A/\032=ukJ,'B\001\0348\003!\021XM\0343fe\026\024(B\001\035:\003\031\031G.[3oi*\021!hO\001\n[&tWm\031:bMRT\021\001P\001\004]\026$\030B\001 4\0055I\025jY8o%\026<\027n\035;fe\"\"\021\006\021'N!\t\t%*D\001C\025\t\031E)\001\006sK2\fWO\\2iKJT!!\022$\002\007\031lGN\003\002H\021\006!Qn\0343t\025\005I\025aA2qo&\0211J\021\002\t'&$Wm\0248ms\006)a/\0317vK\022\na*\003\002P!\00611\tT%F\035RS!!\025\"\002\tMKG-\032\005\006'\002!\t\005V\001\016Q\006\034H+\0337f\013:$\030\016^=\025\005UC\006C\001\016W\023\t96DA\004C_>dW-\0318\t\013e\023\006\031\001.\002\0215,G/\0313bi\006\004\"AG.\n\005q[\"aA%oi\")a\f\001C!?\006\0012M]3bi\026$\026\016\\3F]RLG/\037\013\004A\026d\007CA1e\033\005\021'BA2\005\003)!\030\016\\3f]RLG/_\005\003\003\tDQAZ/A\002\035\fQa^8sY\022\004\"\001\0336\016\003%T!AZ\035\n\005-L'!B,pe2$\007\"B-^\001\004Q\006")
/*    */ public class Geolyzer extends SimpleBlock {
/*    */   public Geolyzer() {
/* 12 */     super(SimpleBlock$.MODULE$.$lessinit$greater$default$1());
/* 13 */     ModColoredLights$.MODULE$.setLightLevel(this, 3, 1, 1);
/*    */   } public Option<String>[] customTextures() {
/* 15 */     (new Option[6])[0] = 
/* 16 */       (Option)None$.MODULE$;
/* 17 */     (new Option[6])[1] = (Option)new Some("GeolyzerTop");
/* 18 */     (new Option[6])[2] = (Option)new Some("GeolyzerSide");
/* 19 */     (new Option[6])[3] = (Option)new Some("GeolyzerSide");
/* 20 */     (new Option[6])[4] = (Option)new Some("GeolyzerSide");
/* 21 */     (new Option[6])[5] = (Option)new Some("GeolyzerSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 26 */     super.func_149651_a(iconRegister);
/* 27 */     Textures$Geolyzer$.MODULE$.iconTopOn_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":GeolyzerTopOn").toString()));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasTileEntity(int metadata) {
/* 32 */     return true;
/*    */   } public li.cil.oc.common.tileentity.Geolyzer createTileEntity(World world, int metadata) {
/* 34 */     return new li.cil.oc.common.tileentity.Geolyzer();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Geolyzer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */