/*    */ package li.cil.oc.common.tileentity.traits.power;
/*    */ @Interface(value = "mekanism.api.energy.IStrictEnergyAcceptor", modid = "Mekanism")
/*    */ @ScalaSignature(bytes = "\006\001E4q!\001\002\021\002\007\005\021C\001\005NK.\fg.[:n\025\t\031A!A\003q_^,'O\003\002\006\r\0051AO]1jiNT!a\002\005\002\025QLG.Z3oi&$\030P\003\002\n\025\00511m\\7n_:T!a\003\007\002\005=\034'BA\007\017\003\r\031\027\016\034\006\002\037\005\021A.[\002\001'\r\001!c\007\t\003'ei\021\001\006\006\003\017UQ!AF\f\002\0235Lg.Z2sC\032$(\"\001\r\002\0079,G/\003\002\033)\tQA+\0337f\013:$\030\016^=\021\005qiR\"\001\002\n\005y\021!AB\"p[6|g\016C\003!\001\021\005\021%\001\004%S:LG\017\n\013\002EA\0211EJ\007\002I)\tQ%A\003tG\006d\027-\003\002(I\t!QK\\5u\021\025I\003\001\"\001+\003A\031\027M\034*fG\026Lg/Z#oKJ<\027\020\006\002,]A\0211\005L\005\003[\021\022qAQ8pY\026\fg\016C\0030Q\001\007\001'\001\003tS\022,\007CA\0318\033\005\021$BA\0325\003\021)H/\0337\013\005%)$B\001\034\030\0039i\027N\\3de\0064GOZ8sO\026L!\001\017\032\003\035\031{'oZ3ESJ,7\r^5p]\"\"\001FO%K!\tYdI\004\002=\t6\tQH\003\002\n})\021q\bQ\001\004M6d'BA!C\003\021iw\016Z:\013\003\r\0131a\0319x\023\t)U(\001\005PaRLwN\\1m\023\t9\005J\001\004NKRDw\016\032\006\003\013v\nQ!\\8eS\022\f\023aS\001\t\033\026\\\027M\\5t[\")Q\n\001C\001\035\006ABO]1og\032,'/\0228fe\036LHk\\!dG\026\004Ho\034:\025\007=\0236\013\005\002$!&\021\021\013\n\002\007\t>,(\r\\3\t\013=b\005\031\001\031\t\013Qc\005\031A(\002\r\005lw.\0368uQ\021a%(\023&\t\013]\003A\021\001-\002\031\035,G/T1y\013:,'oZ=\026\003=CCA\026\036J\025\")1\f\001C\0011\006Iq-\032;F]\026\024x-\037\025\0055jJ%\nC\003_\001\021\005q,A\005tKR,e.\032:hsR\021!\005\031\005\006Cv\003\raT\001\007K:,'oZ=)\tuS\024J\023\025\007\001\021tw.\023&\021\005\025\\gB\0014j\033\0059'B\0015\t\003\r\t7/\\\005\003U\036\f!\"\0238kK\016$\030M\0317f\023\taWNA\005J]R,'OZ1dK*\021!nZ\001\006m\006dW/Z\021\002a\006IS.Z6b]&\034XNL1qS:*g.\032:hs:J5\013\036:jGR,e.\032:hs\006\0337-\0329u_J\004")
/*    */ public interface Mekanism extends Common { @Method(modid = "Mekanism")
/*    */   boolean canReceiveEnergy(ForgeDirection paramForgeDirection);
/*    */   
/*    */   @Method(modid = "Mekanism")
/*    */   double transferEnergyToAcceptor(ForgeDirection paramForgeDirection, double paramDouble);
/*    */   
/*    */   @Method(modid = "Mekanism")
/*    */   double getMaxEnergy();
/*    */   
/*    */   @Method(modid = "Mekanism")
/*    */   double getEnergy();
/*    */   
/*    */   @Method(modid = "Mekanism")
/*    */   void setEnergy(double paramDouble);
/*    */   
/*    */   public final class Mekanism$$anonfun$getMaxEnergy$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable { public final double apply(ForgeDirection side) {
/* 20 */       return this.$outer.globalBufferSize(side);
/*    */     } public static final long serialVersionUID = 0L; public Mekanism$$anonfun$getMaxEnergy$1(Mekanism $outer) {} } public final class Mekanism$$anonfun$getEnergy$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final double apply(ForgeDirection side) {
/* 23 */       return this.$outer.globalBuffer(side);
/*    */     }
/*    */     
/*    */     public Mekanism$$anonfun$getEnergy$1(Mekanism $outer) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\Mekanism.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */