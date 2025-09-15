/*    */ package li.cil.oc.common.container;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001y2A!\001\002\001\033\t1A+\0312mKRT!a\001\003\002\023\r|g\016^1j]\026\024(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\005\001q\001CA\b\021\033\005\021\021BA\t\003\005\031\001F.Y=fe\"I1\003\001B\001B\003%A\003I\001\020a2\f\0270\032:J]Z,g\016^8ssB\021QCH\007\002-)\021q\003G\001\007a2\f\0270\032:\013\005eQ\022AB3oi&$\030P\003\002\0349\005IQ.\0338fGJ\fg\r\036\006\002;\005\031a.\032;\n\005}1\"aD%om\026tGo\034:z!2\f\0270\032:\n\005M\001\002\"\003\022\001\005\003\005\013\021B\022*\003\031!\030M\0317fiB\021AeJ\007\002K)\021a\005B\001\005SR,W.\003\002)K\tiA+\0312mKR<&/\0319qKJL!A\013\t\002\035=$\b.\032:J]Z,g\016^8ss\")A\006\001C\001[\0051A(\0338jiz\"2AL\0301!\ty\001\001C\003\024W\001\007A\003C\003#W\001\0071\005C\0033\001\021\0053'A\bdC:Le\016^3sC\016$x+\033;i)\t!$\b\005\0026q5\taGC\0018\003\025\0318-\0317b\023\tIdGA\004C_>dW-\0318\t\013]\t\004\031A\036\021\005Ua\024BA\037\027\0051)e\016^5usBc\027-_3s\001")
/*    */ public class Tablet extends Player {
/*    */   public Tablet(InventoryPlayer playerInventory, TabletWrapper tablet) {
/*  7 */     super(playerInventory, (IInventory)tablet);
/*  8 */     func_75146_a(new StaticComponentSlot(this, otherInventory(), otherInventory().func_70302_i_() - 1, 80, 35, ((TabletWrapper)otherInventory()).containerSlotType(), ((TabletWrapper)otherInventory()).containerSlotTier()));
/*    */     
/* 10 */     addPlayerInventorySlots(8, 84);
/*    */   } public boolean func_75145_c(EntityPlayer player) {
/* 12 */     EntityPlayer entityPlayer = (playerInventory()).field_70458_d; if (player == null) { if (entityPlayer != null); } else if (player.equals(entityPlayer))
/*    */     {  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Tablet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */