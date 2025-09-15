/*    */ package li.cil.oc.common.tileentity.traits.power;
/*    */ 
/*    */ import appeng.api.networking.energy.IEnergyGrid;
/*    */ import cpw.mods.fml.common.Optional.Method;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @Interface(value = "appeng.api.networking.IGridHost", modid = "appliedenergistics2")
/*    */ @ScalaSignature(bytes = "\006\001\005udaB\001\003!\003\r\t!\005\002\024\003B\004H.[3e\013:,'oZ5ti&\0347O\r\006\003\007\021\tQ\001]8xKJT!!\002\004\002\rQ\024\030-\033;t\025\t9\001\"\001\006uS2,WM\034;jifT!!\003\006\002\r\r|W.\\8o\025\tYA\"\001\002pG*\021QBD\001\004G&d'\"A\b\002\0051L7\001A\n\004\001IY\002CA\n\032\033\005!\"BA\004\026\025\t1r#A\005nS:,7M]1gi*\t\001$A\002oKRL!A\007\013\003\025QKG.Z#oi&$\030\020\005\002\035;5\t!!\003\002\037\005\t11i\\7n_:DQ\001\t\001\005\002\005\na\001J5oSR$C#\001\022\021\005\r2S\"\001\023\013\003\025\nQa]2bY\006L!a\n\023\003\tUs\027\016\036\005\006S\001!IAK\001\034kN,\027\t\0359mS\026$WI\\3sO&\034H/[2teA{w/\032:\025\003-\002\"a\t\027\n\0055\"#a\002\"p_2,\027M\034\005\b_\001\001\r\021\"\0031\003\021qw\016Z3\026\003E\0022a\t\0325\023\t\031DE\001\004PaRLwN\034\t\003GUJ!A\016\023\003\r\005s\027PU3g\021\035A\004\0011A\005\ne\n\001B\\8eK~#S-\035\013\003EiBqaO\034\002\002\003\007\021'A\002yIEBa!\020\001!B\023\t\024!\0028pI\026\004\003\"B \001\t\003\n\023\001D;qI\006$X-\0228uSRL\b\"B!\001\t\023\t\023\001D;qI\006$X-\0228fe\036L\b\006\002!D%N\003\"\001R(\017\005\025kU\"\001$\013\005%9%B\001%J\003\r1W\016\034\006\003\025.\013A!\\8eg*\tA*A\002da^L!A\024$\002\021=\003H/[8oC2L!\001U)\003\r5+G\017[8e\025\tqe)A\003n_\022LG-I\001U\003M\t\007\017\0357jK\022,g.\032:hSN$\030nY:3\021\0251\006\001\"\021\"\003!1\030\r\\5eCR,\007\"\002-\001\t\003\n\023AC5om\006d\027\016Z1uK\")!\f\001C!C\005iqN\\\"ik:\\WK\0347pC\022DQ\001\030\001\005Bu\013AC]3bI\032\023x.\034(C)\032{'oU3sm\026\024HC\001\022_\021\025y6\f1\001a\003\rq'\r\036\t\003C\016l\021A\031\006\003?VI!\001\0322\003\0359\023E\013V1h\007>l\007o\\;oI\")a\r\001C\005O\006AAn\\1e\035>$W\r\006\002#Q\")q,\032a\001A\"\"Qm\021*T\021\025Y\007\001\"\021m\003M9(/\033;f)>t%\t\026$peN+'O^3s)\t\021S\016C\003`U\002\007\001\rC\003p\001\021%\001/\001\005tCZ,gj\0343f)\t\021\023\017C\003`]\002\007\001\r\013\003o\007J\033\006\"\002;\001\t\003)\030aC4fi\036\023\030\016\032(pI\026$2A^A\001!\t9h0D\001y\025\tI(0\001\006oKR<xN]6j]\036T!a\037?\002\007\005\004\030NC\001~\003\031\t\007\017]3oO&\021q\020\037\002\n\023\036\023\030\016\032(pI\026Dq!a\001t\001\004\t)!\001\003tS\022,\007\003BA\004\003'i!!!\003\013\t\005-\021QB\001\005kRLGNC\002\n\003\037Q1!!\005\030\0039i\027N\\3de\0064GOZ8sO\026LA!!\006\002\n\tqai\034:hK\022K'/Z2uS>t\007\006B:D%NCq!a\007\001\t\003\ti\"\001\fhKR\034\025M\0317f\007>tg.Z2uS>tG+\0379f)\021\ty\"!\013\021\t\005\005\022QE\007\003\003GQ1!a\003{\023\021\t9#a\t\003\027\005+5)\0312mKRK\b/\032\005\t\003\007\tI\0021\001\002\006!*\021\021D\"S'\"1\021q\006\001\005\002\005\nQb]3dkJLG/\037\"sK\006\\\007&BA\027\007J\033\006\"DA\033\001A\005\031\021!A\005\n\005\n9$\001\ntkB,'\017J;qI\006$X-\0228uSRL\030bA \002:%\021!\004\002\005\016\003{\001\001\023aA\001\002\023%\021%a\020\002\035M,\b/\032:%m\006d\027\016Z1uK&\031a+!\017\t\033\005\r\003\001%A\002\002\003%I!IA#\003A\031X\017]3sI%tg/\0317jI\006$X-C\002Y\003sAQ\"!\023\001!\003\r\t\021!C\005C\005-\023aE:va\026\024He\0348DQVt7.\0268m_\006$\027b\001.\002:!q\021q\n\001\021\002\007\005\t\021\"\003\002R\005U\023AG:va\026\024HE]3bI\032\023x.\034(C)\032{'oU3sm\026\024Hc\001\022\002T!1q,!\024A\002\001L1\001XA\035\0219\tI\006\001I\001\004\003\005I\021BA.\003?\n\021d];qKJ$sO]5uKR{gJ\021+G_J\034VM\035<feR\031!%!\030\t\r}\0139\0061\001a\023\rY\027\021\b\025\n\001\005\r\024qOA=%N\003B!!\032\002r9!\021qMA7\033\t\tIGC\002\002l!\t1!Y:n\023\021\ty'!\033\002\025%s'.Z2uC\ndW-\003\003\002t\005U$!C%oi\026\024h-Y2f\025\021\ty'!\033\002\013Y\fG.^3\"\005\005m\024aH1qa\026twML1qS:rW\r^<pe.Lgn\032\030J\017JLG\rS8ti\002")
/*    */ public interface AppliedEnergistics2 extends Common {
/*    */   Option<Object> li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node();
/*    */   
/*    */   @TraitSetter
/*    */   void li$cil$oc$common$tileentity$traits$power$AppliedEnergistics2$$node_$eq(Option<Object> paramOption);
/*    */   
/*    */   void updateEntity();
/*    */   
/*    */   void validate();
/*    */   
/*    */   void invalidate();
/*    */   
/*    */   void onChunkUnload();
/*    */   
/*    */   void readFromNBTForServer(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   void writeToNBTForServer(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   @Method(modid = "appliedenergistics2")
/*    */   IGridNode getGridNode(ForgeDirection paramForgeDirection);
/*    */   
/*    */   @Method(modid = "appliedenergistics2")
/*    */   AECableType getCableConnectionType(ForgeDirection paramForgeDirection);
/*    */   
/*    */   @Method(modid = "appliedenergistics2")
/*    */   void securityBreak();
/*    */   
/*    */   public final class AppliedEnergistics2$$anonfun$updateEnergy$3 extends AbstractFunction2<Object, ForgeDirection, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/* 41 */     public final double apply(double demand, ForgeDirection side) { IGrid grid = this.$outer.getGridNode(side).getGrid();
/*    */       
/* 43 */       IEnergyGrid cache = (IEnergyGrid)grid.getCache(IEnergyGrid.class);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 49 */       return (grid == null) ? 0.0D : ((cache == null) ? 0.0D : cache.extractAEPower(demand, Actionable.MODULATE, PowerMultiplier.CONFIG)); } public AppliedEnergistics2$$anonfun$updateEnergy$3(AppliedEnergistics2 $outer) {} } public final class AppliedEnergistics2$$anonfun$updateEnergy$1 extends AbstractFunction1.mcDD.sp implements Serializable { public static final long serialVersionUID = 0L; public final double apply(double value) {
/* 50 */       return apply$mcDD$sp(value); } public double apply$mcDD$sp(double value) { return Power$.MODULE$.fromAE(value); } public AppliedEnergistics2$$anonfun$updateEnergy$1(AppliedEnergistics2 $outer) {} } public final class AppliedEnergistics2$$anonfun$updateEnergy$2 extends AbstractFunction1.mcDD.sp implements Serializable { public static final long serialVersionUID = 0L; public final double apply(double value) { return apply$mcDD$sp(value); } public double apply$mcDD$sp(double value) { return Power$.MODULE$.toAE(value); }
/*    */ 
/*    */     
/*    */     public AppliedEnergistics2$$anonfun$updateEnergy$2(AppliedEnergistics2 $outer) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\AppliedEnergistics2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */