/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Ma\001B\001\003\0015\021QAU3mCfT!a\001\003\002\013\tdwnY6\013\005\0251\021AB2p[6|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031B\001\001\b\0231A\021q\002E\007\002\005%\021\021C\001\002\f'&l\007\017\\3CY>\0347\016\005\002\024-5\tAC\003\002\026\005\0051AO]1jiNL!a\006\013\003\007\035+\026\n\005\002\0243%\021!\004\006\002\016!><XM]!dG\026\004Ho\034:\t\013q\001A\021A\017\002\rqJg.\033;?)\005q\002CA\b\001\021\025\001\003\001\"\025\"\0039\031Wo\035;p[R+\007\020^;sKN,\022A\t\t\004G\031BS\"\001\023\013\003\025\nQa]2bY\006L!a\n\023\003\013\005\023(/Y=\021\007\rJ3&\003\002+I\t1q\n\035;j_:\004\"\001L\030\017\005\rj\023B\001\030%\003\031\001&/\0323fM&\021\001'\r\002\007'R\024\030N\\4\013\0059\"\003\"B\032\001\t\003\"\024A\005:fO&\034H/\032:CY>\0347.S2p]N$\"!\016\035\021\005\r2\024BA\034%\005\021)f.\033;\t\013e\022\004\031\001\036\002\031%\034wN\034*fO&\034H/\032:\021\005m2U\"\001\037\013\005ur\024a\002;fqR,(/\032\006\003\001\013\001B]3oI\026\024XM\035\006\003\003\n\013aa\0317jK:$(BA\"E\003%i\027N\\3de\0064GOC\001F\003\rqW\r^\005\003\017r\022Q\"S%d_:\024VmZ5ti\026\024\b\"B%\001\t\003R\025aB4vSRK\b/Z\013\002\027J\031AJU+\007\t5\003\001a\023\002\ryI,g-\0338f[\026tGOP\005\003\037B\013aAU3mCf\004#BA)\005\003\0359U/\033+za\026\004\"aI*\n\005Q##AB!osJ+g\r\005\002W3:\021q\013W\007\002\t%\021\021\013B\005\0035B\023q!\0228v[Z\013G\016C\003]\031\022\005Q,A\004tk\n$\026\020]3\026\003y\0232a\030*e\r\021i\005\001\0010\n\005\005\024\027A\002\"m_\016\\\007E\003\002d!\006A1)\031;fO>\024\030\020\005\002fO:\021aKZ\005\003GBK!A\0272\t\013%\004A\021\t6\002!\025tWM]4z)\"\024x.^4iaV$X#A6\021\005\rb\027BA7%\005\031!u.\0362mK\")q\016\001C!a\006i\001.Y:US2,WI\034;jif$\"!\035;\021\005\r\022\030BA:%\005\035\021un\0347fC:DQ!\0368A\002Y\f\001\"\\3uC\022\fG/\031\t\003G]L!\001\037\023\003\007%sG\017C\003{\001\021\00530\001\tde\026\fG/\032+jY\026,e\016^5usR)A0a\001\002\022A\031Q0!\001\016\003yT!a \003\002\025QLG.Z3oi&$\0300\003\002\002}\"9\021QA=A\002\005\035\021!B<pe2$\007\003BA\005\003\033i!!a\003\013\007\005\025!)\003\003\002\020\005-!!B,pe2$\007\"B;z\001\0041\b")
/*    */ public class Relay extends SimpleBlock implements GUI, PowerAcceptor {
/* 10 */   public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { PowerAcceptor.class.tooltipTail(this, metadata, stack, player, tooltip, advanced); } public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) { return GUI.class.onBlockActivated(this, world, x, y, z, player, side, hitX, hitY, hitZ); } public Relay() { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); GUI.class.$init$(this); PowerAcceptor.class.$init$(this); } public Option<String>[] customTextures() {
/* 11 */     (new Option[6])[0] = 
/* 12 */       (Option)None$.MODULE$;
/* 13 */     (new Option[6])[1] = (Option)new Some("SwitchTop");
/* 14 */     (new Option[6])[2] = (Option)new Some("SwitchSide");
/* 15 */     (new Option[6])[3] = (Option)new Some("SwitchSide");
/* 16 */     (new Option[6])[4] = (Option)new Some("SwitchSide");
/* 17 */     (new Option[6])[5] = (Option)new Some("SwitchSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 21 */     super.func_149651_a(iconRegister);
/* 22 */     Textures$Switch$.MODULE$.iconSideActivity_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":SwitchSideOn").toString()));
/*    */   }
/*    */ 
/*    */   
/*    */   public GuiType.EnumVal guiType() {
/* 27 */     return GuiType$.MODULE$.Relay();
/*    */   } public double energyThroughput() {
/* 29 */     return Settings$.MODULE$.get().accessPointRate();
/*    */   } public boolean hasTileEntity(int metadata) {
/* 31 */     return true;
/*    */   } public li.cil.oc.common.tileentity.Relay createTileEntity(World world, int metadata) {
/* 33 */     return new li.cil.oc.common.tileentity.Relay();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Relay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */