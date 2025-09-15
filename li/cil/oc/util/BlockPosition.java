/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import appeng.api.util.DimensionalCoord;
/*    */ import net.minecraft.util.Vec3;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.math.package$;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0055g\001B\001\003\001-\021QB\0217pG.\004vn]5uS>t'BA\002\005\003\021)H/\0337\013\005\0251\021AA8d\025\t9\001\"A\002dS2T\021!C\001\003Y&\034\001a\005\002\001\031A\021Q\002E\007\002\035)\tq\"A\003tG\006d\027-\003\002\022\035\t1\021I\\=SK\032D\001b\005\001\003\006\004%\t\001F\001\002qV\tQ\003\005\002\016-%\021qC\004\002\004\023:$\b\002C\r\001\005\003\005\013\021B\013\002\005a\004\003\002C\016\001\005\013\007I\021\001\013\002\003eD\001\"\b\001\003\002\003\006I!F\001\003s\002B\001b\b\001\003\006\004%\t\001F\001\002u\"A\021\005\001B\001B\003%Q#\001\002{A!A1\005\001BC\002\023\005A%A\003x_JdG-F\001&!\ria\005K\005\003O9\021aa\0249uS>t\007CA\0250\033\005Q#BA\022,\025\taS&A\005nS:,7M]1gi*\ta&A\002oKRL!\001\r\026\003\013]{'\017\0343\t\021I\002!\021!Q\001\n\025\naa^8sY\022\004\003\"\002\033\001\t\003)\024A\002\037j]&$h\bF\0037qeR4\b\005\0028\0015\t!\001C\003\024g\001\007Q\003C\003\034g\001\007Q\003C\003 g\001\007Q\003C\003$g\001\007Q\005C\0035\001\021\005Q\bF\0037}\t\033E\tC\003\024y\001\007q\b\005\002\016\001&\021\021I\004\002\007\t>,(\r\\3\t\013ma\004\031A \t\013}a\004\031A \t\017\rb\004\023!a\001K!)a\t\001C\001\017\0061qN\0324tKR$2A\016%T\021\025IU\t1\001K\003%!\027N]3di&|g\016\005\002L#6\tAJ\003\002\004\033*\021ajT\001\007G>lWn\0348\013\005Ak\023AD7j]\026\034'/\0314uM>\024x-Z\005\003%2\023aBR8sO\026$\025N]3di&|g\016C\003U\013\002\007Q#A\001o\021\0251\005\001\"\001W)\t1t\013C\003J+\002\007!\nC\003G\001\021\005\021\f\006\003[?\002\f\007CA.^\033\005a&BA\002,\023\tqFL\001\003WK\016\034\004\"B\nY\001\004y\004\"B\016Y\001\004y\004\"B\020Y\001\004y\004\"B2\001\t\003!\027A\0022pk:$7/F\001f!\tYf-\003\002h9\ni\021\t_5t\0032LwM\\3e\005\nCQ!\033\001\005\002)\f!\003^8DQVt7nQ8pe\022Lg.\031;fgV\t1\016\005\002\\Y&\021Q\016\030\002\021\007\",hn[\"p_J$\027N\\1uKNDQa\034\001\005\002A\fa\001^8WK\016\034T#\001.\t\013I\004A\021I:\002\r\025\fX/\0317t)\t!x\017\005\002\016k&\021aO\004\002\b\005>|G.Z1o\021\025A\030\0171\001z\003\ry'M\033\t\003\033iL!a\037\b\003\007\005s\027\020C\003~\001\021\005c0\001\005iCND7i\0343f)\005)raBA\001\005!\005\0211A\001\016\0052|7m\033)pg&$\030n\0348\021\007]\n)A\002\004\002\005!\005\021qA\n\004\003\013a\001b\002\033\002\006\021\005\0211\002\013\003\003\007A\001\"a\004\002\006\021\005\021\021C\001\006CB\004H.\037\013\nm\005M\021QCA\f\0033AaaEA\007\001\004)\002BB\016\002\016\001\007Q\003\003\004 \003\033\001\r!\006\005\007G\0055\001\031\001\025\t\021\005=\021Q\001C\001\003;!rANA\020\003C\t\031\003\003\004\024\0037\001\r!\006\005\0077\005m\001\031A\013\t\r}\tY\0021\001\026\021!\ty!!\002\005\002\005\035B#\003\034\002*\005-\022QFA\030\021\031\031\022Q\005a\001!11$!\nA\002}BaaHA\023\001\004y\004BB\022\002&\001\007\001\006\003\005\002\020\005\025A\021AA\032)\0351\024QGA\034\003sAaaEA\031\001\004y\004BB\016\0022\001\007q\b\003\004 \003c\001\ra\020\005\t\003\037\t)\001\"\001\002>Q\031a'a\020\t\017\005\005\0231\ba\0015\006\ta\017\003\005\002\020\005\025A\021AA#)\0251\024qIA%\021\035\t\t%a\021A\002iCaaIA\"\001\004A\003\002CA\b\003\013!\t!!\024\025\007Y\ny\005\003\005\002R\005-\003\031AA*\003\021Awn\035;\021\t\005U\023qL\007\003\003/RA!!\027\002\\\0059a.\032;x_J\\'bAA/\t\005\031\021\r]5\n\t\005\005\024q\013\002\020\013:4\030N]8o[\026tG\017S8ti\"A\021qBA\003\t\003\t)\007F\0027\003OB\001\"!\033\002d\001\007\0211N\001\007K:$\030\016^=\021\t\0055\024\021O\007\003\003_R1!!\033,\023\021\t\031(a\034\003\r\025sG/\033;z\021!\ty!!\002\005\002\005]Dc\001\034\002z!A\0211PA;\001\004\ti(A\003d_>\024H\r\005\003\002\000\005%UBAAA\025\r\031\0211\021\006\005\003;\n)I\003\002\002\b\0061\021\r\0359f]\036LA!a#\002\002\n\001B)[7f]NLwN\\1m\007>|'\017\032\025\t\003k\ny)!,\0020B!\021\021SAT\035\021\t\031*a)\016\005\005U%b\001(\002\030*!\021\021TAN\003\r1W\016\034\006\005\003;\013y*\001\003n_\022\034(BAAQ\003\r\031\007o^\005\005\003K\013)*\001\005PaRLwN\\1m\023\021\tI+a+\003\r5+G\017[8e\025\021\t)+!&\002\0135|G-\0333\"\005\005E\026aE1qa2LW\rZ3oKJ<\027n\035;jGN\024\004BCA[\003\013\t\n\021\"\001\0028\006YB\005\\3tg&t\027\016\036\023he\026\fG/\032:%I\0264\027-\0367uIQ*\"!!/+\007\025\nYl\013\002\002>B!\021qXAe\033\t\t\tM\003\003\002D\006\025\027!C;oG\",7m[3e\025\r\t9MD\001\013C:tw\016^1uS>t\027\002BAf\003\003\024\021#\0368dQ\026\0347.\0323WCJL\027M\\2f\001")
/*    */ public class BlockPosition {
/*    */   private final int x;
/*    */   private final int y;
/*    */   
/* 15 */   public int x() { return this.x; } private final int z; private final Option<World> world; public int y() { return this.y; } public int z() { return this.z; } public Option<World> world() { return this.world; } public BlockPosition(int x, int y, int z, Option<World> world) {} public BlockPosition(double x, double y, double z, Option<World> world) {
/* 16 */     this(
/* 17 */         (int)package$.MODULE$.floor(x), 
/* 18 */         (int)package$.MODULE$.floor(y), 
/* 19 */         (int)package$.MODULE$.floor(z), 
/* 20 */         world);
/*    */   }
/*    */   public BlockPosition offset(ForgeDirection direction, int n) {
/* 23 */     return new BlockPosition(
/* 24 */         x() + direction.offsetX * n, 
/* 25 */         y() + direction.offsetY * n, 
/* 26 */         z() + direction.offsetZ * n, 
/* 27 */         world());
/*    */   }
/*    */   public BlockPosition offset(ForgeDirection direction) {
/* 30 */     return offset(direction, 1);
/*    */   } public Vec3 offset(double x, double y, double z) {
/* 32 */     return Vec3.func_72443_a(x() + x, y() + y, z() + z);
/*    */   } public AxisAlignedBB bounds() {
/* 34 */     return AxisAlignedBB.func_72330_a(x(), y(), z(), (x() + 1), (y() + 1), (z() + 1));
/*    */   } public ChunkCoordinates toChunkCoordinates() {
/* 36 */     return new ChunkCoordinates(x(), y(), z());
/*    */   } public Vec3 toVec3() {
/* 38 */     return Vec3.func_72443_a(x() + 0.5D, y() + 0.5D, z() + 0.5D);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object obj) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: astore_2
/*    */     //   2: aload_2
/*    */     //   3: instanceof li/cil/oc/util/BlockPosition
/*    */     //   6: ifeq -> 88
/*    */     //   9: aload_2
/*    */     //   10: checkcast li/cil/oc/util/BlockPosition
/*    */     //   13: astore_3
/*    */     //   14: aload_3
/*    */     //   15: invokevirtual x : ()I
/*    */     //   18: aload_0
/*    */     //   19: invokevirtual x : ()I
/*    */     //   22: if_icmpne -> 82
/*    */     //   25: aload_3
/*    */     //   26: invokevirtual y : ()I
/*    */     //   29: aload_0
/*    */     //   30: invokevirtual y : ()I
/*    */     //   33: if_icmpne -> 82
/*    */     //   36: aload_3
/*    */     //   37: invokevirtual z : ()I
/*    */     //   40: aload_0
/*    */     //   41: invokevirtual z : ()I
/*    */     //   44: if_icmpne -> 82
/*    */     //   47: aload_3
/*    */     //   48: invokevirtual world : ()Lscala/Option;
/*    */     //   51: aload_0
/*    */     //   52: invokevirtual world : ()Lscala/Option;
/*    */     //   55: astore #5
/*    */     //   57: dup
/*    */     //   58: ifnonnull -> 70
/*    */     //   61: pop
/*    */     //   62: aload #5
/*    */     //   64: ifnull -> 78
/*    */     //   67: goto -> 82
/*    */     //   70: aload #5
/*    */     //   72: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   75: ifeq -> 82
/*    */     //   78: iconst_1
/*    */     //   79: goto -> 83
/*    */     //   82: iconst_0
/*    */     //   83: istore #4
/*    */     //   85: goto -> 95
/*    */     //   88: aload_0
/*    */     //   89: aload_1
/*    */     //   90: invokespecial equals : (Ljava/lang/Object;)Z
/*    */     //   93: istore #4
/*    */     //   95: iload #4
/*    */     //   97: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #40	-> 0
/*    */     //   #41	-> 2
/*    */     //   #42	-> 88
/*    */     //   #40	-> 95
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	98	0	this	Lli/cil/oc/util/BlockPosition;
/*    */     //   0	98	1	obj	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 54 */     return Hashing.goodFastHash(32).newHasher(16).putInt(x()).putInt(y()).putInt(z()).putInt(world().hashCode()).hash().asInt();
/*    */   }
/*    */   
/*    */   public static Option<World> $lessinit$greater$default$4() {
/*    */     return BlockPosition$.MODULE$.$lessinit$greater$default$4();
/*    */   }
/*    */   
/*    */   @Method(modid = "appliedenergistics2")
/*    */   public static BlockPosition apply(DimensionalCoord paramDimensionalCoord) {
/*    */     return BlockPosition$.MODULE$.apply(paramDimensionalCoord);
/*    */   }
/*    */   
/*    */   public static BlockPosition apply(Entity paramEntity) {
/*    */     return BlockPosition$.MODULE$.apply(paramEntity);
/*    */   }
/*    */   
/*    */   public static BlockPosition apply(EnvironmentHost paramEnvironmentHost) {
/*    */     return BlockPosition$.MODULE$.apply(paramEnvironmentHost);
/*    */   }
/*    */   
/*    */   public static BlockPosition apply(Vec3 paramVec3, World paramWorld) {
/*    */     return BlockPosition$.MODULE$.apply(paramVec3, paramWorld);
/*    */   }
/*    */   
/*    */   public static BlockPosition apply(Vec3 paramVec3) {
/*    */     return BlockPosition$.MODULE$.apply(paramVec3);
/*    */   }
/*    */   
/*    */   public static BlockPosition apply(double paramDouble1, double paramDouble2, double paramDouble3) {
/*    */     return BlockPosition$.MODULE$.apply(paramDouble1, paramDouble2, paramDouble3);
/*    */   }
/*    */   
/*    */   public static BlockPosition apply(double paramDouble1, double paramDouble2, double paramDouble3, World paramWorld) {
/*    */     return BlockPosition$.MODULE$.apply(paramDouble1, paramDouble2, paramDouble3, paramWorld);
/*    */   }
/*    */   
/*    */   public static BlockPosition apply(int paramInt1, int paramInt2, int paramInt3) {
/*    */     return BlockPosition$.MODULE$.apply(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public static BlockPosition apply(int paramInt1, int paramInt2, int paramInt3, World paramWorld) {
/*    */     return BlockPosition$.MODULE$.apply(paramInt1, paramInt2, paramInt3, paramWorld);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\BlockPosition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */