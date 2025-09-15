/*     */ package li.cil.oc.client.gui;
/*     */ 
/*     */ import codechicken.lib.vec.Rectangle4i;
/*     */ import codechicken.nei.ItemPanel;
/*     */ import li.cil.oc.common.container.ComponentSlot;
/*     */ import li.cil.oc.util.RenderState$;
/*     */ import net.minecraft.client.renderer.Tessellator;
/*     */ import net.minecraft.inventory.Container;
/*     */ import net.minecraft.inventory.Slot;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005\025g!B\001\003\003\003i!a\005#z]\006l\027nY$vS\016{g\016^1j]\026\024(BA\002\005\003\r9W/\033\006\003\013\031\taa\0317jK:$(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001U\021a\"F\n\003\001=\0012\001E\t\024\033\005\021\021B\001\n\003\005I\031Uo\035;p[\036+\030nQ8oi\006Lg.\032:\021\005Q)B\002\001\003\006-\001\021\ra\006\002\002\007F\021\001D\b\t\0033qi\021A\007\006\0027\005)1oY1mC&\021QD\007\002\b\035>$\b.\0338h!\tyb%D\001!\025\t\t#%A\005j]Z,g\016^8ss*\0211\005J\001\n[&tWm\031:bMRT\021!J\001\004]\026$\030BA\024!\005%\031uN\034;bS:,'\017C\005*\001\t\005\t\025!\003\024U\005I1m\0348uC&tWM]\005\003WE\t!#\0338wK:$xN]=D_:$\030-\0338fe\")Q\006\001C\001]\0051A(\0338jiz\"\"a\f\031\021\007A\0011\003C\003*Y\001\0071\003C\0043\001\001\007I\021C\032\002\027!|g/\032:fINcw\016^\013\002iA\031\021$N\034\n\005YR\"AB(qi&|g\016\005\002 q%\021\021\b\t\002\005'2|G\017C\004<\001\001\007I\021\003\037\002\037!|g/\032:fINcw\016^0%KF$\"!\020!\021\005eq\024BA \033\005\021)f.\033;\t\017\005S\024\021!a\001i\005\031\001\020J\031\t\r\r\003\001\025)\0035\0031AwN^3sK\022\034Fn\034;!\021\035)\005\0011A\005\022\031\013q\002[8wKJ,Gm\025;bG.tU)S\013\002\017B\031\021$\016%\021\005%cU\"\001&\013\005-\023\023\001B5uK6L!!\024&\003\023%#X-\\*uC\016\\\007bB(\001\001\004%\t\002U\001\024Q>4XM]3e'R\f7m\033(F\023~#S-\035\013\003{ECq!\021(\002\002\003\007q\t\003\004T\001\001\006KaR\001\021Q>4XM]3e'R\f7m\033(F\023\002BQ!\026\001\005\022Y\013A\004\032:boN+7m\0348eCJLhi\034:fOJ|WO\0343MCf,'\017F\002>/rCQ\001\027+A\002e\013a!\\8vg\026D\006CA\r[\023\tY&DA\002J]RDQ!\030+A\002e\013a!\\8vg\026L\006\"B0\001\t#\002\027a\b3sC^<U/[\"p]R\f\027N\\3s\r>\024Xm\032:pk:$G*Y=feR\031Q(\0312\t\013as\006\031A-\t\013us\006\031A-\t\013\021\004A\021C3\0029\021\024\030m^*fG>tG-\031:z\005\006\0347n\032:pk:$G*Y=feR\tQ\bC\003h\001\021E\003.A\020ee\006<x)^5D_:$\030-\0338fe\n\0137m[4s_VtG\rT1zKJ$B!P5o_\")!N\032a\001W\006\021A\r\036\t\00331L!!\034\016\003\013\031cw.\031;\t\013a3\007\031A-\t\013u3\007\031A-\t\013E\004A\021C3\002%\021\024\030m^%om\026tGo\034:z'2|Go\035\005\006g\002!\t\005^\001\013IJ\fwoU2sK\026tG\003B\037vm^DQ\001\027:A\002eCQ!\030:A\002eCQA\033:A\002-DQ!\037\001\005\022i\f\021\003\032:boNcw\016^%om\026tGo\034:z)\ti4\020C\003}q\002\007q'\001\003tY>$\b\"\002@\001\t#y\030!\0053sC^\034Fn\034;IS\036DG.[4iiR\031Q(!\001\t\013ql\b\031A\034\t\017\005\025\001\001\"\003\002\b\005y\021n]*fY\026\034G/\033<f'2|G\017\006\003\002\n\005=\001cA\r\002\f%\031\021Q\002\016\003\017\t{w\016\\3b]\"1A0a\001A\002]Bq!a\005\001\t#\t)\"\001\tee\006<H)[:bE2,Gm\0257piR\031Q(a\006\t\017q\f\t\0021\001\002\032A!\0211DA\022\033\t\tiBC\002*\003?Q1!!\t\007\003\031\031w.\\7p]&!\021QEA\017\0055\031u.\0349p]\026tGo\0257pi\"9\021\021\006\001\005\022\005-\022A\0053sC^\034Fn\034;CC\016\\wM]8v]\022$R!PA\027\003cAq!a\f\002(\001\007\021,A\001y\021\035\t\031$a\nA\002e\013\021!\037\005\b\003o\001A\021KA\035\003A!'/Y<He\006$\027.\0328u%\026\034G\017F\007>\003w\ty$a\021\002H\005-\023q\n\005\b\003{\t)\0041\001Z\003\021\001\030M]\031\t\017\005\005\023Q\007a\0013\006!\001/\031:3\021\035\t)%!\016A\002e\013A\001]1sg!9\021\021JA\033\001\004I\026\001\0029beRBq!!\024\0026\001\007\021,\001\003qCJ,\004bBA)\003k\001\r!W\001\005a\006\024h\007C\004\002V\001!\t%a\026\002;\021\024\030m\036+fqR,(/\0323N_\022,GNU3di\032\023x.\\%d_:$2\"PA-\0037\ni&!\034\002r!9\021qFA*\001\004I\006bBA\032\003'\002\r!\027\005\t\003?\n\031\0061\001\002b\005!\021nY8o!\021\t\031'!\033\016\005\005\025$bAA4E\005!Q\017^5m\023\021\tY'!\032\003\013%K5m\0348\t\017\005=\0241\013a\0013\006)q/\0333uQ\"9\0211OA*\001\004I\026A\0025fS\036DG\017C\004\002x\001!I!!\037\002\037%\034\bk\\5oi&s'+Z4j_:$b\"!\003\002|\005}\0241QAD\003\027\013y\tC\004\002~\005U\004\031A-\002\005ID\bbBAA\003k\002\r!W\001\003efDq!!\"\002v\001\007\021,\001\002so\"9\021\021RA;\001\004I\026A\001:i\021\035\ti)!\036A\002e\013!\001\035=\t\017\005E\025Q\017a\0013\006\021\001/\037\005\b\003+\003A\021BAL\003MI7/\0238QY\006LXM]%om\026tGo\034:z)\021\tI!!'\t\rq\f\031\n1\0018\021\031\ti\n\001C\005K\006\tBM]1x\035\026K\005*[4iY&<\007\016^:)\021\005m\025\021UA`\003\003\004B!a)\002::!\021QUA[\033\t\t9K\003\003\002\"\005%&\002BAV\003[\0131AZ7m\025\021\ty+!-\002\t5|Gm\035\006\003\003g\0131a\0319x\023\021\t9,a*\002\021=\003H/[8oC2LA!a/\002>\n1Q*\032;i_\022TA!a.\002(\006)Qn\0343jI\006\022\0211Y\001\017\035>$XI\\8vO\"LE/Z7t\001")
/*     */ public abstract class DynamicGuiContainer<C extends Container> extends CustomGuiContainer<C> {
/*     */   private Option<Slot> hoveredSlot;
/*     */   
/*  25 */   public DynamicGuiContainer(Container container) { super((C)container);
/*  26 */     this.hoveredSlot = (Option<Slot>)None$.MODULE$;
/*     */     
/*  28 */     this.hoveredStackNEI = (Option<ItemStack>)None$.MODULE$; } private Option<ItemStack> hoveredStackNEI; public Option<Slot> hoveredSlot() { return this.hoveredSlot; } public void hoveredSlot_$eq(Option<Slot> x$1) { this.hoveredSlot = x$1; } public Option<ItemStack> hoveredStackNEI() { return this.hoveredStackNEI; } public void hoveredStackNEI_$eq(Option<ItemStack> x$1) { this.hoveredStackNEI = x$1; }
/*     */   
/*     */   public void drawSecondaryForegroundLayer(int mouseX, int mouseY) {
/*  31 */     this.field_146289_q.func_78276_b(
/*  32 */         Localization$.MODULE$.localizeImmediately("container.inventory"), 
/*  33 */         8, this.field_147000_g - 96 + 2, 4210752);
/*     */   }
/*     */   
/*     */   public void func_146979_b(int mouseX, int mouseY) {
/*  37 */     GL11.glPushAttrib(1048575);
/*     */     
/*  39 */     drawSecondaryForegroundLayer(mouseX, mouseY); RichInt$.MODULE$
/*     */       
/*  41 */       .until$extension0(Predef$.MODULE$.intWrapper(0), this.field_147002_h.field_75151_b.size()).foreach$mVc$sp((Function1)new DynamicGuiContainer$$anonfun$drawGuiContainerForegroundLayer$1(this));
/*     */ 
/*     */ 
/*     */     
/*  45 */     GL11.glPopAttrib();
/*     */   } public final class DynamicGuiContainer$$anonfun$drawGuiContainerForegroundLayer$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int slot) {
/*     */       apply$mcVI$sp(slot);
/*     */     } public DynamicGuiContainer$$anonfun$drawGuiContainerForegroundLayer$1(DynamicGuiContainer $outer) {} public void apply$mcVI$sp(int slot) {
/*     */       this.$outer.drawSlotHighlight(this.$outer.field_147002_h.field_75151_b.get(slot));
/*     */     } } public void drawSecondaryBackgroundLayer() {} public void func_146976_a(float dt, int mouseX, int mouseY) {
/*  51 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  52 */     this.field_146297_k.field_71446_o.func_110577_a(Textures$.MODULE$.guiBackground());
/*  53 */     func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
/*  54 */     drawSecondaryBackgroundLayer();
/*     */     
/*  56 */     RenderState$.MODULE$.makeItBlend();
/*  57 */     GL11.glDisable(2896);
/*     */     
/*  59 */     drawInventorySlots();
/*     */   }
/*     */   
/*     */   public void drawInventorySlots() {
/*  63 */     GL11.glPushMatrix();
/*  64 */     GL11.glTranslatef(this.field_147003_i, this.field_147009_r, 0.0F); RichInt$.MODULE$
/*  65 */       .until$extension0(Predef$.MODULE$.intWrapper(0), this.field_147002_h.field_75151_b.size()).foreach$mVc$sp((Function1)new DynamicGuiContainer$$anonfun$drawInventorySlots$1(this));
/*     */ 
/*     */     
/*  68 */     GL11.glPopMatrix();
/*  69 */     RenderState$.MODULE$.makeItBlend();
/*     */   } public final class DynamicGuiContainer$$anonfun$drawInventorySlots$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final void apply(int slot) { apply$mcVI$sp(slot); } public DynamicGuiContainer$$anonfun$drawInventorySlots$1(DynamicGuiContainer $outer) {} public void apply$mcVI$sp(int slot) { this.$outer.drawSlotInventory(this.$outer.field_147002_h.field_75151_b.get(slot)); } }
/*     */   public void func_73863_a(int mouseX, int mouseY, float dt) {
/*  73 */     hoveredSlot_$eq(((TraversableLike)WrapAsScala$.MODULE$.asScalaBuffer(this.field_147002_h.field_75151_b).collect((PartialFunction)new DynamicGuiContainer$$anonfun$drawScreen$1(this, mouseX, mouseY), Buffer$.MODULE$.canBuildFrom()))
/*     */         
/*  75 */         .headOption());
/*  76 */     hoveredStackNEI_$eq(NEI$.MODULE$.hoveredStack(this, mouseX, mouseY));
/*     */     
/*  78 */     super.func_73863_a(mouseX, mouseY, dt);
/*     */     
/*  80 */     if (Mods$.MODULE$.NotEnoughItems().isAvailable()) {
/*  81 */       GL11.glPushAttrib(1048575);
/*  82 */       drawNEIHighlights();
/*  83 */       GL11.glPopAttrib();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public final class DynamicGuiContainer$$anonfun$drawScreen$1
/*     */     extends AbstractPartialFunction<Object, Slot>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final int mouseX$1;
/*     */     
/*     */     private final int mouseY$1;
/*     */ 
/*     */     
/*     */     public final <A1, B1> B1 applyOrElse(Object x1, Function1 default) {
/*     */       Object object = x1;
/*     */       if (object instanceof Slot) {
/*     */         Slot slot = (Slot)object;
/*     */         if (this.$outer.li$cil$oc$client$gui$DynamicGuiContainer$$isPointInRegion(slot.field_75223_e, slot.field_75221_f, 16, 16, this.mouseX$1, this.mouseY$1)) {
/*     */           return (B1)slot;
/*     */         }
/*     */       } 
/*     */       return (B1)default.apply(x1);
/*     */     }
/*     */ 
/*     */     
/*     */     public final boolean isDefinedAt(Object x1) {
/*     */       Object object = x1;
/*     */       if (object instanceof Slot) {
/*     */         Slot slot = (Slot)object;
/*     */         if (this.$outer.li$cil$oc$client$gui$DynamicGuiContainer$$isPointInRegion(slot.field_75223_e, slot.field_75221_f, 16, 16, this.mouseX$1, this.mouseY$1)) {
/*     */           return true;
/*     */         }
/*     */       } 
/*     */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public DynamicGuiContainer$$anonfun$drawScreen$1(DynamicGuiContainer $outer, int mouseX$1, int mouseY$1) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawSlotInventory(Slot slot) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: astore_2
/*     */     //   2: aload_2
/*     */     //   3: instanceof li/cil/oc/common/container/ComponentSlot
/*     */     //   6: ifeq -> 110
/*     */     //   9: aload_2
/*     */     //   10: checkcast li/cil/oc/common/container/ComponentSlot
/*     */     //   13: astore_3
/*     */     //   14: aload_3
/*     */     //   15: invokeinterface slot : ()Ljava/lang/String;
/*     */     //   20: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   23: invokevirtual None : ()Ljava/lang/String;
/*     */     //   26: astore #4
/*     */     //   28: dup
/*     */     //   29: ifnonnull -> 41
/*     */     //   32: pop
/*     */     //   33: aload #4
/*     */     //   35: ifnull -> 59
/*     */     //   38: goto -> 49
/*     */     //   41: aload #4
/*     */     //   43: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   46: ifne -> 59
/*     */     //   49: aload_3
/*     */     //   50: invokeinterface tier : ()I
/*     */     //   55: iconst_m1
/*     */     //   56: if_icmpne -> 110
/*     */     //   59: aload_1
/*     */     //   60: invokevirtual func_75216_d : ()Z
/*     */     //   63: ifne -> 102
/*     */     //   66: aload_1
/*     */     //   67: getfield field_75223_e : I
/*     */     //   70: iconst_0
/*     */     //   71: if_icmplt -> 102
/*     */     //   74: aload_1
/*     */     //   75: getfield field_75221_f : I
/*     */     //   78: iconst_0
/*     */     //   79: if_icmplt -> 102
/*     */     //   82: aload_3
/*     */     //   83: invokeinterface tierIcon : ()Lnet/minecraft/util/IIcon;
/*     */     //   88: ifnull -> 102
/*     */     //   91: aload_0
/*     */     //   92: aload_3
/*     */     //   93: invokevirtual drawDisabledSlot : (Lli/cil/oc/common/container/ComponentSlot;)V
/*     */     //   96: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   99: goto -> 105
/*     */     //   102: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   105: astore #5
/*     */     //   107: goto -> 245
/*     */     //   110: aload_0
/*     */     //   111: aload_0
/*     */     //   112: getfield field_73735_i : F
/*     */     //   115: iconst_1
/*     */     //   116: i2f
/*     */     //   117: fadd
/*     */     //   118: putfield field_73735_i : F
/*     */     //   121: aload_0
/*     */     //   122: aload_1
/*     */     //   123: invokevirtual li$cil$oc$client$gui$DynamicGuiContainer$$isInPlayerInventory : (Lnet/minecraft/inventory/Slot;)Z
/*     */     //   126: ifne -> 145
/*     */     //   129: aload_0
/*     */     //   130: aload_1
/*     */     //   131: getfield field_75223_e : I
/*     */     //   134: iconst_1
/*     */     //   135: isub
/*     */     //   136: aload_1
/*     */     //   137: getfield field_75221_f : I
/*     */     //   140: iconst_1
/*     */     //   141: isub
/*     */     //   142: invokevirtual drawSlotBackground : (II)V
/*     */     //   145: aload_1
/*     */     //   146: invokevirtual func_75216_d : ()Z
/*     */     //   149: ifne -> 229
/*     */     //   152: aload_1
/*     */     //   153: astore #6
/*     */     //   155: aload #6
/*     */     //   157: instanceof li/cil/oc/common/container/ComponentSlot
/*     */     //   160: ifeq -> 224
/*     */     //   163: aload #6
/*     */     //   165: checkcast li/cil/oc/common/container/ComponentSlot
/*     */     //   168: astore #7
/*     */     //   170: aload #7
/*     */     //   172: invokeinterface tierIcon : ()Lnet/minecraft/util/IIcon;
/*     */     //   177: ifnull -> 224
/*     */     //   180: aload_0
/*     */     //   181: getfield field_146297_k : Lnet/minecraft/client/Minecraft;
/*     */     //   184: invokevirtual func_110434_K : ()Lnet/minecraft/client/renderer/texture/TextureManager;
/*     */     //   187: getstatic net/minecraft/client/renderer/texture/TextureMap.field_110576_c : Lnet/minecraft/util/ResourceLocation;
/*     */     //   190: invokevirtual func_110577_a : (Lnet/minecraft/util/ResourceLocation;)V
/*     */     //   193: aload_0
/*     */     //   194: aload_1
/*     */     //   195: getfield field_75223_e : I
/*     */     //   198: aload_1
/*     */     //   199: getfield field_75221_f : I
/*     */     //   202: aload #7
/*     */     //   204: invokeinterface tierIcon : ()Lnet/minecraft/util/IIcon;
/*     */     //   209: bipush #16
/*     */     //   211: bipush #16
/*     */     //   213: invokevirtual func_94065_a : (IILnet/minecraft/util/IIcon;II)V
/*     */     //   216: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   219: astore #8
/*     */     //   221: goto -> 229
/*     */     //   224: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   227: astore #8
/*     */     //   229: aload_0
/*     */     //   230: aload_0
/*     */     //   231: getfield field_73735_i : F
/*     */     //   234: iconst_1
/*     */     //   235: i2f
/*     */     //   236: fsub
/*     */     //   237: putfield field_73735_i : F
/*     */     //   240: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   243: astore #5
/*     */     //   245: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #88	-> 0
/*     */     //   #89	-> 2
/*     */     //   #90	-> 59
/*     */     //   #91	-> 91
/*     */     //   #90	-> 102
/*     */     //   #94	-> 110
/*     */     //   #95	-> 121
/*     */     //   #96	-> 129
/*     */     //   #98	-> 145
/*     */     //   #99	-> 155
/*     */     //   #100	-> 180
/*     */     //   #101	-> 193
/*     */     //   #99	-> 219
/*     */     //   #102	-> 224
/*     */     //   #104	-> 229
/*     */     //   #93	-> 243
/*     */     //   #88	-> 245
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	246	0	this	Lli/cil/oc/client/gui/DynamicGuiContainer;
/*     */     //   0	246	1	slot	Lnet/minecraft/inventory/Slot;
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawSlotHighlight(Slot slot) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield field_146297_k : Lnet/minecraft/client/Minecraft;
/*     */     //   4: getfield field_71439_g : Lnet/minecraft/client/entity/EntityClientPlayerMP;
/*     */     //   7: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   10: invokevirtual func_70445_o : ()Lnet/minecraft/item/ItemStack;
/*     */     //   13: ifnonnull -> 358
/*     */     //   16: aload_1
/*     */     //   17: astore_2
/*     */     //   18: aload_2
/*     */     //   19: instanceof li/cil/oc/common/container/ComponentSlot
/*     */     //   22: ifeq -> 83
/*     */     //   25: aload_2
/*     */     //   26: checkcast li/cil/oc/common/container/ComponentSlot
/*     */     //   29: astore_3
/*     */     //   30: aload_3
/*     */     //   31: invokeinterface slot : ()Ljava/lang/String;
/*     */     //   36: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   39: invokevirtual None : ()Ljava/lang/String;
/*     */     //   42: astore #4
/*     */     //   44: dup
/*     */     //   45: ifnonnull -> 57
/*     */     //   48: pop
/*     */     //   49: aload #4
/*     */     //   51: ifnull -> 75
/*     */     //   54: goto -> 65
/*     */     //   57: aload #4
/*     */     //   59: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   62: ifne -> 75
/*     */     //   65: aload_3
/*     */     //   66: invokeinterface tier : ()I
/*     */     //   71: iconst_m1
/*     */     //   72: if_icmpne -> 83
/*     */     //   75: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   78: astore #5
/*     */     //   80: goto -> 358
/*     */     //   83: aload_0
/*     */     //   84: aload_1
/*     */     //   85: invokevirtual li$cil$oc$client$gui$DynamicGuiContainer$$isInPlayerInventory : (Lnet/minecraft/inventory/Slot;)Z
/*     */     //   88: istore #6
/*     */     //   90: aload_0
/*     */     //   91: invokevirtual hoveredSlot : ()Lscala/Option;
/*     */     //   94: astore #8
/*     */     //   96: aload #8
/*     */     //   98: instanceof scala/Some
/*     */     //   101: ifeq -> 212
/*     */     //   104: aload #8
/*     */     //   106: checkcast scala/Some
/*     */     //   109: astore #9
/*     */     //   111: aload #9
/*     */     //   113: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   116: checkcast net/minecraft/inventory/Slot
/*     */     //   119: astore #10
/*     */     //   121: aload_0
/*     */     //   122: aload #10
/*     */     //   124: invokevirtual li$cil$oc$client$gui$DynamicGuiContainer$$isInPlayerInventory : (Lnet/minecraft/inventory/Slot;)Z
/*     */     //   127: istore #12
/*     */     //   129: iload #6
/*     */     //   131: iload #12
/*     */     //   133: if_icmpeq -> 206
/*     */     //   136: iload #6
/*     */     //   138: ifeq -> 169
/*     */     //   141: aload_1
/*     */     //   142: invokevirtual func_75216_d : ()Z
/*     */     //   145: ifeq -> 169
/*     */     //   148: aload_0
/*     */     //   149: aload #10
/*     */     //   151: invokevirtual li$cil$oc$client$gui$DynamicGuiContainer$$isSelectiveSlot : (Lnet/minecraft/inventory/Slot;)Z
/*     */     //   154: ifeq -> 169
/*     */     //   157: aload #10
/*     */     //   159: aload_1
/*     */     //   160: invokevirtual func_75211_c : ()Lnet/minecraft/item/ItemStack;
/*     */     //   163: invokevirtual func_75214_a : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   166: ifne -> 202
/*     */     //   169: iload #12
/*     */     //   171: ifeq -> 206
/*     */     //   174: aload #10
/*     */     //   176: invokevirtual func_75216_d : ()Z
/*     */     //   179: ifeq -> 206
/*     */     //   182: aload_0
/*     */     //   183: aload_1
/*     */     //   184: invokevirtual li$cil$oc$client$gui$DynamicGuiContainer$$isSelectiveSlot : (Lnet/minecraft/inventory/Slot;)Z
/*     */     //   187: ifeq -> 206
/*     */     //   190: aload_1
/*     */     //   191: aload #10
/*     */     //   193: invokevirtual func_75211_c : ()Lnet/minecraft/item/ItemStack;
/*     */     //   196: invokevirtual func_75214_a : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   199: ifeq -> 206
/*     */     //   202: iconst_1
/*     */     //   203: goto -> 207
/*     */     //   206: iconst_0
/*     */     //   207: istore #11
/*     */     //   209: goto -> 282
/*     */     //   212: aload_0
/*     */     //   213: invokevirtual hoveredStackNEI : ()Lscala/Option;
/*     */     //   216: astore #13
/*     */     //   218: aload #13
/*     */     //   220: instanceof scala/Some
/*     */     //   223: ifeq -> 275
/*     */     //   226: aload #13
/*     */     //   228: checkcast scala/Some
/*     */     //   231: astore #14
/*     */     //   233: aload #14
/*     */     //   235: invokevirtual x : ()Ljava/lang/Object;
/*     */     //   238: checkcast net/minecraft/item/ItemStack
/*     */     //   241: astore #15
/*     */     //   243: iload #6
/*     */     //   245: ifne -> 269
/*     */     //   248: aload_0
/*     */     //   249: aload_1
/*     */     //   250: invokevirtual li$cil$oc$client$gui$DynamicGuiContainer$$isSelectiveSlot : (Lnet/minecraft/inventory/Slot;)Z
/*     */     //   253: ifeq -> 269
/*     */     //   256: aload_1
/*     */     //   257: aload #15
/*     */     //   259: invokevirtual func_75214_a : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   262: ifeq -> 269
/*     */     //   265: iconst_1
/*     */     //   266: goto -> 270
/*     */     //   269: iconst_0
/*     */     //   270: istore #16
/*     */     //   272: goto -> 278
/*     */     //   275: iconst_0
/*     */     //   276: istore #16
/*     */     //   278: iload #16
/*     */     //   280: istore #11
/*     */     //   282: iload #11
/*     */     //   284: istore #7
/*     */     //   286: iload #7
/*     */     //   288: ifeq -> 353
/*     */     //   291: aload_0
/*     */     //   292: aload_0
/*     */     //   293: getfield field_73735_i : F
/*     */     //   296: bipush #100
/*     */     //   298: i2f
/*     */     //   299: fadd
/*     */     //   300: putfield field_73735_i : F
/*     */     //   303: aload_0
/*     */     //   304: aload_1
/*     */     //   305: getfield field_75223_e : I
/*     */     //   308: aload_1
/*     */     //   309: getfield field_75221_f : I
/*     */     //   312: aload_1
/*     */     //   313: getfield field_75223_e : I
/*     */     //   316: bipush #16
/*     */     //   318: iadd
/*     */     //   319: aload_1
/*     */     //   320: getfield field_75221_f : I
/*     */     //   323: bipush #16
/*     */     //   325: iadd
/*     */     //   326: ldc_w -2130706433
/*     */     //   329: ldc_w -2130706433
/*     */     //   332: invokevirtual func_73733_a : (IIIIII)V
/*     */     //   335: aload_0
/*     */     //   336: aload_0
/*     */     //   337: getfield field_73735_i : F
/*     */     //   340: bipush #100
/*     */     //   342: i2f
/*     */     //   343: fsub
/*     */     //   344: putfield field_73735_i : F
/*     */     //   347: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   350: goto -> 356
/*     */     //   353: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   356: astore #5
/*     */     //   358: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #109	-> 0
/*     */     //   #110	-> 18
/*     */     //   #112	-> 83
/*     */     //   #113	-> 90
/*     */     //   #114	-> 96
/*     */     //   #115	-> 121
/*     */     //   #116	-> 129
/*     */     //   #117	-> 136
/*     */     //   #118	-> 169
/*     */     //   #116	-> 202
/*     */     //   #114	-> 207
/*     */     //   #119	-> 212
/*     */     //   #120	-> 218
/*     */     //   #121	-> 275
/*     */     //   #119	-> 278
/*     */     //   #113	-> 282
/*     */     //   #124	-> 286
/*     */     //   #125	-> 291
/*     */     //   #126	-> 303
/*     */     //   #127	-> 304
/*     */     //   #128	-> 312
/*     */     //   #129	-> 326
/*     */     //   #126	-> 332
/*     */     //   #130	-> 335
/*     */     //   #124	-> 353
/*     */     //   #111	-> 356
/*     */     //   #109	-> 358
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	359	0	this	Lli/cil/oc/client/gui/DynamicGuiContainer;
/*     */     //   0	359	1	slot	Lnet/minecraft/inventory/Slot;
/*     */     //   90	269	6	currentIsInPlayerInventory	Z
/*     */     //   121	238	10	hovered	Lnet/minecraft/inventory/Slot;
/*     */     //   129	230	12	hoveredIsInPlayerInventory	Z
/*     */     //   243	116	15	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   286	73	7	drawHighlight	Z
/*     */   }
/*     */   
/*     */   public boolean li$cil$oc$client$gui$DynamicGuiContainer$$isSelectiveSlot(Slot slot) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: astore_2
/*     */     //   2: aload_2
/*     */     //   3: instanceof li/cil/oc/common/container/ComponentSlot
/*     */     //   6: ifeq -> 94
/*     */     //   9: aload_2
/*     */     //   10: checkcast li/cil/oc/common/container/ComponentSlot
/*     */     //   13: astore_3
/*     */     //   14: aload_3
/*     */     //   15: invokeinterface slot : ()Ljava/lang/String;
/*     */     //   20: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   23: invokevirtual Any : ()Ljava/lang/String;
/*     */     //   26: astore #5
/*     */     //   28: dup
/*     */     //   29: ifnonnull -> 41
/*     */     //   32: pop
/*     */     //   33: aload #5
/*     */     //   35: ifnull -> 84
/*     */     //   38: goto -> 49
/*     */     //   41: aload #5
/*     */     //   43: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   46: ifne -> 84
/*     */     //   49: aload_3
/*     */     //   50: invokeinterface slot : ()Ljava/lang/String;
/*     */     //   55: getstatic li/cil/oc/common/Slot$.MODULE$ : Lli/cil/oc/common/Slot$;
/*     */     //   58: invokevirtual Tool : ()Ljava/lang/String;
/*     */     //   61: astore #6
/*     */     //   63: dup
/*     */     //   64: ifnonnull -> 76
/*     */     //   67: pop
/*     */     //   68: aload #6
/*     */     //   70: ifnull -> 84
/*     */     //   73: goto -> 88
/*     */     //   76: aload #6
/*     */     //   78: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   81: ifeq -> 88
/*     */     //   84: iconst_0
/*     */     //   85: goto -> 89
/*     */     //   88: iconst_1
/*     */     //   89: istore #4
/*     */     //   91: goto -> 97
/*     */     //   94: iconst_0
/*     */     //   95: istore #4
/*     */     //   97: iload #4
/*     */     //   99: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #135	-> 0
/*     */     //   #136	-> 2
/*     */     //   #137	-> 94
/*     */     //   #135	-> 97
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	100	0	this	Lli/cil/oc/client/gui/DynamicGuiContainer;
/*     */     //   0	100	1	slot	Lnet/minecraft/inventory/Slot;
/*     */   }
/*     */   
/*     */   public void drawDisabledSlot(ComponentSlot slot) {
/* 141 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 142 */     this.field_146297_k.func_110434_K().func_110577_a(TextureMap.field_110576_c);
/* 143 */     func_94065_a(((Slot)slot).field_75223_e, ((Slot)slot).field_75221_f, slot.tierIcon(), 16, 16);
/*     */   }
/*     */   
/*     */   public void drawSlotBackground(int x, int y) {
/* 147 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 148 */     this.field_146297_k.func_110434_K().func_110577_a(Textures$.MODULE$.guiSlot());
/* 149 */     Tessellator t = Tessellator.field_78398_a;
/* 150 */     t.func_78382_b();
/* 151 */     t.func_78374_a(x, (y + 18), this.field_73735_i, 0.0D, 1.0D);
/* 152 */     t.func_78374_a((x + 18), (y + 18), this.field_73735_i, 1.0D, 1.0D);
/* 153 */     t.func_78374_a((x + 18), y, this.field_73735_i, 1.0D, 0.0D);
/* 154 */     t.func_78374_a(x, y, this.field_73735_i, 0.0D, 0.0D);
/* 155 */     t.func_78381_a();
/*     */   }
/*     */   
/*     */   public void func_73733_a(int par1, int par2, int par3, int par4, int par5, int par6) {
/* 159 */     super.func_73733_a(par1, par2, par3, par4, par5, par6);
/* 160 */     RenderState$.MODULE$.makeItBlend();
/* 161 */     GL11.glDisable(2896);
/*     */   }
/*     */   
/*     */   public void func_94065_a(int x, int y, IIcon icon, int width, int height) {
/* 165 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 166 */     RenderState$.MODULE$.makeItBlend();
/* 167 */     GL11.glDisable(2896);
/* 168 */     super.func_94065_a(x, y, icon, width, height);
/*     */   }
/*     */   public boolean li$cil$oc$client$gui$DynamicGuiContainer$$isPointInRegion(int rx, int ry, int rw, int rh, int px, int py) {
/* 171 */     return func_146978_c(rx, ry, rw, rh, px, py);
/*     */   }
/*     */   
/*     */   public boolean li$cil$oc$client$gui$DynamicGuiContainer$$isInPlayerInventory(Slot slot) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial inventoryContainer : ()Lnet/minecraft/inventory/Container;
/*     */     //   4: astore_2
/*     */     //   5: aload_2
/*     */     //   6: instanceof li/cil/oc/common/container/Player
/*     */     //   9: ifeq -> 58
/*     */     //   12: aload_2
/*     */     //   13: checkcast li/cil/oc/common/container/Player
/*     */     //   16: astore_3
/*     */     //   17: aload_1
/*     */     //   18: getfield field_75224_c : Lnet/minecraft/inventory/IInventory;
/*     */     //   21: aload_3
/*     */     //   22: invokevirtual playerInventory : ()Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   25: astore #5
/*     */     //   27: dup
/*     */     //   28: ifnonnull -> 40
/*     */     //   31: pop
/*     */     //   32: aload #5
/*     */     //   34: ifnull -> 48
/*     */     //   37: goto -> 52
/*     */     //   40: aload #5
/*     */     //   42: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   45: ifeq -> 52
/*     */     //   48: iconst_1
/*     */     //   49: goto -> 53
/*     */     //   52: iconst_0
/*     */     //   53: istore #4
/*     */     //   55: goto -> 61
/*     */     //   58: iconst_0
/*     */     //   59: istore #4
/*     */     //   61: iload #4
/*     */     //   63: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #173	-> 0
/*     */     //   #174	-> 5
/*     */     //   #175	-> 58
/*     */     //   #173	-> 61
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	64	0	this	Lli/cil/oc/client/gui/DynamicGuiContainer;
/*     */     //   0	64	1	slot	Lnet/minecraft/inventory/Slot;
/*     */   }
/*     */   
/*     */   @Method(modid = "NotEnoughItems")
/*     */   private void drawNEIHighlights() {
/* 180 */     ItemPanel panel = LayoutManager.itemPanel;
/* 181 */     if (panel == null)
/* 182 */       return;  this.field_73735_i += 'Ş';
/* 183 */     int itemsPerPage = panel.getGrid().getPerPage(); RichInt$.MODULE$
/* 184 */       .until$extension0(Predef$.MODULE$.intWrapper(0), itemsPerPage).foreach$mVc$sp((Function1)new DynamicGuiContainer$$anonfun$drawNEIHighlights$1(this, (DynamicGuiContainer<C>)panel));
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
/*     */ 
/*     */ 
/*     */     
/* 198 */     this.field_73735_i -= 'Ş';
/*     */   }
/*     */   
/*     */   public final class DynamicGuiContainer$$anonfun$drawNEIHighlights$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ItemPanel panel$1;
/*     */     
/*     */     public final void apply(int index) {
/*     */       apply$mcVI$sp(index);
/*     */     }
/*     */     
/*     */     public DynamicGuiContainer$$anonfun$drawNEIHighlights$1(DynamicGuiContainer $outer, ItemPanel panel$1) {}
/*     */     
/*     */     public void apply$mcVI$sp(int index) {
/*     */       Rectangle4i rect = this.panel$1.getGrid().getSlotRect(index);
/*     */       ItemPanel.ItemPanelSlot slot = this.panel$1.getSlotMouseOver(rect.x, rect.y);
/*     */       if (slot != null) {
/*     */         Option<Slot> option = this.$outer.hoveredSlot();
/*     */         if (option instanceof Some) {
/*     */           Some some = (Some)option;
/*     */           Slot hovered = (Slot)some.x();
/*     */           this.$outer.func_73733_a(rect.x1() + 1, rect.y1() + 1, rect.x2(), rect.y2(), 1090519039, 1090519039);
/*     */           BoxedUnit boxedUnit = (!this.$outer.li$cil$oc$client$gui$DynamicGuiContainer$$isInPlayerInventory(hovered) && this.$outer.li$cil$oc$client$gui$DynamicGuiContainer$$isSelectiveSlot(hovered) && hovered.func_75214_a(slot.item)) ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*     */         } else {
/*     */           BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\DynamicGuiContainer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */