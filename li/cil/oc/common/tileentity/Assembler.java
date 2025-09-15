/*     */ package li.cil.oc.common.tileentity;
/*     */ 
/*     */ import cpw.mods.fml.common.Optional.Method;
/*     */ import li.cil.oc.common.tileentity.traits.TileEntity;
/*     */ import li.cil.oc.common.tileentity.traits.power.IndustrialCraft2Classic;
/*     */ import li.cil.oc.common.tileentity.traits.power.IndustrialCraft2Experimental;
/*     */ import li.cil.oc.common.tileentity.traits.power.RotaryCraft;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t\035e\001B\001\003\0015\021\021\"Q:tK6\024G.\032:\013\005\r!\021A\003;jY\026,g\016^5us*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001a\005\005\001\035]i\002eI\026/!\tyQ#D\001\021\025\t\031\021C\003\002\023'\005IQ.\0338fGJ\fg\r\036\006\002)\005\031a.\032;\n\005Y\001\"A\003+jY\026,e\016^5usB\021\001dG\007\0023)\021!DA\001\007iJ\f\027\016^:\n\005qI\"aC#om&\024xN\\7f]R\004\"\001\007\020\n\005}I\"!\004)po\026\024\030iY2faR|'\017\005\002\031C%\021!%\007\002\n\023:4XM\034;pef\004\"\001J\025\016\003\025R!AJ\024\002\0179,Go^8sW*\021\001FB\001\004CBL\027B\001\026&\005A\031\026\016Z3e\013:4\030N]8o[\026tG\017\005\002\031Y%\021Q&\007\002\013'R\fG/Z!xCJ,\007CA\0303\033\005\001$BA\031(\003\031!'/\033<fe&\0211\007\r\002\013\t\0264\030nY3J]\032|\007\"B\033\001\t\0031\024A\002\037j]&$h\bF\0018!\tA\004!D\001\003\021\035Q\004A1A\005\002m\nAA\\8eKV\tA\b\005\002%{%\021a(\n\002\023\007>l\007o\0348f]R\034uN\0348fGR|'\017\003\004A\001\001\006I\001P\001\006]>$W\r\t\005\b\005\002\001\r\021\"\001D\003\031yW\017\0369viV\tA\tE\002F\021*k\021A\022\006\002\017\006)1oY1mC&\021\021J\022\002\007\037B$\030n\0348\021\005-sU\"\001'\013\0055\013\022\001B5uK6L!a\024'\003\023%#X-\\*uC\016\\\007bB)\001\001\004%\tAU\001\013_V$\b/\036;`I\025\fHCA*W!\t)E+\003\002V\r\n!QK\\5u\021\0359\006+!AA\002\021\0131\001\037\0232\021\031I\006\001)Q\005\t\0069q.\036;qkR\004\003bB.\001\001\004%\t\001X\001\024i>$\030\r\034*fcVL'/\0323F]\026\024x-_\013\002;B\021QIX\005\003?\032\023a\001R8vE2,\007bB1\001\001\004%\tAY\001\030i>$\030\r\034*fcVL'/\0323F]\026\024x-_0%KF$\"aU2\t\017]\003\027\021!a\001;\"1Q\r\001Q!\nu\013A\003^8uC2\024V-];je\026$WI\\3sOf\004\003bB4\001\001\004%\t\001X\001\017e\026\fX/\033:fI\026sWM]4z\021\035I\007\0011A\005\002)\f!C]3rk&\024X\rZ#oKJ<\027p\030\023fcR\0211k\033\005\b/\"\f\t\0211\001^\021\031i\007\001)Q\005;\006y!/Z9vSJ,G-\0228fe\036L\b\005\003\005p\001!\025\r\021\"\004q\003)!WM^5dK&sgm\\\013\002cB!!o^=z\033\005\031(B\001;v\003%IW.\\;uC\ndWM\003\002w\r\006Q1m\0347mK\016$\030n\0348\n\005a\034(aA'baB\021!p`\007\002w*\021A0`\001\005Y\006twMC\001\003\021Q\027M^1\n\007\005\0051P\001\004TiJLgn\032\005\n\003\013\001\001\022!Q!\016E\f1\002Z3wS\016,\027J\0344pA!9\021\021\002\001\005B\005-\021!D4fi\022+g/[2f\023:4w\016\006\002\002\016AA\021qBA\013\003/\t9\"\004\002\002\022)\031\0211C?\002\tU$\030\016\\\005\004q\006E\001\003BA\r\003?q1!RA\016\023\r\tiBR\001\007!J,G-\0324\n\t\005\005\021\021\005\006\004\003;1\005bBA\023\001\021\005\023qE\001\013G\006t7i\0348oK\016$H\003BA\025\003_\0012!RA\026\023\r\tiC\022\002\b\005>|G.Z1o\021!\t\t$a\tA\002\005M\022\001B:jI\026\004B!!\016\002@5\021\021q\007\006\005\003'\tIDC\002\006\003wQ1!!\020\024\0039i\027N\\3de\0064GOZ8sO\026LA!!\021\0028\tqai\034:hK\022K'/Z2uS>t\007\006CA\022\003\013\ni&a\030\021\t\005\035\023\021L\007\003\003\023RA!a\023\002N\005Q!/\0327bk:\034\007.\032:\013\t\005=\023\021K\001\004M6d'\002BA*\003+\nA!\\8eg*\021\021qK\001\004GB<\030\002BA.\003\023\022\001bU5eK>sG._\001\006m\006dW/\032\023\003\003CJA!a\031\002f\00511\tT%F\035RSA!a\032\002J\005!1+\0333f\021\035\tY\007\001C!\003[\n\021b]5eK\022tu\016Z3\025\t\005=\024Q\017\t\004I\005E\024bAA:K\t!aj\0343f\021!\t\t$!\033A\002\005M\002bBA=\001\021E\0231P\001\rQ\006\0348i\0348oK\016$xN\035\013\005\003S\ti\b\003\005\0022\005]\004\031AA\032Q!\t9(!\022\002^\005}\003bBAB\001\021E\023QQ\001\nG>tg.Z2u_J$B!a\"\002\020B!Q\tSAE!\r!\0231R\005\004\003\033+#!C\"p]:,7\r^8s\021!\t\t$!!A\002\005M\002BBAJ\001\021\005C,\001\tf]\026\024x-\037+ie>,x\r\0339vi\"9\021q\023\001\005B\005e\025aD4fi\016+(O]3oiN#\030\r^3\025\005\005m\005CBA\b\003;\013\t+\003\003\002 \006E!aB#ok6\034V\r\036\t\005\003G\013Y+\004\002\002&*!\021qUAU\003)\031F/\031;f\003^\f'/\032\006\004\003'9\023\002BAW\003K\023Qa\025;bi\026Dq!!-\001\t\003\t\031,A\006dC:\f5o]3nE2,WCAA\025\021\035\t9\f\001C\001\003g\013A\"[:BgN,WN\0317j]\036Da!a/\001\t\003a\026\001\0039s_\036\024Xm]:\t\017\005}\006\001\"\001\002B\006iA/[7f%\026l\027-\0338j]\036,\"!a1\021\007\025\013)-C\002\002H\032\0231!\0238u\021\035\tY\r\001C\001\003\033\fQa\035;beR$B!!\013\002P\"Q\021\021[Ae!\003\005\r!!\013\002#\031Lg.[:i\0236lW\rZ5bi\026d\027\020C\004\002V\002!\t!a6\002\rM$\030\r^;t)\031\tI.!:\002vB)Q)a7\002`&\031\021Q\034$\003\013\005\023(/Y=\021\007i\f\t/C\002\002dn\024aa\0242kK\016$\b\002CAt\003'\004\r!!;\002\017\r|g\016^3yiB!\0211^Ay\033\t\tiOC\002\002p\036\nq!\\1dQ&tW-\003\003\002t\0065(aB\"p]R,\007\020\036\005\t\003o\f\031\0161\001\002z\006!\021M]4t!\021\tY/a?\n\t\005u\030Q\036\002\n\003J<W/\\3oiND\003\"a5\003\002\t\035!\021\002\t\005\003W\024\031!\003\003\003\006\0055(\001C\"bY2\024\027mY6\002\007\021|7-\t\002\003\f\005\t9DZ;oGRLwN\034\025*u\001\032HO]5oO2\002c.^7cKJ\004sN\035\021c_>dW-\0318![5\002C\013[3!GV\024(/\0328uAM$\030\r^3!_\032\004C\017[3!CN\034X-\0342mKJd\003\005\0312vgf<\003e\034:!A&$G.Z\024-A\031|G\016\\8xK\022\004#-\037\021uQ\026\004\003O]8he\026\0348\017I8sAQ,W\016\0357bi\026\004c/\0317jI&$\030\020\f\021sKN\004Xm\031;jm\026d\027P\f\005\b\003\027\004A\021\001B\b)\031\tIN!\005\003\024!A\021q\035B\007\001\004\tI\017\003\005\002x\n5\001\031AA}Q!\021iA!\001\003\b\t]\021E\001B\r\003\0054WO\\2uS>t\007&\013\036c_>dW-\0318![5\0023\013^1si\002\n7o]3nE2Lgn\032\027!S\032\004\003o\\:tS\ndWM\f\021SKR,(O\\:!o\",G\017[3sA\005\0348/Z7cYf\004s/Y:!gR\f'\017^3eA=\024\bE\\8u]!9!Q\004\001\005B\t}\021!C2b]V\003H-\031;f)\t\tI\003C\004\003$\001!\tE!\n\002\031U\004H-\031;f\013:$\030\016^=\025\003MCqA!\013\001\t\003\022Y#\001\013sK\006$gI]8n\035\n#fi\034:TKJ4XM\035\013\004'\n5\002\002\003B\030\005O\001\rA!\r\002\0079\024G\017\005\003\0034\t]RB\001B\033\025\r\021y#E\005\005\005s\021)D\001\bO\005R#\026mZ\"p[B|WO\0343\t\017\tu\002\001\"\021\003@\005\031rO]5uKR{gJ\021+G_J\034VM\035<feR\0311K!\021\t\021\t=\"1\ba\001\005cAqA!\022\001\t\003\0229%\001\013sK\006$gI]8n\035\n#fi\034:DY&,g\016\036\013\004'\n%\003\002\003B\030\005\007\002\rA!\r)\021\t\r\023QIA/\003?BqAa\024\001\t\003\022\t&A\nxe&$X\rV8O\005R3uN]\"mS\026tG\017F\002T\005'B\001Ba\f\003N\001\007!\021\007\005\b\005/\002A\021\tB-\003A9W\r^*ju\026LeN^3oi>\024\030\020\006\002\002D\"9!Q\f\001\005B\te\023AF4fi&sg/\0328u_JL8\013^1dW2KW.\033;\t\017\t\005\004\001\"\021\003d\005\021\022n]%uK64\026\r\\5e\r>\0248\013\\8u)\031\tIC!\032\003j!A!q\rB0\001\004\t\031-\001\003tY>$\bb\002B6\005?\002\rAS\001\006gR\f7m\033\005\n\005_\002\021\023!C\001\005c\nqb\035;beR$C-\0324bk2$H%M\013\003\005gRC!!\013\003v-\022!q\017\t\005\005s\022\031)\004\002\003|)!!Q\020B@\003%)hn\0315fG.,GMC\002\003\002\032\013!\"\0318o_R\fG/[8o\023\021\021)Ia\037\003#Ut7\r[3dW\026$g+\031:jC:\034W\r")
/*     */ public class Assembler extends TileEntity implements Environment, PowerAcceptor, Inventory, SidedEnvironment, StateAware, DeviceInfo {
/*     */   private final ComponentConnector node;
/*     */   private Option<ItemStack> output;
/*     */   private double totalRequiredEnergy;
/*     */   private double requiredEnergy;
/*     */   private Map<String, String> deviceInfo;
/*     */   private final Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory;
/*     */   private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega;
/*     */   private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque;
/*     */   private long li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power;
/*     */   
/*     */   @Method(modid = "BuildCraft|Core")
/*  26 */   public boolean hasWork() { return StateAware.class.hasWork(this); } private int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha; private double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer; private double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer; private boolean addedToIC2PowerGrid; @Method(modid = "factorization") private final Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge; private Option<Object> li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node; private boolean isChangeScheduled; private boolean moving; private volatile byte bitmap$0; private Option[] li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x2) == 0) { this.li$cil$oc$common$tileentity$traits$Inventory$$inventory = (Option<ItemStack>[])Inventory.class.li$cil$oc$common$tileentity$traits$Inventory$$inventory(this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x2); }  return (Option[])this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; }  } public Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory() { return ((byte)(this.bitmap$0 & 0x2) == 0) ? (Option<ItemStack>[])li$cil$oc$common$tileentity$traits$Inventory$$inventory$lzycompute() : this.li$cil$oc$common$tileentity$traits$Inventory$$inventory; } public Option<ItemStack>[] items() { return (Option<ItemStack>[])Inventory.class.items(this); } public boolean func_70300_a(EntityPlayer player) { return Inventory.class.isUseableByPlayer(this, player); } public boolean dropSlot(int slot, int count, Option direction) { return Inventory.class.dropSlot(this, slot, count, direction); } public void dropAllSlots() { Inventory.class.dropAllSlots(this); } public EntityItem spawnStackInWorld(ItemStack stack, Option direction) { return Inventory.class.spawnStackInWorld(this, stack, direction); } public int dropSlot$default$2() { return Inventory.class.dropSlot$default$2(this); } public Option<ForgeDirection> dropSlot$default$3() { return Inventory.class.dropSlot$default$3(this); } public Option<ForgeDirection> spawnStackInWorld$default$2() { return Inventory.class.spawnStackInWorld$default$2(this); } public void updateItems(int slot, ItemStack stack) { Inventory.class.updateItems((Inventory)this, slot, stack); } public ItemStack func_70301_a(int slot) { return Inventory.class.getStackInSlot((Inventory)this, slot); } public void func_70299_a(int slot, ItemStack stack) { Inventory.class.setInventorySlotContents((Inventory)this, slot, stack); } public String func_145825_b() { return Inventory.class.getInventoryName((Inventory)this); } public String inventoryName() { return Inventory.class.inventoryName((Inventory)this); } public void load(NBTTagCompound nbt) { Inventory.class.load((Inventory)this, nbt); } public void save(NBTTagCompound nbt) { Inventory.class.save((Inventory)this, nbt); } public void onItemAdded(int slot, ItemStack stack) { Inventory.class.onItemAdded((Inventory)this, slot, stack); } public void onItemRemoved(int slot, ItemStack stack) { Inventory.class.onItemRemoved((Inventory)this, slot, stack); } public boolean func_145818_k_() { return SimpleInventory.class.hasCustomInventoryName((SimpleInventory)this); } public int getInventoryStackRequired() { return SimpleInventory.class.getInventoryStackRequired((SimpleInventory)this); } public void func_70295_k_() { SimpleInventory.class.openInventory((SimpleInventory)this); } public void func_70305_f() { SimpleInventory.class.closeInventory((SimpleInventory)this); } public ItemStack func_70298_a(int slot, int amount) { return SimpleInventory.class.decrStackSize((SimpleInventory)this, slot, amount); } public ItemStack func_70304_b(int slot) { return SimpleInventory.class.getStackInSlotOnClosing((SimpleInventory)this, slot); } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$omega = x$1; } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$torque = x$1; } public long li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power_$eq(long x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$power = x$1; } public int li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha() { return this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha; } public void li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha_$eq(int x$1) { this.li$cil$oc$common$tileentity$traits$power$RotaryCraft$$alpha = x$1; } @Method(modid = "RotaryCraft") public int getOmega() { return RotaryCraft.class.getOmega((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getTorque() { return RotaryCraft.class.getTorque((RotaryCraft)this); } @Method(modid = "RotaryCraft") public long getPower() { return RotaryCraft.class.getPower((RotaryCraft)this); } @Method(modid = "RotaryCraft") public String getName() { return RotaryCraft.class.getName((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getIORenderAlpha() { return RotaryCraft.class.getIORenderAlpha((RotaryCraft)this); } @Method(modid = "RotaryCraft") public void setIORenderAlpha(int value) { RotaryCraft.class.setIORenderAlpha((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setOmega(int value) { RotaryCraft.class.setOmega((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setTorque(int value) { RotaryCraft.class.setTorque((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void setPower(long value) { RotaryCraft.class.setPower((RotaryCraft)this, value); } @Method(modid = "RotaryCraft") public void noInputMachine() { RotaryCraft.class.noInputMachine((RotaryCraft)this); } @Method(modid = "RotaryCraft") public boolean canReadFrom(ForgeDirection forgeDirection) { return RotaryCraft.class.canReadFrom((RotaryCraft)this, forgeDirection); } @Method(modid = "RotaryCraft") public boolean isReceiving() { return RotaryCraft.class.isReceiving((RotaryCraft)this); } @Method(modid = "RotaryCraft") public int getMinTorque(int available) { return RotaryCraft.class.getMinTorque((RotaryCraft)this, available); } @Method(modid = "CoFHAPI|energy") public boolean canConnectEnergy(ForgeDirection from) { return RedstoneFlux.class.canConnectEnergy((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int receiveEnergy(ForgeDirection from, int maxReceive, boolean simulate) { return RedstoneFlux.class.receiveEnergy((RedstoneFlux)this, from, maxReceive, simulate); } @Method(modid = "CoFHAPI|energy") public int getEnergyStored(ForgeDirection from) { return RedstoneFlux.class.getEnergyStored((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int getMaxEnergyStored(ForgeDirection from) { return RedstoneFlux.class.getMaxEnergyStored((RedstoneFlux)this, from); } @Method(modid = "CoFHAPI|energy") public int extractEnergy(ForgeDirection from, int maxExtract, boolean simulate) { return RedstoneFlux.class.extractEnergy((RedstoneFlux)this, from, maxExtract, simulate); } @Method(modid = "Mekanism") public boolean canReceiveEnergy(ForgeDirection side) { return Mekanism.class.canReceiveEnergy((Mekanism)this, side); } @Method(modid = "Mekanism") public double transferEnergyToAcceptor(ForgeDirection side, double amount) { return Mekanism.class.transferEnergyToAcceptor((Mekanism)this, side, amount); } @Method(modid = "Mekanism") public double getMaxEnergy() { return Mekanism.class.getMaxEnergy((Mekanism)this); } @Method(modid = "Mekanism") public double getEnergy() { return Mekanism.class.getEnergy((Mekanism)this); } @Method(modid = "Mekanism") public void setEnergy(double energy) { Mekanism.class.setEnergy((Mekanism)this, energy); } public double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer() { return this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer; } public void li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer_$eq(double x$1) { this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Classic$$conversionBuffer = x$1; } public void func_145829_t() { IndustrialCraft2Classic.class.validate((IndustrialCraft2Classic)this); } public void func_145843_s() { IndustrialCraft2Classic.class.invalidate((IndustrialCraft2Classic)this); } public void onChunkUnload() { IndustrialCraft2Classic.class.onChunkUnload((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public boolean isAddedToEnergyNet() { return IndustrialCraft2Classic.class.isAddedToEnergyNet((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public int getMaxSafeInput() { return IndustrialCraft2Classic.class.getMaxSafeInput((IndustrialCraft2Classic)this); } @Method(modid = "IC2-Classic") public boolean acceptsEnergyFrom(TileEntity emitter, Direction direction) { return IndustrialCraft2Classic.class.acceptsEnergyFrom((IndustrialCraft2Classic)this, emitter, direction); } @Method(modid = "IC2-Classic") public boolean injectEnergy(Direction directionFrom, int amount) { return IndustrialCraft2Classic.class.injectEnergy((IndustrialCraft2Classic)this, directionFrom, amount); } @Method(modid = "IC2-Classic") public int demandsEnergy() { return IndustrialCraft2Classic.class.demandsEnergy((IndustrialCraft2Classic)this); } public double li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer() { return this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer; } public void li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer_$eq(double x$1) { this.li$cil$oc$common$tileentity$traits$power$IndustrialCraft2Experimental$$conversionBuffer = x$1; } @Method(modid = "IC2") public int getSinkTier() { return IndustrialCraft2Experimental.class.getSinkTier((IndustrialCraft2Experimental)this); } @Method(modid = "IC2") public boolean acceptsEnergyFrom(TileEntity emitter, ForgeDirection direction) { return IndustrialCraft2Experimental.class.acceptsEnergyFrom((IndustrialCraft2Experimental)this, emitter, direction); } @Method(modid = "IC2") public double injectEnergy(ForgeDirection directionFrom, double amount, double voltage) { return IndustrialCraft2Experimental.class.injectEnergy((IndustrialCraft2Experimental)this, directionFrom, amount, voltage); } @Method(modid = "IC2") public double getDemandedEnergy() { return IndustrialCraft2Experimental.class.getDemandedEnergy((IndustrialCraft2Experimental)this); } public boolean addedToIC2PowerGrid() { return this.addedToIC2PowerGrid; } public void addedToIC2PowerGrid_$eq(boolean x$1) { this.addedToIC2PowerGrid = x$1; } @Method(modid = "Galacticraft API") public boolean nodeAvailable(EnergySource from) { return Galacticraft.class.nodeAvailable((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float receiveEnergyGC(EnergySource from, float amount, boolean simulate) { return Galacticraft.class.receiveEnergyGC((Galacticraft)this, from, amount, simulate); } @Method(modid = "Galacticraft API") public float getEnergyStoredGC(EnergySource from) { return Galacticraft.class.getEnergyStoredGC((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float getMaxEnergyStoredGC(EnergySource from) { return Galacticraft.class.getMaxEnergyStoredGC((Galacticraft)this, from); } @Method(modid = "Galacticraft API") public float extractEnergyGC(EnergySource from, float amount, boolean simulate) { return Galacticraft.class.extractEnergyGC((Galacticraft)this, from, amount, simulate); } @Method(modid = "Galacticraft API") public boolean canConnect(ForgeDirection from, NetworkType networkType) { return Galacticraft.class.canConnect((Galacticraft)this, from, networkType); } private Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x4) == 0) { this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge = Factorization.class.li$cil$oc$common$tileentity$traits$power$Factorization$$charge((Factorization)this); this.bitmap$0 = (byte)(this.bitmap$0 | 0x4); }  return this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge; }  } public Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge() { return ((byte)(this.bitmap$0 & 0x4) == 0) ? li$cil$oc$common$tileentity$traits$power$Factorization$$charge$lzycompute() : this.li$cil$oc$common$tileentity$traits$power$Factorization$$charge; } @Method(modid = "factorization") public Charge getCharge() { return Factorization.class.getCharge((Factorization)this); } @Method(modid = "factorization") public String getInfo() { return Factorization.class.getInfo((Factorization)this); } @Method(modid = "factorization") public Coord getCoord() { return Factorization.class.getCoord((Factorization)this); } public Option<Object> li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node() { return this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node; } public void li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node_$eq(Option<Object> x$1) { this.li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node = x$1; } @Method(modid = "appliedenergistics2") public IGridNode getGridNode(ForgeDirection side) { return AppliedEnergistics2.class.getGridNode((AppliedEnergistics2)this, side); } @Method(modid = "appliedenergistics2") public AECableType getCableConnectionType(ForgeDirection side) { return AppliedEnergistics2.class.getCableConnectionType((AppliedEnergistics2)this, side); } @Method(modid = "appliedenergistics2") public void securityBreak() { AppliedEnergistics2.class.securityBreak((AppliedEnergistics2)this); } public void tryAllSides(Function2 provider, Function1 fromOther, Function1 toOther) { Common.class.tryAllSides((Common)this, provider, fromOther, toOther); } public boolean canConnectPower(ForgeDirection side) { return Common.class.canConnectPower((Common)this, side); } public double tryChangeBuffer(ForgeDirection side, double amount, boolean doReceive) { return Common.class.tryChangeBuffer((Common)this, side, amount, doReceive); } public double globalBuffer(ForgeDirection side) { return Common.class.globalBuffer((Common)this, side); } public double globalBufferSize(ForgeDirection side) { return Common.class.globalBufferSize((Common)this, side); } public double globalDemand(ForgeDirection side) { return Common.class.globalDemand((Common)this, side); } public boolean tryChangeBuffer$default$3() { return Common.class.tryChangeBuffer$default$3((Common)this); } public boolean isChangeScheduled() { return this.isChangeScheduled; } public void isChangeScheduled_$eq(boolean x$1) { this.isChangeScheduled = x$1; } public boolean moving() { return this.moving; } public void moving_$eq(boolean x$1) { this.moving = x$1; } public double xPosition() { return Environment.class.xPosition(this); } public double yPosition() { return Environment.class.yPosition(this); } public double zPosition() { return Environment.class.zPosition(this); } public void markChanged() { Environment.class.markChanged(this); } public boolean isConnected() { return Environment.class.isConnected(this); } public void initialize() { Environment.class.initialize(this); } public void dispose() { Environment.class.dispose(this); } public void onMessage(Message message) { Environment.class.onMessage(this, message); } public void onConnect(Node node) { Environment.class.onConnect(this, node); } public void onDisconnect(Node node) { Environment.class.onDisconnect(this, node); } @Method(modid = "appliedenergistics2") public boolean prepareToMove() { return Environment.class.prepareToMove(this); } @Method(modid = "appliedenergistics2") public void doneMoving() { Environment.class.doneMoving(this); } public Object[] result(Seq args) { return Environment.class.result(this, args); } public World world() { return TileEntity.class.world((TileEntity)this); } public int x() { return TileEntity.class.x((TileEntity)this); } public int y() { return TileEntity.class.y((TileEntity)this); } public int z() { return TileEntity.class.z((TileEntity)this); } public BlockPosition position() { return TileEntity.class.position((TileEntity)this); } public Block block() { return TileEntity.class.block((TileEntity)this); } public boolean isClient() { return TileEntity.class.isClient((TileEntity)this); } public boolean isServer() { return TileEntity.class.isServer((TileEntity)this); } public void func_145839_a(NBTTagCompound nbt) { TileEntity.class.readFromNBT((TileEntity)this, nbt); } public void func_145841_b(NBTTagCompound nbt) { TileEntity.class.writeToNBT((TileEntity)this, nbt); } public Packet func_145844_m() { return TileEntity.class.getDescriptionPacket((TileEntity)this); } public void onDataPacket(NetworkManager manager, S35PacketUpdateTileEntity packet) { TileEntity.class.onDataPacket((TileEntity)this, manager, packet); } public Assembler() { TileEntity.class.$init$((TileEntity)this); Environment.class.$init$(this); Common.class.$init$((Common)this); AppliedEnergistics2.class.$init$((AppliedEnergistics2)this); Factorization.class.$init$((Factorization)this); Galacticraft.class.$init$((Galacticraft)this); IndustrialCraft2Common.class.$init$((IndustrialCraft2Common)this); IndustrialCraft2Experimental.class.$init$((IndustrialCraft2Experimental)this); IndustrialCraft2Classic.class.$init$((IndustrialCraft2Classic)this); Mekanism.class.$init$((Mekanism)this); RedstoneFlux.class.$init$((RedstoneFlux)this); RotaryCraft.class.$init$((RotaryCraft)this); SimpleInventory.class.$init$((SimpleInventory)this); Inventory.class.$init$((Inventory)this); Inventory.class.$init$(this); StateAware.class.$init$(this);
/*  27 */     this.node = (ComponentConnector)Network.newNode((Environment)this, Visibility.Network)
/*  28 */       .withComponent("assembler")
/*  29 */       .withConnector(Settings$.MODULE$.get().bufferConverter())
/*  30 */       .create();
/*     */     
/*  32 */     this.output = (Option<ItemStack>)None$.MODULE$;
/*     */     
/*  34 */     this.totalRequiredEnergy = 0.0D;
/*     */     
/*  36 */     this.requiredEnergy = 0.0D; } public ComponentConnector node() { return this.node; } public Option<ItemStack> output() { return this.output; } public void output_$eq(Option<ItemStack> x$1) { this.output = x$1; } public double totalRequiredEnergy() { return this.totalRequiredEnergy; } public void totalRequiredEnergy_$eq(double x$1) { this.totalRequiredEnergy = x$1; } public double requiredEnergy() { return this.requiredEnergy; } public void requiredEnergy_$eq(double x$1) { this.requiredEnergy = x$1; }
/*     */   
/*  38 */   private Map deviceInfo$lzycompute() { synchronized (this) { if ((byte)(this.bitmap$0 & 0x1) == 0) { (new Tuple2[4])[0] = Predef$ArrowAssoc$.MODULE$
/*  39 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "generic");
/*  40 */         (new Tuple2[4])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Assembler");
/*  41 */         (new Tuple2[4])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  42 */         (new Tuple2[4])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Factorizer R1D1"); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Tuple2[4])); this.bitmap$0 = (byte)(this.bitmap$0 | 0x1); }
/*     */        return this.deviceInfo; }
/*     */      } private final Map<String, String> deviceInfo() { return ((byte)(this.bitmap$0 & 0x1) == 0) ? deviceInfo$lzycompute() : this.deviceInfo; }
/*  45 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public boolean canConnect(ForgeDirection side) {
/*  50 */     ForgeDirection forgeDirection = ForgeDirection.UP; if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*     */     {  }
/*  52 */      } public Node sidedNode(ForgeDirection side) { ForgeDirection forgeDirection = ForgeDirection.UP; if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*     */     {  }
/*     */      } @SideOnly(Side.CLIENT)
/*  55 */   public boolean hasConnector(ForgeDirection side) { return canConnect(side); }
/*     */   
/*  57 */   public Option<Connector> connector(ForgeDirection side) { ForgeDirection forgeDirection = ForgeDirection.UP; if (side == null) { if (forgeDirection != null); } else if (side.equals(forgeDirection))
/*     */     {  }
/*  59 */      } public double energyThroughput() { return Settings$.MODULE$.get().assemblerRate(); }
/*     */   
/*     */   public EnumSet<StateAware.State> getCurrentState() {
/*  62 */     return isAssembling() ? EnumSet.<StateAware.State>of(StateAware.State.IsWorking) : (
/*  63 */       canAssemble() ? EnumSet.<StateAware.State>of(StateAware.State.CanWork) : 
/*  64 */       EnumSet.<StateAware.State>noneOf(StateAware.State.class));
/*     */   }
/*     */   
/*     */   public boolean canAssemble() {
/*     */     boolean bool;
/*  69 */     Option option = AssemblerTemplates$.MODULE$.select(func_70301_a(0));
/*  70 */     if (option instanceof Some) { Some some = (Some)option; AssemblerTemplates.Template template = (AssemblerTemplates.Template)some.x(); bool = (!isAssembling() && output().isEmpty() && BoxesRunTime.unboxToBoolean(template.validate((IInventory)this)._1())) ? true : false; }
/*  71 */     else { bool = false; }
/*     */     
/*     */     return bool; } public boolean isAssembling() {
/*  74 */     return (requiredEnergy() > false);
/*     */   } public double progress() {
/*  76 */     return (true - requiredEnergy() / totalRequiredEnergy()) * 100;
/*     */   } public int timeRemaining() {
/*  78 */     return (int)(requiredEnergy() / Settings$.MODULE$.get().assemblerTickAmount() / 20);
/*     */   }
/*     */   
/*     */   public synchronized boolean start(boolean finishImmediately) {
/*  82 */     Object object = new Object(); try {
/*  83 */       Option option = AssemblerTemplates$.MODULE$.select(func_70301_a(0));
/*  84 */       if (option instanceof Some) { Some some = (Some)option; AssemblerTemplates.Template template = (AssemblerTemplates.Template)some.x(); if (!isAssembling() && output().isEmpty() && BoxesRunTime.unboxToBoolean(template.validate((IInventory)this)._1())) { RichInt$.MODULE$
/*  85 */             .until$extension0(Predef$.MODULE$.intWrapper(0), func_70302_i_()).foreach$mVc$sp((Function1)new Assembler$$anonfun$start$1(this, object));
/*     */ 
/*     */ 
/*     */           
/*  89 */           Tuple2 tuple2 = template.assemble((IInventory)this); if (tuple2 != null) { ItemStack stack = (ItemStack)tuple2._1(); double energy = tuple2._2$mcD$sp(); Tuple2 tuple22 = new Tuple2(stack, BoxesRunTime.boxToDouble(energy)), tuple21 = tuple22; ItemStack itemStack1 = (ItemStack)tuple21._1(); double d1 = tuple21._2$mcD$sp();
/*  90 */             output_$eq((Option<ItemStack>)new Some(itemStack1));
/*  91 */             if (finishImmediately) {
/*  92 */               totalRequiredEnergy_$eq(0.0D);
/*     */             } else {
/*     */               
/*  95 */               totalRequiredEnergy_$eq(package$.MODULE$.max(1.0D, d1));
/*     */             } 
/*  97 */             requiredEnergy_$eq(totalRequiredEnergy());
/*  98 */             PacketSender$.MODULE$.sendRobotAssembling(this, true); RichInt$.MODULE$
/*     */               
/* 100 */               .until$extension0(Predef$.MODULE$.intWrapper(0), func_70302_i_()).foreach$mVc$sp((Function1)new Assembler$$anonfun$start$2(this));
/* 101 */             func_70296_d();
/*     */             
/* 103 */             boolean bool1 = true; }  throw new MatchError(tuple2); }  }
/* 104 */        boolean bool = false;
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object)
/*     */         return nonLocalReturnControl.value$mcZ$sp(); 
/*     */     } 
/*     */     return bool;
/*     */   } public boolean start$default$1() { return false; } public final class Assembler$$anonfun$start$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Object nonLocalReturnKey1$1; public final void apply(int slot) { apply$mcVI$sp(slot); } public Assembler$$anonfun$start$1(Assembler $outer, Object nonLocalReturnKey1$1) {} public void apply$mcVI$sp(int slot) { ItemStack stack = this.$outer.func_70301_a(slot);
/*     */       if (stack == null || this.$outer.func_94041_b(slot, stack))
/*     */         return; 
/*     */       throw new NonLocalReturnControl.mcZ.sp(this.nonLocalReturnKey1$1, false); } } public final class Assembler$$anonfun$start$2 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final void apply(int slot) { apply$mcVI$sp(slot); }
/*     */     public void apply$mcVI$sp(int slot) { this.$outer.updateItems(slot, null); }
/*     */     public Assembler$$anonfun$start$2(Assembler $outer) {} }
/*     */   @Callback(doc = "function(): string, number or boolean -- The current state of the assembler, `busy' or `idle', followed by the progress or template validity, respectively.") public Object[] status(Context context, Arguments args) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual isAssembling : ()Z
/*     */     //   4: ifeq -> 40
/*     */     //   7: aload_0
/*     */     //   8: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   11: iconst_2
/*     */     //   12: anewarray java/lang/Object
/*     */     //   15: dup
/*     */     //   16: iconst_0
/*     */     //   17: ldc_w 'busy'
/*     */     //   20: aastore
/*     */     //   21: dup
/*     */     //   22: iconst_1
/*     */     //   23: aload_0
/*     */     //   24: invokevirtual progress : ()D
/*     */     //   27: invokestatic boxToDouble : (D)Ljava/lang/Double;
/*     */     //   30: aastore
/*     */     //   31: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   34: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   37: goto -> 153
/*     */     //   40: getstatic li/cil/oc/common/template/AssemblerTemplates$.MODULE$ : Lli/cil/oc/common/template/AssemblerTemplates$;
/*     */     //   43: aload_0
/*     */     //   44: iconst_0
/*     */     //   45: invokevirtual func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   48: invokevirtual select : (Lnet/minecraft/item/ItemStack;)Lscala/Option;
/*     */     //   51: astore_3
/*     */     //   52: aload_3
/*     */     //   53: instanceof scala/Some
/*     */     //   56: ifeq -> 122
/*     */     //   59: aload_3
/*     */     //   60: checkcast scala/Some
/*     */     //   63: astore #4
/*     */     //   65: aload #4
/*     */     //   67: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   70: checkcast li/cil/oc/common/template/AssemblerTemplates$Template
/*     */     //   73: astore #5
/*     */     //   75: aload #5
/*     */     //   77: aload_0
/*     */     //   78: invokevirtual validate : (Lnet/minecraft/inventory/IInventory;)Lscala/Tuple3;
/*     */     //   81: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   84: invokestatic unboxToBoolean : (Ljava/lang/Object;)Z
/*     */     //   87: ifeq -> 122
/*     */     //   90: aload_0
/*     */     //   91: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   94: iconst_2
/*     */     //   95: anewarray java/lang/Object
/*     */     //   98: dup
/*     */     //   99: iconst_0
/*     */     //   100: ldc_w 'idle'
/*     */     //   103: aastore
/*     */     //   104: dup
/*     */     //   105: iconst_1
/*     */     //   106: iconst_1
/*     */     //   107: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   110: aastore
/*     */     //   111: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   114: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   117: astore #6
/*     */     //   119: goto -> 151
/*     */     //   122: aload_0
/*     */     //   123: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   126: iconst_2
/*     */     //   127: anewarray java/lang/Object
/*     */     //   130: dup
/*     */     //   131: iconst_0
/*     */     //   132: ldc_w 'idle'
/*     */     //   135: aastore
/*     */     //   136: dup
/*     */     //   137: iconst_1
/*     */     //   138: iconst_0
/*     */     //   139: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   142: aastore
/*     */     //   143: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */     //   146: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */     //   149: astore #6
/*     */     //   151: aload #6
/*     */     //   153: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #112	-> 0
/*     */     //   #113	-> 40
/*     */     //   #114	-> 52
/*     */     //   #115	-> 122
/*     */     //   #113	-> 151
/*     */     //   #112	-> 153
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	154	0	this	Lli/cil/oc/common/tileentity/Assembler;
/*     */     //   0	154	1	context	Lli/cil/oc/api/machine/Context;
/*     */     //   0	154	2	args	Lli/cil/oc/api/machine/Arguments;
/*     */     //   75	79	5	template	Lli/cil/oc/common/template/AssemblerTemplates$Template; }
/* 120 */   @Callback(doc = "function():boolean -- Start assembling, if possible. Returns whether assembly was started or not.") public Object[] start(Context context, Arguments args) { return result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(start(start$default$1())) })); }
/*     */ 
/*     */   
/*     */   public boolean canUpdate() {
/* 124 */     return isServer();
/*     */   }
/*     */   public void func_145845_h() {
/* 127 */     RotaryCraft.class.updateEntity((RotaryCraft)this);
/* 128 */     if (output().isDefined() && world().func_82737_E() % Settings$.MODULE$.get().tickFrequency() == false) {
/* 129 */       double want = package$.MODULE$.max(1.0D, package$.MODULE$.min(requiredEnergy(), Settings$.MODULE$.get().assemblerTickAmount() * Settings$.MODULE$.get().tickFrequency()));
/* 130 */       double have = want + (Settings$.MODULE$.get().ignorePower() ? 0.0D : node().changeBuffer(-want));
/* 131 */       requiredEnergy_$eq(requiredEnergy() - have);
/* 132 */       if (requiredEnergy() <= false) {
/* 133 */         func_70299_a(0, (ItemStack)output().get());
/* 134 */         output_$eq((Option<ItemStack>)None$.MODULE$);
/* 135 */         requiredEnergy_$eq(0.0D);
/*     */       } 
/* 137 */       PacketSender$.MODULE$.sendRobotAssembling(this, (have > 0.5D && output().isDefined()));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void readFromNBTForServer(NBTTagCompound nbt) {
/* 142 */     Inventory.class.readFromNBTForServer(this, nbt);
/* 143 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("output").toString())) {
/* 144 */       output_$eq(Option$.MODULE$.apply(ItemStack.func_77949_a(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("output").toString()))));
/*     */     }
/* 146 */     else if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("robot").toString())) {
/*     */       
/* 148 */       output_$eq(Option$.MODULE$.apply(ItemStack.func_77949_a(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("robot").toString()))));
/*     */     } 
/* 150 */     totalRequiredEnergy_$eq(nbt.func_74769_h((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("total").toString()));
/* 151 */     requiredEnergy_$eq(nbt.func_74769_h((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("remaining").toString()));
/*     */   }
/*     */   
/*     */   public void writeToNBTForServer(NBTTagCompound nbt) {
/* 155 */     Inventory.class.writeToNBTForServer(this, nbt);
/* 156 */     output().foreach((Function1)new Assembler$$anonfun$writeToNBTForServer$1(this, nbt));
/* 157 */     nbt.func_74780_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("total").toString(), totalRequiredEnergy());
/* 158 */     nbt.func_74780_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("remaining").toString(), requiredEnergy());
/*     */   } public final class Assembler$$anonfun$writeToNBTForServer$1 extends AbstractFunction1<ItemStack, NBTTagCompound> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public final NBTTagCompound apply(ItemStack stack) { return ExtendedNBT$.MODULE$.extendNBTTagCompound(this.nbt$1).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("output").toString(), (Function1)new Assembler$$anonfun$writeToNBTForServer$1$$anonfun$apply$1(this, stack)); } public Assembler$$anonfun$writeToNBTForServer$1(Assembler $outer, NBTTagCompound nbt$1) {} public final class Assembler$$anonfun$writeToNBTForServer$1$$anonfun$apply$1 extends AbstractFunction1<NBTTagCompound, NBTTagCompound> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final ItemStack stack$1; public final NBTTagCompound apply(NBTTagCompound x$1) { return this.stack$1.func_77955_b(x$1); } public Assembler$$anonfun$writeToNBTForServer$1$$anonfun$apply$1(Assembler$$anonfun$writeToNBTForServer$1 $outer, ItemStack stack$1) {} } }
/*     */   @SideOnly(Side.CLIENT)
/* 163 */   public void readFromNBTForClient(NBTTagCompound nbt) { TileEntity.class.readFromNBTForClient((TileEntity)this, nbt);
/* 164 */     requiredEnergy_$eq(nbt.func_74769_h("remaining")); }
/*     */ 
/*     */   
/*     */   public void writeToNBTForClient(NBTTagCompound nbt) {
/* 168 */     TileEntity.class.writeToNBTForClient((TileEntity)this, nbt);
/* 169 */     nbt.func_74780_a("remaining", requiredEnergy());
/*     */   }
/*     */ 
/*     */   
/*     */   public int func_70302_i_() {
/* 174 */     return 22;
/*     */   } public int func_70297_j_() {
/* 176 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean func_94041_b(int slot, ItemStack stack) {
/*     */     boolean bool;
/* 182 */     Option option = AssemblerTemplates$.MODULE$.select(func_70301_a(0));
/* 183 */     if (option instanceof Some) { Some some = (Some)option; AssemblerTemplates.Template template = (AssemblerTemplates.Template)some.x();
/* 184 */       AssemblerTemplates.Slot tplSlot = 
/* 185 */         RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(1), 4).contains(slot) ? template.containerSlots()[slot - 1] : (
/* 186 */         RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(4), 13).contains(slot) ? template.upgradeSlots()[slot - 4] : (
/* 187 */         RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(13), 21).contains(slot) ? template.componentSlots()[slot - 13] : 
/* 188 */         AssemblerTemplates$.MODULE$.NoSlot()));
/* 189 */       bool = tplSlot.validate((IInventory)this, slot, stack); }
/* 190 */     else { bool = false; }
/*     */     
/*     */     return (slot == 0) ? ((!isAssembling() && AssemblerTemplates$.MODULE$.select(stack).isDefined())) : bool;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\Assembler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */