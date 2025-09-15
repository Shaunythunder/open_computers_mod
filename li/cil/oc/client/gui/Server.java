/*    */ package li.cil.oc.client.gui;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import li.cil.oc.client.gui.traits.LockedHotbar;
/*    */ import li.cil.oc.common.tileentity.Rack;
/*    */ import net.minecraft.inventory.Slot;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005]c\001B\001\003\0015\021aaU3sm\026\024(BA\002\005\003\r9W/\033\006\003\013\031\taa\0317jK:$(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\031\001AD\r\021\007=\001\"#D\001\003\023\t\t\"AA\nEs:\fW.[2Hk&\034uN\034;bS:,'\017\005\002\02415\tAC\003\002\026-\005I1m\0348uC&tWM\035\006\003/\031\taaY8n[>t\027BA\001\025!\tQR$D\001\034\025\ta\"!\001\004ue\006LGo]\005\003=m\021A\002T8dW\026$\007j\034;cCJD\001\002\t\001\003\002\003\006I!I\001\020a2\f\0270\032:J]Z,g\016^8ssB\021!eK\007\002G)\021A%J\001\007a2\f\0270\032:\013\005\031:\023AB3oi&$\030P\003\002)S\005IQ.\0338fGJ\fg\r\036\006\002U\005\031a.\032;\n\0051\032#aD%om\026tGo\034:z!2\f\0270\032:\t\0219\002!\021!Q\001\n=\nqb]3sm\026\024\030J\034<f]R|'/\037\t\003aMj\021!\r\006\003eY\t\021\"\0338wK:$xN]=\n\005Q\n$aD*feZ,'/\0238wK:$xN]=\t\021Y\002!Q1A\005\002]\nAA]1dWV\t\001\bE\002:yyj\021A\017\006\002w\005)1oY1mC&\021QH\017\002\007\037B$\030n\0348\021\005}\022U\"\001!\013\005\0053\022A\003;jY\026,g\016^5us&\0211\t\021\002\005%\006\0347\016\003\005F\001\t\005\t\025!\0039\003\025\021\030mY6!\021!9\005A!b\001\n\003A\025\001B:m_R,\022!\023\t\003s)K!a\023\036\003\007%sG\017\003\005N\001\t\005\t\025!\003J\003\025\031Hn\034;!\021\025y\005\001\"\001Q\003\031a\024N\\5u}Q)\021KU*U+B\021q\002\001\005\006A9\003\r!\t\005\006]9\003\ra\f\005\bm9\003\n\0211\0019\021\0359e\n%AA\002%C\021b\026\001A\002\003\007I\021\003-\002\027A|w/\032:CkR$xN\\\013\0023B\021qBW\005\0037\n\0211\"S7bO\026\024U\017\036;p]\"IQ\f\001a\001\002\004%\tBX\001\020a><XM\035\"viR|gn\030\023fcR\021qL\031\t\003s\001L!!\031\036\003\tUs\027\016\036\005\bGr\013\t\0211\001Z\003\rAH%\r\005\007K\002\001\013\025B-\002\031A|w/\032:CkR$xN\034\021\t\013\035\004A\021\t5\002\0271|7m[3e'R\f7m[\013\002SB\021!.\\\007\002W*\021AnJ\001\005SR,W.\003\002oW\nI\021\n^3n'R\f7m\033\005\006a\002!\t&]\001\020C\016$\030n\0348QKJ4wN]7fIR\021qL\035\005\006g>\004\r\001^\001\007EV$Ho\0348\021\005UDX\"\001<\013\005\r9(BA\003(\023\tIhOA\005Hk&\024U\017\036;p]\")1\020\001C!y\006QAM]1x'\016\024X-\0328\025\013}kx0a\001\t\013yT\b\031A%\002\r5|Wo]3Y\021\031\t\tA\037a\001\023\0061Qn\\;tKfCq!!\002{\001\004\t9!\001\002eiB\031\021(!\003\n\007\005-!HA\003GY>\fG\017C\004\002\020\001!\t%!\005\002\017%t\027\016^$vSR\tq\fC\004\002\026\001!\t%a\006\0029\021\024\030m^*fG>tG-\031:z\r>\024Xm\032:pk:$G*Y=feR)q,!\007\002\034!1a0a\005A\002%Cq!!\001\002\024\001\007\021\nC\004\002 \001!\t%!\005\0029\021\024\030m^*fG>tG-\031:z\005\006\0347n\032:pk:$G*Y=fe\036I\0211\005\002\002\002#\005\021QE\001\007'\026\024h/\032:\021\007=\t9C\002\005\002\005\005\005\t\022AA\025'\021\t9#a\013\021\007e\ni#C\002\0020i\022a!\0218z%\0264\007bB(\002(\021\005\0211\007\013\003\003KA!\"a\016\002(E\005I\021AA\035\003m!C.Z:tS:LG\017J4sK\006$XM\035\023eK\032\fW\017\034;%gU\021\0211\b\026\004q\005u2FAA !\021\t\t%a\023\016\005\005\r#\002BA#\003\017\n\021\"\0368dQ\026\0347.\0323\013\007\005%#(\001\006b]:|G/\031;j_:LA!!\024\002D\t\tRO\\2iK\016\\W\r\032,be&\fgnY3\t\025\005E\023qEI\001\n\003\t\031&A\016%Y\026\0348/\0338ji\022:'/Z1uKJ$C-\0324bk2$H\005N\013\003\003+R3!SA\037\001")
/*    */ public class Server extends DynamicGuiContainer<Server> implements LockedHotbar {
/*    */   private final ServerInventory serverInventory;
/*    */   private final Option<Rack> rack;
/*    */   
/* 16 */   public void func_146984_a(Slot slot, int slotNumber, int button, int shift) { LockedHotbar.class.handleMouseClick(this, slot, slotNumber, button, shift); } private final int slot; private ImageButton powerButton; public boolean func_146983_a(int keyCode) { return LockedHotbar.class.checkHotbarKeys(this, keyCode); } public Option<Rack> rack() { return this.rack; } public int slot() { return this.slot; } public Server(InventoryPlayer playerInventory, ServerInventory serverInventory, Option<Rack> rack, int slot) { super(new Server(playerInventory, serverInventory, Server$.MODULE$.$lessinit$greater$default$3())); LockedHotbar.class.$init$(this); }
/* 17 */   public ImageButton powerButton() { return this.powerButton; } public void powerButton_$eq(ImageButton x$1) { this.powerButton = x$1; }
/*    */    public ItemStack lockedStack() {
/* 19 */     return this.serverInventory.container();
/*    */   }
/*    */   public void func_146284_a(GuiButton button) {
/* 22 */     if (button.field_146127_k == 0) {
/* 23 */       Option<Rack> option = rack();
/* 24 */       if (option instanceof Some) { Some some = (Some)option; Rack t = (Rack)some.x(); PacketSender$.MODULE$.sendServerPower(t, slot(), !inventoryContainer().isRunning()); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 25 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void func_73863_a(int mouseX, int mouseY, float dt) {
/* 32 */     Option<Rack> option = rack();
/* 33 */     if (option instanceof Some) { Some some = (Some)option; Rack t = (Rack)some.x(); ItemStack itemStack = this.serverInventory.container(); if (t.func_70301_a(slot()) == null) { t.func_70301_a(slot()); if (itemStack != null)
/* 34 */         { Minecraft.func_71410_x().func_147108_a(null); return; }  } else if (!t.func_70301_a(slot()).equals(itemStack)) { Minecraft.func_71410_x().func_147108_a(null); return; }
/*    */        }
/* 36 */      BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */ 
/*    */     
/* 39 */     (powerButton()).field_146125_m = !inventoryContainer().isItem();
/* 40 */     powerButton().toggled_$eq(inventoryContainer().isRunning());
/* 41 */     super.func_73863_a(mouseX, mouseY, dt);
/*    */   }
/*    */   
/*    */   public void func_73866_w_() {
/* 45 */     super.func_73866_w_();
/* 46 */     int x$1 = 0, x$2 = this.field_147003_i + 48, x$3 = this.field_147009_r + 33, x$4 = 18, x$5 = 18; ResourceLocation x$6 = Textures$.MODULE$.guiButtonPower(); boolean x$7 = true; String x$8 = ImageButton$.MODULE$.$lessinit$greater$default$7(); int x$9 = ImageButton$.MODULE$.$lessinit$greater$default$9(), x$10 = ImageButton$.MODULE$.$lessinit$greater$default$10(), x$11 = ImageButton$.MODULE$.$lessinit$greater$default$11(), x$12 = ImageButton$.MODULE$.$lessinit$greater$default$12(); powerButton_$eq(new ImageButton(x$1, x$2, x$3, x$4, x$5, x$6, x$8, x$7, x$9, x$10, x$11, x$12));
/* 47 */     add(this.field_146292_n, powerButton());
/*    */   }
/*    */   
/*    */   public void drawSecondaryForegroundLayer(int mouseX, int mouseY) {
/* 51 */     super.drawSecondaryForegroundLayer(mouseX, mouseY);
/* 52 */     this.field_146289_q.func_78276_b(
/* 53 */         Localization$.MODULE$.localizeImmediately(this.serverInventory.func_145825_b()), 
/* 54 */         8, 6, 4210752);
/* 55 */     if (powerButton().func_146115_a()) {
/* 56 */       ArrayList<?> tooltip = new ArrayList();
/* 57 */       tooltip.addAll(WrapAsJava$.MODULE$.asJavaCollection(inventoryContainer().isRunning() ? (new StringOps(Predef$.MODULE$.augmentString(Localization$Computer$.MODULE$.TurnOff()))).lines().toIterable() : (new StringOps(Predef$.MODULE$.augmentString(Localization$Computer$.MODULE$.TurnOn()))).lines().toIterable()));
/* 58 */       copiedDrawHoveringText(tooltip, mouseX - this.field_147003_i, mouseY - this.field_147009_r, this.field_146289_q);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void drawSecondaryBackgroundLayer() {
/* 63 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/* 64 */     this.field_146297_k.field_71446_o.func_110577_a(Textures$.MODULE$.guiServer());
/* 65 */     func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
/*    */   }
/*    */   
/*    */   public static int $lessinit$greater$default$4() {
/*    */     return Server$.MODULE$.$lessinit$greater$default$4();
/*    */   }
/*    */   
/*    */   public static Option<Rack> $lessinit$greater$default$3() {
/*    */     return Server$.MODULE$.$lessinit$greater$default$3();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Server.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */