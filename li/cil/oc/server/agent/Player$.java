/*     */ package li.cil.oc.server.agent;
/*     */ 
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import java.util.UUID;
/*     */ import li.cil.oc.api.internal.Agent;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
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
/*     */ public final class Player$
/*     */ {
/*     */   public static final Player$ MODULE$;
/*     */   
/*     */   public GameProfile profileFor(Agent agent) {
/*  59 */     UUID uuid = agent.ownerUUID();
/*  60 */     String randomId = BoxesRunTime.boxToInteger((agent.world()).field_73012_v.nextInt(16777215) + 1).toString();
/*  61 */     String name = li.cil.oc.Settings$.MODULE$.get().nameFormat()
/*  62 */       .replace("$player$", agent.ownerName())
/*  63 */       .replace("$random$", randomId);
/*  64 */     return new GameProfile(uuid, name);
/*     */   }
/*     */   
/*  67 */   public Option<UUID> determineUUID$default$1() { return (Option<UUID>)scala.None$.MODULE$; } public UUID determineUUID(Option playerUUID) {
/*  68 */     String format = li.cil.oc.Settings$.MODULE$.get().uuidFormat();
/*  69 */     UUID randomUUID = UUID.randomUUID();
/*     */     try {
/*     */     
/*     */     } finally {
/*  73 */       Exception exception = null;
/*     */     } 
/*     */   } public final class Player$$anonfun$determineUUID$1 extends AbstractFunction0<UUID> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final UUID randomUUID$1; public final UUID apply() {
/*     */       return this.randomUUID$1;
/*     */     } public Player$$anonfun$determineUUID$1(UUID randomUUID$1) {} }
/*     */   public void updatePositionAndRotation(Player player, ForgeDirection facing, ForgeDirection side) {
/*  80 */     player.facing_$eq(facing);
/*  81 */     player.side_$eq(side);
/*  82 */     Vec3 direction = Vec3.func_72443_a((
/*  83 */         facing.offsetX + side.offsetX), (
/*  84 */         facing.offsetY + side.offsetY), (
/*  85 */         facing.offsetZ + side.offsetZ)).func_72432_b();
/*  86 */     float yaw = (float)Math.toDegrees(-Math.atan2(direction.field_72450_a, direction.field_72449_c));
/*  87 */     float pitch = (float)Math.toDegrees(-Math.atan2(direction.field_72448_b, Math.sqrt(direction.field_72450_a * direction.field_72450_a + direction.field_72449_c * direction.field_72449_c))) * 0.99F;
/*  88 */     player.func_70012_b(player.agent().xPosition(), player.agent().yPosition() - player.field_70129_M, player.agent().zPosition(), yaw, pitch);
/*  89 */     ((Entity)player).field_70127_C = player.field_70125_A;
/*  90 */     ((Entity)player).field_70126_B = player.field_70177_z;
/*     */   } public final void li$cil$oc$server$agent$Player$$setCopyOrNull$1(ItemStack[] inv, IInventory agentInv, int slot) {
/*     */     ItemStack item = agentInv.func_70301_a(slot);
/*     */     inv[slot] = (item == null) ? null : item.func_77946_l();
/*     */   }
/*  95 */   public void setInventoryPlayerItems(Player player) { Agent agent = player.agent();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 104 */     int size = scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(player.field_71071_by.field_70462_a.length), agent.mainInventory().func_70302_i_()); scala.runtime.RichInt$.MODULE$
/* 105 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), size).foreach$mVc$sp((Function1)new Player$$anonfun$setInventoryPlayerItems$1(player, agent)); } public final class Player$$anonfun$setInventoryPlayerItems$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } private final Player player$1; private final Agent agent$1; public Player$$anonfun$setInventoryPlayerItems$1(Player player$1, Agent agent$1) {} public void apply$mcVI$sp(int i) {
/* 106 */       Player$.MODULE$.li$cil$oc$server$agent$Player$$setCopyOrNull$1(this.player$1.field_71071_by.field_70462_a, this.agent$1.mainInventory(), i);
/*     */     } }
/*     */   public final void li$cil$oc$server$agent$Player$$setCopy$1(IInventory inv, int index, ItemStack item) {
/*     */     ItemStack result = (item == null) ? null : item.func_77946_l();
/*     */     ItemStack current = inv.func_70301_a(index);
/*     */     if (!ItemStack.func_77989_b(result, current))
/*     */       inv.func_70299_a(index, result); 
/*     */   }
/* 114 */   public void detectInventoryPlayerChanges(Player player) { player.field_71069_bz.func_75142_b();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     int size = scala.runtime.RichInt$.MODULE$.min$extension(scala.Predef$.MODULE$.intWrapper(player.field_71071_by.field_70462_a.length), player.agent().mainInventory().func_70302_i_()); scala.runtime.RichInt$.MODULE$
/* 124 */       .until$extension0(scala.Predef$.MODULE$.intWrapper(0), size).foreach$mVc$sp((Function1)new Player$$anonfun$detectInventoryPlayerChanges$1(player)); } public final class Player$$anonfun$detectInventoryPlayerChanges$1 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final Player player$2; public final void apply(int i) { apply$mcVI$sp(i); } public Player$$anonfun$detectInventoryPlayerChanges$1(Player player$2) {} public void apply$mcVI$sp(int i) {
/* 125 */       Player$.MODULE$.li$cil$oc$server$agent$Player$$setCopy$1(this.player$2.agent().mainInventory(), i, this.player$2.field_71071_by.field_70462_a[i]);
/*     */     } }
/*     */ 
/*     */   
/*     */   private Player$() {
/* 130 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\agent\Player$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */