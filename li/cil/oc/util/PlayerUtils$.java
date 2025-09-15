/*    */ package li.cil.oc.util;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.util.AxisAlignedBB;
/*    */ 
/*    */ public final class PlayerUtils$ {
/*    */   public NBTTagCompound persistedData(EntityPlayer player) {
/*  8 */     NBTTagCompound nbt = player.getEntityData();
/*  9 */     if (!nbt.func_74764_b("PlayerPersisted")) {
/* 10 */       nbt.func_74782_a("PlayerPersisted", (NBTBase)new NBTTagCompound());
/*    */     }
/* 12 */     return nbt.func_74775_l("PlayerPersisted");
/*    */   } public static final PlayerUtils$ MODULE$;
/*    */   public double spawnParticleAround$default$3() {
/* 15 */     return 1.0D; } public void spawnParticleAround(EntityPlayer player, String effectName, double chance) {
/* 16 */     Random rng = (player.func_130014_f_()).field_73012_v;
/* 17 */     if (chance >= true || rng.nextDouble() < chance) {
/* 18 */       AxisAlignedBB bounds = player.field_70121_D;
/* 19 */       double x = bounds.field_72340_a + (bounds.field_72336_d - bounds.field_72340_a) * rng.nextDouble() * 1.5D;
/* 20 */       double y = bounds.field_72338_b + (bounds.field_72337_e - bounds.field_72338_b) * rng.nextDouble() * 0.5D;
/* 21 */       double z = bounds.field_72339_c + (bounds.field_72334_f - bounds.field_72339_c) * rng.nextDouble() * 1.5D;
/* 22 */       player.func_130014_f_().func_72869_a(effectName, x, y, z, 0.0D, 0.0D, 0.0D);
/*    */     } 
/*    */   } private PlayerUtils$() {
/* 25 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\PlayerUtils$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */