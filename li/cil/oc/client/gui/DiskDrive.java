/*    */ package li.cil.oc.client.gui;
/*    */ 
/*    */ import net.minecraft.entity.player.InventoryPlayer;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001!3A!\001\002\001\033\tIA)[:l\tJLg/\032\006\003\007\021\t1aZ;j\025\t)a!\001\004dY&,g\016\036\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011C\001\001\017!\ry\001CE\007\002\005%\021\021C\001\002\024\tft\027-\\5d\017VL7i\0348uC&tWM\035\t\003'ai\021\001\006\006\003+Y\t\021bY8oi\006Lg.\032:\013\005]1\021AB2p[6|g.\003\002\002)!A!\004\001B\001B\003%1$A\bqY\006LXM]%om\026tGo\034:z!\taR%D\001\036\025\tqr$\001\004qY\006LXM\035\006\003A\005\na!\0328uSRL(B\001\022$\003%i\027N\\3de\0064GOC\001%\003\rqW\r^\005\003Mu\021q\"\0238wK:$xN]=QY\006LXM\035\005\tQ\001\021)\031!C\001S\005)AM]5wKV\t!\006\005\002,]5\tAF\003\002.C\005I\021N\034<f]R|'/_\005\003_1\022!\"S%om\026tGo\034:z\021!\t\004A!A!\002\023Q\023A\0023sSZ,\007\005C\0034\001\021\005A'\001\004=S:LGO\020\013\004kY:\004CA\b\001\021\025Q\"\0071\001\034\021\025A#\0071\001+\021\025I\004\001\"\021;\003q!'/Y<TK\016|g\016Z1ss\032{'/Z4s_VtG\rT1zKJ$2aO!G!\tat(D\001>\025\005q\024!B:dC2\f\027B\001!>\005\021)f.\033;\t\013\tC\004\031A\"\002\r5|Wo]3Y!\taD)\003\002F{\t\031\021J\034;\t\013\035C\004\031A\"\002\r5|Wo]3Z\001")
/*    */ public class DiskDrive extends DynamicGuiContainer<DiskDrive> {
/*  8 */   public IInventory drive() { return this.drive; } private final IInventory drive; public DiskDrive(InventoryPlayer playerInventory, IInventory drive) { super(new DiskDrive(playerInventory, drive)); }
/*    */    public void drawSecondaryForegroundLayer(int mouseX, int mouseY) {
/* 10 */     super.drawSecondaryForegroundLayer(mouseX, mouseY);
/* 11 */     this.field_146289_q.func_78276_b(
/* 12 */         Localization$.MODULE$.localizeImmediately(drive().func_145825_b()), 
/* 13 */         8, 6, 4210752);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\DiskDrive.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */