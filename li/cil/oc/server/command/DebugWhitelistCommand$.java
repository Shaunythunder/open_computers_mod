/*    */ package li.cil.oc.server.command;
/*    */ import li.cil.oc.Settings;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import scala.Product;
/*    */ 
/*    */ public final class DebugWhitelistCommand$ extends SimpleCommand {
/*    */   private DebugWhitelistCommand$() {
/*  8 */     super("oc_debugWhitelist"); MODULE$ = this;
/*    */   }
/*    */   public static final DebugWhitelistCommand$ MODULE$;
/*    */   
/*    */   public int func_82362_a() {
/* 13 */     return 0; } public boolean isOp(ICommandSender sender) {
/* 14 */     return (package$.MODULE$.getOpLevel(sender) >= 2);
/*    */   }
/*    */   public String func_71518_a(ICommandSender sender) {
/* 17 */     return isOp(sender) ? (new StringBuilder()).append(name()).append(" [revoke|add|remove] <player> OR ").append(name()).append(" [revoke|list]").toString() : (
/* 18 */       new StringBuilder()).append(name()).append(" revoke").toString();
/*    */   }
/*    */   public void func_71515_b(ICommandSender sender, String[] args) {
/* 21 */     Product product = li.cil.oc.Settings$.MODULE$.get().debugCardAccess();
/* 22 */     if (product instanceof Settings.DebugCardAccess.Whitelist) { Settings.DebugCardAccess.Whitelist whitelist1 = (Settings.DebugCardAccess.Whitelist)product, whitelist2 = whitelist1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       Settings.DebugCardAccess.Whitelist wl = whitelist2;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 33 */       String[] arrayOfString = args;
/* 34 */       Option option = scala.Array$.MODULE$.unapplySeq(arrayOfString); }
/*    */     
/*    */     throw new WrongUsageException("§cDebug card whitelisting is not enabled.", new Object[0]);
/*    */   }
/*    */   
/*    */   private final void revokeUser$1(String player, ICommandSender sender$1, Settings.DebugCardAccess.Whitelist wl$1) {
/*    */     if (wl$1.isWhitelisted(player)) {
/*    */       wl$1.invalidate(player);
/*    */       sender$1.func_145747_a(package$.MODULE$.string2text("§aAll your debug cards were invalidated."));
/*    */     } else {
/*    */       sender$1.func_145747_a(package$.MODULE$.string2text("§cYou are not whitelisted to use debug card."));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\DebugWhitelistCommand$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */