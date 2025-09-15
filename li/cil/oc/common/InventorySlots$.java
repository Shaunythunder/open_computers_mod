/*     */ package li.cil.oc.common;
/*     */ public final class InventorySlots$ {
/*     */   public InventorySlots.InventorySlot[][] computer() {
/*   4 */     return this.computer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final InventorySlots$ MODULE$;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final InventorySlots.InventorySlot[][] computer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final InventorySlots.InventorySlot[][] server;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final InventorySlots.InventorySlot[] relay;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final InventorySlots.InventorySlot[] switch;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InventorySlots.InventorySlot[][] server() {
/*  53 */     return this.server;
/*     */   }
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
/*     */   public InventorySlots.InventorySlot[] relay() {
/* 123 */     return this.relay;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InventorySlots.InventorySlot[] switch() {
/* 130 */     return this.switch;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private InventorySlots$() {
/* 138 */     MODULE$ = this;
/*     */     (new InventorySlots.InventorySlot[7])[0] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 0);
/*     */     (new InventorySlots.InventorySlot[7])[1] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 0);
/*     */     (new InventorySlots.InventorySlot[7])[2] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 0);
/*     */     (new InventorySlots.InventorySlot[7])[3] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 0);
/*     */     (new InventorySlots.InventorySlot[7])[4] = new InventorySlots.InventorySlot(Slot$.MODULE$.CPU(), 0);
/*     */     (new InventorySlots.InventorySlot[7])[5] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 0);
/*     */     (new InventorySlots.InventorySlot[7])[6] = new InventorySlots.InventorySlot(Slot$.MODULE$.EEPROM(), 2147483647);
/*     */     (new InventorySlots.InventorySlot[4][])[0] = new InventorySlots.InventorySlot[7];
/*     */     (new InventorySlots.InventorySlot[8])[0] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 1);
/*     */     (new InventorySlots.InventorySlot[8])[1] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 0);
/*     */     (new InventorySlots.InventorySlot[8])[2] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 1);
/*     */     (new InventorySlots.InventorySlot[8])[3] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 1);
/*     */     (new InventorySlots.InventorySlot[8])[4] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 1);
/*     */     (new InventorySlots.InventorySlot[8])[5] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 0);
/*     */     (new InventorySlots.InventorySlot[8])[6] = new InventorySlots.InventorySlot(Slot$.MODULE$.CPU(), 1);
/*     */     (new InventorySlots.InventorySlot[8])[7] = new InventorySlots.InventorySlot(Slot$.MODULE$.EEPROM(), 2147483647);
/*     */     (new InventorySlots.InventorySlot[4][])[1] = new InventorySlots.InventorySlot[8];
/*     */     (new InventorySlots.InventorySlot[10])[0] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[1] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 1);
/*     */     (new InventorySlots.InventorySlot[10])[2] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 1);
/*     */     (new InventorySlots.InventorySlot[10])[3] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[4] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[5] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[6] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 1);
/*     */     (new InventorySlots.InventorySlot[10])[7] = new InventorySlots.InventorySlot(Slot$.MODULE$.Floppy(), 0);
/*     */     (new InventorySlots.InventorySlot[10])[8] = new InventorySlots.InventorySlot(Slot$.MODULE$.CPU(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[9] = new InventorySlots.InventorySlot(Slot$.MODULE$.EEPROM(), 2147483647);
/*     */     (new InventorySlots.InventorySlot[4][])[2] = new InventorySlots.InventorySlot[10];
/*     */     (new InventorySlots.InventorySlot[10])[0] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[1] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[2] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[3] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[4] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[5] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[6] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[7] = new InventorySlots.InventorySlot(Slot$.MODULE$.Floppy(), 0);
/*     */     (new InventorySlots.InventorySlot[10])[8] = new InventorySlots.InventorySlot(Slot$.MODULE$.CPU(), 2);
/*     */     (new InventorySlots.InventorySlot[10])[9] = new InventorySlots.InventorySlot(Slot$.MODULE$.EEPROM(), 2147483647);
/*     */     (new InventorySlots.InventorySlot[4][])[3] = new InventorySlots.InventorySlot[10];
/*     */     this.computer = new InventorySlots.InventorySlot[4][];
/*     */     (new InventorySlots.InventorySlot[9])[0] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 1);
/*     */     (new InventorySlots.InventorySlot[9])[1] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 1);
/*     */     (new InventorySlots.InventorySlot[9])[2] = new InventorySlots.InventorySlot(Slot$.MODULE$.CPU(), 1);
/*     */     (new InventorySlots.InventorySlot[9])[3] = new InventorySlots.InventorySlot(Slot$.MODULE$.ComponentBus(), 1);
/*     */     (new InventorySlots.InventorySlot[9])[4] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 1);
/*     */     (new InventorySlots.InventorySlot[9])[5] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 1);
/*     */     (new InventorySlots.InventorySlot[9])[6] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 1);
/*     */     (new InventorySlots.InventorySlot[9])[7] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 1);
/*     */     (new InventorySlots.InventorySlot[9])[8] = new InventorySlots.InventorySlot(Slot$.MODULE$.EEPROM(), 2147483647);
/*     */     (new InventorySlots.InventorySlot[4][])[0] = new InventorySlots.InventorySlot[9];
/*     */     (new InventorySlots.InventorySlot[13])[0] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 2);
/*     */     (new InventorySlots.InventorySlot[13])[1] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 1);
/*     */     (new InventorySlots.InventorySlot[13])[2] = new InventorySlots.InventorySlot(Slot$.MODULE$.CPU(), 2);
/*     */     (new InventorySlots.InventorySlot[13])[3] = new InventorySlots.InventorySlot(Slot$.MODULE$.ComponentBus(), 2);
/*     */     (new InventorySlots.InventorySlot[13])[4] = new InventorySlots.InventorySlot(Slot$.MODULE$.ComponentBus(), 2);
/*     */     (new InventorySlots.InventorySlot[13])[5] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[13])[6] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[13])[7] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[13])[8] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[13])[9] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[13])[10] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[13])[11] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 1);
/*     */     (new InventorySlots.InventorySlot[13])[12] = new InventorySlots.InventorySlot(Slot$.MODULE$.EEPROM(), 2147483647);
/*     */     (new InventorySlots.InventorySlot[4][])[1] = new InventorySlots.InventorySlot[13];
/*     */     (new InventorySlots.InventorySlot[17])[0] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[1] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[2] = new InventorySlots.InventorySlot(Slot$.MODULE$.CPU(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[3] = new InventorySlots.InventorySlot(Slot$.MODULE$.ComponentBus(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[4] = new InventorySlots.InventorySlot(Slot$.MODULE$.ComponentBus(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[5] = new InventorySlots.InventorySlot(Slot$.MODULE$.ComponentBus(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[6] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[7] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[8] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[9] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[10] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[11] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[12] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[13] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[14] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 1);
/*     */     (new InventorySlots.InventorySlot[17])[15] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 1);
/*     */     (new InventorySlots.InventorySlot[17])[16] = new InventorySlots.InventorySlot(Slot$.MODULE$.EEPROM(), 2147483647);
/*     */     (new InventorySlots.InventorySlot[4][])[2] = new InventorySlots.InventorySlot[17];
/*     */     (new InventorySlots.InventorySlot[17])[0] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[1] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[2] = new InventorySlots.InventorySlot(Slot$.MODULE$.CPU(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[3] = new InventorySlots.InventorySlot(Slot$.MODULE$.ComponentBus(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[4] = new InventorySlots.InventorySlot(Slot$.MODULE$.ComponentBus(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[5] = new InventorySlots.InventorySlot(Slot$.MODULE$.ComponentBus(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[6] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[7] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[8] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[9] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[10] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[11] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[12] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[13] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[14] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[15] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 2);
/*     */     (new InventorySlots.InventorySlot[17])[16] = new InventorySlots.InventorySlot(Slot$.MODULE$.EEPROM(), 2147483647);
/*     */     (new InventorySlots.InventorySlot[4][])[3] = new InventorySlots.InventorySlot[17];
/*     */     this.server = new InventorySlots.InventorySlot[4][];
/*     */     (new InventorySlots.InventorySlot[4])[0] = new InventorySlots.InventorySlot(Slot$.MODULE$.CPU(), 2);
/*     */     (new InventorySlots.InventorySlot[4])[1] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[4])[2] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     (new InventorySlots.InventorySlot[4])[3] = new InventorySlots.InventorySlot(Slot$.MODULE$.Card(), 2);
/*     */     this.relay = new InventorySlots.InventorySlot[4];
/*     */     (new InventorySlots.InventorySlot[3])[0] = new InventorySlots.InventorySlot(Slot$.MODULE$.CPU(), 2);
/*     */     (new InventorySlots.InventorySlot[3])[1] = new InventorySlots.InventorySlot(Slot$.MODULE$.Memory(), 2);
/*     */     (new InventorySlots.InventorySlot[3])[2] = new InventorySlots.InventorySlot(Slot$.MODULE$.HDD(), 2);
/*     */     this.switch = new InventorySlots.InventorySlot[3];
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\InventorySlots$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */