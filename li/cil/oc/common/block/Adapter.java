/*    */ package li.cil.oc.common.block;
/*    */ import li.cil.oc.common.block.traits.GUI;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.IBlockAccess;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.Tuple3;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005mf\001B\001\003\0015\021q!\0213baR,'O\003\002\004\t\005)!\r\\8dW*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035I\001\"a\004\t\016\003\tI!!\005\002\003\027MKW\016\0357f\0052|7m\033\t\003'Yi\021\001\006\006\003+\t\ta\001\036:bSR\034\030BA\f\025\005\r9U+\023\005\0063\001!\tAG\001\007y%t\027\016\036 \025\003m\001\"a\004\001\t\013u\001A\021\013\020\002\035\r,8\017^8n)\026DH/\036:fgV\tq\004E\002!G\025j\021!\t\006\002E\005)1oY1mC&\021A%\t\002\006\003J\024\030-\037\t\004A\031B\023BA\024\"\005\031y\005\017^5p]B\021\021\006\f\b\003A)J!aK\021\002\rA\023X\rZ3g\023\ticF\001\004TiJLgn\032\006\003W\005BQ\001\r\001\005BE\n!C]3hSN$XM\035\"m_\016\\\027jY8ogR\021!'\016\t\003AMJ!\001N\021\003\tUs\027\016\036\005\006m=\002\raN\001\rS\016|gNU3hSN$XM\035\t\003q\rk\021!\017\006\003um\nq\001^3yiV\024XM\003\002={\005A!/\0328eKJ,'O\003\002?\00511\r\\5f]RT!\001Q!\002\0235Lg.Z2sC\032$(\"\001\"\002\0079,G/\003\002Es\ti\021*S2p]J+w-[:uKJDCa\f$S'B\021q\tU\007\002\021*\021\021JS\001\013e\026d\027-\0368dQ\026\024(BA&M\003\r1W\016\034\006\003\033:\013A!\\8eg*\tq*A\002da^L!!\025%\003\021MKG-Z(oYf\fQA^1mk\026$\023\001V\005\003+Z\013aa\021'J\013:#&BA,I\003\021\031\026\016Z3\t\013e\003A\021\t.\002\017\035,\030\016V=qKV\t1LE\002]E\0264A!\030\001\0017\naAH]3gS:,W.\0328u}%\021q\fY\001\t\003\022\f\007\017^3sA)\021\021\rB\001\b\017VLG+\0379f!\t\0013-\003\002eC\t1\021I\\=SK\032\004\"AZ5\017\005\035DW\"\001\003\n\005\005$\021B\0016a\005\035)e.^7WC2DQ\001\034/\005\0025\fqa];c)f\004X-F\001o%\ry'\r\036\004\005;\002\001a.\003\002re\0061!\t\\8dW\002R!a\0351\002\021\r\013G/Z4pef\004\"!^<\017\005\0314\030BA:a\023\tQ'\017C\003z\001\021\005#0A\007iCN$\026\016\\3F]RLG/\037\013\003wz\004\"\001\t?\n\005u\f#a\002\"p_2,\027M\034\005\007b\004\r!!\001\002\0215,G/\0313bi\006\0042\001IA\002\023\r\t)!\t\002\004\023:$\bbBA\005\001\021\005\0231B\001\021GJ,\027\r^3US2,WI\034;jif$b!!\004\002\030\005\025\002\003BA\b\003+i!!!\005\013\007\005MA!\001\006uS2,WM\034;jifL1!AA\t\021!\tI\"a\002A\002\005m\021!B<pe2$\007\003BA\017\003Ci!!a\b\013\007\005eq(\003\003\002$\005}!!B,pe2$\007bB@\002\b\001\007\021\021\001\005\b\003S\001A\021IA\026\003UygNT3jO\"\024wN\035\"m_\016\\7\t[1oO\026$2BMA\027\003_\t\031$a\016\002<!A\021\021DA\024\001\004\tY\002\003\005\0022\005\035\002\031AA\001\003\005A\b\002CA\033\003O\001\r!!\001\002\003eD\001\"!\017\002(\001\007\021\021A\001\002u\"91!a\nA\002\005u\002\003BA \003\007j!!!\021\013\005\ry\024\002BA#\003\003\022QA\0217pG.Dq!!\023\001\t\003\nY%\001\tp]:+\027n\0325c_J\034\005.\0318hKRy!'!\024\002V\005]\023\021LA.\003?\n\031\007\003\005\002\032\005\035\003\031AA(!\021\ti\"!\025\n\t\005M\023q\004\002\r\023\ncwnY6BG\016,7o\035\005\t\003c\t9\0051\001\002\002!A\021QGA$\001\004\t\t\001\003\005\002:\005\035\003\031AA\001\021!\ti&a\022A\002\005\005\021!\002;jY\026D\006\002CA1\003\017\002\r!!\001\002\013QLG.Z-\t\021\005\025\024q\ta\001\003\003\tQ\001^5mKjCq!!\033\001\t\003\nY'\001\tp]\ncwnY6BGRLg/\031;fIR\03120!\034\002p\005E\0241OA;\003\017\013i*a*\002,\"A\021\021DA4\001\004\tY\002\003\005\0022\005\035\004\031AA\001\021!\t)$a\032A\002\005\005\001\002CA\035\003O\002\r!!\001\t\021\005]\024q\ra\001\003s\na\001\0357bs\026\024\b\003BA>\003\007k!!! \013\t\005]\024q\020\006\004\003\003{\024AB3oi&$\0300\003\003\002\006\006u$\001D#oi&$\030\020\0257bs\026\024\b\002CAE\003O\002\r!a#\002\tMLG-\032\t\005\003\033\013I*\004\002\002\020*!\021\021SAJ\003\021)H/\0337\013\007\025\t)JC\002\002\030\006\013a\"\\5oK\016\024\030M\032;g_J<W-\003\003\002\034\006=%A\004$pe\036,G)\033:fGRLwN\034\005\t\003?\0139\0071\001\002\"\006!\001.\033;Y!\r\001\0231U\005\004\003K\013#!\002$m_\006$\b\002CAU\003O\002\r!!)\002\t!LG/\027\005\t\003[\0139\0071\001\002\"\006!\001.\033;[\021%\t\t\f\001b\001\n\023\t\031,A\003tS\022,7/\006\002\0026B!\001eIAF\021!\tI\f\001Q\001\n\005U\026AB:jI\026\034\b\005")
/*    */ public class Adapter extends SimpleBlock implements GUI {
/*    */   public Adapter() {
/* 18 */     super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); GUI.class.$init$(this);
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
/* 77 */     (new ForgeDirection[7])[0] = 
/* 78 */       ForgeDirection.NORTH;
/* 79 */     (new ForgeDirection[7])[1] = ForgeDirection.DOWN;
/* 80 */     (new ForgeDirection[7])[2] = ForgeDirection.WEST;
/* 81 */     (new ForgeDirection[7])[3] = ForgeDirection.UNKNOWN;
/* 82 */     (new ForgeDirection[7])[4] = ForgeDirection.EAST;
/* 83 */     (new ForgeDirection[7])[5] = ForgeDirection.UP;
/* 84 */     (new ForgeDirection[7])[6] = ForgeDirection.SOUTH;
/*    */     this.sides = new ForgeDirection[7];
/*    */   }
/*    */   
/*    */   private final ForgeDirection[] sides;
/*    */   
/*    */   public Option<String>[] customTextures() {
/*    */     (new Option[6])[0] = (Option)new Some("AdapterTop");
/*    */     (new Option[6])[1] = (Option)new Some("AdapterTop");
/*    */     (new Option[6])[2] = (Option)new Some("AdapterSide");
/*    */     (new Option[6])[3] = (Option)new Some("AdapterSide");
/*    */     (new Option[6])[4] = (Option)new Some("AdapterSide");
/*    */     (new Option[6])[5] = (Option)new Some("AdapterSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/*    */     super.func_149651_a(iconRegister);
/*    */     Textures$Adapter$.MODULE$.iconOn_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":AdapterOn").toString()));
/*    */   }
/*    */   
/*    */   public GuiType.EnumVal guiType() {
/*    */     return GuiType$.MODULE$.Adapter();
/*    */   }
/*    */   
/*    */   public boolean hasTileEntity(int metadata) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   public li.cil.oc.common.tileentity.Adapter createTileEntity(World world, int metadata) {
/*    */     return new li.cil.oc.common.tileentity.Adapter();
/*    */   }
/*    */   
/*    */   public void func_149695_a(World world, int x, int y, int z, Block block) {
/*    */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/*    */     if (tileEntity instanceof li.cil.oc.common.tileentity.Adapter) {
/*    */       li.cil.oc.common.tileentity.Adapter adapter = (li.cil.oc.common.tileentity.Adapter)tileEntity;
/*    */       adapter.neighborChanged();
/*    */       BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */     } else {
/*    */       BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void onNeighborChange(IBlockAccess world, int x, int y, int z, int tileX, int tileY, int tileZ) {
/*    */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/*    */     if (tileEntity instanceof li.cil.oc.common.tileentity.Adapter) {
/*    */       li.cil.oc.common.tileentity.Adapter adapter = (li.cil.oc.common.tileentity.Adapter)tileEntity;
/*    */       Tuple3 tuple3 = new Tuple3(BoxesRunTime.boxToInteger(tileX - x), BoxesRunTime.boxToInteger(tileY - y), BoxesRunTime.boxToInteger(tileZ - z));
/*    */       if (tuple3 != null) {
/*    */         int dx = BoxesRunTime.unboxToInt(tuple3._1()), dy = BoxesRunTime.unboxToInt(tuple3._2()), dz = BoxesRunTime.unboxToInt(tuple3._3());
/*    */         Tuple3 tuple32 = new Tuple3(BoxesRunTime.boxToInteger(dx), BoxesRunTime.boxToInteger(dy), BoxesRunTime.boxToInteger(dz)), tuple31 = tuple32;
/*    */         int i = BoxesRunTime.unboxToInt(tuple31._1()), j = BoxesRunTime.unboxToInt(tuple31._2()), k = BoxesRunTime.unboxToInt(tuple31._3());
/*    */         int index = 3 + i + j + j + k + k + k;
/*    */         adapter.neighborChanged(sides()[index]);
/*    */         BoxedUnit boxedUnit1 = (index >= 0 && index < (sides()).length) ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*    */       } 
/*    */       throw new MatchError(tuple3);
/*    */     } 
/*    */     BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */   }
/*    */   
/*    */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/*    */     boolean bool;
/*    */     ForgeDirection sideToToggle = player.func_70093_af() ? side.getOpposite() : side;
/*    */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/*    */     if (tileEntity instanceof li.cil.oc.common.tileentity.Adapter) {
/*    */       li.cil.oc.common.tileentity.Adapter adapter = (li.cil.oc.common.tileentity.Adapter)tileEntity;
/*    */       if (!world.field_72995_K) {
/*    */         boolean oldValue = adapter.openSides()[sideToToggle.ordinal()];
/*    */         adapter.setSideOpen(sideToToggle, !oldValue);
/*    */       } 
/*    */       bool = true;
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     return Wrench$.MODULE$.holdsApplicableWrench(player, BlockPosition$.MODULE$.apply(x, y, z)) ? bool : GUI.class.onBlockActivated(this, world, x, y, z, player, side, hitX, hitY, hitZ);
/*    */   }
/*    */   
/*    */   private ForgeDirection[] sides() {
/*    */     return this.sides;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Adapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */