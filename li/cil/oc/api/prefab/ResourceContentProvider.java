/*    */ package li.cil.oc.api.prefab;
/*    */ 
/*    */ import com.google.common.base.Charsets;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.util.ArrayList;
/*    */ import li.cil.oc.api.manual.ContentProvider;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.util.ResourceLocation;
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
/*    */ 
/*    */ public class ResourceContentProvider
/*    */   implements ContentProvider
/*    */ {
/*    */   private final String resourceDomain;
/*    */   private final String basePath;
/*    */   
/*    */   public ResourceContentProvider(String resourceDomain, String basePath) {
/* 32 */     this.resourceDomain = resourceDomain;
/* 33 */     this.basePath = basePath;
/*    */   }
/*    */   
/*    */   public ResourceContentProvider(String resourceDomain) {
/* 37 */     this(resourceDomain, "");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Iterable<String> getContent(String path) {
/* 43 */     ResourceLocation location = new ResourceLocation(this.resourceDomain, this.basePath + (path.startsWith("/") ? path.substring(1) : path));
/* 44 */     InputStream is = null;
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 49 */       is = Minecraft.func_71410_x().func_110442_L().func_110536_a(location).func_110527_b();
/* 50 */       BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charsets.UTF_8));
/* 51 */       ArrayList<String> lines = new ArrayList<>();
/*    */       String line;
/* 53 */       while ((line = reader.readLine()) != null) {
/* 54 */         lines.add(line);
/*    */       }
/* 56 */       return lines;
/* 57 */     } catch (Throwable ignored) {
/* 58 */       return null;
/*    */     } finally {
/* 60 */       if (is != null)
/*    */         try {
/* 62 */           is.close();
/* 63 */         } catch (IOException iOException) {} 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\prefab\ResourceContentProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */