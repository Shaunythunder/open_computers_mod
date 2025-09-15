/*    */ package li.cil.oc.server.command;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.entity.player.EntityPlayerMP;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import net.minecraft.server.management.UserListEntry;
/*    */ import net.minecraft.server.management.UserListOpsEntry;
/*    */ import net.minecraft.util.ChatComponentText;
/*    */ import net.minecraft.util.IChatComponent;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ public final class package$ {
/*    */   public static final package$ MODULE$;
/*    */   
/*    */   public IChatComponent string2text(String s) {
/* 15 */     return (IChatComponent)new ChatComponentText(s);
/*    */   }
/*    */   
/*    */   public int getOpLevel(ICommandSender sender) { boolean bool;
/* 19 */     MinecraftServer srv = MinecraftServer.func_71276_C();
/* 20 */     if (srv.func_71264_H() && ((World)scala.Predef$.MODULE$.refArrayOps((Object[])srv.field_71305_c).head()).func_72912_H().func_76086_u() && 
/* 21 */       srv.func_71214_G().equalsIgnoreCase(sender.func_70005_c_())) {
/* 22 */       return 4;
/*    */     }
/* 24 */     ICommandSender iCommandSender = sender;
/* 25 */     if (iCommandSender instanceof MinecraftServer) { bool = true; }
/* 26 */     else if (iCommandSender instanceof EntityPlayerMP) { EntityPlayerMP entityPlayerMP = (EntityPlayerMP)iCommandSender;
/* 27 */       UserListEntry e = srv.func_71203_ab().func_152603_m().func_152683_b(entityPlayerMP.func_146103_bH());
/* 28 */       bool = (e == null) ? false : ((UserListOpsEntry)e).func_152644_a(); }
/* 29 */     else { bool = false; }
/*    */     
/*    */     return bool; } private package$() {
/* 32 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\command\package$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */