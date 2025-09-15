/*    */ package li.cil.oc.client.gui;
/*    */ import li.cil.oc.client.PacketSender$;
/*    */ import net.minecraft.client.gui.GuiTextField;
/*    */ import net.minecraft.client.gui.ScaledResolution;
/*    */ import org.lwjgl.input.Keyboard;
/*    */ import scala.MatchError;
/*    */ import scala.Tuple2;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005%a\001B\001\003\0015\021\001bV1za>Lg\016\036\006\003\007\021\t1aZ;j\025\t)a!\001\004dY&,g\016\036\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011C\001\001\017!\tya#D\001\021\025\t\031\021C\003\002\006%)\0211\003F\001\n[&tWm\031:bMRT\021!F\001\004]\026$\030BA\f\021\005%9U/[*de\026,g\016\003\005\032\001\t\025\r\021\"\001\033\003!9\030-\0379pS:$X#A\016\021\005q\tS\"A\017\013\005yy\022A\003;jY\026,g\016^5us*\021\001EB\001\007G>lWn\0348\n\005\005i\002\002C\022\001\005\003\005\013\021B\016\002\023]\f\027\020]8j]R\004\003\"B\023\001\t\0031\023A\002\037j]&$h\b\006\002(SA\021\001\006A\007\002\005!)\021\004\na\0017!91\006\001a\001\n\003a\023aB4vS2+g\r^\013\002[A\021a&M\007\002_)\t\001'A\003tG\006d\027-\003\0023_\t\031\021J\034;\t\017Q\002\001\031!C\001k\005Yq-^5MK\032$x\fJ3r)\t1\024\b\005\002/o%\021\001h\f\002\005+:LG\017C\004;g\005\005\t\031A\027\002\007a$\023\007\003\004=\001\001\006K!L\001\tOVLG*\0324uA!9a\b\001a\001\n\003a\023AB4vSR{\007\017C\004A\001\001\007I\021A!\002\025\035,\030\016V8q?\022*\027\017\006\0027\005\"9!hPA\001\002\004i\003B\002#\001A\003&Q&A\004hk&$v\016\035\021\t\017\031\003\001\031!C\001Y\005)\001pU5{K\"9\001\n\001a\001\n\003I\025!\003=TSj,w\fJ3r)\t1$\nC\004;\017\006\005\t\031A\027\t\r1\003\001\025)\003.\003\031A8+\033>fA!9a\n\001a\001\n\003a\023!B=TSj,\007b\002)\001\001\004%\t!U\001\nsNK'0Z0%KF$\"A\016*\t\017iz\025\021!a\001[!1A\013\001Q!\n5\na!_*ju\026\004\003\"\003,\001\001\004\005\r\021\"\001X\003%!X\r\037;GS\026dG-F\001Y!\ty\021,\003\002[!\taq)^5UKb$h)[3mI\"IA\f\001a\001\002\004%\t!X\001\016i\026DHOR5fY\022|F%Z9\025\005Yr\006b\002\036\\\003\003\005\r\001\027\005\007A\002\001\013\025\002-\002\025Q,\007\020\036$jK2$\007\005C\003c\001\021\0053-\001\007va\022\fG/Z*de\026,g\016F\0017\021\025)\007\001\"\021g\003A!w.Z:Hk&\004\026-^:f\017\006lW\rF\001h!\tq\003.\003\002j_\t9!i\\8mK\006t\007\"B6\001\t\003\032\027aB5oSR<U/\033\005\006[\002!\teY\001\f_:<U/[\"m_N,G\rC\003p\001\021\005\003/\001\005lKf$\026\020]3e)\r1\024O\036\005\006e:\004\ra]\001\005G\"\f'\017\005\002/i&\021Qo\f\002\005\007\"\f'\017C\003x]\002\007Q&\001\003d_\022,\007\"B=\001\t\003R\030A\0033sC^\0346M]3f]R!ag_?\000\021\025a\b\0201\001.\003\031iw.^:f1\")a\020\037a\001[\0051Qn\\;tKfCq!!\001y\001\004\t\031!\001\002eiB\031a&!\002\n\007\005\035qFA\003GY>\fG\017")
/*    */ public class Waypoint extends GuiScreen {
/*    */   public li.cil.oc.common.tileentity.Waypoint waypoint() {
/* 12 */     return this.waypoint;
/* 13 */   } private final li.cil.oc.common.tileentity.Waypoint waypoint; private int guiLeft = 0; public int guiLeft() { return this.guiLeft; } public void guiLeft_$eq(int x$1) { this.guiLeft = x$1; }
/* 14 */    private int guiTop = 0; public int guiTop() { return this.guiTop; } public void guiTop_$eq(int x$1) { this.guiTop = x$1; }
/* 15 */    private int xSize = 0; public int xSize() { return this.xSize; } public void xSize_$eq(int x$1) { this.xSize = x$1; }
/* 16 */    private int ySize = 0; private GuiTextField textField; public int ySize() { return this.ySize; } public void ySize_$eq(int x$1) { this.ySize = x$1; }
/*    */   
/* 18 */   public GuiTextField textField() { return this.textField; } public void textField_$eq(GuiTextField x$1) { this.textField = x$1; }
/*    */   
/*    */   public void func_73876_c() {
/* 21 */     super.func_73876_c();
/* 22 */     if (this.field_146297_k.field_71439_g.func_70092_e(waypoint().x() + 0.5D, waypoint().y() + 0.5D, waypoint().z() + 0.5D) > 64)
/* 23 */       this.field_146297_k.field_71439_g.func_71053_j(); 
/*    */   }
/*    */   
/*    */   public boolean func_73868_f() {
/* 27 */     return false;
/*    */   }
/*    */   
/* 30 */   public void func_73866_w_() { super.func_73866_w_();
/*    */     
/* 32 */     ScaledResolution screenSize = new ScaledResolution(this.field_146297_k, this.field_146297_k.field_71443_c, this.field_146297_k.field_71440_d);
/* 33 */     ScaledResolution guiSize = new ScaledResolution(this.field_146297_k, 176, 24);
/* 34 */     Tuple2.mcII.sp sp = new Tuple2.mcII.sp(screenSize.func_78326_a() / 2, screenSize.func_78328_b() / 2); if (sp != null) { int midX = sp._1$mcI$sp(), midY = sp._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(midX, midY), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/* 35 */       guiLeft_$eq(i - guiSize.func_78326_a() / 2);
/* 36 */       guiTop_$eq(j - guiSize.func_78328_b() / 2);
/* 37 */       xSize_$eq(guiSize.func_78326_a());
/* 38 */       ySize_$eq(guiSize.func_78328_b());
/*    */       
/* 40 */       textField_$eq(new GuiTextField(this.field_146289_q, guiLeft() + 7, guiTop() + 8, 152, 12));
/* 41 */       textField().func_146203_f(32);
/* 42 */       textField().func_146185_a(false);
/* 43 */       textField().func_146205_d(false);
/* 44 */       textField().func_146195_b(true);
/* 45 */       textField().func_146193_g(16777215);
/* 46 */       textField().func_146180_a(waypoint().label());
/*    */       
/* 48 */       Keyboard.enableRepeatEvents(true);
/*    */       return; }
/*    */     
/*    */     throw new MatchError(sp); } public void func_146281_b() {
/* 52 */     super.func_146281_b();
/* 53 */     Keyboard.enableRepeatEvents(false);
/*    */   }
/*    */   
/*    */   public void func_73869_a(char char, int code) {
/* 57 */     if (!textField().func_146201_a(char, code))
/* 58 */       if (code == 28) {
/* 59 */         String label = (String)(new StringOps(Predef$.MODULE$.augmentString(textField().func_146179_b()))).take(32);
/* 60 */         String str1 = waypoint().label(); if (label == null) { if (str1 != null)
/* 61 */           { waypoint().label_$eq(label);
/* 62 */             PacketSender$.MODULE$.sendWaypointLabel(waypoint());
/* 63 */             this.field_146297_k.field_71439_g.func_71053_j(); return; }  } else if (!label.equals(str1)) { waypoint().label_$eq(label); PacketSender$.MODULE$.sendWaypointLabel(waypoint()); this.field_146297_k.field_71439_g.func_71053_j(); return; }
/*    */       
/*    */       } else {
/* 66 */         super.func_73869_a(char, code);
/*    */       }  
/*    */   }
/*    */   
/*    */   public void func_73863_a(int mouseX, int mouseY, float dt) {
/* 71 */     super.func_73863_a(mouseX, mouseY, dt);
/* 72 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/* 73 */     this.field_146297_k.field_71446_o.func_110577_a(Textures$.MODULE$.guiWaypoint());
/* 74 */     func_73729_b(guiLeft(), guiTop(), 0, 0, xSize(), ySize());
/* 75 */     textField().func_146194_f();
/*    */   }
/*    */   
/*    */   public Waypoint(li.cil.oc.common.tileentity.Waypoint waypoint) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Waypoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */