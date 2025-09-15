/*     */ package li.cil.oc.common;
/*     */ 
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import scala.Enumeration;
/*     */ import scala.Option;
/*     */ import scala.Some;
/*     */ import scala.StringContext;
/*     */ import scala.collection.Seq;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
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
/*     */ public final class PacketBuilder$
/*     */ {
/*     */   public static final PacketBuilder$ MODULE$;
/*     */   private final Logger log;
/*     */   private boolean isProfilingEnabled;
/*     */   
/*     */   public Logger log() {
/* 166 */     return this.log;
/* 167 */   } public boolean isProfilingEnabled() { return this.isProfilingEnabled; } public void isProfilingEnabled_$eq(boolean x$1) { this.isProfilingEnabled = x$1; }
/*     */   
/*     */   public void logPacket(Enumeration.Value packetType, int payloadSize, Option tileEntity) {
/* 170 */     if (isProfilingEnabled()) {
/* 171 */       Option option = tileEntity;
/* 172 */       if (option instanceof Some) { Some some = (Some)option; TileEntity t = (TileEntity)some.x(); (new String[6])[0] = "Sending: "; (new String[6])[1] = " @ "; (new String[6])[2] = " bytes from ("; (new String[6])[3] = ", "; (new String[6])[4] = ", "; (new String[6])[5] = ")."; log().info((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[6]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { packetType, BoxesRunTime.boxToInteger(payloadSize), BoxesRunTime.boxToInteger(t.field_145851_c), BoxesRunTime.boxToInteger(t.field_145848_d), BoxesRunTime.boxToInteger(t.field_145849_e) }))); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 173 */       else { (new String[3])[0] = "Sending: "; (new String[3])[1] = " @ "; (new String[3])[2] = " bytes."; log().info((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { packetType, BoxesRunTime.boxToInteger(payloadSize) }))); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   public ByteArrayOutputStream newData(boolean compressed) {
/* 179 */     ByteArrayOutputStream data = new ByteArrayOutputStream();
/* 180 */     data.write(compressed ? 1 : 0);
/* 181 */     return data;
/*     */   } private PacketBuilder$() {
/* 183 */     MODULE$ = this;
/*     */     this.log = LogManager.getLogger("OpenComputers-PacketBuilder");
/*     */     this.isProfilingEnabled = false;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\PacketBuilder$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */