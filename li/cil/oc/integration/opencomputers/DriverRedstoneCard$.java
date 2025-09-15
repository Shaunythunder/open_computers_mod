/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.api.driver.item.HostAware;
/*    */ import li.cil.oc.api.network.EnvironmentHost;
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import li.cil.oc.common.item.RedstoneCard;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.collection.Seq;
/*    */ 
/*    */ public final class DriverRedstoneCard$ implements Item, HostAware {
/*    */   public static final DriverRedstoneCard$ MODULE$;
/*    */   
/* 19 */   public boolean worksWith(ItemStack stack, Class host) { return Item$class.worksWith(this, stack, host); } public NBTTagCompound dataTag(ItemStack stack) { return Item$class.dataTag(this, stack); } public boolean isOneOf(ItemStack stack, Seq items) { return Item$class.isOneOf(this, stack, items); } public boolean isAdapter(Class host) { return Item$class.isAdapter(this, host); } public boolean isComputer(Class host) { return Item$class.isComputer(this, host); } public boolean isRobot(Class host) { return Item$class.isRobot(this, host); } public boolean isRotatable(Class host) { return Item$class.isRotatable(this, host); } public boolean isServer(Class host) { return Item$class.isServer(this, host); } public boolean isTablet(Class host) { return Item$class.isTablet(this, host); } public boolean isMicrocontroller(Class host) { return Item$class.isMicrocontroller(this, host); } public boolean isDrone(Class host) { return Item$class.isDrone(this, host); } private DriverRedstoneCard$() { MODULE$ = this; Item$class.$init$(this); } public boolean worksWith(ItemStack stack) {
/* 20 */     (new ItemInfo[2])[0] = 
/* 21 */       Items.get("redstoneCard1");
/* 22 */     (new ItemInfo[2])[1] = Items.get("redstoneCard2");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[2]));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: invokeinterface world : ()Lnet/minecraft/world/World;
/*    */     //   6: ifnull -> 25
/*    */     //   9: aload_2
/*    */     //   10: invokeinterface world : ()Lnet/minecraft/world/World;
/*    */     //   15: getfield field_72995_K : Z
/*    */     //   18: ifeq -> 25
/*    */     //   21: aconst_null
/*    */     //   22: goto -> 195
/*    */     //   25: aload_0
/*    */     //   26: aload_1
/*    */     //   27: invokevirtual tier : (Lnet/minecraft/item/ItemStack;)I
/*    */     //   30: iconst_1
/*    */     //   31: if_icmpne -> 38
/*    */     //   34: iconst_1
/*    */     //   35: goto -> 39
/*    */     //   38: iconst_0
/*    */     //   39: istore_3
/*    */     //   40: getstatic li/cil/oc/integration/util/BundledRedstone$.MODULE$ : Lli/cil/oc/integration/util/BundledRedstone$;
/*    */     //   43: invokevirtual isAvailable : ()Z
/*    */     //   46: ifeq -> 57
/*    */     //   49: iload_3
/*    */     //   50: ifeq -> 57
/*    */     //   53: iconst_1
/*    */     //   54: goto -> 58
/*    */     //   57: iconst_0
/*    */     //   58: istore #4
/*    */     //   60: getstatic li/cil/oc/integration/util/WirelessRedstone$.MODULE$ : Lli/cil/oc/integration/util/WirelessRedstone$;
/*    */     //   63: invokevirtual isAvailable : ()Z
/*    */     //   66: ifeq -> 77
/*    */     //   69: iload_3
/*    */     //   70: ifeq -> 77
/*    */     //   73: iconst_1
/*    */     //   74: goto -> 78
/*    */     //   77: iconst_0
/*    */     //   78: istore #5
/*    */     //   80: aload_2
/*    */     //   81: astore #6
/*    */     //   83: aload #6
/*    */     //   85: instanceof li/cil/oc/common/tileentity/traits/BundledRedstoneAware
/*    */     //   88: ifeq -> 131
/*    */     //   91: aload #6
/*    */     //   93: astore #7
/*    */     //   95: iload #4
/*    */     //   97: ifeq -> 131
/*    */     //   100: iload #5
/*    */     //   102: ifeq -> 117
/*    */     //   105: new li/cil/oc/server/component/Redstone$BundledWireless
/*    */     //   108: dup
/*    */     //   109: aload #7
/*    */     //   111: invokespecial <init> : (Lli/cil/oc/api/network/EnvironmentHost;)V
/*    */     //   114: goto -> 126
/*    */     //   117: new li/cil/oc/server/component/Redstone$Bundled
/*    */     //   120: dup
/*    */     //   121: aload #7
/*    */     //   123: invokespecial <init> : (Lli/cil/oc/api/network/EnvironmentHost;)V
/*    */     //   126: astore #8
/*    */     //   128: goto -> 193
/*    */     //   131: aload #6
/*    */     //   133: instanceof li/cil/oc/common/tileentity/traits/RedstoneAware
/*    */     //   136: ifeq -> 174
/*    */     //   139: aload #6
/*    */     //   141: astore #9
/*    */     //   143: iload #5
/*    */     //   145: ifeq -> 160
/*    */     //   148: new li/cil/oc/server/component/Redstone$VanillaWireless
/*    */     //   151: dup
/*    */     //   152: aload #9
/*    */     //   154: invokespecial <init> : (Lli/cil/oc/api/network/EnvironmentHost;)V
/*    */     //   157: goto -> 169
/*    */     //   160: new li/cil/oc/server/component/Redstone$Vanilla
/*    */     //   163: dup
/*    */     //   164: aload #9
/*    */     //   166: invokespecial <init> : (Lli/cil/oc/api/network/EnvironmentHost;)V
/*    */     //   169: astore #8
/*    */     //   171: goto -> 193
/*    */     //   174: iload #5
/*    */     //   176: ifeq -> 190
/*    */     //   179: new li/cil/oc/server/component/Redstone$Wireless
/*    */     //   182: dup
/*    */     //   183: aload_2
/*    */     //   184: invokespecial <init> : (Lli/cil/oc/api/network/EnvironmentHost;)V
/*    */     //   187: goto -> 191
/*    */     //   190: aconst_null
/*    */     //   191: astore #8
/*    */     //   193: aload #8
/*    */     //   195: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 0
/*    */     //   #27	-> 25
/*    */     //   #28	-> 40
/*    */     //   #29	-> 60
/*    */     //   #30	-> 80
/*    */     //   #31	-> 83
/*    */     //   #32	-> 100
/*    */     //   #33	-> 117
/*    */     //   #32	-> 126
/*    */     //   #34	-> 131
/*    */     //   #35	-> 143
/*    */     //   #36	-> 160
/*    */     //   #35	-> 169
/*    */     //   #38	-> 174
/*    */     //   #39	-> 190
/*    */     //   #38	-> 191
/*    */     //   #30	-> 193
/*    */     //   #25	-> 195
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	196	0	this	Lli/cil/oc/integration/opencomputers/DriverRedstoneCard$;
/*    */     //   0	196	1	stack	Lnet/minecraft/item/ItemStack;
/*    */     //   0	196	2	host	Lli/cil/oc/api/network/EnvironmentHost;
/*    */     //   40	155	3	isAdvanced	Z
/*    */     //   60	135	4	hasBundled	Z
/*    */     //   80	115	5	hasWireless	Z
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String slot(ItemStack stack) {
/* 43 */     return li.cil.oc.common.Slot$.MODULE$.Card();
/*    */   }
/*    */   public int tier(ItemStack stack) {
/* 46 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 47 */     if (option instanceof Some) { Some some = (Some)option; Delegate card = (Delegate)some.x(); if (card instanceof RedstoneCard) { RedstoneCard redstoneCard = (RedstoneCard)card; return redstoneCard.tier(); }  }
/* 48 */      return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverRedstoneCard$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */