/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import com.google.common.net.InetAddresses;
/*    */ import java.net.InetAddress;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class InetAddressRange
/*    */ {
/*    */   private final byte[] min;
/*    */   private final byte[] max;
/*    */   
/*    */   InetAddressRange(byte[] min, byte[] max) {
/* 14 */     this.min = min;
/* 15 */     this.max = max;
/*    */   }
/*    */   
/*    */   public boolean matches(InetAddress address) {
/* 19 */     byte[] entry = address.getAddress();
/* 20 */     if (entry.length != this.min.length) return false;
/*    */     
/* 22 */     for (int i = 0; i < entry.length; i++) {
/* 23 */       int value = 0xFF & entry[i];
/* 24 */       if (value < (0xFF & this.min[i]) || value > (0xFF & this.max[i])) return false;
/*    */     
/*    */     } 
/* 27 */     return true;
/*    */   }
/*    */   public static InetAddressRange parse(String addressStr, String prefixSizeStr) {
/*    */     int prefixSize;
/*    */     InetAddress address;
/*    */     try {
/* 33 */       prefixSize = Integer.parseInt(prefixSizeStr);
/* 34 */     } catch (NumberFormatException e) {
/* 35 */       throw new IllegalArgumentException(String.format("Malformed address range entry '%s': Cannot extract size of CIDR mask from '%s'.", new Object[] { addressStr + '/' + prefixSizeStr, prefixSizeStr }));
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 41 */       address = InetAddresses.forString(addressStr);
/* 42 */     } catch (IllegalArgumentException e) {
/* 43 */       throw new IllegalArgumentException(String.format("Malformed address range entry '%s': Cannot extract IP address from '%s'.", new Object[] { addressStr + '/' + prefixSizeStr, addressStr }));
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 48 */     byte[] minBytes = address.getAddress(), maxBytes = address.getAddress();
/* 49 */     int size = prefixSize;
/* 50 */     for (int i = 0; i < minBytes.length; i++) {
/* 51 */       if (size <= 0) {
/* 52 */         minBytes[i] = 0;
/* 53 */         maxBytes[i] = -1;
/* 54 */       } else if (size < 8) {
/* 55 */         minBytes[i] = (byte)(minBytes[i] & 255 << 8 - size);
/* 56 */         maxBytes[i] = (byte)(maxBytes[i] | 255 << 8 - size ^ 0xFFFFFFFF);
/*    */       } 
/*    */       
/* 59 */       size -= 8;
/*    */     } 
/*    */     
/* 62 */     return new InetAddressRange(minBytes, maxBytes);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\InetAddressRange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */