/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.api.Items;
/*    */ import net.minecraft.block.Block;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Serializable;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001};Q!\001\002\t\0025\t\021$\0228wSJ|g.\\3oiB\023xN^5eKJ\024En\\2lg*\0211\001B\001\016_B,gnY8naV$XM]:\013\005\0251\021aC5oi\026<'/\031;j_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005e)eN^5s_:lWM\034;Qe>4\030\016Z3s\0052|7m[:\024\007=\021\"\004\005\002\02415\tAC\003\002\026-\005!A.\0318h\025\0059\022\001\0026bm\006L!!\007\013\003\r=\023'.Z2u!\tY\002%D\001\035\025\tib$\001\004ee&4XM\035\006\003?\031\t1!\0319j\023\t\tCDA\nF]ZL'o\0348nK:$\bK]8wS\022,'\017C\003$\037\021\005A%\001\004=S:LGO\020\013\002\033!)ae\004C!O\005qq-\032;F]ZL'o\0348nK:$HC\001\025?a\tIS\007E\002+aMr!a\013\030\016\0031R\021!L\001\006g\016\fG.Y\005\003_1\na\001\025:fI\0264\027BA\0313\005\025\031E.Y:t\025\tyC\006\005\0025k1\001A!\003\034&\003\003\005\tQ!\0018\005\ryF%M\t\003qm\002\"aK\035\n\005ib#a\002(pi\"Lgn\032\t\003WqJ!!\020\027\003\007\005s\027\020C\003@K\001\007\001)A\003ti\006\0347\016\005\002B\0216\t!I\003\002D\t\006!\021\016^3n\025\t)e)A\005nS:,7M]1gi*\tq)A\002oKRL!!\023\"\003\023%#X-\\*uC\016\\\007\"B&\020\t\023a\025aB5t\037:,wJ\032\013\004\033B;\006CA\026O\023\tyEFA\004C_>dW-\0318\t\013ES\005\031\001*\002\013\tdwnY6\021\005M+V\"\001+\013\005E#\025B\001,U\005\025\021En\\2l\021\025A&\n1\001Z\003\025q\027-\\3t!\rY#\fX\005\00372\022!\002\020:fa\026\fG/\0323?!\tQS,\003\002_e\t11\013\036:j]\036\004")
/*    */ public final class EnvironmentProviderBlocks
/*    */ {
/*    */   public static Class<?> getEnvironment(ItemStack paramItemStack) {
/*    */     return EnvironmentProviderBlocks$.MODULE$.getEnvironment(paramItemStack);
/*    */   }
/*    */   
/*    */   public final class EnvironmentProviderBlocks$$anonfun$isOneOf$1
/*    */     extends AbstractFunction1<String, Object>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Block block$1;
/*    */     
/*    */     public final boolean apply(String x$1) {
/* 41 */       Block block = this.block$1; if (Items.get(x$1).block() == null) { Items.get(x$1).block(); if (block != null); } else if (Items.get(x$1).block().equals(block))
/*    */       {  }
/*    */     
/*    */     }
/*    */     
/*    */     public EnvironmentProviderBlocks$$anonfun$isOneOf$1(Block block$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\EnvironmentProviderBlocks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */