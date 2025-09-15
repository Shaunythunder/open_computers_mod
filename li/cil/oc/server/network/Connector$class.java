/*     */ package li.cil.oc.server.network;
/*     */ import scala.Option;
/*     */ import scala.Some;
/*     */ import scala.math.package$;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public abstract class Connector$class {
/*     */   public static void $init$(Connector $this) {
/*   9 */     $this.localBufferSize_$eq(0.0D);
/*     */     
/*  11 */     $this.localBuffer_$eq(0.0D);
/*     */     
/*  13 */     $this.distributor_$eq((Option<Distributor>)None$.MODULE$);
/*     */   }
/*     */   
/*     */   public static double globalBuffer(Connector $this) {
/*  17 */     return BoxesRunTime.unboxToDouble($this.distributor().fold((Function0)new Connector$$anonfun$globalBuffer$1($this), (Function1)new Connector$$anonfun$globalBuffer$2($this)));
/*     */   } public static double globalBufferSize(Connector $this) {
/*  19 */     return BoxesRunTime.unboxToDouble($this.distributor().fold((Function0)new Connector$$anonfun$globalBufferSize$1($this), (Function1)new Connector$$anonfun$globalBufferSize$2($this)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static double changeBuffer(Connector $this, double delta) {
/*  25 */     if (Settings$.MODULE$.get().ignorePower()) {
/*     */ 
/*     */     
/*     */     } else {
/*     */       
/*  30 */       synchronized ($this) { Option<Distributor> option = $this.distributor();
/*  31 */         if (option instanceof Some) { Some some = (Some)option; Distributor distributor = (Distributor)some.x(); synchronized (distributor) { Double double_2 = BoxesRunTime.boxToDouble(distributor.changeBuffer(change($this, delta))); double d1 = BoxesRunTime.unboxToDouble(double_2); Double double_1 = BoxesRunTime.boxToDouble(d1); return BoxesRunTime.unboxToDouble(double_1); }  }
/*  32 */          double d = change($this, delta);
/*     */         Double double_ = BoxesRunTime.boxToDouble(d);
/*     */         return BoxesRunTime.unboxToDouble(double_); }
/*     */     
/*     */     } 
/*     */     return (delta == false) ? 0.0D : "JD-Core does not support Kotlin"; } private static double change(Connector $this, double delta) {
/*  38 */     if ($this.localBufferSize() <= false) return delta; 
/*  39 */     double oldBuffer = $this.localBuffer();
/*  40 */     $this.localBuffer_$eq($this.localBuffer() + delta);
/*     */     
/*  42 */     double d1 = $this.localBuffer();
/*  43 */     $this.localBuffer_$eq(0.0D);
/*     */ 
/*     */ 
/*     */     
/*  47 */     double d2 = $this.localBuffer() - $this.localBufferSize();
/*  48 */     $this.localBuffer_$eq($this.localBufferSize());
/*  49 */     double remaining = ($this.localBuffer() < false) ? d1 : (($this.localBuffer() > $this.localBufferSize()) ? d2 : 
/*     */       
/*  51 */       0.0D);
/*  52 */     if ($this.localBuffer() != oldBuffer) {
/*  53 */       Option<Distributor> option = $this.distributor();
/*  54 */       if (option instanceof Some) { Some some = (Some)option; Distributor d = (Distributor)some.x(); d.globalBuffer_$eq(package$.MODULE$.max(0.0D, package$.MODULE$.min(d.globalBufferSize(), d.globalBuffer() - oldBuffer + $this.localBuffer()))); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  55 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     } 
/*  58 */     return remaining;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean tryChangeBuffer(Connector $this, double delta) {
/*  63 */     if (Settings$.MODULE$.get().ignorePower()) {  }
/*     */     else
/*  65 */     { synchronized ($this) { Option<Distributor> option = $this.distributor();
/*  66 */         if (option instanceof Some) { Some some = (Some)option; Distributor d = (Distributor)some.x(); synchronized (d) {
/*  67 */             if ($this.localBuffer() > $this.localBufferSize()) {
/*  68 */               d.changeBuffer($this.localBuffer() - $this.localBufferSize());
/*  69 */               $this.localBuffer_$eq($this.localBufferSize());
/*     */             } 
/*  71 */             double newGlobalBuffer = $this.globalBuffer() + delta;
/*  72 */             Boolean bool4 = BoxesRunTime.boxToBoolean(((delta > false || newGlobalBuffer >= false) && (delta < false || newGlobalBuffer <= $this.globalBufferSize()) && d.changeBuffer(delta) == false)); boolean bool3 = BoxesRunTime.unboxToBoolean(bool4); Boolean bool2 = BoxesRunTime.boxToBoolean(bool3); return BoxesRunTime.unboxToBoolean(bool2);
/*     */           }  }
/*     */         
/*  75 */         double newLocalBuffer = $this.localBuffer() + delta;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  80 */         $this.localBuffer_$eq(newLocalBuffer);
/*  81 */         boolean bool1 = ((delta < false && newLocalBuffer < false) || (delta > false && newLocalBuffer > $this.localBufferSize())) ? false : true;
/*     */         Boolean bool = BoxesRunTime.boxToBoolean(bool1);
/*     */         return BoxesRunTime.unboxToBoolean(bool); }
/*     */        }
/*     */     
/*     */     return (delta == false) ? true : "JD-Core does not support Kotlin";
/*     */   } public static void setLocalBufferSize(Connector $this, double size) {
/*  88 */     double clampedSize = package$.MODULE$.max(size, 0.0D);
/*  89 */     synchronized ($this) { Option<Distributor> option = $this.distributor();
/*  90 */       if (option instanceof Some) { Some some = (Some)option; Distributor d = (Distributor)some.x(); synchronized (d) {
/*  91 */           double oldSize = $this.localBufferSize();
/*     */ 
/*     */           
/*  94 */           $this.localBufferSize_$eq(clampedSize);
/*  95 */           if ($this.network() != null)
/*  96 */             if (oldSize <= false && clampedSize > false) { d.addConnector($this); }
/*  97 */             else if (oldSize > false && clampedSize == false) { d.removeConnector($this); }
/*  98 */             else { d.globalBufferSize_$eq(package$.MODULE$.max(d.globalBufferSize() - oldSize + clampedSize, 0.0D)); }
/*     */              
/* 100 */           double surplus = package$.MODULE$.max($this.localBuffer() - clampedSize, 0.0D);
/* 101 */           $this.changeBuffer(-surplus);
/* 102 */           Double double_2 = BoxesRunTime.boxToDouble(d.changeBuffer(surplus)); Double double_1 = double_2; return;
/*     */         }  }
/*     */       
/* 105 */       $this.localBufferSize_$eq(clampedSize);
/* 106 */       $this.localBuffer_$eq(package$.MODULE$.min($this.localBuffer(), $this.localBufferSize())); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       return; }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void onDisconnect(Connector $this, Node node) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokeinterface li$cil$oc$server$network$Connector$$super$onDisconnect : (Lli/cil/oc/api/network/Node;)V
/*     */     //   7: aload_1
/*     */     //   8: aload_0
/*     */     //   9: astore_2
/*     */     //   10: dup
/*     */     //   11: ifnonnull -> 22
/*     */     //   14: pop
/*     */     //   15: aload_2
/*     */     //   16: ifnull -> 29
/*     */     //   19: goto -> 48
/*     */     //   22: aload_2
/*     */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   26: ifeq -> 48
/*     */     //   29: aload_0
/*     */     //   30: dup
/*     */     //   31: astore_3
/*     */     //   32: monitorenter
/*     */     //   33: aload_0
/*     */     //   34: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */     //   37: invokeinterface distributor_$eq : (Lscala/Option;)V
/*     */     //   42: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   45: pop
/*     */     //   46: aload_3
/*     */     //   47: monitorexit
/*     */     //   48: return
/*     */     //   49: aload_3
/*     */     //   50: monitorexit
/*     */     //   51: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #113	-> 0
/*     */     //   #114	-> 7
/*     */     //   #115	-> 29
/*     */     //   #112	-> 48
/*     */     //   #115	-> 49
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	52	0	$this	Lli/cil/oc/server/network/Connector;
/*     */     //   0	52	1	node	Lli/cil/oc/api/network/Node;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   33	48	49	finally
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void load(Connector $this, NBTTagCompound nbt) {
/* 122 */     $this.li$cil$oc$server$network$Connector$$super$load(nbt);
/* 123 */     $this.localBuffer_$eq(nbt.func_74769_h("buffer"));
/*     */   }
/*     */   
/*     */   public static void save(Connector $this, NBTTagCompound nbt) {
/* 127 */     $this.li$cil$oc$server$network$Connector$$super$save(nbt);
/* 128 */     nbt.func_74780_a("buffer", package$.MODULE$.min($this.localBuffer(), $this.localBufferSize()));
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\Connector$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */