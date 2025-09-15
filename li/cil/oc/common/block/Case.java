/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import java.util.List;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.common.block.traits.PowerAcceptor;
/*    */ import li.cil.oc.common.block.traits.StateAware;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.IIcon;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\t5b\001B\001\003\0015\021AaQ1tK*\0211\001B\001\006E2|7m\033\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M)\001A\004\n\0317A\021q\002E\007\002\005%\021\021C\001\002\016%\026$7\017^8oK\006;\030M]3\021\005M1R\"\001\013\013\005U\021\021A\002;sC&$8/\003\002\030)\ti\001k\\<fe\006\0337-\0329u_J\004\"aE\r\n\005i!\"AC*uCR,\027i^1sKB\0211\003H\005\003;Q\0211aR+J\021!y\002A!b\001\n\003\001\023\001\002;jKJ,\022!\t\t\003E\025j\021a\t\006\002I\005)1oY1mC&\021ae\t\002\004\023:$\b\002\003\025\001\005\003\005\013\021B\021\002\013QLWM\035\021\t\013)\002A\021A\026\002\rqJg.\033;?)\taS\006\005\002\020\001!)q$\013a\001C!9q\006\001b\001\n\023\001\024aB5d_:\034xJ\\\013\002cA\031!E\r\033\n\005M\032#!B!se\006L\bCA\033=\033\0051$BA\0349\003\021)H/\0337\013\005eR\024!C7j]\026\034'/\0314u\025\005Y\024a\0018fi&\021QH\016\002\006\023&\033wN\034\005\007\001\001\013\021B\031\002\021%\034wN\\:P]\002BQ!\021\001\005R\t\013abY;ti>lG+\032=ukJ,7/F\001D!\r\021#\007\022\t\004E\025;\025B\001$$\005\031y\005\017^5p]B\021\001j\023\b\003E%K!AS\022\002\rA\023X\rZ3g\023\taUJ\001\004TiJLgn\032\006\003\025\016BQa\024\001\005BA\013!C]3hSN$XM\035\"m_\016\\\027jY8ogR\021\021\013\026\t\003EIK!aU\022\003\tUs\027\016\036\005\006+:\003\rAV\001\rS\016|gNU3hSN$XM\035\t\003/zk\021\001\027\006\0033j\013q\001^3yiV\024XM\003\002\\9\006A!/\0328eKJ,'O\003\002^q\00511\r\\5f]RL!a\030-\003\033%K5m\0348SK\036L7\017^3s\021\025\t\007\001\"\021c\003\0359W\r^%d_:$r\001N2kY:\004(\020C\003eA\002\007Q-A\003x_JdG\r\005\002gQ6\tqM\003\002eq%\021\021n\032\002\r\023\ncwnY6BG\016,7o\035\005\006W\002\004\r!I\001\002q\")Q\016\031a\001C\005\t\021\020C\003pA\002\007\021%A\001{\021\025\t\b\r1\001s\003%9xN\0357e'&$W\r\005\002tq6\tAO\003\0028k*\021QA\036\006\003oj\na\"\\5oK\016\024\030M\032;g_J<W-\003\002zi\nqai\034:hK\022K'/Z2uS>t\007\"B>a\001\004\021\030!\0037pG\006d7+\0333f\021\025i\b\001\"\021\00399W\r\036*f]\022,'oQ8m_J$\"!I@\t\r\005\005A\0201\001\"\003!iW\r^1eCR\f\007f\002?\002\006\005u\021q\004\t\005\003\017\tI\"\004\002\002\n)!\0211BA\007\003)\021X\r\\1v]\016DWM\035\006\005\003\037\t\t\"A\002g[2TA!a\005\002\026\005!Qn\0343t\025\t\t9\"A\002da^LA!a\007\002\n\tA1+\0333f\037:d\0270A\003wC2,X\r\n\002\002\"%!\0211EA\023\003\031\031E*S#O)*!\021qEA\005\003\021\031\026\016Z3\t\017\005-\002\001\"\021\002.\0051!/\031:jif$B!a\f\002<A!\021\021GA\034\033\t\t\031DC\002\0026a\nA!\033;f[&!\021\021HA\032\005))e.^7SCJLG/\037\005\t\003{\tI\0031\001\002@\005)1\017^1dWB!\021\021GA!\023\021\t\031%a\r\003\023%#X-\\*uC\016\\\007bBA$\001\021E\023\021J\001\fi>|G\016^5q\005>$\027\020F\006R\003\027\ni%a\024\002b\005M\004bBA\001\003\013\002\r!\t\005\t\003{\t)\0051\001\002@!A\021\021KA#\001\004\t\031&\001\004qY\006LXM\035\t\005\003+\ni&\004\002\002X)!\021\021KA-\025\r\tY\006O\001\007K:$\030\016^=\n\t\005}\023q\013\002\r\013:$\030\016^=QY\006LXM\035\005\t\003G\n)\0051\001\002f\0059Ao\\8mi&\004\b#BA4\003_:UBAA5\025\r9\0241\016\006\003\003[\nAA[1wC&!\021\021OA5\005\021a\025n\035;\t\021\005U\024Q\ta\001\003o\n\001\"\0313wC:\034W\r\032\t\004E\005e\024bAA>G\t9!i\\8mK\006t\007bBA@\001\021%\021\021Q\001\006g2|Go]\013\003\003\007\003B!!\"\002\f6\021\021q\021\006\005\003\023\013Y'\001\003mC:<\027b\001'\002\b\"9\021q\022\001\005B\005E\025\001E3oKJ<\027\020\0265s_V<\007\016];u+\t\t\031\nE\002#\003+K1!a&$\005\031!u.\0362mK\"9\0211\024\001\005B\005u\025aB4vSRK\b/Z\013\003\003?\023b!!)\002.\006MfABAR\001\001\tyJ\001\007=e\0264\027N\\3nK:$h(\003\003\002(\006%\026!B\"bg\026\004#bAAV\t\0059q)^5UsB,\007c\001\022\0020&\031\021\021W\022\003\r\005s\027PU3g!\021\t),a/\017\t\005]\026\021X\007\002\t%\031\0211\026\003\n\t\005u\026\021\026\002\b\013:,XNV1m\021!\t\t-!)\005\002\005\r\027aB:vERK\b/Z\013\003\003\013\024b!a2\002.\006EgABAR\001\001\t)-\003\003\002L\0065\027A\002\"m_\016\\\007E\003\003\002P\006%\026\001C\"bi\026<wN]=\021\t\005M\027q\033\b\005\003k\013).\003\003\002P\006%\026\002BA_\003\033Dq!a7\001\t\003\ni.\001\tde\026\fG/\032+jY\026,e\016^5usR1\021q\\Au\003c\004B!!9\002h6\021\0211\035\006\004\003K$\021A\003;jY\026,g\016^5us&\031\021!a9\t\017\021\fI\0161\001\002lB\031a-!<\n\007\005=xMA\003X_JdG\rC\004\002\002\005e\007\031A\021\t\017\005U\b\001\"\021\002x\006\001rN\034\"m_\016\\\027i\031;jm\006$X\r\032\013\025\003o\nI0a?\002~\006}(\021\001B\002\005\017\021\tB!\006\t\017\021\f\031\0201\001\002l\"11.a=A\002\005Ba!\\Az\001\004\t\003BB8\002t\002\007\021\005\003\005\002R\005M\b\031AA*\021\035\021)!a=A\002I\fAa]5eK\"A!\021BAz\001\004\021Y!\001\003iSRD\006c\001\022\003\016%\031!qB\022\003\013\031cw.\031;\t\021\tM\0211\037a\001\005\027\tA\001[5u3\"A!qCAz\001\004\021Y!\001\003iSRT\006b\002B\016\001\021\005#QD\001\020e\026lwN^3e\005f\004F.Y=feRq\021q\017B\020\005C\021\031C!\n\003(\t%\002b\0023\003\032\001\007\0211\036\005\t\003#\022I\0021\001\002T!11N!\007A\002\005Ba!\034B\r\001\004\t\003BB8\003\032\001\007\021\005\003\005\003,\te\001\031AA<\003-9\030\016\0347ICJ4Xm\035;")
/*    */ public class Case extends RedstoneAware implements PowerAcceptor, StateAware, GUI {
/*    */   private final int tier;
/*    */   
/* 21 */   public boolean func_149740_M() { return StateAware.class.hasComparatorInputOverride(this); } private final IIcon[] iconsOn; public int func_149736_g(World world, int x, int y, int z, int side) { return StateAware.class.getComparatorInputOverride(this, world, x, y, z, side); } public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { PowerAcceptor.class.tooltipTail(this, metadata, stack, player, tooltip, advanced); } public int tier() { return this.tier; } public Case(int tier) { PowerAcceptor.class.$init$(this); StateAware.class.$init$(this); GUI.class.$init$(this);
/* 22 */     this.iconsOn = new IIcon[6]; } private IIcon[] iconsOn() { return this.iconsOn; }
/*    */ 
/*    */   
/*    */   public Option<String>[] customTextures() {
/* 26 */     (new Option[6])[0] = 
/* 27 */       (Option)new Some("CaseTop");
/* 28 */     (new Option[6])[1] = (Option)new Some("CaseTop");
/* 29 */     (new Option[6])[2] = (Option)new Some("CaseBack");
/* 30 */     (new Option[6])[3] = (Option)new Some("CaseFront");
/* 31 */     (new Option[6])[4] = (Option)new Some("CaseSide");
/* 32 */     (new Option[6])[5] = (Option)new Some("CaseSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 36 */     super.func_149651_a(iconRegister);
/* 37 */     System.arraycopy(icons(), 0, iconsOn(), 0, (icons()).length);
/* 38 */     iconsOn()[ForgeDirection.NORTH.ordinal()] = iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":CaseBackOn").toString());
/* 39 */     iconsOn()[ForgeDirection.WEST.ordinal()] = iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":CaseSideOn").toString());
/* 40 */     iconsOn()[ForgeDirection.EAST.ordinal()] = iconsOn()[ForgeDirection.WEST.ordinal()];
/*    */   }
/*    */   public IIcon getIcon(IBlockAccess world, int x, int y, int z, ForgeDirection worldSide, ForgeDirection localSide) {
/*    */     boolean bool;
/* 44 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 45 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Case) { li.cil.oc.common.tileentity.Case case_ = (li.cil.oc.common.tileentity.Case)tileEntity; bool = case_.isRunning(); }
/* 46 */     else { bool = false; }
/* 47 */      return bool ? iconsOn()[localSide.ordinal()] : 
/* 48 */       func_149691_a(localSide.ordinal(), 0);
/*    */   }
/*    */   @SideOnly(Side.CLIENT)
/*    */   public int func_149741_i(int metadata) {
/* 52 */     return Color$.MODULE$.byTier()[tier()];
/*    */   }
/*    */   
/*    */   public EnumRarity rarity(ItemStack stack) {
/* 56 */     return Rarity$.MODULE$.byTier(tier());
/*    */   }
/*    */   public void tooltipBody(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/* 59 */     tooltip.addAll(Tooltip$.MODULE$.get(getClass().getSimpleName(), (Seq)Predef$.MODULE$.genericWrapArray(new Object[] { slots() })));
/*    */   }
/*    */   private String slots() {
/* 62 */     int i = tier(); switch (i) { default: case 2: case 3: case 1: case 0: break; }  return 
/* 63 */       "2/1/1";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public double energyThroughput() {
/* 71 */     return Settings$.MODULE$.get().caseRate()[tier()];
/*    */   } public GuiType.EnumVal guiType() {
/* 73 */     return GuiType$.MODULE$.Case();
/*    */   } public li.cil.oc.common.tileentity.Case createTileEntity(World world, int metadata) {
/* 75 */     return new li.cil.oc.common.tileentity.Case(tier());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/*    */     // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: invokevirtual func_70093_af : ()Z
/*    */     //   5: ifeq -> 99
/*    */     //   8: aload_1
/*    */     //   9: getfield field_72995_K : Z
/*    */     //   12: ifeq -> 21
/*    */     //   15: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   18: goto -> 94
/*    */     //   21: aload_1
/*    */     //   22: iload_2
/*    */     //   23: iload_3
/*    */     //   24: iload #4
/*    */     //   26: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*    */     //   29: astore #10
/*    */     //   31: aload #10
/*    */     //   33: instanceof li/cil/oc/common/tileentity/Case
/*    */     //   36: ifeq -> 87
/*    */     //   39: aload #10
/*    */     //   41: checkcast li/cil/oc/common/tileentity/Case
/*    */     //   44: astore #11
/*    */     //   46: aload #11
/*    */     //   48: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*    */     //   51: invokeinterface isRunning : ()Z
/*    */     //   56: ifne -> 87
/*    */     //   59: aload #11
/*    */     //   61: aload #5
/*    */     //   63: invokevirtual func_70300_a : (Lnet/minecraft/entity/player/EntityPlayer;)Z
/*    */     //   66: ifeq -> 87
/*    */     //   69: aload #11
/*    */     //   71: invokevirtual machine : ()Lli/cil/oc/api/machine/Machine;
/*    */     //   74: invokeinterface start : ()Z
/*    */     //   79: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   82: astore #12
/*    */     //   84: goto -> 92
/*    */     //   87: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */     //   90: astore #12
/*    */     //   92: aload #12
/*    */     //   94: pop
/*    */     //   95: iconst_1
/*    */     //   96: goto -> 118
/*    */     //   99: aload_0
/*    */     //   100: aload_1
/*    */     //   101: iload_2
/*    */     //   102: iload_3
/*    */     //   103: iload #4
/*    */     //   105: aload #5
/*    */     //   107: aload #6
/*    */     //   109: fload #7
/*    */     //   111: fload #8
/*    */     //   113: fload #9
/*    */     //   115: invokestatic onBlockActivated : (Lli/cil/oc/common/block/traits/GUI;Lnet/minecraft/world/World;IIILnet/minecraft/entity/player/EntityPlayer;Lnet/minecraftforge/common/util/ForgeDirection;FFF)Z
/*    */     //   118: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #81	-> 0
/*    */     //   #82	-> 8
/*    */     //   #83	-> 31
/*    */     //   #84	-> 87
/*    */     //   #82	-> 92
/*    */     //   #86	-> 95
/*    */     //   #88	-> 99
/*    */     //   #81	-> 118
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	119	0	this	Lli/cil/oc/common/block/Case;
/*    */     //   0	119	1	world	Lnet/minecraft/world/World;
/*    */     //   0	119	2	x	I
/*    */     //   0	119	3	y	I
/*    */     //   0	119	4	z	I
/*    */     //   0	119	5	player	Lnet/minecraft/entity/player/EntityPlayer;
/*    */     //   0	119	6	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     //   0	119	7	hitX	F
/*    */     //   0	119	8	hitY	F
/*    */     //   0	119	9	hitZ	F
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z, boolean willHarvest) {
/*    */     boolean bool;
/* 92 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 93 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Case) { li.cil.oc.common.tileentity.Case case_ = (li.cil.oc.common.tileentity.Case)tileEntity;
/* 94 */       bool = (case_.isCreative() && (!player.field_71075_bZ.field_75098_d || !case_.canInteract(player.func_70005_c_()))) ? false : (
/* 95 */         (case_.canInteract(player.func_70005_c_()) && super.removedByPlayer(world, player, x, y, z, willHarvest))); }
/* 96 */     else { bool = super.removedByPlayer(world, player, x, y, z, willHarvest); }
/*    */     
/*    */     return bool;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Case.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */