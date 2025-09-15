/*    */ package li.cil.oc.common.container;
/*    */ 
/*    */ import li.cil.oc.common.InventorySlots;
/*    */ import li.cil.oc.common.InventorySlots$;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0313A!\001\002\001\033\t!1)Y:f\025\t\031A!A\005d_:$\030-\0338fe*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001a\005\002\001\035A\021q\002E\007\002\005%\021\021C\001\002\007!2\f\0270\032:\t\023M\001!\021!Q\001\nQ\001\023a\0049mCf,'/\0238wK:$xN]=\021\005UqR\"\001\f\013\005]A\022A\0029mCf,'O\003\002\0325\0051QM\034;jifT!a\007\017\002\0235Lg.Z2sC\032$(\"A\017\002\0079,G/\003\002 -\ty\021J\034<f]R|'/\037)mCf,'/\003\002\024!!I!\005\001B\001B\003%1\005K\001\tG>l\007/\036;feB\021AeJ\007\002K)\021a\005B\001\013i&dW-\0328uSRL\030BA\001&\023\tI\003#\001\bpi\",'/\0238wK:$xN]=\t\013-\002A\021\001\027\002\rqJg.\033;?)\ricf\f\t\003\037\001AQa\005\026A\002QAQA\t\026A\002\rBQ!\r\001\005BI\nqbY1o\023:$XM]1di^KG\017\033\013\003ge\002\"\001N\034\016\003UR\021AN\001\006g\016\fG.Y\005\003qU\022qAQ8pY\026\fg\016C\003\030a\001\007!\b\005\002\026w%\021AH\006\002\r\013:$\030\016^=QY\006LXM\035\005\f}\001\001\n1!A\001\n\023y\004&\001\013tkB,'\017J8uQ\026\024\030J\034<f]R|'/_\013\002\001B\021\021\tR\007\002\005*\0211IG\001\nS:4XM\034;pefL!!\022\"\003\025%KeN^3oi>\024\030\020")
/*    */ public class Case extends Player {
/*  9 */   public Case(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Case computer) { super(playerInventory, (IInventory)computer); RichInt$.MODULE$
/* 10 */       .to$extension0(Predef$.MODULE$.intWrapper(0), (((li.cil.oc.common.tileentity.Case)otherInventory()).tier() >= 2) ? 2 : 1).foreach$mVc$sp((Function1)new Case$$anonfun$1(this)); RichInt$.MODULE$
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 15 */       .to$extension0(Predef$.MODULE$.intWrapper(0), (((li.cil.oc.common.tileentity.Case)otherInventory()).tier() == 0) ? 0 : 1).foreach$mVc$sp((Function1)new Case$$anonfun$2(this)); RichInt$.MODULE$
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 20 */       .to$extension0(Predef$.MODULE$.intWrapper(0), (((li.cil.oc.common.tileentity.Case)otherInventory()).tier() == 0) ? 0 : 1).foreach$mVc$sp((Function1)new Case$$anonfun$3(this));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     if (((li.cil.oc.common.tileentity.Case)otherInventory()).tier() >= 2) {
/* 26 */       InventorySlots.InventorySlot inventorySlot = InventorySlots$.MODULE$.computer()[((li.cil.oc.common.tileentity.Case)otherInventory()).tier()][func_75138_a().size()];
/* 27 */       addSlotToContainer(142, 16 + 2 * slotSize(), inventorySlot.slot(), inventorySlot.tier());
/*    */     } 
/*    */ 
/*    */     
/* 31 */     InventorySlots.InventorySlot slot = InventorySlots$.MODULE$.computer()[((li.cil.oc.common.tileentity.Case)otherInventory()).tier()][func_75138_a().size()];
/* 32 */     addSlotToContainer(120, 16, slot.slot(), slot.tier());
/*    */ 
/*    */     
/* 35 */     if (((li.cil.oc.common.tileentity.Case)otherInventory()).tier() == 0) {
/* 36 */       InventorySlots.InventorySlot inventorySlot = InventorySlots$.MODULE$.computer()[((li.cil.oc.common.tileentity.Case)otherInventory()).tier()][func_75138_a().size()];
/* 37 */       addSlotToContainer(120, 16 + 2 * slotSize(), inventorySlot.slot(), inventorySlot.tier());
/*    */     } 
/*    */ 
/*    */     
/* 41 */     InventorySlots.InventorySlot inventorySlot1 = InventorySlots$.MODULE$.computer()[((li.cil.oc.common.tileentity.Case)otherInventory()).tier()][func_75138_a().size()];
/* 42 */     addSlotToContainer(48, 34, inventorySlot1.slot(), inventorySlot1.tier());
/*    */ 
/*    */ 
/*    */     
/* 46 */     addPlayerInventorySlots(8, 84); }
/*    */   
/*    */   public boolean func_75145_c(EntityPlayer player) {
/* 49 */     return (super.func_75145_c(player) && ((li.cil.oc.common.tileentity.Case)otherInventory()).canInteract(player.func_70005_c_()));
/*    */   }
/*    */   
/*    */   public final class Case$$anonfun$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(int i) {
/*    */       apply$mcVI$sp(i);
/*    */     }
/*    */     
/*    */     public Case$$anonfun$1(Case $outer) {}
/*    */     
/*    */     public void apply$mcVI$sp(int i) {
/*    */       InventorySlots.InventorySlot slot = InventorySlots$.MODULE$.computer()[((li.cil.oc.common.tileentity.Case)this.$outer.li$cil$oc$common$container$Case$$super$otherInventory()).tier()][this.$outer.func_75138_a().size()];
/*    */       this.$outer.addSlotToContainer(98, 16 + i * this.$outer.slotSize(), slot.slot(), slot.tier());
/*    */     }
/*    */   }
/*    */   
/*    */   public final class Case$$anonfun$2 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(int i) {
/*    */       apply$mcVI$sp(i);
/*    */     }
/*    */     
/*    */     public Case$$anonfun$2(Case $outer) {}
/*    */     
/*    */     public void apply$mcVI$sp(int i) {
/*    */       InventorySlots.InventorySlot slot = InventorySlots$.MODULE$.computer()[((li.cil.oc.common.tileentity.Case)this.$outer.li$cil$oc$common$container$Case$$super$otherInventory()).tier()][this.$outer.func_75138_a().size()];
/*    */       this.$outer.addSlotToContainer(120, 16 + (i + 1) * this.$outer.slotSize(), slot.slot(), slot.tier());
/*    */     }
/*    */   }
/*    */   
/*    */   public final class Case$$anonfun$3 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(int i) {
/*    */       apply$mcVI$sp(i);
/*    */     }
/*    */     
/*    */     public Case$$anonfun$3(Case $outer) {}
/*    */     
/*    */     public void apply$mcVI$sp(int i) {
/*    */       InventorySlots.InventorySlot slot = InventorySlots$.MODULE$.computer()[((li.cil.oc.common.tileentity.Case)this.$outer.li$cil$oc$common$container$Case$$super$otherInventory()).tier()][this.$outer.func_75138_a().size()];
/*    */       this.$outer.addSlotToContainer(142, 16 + i * this.$outer.slotSize(), slot.slot(), slot.tier());
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Case.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */