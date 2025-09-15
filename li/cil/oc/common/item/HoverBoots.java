/*     */ package li.cil.oc.common.item;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.client.Textures$HoverBoots$;
/*     */ import li.cil.oc.client.renderer.item.HoverBootRenderer$;
/*     */ import li.cil.oc.common.item.data.HoverBootsData;
/*     */ import li.cil.oc.common.item.traits.Chargeable;
/*     */ import li.cil.oc.common.item.traits.SimpleItem;
/*     */ import li.cil.oc.util.ItemColorizer$;
/*     */ import net.minecraft.client.model.ModelBiped;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemArmor;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.WeightedRandomChestContent;
/*     */ import net.minecraft.world.World;
/*     */ import scala.math.package$;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005Mg\001B\001\003\0015\021!\002S8wKJ\024un\034;t\025\t\031A!\001\003ji\026l'BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\t\001qq#\b\t\003\037Ui\021\001\005\006\003\007EQ!AE\n\002\0235Lg.Z2sC\032$(\"\001\013\002\0079,G/\003\002\027!\tI\021\n^3n\003JlwN\035\t\0031mi\021!\007\006\0035\t\ta\001\036:bSR\034\030B\001\017\032\005)\031\026.\0349mK&#X-\034\t\0031yI!aH\r\003\025\rC\027M]4fC\ndW\rC\003\"\001\021\005!%\001\004=S:LGO\020\013\002GA\021A\005A\007\002\005!)a\005\001C!O\005Iq-\032;SCJLG/\037\013\003Q-\002\"aD\025\n\005)\002\"AC#ok6\024\026M]5us\")A&\na\001[\005)1\017^1dWB\021qBL\005\003_A\021\021\"\023;f[N#\030mY6\t\013E\002A\021\t\032\002\0235\f\007p\0215be\036,GCA\032:!\t!t'D\0016\025\0051\024!B:dC2\f\027B\001\0356\005\031!u.\0362mK\")A\006\ra\001[!)1\b\001C!y\005Iq-\032;DQ\006\024x-\032\013\003guBQ\001\f\036A\0025BQa\020\001\005B\001\013\021b]3u\007\"\f'oZ3\025\007\005#U\t\005\0025\005&\0211)\016\002\005+:LG\017C\003-}\001\007Q\006C\003G}\001\0071'\001\004b[>,h\016\036\005\006\021\002!\t%S\001\nG\006t7\t[1sO\026$\"AS'\021\005QZ\025B\001'6\005\035\021un\0347fC:DQ\001L$A\0025BQa\024\001\005BA\013aa\0315be\036,G\003B\032R%NCQ\001\f(A\0025BQA\022(A\002MBQ\001\026(A\002)\013\001b]5nk2\fG/\032\005\006-\002!\teV\001\016O\026$\030I]7pe6{G-\0327\025\ta\003\007N\033\t\0033zk\021A\027\006\0037r\013Q!\\8eK2T!!X\t\002\r\rd\027.\0328u\023\ty&L\001\006N_\022,GNQ5qK\022DQ!Y+A\002\t\fA\"\0328uSRLH*\033<j]\036\004\"a\0314\016\003\021T!!Z\t\002\r\025tG/\033;z\023\t9GM\001\tF]RLG/\037'jm&twMQ1tK\")\021.\026a\001[\005I\021\016^3n'R\f7m\033\005\006WV\003\r\001\\\001\nCJlwN]*m_R\004\"\001N7\n\0059,$aA%oi\"\"Q\013\035?~!\t\t(0D\001s\025\t\031H/\001\006sK2\fWO\\2iKJT!!\036<\002\007\031lGN\003\002xq\006!Qn\0343t\025\005I\030aA2qo&\0211P\035\002\t'&$Wm\0248ms\006)a/\0317vK\022\na0C\002\000\003\003\taa\021'J\013:#&bAA\002e\006!1+\0333f\021\035\t9\001\001C!\003\023\tqbZ3u\003JlwN\035+fqR,(/\032\013\013\003\027\tI\"a\007\002$\005\035\002\003BA\007\003'q1\001NA\b\023\r\t\t\"N\001\007!J,G-\0324\n\t\005U\021q\003\002\007'R\024\030N\\4\013\007\005EQ\007\003\004-\003\013\001\r!\f\005\bK\006\025\001\031AA\017!\r\031\027qD\005\004\003C!'AB#oi&$\030\020C\004\002&\005\025\001\031\0017\002\tMdw\016\036\005\t\003S\t)\0011\001\002\f\00591/\0362UsB,\007bBA\027\001\021\005\023qF\001\f_:\f%/\\8s)&\0347\016F\004B\003c\ty$!\024\t\021\005M\0221\006a\001\003k\tQa^8sY\022\004B!a\016\002<5\021\021\021\b\006\004\003g\t\022\002BA\037\003s\021QaV8sY\022D\001\"!\021\002,\001\007\0211I\001\007a2\f\0270\032:\021\t\005\025\023\021J\007\003\003\017R1!!\021e\023\021\tY%a\022\003\031\025sG/\033;z!2\f\0270\032:\t\r1\nY\0031\001.\021\035\t\t\006\001C!\003'\n!c\0348F]RLG/_%uK6,\006\017Z1uKR\031!*!\026\t\017\025\fy\0051\001\002XA!\021\021LA/\033\t\tYF\003\002\004I&!\021qLA.\005))e\016^5us&#X-\034\005\b\003G\002A\021IA3\0035\021XmZ5ti\026\024\030jY8ogR\031\021)a\032\t\021\005%\024\021\ra\001\003W\n!!\033:\021\t\0055\024qO\007\003\003_RA!!\035\002t\0059A/\032=ukJ,'bAA;9\006A!/\0328eKJ,'/\003\003\002z\005=$!D%JG>t'+Z4jgR,'\017K\003\002bAdX\020C\004\002\000\001!\t%!!\0029I,\027/^5sKNlU\017\034;ja2,'+\0328eKJ\004\026m]:fgR\t!\nK\003\002~AdX\020C\004\002\b\002!\t%!#\002=\035,G/S2p]\032\023x.\034#b[\006<WMR8s%\026tG-\032:QCN\034HCBAF\003/\013Y\n\005\003\002\016\006MUBAAH\025\r\t\t*E\001\005kRLG.\003\003\002\026\006=%!B%JG>t\007bBAM\003\013\003\r\001\\\001\005[\026$\030\rC\004\002\036\006\025\005\031\0017\002\tA\f7o\035\025\006\003\013\003H0 \005\b\003G\003A\021IAS\003U9W\r^\"pY>\024hI]8n\023R,Wn\025;bG.$R\001\\AT\003SCa![AQ\001\004i\003bBAO\003C\003\r\001\034\005\b\003[\003A\021IAX\003A9W\r\036#jgBd\027-\037#b[\006<W\rF\002m\003cCa\001LAV\001\004i\003bBA[\001\021\005\023qW\001\rO\026$X*\031=EC6\fw-\032\013\004Y\006e\006B\002\027\0024\002\007Q\006C\004\002>\002!\t%a0\002\023%\034H)Y7bO\026$Gc\001&\002B\"1A&a/A\0025Bq!!2\001\t\003\n\t)\001\007jg\022\013W.Y4fC\ndW\rC\004\002J\002!\t%a3\002\023M,G\017R1nC\036,G#B!\002N\006=\007B\002\027\002H\002\007Q\006C\004\002R\006\035\007\031\0017\002\r\021\fW.Y4f\001")
/*     */ public class HoverBoots extends ItemArmor implements SimpleItem, Chargeable {
/*  26 */   public double getAECurrentPower(ItemStack stack) { return Chargeable.class.getAECurrentPower(this, stack); } public double getAEMaxPower(ItemStack stack) { return Chargeable.class.getAEMaxPower(this, stack); } public double injectAEPower(ItemStack stack, double value) { return Chargeable.class.injectAEPower(this, stack, value); } public double extractAEPower(ItemStack stack, double value) { return Chargeable.class.extractAEPower(this, stack, value); } @Method(modid = "appliedenergistics2") public AccessRestriction getPowerFlow(ItemStack stack) { return Chargeable.class.getPowerFlow(this, stack); } @Method(modid = "IC2") public IElectricItemManager getManager(ItemStack stack) { return Chargeable.class.getManager(this, stack); } public double getMaxCharge(ItemStack stack) { return Chargeable.class.getMaxCharge(this, stack); } public double getTransferLimit(ItemStack stack) { return Chargeable.class.getTransferLimit(this, stack); } public int getTier(ItemStack stack) { return Chargeable.class.getTier(this, stack); } public boolean canProvideEnergy(ItemStack stack) { return Chargeable.class.canProvideEnergy(this, stack); } public Item getEmptyItem(ItemStack stack) { return Chargeable.class.getEmptyItem(this, stack); } public Item getChargedItem(ItemStack stack) { return Chargeable.class.getChargedItem(this, stack); } public double getEnergy(ItemStack stack) { return Chargeable.class.getEnergy(this, stack); } public void setEnergy(ItemStack stack, double amount) { Chargeable.class.setEnergy(this, stack, amount); } public double getMaxEnergy(ItemStack stack) { return Chargeable.class.getMaxEnergy(this, stack); } public boolean canSend(ItemStack stack) { return Chargeable.class.canSend(this, stack); } public boolean canReceive(ItemStack stack) { return Chargeable.class.canReceive(this, stack); } public boolean isMetadataSpecific(ItemStack stack) { return Chargeable.class.isMetadataSpecific(this, stack); } public double getMaxTransfer(ItemStack stack) { return Chargeable.class.getMaxTransfer(this, stack); } public int getEnergyStored(ItemStack stack) { return Chargeable.class.getEnergyStored(this, stack); } public int getMaxEnergyStored(ItemStack stack) { return Chargeable.class.getMaxEnergyStored(this, stack); } public int receiveEnergy(ItemStack stack, int maxReceive, boolean simulate) { return Chargeable.class.receiveEnergy(this, stack, maxReceive, simulate); } public int extractEnergy(ItemStack stack, int maxExtract, boolean simulate) { return Chargeable.class.extractEnergy(this, stack, maxExtract, simulate); } public ItemStack createItemStack(int amount) { return SimpleItem.class.createItemStack(this, amount); } public boolean isBookEnchantable(ItemStack stack, ItemStack book) { return SimpleItem.class.isBookEnchantable(this, stack, book); } public WeightedRandomChestContent getChestGenBase(ChestGenHooks chest, Random rnd, WeightedRandomChestContent original) { return SimpleItem.class.getChestGenBase(this, chest, rnd, original); } public boolean doesSneakBypassUse(World world, int x, int y, int z, EntityPlayer player) { return SimpleItem.class.doesSneakBypassUse(this, world, x, y, z, player); } @SideOnly(Side.CLIENT) public void func_77624_a(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { SimpleItem.class.addInformation(this, stack, player, tooltip, advanced); } public int createItemStack$default$1() { return SimpleItem.class.createItemStack$default$1(this); } public HoverBoots() { super(ItemArmor.ArmorMaterial.DIAMOND, 0, 3); SimpleItem.class.$init$(this); Chargeable.class.$init$(this);
/*  27 */     setNoRepair(); }
/*     */    public EnumRarity func_77613_e(ItemStack stack) {
/*  29 */     return EnumRarity.uncommon;
/*     */   } public double maxCharge(ItemStack stack) {
/*  31 */     return Settings$.MODULE$.get().bufferHoverBoots();
/*     */   }
/*     */   public double getCharge(ItemStack stack) {
/*  34 */     return (new HoverBootsData(stack)).charge();
/*     */   }
/*     */   public void setCharge(ItemStack stack, double amount) {
/*  37 */     HoverBootsData data = new HoverBootsData(stack);
/*  38 */     data.charge_$eq(package$.MODULE$.min(maxCharge(stack), package$.MODULE$.max(0.0D, amount)));
/*  39 */     data.save(stack);
/*     */   }
/*     */   public boolean canCharge(ItemStack stack) {
/*  42 */     return true;
/*     */   }
/*     */   public double charge(ItemStack stack, double amount, boolean simulate) {
/*  45 */     HoverBootsData data = new HoverBootsData(stack);
/*     */     
/*  47 */     double remainder = package$.MODULE$.min(0.0D, data.charge() + amount);
/*  48 */     if (!simulate) {
/*  49 */       data.charge_$eq(package$.MODULE$.max(0.0D, data.charge() + amount));
/*  50 */       data.save(stack);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  55 */     double d1 = -package$.MODULE$.min(0.0D, Settings$.MODULE$.get().bufferHoverBoots() - data.charge() + amount);
/*  56 */     if (!simulate) {
/*  57 */       data.charge_$eq(package$.MODULE$.min(Settings$.MODULE$.get().bufferHoverBoots(), data.charge() + amount));
/*  58 */       data.save(stack);
/*     */     } 
/*  60 */     return (amount < false) ? remainder : d1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
/*  67 */     HoverBootRenderer$.MODULE$.lightColor_$eq(ItemColorizer$.MODULE$.hasColor(itemStack) ? ItemColorizer$.MODULE$.getColor(itemStack) : 6741333);
/*  68 */     return (armorSlot == this.field_77881_a) ? (ModelBiped)HoverBootRenderer$.MODULE$ : 
/*     */       
/*  70 */       super.getArmorModel(entityLiving, itemStack, armorSlot);
/*     */   }
/*     */   
/*     */   public String getArmorTexture(ItemStack stack, Entity entity, int slot, String subType) {
/*  74 */     return entity.field_70170_p.field_72995_K ? HoverBootRenderer$.MODULE$.texture().toString() : 
/*  75 */       null;
/*     */   }
/*     */   
/*     */   public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
/*  79 */     super.onArmorTick(world, player, stack);
/*  80 */     if (!Settings$.MODULE$.get().ignorePower() && player.func_70660_b(Potion.field_76421_d) == null && getCharge(stack) == false) {
/*  81 */       player.func_70690_d(new PotionEffect(Potion.field_76421_d.func_76396_c(), 20, 1));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onEntityItemUpdate(EntityItem entity) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnull -> 144
/*     */     //   4: aload_1
/*     */     //   5: getfield field_70170_p : Lnet/minecraft/world/World;
/*     */     //   8: ifnull -> 144
/*     */     //   11: aload_1
/*     */     //   12: getfield field_70170_p : Lnet/minecraft/world/World;
/*     */     //   15: getfield field_72995_K : Z
/*     */     //   18: ifne -> 144
/*     */     //   21: getstatic li/cil/oc/util/ItemColorizer$.MODULE$ : Lli/cil/oc/util/ItemColorizer$;
/*     */     //   24: aload_1
/*     */     //   25: invokevirtual func_92059_d : ()Lnet/minecraft/item/ItemStack;
/*     */     //   28: invokevirtual hasColor : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   31: ifeq -> 144
/*     */     //   34: aload_1
/*     */     //   35: getfield field_70165_t : D
/*     */     //   38: invokestatic func_76128_c : (D)I
/*     */     //   41: istore_2
/*     */     //   42: aload_1
/*     */     //   43: getfield field_70163_u : D
/*     */     //   46: invokestatic func_76128_c : (D)I
/*     */     //   49: istore_3
/*     */     //   50: aload_1
/*     */     //   51: getfield field_70161_v : D
/*     */     //   54: invokestatic func_76128_c : (D)I
/*     */     //   57: istore #4
/*     */     //   59: aload_1
/*     */     //   60: getfield field_70170_p : Lnet/minecraft/world/World;
/*     */     //   63: iload_2
/*     */     //   64: iload_3
/*     */     //   65: iload #4
/*     */     //   67: invokevirtual func_147439_a : (III)Lnet/minecraft/block/Block;
/*     */     //   70: getstatic net/minecraft/init/Blocks.field_150383_bp : Lnet/minecraft/block/BlockCauldron;
/*     */     //   73: astore #5
/*     */     //   75: dup
/*     */     //   76: ifnonnull -> 88
/*     */     //   79: pop
/*     */     //   80: aload #5
/*     */     //   82: ifnull -> 96
/*     */     //   85: goto -> 144
/*     */     //   88: aload #5
/*     */     //   90: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   93: ifeq -> 144
/*     */     //   96: aload_1
/*     */     //   97: getfield field_70170_p : Lnet/minecraft/world/World;
/*     */     //   100: iload_2
/*     */     //   101: iload_3
/*     */     //   102: iload #4
/*     */     //   104: invokevirtual func_72805_g : (III)I
/*     */     //   107: istore #6
/*     */     //   109: iload #6
/*     */     //   111: iconst_0
/*     */     //   112: if_icmple -> 144
/*     */     //   115: getstatic li/cil/oc/util/ItemColorizer$.MODULE$ : Lli/cil/oc/util/ItemColorizer$;
/*     */     //   118: aload_1
/*     */     //   119: invokevirtual func_92059_d : ()Lnet/minecraft/item/ItemStack;
/*     */     //   122: invokevirtual removeColor : (Lnet/minecraft/item/ItemStack;)V
/*     */     //   125: aload_1
/*     */     //   126: getfield field_70170_p : Lnet/minecraft/world/World;
/*     */     //   129: iload_2
/*     */     //   130: iload_3
/*     */     //   131: iload #4
/*     */     //   133: iload #6
/*     */     //   135: iconst_1
/*     */     //   136: isub
/*     */     //   137: iconst_3
/*     */     //   138: invokevirtual func_72921_c : (IIIII)Z
/*     */     //   141: pop
/*     */     //   142: iconst_1
/*     */     //   143: ireturn
/*     */     //   144: aload_0
/*     */     //   145: aload_1
/*     */     //   146: invokespecial onEntityItemUpdate : (Lnet/minecraft/entity/item/EntityItem;)Z
/*     */     //   149: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #86	-> 0
/*     */     //   #87	-> 34
/*     */     //   #88	-> 42
/*     */     //   #89	-> 50
/*     */     //   #90	-> 59
/*     */     //   #91	-> 96
/*     */     //   #92	-> 109
/*     */     //   #93	-> 115
/*     */     //   #94	-> 125
/*     */     //   #95	-> 142
/*     */     //   #99	-> 144
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	150	0	this	Lli/cil/oc/common/item/HoverBoots;
/*     */     //   0	150	1	entity	Lnet/minecraft/entity/item/EntityItem;
/*     */     //   42	108	2	x	I
/*     */     //   50	100	3	y	I
/*     */     //   59	91	4	z	I
/*     */     //   109	41	6	meta	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void func_94581_a(IIconRegister ir) {
/* 104 */     ((Item)this).field_77791_bV = ir.func_94245_a(func_111208_A());
/* 105 */     Textures$HoverBoots$.MODULE$.lightOverlay_$eq(ir.func_94245_a((new StringBuilder()).append(func_111208_A()).append("Light").toString()));
/*     */   }
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean func_77623_v() {
/* 109 */     return true;
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public IIcon func_77618_c(int meta, int pass) {
/* 112 */     return (pass == 1) ? Textures$HoverBoots$.MODULE$.lightOverlay() : super.func_77618_c(meta, pass);
/*     */   }
/*     */   public int func_82790_a(ItemStack itemStack, int pass) {
/* 115 */     if (pass == 1) {
/* 116 */       return ItemColorizer$.MODULE$.hasColor(itemStack) ? ItemColorizer$.MODULE$.getColor(itemStack) : 6741333;
/*     */     }
/* 118 */     return super.func_82790_a(itemStack, pass);
/*     */   }
/*     */   
/*     */   public int getDisplayDamage(ItemStack stack) {
/* 122 */     HoverBootsData data = new HoverBootsData(stack);
/* 123 */     return (int)(Settings$.MODULE$.get().bufferHoverBoots() * (true - data.charge() / Settings$.MODULE$.get().bufferHoverBoots()));
/*     */   }
/*     */   public int getMaxDamage(ItemStack stack) {
/* 126 */     return (int)Settings$.MODULE$.get().bufferHoverBoots();
/*     */   }
/*     */   public boolean isDamaged(ItemStack stack) {
/* 129 */     return true;
/*     */   }
/*     */   public boolean func_77645_m() {
/* 132 */     return false;
/*     */   }
/*     */   
/*     */   public void setDamage(ItemStack stack, int damage) {
/* 136 */     charge(stack, -damage, false);
/*     */ 
/*     */     
/* 139 */     super.setDamage(stack, 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\HoverBoots.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */