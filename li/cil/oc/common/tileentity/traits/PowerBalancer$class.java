/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ import li.cil.oc.api.network.Connector;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.SeqView;
/*    */ import scala.runtime.DoubleRef;
/*    */ 
/*    */ public abstract class PowerBalancer$class {
/*    */   public static void $init$(PowerBalancer $this) {
/*  9 */     $this.globalBuffer_$eq(0.0D); $this.globalBufferSize_$eq(0.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void updateEntity(PowerBalancer $this) {
/* 14 */     $this.li$cil$oc$common$tileentity$traits$PowerBalancer$$super$updateEntity();
/* 15 */     if ($this.isServer() && $this.isConnected() && $this.world().func_82737_E() % Settings$.MODULE$.get().tickFrequency() == false) {
/* 16 */       SeqView nodes = connectors($this);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 24 */       synchronized (network$1($this, (Connector)nodes.apply(0))) {
/* 25 */         synchronized (network$1($this, (Connector)nodes.apply(1))) {
/* 26 */           synchronized (network$1($this, (Connector)nodes.apply(2))) {
/* 27 */             synchronized (network$1($this, (Connector)nodes.apply(3))) {
/* 28 */               synchronized (network$1($this, (Connector)nodes.apply(4))) {
/* 29 */                 synchronized (network$1($this, (Connector)nodes.apply(5))) {
/* 30 */                   Tuple2<Object, Object> tuple2 = $this.distribute(); if (tuple2 != null) { double sumBuffer = tuple2._1$mcD$sp(), sumSize = tuple2._2$mcD$sp(); Tuple2.mcDD.sp sp2 = new Tuple2.mcDD.sp(sumBuffer, sumSize), sp1 = sp2; double d1 = sp1._1$mcD$sp(), d2 = sp1._2$mcD$sp();
/* 31 */                     if (d2 > false) {
/* 32 */                       double ratio = d1 / d2;
/* 33 */                       ((IterableLike)connectors($this).withFilter((Function1)new PowerBalancer$$anonfun$updateEntity$1($this))).foreach((Function1)new PowerBalancer$$anonfun$updateEntity$2($this, ratio));
/*    */                     } 
/*    */ 
/*    */                     
/* 37 */                     $this.globalBuffer_$eq(d1);
/* 38 */                     $this.globalBufferSize_$eq(d2); }
/*    */                   
/*    */                   throw new MatchError(tuple2);
/*    */                 } 
/*    */               } 
/*    */             } 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     }  } private static final Object network$1(PowerBalancer $this, Connector connector) {
/*    */     return (connector == null || connector.network() == null) ? $this : connector.network();
/*    */   } public static Tuple2 distribute(PowerBalancer $this) {
/* 50 */     DoubleRef sumBuffer = DoubleRef.create(0.0D), sumSize = DoubleRef.create(0.0D);
/* 51 */     ((IterableLike)connectors($this).withFilter((Function1)new PowerBalancer$$anonfun$distribute$1($this))).foreach((Function1)new PowerBalancer$$anonfun$distribute$2($this, sumBuffer, sumSize));
/*    */ 
/*    */ 
/*    */     
/* 55 */     return (Tuple2)new Tuple2.mcDD.sp(sumBuffer.elem, sumSize.elem);
/*    */   }
/*    */   private static SeqView connectors(PowerBalancer $this) {
/* 58 */     return (SeqView)Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).view().map((Function1)new PowerBalancer$$anonfun$connectors$1($this), IndexedSeqView$.MODULE$.arrCanBuildFrom());
/*    */   }
/*    */   
/*    */   public static boolean li$cil$oc$common$tileentity$traits$PowerBalancer$$isPrimary(PowerBalancer $this, Connector connector) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokestatic connectors : (Lli/cil/oc/common/tileentity/traits/PowerBalancer;)Lscala/collection/SeqView;
/*    */     //   4: astore_2
/*    */     //   5: aload_1
/*    */     //   6: ifnull -> 55
/*    */     //   9: aload_2
/*    */     //   10: aload_2
/*    */     //   11: new li/cil/oc/common/tileentity/traits/PowerBalancer$$anonfun$li$cil$oc$common$tileentity$traits$PowerBalancer$$isPrimary$1
/*    */     //   14: dup
/*    */     //   15: aload_0
/*    */     //   16: aload_1
/*    */     //   17: invokespecial <init> : (Lli/cil/oc/common/tileentity/traits/PowerBalancer;Lli/cil/oc/api/network/Connector;)V
/*    */     //   20: invokeinterface indexWhere : (Lscala/Function1;)I
/*    */     //   25: invokeinterface apply : (I)Ljava/lang/Object;
/*    */     //   30: aload_1
/*    */     //   31: astore_3
/*    */     //   32: dup
/*    */     //   33: ifnonnull -> 44
/*    */     //   36: pop
/*    */     //   37: aload_3
/*    */     //   38: ifnull -> 51
/*    */     //   41: goto -> 55
/*    */     //   44: aload_3
/*    */     //   45: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   48: ifeq -> 55
/*    */     //   51: iconst_1
/*    */     //   52: goto -> 56
/*    */     //   55: iconst_0
/*    */     //   56: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #64	-> 0
/*    */     //   #65	-> 5
/*    */     //   #63	-> 56
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	57	0	$this	Lli/cil/oc/common/tileentity/traits/PowerBalancer;
/*    */     //   0	57	1	connector	Lli/cil/oc/api/network/Connector;
/*    */     //   5	52	2	nodes	Lscala/collection/SeqView;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\PowerBalancer$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */