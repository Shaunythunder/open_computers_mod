/*    */ package li.cil.oc.client.gui;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import li.cil.oc.Localization$Computer$;
/*    */ import li.cil.oc.client.Textures$;
/*    */ import net.minecraft.entity.player.InventoryPlayer;
/*    */ import scala.Predef$;
/*    */ import scala.collection.immutable.StringOps;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\00194A!\001\002\001\033\t!1)Y:f\025\t\031A!A\002hk&T!!\002\004\002\r\rd\027.\0328u\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\003\0019\0012a\004\t\023\033\005\021\021BA\t\003\005M!\025P\\1nS\016<U/[\"p]R\f\027N\\3s!\t\031\002$D\001\025\025\t)b#A\005d_:$\030-\0338fe*\021qCB\001\007G>lWn\0348\n\005\005!\002\002\003\016\001\005\003\005\013\021B\016\002\037Ad\027-_3s\023:4XM\034;pef\004\"\001H\023\016\003uQ!AH\020\002\rAd\027-_3s\025\t\001\023%\001\004f]RLG/\037\006\003E\r\n\021\"\\5oK\016\024\030M\032;\013\003\021\n1A\\3u\023\t1SDA\bJ]Z,g\016^8ssBc\027-_3s\021!A\003A!b\001\n\003I\023\001C2p[B,H/\032:\026\003)\002\"a\013\030\016\0031R!!\f\f\002\025QLG.Z3oi&$\0300\003\002\002Y!A\001\007\001B\001B\003%!&A\005d_6\004X\017^3sA!)!\007\001C\001g\0051A(\0338jiz\"2\001N\0337!\ty\001\001C\003\033c\001\0071\004C\003)c\001\007!\006C\0059\001\001\007\t\031!C\ts\005Y\001o\\<fe\n+H\017^8o+\005Q\004CA\b<\023\ta$AA\006J[\006<WMQ;ui>t\007\"\003 \001\001\004\005\r\021\"\005@\003=\001xn^3s\005V$Ho\0348`I\025\fHC\001!G!\t\tE)D\001C\025\005\031\025!B:dC2\f\027BA#C\005\021)f.\033;\t\017\035k\024\021!a\001u\005\031\001\020J\031\t\r%\003\001\025)\003;\0031\001xn^3s\005V$Ho\0348!\021\025Y\005\001\"\025M\003=\t7\r^5p]B+'OZ8s[\026$GC\001!N\021\025q%\n1\001P\003\031\021W\017\036;p]B\021\001kU\007\002#*\0211A\025\006\003\013\005J!\001V)\003\023\035+\030NQ;ui>t\007\"\002,\001\t\003:\026A\0033sC^\0346M]3f]R!\001\tW/`\021\025IV\0131\001[\003\031iw.^:f1B\021\021iW\005\0039\n\0231!\0238u\021\025qV\0131\001[\003\031iw.^:f3\")\001-\026a\001C\006\021A\r\036\t\003\003\nL!a\031\"\003\013\031cw.\031;\t\013\025\004A\021\t4\002\017%t\027\016^$vSR\t\001\tC\003i\001\021E\023.\001\017ee\006<8+Z2p]\022\f'/\037$pe\026<'o\\;oI2\013\0270\032:\025\007\001S7\016C\003ZO\002\007!\fC\003_O\002\007!\fC\003n\001\021\005c-\001\017ee\006<8+Z2p]\022\f'/\037\"bG.<'o\\;oI2\013\0270\032:")
/*    */ public class Case extends DynamicGuiContainer<Case> {
/*    */   private final li.cil.oc.common.tileentity.Case computer;
/*    */   
/* 14 */   public li.cil.oc.common.tileentity.Case computer() { return this.computer; } private ImageButton powerButton; public Case(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Case computer) { super(new Case(playerInventory, computer)); }
/* 15 */   public ImageButton powerButton() { return this.powerButton; } public void powerButton_$eq(ImageButton x$1) { this.powerButton = x$1; }
/*    */   
/*    */   public void func_146284_a(GuiButton button) {
/* 18 */     if (button.field_146127_k == 0) {
/* 19 */       PacketSender$.MODULE$.sendComputerPower((Computer)computer(), !computer().isRunning());
/*    */     }
/*    */   }
/*    */   
/*    */   public void func_73863_a(int mouseX, int mouseY, float dt) {
/* 24 */     powerButton().toggled_$eq(computer().isRunning());
/* 25 */     super.func_73863_a(mouseX, mouseY, dt);
/*    */   }
/*    */   
/*    */   public void func_73866_w_() {
/* 29 */     super.func_73866_w_();
/* 30 */     int x$1 = 0, x$2 = this.field_147003_i + 70, x$3 = this.field_147009_r + 33, x$4 = 18, x$5 = 18; ResourceLocation x$6 = Textures$.MODULE$.guiButtonPower(); boolean x$7 = true; String x$8 = ImageButton$.MODULE$.$lessinit$greater$default$7(); int x$9 = ImageButton$.MODULE$.$lessinit$greater$default$9(), x$10 = ImageButton$.MODULE$.$lessinit$greater$default$10(), x$11 = ImageButton$.MODULE$.$lessinit$greater$default$11(), x$12 = ImageButton$.MODULE$.$lessinit$greater$default$12(); powerButton_$eq(new ImageButton(x$1, x$2, x$3, x$4, x$5, x$6, x$8, x$7, x$9, x$10, x$11, x$12));
/* 31 */     add(this.field_146292_n, powerButton());
/*    */   }
/*    */   
/*    */   public void drawSecondaryForegroundLayer(int mouseX, int mouseY) {
/* 35 */     super.drawSecondaryForegroundLayer(mouseX, mouseY);
/* 36 */     this.field_146289_q.func_78276_b(
/* 37 */         Localization$.MODULE$.localizeImmediately(computer().func_145825_b()), 
/* 38 */         8, 6, 4210752);
/* 39 */     if (powerButton().func_146115_a()) {
/* 40 */       ArrayList<?> tooltip = new ArrayList();
/* 41 */       tooltip.addAll(WrapAsJava$.MODULE$.asJavaCollection(computer().isRunning() ? (new StringOps(Predef$.MODULE$.augmentString(Localization$Computer$.MODULE$.TurnOff()))).lines().toIterable() : (new StringOps(Predef$.MODULE$.augmentString(Localization$Computer$.MODULE$.TurnOn()))).lines().toIterable()));
/* 42 */       copiedDrawHoveringText(tooltip, mouseX - this.field_147003_i, mouseY - this.field_147009_r, this.field_146289_q);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void drawSecondaryBackgroundLayer() {
/* 47 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/* 48 */     this.field_146297_k.field_71446_o.func_110577_a(Textures$.MODULE$.guiComputer());
/* 49 */     func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Case.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */