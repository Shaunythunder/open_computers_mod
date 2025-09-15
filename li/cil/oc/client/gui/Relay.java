/*     */ package li.cil.oc.client.gui;
/*     */ 
/*     */ import codechicken.nei.VisiblityData;
/*     */ import codechicken.nei.api.INEIGuiHandler;
/*     */ import cpw.mods.fml.common.Optional.Method;
/*     */ import java.text.DecimalFormat;
/*     */ import li.cil.oc.Localization$Switch$;
/*     */ import li.cil.oc.client.Textures$;
/*     */ import li.cil.oc.common.container.Relay;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.gui.inventory.GuiContainer;
/*     */ import net.minecraft.client.renderer.Tessellator;
/*     */ import net.minecraft.entity.player.InventoryPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import org.lwjgl.util.Rectangle;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.math.package$;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @Interface(iface = "codechicken.nei.api.INEIGuiHandler", modid = "NotEnoughItems")
/*     */ @ScalaSignature(bytes = "\006\001\005ug\001B\001\003\0015\021QAU3mCfT!a\001\003\002\007\035,\030N\003\002\006\r\00511\r\\5f]RT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001a\"\007\t\004\037A\021R\"\001\002\n\005E\021!a\005#z]\006l\027nY$vS\016{g\016^1j]\026\024\bCA\n\031\033\005!\"BA\013\027\003%\031wN\034;bS:,'O\003\002\030\r\00511m\\7n_:L!!\001\013\021\005i\tS\"A\016\013\005qi\022aA1qS*\021adH\001\004]\026L'\"\001\021\002\027\r|G-Z2iS\016\\WM\\\005\003Em\021a\"\023(F\023\036+\030\016S1oI2,'\017\003\005%\001\t\005\t\025!\003&\003=\001H.Y=fe&sg/\0328u_JL\bC\001\0240\033\0059#B\001\025*\003\031\001H.Y=fe*\021!fK\001\007K:$\030\016^=\013\0051j\023!C7j]\026\034'/\0314u\025\005q\023a\0018fi&\021\001g\n\002\020\023:4XM\034;pef\004F.Y=fe\"A!\007\001BC\002\023\0051'A\003sK2\f\0270F\0015!\t)\004(D\0017\025\t9d#\001\006uS2,WM\034;jifL!!\001\034\t\021i\002!\021!Q\001\nQ\naA]3mCf\004\003\"\002\037\001\t\003i\024A\002\037j]&$h\bF\002?\001\003\"a\004\001\t\013\021Z\004\031A\023\t\013IZ\004\031\001\033\t\017\t\003!\031!C\005\007\0061am\034:nCR,\022\001\022\t\003\013*k\021A\022\006\003\017\"\013A\001^3yi*\t\021*\001\003kCZ\f\027BA&G\0055!UmY5nC24uN]7bi\"1Q\n\001Q\001\n\021\013qAZ8s[\006$\b\005C\004P\001\t\007I\021\002)\002\027Q\f'\rU8tSRLwN\\\013\002#B\021!+W\007\002'*\021A+V\001\005kRLGN\003\002W/\006)An\0366hY*\t\001,A\002pe\036L!AW*\003\023I+7\r^1oO2,\007B\002/\001A\003%\021+\001\007uC\n\004vn]5uS>t\007\005C\003_\001\021Es,\001\017ee\006<8+Z2p]\022\f'/\037\"bG.<'o\\;oI2\013\0270\032:\025\003\001\004\"!\0313\016\003\tT\021aY\001\006g\016\fG.Y\005\003K\n\024A!\0268ji\")q\r\001C!Q\006aQn\\;tK\016c\027nY6fIR!\001-\0338q\021\025Qg\r1\001l\003\031iw.^:f1B\021\021\r\\\005\003[\n\0241!\0238u\021\025yg\r1\001l\003\031iw.^:f3\")\021O\032a\001W\0061!-\036;u_:DQa\035\001\005BQ\fa\"\\8vg\026luN^3e\037J,\006\017\006\003akZ<\b\"\0026s\001\004Y\007\"B8s\001\004Y\007\"B9s\001\004Y\007\"B=\001\t\003R\030\001\b3sC^\034VmY8oI\006\024\030PR8sK\036\024x.\0368e\031\006LXM\035\013\004And\b\"\0026y\001\004Y\007\"B8y\001\004Y\007\"\002@\001\t\023y\030a\005;ie\026\034\bn\0347e\005\006\034X\rZ\"pY>\024HcB6\002\002\005\025\021\021\002\005\007\003\007i\b\031A6\002\013Y\fG.^3\t\r\005\035Q\0201\001l\003\031IX\r\0347po\"1\0211B?A\002-\f1A]3e\021\035\ty\001\001C!\003#\tq\"\\8eS\032Lh+[:jE2LG/\037\013\007\003'\tY\"!\f\021\t\005U\021qC\007\002;%\031\021\021D\017\003\033YK7/\0332mSRLH)\031;b\021\035\031\021Q\002a\001\003;\001B!a\b\002*5\021\021\021\005\006\005\003G\t)#A\005j]Z,g\016^8ss*\0311!a\n\013\005\025Y\023\002BA\026\003C\021AbR;j\007>tG/Y5oKJD\001\"a\f\002\016\001\007\0211C\001\022GV\024(/\0328u-&\034\030NY5mSRL\b\006CA\007\003g\t\t&a\025\021\t\005U\0221\n\b\005\003o\t9%\004\002\002:)\031q#a\017\013\t\005u\022qH\001\004M6d'\002BA!\003\007\nA!\\8eg*\021\021QI\001\004GB<\030\002BA%\003s\t\001b\0249uS>t\027\r\\\005\005\003\033\nyE\001\004NKRDw\016\032\006\005\003\023\nI$A\003n_\022LG-\t\002\002V\005qaj\034;F]>,x\r[%uK6\034\bbBA-\001\021\005\0231L\001\022O\026$\030\n^3n'B\fwO\\*m_R\034HCBA/\003_\n\t\b\005\004\002`\005\025\024\021N\007\003\003CR1!a\031I\003\021a\027M\\4\n\t\005\035\024\021\r\002\t\023R,'/\0312mKB!\021qLA6\023\021\ti'!\031\003\017%sG/Z4fe\"91!a\026A\002\005u\001\002CA:\003/\002\r!!\036\002\013M$\030mY6\021\t\005]\024QP\007\003\003sR1!a\037,\003\021IG/Z7\n\t\005}\024\021\020\002\n\023R,Wn\025;bG.D\003\"a\026\0024\005E\0231\013\005\b\003\013\003A\021IAD\003E9W\r^%om\026tGo\034:z\003J,\027m\035\013\005\003\023\013I\n\005\004\002\f\006=\0251S\007\003\003\033S!\001\026%\n\t\005E\025Q\022\002\005\031&\034H\017E\002\033\003+K1!a&\034\005M!\026mZ4fI&sg/\0328u_JL\030I]3b\021\035\031\0211\021a\001\003;A\003\"a!\0024\005E\0231\013\005\b\003?\003A\021IAQ\003=A\027M\0343mK\022\023\030m\032(Ee>\004H\003DAR\003S\013Y+!,\0020\006E\006cA1\002&&\031\021q\0252\003\017\t{w\016\\3b]\"91!!(A\002\005u\001B\0026\002\036\002\0071\016\003\004p\003;\003\ra\033\005\t\003g\ni\n1\001\002v!1\021/!(A\002-D\003\"!(\0024\005E\0231\013\005\b\003o\003A\021IA]\003EA\027\016Z3Ji\026l\007+\0318fYNcw\016\036\013\r\003G\013Y,!0\002B\006\025\027\021\032\005\b\007\005U\006\031AA\017\021\035\ty,!.A\002-\f\021\001\037\005\b\003\007\f)\f1\001l\003\005I\bbBAd\003k\003\ra[\001\002o\"9\0211ZA[\001\004Y\027!\0015)\021\005U\0261GA)\003'B3\002AAi\003/\fI.!\025\002TA!\021QGAj\023\021\t).a\024\003\023%sG/\032:gC\016,\027!B5gC\016,\027EAAn\003\t\032w\016Z3dQ&\0347.\0328/]\026Lg&\0319j]%sU)S$vS\"\013g\016\0327fe\002")
/*     */ public class Relay extends DynamicGuiContainer<Relay> implements INEIGuiHandler {
/*     */   private final li.cil.oc.common.tileentity.Relay relay;
/*     */   
/*  25 */   public li.cil.oc.common.tileentity.Relay relay() { return this.relay; } private final DecimalFormat format; private final Rectangle tabPosition; public Relay(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Relay relay) { super(new Relay(playerInventory, relay));
/*  26 */     this.format = new DecimalFormat("#.##hz");
/*     */     
/*  28 */     this.tabPosition = new Rectangle(this.field_146999_f, 10, 23, 26); } private DecimalFormat format() { return this.format; } private Rectangle tabPosition() { return this.tabPosition; }
/*     */   
/*     */   public void drawSecondaryBackgroundLayer() {
/*  31 */     super.drawSecondaryBackgroundLayer();
/*     */ 
/*     */     
/*  34 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  35 */     Minecraft.func_71410_x().func_110434_K().func_110577_a(Textures$.MODULE$.guiUpgradeTab());
/*  36 */     int x = windowX() + tabPosition().getX();
/*  37 */     int y = windowY() + tabPosition().getY();
/*  38 */     int w = tabPosition().getWidth();
/*  39 */     int h = tabPosition().getHeight();
/*  40 */     Tessellator t = Tessellator.field_78398_a;
/*  41 */     t.func_78382_b();
/*  42 */     t.func_78374_a(x, (y + h), this.field_73735_i, 0.0D, 1.0D);
/*  43 */     t.func_78374_a((x + w), (y + h), this.field_73735_i, 1.0D, 1.0D);
/*  44 */     t.func_78374_a((x + w), y, this.field_73735_i, 1.0D, 0.0D);
/*  45 */     t.func_78374_a(x, y, this.field_73735_i, 0.0D, 0.0D);
/*  46 */     t.func_78381_a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_73864_a(int mouseX, int mouseY, int button) {
/*  51 */     int originalWidth = this.field_146999_f;
/*     */     try {
/*  53 */       this.field_146999_f += tabPosition().getWidth();
/*  54 */       super.func_73864_a(mouseX, mouseY, button);
/*     */       return;
/*     */     } finally {
/*  57 */       this.field_146999_f = originalWidth;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_146286_b(int mouseX, int mouseY, int button) {
/*  63 */     int originalWidth = this.field_146999_f;
/*     */     try {
/*  65 */       this.field_146999_f += tabPosition().getWidth();
/*  66 */       super.func_146286_b(mouseX, mouseY, button);
/*     */       return;
/*     */     } finally {
/*  69 */       this.field_146999_f = originalWidth;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void drawSecondaryForegroundLayer(int mouseX, int mouseY) {
/*  74 */     super.drawSecondaryForegroundLayer(mouseX, mouseY);
/*  75 */     this.field_146289_q.func_78276_b(
/*  76 */         Localization$.MODULE$.localizeImmediately(relay().func_145825_b()), 
/*  77 */         8, 6, 4210752);
/*     */     
/*  79 */     this.field_146289_q.func_78276_b(
/*  80 */         Localization$Switch$.MODULE$.TransferRate(), 
/*  81 */         14, 20, 4210752);
/*  82 */     this.field_146289_q.func_78276_b(
/*  83 */         Localization$Switch$.MODULE$.PacketsPerCycle(), 
/*  84 */         14, 39, 4210752);
/*  85 */     this.field_146289_q.func_78276_b(
/*  86 */         Localization$Switch$.MODULE$.QueueSize(), 
/*  87 */         14, 58, 4210752);
/*     */     
/*  89 */     this.field_146289_q.func_78276_b(
/*  90 */         format().format((20.0F / inventoryContainer().relayDelay())), 
/*  91 */         108, 20, 4210752);
/*  92 */     this.field_146289_q.func_78276_b((
/*  93 */         new StringBuilder()).append(inventoryContainer().packetsPerCycleAvg()).append(" / ").append(BoxesRunTime.boxToInteger(inventoryContainer().relayAmount())).toString(), 
/*  94 */         108, 39, thresholdBasedColor(inventoryContainer().packetsPerCycleAvg(), (int)package$.MODULE$.ceil((inventoryContainer().relayAmount() / 2.0F)), inventoryContainer().relayAmount()));
/*  95 */     this.field_146289_q.func_78276_b((
/*  96 */         new StringBuilder()).append(inventoryContainer().queueSize()).append(" / ").append(BoxesRunTime.boxToInteger(inventoryContainer().maxQueueSize())).toString(), 
/*  97 */         108, 58, thresholdBasedColor(inventoryContainer().queueSize(), inventoryContainer().maxQueueSize() / 2, inventoryContainer().maxQueueSize()));
/*     */   }
/*     */   
/*     */   private int thresholdBasedColor(int value, int yellow, int red) {
/* 101 */     return (value < yellow) ? 39168 : (
/* 102 */       (value < red) ? 10066176 : 
/* 103 */       10027008);
/*     */   }
/*     */   @Method(modid = "NotEnoughItems")
/*     */   public VisiblityData modifyVisiblity(GuiContainer gui, VisiblityData currentVisibility) {
/* 107 */     return null;
/*     */   } @Method(modid = "NotEnoughItems")
/*     */   public Iterable<Integer> getItemSpawnSlots(GuiContainer gui, ItemStack stack) {
/* 110 */     return null;
/*     */   } @Method(modid = "NotEnoughItems")
/*     */   public List<TaggedInventoryArea> getInventoryAreas(GuiContainer gui) {
/* 113 */     return null;
/*     */   } @Method(modid = "NotEnoughItems")
/*     */   public boolean handleDragNDrop(GuiContainer gui, int mouseX, int mouseY, ItemStack stack, int button) {
/* 116 */     return false;
/*     */   }
/*     */   @Method(modid = "NotEnoughItems")
/*     */   public boolean hideItemPanelSlot(GuiContainer gui, int x, int y, int w, int h) {
/* 120 */     return (new Rectangle(x - windowX(), y - windowY(), w, h)).intersects((ReadableRectangle)tabPosition());
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Relay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */