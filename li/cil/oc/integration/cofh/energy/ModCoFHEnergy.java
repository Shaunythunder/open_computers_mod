/*    */ package li.cil.oc.integration.cofh.energy;
/*    */ 
/*    */ import cpw.mods.fml.common.ModContainer;
/*    */ import cpw.mods.fml.common.versioning.ArtifactVersion;
/*    */ import li.cil.oc.integration.Mods;
/*    */ import scala.Serializable;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001%;Q!\001\002\t\002=\tQ\"T8e\007>4\005*\0228fe\036L(BA\002\005\003\031)g.\032:hs*\021QAB\001\005G>4\007N\003\002\b\021\005Y\021N\034;fOJ\fG/[8o\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001\001\t\003!Ei\021A\001\004\006%\tA\ta\005\002\016\033>$7i\034$I\013:,'oZ=\024\007E!B\004\005\002\02655\taC\003\002\0301\005!A.\0318h\025\005I\022\001\0026bm\006L!a\007\f\003\r=\023'.Z2u!\tib$D\001\007\023\tybA\001\005N_\022\004&o\034=z\021\025\t\023\003\"\001#\003\031a\024N\\5u}Q\tq\002C\003%#\021\005S%\001\004hKRlu\016\032\013\002MA\021qE\013\b\003;!J!!\013\004\002\t5{Gm]\005\003W1\022\021bU5na2,Wj\0343\013\005%2\001b\002\030\022\005\004%IaL\001\034m\026\0248/[8ogV\033\030N\\4Ta2LG/\0228fe\036L\030\tU%\026\003A\002\"!\r\037\016\003IR!a\r\033\002\025Y,'o]5p]&twM\003\0026m\00511m\\7n_:T!a\016\035\002\007\031lGN\003\002:u\005!Qn\0343t\025\005Y\024aA2qo&\021QH\r\002\r-\026\0248/[8o%\006tw-\032\005\007E\001\013\021\002\031\0029Y,'o]5p]N,6/\0338h'Bd\027\016^#oKJ<\0270\021)JA!)\021)\005C!\005\006Q\021N\\5uS\006d\027N_3\025\003\r\003\"\001R$\016\003\025S\021AR\001\006g\016\fG.Y\005\003\021\026\023A!\0268ji\002")
/*    */ public final class ModCoFHEnergy {
/*    */   public static void initialize() {
/*    */     ModCoFHEnergy$.MODULE$.initialize();
/*    */   }
/*    */   
/*    */   public static Mods.SimpleMod getMod() {
/*    */     return ModCoFHEnergy$.MODULE$.getMod();
/*    */   }
/*    */   
/*    */   public final class ModCoFHEnergy$$anonfun$1
/*    */     extends AbstractFunction1<ModContainer, Object>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/* 27 */     public final boolean apply(ModContainer x$1) { String str = "CoFHAPI|energy"; if (x$1.getModId() == null) { x$1.getModId(); if (str != null); } else if (x$1.getModId().equals(str)) {  }  } } public final class ModCoFHEnergy$$anonfun$2 extends AbstractFunction1<ModContainer, ArtifactVersion> implements Serializable { public final ArtifactVersion apply(ModContainer x$2) { return x$2.getProcessedVersion(); } public static final long serialVersionUID = 0L; } public final class ModCoFHEnergy$$anonfun$initialize$1 extends AbstractFunction1<ArtifactVersion, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ArtifactVersion x$1) {
/* 28 */       return ModCoFHEnergy$.MODULE$.li$cil$oc$integration$cofh$energy$ModCoFHEnergy$$versionsUsingSplitEnergyAPI().containsVersion(x$1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\cofh\energy\ModCoFHEnergy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */