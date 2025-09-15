/*    */ package li.cil.oc.common.component.traits;
/*    */ @ScalaSignature(bytes = "\006\001\005maaB\001\003!\003\r\ta\004\002\023-&$Wm\034*b[J\0137\017^3sSj,'O\003\002\004\t\0051AO]1jiNT!!\002\004\002\023\r|W\016]8oK:$(BA\004\t\003\031\031w.\\7p]*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\rC\003\030\001\021\005\001$\001\004%S:LG\017\n\013\0023A\021\021CG\005\0037I\021A!\0268ji\032!Q\004\001\001\037\005A1\026N\035;vC2\024\026-\034#fm&\034WmE\002\035!}\001\"\001I\021\016\003\tI!A\t\002\003\035YKG-Z8SC6$UM^5dK\"AA\005\bBC\002\023\005Q%A\003po:,'/F\001'!\t9#F\004\002\022Q%\021\021FE\001\007!J,G-\0324\n\005-b#AB*ue&twM\003\002*%!Aa\006\bB\001B\003%a%\001\004po:,'\017\t\005\006aq!\t!M\001\007y%t\027\016\036 \025\005I\"\004CA\032\035\033\005\001\001\"\002\0230\001\0041\003b\002\034\001\005\004%IaN\001\020S:$XM\0358bY\n+hMZ3sgV\t\001\b\005\003:}\031zR\"\001\036\013\005mb\024aB7vi\006\024G.\032\006\003{I\t!bY8mY\026\034G/[8o\023\ty$HA\004ICNDW*\0319\t\r\005\003\001\025!\0039\003AIg\016^3s]\006d')\0364gKJ\034\b\005C\003D\001\031\005A)A\bp]\n+hMZ3s%\006l\027J\\5u)\tIR\tC\003G\005\002\007q)A\002sC6\004\"\001S%\016\003\021I!A\023\003\003\033\035\003X\017V3yi\n+hMZ3s\021\025a\005A\"\001N\0039ygNQ;gM\026\024()\033;CYR$\002\"\007(T+^K&\f\030\005\006\037.\003\r\001U\001\004G>d\007CA\tR\023\t\021&CA\002J]RDQ\001V&A\002A\0131A]8x\021\02516\n1\001Q\003\0059\b\"\002-L\001\004\001\026!\0015\t\013\031[\005\031A$\t\013m[\005\031\001)\002\017\031\024x.\\\"pY\")Ql\023a\001!\0069aM]8n%><\b\"B0\001\r\003\001\027AE8o\005V4g-\032:SC6$Um\035;s_f$\"!G1\t\013\031s\006\031A$\t\013\r\004A\021\0013\002\023\005$GMQ;gM\026\024HCA3i!\t\tb-\003\002h%\t9!i\\8mK\006t\007\"\002$c\001\0049\005\"\0026\001\t\003Y\027\001\004:f[>4XMQ;gM\026\024HcA3m[\")A%\033a\001M!)a.\033a\001!\006\021\021\016\032\005\006a\002!\t!]\001\021e\026lwN^3BY2\024UO\0324feN$\"\001\025:\t\013\021z\007\031\001\024\t\013A\004A\021\001;\025\003ACQA\036\001\005\002]\f!\002\\8bI\n+hMZ3s)\021)\0070\037>\t\013\021*\b\031\001\024\t\0139,\b\031\001)\t\013m,\b\031\001?\002\0079\024G\017E\002~\003\017i\021A \006\003w~TA!!\001\002\004\005IQ.\0338fGJ\fg\r\036\006\003\003\013\t1A\\3u\023\r\tIA \002\017\035\n#F+Y4D_6\004x.\0368e\021\035\ti\001\001C\001\003\037\t\021bZ3u\005V4g-\032:\025\r\005E\021qCA\r!\021\t\0221C$\n\007\005U!C\001\004PaRLwN\034\005\007I\005-\001\031\001\024\t\r9\fY\0011\001Q\001")
/*    */ public interface VideoRamRasterizer { void li$cil$oc$common$component$traits$VideoRamRasterizer$_setter_$li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers_$eq(HashMap paramHashMap); HashMap<String, VideoRamDevice> li$cil$oc$common$component$traits$VideoRamRasterizer$$internalBuffers(); void onBufferRamInit(GpuTextBuffer paramGpuTextBuffer); void onBufferBitBlt(int paramInt1, int paramInt2, int paramInt3, int paramInt4, GpuTextBuffer paramGpuTextBuffer, int paramInt5, int paramInt6); void onBufferRamDestroy(GpuTextBuffer paramGpuTextBuffer);
/*    */   boolean addBuffer(GpuTextBuffer paramGpuTextBuffer);
/*    */   boolean removeBuffer(String paramString, int paramInt);
/*    */   int removeAllBuffers(String paramString);
/*    */   int removeAllBuffers();
/*    */   boolean loadBuffer(String paramString, int paramInt, NBTTagCompound paramNBTTagCompound);
/*    */   Option<GpuTextBuffer> getBuffer(String paramString, int paramInt);
/*    */   public class VirtualRamDevice implements VideoRamDevice { private final String owner;
/* 11 */     public HashMap<Object, GpuTextBuffer> li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers() { return this.li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers; } private final HashMap<Object, GpuTextBuffer> li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers; private final int RESERVED_SCREEN_INDEX; public int RESERVED_SCREEN_INDEX() { return this.RESERVED_SCREEN_INDEX; } public void li$cil$oc$common$component$traits$VideoRamDevice$_setter_$li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers_$eq(HashMap<Object, GpuTextBuffer> x$1) { this.li$cil$oc$common$component$traits$VideoRamDevice$$internalBuffers = x$1; } public void li$cil$oc$common$component$traits$VideoRamDevice$_setter_$RESERVED_SCREEN_INDEX_$eq(int x$1) { this.RESERVED_SCREEN_INDEX = x$1; } public boolean isEmpty() { return VideoRamDevice$class.isEmpty(this); } public void onBufferRamDestroy(int id) { VideoRamDevice$class.onBufferRamDestroy(this, id); } public int[] bufferIndexes() { return VideoRamDevice$class.bufferIndexes(this); } public boolean addBuffer(GpuTextBuffer ram) { return VideoRamDevice$class.addBuffer(this, ram); } public int removeBuffers(int[] ids) { return VideoRamDevice$class.removeBuffers(this, ids); } public int removeAllBuffers() { return VideoRamDevice$class.removeAllBuffers(this); } public void loadBuffer(String address, int id, NBTTagCompound nbt) { VideoRamDevice$class.loadBuffer(this, address, id, nbt); } public Option<GpuTextBuffer> getBuffer(int id) { return VideoRamDevice$class.getBuffer(this, id); } public int nextAvailableBufferIndex() { return VideoRamDevice$class.nextAvailableBufferIndex(this); } public int calculateUsedMemory() { return VideoRamDevice$class.calculateUsedMemory(this); } public String owner() { return this.owner; } public VirtualRamDevice(VideoRamRasterizer $outer, String owner) { VideoRamDevice$class.$init$(this); }
/*    */      }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final class VideoRamRasterizer$$anonfun$removeAllBuffers$1
/*    */     extends AbstractFunction1.mcVI.sp
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
/*    */     private final IntRef count$1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     private final String owner$1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public final void apply(int id)
/*    */     {
/* 51 */       apply$mcVI$sp(id); } public VideoRamRasterizer$$anonfun$removeAllBuffers$1(VideoRamRasterizer $outer, IntRef count$1, String owner$1) {} public void apply$mcVI$sp(int id) {
/* 52 */       if (this.$outer.removeBuffer(this.owner$1, id))
/* 53 */         this.count$1.elem++; 
/*    */     }
/*    */   }
/*    */   
/*    */   public final class VideoRamRasterizer$$anonfun$removeAllBuffers$2
/*    */     extends AbstractFunction1<Tuple2<String, VideoRamDevice>, Object>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(Tuple2 check$ifrefutable$1) {
/* 64 */       Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { String owner = (String)tuple2._1(); if (owner != null && tuple2._2() != null) return true;  }  return false; } public VideoRamRasterizer$$anonfun$removeAllBuffers$2(VideoRamRasterizer $outer) {} } public final class VideoRamRasterizer$$anonfun$removeAllBuffers$3 extends AbstractFunction1<Tuple2<String, VideoRamDevice>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IntRef count$2; public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { String owner = (String)tuple2._1(); if (owner != null) { String str = owner; if (tuple2._2() != null) {
/* 65 */             this.count$2.elem += this.$outer.removeAllBuffers(str); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */             return;
/*    */           }  }
/*    */          }
/*    */       
/*    */       throw new MatchError(tuple2); }
/*    */ 
/*    */     
/*    */     public VideoRamRasterizer$$anonfun$removeAllBuffers$3(VideoRamRasterizer $outer, IntRef count$2) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\component\traits\VideoRamRasterizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */