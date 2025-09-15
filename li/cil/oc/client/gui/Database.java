/*    */ package li.cil.oc.client.gui;
/*    */ 
/*    */ import li.cil.oc.client.Textures$;
/*    */ import li.cil.oc.client.gui.traits.LockedHotbar;
/*    */ import li.cil.oc.common.inventory.DatabaseInventory;
/*    */ import net.minecraft.inventory.Slot;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0054A!\001\002\001\033\tAA)\031;bE\006\034XM\003\002\004\t\005\031q-^5\013\005\0251\021AB2mS\026tGO\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\0312\001\001\b\032!\ry\001CE\007\002\005%\021\021C\001\002\024\tft\027-\\5d\017VL7i\0348uC&tWM\035\t\003'ai\021\001\006\006\003+Y\t\021bY8oi\006Lg.\032:\013\005]1\021AB2p[6|g.\003\002\002)A\021!$H\007\0027)\021ADA\001\007iJ\f\027\016^:\n\005yY\"\001\004'pG.,G\rS8uE\006\024\b\002\003\021\001\005\003\005\013\021B\021\002\037Ad\027-_3s\023:4XM\034;pef\004\"AI\026\016\003\rR!\001J\023\002\rAd\027-_3s\025\t1s%\001\004f]RLG/\037\006\003Q%\n\021\"\\5oK\016\024\030M\032;\013\003)\n1A\\3u\023\ta3EA\bJ]Z,g\016^8ssBc\027-_3s\021!q\003A!b\001\n\003y\023!\0053bi\006\024\027m]3J]Z,g\016^8ssV\t\001\007\005\0022i5\t!G\003\0024-\005I\021N\034<f]R|'/_\005\003kI\022\021\003R1uC\n\f7/Z%om\026tGo\034:z\021!9\004A!A!\002\023\001\024A\0053bi\006\024\027m]3J]Z,g\016^8ss\002BQ!\017\001\005\002i\na\001P5oSRtDcA\036={A\021q\002\001\005\006Aa\002\r!\t\005\006]a\002\r\001\r\005\006\001!\t\005Q\001\fY>\0347.\0323Ti\006\0347.F\001B!\t\021U)D\001D\025\t!u%\001\003ji\026l\027B\001$D\005%IE/Z7Ti\006\0347\016C\003I\001\021\005\023*\001\017ee\006<8+Z2p]\022\f'/\037$pe\026<'o\\;oI2\013\0270\032:\025\007)\003V\013\005\002L\0356\tAJC\001N\003\025\0318-\0317b\023\tyEJ\001\003V]&$\b\"B)H\001\004\021\026AB7pkN,\007\f\005\002L'&\021A\013\024\002\004\023:$\b\"\002,H\001\004\021\026AB7pkN,\027\fC\003Y\001\021E\023,A\020ee\006<x)^5D_:$\030-\0338fe\n\0137m[4s_VtG\rT1zKJ$BA\023.`A\")1l\026a\0019\006\021A\r\036\t\003\027vK!A\030'\003\013\031cw.\031;\t\013E;\006\031\001*\t\013Y;\006\031\001*")
/*    */ public class Database extends DynamicGuiContainer<Database> implements LockedHotbar {
/* 10 */   public void func_146984_a(Slot slot, int slotNumber, int button, int shift) { LockedHotbar.class.handleMouseClick(this, slot, slotNumber, button, shift); } private final DatabaseInventory databaseInventory; public boolean func_146983_a(int keyCode) { return LockedHotbar.class.checkHotbarKeys(this, keyCode); } public DatabaseInventory databaseInventory() { return this.databaseInventory; } public Database(InventoryPlayer playerInventory, DatabaseInventory databaseInventory) { super(new Database(playerInventory, databaseInventory)); LockedHotbar.class.$init$(this);
/* 11 */     this.field_147000_g = 256; }
/*    */    public ItemStack lockedStack() {
/* 13 */     return databaseInventory().container();
/*    */   }
/*    */   public void drawSecondaryForegroundLayer(int mouseX, int mouseY) {}
/*    */   
/*    */   public void func_146976_a(float dt, int mouseX, int mouseY) {
/* 18 */     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 19 */     this.field_146297_k.field_71446_o.func_110577_a(Textures$.MODULE$.guiDatabase());
/* 20 */     func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
/*    */     
/* 22 */     if (databaseInventory().tier() > 0) {
/* 23 */       this.field_146297_k.field_71446_o.func_110577_a(Textures$.MODULE$.guiDatabase1());
/* 24 */       func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
/*    */     } 
/*    */     
/* 27 */     if (databaseInventory().tier() > 1) {
/* 28 */       this.field_146297_k.field_71446_o.func_110577_a(Textures$.MODULE$.guiDatabase2());
/* 29 */       func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Database.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */