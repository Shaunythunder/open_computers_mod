/*     */ package li.cil.oc.common;
/*     */ 
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.OutputStream;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.reflect.ScalaSignature;
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
/*     */ @ScalaSignature(bytes = "\006\00153Q!\001\002\002\002-\021\021\003U1dW\026$()^5mI\026\024()Y:f\025\t\031A!\001\004d_6lwN\034\006\003\013\031\t!a\\2\013\005\035A\021aA2jY*\t\021\"\001\002mS\016\001QC\001\007\027'\t\001Q\002\005\002\017\0375\t!!\003\002\021\005\ti\001+Y2lKR\024U/\0337eKJD\001B\005\001\003\006\004%\tbE\001\007gR\024X-Y7\026\003Q\001\"!\006\f\r\001\021)q\003\001b\0011\t\tA+\005\002\032?A\021!$H\007\0027)\tA$A\003tG\006d\027-\003\002\0377\t9aj\034;iS:<\007C\001\021&\033\005\t#B\001\022$\003\tIwNC\001%\003\021Q\027M^1\n\005\031\n#\001D(viB,Ho\025;sK\006l\007\002\003\025\001\005\003\005\013\021\002\013\002\017M$(/Z1nA!)!\006\001C\001W\0051A(\0338jiz\"\"\001L\027\021\0079\001A\003C\003\023S\001\007A\003C\0040\001\001\007I\021\001\031\002\025QLG.Z#oi&$\0300F\0012!\rQ\"\007N\005\003gm\021aa\0249uS>t\007CA\033=\033\0051$BA\0349\003)!\030\016\\3f]RLG/\037\006\003si\n\021\"\\5oK\016\024\030M\032;\013\003m\n1A\\3u\023\tidG\001\006US2,WI\034;jifDqa\020\001A\002\023\005\001)\001\buS2,WI\034;jif|F%Z9\025\005\005#\005C\001\016C\023\t\0315D\001\003V]&$\bbB#?\003\003\005\r!M\001\004q\022\n\004BB$\001A\003&\021'A\006uS2,WI\034;jif\004\003\"B%\001\t\003R\025aD<sSR,G+\0337f\013:$\030\016^=\025\005\005[\005\"\002'I\001\004!\024!\001;")
/*     */ public abstract class PacketBuilderBase<T extends OutputStream>
/*     */   extends PacketBuilder
/*     */ {
/*     */   private final T stream;
/*     */   private Option<TileEntity> tileEntity;
/*     */   
/*     */   public T stream() {
/* 131 */     return this.stream; } public PacketBuilderBase(OutputStream stream) { super(new BufferedOutputStream(stream));
/* 132 */     this.tileEntity = (Option<TileEntity>)None$.MODULE$; } public Option<TileEntity> tileEntity() { return this.tileEntity; } public void tileEntity_$eq(Option<TileEntity> x$1) { this.tileEntity = x$1; }
/*     */   
/*     */   public void writeTileEntity(TileEntity t) {
/* 135 */     super.writeTileEntity(t);
/* 136 */     if (PacketBuilder$.MODULE$.isProfilingEnabled())
/* 137 */       tileEntity_$eq(Option$.MODULE$.apply(t)); 
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\PacketBuilderBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */