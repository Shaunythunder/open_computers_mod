/*    */ package li.cil.oc.client.gui.widget;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\00153A!\001\002\001\037\tY\001K]8he\026\0348OQ1s\025\t\031A!\001\004xS\022<W\r\036\006\003\013\031\t1aZ;j\025\t9\001\"\001\004dY&,g\016\036\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011C\001\001\021!\t\t\"#D\001\003\023\t\031\"A\001\004XS\022<W\r\036\005\t+\001\021)\031!C\001-\005\t\0010F\001\030!\tA2$D\001\032\025\005Q\022!B:dC2\f\027B\001\017\032\005\rIe\016\036\005\t=\001\021\t\021)A\005/\005\021\001\020\t\005\tA\001\021)\031!C\001-\005\t\021\020\003\005#\001\t\005\t\025!\003\030\003\tI\b\005C\003%\001\021\005Q%\001\004=S:LGO\020\013\004M\035B\003CA\t\001\021\025)2\0051\001\030\021\025\0013\0051\001\030\021\025Q\003\001\"\021\027\003\0259\030\016\032;i\021\025a\003\001\"\021\027\003\031AW-[4ii\")a\006\001C\001_\005Q!-\031:UKb$XO]3\026\003A\002\"!\r\035\016\003IR!a\r\033\002\tU$\030\016\034\006\003kY\n\021\"\\5oK\016\024\030M\032;\013\003]\n1A\\3u\023\tI$G\001\tSKN|WO]2f\031>\034\027\r^5p]\"91\b\001a\001\n\003a\024!\0027fm\026dW#A\037\021\005aq\024BA \032\005\031!u.\0362mK\"9\021\t\001a\001\n\003\021\025!\0037fm\026dw\fJ3r)\t\031e\t\005\002\031\t&\021Q)\007\002\005+:LG\017C\004H\001\006\005\t\031A\037\002\007a$\023\007\003\004J\001\001\006K!P\001\007Y\0264X\r\034\021\t\013-\003A\021\001'\002\t\021\024\030m\036\013\002\007\002")
/*    */ public class ProgressBar extends Widget {
/*    */   private final int x;
/*    */   
/*  7 */   public int x() { return this.x; } private final int y; public int y() { return this.y; } public int width() {
/*  8 */     return 140;
/*    */   } public int height() {
/* 10 */     return 12;
/*    */   } public ResourceLocation barTexture() {
/* 12 */     return Textures$.MODULE$.guiBar();
/*    */   }
/* 14 */   private double level = 0.0D; public double level() { return this.level; } public void level_$eq(double x$1) { this.level = x$1; }
/*    */   
/*    */   public void draw() {
/* 17 */     if (level() > false) {
/* 18 */       int u0 = 0;
/* 19 */       double u1 = level();
/* 20 */       int v0 = 0;
/* 21 */       int v1 = 1;
/* 22 */       int tx = owner().windowX() + x();
/* 23 */       int ty = owner().windowY() + y();
/* 24 */       double w = width() * level();
/*    */       
/* 26 */       (Minecraft.func_71410_x()).field_71446_o.func_110577_a(barTexture());
/* 27 */       Tessellator t = Tessellator.field_78398_a;
/* 28 */       t.func_78382_b();
/* 29 */       t.func_78374_a(tx, ty, owner().windowZ(), u0, v0);
/* 30 */       t.func_78374_a(tx, (ty + height()), owner().windowZ(), u0, v1);
/* 31 */       t.func_78374_a(tx + w, (ty + height()), owner().windowZ(), u1, v1);
/* 32 */       t.func_78374_a(tx + w, ty, owner().windowZ(), u1, v0);
/* 33 */       t.func_78381_a();
/*    */     } 
/*    */   }
/*    */   
/*    */   public ProgressBar(int x, int y) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\widget\ProgressBar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */