/*     */ package li.cil.oc.client.renderer;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.EventPriority;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import cpw.mods.fml.common.gameevent.TickEvent;
/*     */ import java.util.concurrent.Callable;
/*     */ import li.cil.oc.api.event.RobotRenderEvent;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraftforge.client.event.RenderPlayerEvent;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ import scala.Serializable;
/*     */ import scala.collection.mutable.Set;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t=s!B\001\003\021\003i\021a\003)fiJ+g\016Z3sKJT!a\001\003\002\021I,g\016Z3sKJT!!\002\004\002\r\rd\027.\0328u\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\f!\026$(+\0328eKJ,'o\005\002\020%A\0211CF\007\002))\tQ#A\003tG\006d\027-\003\002\030)\t1\021I\\=SK\032DQ!G\b\005\002i\ta\001P5oSRtD#A\007\t\017qy!\031!C\001;\0051\001.\0333eK:,\022A\b\t\004?\0212S\"\001\021\013\005\005\022\023aB7vi\006\024G.\032\006\003GQ\t!bY8mY\026\034G/[8o\023\t)\003EA\002TKR\004\"a\n\026\017\005MA\023BA\025\025\003\031\001&/\0323fM&\0211\006\f\002\007'R\024\030N\\4\013\005%\"\002B\002\030\020A\003%a$A\004iS\022$WM\034\021\t\017Az\001\031!C\001c\005i\021n]%oSRL\027\r\\5{K\022,\022A\r\t\003'MJ!\001\016\013\003\017\t{w\016\\3b]\"9ag\004a\001\n\0039\024!E5t\023:LG/[1mSj,Gm\030\023fcR\021\001h\017\t\003'eJ!A\017\013\003\tUs\027\016\036\005\byU\n\t\0211\0013\003\rAH%\r\005\007}=\001\013\025\002\032\002\035%\034\030J\\5uS\006d\027N_3eA!9\001i\004b\001\n\023\t\025aD3oi&$H.\0323QY\006LXM]:\026\003\t\003Ba\021$I\0376\tAI\003\002FE\005I\021.\\7vi\006\024G.Z\005\003\017\022\0231!T1q!\tIe*D\001K\025\tYE*\001\003mC:<'\"A'\002\t)\fg/Y\005\003W)\003Ra\005)S%JK!!\025\013\003\rQ+\b\017\\34!\t\0312+\003\002U)\t1Ai\\;cY\026DaAV\b!\002\023\021\025\001E3oi&$H.\0323QY\006LXM]:!\021\035AvB1A\005\ne\013A\002]3u\031>\034\027\r^5p]N,\022A\027\t\0057\0224\007/D\001]\025\tif,A\003dC\016DWM\003\002`A\00611m\\7n_:T!!\0312\002\r\035|wn\0327f\025\005\031\027aA2p[&\021Q\r\030\002\006\007\006\034\007.\032\t\003O:l\021\001\033\006\003S*\fa!\0328uSRL(BA6m\003%i\027N\\3de\0064GOC\001n\003\rqW\r^\005\003_\"\024a!\0228uSRL\bCA9s\033\005ya\001B:\020\tQ\0241\002U3u\031>\034\027\r^5p]N\021!O\005\005\tmJ\024)\031!C\001o\006)qn\0368feV\ta\r\003\005ze\n\005\t\025!\003g\003\031ywO\\3sA!)\021D\035C\001wR\021\001\017 \005\006mj\004\rA\032\005\b}J\004\r\021\"\001\000\003\005AX#\001*\t\023\005\r!\0171A\005\002\005\025\021!\002=`I\025\fHc\001\035\002\b!AA(!\001\002\002\003\007!\013C\004\002\fI\004\013\025\002*\002\005a\004\003\002CA\be\002\007I\021A@\002\003eD\021\"a\005s\001\004%\t!!\006\002\013e|F%Z9\025\007a\n9\002\003\005=\003#\t\t\0211\001S\021\035\tYB\035Q!\nI\013!!\037\021\t\021\005}!\0171A\005\002}\f\021A\037\005\n\003G\021\b\031!C\001\003K\tQA_0%KF$2\001OA\024\021!a\024\021EA\001\002\004\021\006bBA\026e\002\006KAU\001\003u\002B\021\"a\fs\001\004%\t!!\r\002\007e\fw/\006\002\0024A\0311#!\016\n\007\005]BCA\003GY>\fG\017C\005\002<I\004\r\021\"\001\002>\0059\0210Y<`I\025\fHc\001\035\002@!IA(!\017\002\002\003\007\0211\007\005\t\003\007\022\b\025)\003\0024\005!\0210Y<!\021!\t9E\035a\001\n\003y\030!\0027bgRD\006\"CA&e\002\007I\021AA'\003%a\027m\035;Y?\022*\027\017F\0029\003\037B\001\002PA%\003\003\005\rA\025\005\b\003'\022\b\025)\003S\003\031a\027m\035;YA!A\021q\013:A\002\023\005q0A\003mCN$\030\fC\005\002\\I\004\r\021\"\001\002^\005IA.Y:u3~#S-\035\013\004q\005}\003\002\003\037\002Z\005\005\t\031\001*\t\017\005\r$\017)Q\005%\0061A.Y:u3\002B\001\"a\032s\001\004%\ta`\001\006Y\006\034HO\027\005\n\003W\022\b\031!C\001\003[\n\021\002\\1tij{F%Z9\025\007a\ny\007\003\005=\003S\n\t\0211\001S\021\035\t\031H\035Q!\nI\013a\001\\1tij\003\003\"CA<e\002\007I\021AA\031\003\035a\027m\035;ZC^D\021\"a\037s\001\004%\t!! \002\0271\f7\017^-bo~#S-\035\013\004q\005}\004\"\003\037\002z\005\005\t\031AA\032\021!\t\031I\035Q!\n\005M\022\001\0037bgRL\026m\036\021\t\017\005\035%\017\"\001\002\n\0061Q\017\0353bi\026$\022\001\017\005\b\003\033\023H\021AAH\003\001\n\007\017\0357z\023:$XM\0359pY\006$X\r\032+sC:\034hm\034:nCRLwN\\:\025\007a\n\t\n\003\005\002\024\006-\005\031AA\032\003\t!G\017\003\004\002\030J$I!M\001\017SN4uN]%om\026tGo\034:z\021\035\tYj\004Q\001\ni\013Q\002]3u\031>\034\027\r^5p]N\004\003\"CAP\037\001\007I\021BAQ\003%\021XM\0343fe&tw-\006\002\002$B!1#!*P\023\r\t9\013\006\002\007\037B$\030n\0348\t\023\005-v\0021A\005\n\0055\026!\004:f]\022,'/\0338h?\022*\027\017F\0029\003_C\021\002PAU\003\003\005\r!a)\t\021\005Mv\002)Q\005\003G\013!B]3oI\026\024\030N\\4!\021\035\t9l\004C\001\003s\013ab\0348QY\006LXM\035*f]\022,'\017F\0029\003wC\001\"!0\0026\002\007\021qX\001\002KB!\021\021YAj\035\021\t\031-a4\016\005\005\025'\002BAd\003\023\fQ!\032<f]RT1!BAf\025\r\ti\r\\\001\017[&tWm\031:bMR4wN]4f\023\021\t\t.!2\002#I+g\016Z3s!2\f\0270\032:Fm\026tG/\003\003\002V\006]'a\001)sK*!\021\021[AcQ\021\t),a7\021\t\005u\027\021_\007\003\003?TA!!9\002d\006aQM^3oi\"\fg\016\0327fe*\031q,!:\013\t\005\035\030\021^\001\004M6d'\002BAv\003[\fA!\\8eg*\021\021q^\001\004GB<\030\002BAz\003?\024abU;cg\016\024\030NY3Fm\026tG\017C\004\002x>!\t!!?\002\033=t'k\0342piJ+g\016Z3s)\rA\0241 \005\t\003{\013)\0201\001\002~B!\021q B\004\033\t\021\tA\003\003\002H\n\r!b\001B\003\r\005\031\021\r]5\n\t\t%!\021\001\002\021%>\024w\016\036*f]\022,'/\022<f]RD\003\"!>\002\\\n5!qB\001\taJLwN]5us\022\022!\021C\005\005\005'\021)\"\001\004M\037^+5\013\026\006\005\005/\ty.A\007Fm\026tG\017\025:j_JLG/\037\005\b\0057yA\021\001B\017\003%!\030nY6Ti\006\024H\017F\0029\005?A\001\"!0\003\032\001\007!\021\005\t\005\005G\0219E\004\003\003&\t\005c\002\002B\024\005{qAA!\013\003<9!!1\006B\035\035\021\021iCa\016\017\t\t=\"QG\007\003\005cQ1Aa\r\r\003\031a$o\\8u}%\021\021q^\005\005\003W\fi/\003\003\002h\006%\030bA0\002f&!!qHAr\003%9\027-\\3fm\026tG/\003\003\003D\t\025\023!\003+jG.,e/\0328u\025\021\021y$a9\n\t\t%#1\n\002\020\0072LWM\034;US\016\\WI^3oi*!!1\tB#Q\021\021I\"a7")
/*     */ public final class PetRenderer
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void tickStart(TickEvent.ClientTickEvent paramClientTickEvent) {
/*     */     PetRenderer$.MODULE$.tickStart(paramClientTickEvent);
/*     */   }
/*     */   
/*     */   @SubscribeEvent(priority = EventPriority.LOWEST)
/*     */   public static void onRobotRender(RobotRenderEvent paramRobotRenderEvent) {
/*     */     PetRenderer$.MODULE$.onRobotRender(paramRobotRenderEvent);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void onPlayerRender(RenderPlayerEvent.Pre paramPre) {
/*     */     PetRenderer$.MODULE$.onPlayerRender(paramPre);
/*     */   }
/*     */   
/*     */   public static void isInitialized_$eq(boolean paramBoolean) {
/*     */     PetRenderer$.MODULE$.isInitialized_$eq(paramBoolean);
/*     */   }
/*     */   
/*     */   public static boolean isInitialized() {
/*     */     return PetRenderer$.MODULE$.isInitialized();
/*     */   }
/*     */   
/*     */   public static Set<String> hidden() {
/*     */     return PetRenderer$.MODULE$.hidden();
/*     */   }
/*     */   
/*     */   public final class PetRenderer$$anon$1
/*     */     implements Callable<PetLocation>
/*     */   {
/*     */     private final RenderPlayerEvent.Pre e$1;
/*     */     
/*     */     public PetRenderer$$anon$1(RenderPlayerEvent.Pre e$1) {}
/*     */     
/*     */     public PetRenderer.PetLocation call() {
/*  60 */       return new PetRenderer.PetLocation((Entity)this.e$1.entityPlayer);
/*     */     }
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class PetLocation
/*     */   {
/*     */     private final Entity owner;
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
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Entity owner() {
/* 101 */       return this.owner;
/* 102 */     } private double x = 0.0D; public double x() { return this.x; } public void x_$eq(double x$1) { this.x = x$1; }
/* 103 */      private double y = 0.0D; public double y() { return this.y; } public void y_$eq(double x$1) { this.y = x$1; }
/* 104 */      private double z = 0.0D; private float yaw; private double lastX; private double lastY; private double lastZ; private float lastYaw; public double z() { return this.z; } public void z_$eq(double x$1) { this.z = x$1; }
/* 105 */     public float yaw() { return this.yaw; } public void yaw_$eq(float x$1) { this.yaw = x$1; } public double lastX() { return this.lastX; } public void lastX_$eq(double x$1) { this.lastX = x$1; } public PetLocation(Entity owner) { this.yaw = owner.field_70177_z;
/*     */       
/* 107 */       this.lastX = x();
/* 108 */       this.lastY = y();
/* 109 */       this.lastZ = z();
/* 110 */       this.lastYaw = yaw(); } public double lastY() { return this.lastY; } public float lastYaw() { return this.lastYaw; } public void lastY_$eq(double x$1) { this.lastY = x$1; } public double lastZ() { return this.lastZ; } public void lastZ_$eq(double x$1) { this.lastZ = x$1; } public void lastYaw_$eq(float x$1) { this.lastYaw = x$1; }
/*     */     
/*     */     public void update() {
/* 113 */       double dx = (owner()).field_70142_S - (owner()).field_70165_t;
/* 114 */       double dy = (owner()).field_70137_T - (owner()).field_70163_u;
/* 115 */       double dz = (owner()).field_70136_U - (owner()).field_70161_v;
/* 116 */       float dYaw = (owner()).field_70177_z - yaw();
/* 117 */       lastX_$eq(x());
/* 118 */       lastY_$eq(y());
/* 119 */       lastZ_$eq(z());
/* 120 */       lastYaw_$eq(yaw());
/* 121 */       x_$eq(x() + dx);
/* 122 */       y_$eq(y() + dy);
/* 123 */       z_$eq(z() + dz);
/* 124 */       x_$eq(x() * 0.05D);
/* 125 */       y_$eq(y() * 0.05D);
/* 126 */       z_$eq(z() * 0.05D);
/* 127 */       yaw_$eq(yaw() + dYaw * 0.2F);
/*     */     }
/*     */     
/*     */     public void applyInterpolatedTransformations(float dt) {
/* 131 */       double ix = lastX() + (x() - lastX()) * dt;
/* 132 */       double iy = lastY() + (y() - lastY()) * dt;
/* 133 */       double iz = lastZ() + (z() - lastZ()) * dt;
/* 134 */       float iYaw = lastYaw() + (yaw() - lastYaw()) * dt;
/*     */       
/* 136 */       GL11.glTranslated(ix, iy, iz);
/* 137 */       if (isForInventory())
/*     */       
/*     */       { 
/*     */         
/* 141 */         GL11.glRotatef(-(owner()).field_70177_z, 0.0F, 1.0F, 0.0F); }
/*     */       else { GL11.glRotatef(-iYaw, 0.0F, 1.0F, 0.0F); }
/* 143 */        GL11.glTranslated(0.3D, -0.1D, -0.2D);
/*     */     }
/*     */     
/*     */     private boolean isForInventory() {
/*     */       // Byte code:
/*     */       //   0: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */       //   3: getfield field_71462_r : Lnet/minecraft/client/gui/GuiScreen;
/*     */       //   6: ifnull -> 43
/*     */       //   9: aload_0
/*     */       //   10: invokevirtual owner : ()Lnet/minecraft/entity/Entity;
/*     */       //   13: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */       //   16: getfield field_71439_g : Lnet/minecraft/client/entity/EntityClientPlayerMP;
/*     */       //   19: astore_1
/*     */       //   20: dup
/*     */       //   21: ifnonnull -> 32
/*     */       //   24: pop
/*     */       //   25: aload_1
/*     */       //   26: ifnull -> 39
/*     */       //   29: goto -> 43
/*     */       //   32: aload_1
/*     */       //   33: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   36: ifeq -> 43
/*     */       //   39: iconst_1
/*     */       //   40: goto -> 44
/*     */       //   43: iconst_0
/*     */       //   44: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #146	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	45	0	this	Lli/cil/oc/client/renderer/PetRenderer$PetLocation;
/*     */     } }
/*     */   
/*     */   public final class PetRenderer$$anonfun$tickStart$1 extends AbstractFunction1<PetLocation, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final void apply(PetRenderer.PetLocation pet) {
/* 153 */       pet.update();
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\PetRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */