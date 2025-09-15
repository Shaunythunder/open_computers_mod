/*     */ package li.cil.oc.client.renderer.item;
/*     */ 
/*     */ import java.util.Random;
/*     */ import li.cil.oc.util.RenderState$;
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.client.model.TextureOffset;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.reflect.ScalaSignature;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005-s!B\001\003\021\003y\021!\005%pm\026\024(i\\8u%\026tG-\032:fe*\0211\001B\001\005SR,WN\003\002\006\r\005A!/\0328eKJ,'O\003\002\b\021\00511\r\\5f]RT!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001!\t\001\022#D\001\003\r\025\021\"\001#\001\024\005EAuN^3s\005>|GOU3oI\026\024XM]\n\003#Q\001\"!F\017\016\003YQ!a\006\r\002\0135|G-\0327\013\005\035I\"B\001\016\034\003%i\027N\\3de\0064GOC\001\035\003\rqW\r^\005\003=Y\021!\"T8eK2\024\025\016]3e\021\025\001\023\003\"\001\"\003\031a\024N\\5u}Q\tq\002C\004$#\t\007I\021\001\023\002\017Q,\007\020^;sKV\tQ\005\005\002'S5\tqE\003\002)3\005!Q\017^5m\023\tQsE\001\tSKN|WO]2f\031>\034\027\r^5p]\"1A&\005Q\001\n\025\n\001\002^3yiV\024X\r\t\005\b]E\021\r\021\"\0010\003!\021wn\034;MK\032$X#\001\031\021\005U\t\024B\001\032\027\0055iu\016Z3m%\026tG-\032:fe\"1A'\005Q\001\nA\n\021BY8pi2+g\r\036\021\t\017Y\n\"\031!C\001_\005I!m\\8u%&<\007\016\036\005\007qE\001\013\021\002\031\002\025\t|w\016\036*jO\"$\b\005C\004;#\t\007I\021A\030\002\t\t|G-\037\005\007yE\001\013\021\002\031\002\013\t|G-\037\021\t\017y\n\"\031!C\001_\005)q/\0338ha!1\001)\005Q\001\nA\naa^5oOB\002\003b\002\"\022\005\004%\taL\001\006o&tw-\r\005\007\tF\001\013\021\002\031\002\r]LgnZ\031!\021\0351\025C1A\005\002=\nQa^5oOJBa\001S\t!\002\023\001\024AB<j]\036\024\004\005C\004K#\t\007I\021A\030\002\013]LgnZ\032\t\r1\013\002\025!\0031\003\0319\030N\\44A!9a*\005b\001\n\003y\025A\0027jO\"$\b'F\001Q!\t\t&+D\001\022\r\021\031\026\003\001+\003%1Kw\r\033;N_\022,GNU3oI\026\024XM]\n\003%BB\001B\026*\003\002\003\006IaV\001\n[>$W\r\034\"bg\026\004\"!\006-\n\005e3\"!C'pI\026d')Y:f\021!Y&K!A!\002\023a\026\001\0028b[\026\004\"!X2\017\005y\013W\"A0\013\003\001\fQa]2bY\006L!AY0\002\rA\023X\rZ3g\023\t!WM\001\004TiJLgn\032\006\003E~CQ\001\t*\005\002\035$2\001\0255j\021\0251f\r1\001X\021\025Yf\r1\001]\021\025Y'\013\"\021m\003\031\021XM\0343feR\021Q\016\035\t\003=:L!a\\0\003\tUs\027\016\036\005\006c*\004\rA]\001\003IR\004\"AX:\n\005Q|&!\002$m_\006$\bB\002<\022A\003%\001+A\004mS\036DG\017\r\021\t\017a\f\"\031!C\001\037\0061A.[4iiFBaA_\t!\002\023\001\026a\0027jO\"$\030\007\t\005\byF\021\r\021\"\001P\003\031a\027n\0325ue!1a0\005Q\001\nA\013q\001\\5hQR\024\004\005\003\005\002\002E\021\r\021\"\001P\003\031a\027n\0325ug!9\021QA\t!\002\023\001\026a\0027jO\"$8\007\t\005\n\003\023\t\002\031!C\001\003\027\t!\002\\5hQR\034u\016\\8s+\t\ti\001E\002_\003\037I1!!\005`\005\rIe\016\036\005\n\003+\t\002\031!C\001\003/\ta\002\\5hQR\034u\016\\8s?\022*\027\017F\002n\0033A!\"a\007\002\024\005\005\t\031AA\007\003\rAH%\r\005\t\003?\t\002\025)\003\002\016\005YA.[4ii\016{Gn\034:!\021\031Y\027\003\"\021\002$QyQ.!\n\0024\005]\0221HA \003\007\n9\005\003\005\002(\005\005\002\031AA\025\003\031)g\016^5usB!\0211FA\030\033\t\tiCC\002\002(eIA!!\r\002.\t1QI\034;jifDq!!\016\002\"\001\007!/\001\002ga!9\021\021HA\021\001\004\021\030A\00142\021\035\ti$!\tA\002I\f!A\032\032\t\017\005\005\023\021\005a\001e\006\021am\r\005\b\003\013\n\t\0031\001s\003\t1G\007C\004\002J\005\005\002\031\001:\002\005\031,\004")
/*     */ public final class HoverBootRenderer {
/*     */   public static void render(Entity paramEntity, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
/*     */     HoverBootRenderer$.MODULE$.func_78088_a(paramEntity, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6);
/*     */   }
/*     */   
/*     */   public static void lightColor_$eq(int paramInt) {
/*     */     HoverBootRenderer$.MODULE$.lightColor_$eq(paramInt);
/*     */   }
/*     */   
/*     */   public static int lightColor() {
/*     */     return HoverBootRenderer$.MODULE$.lightColor();
/*     */   }
/*     */   
/*     */   public static LightModelRenderer light3() {
/*     */     return HoverBootRenderer$.MODULE$.light3();
/*     */   }
/*     */   
/*     */   public static LightModelRenderer light2() {
/*     */     return HoverBootRenderer$.MODULE$.light2();
/*     */   }
/*     */   
/*     */   public static LightModelRenderer light1() {
/*     */     return HoverBootRenderer$.MODULE$.light1();
/*     */   }
/*     */   
/*     */   public static LightModelRenderer light0() {
/*     */     return HoverBootRenderer$.MODULE$.light0();
/*     */   }
/*     */   
/*     */   public static ModelRenderer wing3() {
/*     */     return HoverBootRenderer$.MODULE$.wing3();
/*     */   }
/*     */   
/*     */   public static ModelRenderer wing2() {
/*     */     return HoverBootRenderer$.MODULE$.wing2();
/*     */   }
/*     */   
/*     */   public static ModelRenderer wing1() {
/*     */     return HoverBootRenderer$.MODULE$.wing1();
/*     */   }
/*     */   
/*     */   public static ModelRenderer wing0() {
/*     */     return HoverBootRenderer$.MODULE$.wing0();
/*     */   }
/*     */   
/*     */   public static ModelRenderer body() {
/*     */     return HoverBootRenderer$.MODULE$.body();
/*     */   }
/*     */   
/*     */   public static ModelRenderer bootRight() {
/*     */     return HoverBootRenderer$.MODULE$.bootRight();
/*     */   }
/*     */   
/*     */   public static ModelRenderer bootLeft() {
/*     */     return HoverBootRenderer$.MODULE$.bootLeft();
/*     */   }
/*     */   
/*     */   public static ResourceLocation texture() {
/*     */     return HoverBootRenderer$.MODULE$.texture();
/*     */   }
/*     */   
/*     */   public static void renderCloak(float paramFloat) {
/*     */     HoverBootRenderer$.MODULE$.func_78111_c(paramFloat);
/*     */   }
/*     */   
/*     */   public static void renderEars(float paramFloat) {
/*     */     HoverBootRenderer$.MODULE$.func_78110_b(paramFloat);
/*     */   }
/*     */   
/*     */   public static void setRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Entity paramEntity) {
/*     */     HoverBootRenderer$.MODULE$.func_78087_a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramEntity);
/*     */   }
/*     */   
/*     */   public static TextureOffset getTextureOffset(String paramString) {
/*     */     return HoverBootRenderer$.MODULE$.func_78084_a(paramString);
/*     */   }
/*     */   
/*     */   public static ModelRenderer getRandomModelBox(Random paramRandom) {
/*     */     return HoverBootRenderer$.MODULE$.func_85181_a(paramRandom);
/*     */   }
/*     */   
/*     */   public static void setLivingAnimations(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3) {
/*     */     HoverBootRenderer$.MODULE$.func_78086_a(paramEntityLivingBase, paramFloat1, paramFloat2, paramFloat3);
/*     */   }
/*     */   
/*     */   public static class LightModelRenderer
/*     */     extends ModelRenderer {
/*     */     public LightModelRenderer(ModelBase modelBase, String name) {
/* 103 */       super(modelBase, name);
/*     */     } public void func_78785_a(float dt) {
/* 105 */       GL11.glPushAttrib(1048575);
/* 106 */       RenderState$.MODULE$.disableLighting();
/* 107 */       GL11.glDepthFunc(515);
/* 108 */       GL11.glBlendFunc(770, 1);
/* 109 */       byte r = (byte)(HoverBootRenderer$.MODULE$.lightColor() >>> 16 & 0xFF);
/* 110 */       byte g = (byte)(HoverBootRenderer$.MODULE$.lightColor() >>> 8 & 0xFF);
/* 111 */       byte b = (byte)(HoverBootRenderer$.MODULE$.lightColor() >>> 0 & 0xFF);
/* 112 */       GL11.glColor3ub(r, g, b);
/*     */       
/* 114 */       super.func_78785_a(dt);
/*     */       
/* 116 */       RenderState$.MODULE$.enableLighting();
/* 117 */       GL11.glPopAttrib();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\item\HoverBootRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */