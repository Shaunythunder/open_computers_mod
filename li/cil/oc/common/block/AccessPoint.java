/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\00153A!\001\002\001\033\tY\021iY2fgN\004v.\0338u\025\t\031A!A\003cY>\0347N\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001aB\005\t\003\037Ai\021AA\005\003#\t\021aaU<ji\016D\007CA\n\027\033\005!\"BA\013\003\003\031!(/Y5ug&\021q\003\006\002\016!><XM]!dG\026\004Ho\034:\t\013e\001A\021\001\016\002\rqJg.\033;?)\005Y\002CA\b\001\021\025i\002\001\"\025\037\0039\031Wo\035;p[R+\007\020^;sKN,\022a\b\t\004A\r*S\"A\021\013\003\t\nQa]2bY\006L!\001J\021\003\013\005\023(/Y=\021\007\0012\003&\003\002(C\t1q\n\035;j_:\004\"!\013\027\017\005\001R\023BA\026\"\003\031\001&/\0323fM&\021QF\f\002\007'R\024\030N\\4\013\005-\n\003\"\002\031\001\t\003\n\024\001E3oKJ<\027\020\0265s_V<\007\016];u+\005\021\004C\001\0214\023\t!\024E\001\004E_V\024G.\032\005\006m\001!\teN\001\021GJ,\027\r^3US2,WI\034;jif$2\001O\037I!\tID(D\001;\025\tYD!\001\006uS2,WM\034;jifL!!\001\036\t\013y*\004\031A \002\013]|'\017\0343\021\005\0013U\"A!\013\005y\022%BA\"E\003%i\027N\\3de\0064GOC\001F\003\rqW\r^\005\003\017\006\023QaV8sY\022DQ!S\033A\002)\013\001\"\\3uC\022\fG/\031\t\003A-K!\001T\021\003\007%sG\017")
/*    */ public class AccessPoint extends Switch implements PowerAcceptor {
/*  9 */   public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { PowerAcceptor.class.tooltipTail(this, metadata, stack, player, tooltip, advanced); } public AccessPoint() { PowerAcceptor.class.$init$(this);
/* 10 */     NEI$.MODULE$.hide(this); }
/*    */    public Option<String>[] customTextures() {
/* 12 */     (new Option[6])[0] = 
/* 13 */       (Option)None$.MODULE$;
/* 14 */     (new Option[6])[1] = (Option)new Some("AccessPointTop");
/* 15 */     (new Option[6])[2] = (Option)new Some("SwitchSide");
/* 16 */     (new Option[6])[3] = (Option)new Some("SwitchSide");
/* 17 */     (new Option[6])[4] = (Option)new Some("SwitchSide");
/* 18 */     (new Option[6])[5] = (Option)new Some("SwitchSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   
/*    */   public double energyThroughput() {
/* 23 */     return Settings$.MODULE$.get().accessPointRate();
/*    */   } public li.cil.oc.common.tileentity.AccessPoint createTileEntity(World world, int metadata) {
/* 25 */     return new li.cil.oc.common.tileentity.AccessPoint();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\AccessPoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */