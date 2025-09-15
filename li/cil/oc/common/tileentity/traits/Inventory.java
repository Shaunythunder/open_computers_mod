/*    */ package li.cil.oc.common.tileentity.traits;@ScalaSignature(bytes = "\006\001\005MbaB\001\003!\003\r\ta\004\002\n\023:4XM\034;pefT!a\001\003\002\rQ\024\030-\033;t\025\t)a!\001\006uS2,WM\034;jifT!a\002\005\002\r\r|W.\\8o\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\005\001AIB\004\005\002\022/5\t!C\003\002\006')\021A#F\001\n[&tWm\031:bMRT\021AF\001\004]\026$\030B\001\r\023\005)!\026\016\\3F]RLG/\037\t\0035mi\021AA\005\0031\t\001\"!\b\021\016\003yQ!a\b\004\002\023%tg/\0328u_JL\030BA\001\037\021\025\021\003\001\"\001$\003\031!\023N\\5uIQ\tA\005\005\002&Q5\taEC\001(\003\025\0318-\0317b\023\tIcE\001\003V]&$\b\002C\020\001\021\013\007I\021B\026\026\0031\0022!J\0270\023\tqcEA\003BeJ\f\027\020E\002&aIJ!!\r\024\003\r=\003H/[8o!\t\031d'D\0015\025\t)4#\001\003ji\026l\027BA\0345\005%IE/Z7Ti\006\0347\016\003\005:\001!\005\t\025)\003-\003)IgN^3oi>\024\030\020\t\005\006w\001!\taK\001\006SR,Wn\035\005\006{\001!\tEP\001\025e\026\fGM\022:p[:\023EKR8s'\026\024h/\032:\025\005\021z\004\"\002!=\001\004\t\025a\0018ciB\021!\tR\007\002\007*\021\001iE\005\003\013\016\023aB\024\"U)\006<7i\\7q_VtG\rC\003H\001\021\005\003*A\nxe&$X\rV8O\005R3uN]*feZ,'\017\006\002%\023\")\001I\022a\001\003\")1\n\001C!\031\006\t\022n]+tK\006\024G.\032\"z!2\f\0270\032:\025\0055\003\006CA\023O\023\tyeEA\004C_>dW-\0318\t\013ES\005\031\001*\002\rAd\027-_3s!\t\031v+D\001U\025\t\tVK\003\002W'\0051QM\034;jifL!\001\027+\003\031\025sG/\033;z!2\f\0270\032:\t\013i\003A\021A.\002\021\021\024x\016]*m_R$B!\024/bG\")Q,\027a\001=\006!1\017\\8u!\t)s,\003\002aM\t\031\021J\034;\t\017\tL\006\023!a\001=\006)1m\\;oi\"9A-\027I\001\002\004)\027!\0033je\026\034G/[8o!\r)\003G\032\t\003O6l\021\001\033\006\003S*\fA!\036;jY*\021qa\033\006\003YV\ta\"\\5oK\016\024\030M\032;g_J<W-\003\002oQ\nqai\034:hK\022K'/Z2uS>t\007\"\0029\001\t\003\031\023\001\0043s_B\fE\016\\*m_R\034\b\"\002:\001\t\003\031\030!E:qC^t7\013^1dW&swk\034:mIR\031A/_>\021\005U<X\"\001<\013\005U*\026B\001=w\005))e\016^5us&#X-\034\005\006uF\004\rAM\001\006gR\f7m\033\005\bIF\004\n\0211\001f\021\035i\b!%A\005\002y\f!\003\032:paNcw\016\036\023eK\032\fW\017\034;%eU\tqPK\002_\003\003Y#!a\001\021\t\005\025\021qB\007\003\003\017QA!!\003\002\f\005IQO\\2iK\016\\W\r\032\006\004\003\0331\023AC1o]>$\030\r^5p]&!\021\021CA\004\005E)hn\0315fG.,GMV1sS\006t7-\032\005\n\003+\001\021\023!C\001\003/\t!\003\032:paNcw\016\036\023eK\032\fW\017\034;%gU\021\021\021\004\026\004K\006\005\001\"CA\017\001E\005I\021AA\f\003m\031\b/Y<o'R\f7m[%o/>\024H\016\032\023eK\032\fW\017\034;%e!q\021\021\005\001\021\002\007\005\t\021\"\003\002$\005\035\022AG:va\026\024HE]3bI\032\023x.\034(C)\032{'oU3sm\026\024Hc\001\023\002&!1\001)a\bA\002\005K!!P\016\t\035\005-\002\001%A\002\002\003%I!!\f\0022\005I2/\0369fe\022:(/\033;f)>t%\t\026$peN+'O^3s)\r!\023q\006\005\007\001\006%\002\031A!\n\005\035[\002")
/*    */ public interface Inventory extends TileEntity, Inventory { Option<ItemStack>[] li$cil$oc$common$tileentity$traits$Inventory$$inventory(); Option<ItemStack>[] items(); void readFromNBTForServer(NBTTagCompound paramNBTTagCompound);
/*    */   void writeToNBTForServer(NBTTagCompound paramNBTTagCompound);
/*    */   boolean func_70300_a(EntityPlayer paramEntityPlayer);
/*    */   boolean dropSlot(int paramInt1, int paramInt2, Option<ForgeDirection> paramOption);
/*    */   int dropSlot$default$2();
/*    */   Option<ForgeDirection> dropSlot$default$3();
/*    */   void dropAllSlots();
/*    */   EntityItem spawnStackInWorld(ItemStack paramItemStack, Option<ForgeDirection> paramOption);
/*    */   Option<ForgeDirection> spawnStackInWorld$default$2();
/*    */   public final class Inventory$$anonfun$li$cil$oc$common$tileentity$traits$Inventory$$inventory$1 extends AbstractFunction0<None$> implements Serializable { public final None$ apply() {
/* 12 */       return None$.MODULE$;
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public Inventory$$anonfun$li$cil$oc$common$tileentity$traits$Inventory$$inventory$1(Inventory $outer) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\Inventory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */