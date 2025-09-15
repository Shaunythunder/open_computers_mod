/*    */ package com.typesafe.config.impl;
/*    */ 
/*    */ import com.typesafe.config.Config;
/*    */ import com.typesafe.config.ConfigOrigin;
/*    */ import com.typesafe.config.ConfigValue;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class OpenComputersConfigCommentManipulationHook
/*    */ {
/*    */   public static Config setComments(Config config, String path, List<String> comments) {
/* 15 */     return config.withValue(path, setComments(config.getValue(path), comments));
/*    */   }
/*    */   
/*    */   public static ConfigValue setComments(ConfigValue value, List<String> comments) {
/* 19 */     if (value.origin() instanceof SimpleConfigOrigin && value instanceof AbstractConfigValue) {
/* 20 */       return (ConfigValue)((AbstractConfigValue)value).withOrigin((ConfigOrigin)((SimpleConfigOrigin)value
/* 21 */           .origin()).setComments(comments));
/*    */     }
/*    */     
/* 24 */     return value;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\com\typesafe\config\impl\OpenComputersConfigCommentManipulationHook.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */