/*     */ package li.cil.oc.client.renderer.tileentity;
/*     */ 
/*     */ import com.google.common.cache.RemovalNotification;
/*     */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*     */ import cpw.mods.fml.common.gameevent.TickEvent;
/*     */ import java.nio.FloatBuffer;
/*     */ import net.minecraft.client.gui.FontRenderer;
/*     */ import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ import scala.Function1;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.IntRef;
/*     */ import scala.runtime.RichInt$;
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
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005\rw!B\001\003\021\003y\021\001\005%pY><'/Y7SK:$WM]3s\025\t\031A!\001\006uS2,WM\034;jifT!!\002\004\002\021I,g\016Z3sKJT!a\002\005\002\r\rd\027.\0328u\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001\001\t\003!Ei\021A\001\004\006%\tA\ta\005\002\021\021>dwn\032:b[J+g\016Z3sKJ\034B!\005\013 _A\021Q#H\007\002-)\0211a\006\006\003\013aQ!aB\r\013\005iY\022!C7j]\026\034'/\0314u\025\005a\022a\0018fi&\021aD\006\002\032)&dW-\0228uSRL8\013]3dS\006d'+\0328eKJ,'\017E\002!O%j\021!\t\006\003E\r\n!bY8oGV\024(/\0328u\025\t!S%\001\003vi&d'\"\001\024\002\t)\fg/Y\005\003Q\005\022\001bQ1mY\006\024G.\032\t\003U5j\021a\013\006\002Y\005)1oY1mC&\021af\013\002\004\023:$\b\003\002\031:w%j\021!\r\006\003eM\nQaY1dQ\026T!\001N\033\002\r\r|W.\\8o\025\t1t'\001\004h_><G.\032\006\002q\005\0311m\\7\n\005i\n$a\004*f[>4\030\r\034'jgR,g.\032:\021\005qrT\"A\037\013\005\rI\022BA >\005)!\026\016\\3F]RLG/\037\005\006\003F!\tAQ\001\007y%t\027\016\036 \025\003=Aq\001R\tC\002\023%Q)\001\004sC:$w.\\\013\002\rB\021q)S\007\002\021*\021AeK\005\003\025\"\023aAU1oI>l\007B\002'\022A\003%a)A\004sC:$w.\034\021\t\017I\n\"\031!C\005\035V\tq\n\005\0031!JK\023BA)2\005\025\031\025m\0315f!\t\031f+D\001U\025\t\031QK\003\0025\021%\021q\013\026\002\t\021>dwn\032:b[\"1\021,\005Q\001\n=\013aaY1dQ\026\004\003bB.\022\001\004%I\001X\001\rG>lWn\0348Ck\0324WM]\013\002S!9a,\005a\001\n\023y\026\001E2p[6|gNQ;gM\026\024x\fJ3r)\t\0017\r\005\002+C&\021!m\013\002\005+:LG\017C\004e;\006\005\t\031A\025\002\007a$\023\007\003\004g#\001\006K!K\001\016G>lWn\0348Ck\0324WM\035\021\t\017!\f\002\031!C\005S\006QA-\031;b\005V4g-\032:\026\003)\004\"a\0338\016\0031T!!\\\023\002\0079Lw.\003\002pY\nI\021J\034;Ck\0324WM\035\005\bcF\001\r\021\"\003s\0039!\027\r^1Ck\0324WM]0%KF$\"\001Y:\t\017\021\004\030\021!a\001U\"1Q/\005Q!\n)\f1\002Z1uC\n+hMZ3sA!9q/\005a\001\n\023A\030\001\0035pY><'/Y7\026\003ICqA_\tA\002\023%10\001\007i_2|wM]1n?\022*\027\017\006\002ay\"9A-_A\001\002\004\021\006B\002@\022A\003&!+A\005i_2|wM]1nA!I\021\021A\tA\002\023%\0211A\001\007M\006LG.\0323\026\005\005\025\001c\001\026\002\b%\031\021\021B\026\003\017\t{w\016\\3b]\"I\021QB\tA\002\023%\021qB\001\013M\006LG.\0323`I\025\fHc\0011\002\022!IA-a\003\002\002\003\007\021Q\001\005\t\003+\t\002\025)\003\002\006\0059a-Y5mK\022\004\003bBA\r#\021\005\0231D\001\023e\026tG-\032:US2,WI\034;jif\fE\017F\006a\003;\t\t#a\013\0020\005M\002bBA\020\003/\001\raO\001\003i\026D\001\"a\t\002\030\001\007\021QE\001\002qB\031!&a\n\n\007\005%2F\001\004E_V\024G.\032\005\t\003[\t9\0021\001\002&\005\t\021\020\003\005\0022\005]\001\031AA\023\003\005Q\b\002CA\033\003/\001\r!a\016\002\003\031\0042AKA\035\023\r\tYd\013\002\006\r2|\027\r\036\005\b\003\tB\021AA!\003\021!'/Y<\025\007\001\f\031\005C\004\002F\005u\002\031A\025\002\021\035d')\0364gKJDq!!\023\022\t\023\tY%\001\006j]&$\030.\0317ju\026$\"!!\002\t\017\005=\023\003\"\003\002R\005Aa/\0317jI\006$X\rF\002a\003'Bq!!\022\002N\001\007\021\006C\004\002XE!I!!\027\002\017A,(\r\\5tQR\031\001-a\027\t\017\005\025\023Q\013a\001S!9\021qL\t\005\002\005\005\024\001B2bY2$\022!\013\005\b\003K\nB\021AA4\003%ygNU3n_Z\fG\016F\002a\003SB\001\"a\033\002d\001\007\021QN\001\002KB)\001'a\034<S%\031\021\021O\031\003'I+Wn\034<bY:{G/\0334jG\006$\030n\0348\t\017\005U\024\003\"\001\002x\0051qN\034+jG.$2\001YA=\021!\tY'a\035A\002\005m\004\003BA?\003_sA!a \002*:!\021\021QAR\035\021\t\031)a(\017\t\005\025\025\021\024\b\005\003\017\013\031J\004\003\002\n\006=UBAAF\025\r\tiID\001\007yI|w\016\036 \n\005\005E\025aA2qo&!\021QSAL\003\021iw\016Z:\013\005\005E\025\002BAN\003;\0131AZ7m\025\021\t)*a&\n\007Q\n\tK\003\003\002\034\006u\025\002BAS\003O\013\021bZ1nK\0264XM\034;\013\007Q\n\t+\003\003\002,\0065\026!\003+jG.,e/\0328u\025\021\t)+a*\n\t\005E\0261\027\002\020\0072LWM\034;US\016\\WI^3oi*!\0211VAWQ\021\t\031(a.\021\t\005e\026qX\007\003\003wSA!!0\002(\006aQM^3oi\"\fg\016\0327fe&!\021\021YA^\0059\031VOY:de&\024W-\022<f]R\004")
/*     */ public final class HologramRenderer
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void onTick(TickEvent.ClientTickEvent paramClientTickEvent) {
/*     */     HologramRenderer$.MODULE$.onTick(paramClientTickEvent);
/*     */   }
/*     */   
/*     */   public static void onRemoval(RemovalNotification<TileEntity, Object> paramRemovalNotification) {
/*     */     HologramRenderer$.MODULE$.onRemoval(paramRemovalNotification);
/*     */   }
/*     */   
/*     */   public static int call() {
/*     */     return HologramRenderer$.MODULE$.call();
/*     */   }
/*     */   
/*     */   public static void draw(int paramInt) {
/*     */     HologramRenderer$.MODULE$.draw(paramInt);
/*     */   }
/*     */   
/*     */   public static void renderTileEntityAt(TileEntity paramTileEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*     */     HologramRenderer$.MODULE$.func_147500_a(paramTileEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat);
/*     */   }
/*     */   
/*     */   public static FontRenderer func_147498_b() {
/*     */     return HologramRenderer$.MODULE$.func_147498_b();
/*     */   }
/*     */   
/*     */   public static void func_147496_a(World paramWorld) {
/*     */     HologramRenderer$.MODULE$.func_147496_a(paramWorld);
/*     */   }
/*     */   
/*     */   public static void func_147497_a(TileEntityRendererDispatcher paramTileEntityRendererDispatcher) {
/*     */     HologramRenderer$.MODULE$.func_147497_a(paramTileEntityRendererDispatcher);
/*     */   }
/*     */   
/*     */   public final class HologramRenderer$$anonfun$liftedTree1$1$1
/*     */     extends AbstractFunction1.mcVI.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final FloatBuffer data$1;
/*     */     
/*     */     public final void apply(int x) {
/* 184 */       apply$mcVI$sp(x);
/* 185 */     } public HologramRenderer$$anonfun$liftedTree1$1$1(FloatBuffer data$1) {} public void apply$mcVI$sp(int x) { RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), 48).foreach$mVc$sp((Function1)new HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1(this, x)); } public final class HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int z) { apply$mcVI$sp(z); } public final int x$1; public HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1(HologramRenderer$$anonfun$liftedTree1$1$1 $outer, int x$1) {} public void apply$mcVI$sp(int z) {
/* 186 */         RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), 32).foreach$mVc$sp((Function1)new HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(this, z)); } public final class HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int z$1; public final void apply(int y) { apply$mcVI$sp(y); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1$$anonfun$apply$mcVI$sp$2(HologramRenderer$$anonfun$liftedTree1$1$1$$anonfun$apply$mcVI$sp$1 $outer, int z$1) {}
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public void apply$mcVI$sp(int y) {
/* 198 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 1, this.z$1 + 1, 0, 0, 0, 0, 1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 199 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 1, this.z$1 + 1, 1, 0, 0, 0, 1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 200 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 0, this.z$1 + 1, 1, 1, 0, 0, 1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 201 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 0, this.z$1 + 1, 0, 1, 0, 0, 1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/*     */           
/* 203 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 0, this.z$1 + 0, 0, 0, 0, 0, -1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 204 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 0, this.z$1 + 0, 1, 0, 0, 0, -1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 205 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 1, this.z$1 + 0, 1, 1, 0, 0, -1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 206 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 1, this.z$1 + 0, 0, 1, 0, 0, -1, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/*     */ 
/*     */           
/* 209 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 1, this.z$1 + 1, 1, 0, 1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 210 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 0, this.z$1 + 1, 1, 1, 1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 211 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 0, this.z$1 + 0, 0, 1, 1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 212 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 1, this.z$1 + 0, 0, 0, 1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/*     */           
/* 214 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 0, this.z$1 + 1, 1, 0, -1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 215 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 1, this.z$1 + 1, 1, 1, -1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 216 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 1, this.z$1 + 0, 0, 1, -1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 217 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 0, this.z$1 + 0, 0, 0, -1, 0, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/*     */ 
/*     */           
/* 220 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 1, this.z$1 + 0, 0, 0, 0, 1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 221 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 1, this.z$1 + 0, 1, 0, 0, 1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 222 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 1, this.z$1 + 1, 1, 1, 0, 1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 223 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 1, this.z$1 + 1, 0, 1, 0, 1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/*     */           
/* 225 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 0, this.z$1 + 1, 0, 0, 0, -1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 226 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 0, this.z$1 + 1, 1, 0, 0, -1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 227 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 0, y + 0, this.z$1 + 0, 1, 1, 0, -1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/* 228 */           HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addVertex$1(this.$outer.x$1 + 1, y + 0, this.z$1 + 0, 0, 1, 0, -1, 0, (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).data$1);
/*     */         } }
/*     */        }
/*     */   
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
/*     */   public final class HologramRenderer$$anonfun$validate$1
/*     */     extends AbstractFunction1.mcVI.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
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
/*     */     public final IntRef index$1;
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
/*     */     public final void apply(int hx) {
/* 274 */       apply$mcVI$sp(hx);
/* 275 */     } public HologramRenderer$$anonfun$validate$1(IntRef index$1) {} public void apply$mcVI$sp(int hx) { RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), 48).foreach$mVc$sp((Function1)new HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3(this, hx)); } public final class HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int hx$1; public final void apply(int hz) { apply$mcVI$sp(hz); } public HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3(HologramRenderer$$anonfun$validate$1 $outer, int hx$1) {}
/* 276 */       public void apply$mcVI$sp(int hz) { RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), 32).foreach$mVc$sp((Function1)new HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3$$anonfun$apply$mcVI$sp$4(this, hz)); } public final class HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3$$anonfun$apply$mcVI$sp$4 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int hz$1; public final void apply(int hy) { apply$mcVI$sp(hy); }
/*     */          public HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3$$anonfun$apply$mcVI$sp$4(HologramRenderer$$anonfun$validate$1$$anonfun$apply$mcVI$sp$3 $outer, int hz$1) {} public void apply$mcVI$sp(int hy) {
/* 278 */           if (HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1, hy, this.hz$1)) {
/*     */             
/* 280 */             int color = HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$hologram().colors()[HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$value$1(this.$outer.hx$1, hy, this.hz$1) - 1];
/*     */ 
/*     */             
/* 283 */             if (!HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1, hy, this.hz$1 + 1)) {
/* 284 */               HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1((this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem, color);
/*     */             }
/* 286 */             (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 4;
/*     */             
/* 288 */             if (!HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1, hy, this.hz$1 - 1)) {
/* 289 */               HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1((this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem, color);
/*     */             }
/* 291 */             (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 4;
/*     */ 
/*     */             
/* 294 */             if (!HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1 + 1, hy, this.hz$1)) {
/* 295 */               HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1((this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem, color);
/*     */             }
/* 297 */             (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 4;
/*     */             
/* 299 */             if (!HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1 - 1, hy, this.hz$1)) {
/* 300 */               HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1((this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem, color);
/*     */             }
/* 302 */             (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 4;
/*     */ 
/*     */             
/* 305 */             if (!HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1, hy + 1, this.hz$1)) {
/* 306 */               HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1((this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem, color);
/*     */             }
/* 308 */             (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 4;
/*     */             
/* 310 */             if (!HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$isSolid$1(this.$outer.hx$1, hy - 1, this.hz$1)) {
/* 311 */               HologramRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$HologramRenderer$$addFace$1((this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem, color);
/*     */             }
/* 313 */             (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 4;
/*     */           }
/*     */           else {
/*     */             
/* 317 */             (this.$outer.li$cil$oc$client$renderer$tileentity$HologramRenderer$$anonfun$$anonfun$$$outer()).index$1.elem += 24;
/*     */           } 
/*     */         } }
/*     */        }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\HologramRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */