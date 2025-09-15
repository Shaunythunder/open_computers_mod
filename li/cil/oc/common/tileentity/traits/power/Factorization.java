/*    */ package li.cil.oc.common.tileentity.traits.power;
/*    */ 
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import li.cil.oc.integration.util.Power$;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @Interface(value = "factorization.api.IChargeConductor", modid = "factorization")
/*    */ @ScalaSignature(bytes = "\006\001\005\005daB\001\003!\003\r\t!\005\002\016\r\006\034Go\034:ju\006$\030n\0348\013\005\r!\021!\0029po\026\024(BA\003\007\003\031!(/Y5ug*\021q\001C\001\013i&dW-\0328uSRL(BA\005\013\003\031\031w.\\7p]*\0211\002D\001\003_\016T!!\004\b\002\007\rLGNC\001\020\003\ta\027n\001\001\024\007\001\0212\004\005\002\02435\tAC\003\002\b+)\021acF\001\n[&tWm\031:bMRT\021\001G\001\004]\026$\030B\001\016\025\005)!\026\016\\3F]RLG/\037\t\0039ui\021AA\005\003=\t\021aaQ8n[>t\007\"\002\021\001\t\003\t\023A\002\023j]&$H\005F\001#!\t\031c%D\001%\025\005)\023!B:dC2\f\027BA\024%\005\021)f.\033;\t\013%\002A\021\002\026\002+U\034XMR1di>\024\030N_1uS>t\007k\\<feR\t1\006\005\002$Y%\021Q\006\n\002\b\005>|G.Z1o\021!y\003\001#b\001\n\023\001\024AB2iCJ<W-F\0012!\t\031#'\003\0024I\t1\021I\\=SK\032D\001\"\016\001\t\002\003\006K!M\001\bG\"\f'oZ3!Q\021!tGR$\021\005a\032eBA\035B\033\005Q$BA\005<\025\taT(A\002g[2T!AP \002\t5|Gm\035\006\002\001\006\0311\r]<\n\005\tS\024\001C(qi&|g.\0317\n\005\021+%AB'fi\"|GM\003\002Cu\005)Qn\0343jI\006\n\001*A\007gC\016$xN]5{CRLwN\034\005\006\025\002!\t%I\001\rkB$\027\r^3F]RLG/\037\005\006\031\002!I!I\001\rkB$\027\r^3F]\026\024x-\037\025\005\027^2u\tC\003P\001\021\005\023%\001\006j]Z\fG.\0333bi\026DQ!\025\001\005\n\005\n\001#\0338wC2LG-\031;f\007\"\f'oZ3)\tA;di\022\005\006)\002!\t%I\001\016_:\034\005.\0368l+:dw.\0313\t\013Y\003A\021B\021\002\031I,Wn\034<f\007\"\f'oZ3)\tU;di\022\005\0063\002!\tEW\001\025e\026\fGM\022:p[:\023EKR8s'\026\024h/\032:\025\005\tZ\006\"\002/Y\001\004i\026a\0018ciB\021a\fY\007\002?*\021A,F\005\003C~\023aB\024\"U)\006<7i\\7q_VtG\rC\003d\001\021%A-\001\006m_\006$7\t[1sO\026$\"AI3\t\013q\023\007\031A/)\t\t<di\022\005\006Q\002!\t%[\001\024oJLG/\032+p\035\n#fi\034:TKJ4XM\035\013\003E)DQ\001X4A\002uCQ\001\034\001\005\n5\f!b]1wK\016C\027M]4f)\t\021c\016C\003]W\002\007Q\f\013\003lo\031;\005\"B9\001\t\003\021\030!C4fi\016C\027M]4f+\005\031\bC\001;y\033\005)(B\001<x\003\r\t\007/\033\006\002\021&\021\0210\036\002\007\007\"\f'oZ3)\tA<di\022\005\006y\002!\t!`\001\bO\026$\030J\0344p+\005q\bcA@\002\n5\021\021\021\001\006\005\003\007\t)!\001\003mC:<'BAA\004\003\021Q\027M^1\n\t\005-\021\021\001\002\007'R\024\030N\\4)\tm<di\022\005\b\003#\001A\021AA\n\003!9W\r^\"p_J$WCAA\013!\r!\030qC\005\004\0033)(!B\"p_J$\007&BA\bo\031;\005\"DA\020\001A\005\031\021!A\005\n\005\n\t#\001\ntkB,'\017J;qI\006$X-\0228uSRL\030b\001&\002$%\021!\004\002\005\016\003O\001\001\023aA\001\002\023%\021%!\013\002!M,\b/\032:%S:4\030\r\\5eCR,\027bA(\002$!i\021Q\006\001\021\002\007\005\t\021\"\003\"\003_\t1c];qKJ$sN\\\"ik:\\WK\0347pC\022L1\001VA\022\0219\t\031\004\001I\001\004\003\005I\021BA\033\003s\t!d];qKJ$#/Z1e\rJ|WN\024\"U\r>\0248+\032:wKJ$2AIA\034\021\031a\026\021\007a\001;&\031\021,a\t\t\035\005u\002\001%A\002\002\003%I!a\020\002D\005I2/\0369fe\022:(/\033;f)>t%\t\026$peN+'O^3s)\r\021\023\021\t\005\0079\006m\002\031A/\n\007!\f\031\003K\005\001\003\017\nY&!\030G\017B!\021\021JA+\035\021\tY%!\025\016\005\0055#bAA(\021\005\031\021m]7\n\t\005M\023QJ\001\013\023:TWm\031;bE2,\027\002BA,\0033\022\021\"\0238uKJ4\027mY3\013\t\005M\023QJ\001\006m\006dW/Z\021\003\003?\n!EZ1di>\024\030N_1uS>tg&\0319j]%\033\005.\031:hK\016{g\016Z;di>\024\b")
/*    */ public interface Factorization extends Common {
/*    */   Object li$cil$oc$common$tileentity$traits$power$Factorization$$charge();
/*    */   
/*    */   void updateEntity();
/*    */   
/*    */   void invalidate();
/*    */   
/*    */   void onChunkUnload();
/*    */   
/*    */   void readFromNBTForServer(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   void writeToNBTForServer(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   @Method(modid = "factorization")
/*    */   Charge getCharge();
/*    */   
/*    */   @Method(modid = "factorization")
/*    */   String getInfo();
/*    */   
/*    */   @Method(modid = "factorization")
/*    */   Coord getCoord();
/*    */   
/*    */   public final class Factorization$$anonfun$updateEnergy$3 extends AbstractFunction2<Object, ForgeDirection, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/* 37 */     public final double apply(double demand, ForgeDirection x$1) { return this.$outer.getCharge().deplete((int)demand); } public Factorization$$anonfun$updateEnergy$3(Factorization $outer) {} } public final class Factorization$$anonfun$updateEnergy$1 extends AbstractFunction1.mcDD.sp implements Serializable { public final double apply(double value) { return apply$mcDD$sp(value); } public static final long serialVersionUID = 0L; public double apply$mcDD$sp(double value) { return Power$.MODULE$.fromCharge(value); } public Factorization$$anonfun$updateEnergy$1(Factorization $outer) {} } public final class Factorization$$anonfun$updateEnergy$2 extends AbstractFunction1.mcDD.sp implements Serializable { public static final long serialVersionUID = 0L; public final double apply(double value) { return apply$mcDD$sp(value); } public double apply$mcDD$sp(double value) { return Power$.MODULE$.toCharge(value); }
/*    */ 
/*    */     
/*    */     public Factorization$$anonfun$updateEnergy$2(Factorization $outer) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\Factorization.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */