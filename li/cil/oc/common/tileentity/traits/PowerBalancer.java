/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ 
/*    */ import li.cil.oc.api.network.Connector;
/*    */ import li.cil.oc.api.network.Node;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.DoubleRef;
/*    */ import scala.runtime.TraitSetter;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001%4q!\001\002\021\002\007\005qBA\007Q_^,'OQ1mC:\034WM\035\006\003\007\021\ta\001\036:bSR\034(BA\003\007\003)!\030\016\\3f]RLG/\037\006\003\017!\taaY8n[>t'BA\005\013\003\ty7M\003\002\f\031\005\0311-\0337\013\0035\t!\001\\5\004\001M!\001\001E\r\036!\t\tr#D\001\023\025\t)1C\003\002\025+\005IQ.\0338fGJ\fg\r\036\006\002-\005\031a.\032;\n\005a\021\"A\003+jY\026,e\016^5usB\021!dG\007\002\005%\021AD\001\002\021!><XM]%oM>\024X.\031;j_:\004\"AH\022\016\003}Q!\001I\021\002\0179,Go^8sW*\021!\005C\001\004CBL\027B\001\023 \005A\031\026\016Z3e\013:4\030N]8o[\026tG\017C\003'\001\021\005q%\001\004%S:LG\017\n\013\002QA\021\021\006L\007\002U)\t1&A\003tG\006d\027-\003\002.U\t!QK\\5u\021\035y\003\0011A\005\002A\nAb\0327pE\006d')\0364gKJ,\022!\r\t\003SIJ!a\r\026\003\r\021{WO\0317f\021\035)\004\0011A\005\002Y\n\001c\0327pE\006d')\0364gKJ|F%Z9\025\005!:\004b\002\0355\003\003\005\r!M\001\004q\022\n\004B\002\036\001A\003&\021'A\007hY>\024\027\r\034\"vM\032,'\017\t\005\by\001\001\r\021\"\0011\003A9Gn\0342bY\n+hMZ3s'&TX\rC\004?\001\001\007I\021A \002)\035dwNY1m\005V4g-\032:TSj,w\fJ3r)\tA\003\tC\0049{\005\005\t\031A\031\t\r\t\003\001\025)\0032\003E9Gn\0342bY\n+hMZ3s'&TX\r\t\005\006\t\0021\t\"R\001\fSN\034uN\0348fGR,G-F\001G!\tIs)\003\002IU\t9!i\\8mK\006t\007\"\002&\001\t\003:\023\001D;qI\006$X-\0228uSRL\b\"\002'\001\t#i\025A\0033jgR\024\030NY;uKR\ta\n\005\003*\037F\n\024B\001)+\005\031!V\017\0357fe!)!\013\001C\005'\006Q1m\0348oK\016$xN]:\026\003Q\003B!\026-[;6\taK\003\002XU\005Q1m\0347mK\016$\030n\0348\n\005e3&aB*fcZKWm\036\t\003=mK!\001X\020\003\023\r{gN\\3di>\024\bcA\025_5&\021qL\013\002\006\003J\024\030-\037\005\006C\002!IAY\001\nSN\004&/[7bef$\"AR2\t\013\021\004\007\031\001.\002\023\r|gN\\3di>\024\bb\0034\001!\003\r\t\021!C\005O\035\f!c];qKJ$S\017\0353bi\026,e\016^5us&\021!\n[\005\0031\t\001")
/*    */ public interface PowerBalancer extends PowerInformation, SidedEnvironment {
/*    */   double globalBuffer();
/*    */   
/*    */   @TraitSetter
/*    */   void globalBuffer_$eq(double paramDouble);
/*    */   
/*    */   double globalBufferSize();
/*    */   
/*    */   @TraitSetter
/*    */   void globalBufferSize_$eq(double paramDouble);
/*    */   
/*    */   boolean isConnected();
/*    */   
/*    */   void updateEntity();
/*    */   
/*    */   Tuple2<Object, Object> distribute();
/*    */   
/*    */   public final class PowerBalancer$$anonfun$updateEntity$1 extends AbstractFunction1<Connector, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/* 33 */     public final boolean apply(Connector node) { return PowerBalancer$class.li$cil$oc$common$tileentity$traits$PowerBalancer$$isPrimary(this.$outer, node); } public PowerBalancer$$anonfun$updateEntity$1(PowerBalancer $outer) {} } public final class PowerBalancer$$anonfun$updateEntity$2 extends AbstractFunction1<Connector, Object> implements Serializable { public final double apply(Connector node) {
/* 34 */       return node.changeBuffer(node.globalBufferSize() * this.ratio$1 - node.globalBuffer());
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final double ratio$1;
/*    */     
/*    */     public PowerBalancer$$anonfun$updateEntity$2(PowerBalancer $outer, double ratio$1) {} }
/*    */ 
/*    */   
/*    */   public final class PowerBalancer$$anonfun$distribute$1
/*    */     extends AbstractFunction1<Connector, Object>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public PowerBalancer$$anonfun$distribute$1(PowerBalancer $outer) {}
/*    */     
/* 51 */     public final boolean apply(Connector node) { return PowerBalancer$class.li$cil$oc$common$tileentity$traits$PowerBalancer$$isPrimary(this.$outer, node); } } public final class PowerBalancer$$anonfun$distribute$2 extends AbstractFunction1<Connector, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final DoubleRef sumBuffer$1; public final void apply(Connector node) {
/* 52 */       this.sumBuffer$1.elem += node.globalBuffer();
/* 53 */       this.sumSize$1.elem += node.globalBufferSize();
/*    */     } private final DoubleRef sumSize$1; public PowerBalancer$$anonfun$distribute$2(PowerBalancer $outer, DoubleRef sumBuffer$1, DoubleRef sumSize$1) {} }
/*    */   public final class PowerBalancer$$anonfun$connectors$1 extends AbstractFunction1<ForgeDirection, Connector> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     public final Connector apply(ForgeDirection x$2) {
/*    */       Connector connector;
/* 58 */       Node node = this.$outer.sidedNode(x$2);
/* 59 */       if (node instanceof Connector) { Connector connector1 = (Connector)node; }
/* 60 */       else { connector = null; }
/*    */       
/*    */       return connector;
/*    */     }
/*    */     
/*    */     public PowerBalancer$$anonfun$connectors$1(PowerBalancer $outer) {} }
/*    */ 
/*    */   
/*    */   public final class PowerBalancer$$anonfun$li$cil$oc$common$tileentity$traits$PowerBalancer$$isPrimary$1 extends AbstractFunction1<Connector, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Connector connector$1;
/*    */     
/*    */     public final boolean apply(Connector node) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ifnull -> 43
/*    */       //   4: aload_1
/*    */       //   5: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*    */       //   10: aload_0
/*    */       //   11: getfield connector$1 : Lli/cil/oc/api/network/Connector;
/*    */       //   14: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*    */       //   19: astore_2
/*    */       //   20: dup
/*    */       //   21: ifnonnull -> 32
/*    */       //   24: pop
/*    */       //   25: aload_2
/*    */       //   26: ifnull -> 39
/*    */       //   29: goto -> 43
/*    */       //   32: aload_2
/*    */       //   33: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   36: ifeq -> 43
/*    */       //   39: iconst_1
/*    */       //   40: goto -> 44
/*    */       //   43: iconst_0
/*    */       //   44: ireturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #65	-> 0
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	45	0	this	Lli/cil/oc/common/tileentity/traits/PowerBalancer$$anonfun$li$cil$oc$common$tileentity$traits$PowerBalancer$$isPrimary$1;
/*    */       //   0	45	1	node	Lli/cil/oc/api/network/Connector;
/*    */     }
/*    */     
/*    */     public PowerBalancer$$anonfun$li$cil$oc$common$tileentity$traits$PowerBalancer$$isPrimary$1(PowerBalancer $outer, Connector connector$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\PowerBalancer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */