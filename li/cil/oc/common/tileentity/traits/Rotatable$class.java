/*     */ package li.cil.oc.common.tileentity.traits;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.server.PacketSender$;
/*     */ import li.cil.oc.util.RotationHelper$;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Predef$;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.SetLike;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.RichFloat$;
/*     */ 
/*     */ public abstract class Rotatable$class
/*     */ {
/*     */   public static void $init$(Rotatable $this) {
/*  20 */     (new ForgeDirection[3])[0] = ForgeDirection.UP; (new ForgeDirection[3])[1] = ForgeDirection.NORTH; (new ForgeDirection[3])[2] = ForgeDirection.DOWN; $this.li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction_$eq(new ForgeDirection[3]);
/*     */     
/*  22 */     (new ForgeDirection[4])[0] = ForgeDirection.SOUTH; (new ForgeDirection[4])[1] = ForgeDirection.WEST; (new ForgeDirection[4])[2] = ForgeDirection.NORTH; (new ForgeDirection[4])[3] = ForgeDirection.EAST; $this.li$cil$oc$common$tileentity$traits$Rotatable$_setter_$li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction_$eq(new ForgeDirection[4]);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  29 */     $this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch_$eq(ForgeDirection.NORTH);
/*     */ 
/*     */     
/*  32 */     $this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw_$eq(ForgeDirection.SOUTH);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static ForgeDirection pitch(Rotatable $this) {
/*  38 */     return $this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch();
/*     */   } public static void pitch_$eq(Rotatable $this, ForgeDirection value) {
/*     */     boolean bool;
/*  41 */     ForgeDirection forgeDirection2, forgeDirection1 = value;
/*  42 */     if (ForgeDirection.DOWN.equals(forgeDirection1)) { bool = true; } else if (ForgeDirection.UP.equals(forgeDirection1)) { bool = true; } else { bool = false; }  if (bool) { forgeDirection2 = value; }
/*  43 */     else { forgeDirection2 = ForgeDirection.NORTH; }
/*  44 */      trySetPitchYaw($this, forgeDirection2, $this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw());
/*     */   } public static ForgeDirection yaw(Rotatable $this) {
/*  46 */     return $this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw();
/*     */   } public static void yaw_$eq(Rotatable $this, ForgeDirection value) {
/*     */     boolean bool;
/*  49 */     ForgeDirection forgeDirection2, forgeDirection1 = value;
/*  50 */     if (ForgeDirection.DOWN.equals(forgeDirection1)) { bool = true; } else if (ForgeDirection.UP.equals(forgeDirection1)) { bool = true; } else { bool = false; }  if (bool) { forgeDirection2 = $this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw(); }
/*  51 */     else { forgeDirection2 = value; }
/*     */     
/*     */     trySetPitchYaw($this, $this.pitch(), forgeDirection2);
/*     */   }
/*  55 */   public static boolean setFromEntityPitchAndYaw(Rotatable $this, Entity entity) { return trySetPitchYaw($this, 
/*  56 */         $this.li$cil$oc$common$tileentity$traits$Rotatable$$pitch2Direction()[RichFloat$.MODULE$.round$extension(Predef$.MODULE$.floatWrapper(entity.field_70125_A / 90)) + 1], 
/*  57 */         $this.li$cil$oc$common$tileentity$traits$Rotatable$$yaw2Direction()[RichFloat$.MODULE$.round$extension(Predef$.MODULE$.floatWrapper(entity.field_70177_z / 'Ũ' * 4)) & 0x3]); }
/*     */   public static boolean setFromFacing(Rotatable $this, ForgeDirection value) { boolean bool;
/*     */     boolean bool1;
/*  60 */     ForgeDirection forgeDirection = value;
/*  61 */     if (ForgeDirection.DOWN.equals(forgeDirection)) { bool = true; } else if (ForgeDirection.UP.equals(forgeDirection)) { bool = true; } else { bool = false; }  if (bool) {
/*  62 */       bool1 = trySetPitchYaw($this, value, $this.yaw());
/*     */     } else {
/*  64 */       bool1 = trySetPitchYaw($this, ForgeDirection.NORTH, forgeDirection);
/*     */     } 
/*     */     return bool1; }
/*     */   public static boolean invertRotation(Rotatable $this) { boolean bool;
/*  68 */     ForgeDirection forgeDirection2, forgeDirection1 = $this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch();
/*  69 */     if (ForgeDirection.DOWN.equals(forgeDirection1)) { bool = true; } else if (ForgeDirection.UP.equals(forgeDirection1)) { bool = true; } else { bool = false; }  if (bool) { forgeDirection2 = $this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch().getOpposite(); }
/*  70 */     else { forgeDirection2 = ForgeDirection.NORTH; }
/*  71 */      return trySetPitchYaw($this, forgeDirection2, $this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw().getOpposite()); } public static ForgeDirection facing(Rotatable $this) {
/*     */     boolean bool;
/*  73 */     ForgeDirection forgeDirection2, forgeDirection1 = $this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch();
/*  74 */     if (ForgeDirection.DOWN.equals(forgeDirection1)) { bool = true; } else if (ForgeDirection.UP.equals(forgeDirection1)) { bool = true; } else { bool = false; }  if (bool) { forgeDirection2 = $this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch(); }
/*  75 */     else { forgeDirection2 = $this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw(); }
/*     */     
/*     */     return forgeDirection2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean rotate(Rotatable $this, ForgeDirection axis) {
/*     */     // Byte code:
/*     */     //   0: getstatic li/cil/oc/util/ExtendedWorld$.MODULE$ : Lli/cil/oc/util/ExtendedWorld$;
/*     */     //   3: aload_0
/*     */     //   4: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   9: invokevirtual extendedWorld : (Lnet/minecraft/world/World;)Lli/cil/oc/util/ExtendedWorld$ExtendedWorld;
/*     */     //   12: aload_0
/*     */     //   13: invokeinterface position : ()Lli/cil/oc/util/BlockPosition;
/*     */     //   18: invokevirtual getBlock : (Lli/cil/oc/util/BlockPosition;)Lnet/minecraft/block/Block;
/*     */     //   21: astore_2
/*     */     //   22: aload_2
/*     */     //   23: ifnonnull -> 30
/*     */     //   26: iconst_0
/*     */     //   27: goto -> 312
/*     */     //   30: aload_2
/*     */     //   31: aload_0
/*     */     //   32: invokeinterface world : ()Lnet/minecraft/world/World;
/*     */     //   37: aload_0
/*     */     //   38: invokeinterface x : ()I
/*     */     //   43: aload_0
/*     */     //   44: invokeinterface y : ()I
/*     */     //   49: aload_0
/*     */     //   50: invokeinterface z : ()I
/*     */     //   55: invokevirtual getValidRotations : (Lnet/minecraft/world/World;III)[Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   58: astore_3
/*     */     //   59: aload_3
/*     */     //   60: aconst_null
/*     */     //   61: if_acmpeq -> 311
/*     */     //   64: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   67: aload_3
/*     */     //   68: checkcast [Ljava/lang/Object;
/*     */     //   71: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   74: aload_1
/*     */     //   75: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   80: ifeq -> 311
/*     */     //   83: aload_0
/*     */     //   84: invokeinterface facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   89: aload_1
/*     */     //   90: invokevirtual getRotation : (Lnet/minecraftforge/common/util/ForgeDirection;)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   93: astore #6
/*     */     //   95: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   98: aload #6
/*     */     //   100: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   103: ifeq -> 112
/*     */     //   106: iconst_1
/*     */     //   107: istore #7
/*     */     //   109: goto -> 132
/*     */     //   112: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   115: aload #6
/*     */     //   117: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   120: ifeq -> 129
/*     */     //   123: iconst_1
/*     */     //   124: istore #7
/*     */     //   126: goto -> 132
/*     */     //   129: iconst_0
/*     */     //   130: istore #7
/*     */     //   132: iload #7
/*     */     //   134: ifeq -> 210
/*     */     //   137: aload #6
/*     */     //   139: aload_0
/*     */     //   140: invokeinterface pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   145: astore #9
/*     */     //   147: dup
/*     */     //   148: ifnonnull -> 160
/*     */     //   151: pop
/*     */     //   152: aload #9
/*     */     //   154: ifnull -> 168
/*     */     //   157: goto -> 190
/*     */     //   160: aload #9
/*     */     //   162: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 190
/*     */     //   168: new scala/Tuple2
/*     */     //   171: dup
/*     */     //   172: aload #6
/*     */     //   174: aload_0
/*     */     //   175: invokeinterface yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   180: aload_1
/*     */     //   181: invokevirtual getRotation : (Lnet/minecraftforge/common/util/ForgeDirection;)Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   184: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   187: goto -> 205
/*     */     //   190: new scala/Tuple2
/*     */     //   193: dup
/*     */     //   194: aload #6
/*     */     //   196: aload_0
/*     */     //   197: invokeinterface yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   202: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   205: astore #8
/*     */     //   207: goto -> 224
/*     */     //   210: new scala/Tuple2
/*     */     //   213: dup
/*     */     //   214: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   217: aload #6
/*     */     //   219: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   222: astore #8
/*     */     //   224: aload #8
/*     */     //   226: astore #5
/*     */     //   228: aload #5
/*     */     //   230: ifnull -> 301
/*     */     //   233: aload #5
/*     */     //   235: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   238: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */     //   241: astore #10
/*     */     //   243: aload #5
/*     */     //   245: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   248: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */     //   251: astore #11
/*     */     //   253: new scala/Tuple2
/*     */     //   256: dup
/*     */     //   257: aload #10
/*     */     //   259: aload #11
/*     */     //   261: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   264: astore #12
/*     */     //   266: aload #12
/*     */     //   268: astore #4
/*     */     //   270: aload #4
/*     */     //   272: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   275: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */     //   278: astore #13
/*     */     //   280: aload #4
/*     */     //   282: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   285: checkcast net/minecraftforge/common/util/ForgeDirection
/*     */     //   288: astore #14
/*     */     //   290: aload_0
/*     */     //   291: aload #13
/*     */     //   293: aload #14
/*     */     //   295: invokestatic trySetPitchYaw : (Lli/cil/oc/common/tileentity/traits/Rotatable;Lnet/minecraftforge/common/util/ForgeDirection;Lnet/minecraftforge/common/util/ForgeDirection;)Z
/*     */     //   298: goto -> 312
/*     */     //   301: new scala/MatchError
/*     */     //   304: dup
/*     */     //   305: aload #5
/*     */     //   307: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   310: athrow
/*     */     //   311: iconst_0
/*     */     //   312: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #79	-> 0
/*     */     //   #80	-> 22
/*     */     //   #93	-> 26
/*     */     //   #81	-> 30
/*     */     //   #82	-> 59
/*     */     //   #83	-> 83
/*     */     //   #84	-> 95
/*     */     //   #85	-> 137
/*     */     //   #86	-> 190
/*     */     //   #85	-> 205
/*     */     //   #87	-> 210
/*     */     //   #83	-> 224
/*     */     //   #89	-> 290
/*     */     //   #83	-> 301
/*     */     //   #91	-> 311
/*     */     //   #78	-> 312
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	313	0	$this	Lli/cil/oc/common/tileentity/traits/Rotatable;
/*     */     //   0	313	1	axis	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   22	291	2	block	Lnet/minecraft/block/Block;
/*     */     //   59	254	3	valid	[Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   243	70	10	newPitch	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   253	60	11	newYaw	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   280	18	13	newPitch	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   290	8	14	newYaw	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ForgeDirection toLocal(Rotatable $this, ForgeDirection value) {
/*  96 */     return RotationHelper$.MODULE$.toLocal($this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch(), $this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw(), value);
/*     */   } public static ForgeDirection toGlobal(Rotatable $this, ForgeDirection value) {
/*  98 */     return RotationHelper$.MODULE$.toGlobal($this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch(), $this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw(), value);
/*     */   } public static ForgeDirection[] validFacings(Rotatable $this) {
/* 100 */     (new ForgeDirection[4])[0] = ForgeDirection.NORTH; (new ForgeDirection[4])[1] = ForgeDirection.SOUTH; (new ForgeDirection[4])[2] = ForgeDirection.WEST; (new ForgeDirection[4])[3] = ForgeDirection.EAST; return new ForgeDirection[4];
/*     */   }
/*     */ 
/*     */   
/*     */   public static void onRotationChanged(Rotatable $this) {
/* 105 */     if ($this.isServer()) {
/* 106 */       PacketSender$.MODULE$.sendRotatableState($this);
/*     */     } else {
/*     */       
/* 109 */       $this.world().func_147471_g($this.x(), $this.y(), $this.z());
/*     */     } 
/* 111 */     $this.world().func_147459_d($this.x(), $this.y(), $this.z(), $this.block());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void readFromNBTForServer(Rotatable $this, NBTTagCompound nbt) {
/* 117 */     $this.li$cil$oc$common$tileentity$traits$Rotatable$$super$readFromNBTForServer(nbt);
/* 118 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("pitch").toString())) {
/* 119 */       $this.pitch_$eq(ForgeDirection.getOrientation(nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("pitch").toString())));
/*     */     }
/* 121 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("yaw").toString())) {
/* 122 */       $this.yaw_$eq(ForgeDirection.getOrientation(nbt.func_74762_e((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("yaw").toString())));
/*     */     }
/* 124 */     validatePitchAndYaw($this);
/* 125 */     updateTranslation($this);
/*     */   }
/*     */   
/*     */   public static void writeToNBTForServer(Rotatable $this, NBTTagCompound nbt) {
/* 129 */     $this.li$cil$oc$common$tileentity$traits$Rotatable$$super$writeToNBTForServer(nbt);
/* 130 */     nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("pitch").toString(), $this.pitch().ordinal());
/* 131 */     nbt.func_74768_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("yaw").toString(), $this.yaw().ordinal());
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public static void readFromNBTForClient(Rotatable $this, NBTTagCompound nbt) {
/* 136 */     $this.li$cil$oc$common$tileentity$traits$Rotatable$$super$readFromNBTForClient(nbt);
/* 137 */     $this.pitch_$eq(ForgeDirection.getOrientation(nbt.func_74762_e("pitch")));
/* 138 */     $this.yaw_$eq(ForgeDirection.getOrientation(nbt.func_74762_e("yaw")));
/* 139 */     validatePitchAndYaw($this);
/* 140 */     updateTranslation($this);
/*     */   }
/*     */   
/*     */   public static void writeToNBTForClient(Rotatable $this, NBTTagCompound nbt) {
/* 144 */     $this.li$cil$oc$common$tileentity$traits$Rotatable$$super$writeToNBTForClient(nbt);
/* 145 */     nbt.func_74768_a("pitch", $this.pitch().ordinal());
/* 146 */     nbt.func_74768_a("yaw", $this.yaw().ordinal());
/*     */   }
/*     */   
/*     */   private static void validatePitchAndYaw(Rotatable $this) {
/* 150 */     (new ForgeDirection[3])[0] = ForgeDirection.UP; (new ForgeDirection[3])[1] = ForgeDirection.DOWN; (new ForgeDirection[3])[2] = ForgeDirection.NORTH; if (!((SetLike)Predef$.MODULE$.Set().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new ForgeDirection[3]))).contains($this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch())) {
/* 151 */       $this.li$cil$oc$common$tileentity$traits$Rotatable$$_pitch_$eq(ForgeDirection.NORTH);
/*     */     }
/* 153 */     (new ForgeDirection[4])[0] = ForgeDirection.NORTH; (new ForgeDirection[4])[1] = ForgeDirection.SOUTH; (new ForgeDirection[4])[2] = ForgeDirection.EAST; (new ForgeDirection[4])[3] = ForgeDirection.WEST; if (!((SetLike)Predef$.MODULE$.Set().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new ForgeDirection[4]))).contains($this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw())) {
/* 154 */       $this.li$cil$oc$common$tileentity$traits$Rotatable$$_yaw_$eq(ForgeDirection.SOUTH);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void updateTranslation(Rotatable $this) {
/* 162 */     if ($this.world() != null)
/* 163 */       $this.onRotationChanged(); 
/*     */   }
/*     */   
/*     */   private static boolean trySetPitchYaw(Rotatable $this, ForgeDirection pitch, ForgeDirection yaw) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_3
/*     */     //   2: aload_1
/*     */     //   3: aload_0
/*     */     //   4: invokeinterface li$cil$oc$common$tileentity$traits$Rotatable$$_pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   9: astore #4
/*     */     //   11: dup
/*     */     //   12: ifnonnull -> 24
/*     */     //   15: pop
/*     */     //   16: aload #4
/*     */     //   18: ifnull -> 41
/*     */     //   21: goto -> 32
/*     */     //   24: aload #4
/*     */     //   26: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   29: ifne -> 41
/*     */     //   32: iconst_1
/*     */     //   33: istore_3
/*     */     //   34: aload_0
/*     */     //   35: aload_1
/*     */     //   36: invokeinterface li$cil$oc$common$tileentity$traits$Rotatable$$_pitch_$eq : (Lnet/minecraftforge/common/util/ForgeDirection;)V
/*     */     //   41: aload_2
/*     */     //   42: aload_0
/*     */     //   43: invokeinterface li$cil$oc$common$tileentity$traits$Rotatable$$_yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   48: astore #5
/*     */     //   50: dup
/*     */     //   51: ifnonnull -> 63
/*     */     //   54: pop
/*     */     //   55: aload #5
/*     */     //   57: ifnull -> 80
/*     */     //   60: goto -> 71
/*     */     //   63: aload #5
/*     */     //   65: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   68: ifne -> 80
/*     */     //   71: iconst_1
/*     */     //   72: istore_3
/*     */     //   73: aload_0
/*     */     //   74: aload_2
/*     */     //   75: invokeinterface li$cil$oc$common$tileentity$traits$Rotatable$$_yaw_$eq : (Lnet/minecraftforge/common/util/ForgeDirection;)V
/*     */     //   80: iload_3
/*     */     //   81: ifeq -> 88
/*     */     //   84: aload_0
/*     */     //   85: invokestatic updateTranslation : (Lli/cil/oc/common/tileentity/traits/Rotatable;)V
/*     */     //   88: iload_3
/*     */     //   89: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #169	-> 0
/*     */     //   #170	-> 2
/*     */     //   #171	-> 32
/*     */     //   #172	-> 34
/*     */     //   #174	-> 41
/*     */     //   #175	-> 71
/*     */     //   #176	-> 73
/*     */     //   #178	-> 80
/*     */     //   #179	-> 84
/*     */     //   #181	-> 88
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	90	0	$this	Lli/cil/oc/common/tileentity/traits/Rotatable;
/*     */     //   0	90	1	pitch	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   0	90	2	yaw	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2	87	3	changed	Z
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\Rotatable$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */