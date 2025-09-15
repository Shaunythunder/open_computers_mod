/*    */ package li.cil.oc.integration.appeng;
/*    */ 
/*    */ import appeng.api.features.IWirelessTermHandler;
/*    */ import appeng.api.util.IConfigManager;
/*    */ import li.cil.oc.common.item.data.DroneData;
/*    */ import li.cil.oc.common.item.data.RobotData;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.reflect.ScalaSignature;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Mb\001B\001\003\0015\021\001dV5sK2,7o\035%b]\022dWM]+qOJ\fG-Z!F\025\t\031A!\001\004baB,gn\032\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\005!A.\0318h\025\005\031\022\001\0026bm\006L!!\006\t\003\r=\023'.Z2u!\t9R$D\001\031\025\tI\"$\001\005gK\006$XO]3t\025\tYB$A\002ba&T\021aA\005\003=a\021A#S,je\026dWm]:UKJl\007*\0318eY\026\024\b\"\002\021\001\t\003\t\023A\002\037j]&$h\bF\001#!\t\031\003!D\001\003\021\025)\003\001\"\021'\003%\031\027M\034%b]\022dW\r\006\002([A\021\001fK\007\002S)\t!&A\003tG\006d\027-\003\002-S\t9!i\\8mK\006t\007\"\002\030%\001\004y\023!C5uK6\034F/Y2l!\t\001t'D\0012\025\t\0214'\001\003ji\026l'B\001\0336\003%i\027N\\3de\0064GOC\0017\003\rqW\r^\005\003qE\022\021\"\023;f[N#\030mY6\t\013i\002A\021I\036\002\021U\034X\rU8xKJ$Ba\n\037G\027\")Q(\017a\001}\005aQM\034;jif\004F.Y=feB\021q\bR\007\002\001*\021\021IQ\001\007a2\f\0270\032:\013\005\r\033\024AB3oi&$\0300\003\002F\001\naQI\034;jif\004F.Y=fe\")q)\017a\001\021\006\ta\017\005\002)\023&\021!*\013\002\007\t>,(\r\\3\t\0139J\004\031A\030\t\0135\003A\021\t(\002!\035,GoQ8oM&<W*\0318bO\026\024HCA(V!\t\0016+D\001R\025\t\021&$\001\003vi&d\027B\001+R\0059I5i\0348gS\036l\025M\\1hKJDQA\f'A\002=BQa\026\001\005Ba\013\001\002[1t!><XM\035\013\005OeS6\fC\003>-\002\007a\bC\003H-\002\007\001\nC\003/-\002\007q\006C\003^\001\021\005c,\001\ttKR,en\031:zaRLwN\\&fsR!qLY2m!\tA\003-\003\002bS\t!QK\\5u\021\025qC\f1\0010\021\025!G\f1\001f\003\031)gnY&fsB\021a-\033\b\003Q\035L!\001[\025\002\rA\023X\rZ3g\023\tQ7N\001\004TiJLgn\032\006\003Q&BQ!\034/A\002\025\fAA\\1nK\")q\016\001C!a\006\001r-\032;F]\016\024\030\020\035;j_:\\U-\037\013\003KFDQA\f8A\002=BQa\035\001\005\nQ\fQc]3u\013:\034'/\0379uS>t7*Z=S_\n|G\017\006\003`kZ<\b\"\002\030s\001\004y\003\"\0023s\001\004)\007\"B7s\001\004)\007\"B=\001\t\003Q\030!F4fi\026s7M]=qi&|gnS3z%>\024w\016\036\013\003KnDQ\001 =A\002=\nQa\035;bG.DQA \001\005\n}\fQc]3u\013:\034'/\0379uS>t7*Z=Ee>tW\rF\004`\003\003\t\031!!\002\t\0139j\b\031A\030\t\013\021l\b\031A3\t\0135l\b\031A3\t\017\005%\001\001\"\001\002\f\005)r-\032;F]\016\024\030\020\035;j_:\\U-\037#s_:,GcA3\002\016!1A0a\002A\002=:q!!\005\003\021\003\t\031\"\001\rXSJ,G.Z:t\021\006tG\r\\3s+B<'/\0313f\003\026\0032aIA\013\r\031\t!\001#\001\002\030M!\021QCA\r!\rA\0231D\005\004\003;I#AB!osJ+g\rC\004!\003+!\t!!\t\025\005\005M\001bCA\023\003+A)\031!C\001\003O\t\001\"\0338ti\006t7-Z\013\002E!Q\0211FA\013\021\003\005\013\025\002\022\002\023%t7\017^1oG\026\004\003\002CA\030\003+!\t!!\r\002\021I,w-[:uKJ$\022a\030")
/*    */ public class WirelessHandlerUpgradeAE
/*    */   implements IWirelessTermHandler
/*    */ {
/*    */   public static void register() {
/*    */     WirelessHandlerUpgradeAE$.MODULE$.register();
/*    */   }
/*    */   
/*    */   public boolean usePower(EntityPlayer entityPlayer, double v, ItemStack itemStack) {
/* 21 */     return false;
/*    */   }
/*    */   public static WirelessHandlerUpgradeAE instance() { return WirelessHandlerUpgradeAE$.MODULE$.instance(); } public boolean canHandle(ItemStack itemStack) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ifnonnull -> 6
/*    */     //   4: iconst_0
/*    */     //   5: ireturn
/*    */     //   6: aload_1
/*    */     //   7: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*    */     //   10: astore_2
/*    */     //   11: aload_2
/*    */     //   12: ldc 'me_upgrade1'
/*    */     //   14: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*    */     //   17: invokeinterface item : ()Lnet/minecraft/item/Item;
/*    */     //   22: astore_3
/*    */     //   23: dup
/*    */     //   24: ifnonnull -> 35
/*    */     //   27: pop
/*    */     //   28: aload_3
/*    */     //   29: ifnull -> 42
/*    */     //   32: goto -> 44
/*    */     //   35: aload_3
/*    */     //   36: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   39: ifeq -> 44
/*    */     //   42: iconst_1
/*    */     //   43: ireturn
/*    */     //   44: getstatic li/cil/oc/integration/appeng/AEUtil$.MODULE$ : Lli/cil/oc/integration/appeng/AEUtil$;
/*    */     //   47: aload_1
/*    */     //   48: invokevirtual isRobot : (Lnet/minecraft/item/ItemStack;)Z
/*    */     //   51: ifeq -> 71
/*    */     //   54: getstatic li/cil/oc/integration/appeng/AEUtil$.MODULE$ : Lli/cil/oc/integration/appeng/AEUtil$;
/*    */     //   57: new li/cil/oc/common/item/data/RobotData
/*    */     //   60: dup
/*    */     //   61: aload_1
/*    */     //   62: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*    */     //   65: invokevirtual getAEUpgradeComponent : (Lli/cil/oc/common/item/data/RobotData;)Lnet/minecraft/item/ItemStack;
/*    */     //   68: ifnonnull -> 98
/*    */     //   71: getstatic li/cil/oc/integration/appeng/AEUtil$.MODULE$ : Lli/cil/oc/integration/appeng/AEUtil$;
/*    */     //   74: aload_1
/*    */     //   75: invokevirtual isDrone : (Lnet/minecraft/item/ItemStack;)Z
/*    */     //   78: ifeq -> 102
/*    */     //   81: getstatic li/cil/oc/integration/appeng/AEUtil$.MODULE$ : Lli/cil/oc/integration/appeng/AEUtil$;
/*    */     //   84: new li/cil/oc/common/item/data/DroneData
/*    */     //   87: dup
/*    */     //   88: aload_1
/*    */     //   89: invokespecial <init> : (Lnet/minecraft/item/ItemStack;)V
/*    */     //   92: invokevirtual getAEUpgradeComponent : (Lli/cil/oc/common/item/data/DroneData;)Lnet/minecraft/item/ItemStack;
/*    */     //   95: ifnull -> 102
/*    */     //   98: iconst_1
/*    */     //   99: goto -> 103
/*    */     //   102: iconst_0
/*    */     //   103: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 0
/*    */     //   #16	-> 6
/*    */     //   #17	-> 11
/*    */     //   #18	-> 44
/*    */     //   #14	-> 103
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	104	0	this	Lli/cil/oc/integration/appeng/WirelessHandlerUpgradeAE;
/*    */     //   0	104	1	itemStack	Lnet/minecraft/item/ItemStack;
/* 23 */     //   11	93	2	item	Lnet/minecraft/item/Item; } public IConfigManager getConfigManager(ItemStack itemStack) { return null; }
/*    */    public boolean hasPower(EntityPlayer entityPlayer, double v, ItemStack itemStack) {
/* 25 */     return true;
/*    */   }
/*    */   public void setEncryptionKey(ItemStack itemStack, String encKey, String name) {
/* 28 */     if (AEUtil$.MODULE$.isRobot(itemStack)) {
/* 29 */       setEncryptionKeyRobot(itemStack, encKey, name);
/*    */       return;
/*    */     } 
/* 32 */     if (AEUtil$.MODULE$.isDrone(itemStack)) {
/* 33 */       setEncryptionKeyDrone(itemStack, encKey, name);
/*    */       return;
/*    */     } 
/* 36 */     if (!itemStack.func_77942_o()) itemStack.func_77982_d(new NBTTagCompound()); 
/* 37 */     NBTTagCompound tagCompound = itemStack.func_77978_p();
/* 38 */     tagCompound.func_74778_a("key", encKey);
/*    */   }
/*    */   
/*    */   public String getEncryptionKey(ItemStack itemStack) {
/* 42 */     if (AEUtil$.MODULE$.isRobot(itemStack)) return getEncryptionKeyRobot(itemStack); 
/* 43 */     if (AEUtil$.MODULE$.isDrone(itemStack)) return getEncryptionKeyDrone(itemStack); 
/* 44 */     if (!itemStack.func_77942_o()) itemStack.func_77982_d(new NBTTagCompound()); 
/* 45 */     return itemStack.func_77978_p().func_74779_i("key");
/*    */   }
/*    */   
/*    */   private void setEncryptionKeyRobot(ItemStack itemStack, String encKey, String name) {
/* 49 */     RobotData robot = new RobotData(itemStack);
/* 50 */     ItemStack component = AEUtil$.MODULE$.getAEUpgradeComponent(robot);
/* 51 */     if (component != null) setEncryptionKey(component, encKey, name); 
/* 52 */     robot.save(itemStack);
/*    */   }
/*    */   
/*    */   public String getEncryptionKeyRobot(ItemStack stack) {
/* 56 */     RobotData robot = new RobotData(stack);
/* 57 */     ItemStack component = AEUtil$.MODULE$.getAEUpgradeComponent(robot);
/* 58 */     if (component == null) return ""; 
/* 59 */     return getEncryptionKey(component);
/*    */   }
/*    */   
/*    */   private void setEncryptionKeyDrone(ItemStack itemStack, String encKey, String name) {
/* 63 */     RobotData robot = new RobotData(itemStack);
/* 64 */     ItemStack component = AEUtil$.MODULE$.getAEUpgradeComponent(robot);
/* 65 */     if (component != null) setEncryptionKey(component, encKey, name); 
/* 66 */     robot.save(itemStack);
/*    */   }
/*    */   
/*    */   public String getEncryptionKeyDrone(ItemStack stack) {
/* 70 */     DroneData drone = new DroneData(stack);
/* 71 */     ItemStack component = AEUtil$.MODULE$.getAEUpgradeComponent(drone);
/* 72 */     return (component == null) ? "" : getEncryptionKey(component);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\appeng\WirelessHandlerUpgradeAE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */