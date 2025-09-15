/*     */ package li.cil.oc.common.component.traits;
/*     */ 
/*     */ import li.cil.oc.api.internal.TextBuffer;
/*     */ import li.cil.oc.util.PackedColor;
/*     */ import li.cil.oc.util.PackedColor$;
/*     */ import li.cil.oc.util.PackedColor$Color$;
/*     */ import li.cil.oc.util.TextBuffer;
/*     */ import scala.Array$;
/*     */ import scala.Function1;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
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
/*     */ @ScalaSignature(bytes = "\006\001\t\rbaB\001\003!\003\r\ta\004\002\020)\026DHOQ;gM\026\024\bK]8ys*\0211\001B\001\007iJ\f\027\016^:\013\005\0251\021!C2p[B|g.\0328u\025\t9\001\"\001\004d_6lwN\034\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011c\001\001\0211A\021\021CF\007\002%)\0211\003F\001\005Y\006twMC\001\026\003\021Q\027M^1\n\005]\021\"AB(cU\026\034G\017\005\002\032=5\t!D\003\002\0349\005A\021N\034;fe:\fGN\003\002\036\021\005\031\021\r]5\n\005}Q\"A\003+fqR\024UO\0324fe\")\021\005\001C\001E\0051A%\0338ji\022\"\022a\t\t\003I\035j\021!\n\006\002M\005)1oY1mC&\021\001&\n\002\005+:LG\017C\003+\001\031\0051&\001\003eCR\fW#\001\027\021\0055\002T\"\001\030\013\005=B\021\001B;uS2L!a\b\030\t\013I\002A\021I\032\002\021\035,GoV5ei\"$\022\001\016\t\003IUJ!AN\023\003\007%sG\017C\0039\001\021\0053'A\005hKRDU-[4ii\")!\b\001C!w\005i1/\032;D_2|'\017R3qi\"$\"\001P \021\005\021j\024B\001 &\005\035\021un\0347fC:DQ\001Q\035A\002\005\013Q\001Z3qi\"\004\"A\021&\017\005\rCeB\001#H\035\t)e)D\001\t\023\ti\002\"\003\002\0349%\021\021JG\001\013)\026DHOQ;gM\026\024\030BA&M\005)\031u\016\\8s\t\026\004H\017\033\006\003\023jAQA\024\001\005B=\013QbZ3u\007>dwN\035#faRDG#\001)\021\005ESeBA\rI\021\025\031\006\001\"\001U\003UygNQ;gM\026\024\b+\0317fiR,7\t[1oO\026$\"aI+\t\013Y\023\006\031\001\033\002\013%tG-\032=\t\013a\003A\021I-\002\037M,G\017U1mKR$XmQ8m_J$2a\t.\\\021\0251v\0131\0015\021\025av\0131\0015\003\025\031w\016\\8s\021\025q\006\001\"\021`\003=9W\r\036)bY\026$H/Z\"pY>\024HC\001\033a\021\0251V\f1\0015\021\025\021\007\001\"\001#\003MygNQ;gM\026\0248i\0347pe\016C\027M\\4f\021\025!\007\001\"\021f\003I\031X\r\036$pe\026<'o\\;oI\016{Gn\034:\025\005\r2\007\"\002/d\001\004!\004\"\0023\001\t\003BGcA\022jU\")Al\032a\001i!)1n\032a\001y\005i\021n\035$s_6\004\026\r\\3ui\026DQ!\034\001\005BM\n!cZ3u\r>\024Xm\032:pk:$7i\0347pe\")q\016\001C!a\0069\022n\035$pe\026<'o\\;oI\032\023x.\034)bY\026$H/\032\013\002y!)!\017\001C!g\006\0212/\032;CC\016\\wM]8v]\022\034u\016\\8s)\t\031C\017C\003]c\002\007A\007C\003s\001\021\005c\017F\002$obDQ\001X;A\002QBQa[;A\002qBQA\037\001\005BM\n!cZ3u\005\006\0347n\032:pk:$7i\0347pe\")A\020\001C!a\0069\022n\035\"bG.<'o\\;oI\032\023x.\034)bY\026$H/\032\005\006}\002!\ta`\001\r_:\024UO\0324fe\016{\007/\037\013\016G\005\005\021QAA\005\003\033\t\t\"!\006\t\r\005\rQ\0201\0015\003\r\031w\016\034\005\007\003\017i\b\031\001\033\002\007I|w\017\003\004\002\fu\004\r\001N\001\002o\"1\021qB?A\002Q\n\021\001\033\005\007\003'i\b\031\001\033\002\005QD\bBBA\f{\002\007A'\001\002us\"9\0211\004\001\005\002\005u\021\001B2paf$RbIA\020\003C\t\031#!\n\002(\005%\002bBA\002\0033\001\r\001\016\005\b\003\017\tI\0021\0015\021\035\tY!!\007A\002QBq!a\004\002\032\001\007A\007C\004\002\024\005e\001\031\001\033\t\017\005]\021\021\004a\001i!9\021Q\006\001\005\002\005=\022\001D8o\005V4g-\032:GS2dGcC\022\0022\005M\022QGA\034\003sAq!a\001\002,\001\007A\007C\004\002\b\005-\002\031\001\033\t\017\005-\0211\006a\001i!9\021qBA\026\001\004!\004bBA\036\003W\001\r\001N\001\002G\"9\021q\b\001\005\002\005\005\023\001\0024jY2$2bIA\"\003\013\n9%!\023\002L!9\0211AA\037\001\004!\004bBA\004\003{\001\r\001\016\005\b\003\027\ti\0041\0015\021\035\ty!!\020A\002QB\001\"a\017\002>\001\007\021Q\n\t\004I\005=\023bAA)K\t!1\t[1s\021\035\ty\004\001C\001\003+\"2bIA,\0033\nY&!\030\002`!9\0211AA*\001\004!\004bBA\004\003'\002\r\001\016\005\b\003\027\t\031\0061\0015\021\035\ty!a\025A\002QBq!a\017\002T\001\007A\007C\004\002d\001!\t!!\032\002\027=t')\0364gKJ\034V\r\036\013\nG\005\035\024\021NA6\003{Bq!a\001\002b\001\007A\007C\004\002\b\005\005\004\031\001\033\t\021\0055\024\021\ra\001\003_\n\021a\035\t\005\003c\n9HD\002%\003gJ1!!\036&\003\031\001&/\0323fM&!\021\021PA>\005\031\031FO]5oO*\031\021QO\023\t\017\005}\024\021\ra\001y\005Aa/\032:uS\016\fG\016C\004\002\004\002!I!!\"\002\021Q\024XO\\2bi\026$\"\"a\034\002\b\006%\025QRAI\021!\ti'!!A\002\005=\004bBAF\003\003\003\r\001N\001\bg2+gn\032;i\021\035\ty)!!A\002Q\n!\002\\3gi>3gm]3u\021\035\t\031*!!A\002Q\n\001\"\\1y/&$G\017\033\005\b\003/\003A\021AAM\003\r\031X\r\036\013\nG\005m\025QTAP\003CCq!a\001\002\026\002\007A\007C\004\002\b\005U\005\031\001\033\t\021\0055\024Q\023a\001\003_Bq!a \002\026\002\007A\bC\004\002&\002!\t!a*\002\007\035,G\017\006\004\002N\005%\0261\026\005\b\003\007\t\031\0131\0015\021\035\t9!a)A\002QBq!a,\001\t\003\t\t,\001\007hKR\034u\016Z3Q_&tG\017F\0035\003g\013)\fC\004\002\004\0055\006\031\001\033\t\017\005\035\021Q\026a\001i!1Q\016\001C!\003s#R\001NA^\003Cq!!0\0028\002\007A'\001\004d_2,XN\034\005\b\003\017\t9\f1\0015\021\031y\007\001\"\021\002DR)A(!2\002H\"9\021QXAa\001\004!\004bBA\004\003\003\004\r\001\016\005\007u\002!\t%a3\025\013Q\ni-a4\t\017\005u\026\021\032a\001i!9\021qAAe\001\004!\004B\002?\001\t\003\n\031\016F\003=\003+\f9\016C\004\002>\006E\007\031\001\033\t\017\005\035\021\021\033a\001i!9\0211\034\001\005B\005u\027A\003:boN+G\017V3yiR91%a8\002b\006\r\bbBA\002\0033\004\r\001\016\005\b\003\017\tI\0161\0015\021!\t)/!7A\002\005\035\030\001\002;fqR\004R\001JAu\003[L1!a;&\005\025\t%O]1z!\025!\023\021^A'\021\035\tY\016\001C!\003c$raIAz\003k\f9\020C\004\002\004\005=\b\031\001\033\t\017\005\035\021q\036a\001i!A\021Q]Ax\001\004\tI\020E\003%\003S\fY\020\005\003%\003S$\004bBA\000\001\021\005#\021A\001\021e\006<8+\032;G_J,wM]8v]\022$ra\tB\002\005\013\0219\001C\004\002\004\005u\b\031\001\033\t\017\005\035\021Q a\001i!9A,!@A\002\005e\bb\002B\006\001\021\005#QB\001\021e\006<8+\032;CC\016\\wM]8v]\022$ra\tB\b\005#\021\031\002C\004\002\004\t%\001\031\001\033\t\017\005\035!\021\002a\001i!9AL!\003A\002\005e\bB\002/\001\t\023\0219\002\006\004\003\032\t}!\021\005\t\004I\tm\021b\001B\017K\t)1\013[8si\"9\021Q\030B\013\001\004!\004bBA\004\005+\001\r\001\016")
/*     */ public interface TextBufferProxy
/*     */   extends TextBuffer
/*     */ {
/*     */   TextBuffer data();
/*     */   
/*     */   int getWidth();
/*     */   
/*     */   int getHeight();
/*     */   
/*     */   boolean setColorDepth(TextBuffer.ColorDepth paramColorDepth);
/*     */   
/*     */   TextBuffer.ColorDepth getColorDepth();
/*     */   
/*     */   void onBufferPaletteChange(int paramInt);
/*     */   
/*     */   void setPaletteColor(int paramInt1, int paramInt2);
/*     */   
/*     */   int getPaletteColor(int paramInt);
/*     */   
/*     */   void onBufferColorChange();
/*     */   
/*     */   void setForegroundColor(int paramInt);
/*     */   
/*     */   void setForegroundColor(int paramInt, boolean paramBoolean);
/*     */   
/*     */   int getForegroundColor();
/*     */   
/*     */   boolean isForegroundFromPalette();
/*     */   
/*     */   void setBackgroundColor(int paramInt);
/*     */   
/*     */   void setBackgroundColor(int paramInt, boolean paramBoolean);
/*     */   
/*     */   int getBackgroundColor();
/*     */   
/*     */   boolean isBackgroundFromPalette();
/*     */   
/*     */   void onBufferCopy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*     */   
/*     */   void copy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*     */   
/*     */   void onBufferFill(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*     */   
/*     */   void fill(int paramInt1, int paramInt2, int paramInt3, int paramInt4, char paramChar);
/*     */   
/*     */   void fill(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*     */   
/*     */   void onBufferSet(int paramInt1, int paramInt2, String paramString, boolean paramBoolean);
/*     */   
/*     */   void set(int paramInt1, int paramInt2, String paramString, boolean paramBoolean);
/*     */   
/*     */   char get(int paramInt1, int paramInt2);
/*     */   
/*     */   int getCodePoint(int paramInt1, int paramInt2);
/*     */   
/*     */   int getForegroundColor(int paramInt1, int paramInt2);
/*     */   
/*     */   boolean isForegroundFromPalette(int paramInt1, int paramInt2);
/*     */   
/*     */   int getBackgroundColor(int paramInt1, int paramInt2);
/*     */   
/*     */   boolean isBackgroundFromPalette(int paramInt1, int paramInt2);
/*     */   
/*     */   void rawSetText(int paramInt1, int paramInt2, char[][] paramArrayOfchar);
/*     */   
/*     */   void rawSetText(int paramInt1, int paramInt2, int[][] paramArrayOfint);
/*     */   
/*     */   void rawSetForeground(int paramInt1, int paramInt2, int[][] paramArrayOfint);
/*     */   
/*     */   void rawSetBackground(int paramInt1, int paramInt2, int[][] paramArrayOfint);
/*     */   
/*     */   public final class TextBufferProxy$$anonfun$rawSetText$1
/*     */     extends AbstractFunction1.mcVI.sp
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final int col$1;
/*     */     private final int row$1;
/*     */     private final char[][] text$1;
/*     */     
/*     */     public final void apply(int y) {
/* 138 */       apply$mcVI$sp(y); } public TextBufferProxy$$anonfun$rawSetText$1(TextBufferProxy $outer, int col$1, int row$1, char[][] text$1) {} public void apply$mcVI$sp(int y) {
/* 139 */       char[] line = this.text$1[y - this.row$1];
/* 140 */       Array$.MODULE$.copy(line, 0, this.$outer.data().buffer()[y], this.col$1, RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(line.length), this.$outer.data().width()));
/*     */     } }
/*     */   public final class TextBufferProxy$$anonfun$rawSetText$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int col$2; private final int row$2;
/*     */     private final int[][] text$2;
/*     */     
/* 145 */     public final void apply(int y) { apply$mcVI$sp(y); } public TextBufferProxy$$anonfun$rawSetText$2(TextBufferProxy $outer, int col$2, int row$2, int[][] text$2) {} public void apply$mcVI$sp(int y) {
/* 146 */       int[] line = this.text$2[y - this.row$2];
/* 147 */       Array$.MODULE$.copy(line, 0, this.$outer.data().buffer()[y], this.col$2, RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(line.length), this.$outer.data().width()));
/*     */     } }
/*     */   public final class TextBufferProxy$$anonfun$rawSetForeground$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int col$3; private final int row$3;
/*     */     private final int[][] color$1;
/*     */     
/* 152 */     public final void apply(int y) { apply$mcVI$sp(y); } public TextBufferProxy$$anonfun$rawSetForeground$1(TextBufferProxy $outer, int col$3, int row$3, int[][] color$1) {}
/* 153 */     public void apply$mcVI$sp(int y) { int[] line = this.color$1[y - this.row$3]; RichInt$.MODULE$
/* 154 */         .until$extension0(Predef$.MODULE$.intWrapper(this.col$3), RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(this.col$3 + line.length), this.$outer.data().width())).foreach$mVc$sp((Function1)new TextBufferProxy$$anonfun$rawSetForeground$1$$anonfun$apply$mcVI$sp$1(this, line, y)); } public final class TextBufferProxy$$anonfun$rawSetForeground$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int x) { apply$mcVI$sp(x); } private final int[] line$1; private final int y$1; public TextBufferProxy$$anonfun$rawSetForeground$1$$anonfun$apply$mcVI$sp$1(TextBufferProxy$$anonfun$rawSetForeground$1 $outer, int[] line$1, int y$1) {} public void apply$mcVI$sp(int x) {
/* 155 */         int packedBackground = this.$outer.li$cil$oc$common$component$traits$TextBufferProxy$$anonfun$$$outer().data().color()[this.y$1][x] & 0xFF;
/* 156 */         int packedForeground = this.$outer.li$cil$oc$common$component$traits$TextBufferProxy$$anonfun$$$outer().data().format().deflate(new PackedColor.Color(this.line$1[x - this.$outer.col$3], PackedColor$Color$.MODULE$.apply$default$2())) << PackedColor$.MODULE$.ForegroundShift() & 0xFF00;
/* 157 */         this.$outer.li$cil$oc$common$component$traits$TextBufferProxy$$anonfun$$$outer().data().color()[this.y$1][x] = (short)(packedForeground | packedBackground);
/*     */       } } }
/*     */   public final class TextBufferProxy$$anonfun$rawSetBackground$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final int col$4;
/*     */     private final int row$4;
/*     */     private final int[][] color$2;
/*     */     
/* 163 */     public final void apply(int y) { apply$mcVI$sp(y); } public TextBufferProxy$$anonfun$rawSetBackground$1(TextBufferProxy $outer, int col$4, int row$4, int[][] color$2) {}
/* 164 */     public void apply$mcVI$sp(int y) { int[] line = this.color$2[y - this.row$4]; RichInt$.MODULE$
/* 165 */         .until$extension0(Predef$.MODULE$.intWrapper(this.col$4), RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(this.col$4 + line.length), this.$outer.data().width())).foreach$mVc$sp((Function1)new TextBufferProxy$$anonfun$rawSetBackground$1$$anonfun$apply$mcVI$sp$2(this, line, y)); } public final class TextBufferProxy$$anonfun$rawSetBackground$1$$anonfun$apply$mcVI$sp$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final int[] line$2; private final int y$2; public final void apply(int x) { apply$mcVI$sp(x); } public TextBufferProxy$$anonfun$rawSetBackground$1$$anonfun$apply$mcVI$sp$2(TextBufferProxy$$anonfun$rawSetBackground$1 $outer, int[] line$2, int y$2) {} public void apply$mcVI$sp(int x) {
/* 166 */         int packedBackground = this.$outer.li$cil$oc$common$component$traits$TextBufferProxy$$anonfun$$$outer().data().format().deflate(new PackedColor.Color(this.line$2[x - this.$outer.col$4], PackedColor$Color$.MODULE$.apply$default$2())) & 0xFF;
/* 167 */         int packedForeground = this.$outer.li$cil$oc$common$component$traits$TextBufferProxy$$anonfun$$$outer().data().color()[this.y$2][x] & 0xFF00;
/* 168 */         this.$outer.li$cil$oc$common$component$traits$TextBufferProxy$$anonfun$$$outer().data().color()[this.y$2][x] = (short)(packedForeground | packedBackground);
/*     */       } }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\traits\TextBufferProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */