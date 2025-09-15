/*     */ package li.cil.oc.client.gui;
/*     */ 
/*     */ import net.minecraft.inventory.Slot;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple3;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005-d\001B\001\003\0015\021\021\"Q:tK6\024G.\032:\013\005\r!\021aA4vS*\021QAB\001\007G2LWM\034;\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001a\005\002\001\035A\031q\002\005\n\016\003\tI!!\005\002\003'\021Kh.Y7jG\036+\030nQ8oi\006Lg.\032:\021\005MAR\"\001\013\013\005U1\022!C2p]R\f\027N\\3s\025\t9b!\001\004d_6lwN\\\005\003\003QA\001B\007\001\003\002\003\006IaG\001\020a2\f\0270\032:J]Z,g\016^8ssB\021A$J\007\002;)\021adH\001\007a2\f\0270\032:\013\005\001\n\023AB3oi&$\030P\003\002#G\005IQ.\0338fGJ\fg\r\036\006\002I\005\031a.\032;\n\005\031j\"aD%om\026tGo\034:z!2\f\0270\032:\t\021!\002!Q1A\005\002%\n\021\"Y:tK6\024G.\032:\026\003)\002\"a\013\030\016\0031R!!\f\f\002\025QLG.Z3oi&$\0300\003\002\002Y!A\001\007\001B\001B\003%!&\001\006bgN,WN\0317fe\002BQA\r\001\005\002M\na\001P5oSRtDc\001\0336mA\021q\002\001\005\0065E\002\ra\007\005\006QE\002\rA\013\005\006q\001!I!O\001\016_:\034Fn\034;DQ\006tw-\0323\025\005i\002\005CA\036?\033\005a$\"A\037\002\013M\034\027\r\\1\n\005}b$\001B+oSRDQ!Q\034A\002\t\013Aa\0357piB\0211IR\007\002\t*\021Q)I\001\nS:4XM\034;pefL!a\022#\003\tMcw\016\036\005\b\023\002\001\r\021\"\001K\003\021IgNZ8\026\003-\0032a\017'O\023\tiEH\001\004PaRLwN\034\t\006w=\013FKW\005\003!r\022a\001V;qY\026\034\004CA\036S\023\t\031FHA\004C_>dW-\0318\021\005UCV\"\001,\013\005]\013\023\001B;uS2L!!\027,\003\035%\033\005.\031;D_6\004xN\\3oiB\0311h\027+\n\005qc$!B!se\006L\bb\0020\001\001\004%\taX\001\tS:4wn\030\023fcR\021!\b\031\005\bCv\013\t\0211\001L\003\rAH%\r\005\007G\002\001\013\025B&\002\013%tgm\034\021\t\023\025\004\001\031!a\001\n#1\027!\003:v]\n+H\017^8o+\0059\007CA\bi\023\tI'AA\006J[\006<WMQ;ui>t\007\"C6\001\001\004\005\r\021\"\005m\0035\021XO\034\"viR|gn\030\023fcR\021!(\034\005\bC*\f\t\0211\001h\021\031y\007\001)Q\005O\006Q!/\0368CkR$xN\034\021\t\017E\004!\031!C\005e\006A\001O]8he\026\0348/F\001t!\t!x/D\001v\025\t1(!\001\004xS\022<W\r^\005\003qV\0241\002\025:pOJ,7o\035\"be\"1!\020\001Q\001\nM\f\021\002\035:pOJ,7o\035\021\t\013q\004A\021\002&\002\021Y\fG.\0333bi\026DQA \001\005\n}\f\001bY1o\005VLG\016Z\013\002#\"9\0211\001\001\005R\005\025\021aD1di&|g\016U3sM>\024X.\0323\025\007i\n9\001\003\005\002\n\005\005\001\031AA\006\003\031\021W\017\036;p]B!\021QBA\n\033\t\tyAC\002\004\003#Q!!B\021\n\t\005U\021q\002\002\n\017VL')\036;u_:Dq!!\007\001\t\003\nY\"A\004j]&$x)^5\025\003iBq!a\b\001\t\003\n\t#\001\017ee\006<8+Z2p]\022\f'/\037$pe\026<'o\\;oI2\013\0270\032:\025\013i\n\031#!\f\t\021\005\025\022Q\004a\001\003O\ta!\\8vg\026D\006cA\036\002*%\031\0211\006\037\003\007%sG\017\003\005\0020\005u\001\031AA\024\003\031iw.^:f3\"9\0211\007\001\005\n\005U\022A\0034pe6\fG\017V5nKR!\021qGA#!\021\tI$a\020\017\007m\nY$C\002\002>q\na\001\025:fI\0264\027\002BA!\003\007\022aa\025;sS:<'bAA\037y!A\021qIA\031\001\004\t9#A\004tK\016|g\016Z:\t\017\005-\003\001\"\021\002N\005yBM]1x\017VL7i\0348uC&tWM\035\"bG.<'o\\;oI2\013\0270\032:\025\017i\ny%!\027\002\\!A\021\021KA%\001\004\t\031&\001\002eiB\0311(!\026\n\007\005]CHA\003GY>\fG\017\003\005\002&\005%\003\031AA\024\021!\ty#!\023A\002\005\035\002bBA0\001\021E\023\021M\001\021IJ\fw\017R5tC\ndW\rZ*m_R$2AOA2\021\035\t\025Q\fa\001\003K\0022aEA4\023\r\tI\007\006\002\016\007>l\007o\0348f]R\034Fn\034;")
/*     */ public class Assembler extends DynamicGuiContainer<Assembler> {
/*     */   private final li.cil.oc.common.tileentity.Assembler assembler;
/*     */   private Option<Tuple3<Object, IChatComponent, IChatComponent[]>> info;
/*     */   private ImageButton runButton;
/*     */   private final ProgressBar progress;
/*     */   
/*  20 */   public li.cil.oc.common.tileentity.Assembler assembler() { return this.assembler; } public Assembler(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Assembler assembler) { super(new Assembler(playerInventory, assembler));
/*  21 */     this.field_146999_f = 176;
/*  22 */     this.field_147000_g = 192;
/*     */     
/*  24 */     WrapAsScala$.MODULE$.asScalaBuffer(this.field_147002_h.field_75151_b).foreach((Function1)new Assembler$$anonfun$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     this.info = (Option<Tuple3<Object, IChatComponent, IChatComponent[]>>)None$.MODULE$;
/*     */ 
/*     */ 
/*     */     
/*  39 */     this.progress = (ProgressBar)addWidget(new ProgressBar(28, 92)); } public final class Assembler$$anonfun$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Object slot) { Object object = slot; if (object instanceof ComponentSlot) { Object object1 = object; ((ComponentSlot)object1).changeListener_$eq(Option$.MODULE$.apply(new Assembler$$anonfun$1$$anonfun$apply$1(this))); BoxedUnit boxedUnit = BoxedUnit.UNIT; } else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }  } public Assembler$$anonfun$1(Assembler $outer) {} public final class Assembler$$anonfun$1$$anonfun$apply$1 extends AbstractFunction1<Slot, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Slot slot) { this.$outer.li$cil$oc$client$gui$Assembler$$anonfun$$$outer().li$cil$oc$client$gui$Assembler$$onSlotChanged(slot); } public Assembler$$anonfun$1$$anonfun$apply$1(Assembler$$anonfun$1 $outer) {} } } public void li$cil$oc$client$gui$Assembler$$onSlotChanged(Slot slot) { (runButton()).field_146124_l = canBuild(); runButton().toggled_$eq(!(runButton()).field_146124_l); info_$eq(validate()); } public Option<Tuple3<Object, IChatComponent, IChatComponent[]>> info() { return this.info; } private ProgressBar progress() { return this.progress; }
/*     */   public void info_$eq(Option<Tuple3<Object, IChatComponent, IChatComponent[]>> x$1) { this.info = x$1; }
/*  41 */   public ImageButton runButton() { return this.runButton; } public void runButton_$eq(ImageButton x$1) { this.runButton = x$1; } private Option<Tuple3<Object, IChatComponent, IChatComponent[]>> validate() { return AssemblerTemplates$.MODULE$.select(inventoryContainer().func_75139_a(0).func_75211_c()).map((Function1)new Assembler$$anonfun$validate$1(this)); } public final class Assembler$$anonfun$validate$1 extends AbstractFunction1<AssemblerTemplates.Template, Tuple3<Object, IChatComponent, IChatComponent[]>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple3<Object, IChatComponent, IChatComponent[]> apply(AssemblerTemplates.Template x$1) { return x$1.validate(((Player)this.$outer.inventoryContainer()).otherInventory()); }
/*     */      public Assembler$$anonfun$validate$1(Assembler $outer) {} }
/*  43 */   private boolean canBuild() { return (!inventoryContainer().isAssembling() && validate().exists((Function1)new Assembler$$anonfun$canBuild$1(this))); } public final class Assembler$$anonfun$canBuild$1 extends AbstractFunction1<Tuple3<Object, IChatComponent, IChatComponent[]>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple3 x$2) { return BoxesRunTime.unboxToBoolean(x$2._1()); }
/*     */      public Assembler$$anonfun$canBuild$1(Assembler $outer) {} }
/*     */   public void func_146284_a(GuiButton button) {
/*  46 */     if (button.field_146127_k == 0 && canBuild()) {
/*  47 */       PacketSender$.MODULE$.sendRobotAssemblerStart(assembler());
/*     */     }
/*     */   }
/*     */   
/*     */   public void func_73866_w_() {
/*  52 */     super.func_73866_w_();
/*  53 */     int x$4 = 0, x$5 = this.field_147003_i + 7, x$6 = this.field_147009_r + 89, x$7 = 18, x$8 = 18; ResourceLocation x$9 = Textures$.MODULE$.guiButtonRun(); boolean x$10 = true; String x$11 = ImageButton$.MODULE$.$lessinit$greater$default$7(); int x$12 = ImageButton$.MODULE$.$lessinit$greater$default$9(), x$13 = ImageButton$.MODULE$.$lessinit$greater$default$10(), x$14 = ImageButton$.MODULE$.$lessinit$greater$default$11(), x$15 = ImageButton$.MODULE$.$lessinit$greater$default$12(); runButton_$eq(new ImageButton(x$4, x$5, x$6, x$7, x$8, x$9, x$11, x$10, x$12, x$13, x$14, x$15));
/*  54 */     add(this.field_146292_n, runButton());
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawSecondaryForegroundLayer(int mouseX, int mouseY) {
/*     */     // Byte code:
/*     */     //   0: ldc 1048575
/*     */     //   2: invokestatic glPushAttrib : (I)V
/*     */     //   5: aload_0
/*     */     //   6: invokevirtual inventoryContainer : ()Lnet/minecraft/inventory/Container;
/*     */     //   9: checkcast li/cil/oc/common/container/Assembler
/*     */     //   12: invokevirtual isAssembling : ()Z
/*     */     //   15: ifeq -> 129
/*     */     //   18: aload_0
/*     */     //   19: aload_0
/*     */     //   20: invokespecial progress : ()Lli/cil/oc/client/gui/widget/ProgressBar;
/*     */     //   23: invokevirtual x : ()I
/*     */     //   26: aload_0
/*     */     //   27: invokespecial progress : ()Lli/cil/oc/client/gui/widget/ProgressBar;
/*     */     //   30: invokevirtual y : ()I
/*     */     //   33: aload_0
/*     */     //   34: invokespecial progress : ()Lli/cil/oc/client/gui/widget/ProgressBar;
/*     */     //   37: invokevirtual width : ()I
/*     */     //   40: aload_0
/*     */     //   41: invokespecial progress : ()Lli/cil/oc/client/gui/widget/ProgressBar;
/*     */     //   44: invokevirtual height : ()I
/*     */     //   47: iload_1
/*     */     //   48: iload_2
/*     */     //   49: invokevirtual func_146978_c : (IIIIII)Z
/*     */     //   52: ifeq -> 334
/*     */     //   55: new java/util/ArrayList
/*     */     //   58: dup
/*     */     //   59: invokespecial <init> : ()V
/*     */     //   62: astore #10
/*     */     //   64: aload_0
/*     */     //   65: aload_0
/*     */     //   66: invokevirtual inventoryContainer : ()Lnet/minecraft/inventory/Container;
/*     */     //   69: checkcast li/cil/oc/common/container/Assembler
/*     */     //   72: invokevirtual assemblyRemainingTime : ()I
/*     */     //   75: invokespecial formatTime : (I)Ljava/lang/String;
/*     */     //   78: astore #11
/*     */     //   80: aload #10
/*     */     //   82: getstatic li/cil/oc/Localization$Assembler$.MODULE$ : Lli/cil/oc/Localization$Assembler$;
/*     */     //   85: aload_0
/*     */     //   86: invokevirtual inventoryContainer : ()Lnet/minecraft/inventory/Container;
/*     */     //   89: checkcast li/cil/oc/common/container/Assembler
/*     */     //   92: invokevirtual assemblyProgress : ()D
/*     */     //   95: aload #11
/*     */     //   97: invokevirtual Progress : (DLjava/lang/String;)Ljava/lang/String;
/*     */     //   100: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   103: pop
/*     */     //   104: aload_0
/*     */     //   105: aload #10
/*     */     //   107: iload_1
/*     */     //   108: aload_0
/*     */     //   109: getfield field_147003_i : I
/*     */     //   112: isub
/*     */     //   113: iload_2
/*     */     //   114: aload_0
/*     */     //   115: getfield field_147009_r : I
/*     */     //   118: isub
/*     */     //   119: aload_0
/*     */     //   120: getfield field_146289_q : Lnet/minecraft/client/gui/FontRenderer;
/*     */     //   123: invokevirtual copiedDrawHoveringText : (Ljava/util/List;IILnet/minecraft/client/gui/FontRenderer;)V
/*     */     //   126: goto -> 334
/*     */     //   129: aload_0
/*     */     //   130: invokevirtual inventoryContainer : ()Lnet/minecraft/inventory/Container;
/*     */     //   133: iconst_0
/*     */     //   134: invokevirtual func_75139_a : (I)Lnet/minecraft/inventory/Slot;
/*     */     //   137: invokevirtual func_75216_d : ()Z
/*     */     //   140: ifeq -> 241
/*     */     //   143: aload_0
/*     */     //   144: invokevirtual info : ()Lscala/Option;
/*     */     //   147: astore #4
/*     */     //   149: aload #4
/*     */     //   151: instanceof scala/Some
/*     */     //   154: ifeq -> 206
/*     */     //   157: aload #4
/*     */     //   159: checkcast scala/Some
/*     */     //   162: astore #5
/*     */     //   164: aload #5
/*     */     //   166: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   169: checkcast scala/Tuple3
/*     */     //   172: astore #6
/*     */     //   174: aload #6
/*     */     //   176: ifnull -> 206
/*     */     //   179: aload #6
/*     */     //   181: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   184: checkcast net/minecraft/util/IChatComponent
/*     */     //   187: astore #7
/*     */     //   189: aload #7
/*     */     //   191: ifnull -> 206
/*     */     //   194: aload #7
/*     */     //   196: invokeinterface func_150260_c : ()Ljava/lang/String;
/*     */     //   201: astore #8
/*     */     //   203: goto -> 236
/*     */     //   206: aload_0
/*     */     //   207: invokevirtual inventoryContainer : ()Lnet/minecraft/inventory/Container;
/*     */     //   210: iconst_0
/*     */     //   211: invokevirtual func_75139_a : (I)Lnet/minecraft/inventory/Slot;
/*     */     //   214: invokevirtual func_75216_d : ()Z
/*     */     //   217: ifeq -> 231
/*     */     //   220: getstatic li/cil/oc/Localization$Assembler$.MODULE$ : Lli/cil/oc/Localization$Assembler$;
/*     */     //   223: invokevirtual CollectResult : ()Ljava/lang/String;
/*     */     //   226: astore #8
/*     */     //   228: goto -> 236
/*     */     //   231: ldc_w ''
/*     */     //   234: astore #8
/*     */     //   236: aload #8
/*     */     //   238: goto -> 247
/*     */     //   241: getstatic li/cil/oc/Localization$Assembler$.MODULE$ : Lli/cil/oc/Localization$Assembler$;
/*     */     //   244: invokevirtual InsertTemplate : ()Ljava/lang/String;
/*     */     //   247: astore_3
/*     */     //   248: aload_0
/*     */     //   249: getfield field_146289_q : Lnet/minecraft/client/gui/FontRenderer;
/*     */     //   252: aload_3
/*     */     //   253: bipush #30
/*     */     //   255: bipush #94
/*     */     //   257: ldc_w 4210752
/*     */     //   260: invokevirtual func_78276_b : (Ljava/lang/String;III)I
/*     */     //   263: pop
/*     */     //   264: aload_0
/*     */     //   265: invokevirtual runButton : ()Lli/cil/oc/client/gui/ImageButton;
/*     */     //   268: invokevirtual func_146115_a : ()Z
/*     */     //   271: ifeq -> 334
/*     */     //   274: new java/util/ArrayList
/*     */     //   277: dup
/*     */     //   278: invokespecial <init> : ()V
/*     */     //   281: astore #9
/*     */     //   283: aload #9
/*     */     //   285: getstatic li/cil/oc/Localization$Assembler$.MODULE$ : Lli/cil/oc/Localization$Assembler$;
/*     */     //   288: invokevirtual Run : ()Ljava/lang/String;
/*     */     //   291: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   294: pop
/*     */     //   295: aload_0
/*     */     //   296: invokevirtual info : ()Lscala/Option;
/*     */     //   299: new li/cil/oc/client/gui/Assembler$$anonfun$drawSecondaryForegroundLayer$1
/*     */     //   302: dup
/*     */     //   303: aload_0
/*     */     //   304: aload #9
/*     */     //   306: invokespecial <init> : (Lli/cil/oc/client/gui/Assembler;Ljava/util/ArrayList;)V
/*     */     //   309: invokevirtual foreach : (Lscala/Function1;)V
/*     */     //   312: aload_0
/*     */     //   313: aload #9
/*     */     //   315: iload_1
/*     */     //   316: aload_0
/*     */     //   317: getfield field_147003_i : I
/*     */     //   320: isub
/*     */     //   321: iload_2
/*     */     //   322: aload_0
/*     */     //   323: getfield field_147009_r : I
/*     */     //   326: isub
/*     */     //   327: aload_0
/*     */     //   328: getfield field_146289_q : Lnet/minecraft/client/gui/FontRenderer;
/*     */     //   331: invokevirtual drawHoveringText : (Ljava/util/List;IILnet/minecraft/client/gui/FontRenderer;)V
/*     */     //   334: invokestatic glPopAttrib : ()V
/*     */     //   337: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #58	-> 0
/*     */     //   #59	-> 5
/*     */     //   #81	-> 18
/*     */     //   #82	-> 55
/*     */     //   #83	-> 64
/*     */     //   #84	-> 80
/*     */     //   #85	-> 104
/*     */     //   #61	-> 129
/*     */     //   #64	-> 143
/*     */     //   #65	-> 149
/*     */     //   #66	-> 206
/*     */     //   #67	-> 231
/*     */     //   #64	-> 236
/*     */     //   #62	-> 241
/*     */     //   #60	-> 247
/*     */     //   #69	-> 248
/*     */     //   #70	-> 264
/*     */     //   #71	-> 274
/*     */     //   #72	-> 283
/*     */     //   #73	-> 295
/*     */     //   #78	-> 312
/*     */     //   #87	-> 334
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	338	0	this	Lli/cil/oc/client/gui/Assembler;
/*     */     //   0	338	1	mouseX	I
/*     */     //   0	338	2	mouseY	I
/*     */     //   64	62	10	tooltip	Ljava/util/ArrayList;
/*     */     //   80	46	11	timeRemaining	Ljava/lang/String;
/*     */     //   189	149	7	value	Lnet/minecraft/util/IChatComponent;
/*     */     //   248	90	3	message	Ljava/lang/String;
/*     */     //   283	51	9	tooltip	Ljava/util/ArrayList;
/*     */   }
/*     */ 
/*     */   
/*     */   public final class Assembler$$anonfun$drawSecondaryForegroundLayer$1
/*     */     extends AbstractFunction1<Tuple3<Object, IChatComponent, IChatComponent[]>, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final ArrayList tooltip$1;
/*     */     
/*     */     public final Object apply(Tuple3 x0$1)
/*     */     {
/*  73 */       Tuple3 tuple3 = x0$1; if (tuple3 != null)
/*  74 */       { boolean valid = BoxesRunTime.unboxToBoolean(tuple3._1()); IChatComponent[] warnings = (IChatComponent[])tuple3._3(); return (valid && warnings.length > 0) ? 
/*  75 */           BoxesRunTime.boxToBoolean(this.tooltip$1.addAll(WrapAsJava$.MODULE$.seqAsJavaList((Seq)Predef$.MODULE$.refArrayOps((Object[])Predef$.MODULE$.refArrayOps((Object[])warnings).map((Function1)new Assembler$$anonfun$drawSecondaryForegroundLayer$1$$anonfun$apply$2(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(String.class)))).toList()))) : BoxedUnit.UNIT; }  throw new MatchError(tuple3); } public Assembler$$anonfun$drawSecondaryForegroundLayer$1(Assembler $outer, ArrayList tooltip$1) {} public final class Assembler$$anonfun$drawSecondaryForegroundLayer$1$$anonfun$apply$2 extends AbstractFunction1<IChatComponent, String> implements Serializable { public static final long serialVersionUID = 0L; public final String apply(IChatComponent x$3) { return x$3.func_150260_c(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Assembler$$anonfun$drawSecondaryForegroundLayer$1$$anonfun$apply$2(Assembler$$anonfun$drawSecondaryForegroundLayer$1 $outer) {} }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String formatTime(int seconds) {
/*  92 */     int arg$macro$3 = seconds;
/*  93 */     Object arg$macro$4 = BoxesRunTime.boxToInteger(seconds / 60); int arg$macro$5 = seconds % 60; return (seconds < 60) ? (new StringOps("0:%02d")).format((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(arg$macro$3) })) : (new StringOps("%s:%02d")).format((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { arg$macro$4, BoxesRunTime.boxToInteger(arg$macro$5) }));
/*     */   }
/*     */   
/*     */   public void func_146976_a(float dt, int mouseX, int mouseY) {
/*  97 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/*  98 */     this.field_146297_k.field_71446_o.func_110577_a(Textures$.MODULE$.guiRobotAssembler());
/*  99 */     func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
/* 100 */     if (inventoryContainer().isAssembling()) { progress().level_$eq(inventoryContainer().assemblyProgress() / 100.0D); }
/* 101 */     else { progress().level_$eq(0.0D); }
/* 102 */      drawWidgets();
/* 103 */     drawInventorySlots();
/*     */   }
/*     */   
/*     */   public void drawDisabledSlot(ComponentSlot slot) {}
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Assembler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */