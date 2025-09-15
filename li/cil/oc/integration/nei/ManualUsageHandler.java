/*    */ package li.cil.oc.integration.nei;
/*    */ import codechicken.nei.PositionedStack;
/*    */ import codechicken.nei.recipe.GuiRecipe;
/*    */ import codechicken.nei.recipe.IUsageHandler;
/*    */ import java.awt.Point;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import li.cil.oc.api.Manual;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.inventory.GuiContainer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\tea\001B\001\003\0015\021!#T1ok\006dWk]1hK\"\013g\016\0327fe*\0211\001B\001\004]\026L'BA\003\007\003-Ig\016^3he\006$\030n\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035Y\001\"a\004\013\016\003AQ!!\005\n\002\t1\fgn\032\006\002'\005!!.\031<b\023\t)\002C\001\004PE*,7\r\036\t\003/ui\021\001\007\006\0033i\taA]3dSB,'BA\002\034\025\005a\022aC2pI\026\034\007.[2lK:L!A\b\r\003\033%+6/Y4f\021\006tG\r\\3s\021!\001\003A!A!\002\023\t\023\001\0029bi\"\0042AI\023(\033\005\031#\"\001\023\002\013M\034\027\r\\1\n\005\031\032#AB(qi&|g\016\005\002)W9\021!%K\005\003U\r\na\001\025:fI\0264\027B\001\027.\005\031\031FO]5oO*\021!f\t\005\006_\001!\t\001M\001\007y%t\027\016\036 \025\005E\032\004C\001\032\001\033\005\021\001\"\002\021/\001\004\t\003\"B\030\001\t\003)D#A\031\t\017]\002\001\031!C\001q\005QA.Y:u\033>,8/\032-\026\003e\002\"A\t\036\n\005m\032#aA%oi\"9Q\b\001a\001\n\003q\024A\0047bgRlu.^:f1~#S-\035\013\003\t\003\"A\t!\n\005\005\033#\001B+oSRDqa\021\037\002\002\003\007\021(A\002yIEBa!\022\001!B\023I\024a\0037bgRlu.^:f1\002Bqa\022\001A\002\023\005\001(\001\006mCN$Xj\\;tKfCq!\023\001A\002\023\005!*\001\bmCN$Xj\\;tKf{F%Z9\025\005}Z\005bB\"I\003\003\005\r!\017\005\007\033\002\001\013\025B\035\002\0271\f7\017^'pkN,\027\f\t\005\b\037\002\021\r\021\"\001Q\003\031\021W\017\036;p]V\t\021\013\005\002S76\t1K\003\002U+\006\031q-^5\013\005Y;\026AB2mS\026tGO\003\002Y3\006IQ.\0338fGJ\fg\r\036\006\0025\006\031a.\032;\n\005q\033&!C$vS\n+H\017^8o\021\031q\006\001)A\005#\0069!-\036;u_:\004\003\"\0021\001\t\003\n\027!D4fiJ+7-\0339f\035\006lW\rF\001c!\ty1-\003\002-!!)Q\r\001C!M\006yq-\032;Vg\006<W\rS1oI2,'\017F\002\027O&DQ\001\0333A\002\035\nQ!\0338qkRDQA\0333A\002-\f1\"\0338he\026$\027.\0328ugB\031!\005\0348\n\0055\034#A\003\037sKB,\027\r^3e}A\021!e\\\005\003a\016\022a!\0218z%\0264\007\"\002:\001\t\003\032\030a\004:fG&\004\030.Z:QKJ\004\026mZ3\025\003eBQ!\036\001\005BM\f!B\\;n%\026\034\027\016]3t\021\0259\b\001\"\021y\0039!'/Y<G_J,wM]8v]\022$\"aP=\t\013e1\b\031A\035\t\013m\004A\021\t?\002\035\021\024\030m\036\"bG.<'o\\;oIR\021q( \005\006}j\004\r!O\001\002S\"9\021\021\001\001\005B\005\r\021aE4fi&swM]3eS\026tGo\025;bG.\034H\003BA\003\0033\001b!a\002\002\016\005EQBAA\005\025\r\tYAE\001\005kRLG.\003\003\002\020\005%!!C!se\006LH*[:u!\021\t\031\"!\006\016\003iI1!a\006\033\005=\001vn]5uS>tW\rZ*uC\016\\\007\"\002@\000\001\004I\004bBA\017\001\021\005\023qD\001\017O\026$x\n\0365feN#\030mY6t)\021\t)!!\t\t\ry\fY\0021\001:\021\035\t)\003\001C!\003O\tabZ3u%\026\034X\017\034;Ti\006\0347\016\006\003\002*\005=\002c\001\022\002,%\031\021QF\022\003\t9+H\016\034\005\007}\006\r\002\031A\035\t\017\005M\002\001\"\021\0026\005AqN\\+qI\006$X\rF\001@\021\035\tI\004\001C!\003w\t!\002[1t\037Z,'\017\\1z)!\ti$a\021\002R\005}\003c\001\022\002@%\031\021\021I\022\003\017\t{w\016\\3b]\"9A+a\016A\002\005\025\003\003BA$\003\033j!!!\023\013\007\005-3+A\005j]Z,g\016^8ss&!\021qJA%\00519U/[\"p]R\f\027N\\3s\021!\t\031&a\016A\002\005U\023!C2p]R\f\027N\\3s!\021\t9&a\027\016\005\005e#bAA&/&!\021QLA-\005%\031uN\034;bS:,'\017\003\004\003o\001\r!\017\005\b\003G\002A\021IA3\003E9W\r^(wKJd\027-\037%b]\022dWM\035\013\007\003O\n\031(!\036\021\t\005%\024qN\007\003\003WR1!!\034\033\003\r\t\007/[\005\005\003c\nYGA\bJ\037Z,'\017\\1z\021\006tG\r\\3s\021\035!\026\021\ra\001\003\013BaA`A1\001\004I\004bBA=\001\021\005\0231P\001\023O\026$xJ^3sY\006L(+\0328eKJ,'\017\006\004\002~\005\r\025Q\021\t\005\003S\ny(\003\003\002\002\006-$AF%SK\016L\007/Z(wKJd\027-\037*f]\022,'/\032:\t\017Q\0139\b1\001\002F!1a0a\036A\002eBq!!#\001\t\003\nY)A\007iC:$G.\032+p_2$\030\016\035\013\t\003\033\013\031*a-\0028B)\021qAAHO%!\021\021SA\005\005\021a\025n\035;\t\017Q\0139\t1\001\002\026B\"\021qSAQ!\0259\022\021TAO\023\r\tY\n\007\002\n\017VL'+Z2ja\026\004B!a(\002\"2\001A\001DAR\003'\013\t\021!A\003\002\005\025&aA0%cE!\021qUAW!\r\021\023\021V\005\004\003W\033#a\002(pi\"Lgn\032\t\004E\005=\026bAAYG\t\031\021I\\=\t\021\005U\026q\021a\001\003\033\013q\001^8pYRL\007\017\003\004\003\017\003\r!\017\005\b\003w\003A\021IA_\003EA\027M\0343mK&#X-\034+p_2$\030\016\035\013\013\003\033\013y,a3\002\\\006u\007b\002+\002:\002\007\021\021\031\031\005\003\007\f9\rE\003\030\0033\013)\r\005\003\002 \006\035G\001DAe\003\013\t\021!A\003\002\005\025&aA0%e!A\021QZA]\001\004\ty-A\003ti\006\0347\016\005\003\002R\006]WBAAj\025\r\t)nV\001\005SR,W.\003\003\002Z\006M'!C%uK6\034F/Y2l\021!\t),!/A\002\0055\005B\002@\002:\002\007\021\bC\004\002b\002!\t%a9\002\021-,\027\020V=qK\022$\"\"!\020\002f\006E\0301`A\000\021\035!\026q\034a\001\003O\004D!!;\002nB)q#!'\002lB!\021qTAw\t1\ty/!:\002\002\003\005)\021AAS\005\ryFe\r\005\t\003g\fy\0161\001\002v\006!1\r[1s!\r\021\023q_\005\004\003s\034#\001B\"iCJDq!!@\002`\002\007\021(\001\003d_\022,\007BB\r\002`\002\007\021\bC\004\003\004\001!\tE!\002\002\0315|Wo]3DY&\0347.\0323\025\021\005u\"q\001B\n\005/A\001\"a\025\003\002\001\007!\021\002\031\005\005\027\021y\001E\003\030\0033\023i\001\005\003\002 \n=A\001\004B\t\005\017\t\t\021!A\003\002\005\025&aA0%i!9!Q\003B\001\001\004I\024a\0012u]\"1\021D!\001A\002e\002")
/*    */ public class ManualUsageHandler implements IUsageHandler {
/*    */   private final Option<String> path;
/*    */   
/*    */   public ManualUsageHandler() {
/* 20 */     this((Option<String>)None$.MODULE$);
/*    */   }
/* 22 */   private int lastMouseX = 0; public int lastMouseX() { return this.lastMouseX; } public void lastMouseX_$eq(int x$1) { this.lastMouseX = x$1; }
/* 23 */    private int lastMouseY = 0; public int lastMouseY() { return this.lastMouseY; } public void lastMouseY_$eq(int x$1) { this.lastMouseY = x$1; }
/* 24 */    private final GuiButton button = new GuiButton(0, 34, 20, 100, 20, Localization$.MODULE$.localizeImmediately("nei.usage.oc.Manual")); public GuiButton button() { return this.button; }
/*    */    public String getRecipeName() {
/* 26 */     return "Manual";
/*    */   } public IUsageHandler getUsageHandler(String input, Seq ingredients) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'item'
/*    */     //   3: astore_3
/*    */     //   4: dup
/*    */     //   5: ifnonnull -> 16
/*    */     //   8: pop
/*    */     //   9: aload_3
/*    */     //   10: ifnull -> 23
/*    */     //   13: goto -> 54
/*    */     //   16: aload_3
/*    */     //   17: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   20: ifeq -> 54
/*    */     //   23: aload_2
/*    */     //   24: new li/cil/oc/integration/nei/ManualUsageHandler$$anonfun$getUsageHandler$1
/*    */     //   27: dup
/*    */     //   28: aload_0
/*    */     //   29: invokespecial <init> : (Lli/cil/oc/integration/nei/ManualUsageHandler;)V
/*    */     //   32: invokeinterface collectFirst : (Lscala/PartialFunction;)Lscala/Option;
/*    */     //   37: new li/cil/oc/integration/nei/ManualUsageHandler$$anonfun$getUsageHandler$2
/*    */     //   40: dup
/*    */     //   41: aload_0
/*    */     //   42: invokespecial <init> : (Lli/cil/oc/integration/nei/ManualUsageHandler;)V
/*    */     //   45: invokevirtual getOrElse : (Lscala/Function0;)Ljava/lang/Object;
/*    */     //   48: checkcast codechicken/nei/recipe/IUsageHandler
/*    */     //   51: goto -> 55
/*    */     //   54: aload_0
/*    */     //   55: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 0
/*    */     //   #30	-> 23
/*    */     //   #33	-> 37
/*    */     //   #35	-> 54
/*    */     //   #29	-> 55
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	56	0	this	Lli/cil/oc/integration/nei/ManualUsageHandler;
/*    */     //   0	56	1	input	Ljava/lang/String;
/*    */     //   0	56	2	ingredients	Lscala/collection/Seq;
/*    */   } public final class ManualUsageHandler$$anonfun$getUsageHandler$1 extends AbstractPartialFunction<Object, ManualUsageHandler> implements Serializable { public static final long serialVersionUID = 0L;
/* 30 */     public final <A1, B1> B1 applyOrElse(Object x1, Function1 default) { Object object = x1;
/* 31 */       if (object instanceof ItemStack) { ItemStack itemStack = (ItemStack)object; if (Manual.pathFor(itemStack) != null)
/* 32 */           return (B1)new ManualUsageHandler(Option$.MODULE$.apply(Manual.pathFor(itemStack)));  }  return (B1)default.apply(x1); } public final boolean isDefinedAt(Object x1) { Object object = x1; if (object instanceof ItemStack) { ItemStack itemStack = (ItemStack)object; if (Manual.pathFor(itemStack) != null) return true;  }  return false; } public ManualUsageHandler$$anonfun$getUsageHandler$1(ManualUsageHandler $outer) {} }
/* 33 */    public final class ManualUsageHandler$$anonfun$getUsageHandler$2 extends AbstractFunction0<ManualUsageHandler> implements Serializable { public final ManualUsageHandler apply() { return this.$outer; }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     public ManualUsageHandler$$anonfun$getUsageHandler$2(ManualUsageHandler $outer) {} }
/*    */   public int recipiesPerPage() {
/* 38 */     return 1;
/*    */   } public int numRecipes() {
/* 40 */     return this.path.isDefined() ? 1 : 0;
/*    */   } public void drawForeground(int recipe) {
/* 42 */     if (this.path.isDefined()) { GuiScreen guiScreen = (Minecraft.func_71410_x()).field_71462_r;
/* 43 */       if (guiScreen instanceof GuiRecipe) { GuiRecipe guiRecipe = (GuiRecipe)guiScreen;
/* 44 */         Point pos = GuiDraw.getMousePosition();
/* 45 */         Point offset = guiRecipe.getRecipePosition(recipe);
/* 46 */         button().func_146112_a(Minecraft.func_71410_x(), pos.x - guiRecipe.field_147003_i - offset.x, pos.y - guiRecipe.field_147009_r - offset.y); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 47 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */        }
/*    */   
/*    */   } public void drawBackground(int i) {}
/*    */   public ArrayList<PositionedStack> getIngredientStacks(int i) {
/* 52 */     return new ArrayList<>();
/*    */   } public ArrayList<PositionedStack> getOtherStacks(int i) {
/* 54 */     return new ArrayList<>();
/*    */   } public Null$ getResultStack(int i) {
/* 56 */     return null;
/*    */   }
/*    */   public void onUpdate() {}
/*    */   public boolean hasOverlay(GuiContainer gui, Container container, int i) {
/* 60 */     return false;
/*    */   } public IOverlayHandler getOverlayHandler(GuiContainer gui, int i) {
/* 62 */     return null;
/*    */   } public IRecipeOverlayRenderer getOverlayRenderer(GuiContainer gui, int i) {
/* 64 */     return null;
/*    */   } public List<String> handleTooltip(GuiRecipe gui, List<String> tooltip, int i) {
/* 66 */     return tooltip;
/*    */   } public List<String> handleItemTooltip(GuiRecipe gui, ItemStack stack, List<String> tooltip, int i) {
/* 68 */     return tooltip;
/*    */   } public boolean keyTyped(GuiRecipe gui, char char, int code, int recipe) {
/* 70 */     return false;
/*    */   } public boolean mouseClicked(GuiRecipe container, int btn, int recipe) {
/* 72 */     if (this.path.isDefined()) { boolean bool; GuiRecipe guiRecipe = container;
/* 73 */       if (guiRecipe != null) { GuiRecipe guiRecipe1 = guiRecipe;
/* 74 */         Point pos = GuiDraw.getMousePosition();
/* 75 */         Point offset = guiRecipe1.getRecipePosition(recipe);
/* 76 */         Minecraft mc = Minecraft.func_71410_x();
/*    */         
/* 78 */         mc.field_71439_g.func_71053_j();
/* 79 */         Manual.openFor((EntityPlayer)mc.field_71439_g);
/* 80 */         this.path.foreach((Function1)new ManualUsageHandler$$anonfun$mouseClicked$1(this));
/* 81 */         bool = button().func_146116_c(mc, pos.x - guiRecipe1.field_147003_i - offset.x, pos.y - guiRecipe1.field_147009_r - offset.y) ? true : 
/*    */           
/* 83 */           false; }
/* 84 */       else { bool = false; }
/*    */       
/*    */       if (bool); }
/*    */     
/*    */     return false;
/*    */   }
/*    */   
/*    */   public ManualUsageHandler(Option<String> path) {}
/*    */   
/*    */   public final class ManualUsageHandler$$anonfun$mouseClicked$1 extends AbstractFunction1<String, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(String x$1) {
/*    */       Manual.navigate(x$1);
/*    */     }
/*    */     
/*    */     public ManualUsageHandler$$anonfun$mouseClicked$1(ManualUsageHandler $outer) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\nei\ManualUsageHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */