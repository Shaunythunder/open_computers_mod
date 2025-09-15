/*    */ package li.cil.oc.common.component.traits;
/*    */ @ScalaSignature(bytes = "\006\001Y4q!\001\002\021\002\007\005qB\001\bWS\022,wNU1n\t\0264\030nY3\013\005\r!\021A\002;sC&$8O\003\002\006\r\005I1m\\7q_:,g\016\036\006\003\017!\taaY8n[>t'BA\005\013\003\ty7M\003\002\f\031\005\0311-\0337\013\0035\t!\001\\5\004\001M\021\001\001\005\t\003#Qi\021A\005\006\002'\005)1oY1mC&\021QC\005\002\007\003:L(+\0324\t\013]\001A\021\001\r\002\r\021Jg.\033;%)\005I\002CA\t\033\023\tY\"C\001\003V]&$\bbB\017\001\005\004%IAH\001\020S:$XM\0358bY\n+hMZ3sgV\tq\004\005\003!K\035RS\"A\021\013\005\t\032\023aB7vi\006\024G.\032\006\003II\t!bY8mY\026\034G/[8o\023\t1\023EA\004ICNDW*\0319\021\005EA\023BA\025\023\005\rIe\016\036\t\003W1j\021\001B\005\003[\021\021Qb\0229v)\026DHOQ;gM\026\024\bBB\030\001A\003%q$\001\tj]R,'O\\1m\005V4g-\032:tA!9\021\007\001b\001\n\003\021\024!\006*F'\026\023f+\022#`'\016\023V)\022(`\023:#U\tW\013\002O!1A\007\001Q\001\n\035\naCU#T\013J3V\tR0T\007J+UIT0J\035\022+\005\f\t\005\006m\001!\taN\001\bSN,U\016\035;z+\005A\004CA\t:\023\tQ$CA\004C_>dW-\0318\t\013q\002A\021A\037\002%=t')\0364gKJ\024\026-\034#fgR\024x.\037\013\0033yBQaP\036A\002\035\n!!\0333\t\013\005\003A\021\001\"\002\033\t,hMZ3s\023:$W\r_3t)\005\031\005cA\tEO%\021QI\005\002\006\003J\024\030-\037\005\006\017\002!\t\001S\001\nC\022$')\0364gKJ$\"\001O%\t\013)3\005\031\001\026\002\007I\fW\016C\003M\001\021\005Q*A\007sK6|g/\032\"vM\032,'o\035\013\003O9CQaT&A\002\r\0131!\0333t\021\025\t\006\001\"\001S\003A\021X-\\8wK\006cGNQ;gM\026\0248\017F\001(\021\025!\006\001\"\001V\003)aw.\0313Ck\0324WM\035\013\0053Y{\006\rC\003X'\002\007\001,A\004bI\022\024Xm]:\021\005ecfBA\t[\023\tY&#\001\004Qe\026$WMZ\005\003;z\023aa\025;sS:<'BA.\023\021\025y4\0131\001(\021\025\t7\0131\001c\003\rq'\r\036\t\003G&l\021\001\032\006\003C\026T!AZ4\002\0235Lg.Z2sC\032$(\"\0015\002\0079,G/\003\002kI\nqaJ\021+UC\036\034u.\0349pk:$\007\"\0027\001\t\003i\027!C4fi\n+hMZ3s)\tq\027\017E\002\022_*J!\001\035\n\003\r=\003H/[8o\021\025y4\0161\001(\021\025\031\b\001\"\0013\003aqW\r\037;Bm\006LG.\0312mK\n+hMZ3s\023:$W\r\037\005\006k\002!\tAU\001\024G\006d7-\0367bi\026,6/\0323NK6|'/\037")
/*    */ public interface VideoRamDevice { void li$cil$oc$common$component$traits$VideoRamDevice$_setter_$li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers_$eq(HashMap paramHashMap); void li$cil$oc$common$component$traits$VideoRamDevice$_setter_$RESERVED_SCREEN_INDEX_$eq(int paramInt); HashMap<Object, GpuTextBuffer> li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers();
/*    */   int RESERVED_SCREEN_INDEX();
/*    */   boolean isEmpty();
/*    */   void onBufferRamDestroy(int paramInt);
/*    */   int[] bufferIndexes();
/*    */   boolean addBuffer(GpuTextBuffer paramGpuTextBuffer);
/*    */   int removeBuffers(int[] paramArrayOfint);
/*    */   int removeAllBuffers();
/*    */   void loadBuffer(String paramString, int paramInt, NBTTagCompound paramNBTTagCompound);
/*    */   Option<GpuTextBuffer> getBuffer(int paramInt);
/*    */   int nextAvailableBufferIndex();
/*    */   int calculateUsedMemory();
/* 15 */   public final class VideoRamDevice$$anonfun$bufferIndexes$1 extends AbstractPartialFunction<Tuple2<Object, GpuTextBuffer>, Object> implements Serializable { public final <A1 extends Tuple2<Object, GpuTextBuffer>, B1> B1 applyOrElse(Tuple2 x1, Function1 default) { Tuple2 tuple2 = x1; if (tuple2 != null)
/* 16 */       { int index = tuple2._1$mcI$sp(), i = index; if (tuple2._2() != null) return (B1)BoxesRunTime.boxToInteger(i);  }  return (B1)default.apply(x1); } public static final long serialVersionUID = 0L; public final boolean isDefinedAt(Tuple2 x1) { boolean bool; Tuple2 tuple2 = x1; if (tuple2 != null && tuple2._2() != null) { bool = true; }
/*    */       else
/*    */       { bool = false; }
/*    */       
/*    */       return bool; }
/*    */ 
/*    */     
/*    */     public VideoRamDevice$$anonfun$bufferIndexes$1(VideoRamDevice $outer) {} }
/*    */   
/*    */   public final class VideoRamDevice$$anonfun$removeBuffers$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L;
/*    */     private final IntRef count$1;
/*    */     
/* 28 */     public final void apply(int id) { apply$mcVI$sp(id); } public VideoRamDevice$$anonfun$removeBuffers$1(VideoRamDevice $outer, IntRef count$1) {} public void apply$mcVI$sp(int id) {
/* 29 */       if (this.$outer.li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers().remove(BoxesRunTime.boxToInteger(id)).nonEmpty()) {
/* 30 */         this.$outer.onBufferRamDestroy(id);
/* 31 */         this.count$1.elem++;
/*    */       } 
/*    */     } }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final class VideoRamDevice$$anonfun$calculateUsedMemory$1
/*    */     extends AbstractFunction1<Tuple2<Object, GpuTextBuffer>, Object>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final boolean apply(Tuple2 check$ifrefutable$1)
/*    */     {
/* 63 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { GpuTextBuffer buffer = (GpuTextBuffer)tuple2._2(); if (buffer != null) return true;  }  return false; } public VideoRamDevice$$anonfun$calculateUsedMemory$1(VideoRamDevice $outer) {} } public final class VideoRamDevice$$anonfun$calculateUsedMemory$2 extends AbstractFunction1<Tuple2<Object, GpuTextBuffer>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IntRef sum$1; public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { GpuTextBuffer buffer = (GpuTextBuffer)tuple2._2(); if (buffer != null) { GpuTextBuffer gpuTextBuffer = buffer;
/* 64 */           this.sum$1.elem += gpuTextBuffer.data().width() * gpuTextBuffer.data().height(); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */           return; }
/*    */          }
/*    */       
/*    */       throw new MatchError(tuple2); }
/*    */ 
/*    */     
/*    */     public VideoRamDevice$$anonfun$calculateUsedMemory$2(VideoRamDevice $outer, IntRef sum$1) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\traits\VideoRamDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */