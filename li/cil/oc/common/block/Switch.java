/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import li.cil.oc.common.block.traits.GUI;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\005a\001B\001\003\0015\021aaU<ji\016D'BA\002\005\003\025\021Gn\\2l\025\t)a!\001\004d_6lwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011c\001\001\017%A\021q\002E\007\002\005%\021\021C\001\002\f'&l\007\017\\3CY>\0347\016\005\002\024-5\tAC\003\002\026\005\0051AO]1jiNL!a\006\013\003\007\035+\026\nC\003\032\001\021\005!$\001\004=S:LGO\020\013\0027A\021q\002\001\005\006;\001!\tFH\001\017GV\034Ho\\7UKb$XO]3t+\005y\002c\001\021$K5\t\021EC\001#\003\025\0318-\0317b\023\t!\023EA\003BeJ\f\027\020E\002!M!J!aJ\021\003\r=\003H/[8o!\tICF\004\002!U%\0211&I\001\007!J,G-\0324\n\0055r#AB*ue&twM\003\002,C!)\001\007\001C!c\005\021\"/Z4jgR,'O\0217pG.L5m\0348t)\t\021T\007\005\002!g%\021A'\t\002\005+:LG\017C\0037_\001\007q'\001\007jG>t'+Z4jgR,'\017\005\0029\0076\t\021H\003\002;w\0059A/\032=ukJ,'B\001\037>\003!\021XM\0343fe\026\024(B\001 @\003\031\031G.[3oi*\021\001)Q\001\n[&tWm\031:bMRT\021AQ\001\004]\026$\030B\001#:\0055I\025jY8o%\026<\027n\035;fe\")a\t\001C!\017\0069q-^5UsB,W#\001%\023\007%{%K\002\003K\001\001A%\001\004\037sK\032Lg.Z7f]Rt\024B\001'N\003\035\031v/\033;dQ\002R!A\024\003\002\017\035+\030\016V=qKB\021\001\005U\005\003#\006\022a!\0218z%\0264\007CA*W\035\t!V+D\001\005\023\tqE!\003\002X\033\n9QI\\;n-\006d\007\"B-J\t\003Q\026aB:vERK\b/Z\013\0027J\031AlT1\007\t)\003\001aW\005\003=~\013aA\0217pG.\004#B\0011N\003!\031\025\r^3h_JL\bC\0012e\035\t\0316-\003\002a\033&\021qk\030\005\006M\002!\teZ\001\016Q\006\034H+\0337f\013:$\030\016^=\025\005!\\\007C\001\021j\023\tQ\027EA\004C_>dW-\0318\t\0131,\007\031A7\002\0215,G/\0313bi\006\004\"\001\t8\n\005=\f#aA%oi\")\021\017\001C!e\006\0012M]3bi\026$\026\016\\3F]RLG/\037\013\004gb|\bC\001;x\033\005)(B\001<\005\003)!\030\016\\3f]RLG/_\005\003\003UDQ!\0379A\002i\fQa^8sY\022\004\"a_?\016\003qT!!_ \n\005yd(!B,pe2$\007\"\0027q\001\004i\007")
/*    */ public class Switch extends SimpleBlock implements GUI {
/* 12 */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) { return GUI.class.onBlockActivated(this, world, x, y, z, player, side, hitX, hitY, hitZ); } public Switch() { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); GUI.class.$init$(this);
/* 13 */     NEI$.MODULE$.hide(this); }
/*    */    public Option<String>[] customTextures() {
/* 15 */     (new Option[6])[0] = 
/* 16 */       (Option)None$.MODULE$;
/* 17 */     (new Option[6])[1] = (Option)new Some("SwitchTop");
/* 18 */     (new Option[6])[2] = (Option)new Some("SwitchSide");
/* 19 */     (new Option[6])[3] = (Option)new Some("SwitchSide");
/* 20 */     (new Option[6])[4] = (Option)new Some("SwitchSide");
/* 21 */     (new Option[6])[5] = (Option)new Some("SwitchSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 25 */     super.func_149651_a(iconRegister);
/* 26 */     Textures$Switch$.MODULE$.iconSideActivity_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":SwitchSideOn").toString()));
/*    */   }
/*    */ 
/*    */   
/*    */   public GuiType.EnumVal guiType() {
/* 31 */     return GuiType$.MODULE$.Switch();
/*    */   } public boolean hasTileEntity(int metadata) {
/* 33 */     return true;
/*    */   } public li.cil.oc.common.tileentity.Switch createTileEntity(World world, int metadata) {
/* 35 */     return new li.cil.oc.common.tileentity.Switch();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Switch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */