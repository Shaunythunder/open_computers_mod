/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import li.cil.oc.common.item.data.RaidData;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\035e\001B\001\003\0015\021AAU1jI*\0211\001B\001\006E2|7m\033\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M!\001A\004\n\031!\ty\001#D\001\003\023\t\t\"AA\006TS6\004H.\032\"m_\016\\\007CA\n\027\033\005!\"BA\013\003\003\031!(/Y5ug&\021q\003\006\002\004\017VK\005cA\n\0327%\021!\004\006\002\f\007V\034Ho\\7Ee>\0048\017\005\002\035?5\tQD\003\002\037\t\005QA/\0337fK:$\030\016^=\n\005\005i\002\002C\021\001\005\013\007I1\003\022\002\017QLG.\032+bOV\t1\005E\002%Smi\021!\n\006\003M\035\nqA]3gY\026\034GOC\001)\003\025\0318-\0317b\023\tQSE\001\005DY\006\0348\017V1h\021!a\003A!A!\002\023\031\023\001\003;jY\026$\026m\032\021\t\0139\002A\021A\030\002\rqJg.\033;?)\005\001DCA\0313!\ty\001\001C\003\"[\001\0171\005C\0035\001\021ES'\001\bdkN$x.\034+fqR,(/Z:\026\003Y\0022a\016\035;\033\0059\023BA\035(\005\025\t%O]1z!\r94(P\005\003y\035\022aa\0249uS>t\007C\001 B\035\t9t(\003\002AO\0051\001K]3eK\032L!AQ\"\003\rM#(/\0338h\025\t\001u\005C\003F\001\021Ec)A\006u_>dG/\0339UC&dGCB$K\037n#g\016\005\0028\021&\021\021j\n\002\005+:LG\017C\003L\t\002\007A*\001\005nKR\fG-\031;b!\t9T*\003\002OO\t\031\021J\034;\t\013A#\005\031A)\002\013M$\030mY6\021\005IKV\"A*\013\005Q+\026\001B5uK6T!AV,\002\0235Lg.Z2sC\032$(\"\001-\002\0079,G/\003\002['\nI\021\n^3n'R\f7m\033\005\0069\022\003\r!X\001\007a2\f\0270\032:\021\005y\023W\"A0\013\005q\003'BA1V\003\031)g\016^5us&\0211m\030\002\r\013:$\030\016^=QY\006LXM\035\005\006K\022\003\rAZ\001\bi>|G\016^5q!\r9G.P\007\002Q*\021\021N[\001\005kRLGNC\001l\003\021Q\027M^1\n\0055D'\001\002'jgRDQa\034#A\002A\f\001\"\0313wC:\034W\r\032\t\003oEL!A]\024\003\017\t{w\016\\3b]\")A\017\001C!k\0069q-^5UsB,W#\001<\023\t]l\030\021\001\004\005q\002\001aO\001\007=e\0264\027N\\3nK:$h(\003\002{w\006)!+Y5eA)\021A\020B\001\b\017VLG+\0379f!\t9d0\003\002\000O\t1\021I\\=SK\032\004B!a\001\002\n9!\021QAA\004\033\005!\021B\001?\005\023\r\tYa\037\002\b\013:,XNV1m\021\035\tya\036C\001\003#\tqa];c)f\004X-\006\002\002\024I)\021QC?\002 \031)\001\020\001\001\002\024%!\021\021DA\016\003\031\021En\\2lA)\031\021QD>\002\021\r\013G/Z4pef\004B!!\t\002&9!\0211AA\022\023\r\tib_\005\005\003\027\tY\002C\004\002*\001!\t%a\013\002\033!\f7\017V5mK\026sG/\033;z)\r\001\030Q\006\005\007\027\006\035\002\031\001'\t\017\005E\002\001\"\021\0024\005\0012M]3bi\026$\026\016\\3F]RLG/\037\013\0067\005U\0221\t\005\t\003o\ty\0031\001\002:\005)qo\034:mIB!\0211HA \033\t\tiDC\002\0028UKA!!\021\002>\t)qk\034:mI\"11*a\fA\0021Cq!a\022\001\t\003\nI%\001\016iCN\034u.\0349be\006$xN]%oaV$xJ^3se&$W\rF\001q\021\035\ti\005\001C!\003\037\n!dZ3u\007>l\007/\031:bi>\024\030J\0349vi>3XM\035:jI\026$2\002TA)\003'\n9&a\027\002`!A\021qGA&\001\004\tI\004C\004\002V\005-\003\031\001'\002\003aDq!!\027\002L\001\007A*A\001z\021\035\ti&a\023A\0021\013\021A\037\005\b\003C\nY\0051\001M\003\021\031\030\016Z3\t\017\005\025\004\001\"\025\002h\005aAm\\\"vgR|W.\0238jiR9q)!\033\002n\005]\004bBA6\003G\002\raG\001\013i&dW-\0228uSRL\bb\002/\002d\001\007\021q\016\t\005\003c\n\031(D\001a\023\r\t)\b\031\002\021\013:$\030\016^=MSZLgn\032\"bg\026Da\001UA2\001\004\t\006bBA>\001\021E\023QP\001\016I>\034Uo\035;p[\022\023x\016]:\025\017\035\013y(!!\002\004\"9\0211NA=\001\004Y\002B\002/\002z\001\007Q\fC\004\002\006\006e\004\031\0019\002\027]LG\016\034%beZ,7\017\036")
/*    */ public class Raid implements GUI, CustomDrops<Raid> {
/*    */   private final ClassTag<Raid> tileTag;
/*    */   
/* 16 */   public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) { return CustomDrops.class.getDrops(this, world, x, y, z, metadata, fortune); } public void func_149725_f(World world, int x, int y, int z, int metadata) { CustomDrops.class.onBlockPreDestroy(this, world, x, y, z, metadata); } public boolean removedByPlayer(World world, EntityPlayer player, int x, int y, int z, boolean willHarvest) { return CustomDrops.class.removedByPlayer(this, world, player, x, y, z, willHarvest); } public void func_149689_a(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) { CustomDrops.class.onBlockPlacedBy(this, world, x, y, z, player, stack); } public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) { return GUI.class.onBlockActivated(this, world, x, y, z, player, side, hitX, hitY, hitZ); } public ClassTag<Raid> tileTag() { return this.tileTag; } public Raid(ClassTag<Raid> tileTag) { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); GUI.class.$init$(this); CustomDrops.class.$init$(this); } public Option<String>[] customTextures() {
/* 17 */     (new Option[6])[0] = 
/* 18 */       (Option)None$.MODULE$;
/* 19 */     (new Option[6])[1] = (Option)None$.MODULE$;
/* 20 */     (new Option[6])[2] = (Option)new Some("RaidSide");
/* 21 */     (new Option[6])[3] = (Option)new Some("RaidFront");
/* 22 */     (new Option[6])[4] = (Option)new Some("RaidSide");
/* 23 */     (new Option[6])[5] = (Option)new Some("RaidSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   
/*    */   public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced)
/*    */   {
/* 29 */     super.tooltipTail(metadata, stack, player, tooltip, advanced);
/* 30 */     if (KeyBindings$.MODULE$.showExtendedTooltips())
/* 31 */     { RaidData data = new RaidData(stack);
/* 32 */       Predef$.MODULE$.refArrayOps((Object[])data.disks()).withFilter((Function1)new Raid$$anonfun$tooltipTail$1(this)).foreach((Function1)new Raid$$anonfun$tooltipTail$2(this, tooltip)); }  } public final class Raid$$anonfun$tooltipTail$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ItemStack disk) { return !(disk == null); } public Raid$$anonfun$tooltipTail$1(Raid $outer) {} } public final class Raid$$anonfun$tooltipTail$2 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final List tooltip$1; public Raid$$anonfun$tooltipTail$2(Raid $outer, List tooltip$1) {} public final boolean apply(ItemStack disk) {
/* 33 */       return this.tooltip$1.add((new StringBuilder()).append("- ").append(disk.func_82833_r()).toString());
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public GuiType.EnumVal guiType() {
/* 40 */     return GuiType$.MODULE$.Raid();
/*    */   } public boolean hasTileEntity(int metadata) {
/* 42 */     return true;
/*    */   } public Raid createTileEntity(World world, int metadata) {
/* 44 */     return new Raid();
/*    */   }
/*    */   
/*    */   public boolean func_149740_M() {
/* 48 */     return true;
/*    */   }
/*    */   public int func_149736_g(World world, int x, int y, int z, int side) { boolean bool;
/* 51 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 52 */     Raid raid = (Raid)tileEntity; if (tileEntity instanceof Raid && Predef$.MODULE$.booleanArrayOps(raid.presence()).forall((Function1)new Raid$$anonfun$getComparatorInputOverride$1(this))) { bool = true; }
/* 53 */     else { bool = false; }
/*    */     
/*    */     return bool; } public final class Raid$$anonfun$getComparatorInputOverride$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(boolean ok) { return ok; } public Raid$$anonfun$getComparatorInputOverride$1(Raid $outer) {} }
/* 57 */   public void doCustomInit(Raid tileEntity, EntityLivingBase player, ItemStack stack) { CustomDrops.class.doCustomInit(this, (TileEntity)tileEntity, player, stack);
/* 58 */     if (!(tileEntity.world()).field_72995_K)
/* 59 */     { RaidData data = new RaidData(stack); RichInt$.MODULE$
/* 60 */         .until$extension0(Predef$.MODULE$.intWrapper(0), package$.MODULE$.min((data.disks()).length, tileEntity.func_70302_i_())).foreach$mVc$sp((Function1)new Raid$$anonfun$doCustomInit$1(this, tileEntity, data));
/*    */ 
/*    */       
/* 63 */       data.label().foreach((Function1)new Raid$$anonfun$doCustomInit$2(this, tileEntity));
/* 64 */       if (!data.filesystem().func_82582_d())
/* 65 */       { tileEntity.tryCreateRaid(data.filesystem().func_74775_l("node").func_74779_i("address"));
/* 66 */         tileEntity.filesystem().foreach((Function1)new Raid$$anonfun$doCustomInit$3(this, data)); }  }  } public final class Raid$$anonfun$doCustomInit$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final Raid tileEntity$1; private final RaidData data$1; public final void apply(int i) { apply$mcVI$sp(i); } public Raid$$anonfun$doCustomInit$1(Raid $outer, Raid tileEntity$1, RaidData data$1) {} public void apply$mcVI$sp(int i) { this.tileEntity$1.func_70299_a(i, this.data$1.disks()[i]); } } public final class Raid$$anonfun$doCustomInit$2 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Raid tileEntity$1; public final void apply(String value) { this.tileEntity$1.label().setLabel(value); } public Raid$$anonfun$doCustomInit$2(Raid $outer, Raid tileEntity$1) {} } public final class Raid$$anonfun$doCustomInit$3 extends AbstractFunction1<FileSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(FileSystem x$1) { x$1.load(this.data$1.filesystem()); }
/*    */     
/*    */     private final RaidData data$1;
/*    */     public Raid$$anonfun$doCustomInit$3(Raid $outer, RaidData data$1) {} }
/*    */   
/*    */   public void doCustomDrops(Raid tileEntity, EntityPlayer player, boolean willHarvest) {
/* 72 */     CustomDrops.class.doCustomDrops(this, (TileEntity)tileEntity, player, willHarvest);
/* 73 */     ItemStack stack = createItemStack(createItemStack$default$1());
/* 74 */     if (Predef$.MODULE$.refArrayOps((Object[])tileEntity.items()).exists((Function1)new Raid$$anonfun$doCustomDrops$1(this))) {
/* 75 */       RaidData data = new RaidData();
/* 76 */       data.disks_$eq((ItemStack[])Predef$.MODULE$.refArrayOps((Object[])tileEntity.items()).map((Function1)new Raid$$anonfun$doCustomDrops$2(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(ItemStack.class))));
/* 77 */       tileEntity.filesystem().foreach((Function1)new Raid$$anonfun$doCustomDrops$3(this, data));
/* 78 */       data.label_$eq(Option$.MODULE$.apply(tileEntity.label().getLabel()));
/* 79 */       data.save(stack);
/*    */     } 
/* 81 */     func_149642_a(tileEntity.world(), tileEntity.x(), tileEntity.y(), tileEntity.z(), stack);
/*    */   }
/*    */   
/*    */   public final class Raid$$anonfun$doCustomDrops$1 extends AbstractFunction1<Option<ItemStack>, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(Option x$2) {
/*    */       return x$2.isDefined();
/*    */     }
/*    */     
/*    */     public Raid$$anonfun$doCustomDrops$1(Raid $outer) {}
/*    */   }
/*    */   
/*    */   public final class Raid$$anonfun$doCustomDrops$2 extends AbstractFunction1<Option<ItemStack>, ItemStack> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final ItemStack apply(Option x$3) {
/*    */       return (ItemStack)x$3.orNull(Predef$.MODULE$.$conforms());
/*    */     }
/*    */     
/*    */     public Raid$$anonfun$doCustomDrops$2(Raid $outer) {}
/*    */   }
/*    */   
/*    */   public final class Raid$$anonfun$doCustomDrops$3 extends AbstractFunction1<FileSystem, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final RaidData data$2;
/*    */     
/*    */     public final void apply(FileSystem x$4) {
/*    */       x$4.save(this.data$2.filesystem());
/*    */     }
/*    */     
/*    */     public Raid$$anonfun$doCustomDrops$3(Raid $outer, RaidData data$2) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Raid.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */