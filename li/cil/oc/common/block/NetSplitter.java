/*    */ package li.cil.oc.common.block;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.util.BlockPosition$;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005]b\001B\001\003\0015\0211BT3u'Bd\027\016\036;fe*\0211\001B\001\006E2|7m\033\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\021\001A\004\t\003\037Ai\021AA\005\003#\t\021QBU3egR|g.Z!xCJ,\007\"B\n\001\t\003!\022A\002\037j]&$h\bF\001\026!\ty\001\001C\003\030\001\021E\003$\001\bdkN$x.\034+fqR,(/Z:\026\003e\0012AG\017 \033\005Y\"\"\001\017\002\013M\034\027\r\\1\n\005yY\"!B!se\006L\bc\001\016!E%\021\021e\007\002\007\037B$\030n\0348\021\005\r2cB\001\016%\023\t)3$\001\004Qe\026$WMZ\005\003O!\022aa\025;sS:<'BA\023\034\021\025Q\003\001\"\021,\003I\021XmZ5ti\026\024(\t\\8dW&\033wN\\:\025\0051z\003C\001\016.\023\tq3D\001\003V]&$\b\"\002\031*\001\004\t\024\001D5d_:\024VmZ5ti\026\024\bC\001\032>\033\005\031$B\001\0336\003\035!X\r\037;ve\026T!AN\034\002\021I,g\016Z3sKJT!\001O\035\002\r\rd\027.\0328u\025\tQ4(A\005nS:,7M]1gi*\tA(A\002oKRL!AP\032\003\033%K5m\0348SK\036L7\017^3sQ\021I\003\tT'\021\005\005SU\"\001\"\013\005\r#\025A\003:fY\006,hn\0315fe*\021QIR\001\004M6d'BA$I\003\021iw\016Z:\013\003%\0131a\0319x\023\tY%I\001\005TS\022,wJ\0347z\003\0251\030\r\\;fI\005q\025BA(Q\003\031\031E*S#O)*\021\021KQ\001\005'&$W\rC\003T\001\021\005C+A\006jgNKG-Z*pY&$GCB+Y?\0224\007\016\005\002\033-&\021qk\007\002\b\005>|G.Z1o\021\025I&\0131\001[\003\0259xN\0357e!\tYV,D\001]\025\tI\026(\003\002_9\na\021J\0217pG.\f5mY3tg\")\001M\025a\001C\006\t\001\020\005\002\033E&\0211m\007\002\004\023:$\b\"B3S\001\004\t\027!A=\t\013\035\024\006\031A1\002\003iDQ!\033*A\002)\fAa]5eKB\0211.]\007\002Y*\021QN\\\001\005kRLGN\003\002\006_*\021\001oO\001\017[&tWm\031:bMR4wN]4f\023\t\021HN\001\bG_J<W\rR5sK\016$\030n\0348\t\013Q\004A\021I;\002!\r\024X-\031;f)&dW-\0228uSRLHc\001<|B\021qO_\007\002q*\021\021\020B\001\013i&dW-\0328uSRL\030BA\001y\021\025I6\0171\001}!\tYV0\003\0029\n)qk\034:mI\"1\021\021A:A\002\005\f\001\"\\3uC\022\fG/\031\005\b\003\013\001A\021IA\004\003AygN\0217pG.\f5\r^5wCR,G\rF\nV\003\023\tY!!\004\002\020\005E\0211EA\023\003_\t\031\004\003\004Z\003\007\001\r\001 \005\007A\006\r\001\031A1\t\r\025\f\031\0011\001b\021\0319\0271\001a\001C\"A\0211CA\002\001\004\t)\"\001\004qY\006LXM\035\t\005\003/\ty\"\004\002\002\032)!\0211CA\016\025\r\ti\"O\001\007K:$\030\016^=\n\t\005\005\022\021\004\002\r\013:$\030\016^=QY\006LXM\035\005\007S\006\r\001\031\0016\t\021\005\035\0221\001a\001\003S\tA\001[5u1B\031!$a\013\n\007\00552DA\003GY>\fG\017\003\005\0022\005\r\001\031AA\025\003\021A\027\016^-\t\021\005U\0221\001a\001\003S\tA\001[5u5\002")
/*    */ public class NetSplitter extends RedstoneAware {
/*    */   public Option<String>[] customTextures() {
/* 17 */     (new Option[6])[0] = 
/* 18 */       (Option)new Some("NetSplitterTop");
/* 19 */     (new Option[6])[1] = (Option)new Some("NetSplitterTop");
/* 20 */     (new Option[6])[2] = (Option)new Some("NetSplitterSide");
/* 21 */     (new Option[6])[3] = (Option)new Some("NetSplitterSide");
/* 22 */     (new Option[6])[4] = (Option)new Some("NetSplitterSide");
/* 23 */     (new Option[6])[5] = (Option)new Some("NetSplitterSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 28 */     super.func_149651_a(iconRegister);
/* 29 */     Textures$NetSplitter$.MODULE$.iconOn_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":NetSplitterOn").toString()));
/*    */   }
/*    */   public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/* 32 */     return false;
/*    */   }
/*    */   
/*    */   public li.cil.oc.common.tileentity.NetSplitter createTileEntity(World world, int metadata) {
/* 36 */     return new li.cil.oc.common.tileentity.NetSplitter();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/*    */     boolean bool;
/* 42 */     ForgeDirection sideToToggle = player.func_70093_af() ? side.getOpposite() : side;
/* 43 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 44 */     if (tileEntity instanceof li.cil.oc.common.tileentity.NetSplitter) { li.cil.oc.common.tileentity.NetSplitter netSplitter = (li.cil.oc.common.tileentity.NetSplitter)tileEntity;
/* 45 */       if (!world.field_72995_K) {
/* 46 */         boolean oldValue = netSplitter.openSides()[sideToToggle.ordinal()];
/* 47 */         netSplitter.setSideOpen(sideToToggle, !oldValue);
/*    */       } 
/* 49 */       bool = true; }
/* 50 */     else { bool = false; }
/*    */ 
/*    */     
/* 53 */     return Wrench$.MODULE$.holdsApplicableWrench(player, BlockPosition$.MODULE$.apply(x, y, z)) ? bool : super.onBlockActivated(world, x, y, z, player, side, hitX, hitY, hitZ);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\NetSplitter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */