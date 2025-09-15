/*    */ package li.cil.oc.client.gui;
/*    */ 
/*    */ import li.cil.oc.client.gui.traits.LockedHotbar;
/*    */ import net.minecraft.inventory.Slot;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001Y3A!\001\002\001\033\t1A+\0312mKRT!a\001\003\002\007\035,\030N\003\002\006\r\00511\r\\5f]RT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001a\"\007\t\004\037A\021R\"\001\002\n\005E\021!a\005#z]\006l\027nY$vS\016{g\016^1j]\026\024\bCA\n\031\033\005!\"BA\013\027\003%\031wN\034;bS:,'O\003\002\030\r\00511m\\7n_:L!!\001\013\021\005iiR\"A\016\013\005q\021\021A\002;sC&$8/\003\002\0377\taAj\\2lK\022Du\016\0362be\"A\001\005\001B\001B\003%\021%A\bqY\006LXM]%om\026tGo\034:z!\t\0213&D\001$\025\t!S%\001\004qY\006LXM\035\006\003M\035\na!\0328uSRL(B\001\025*\003%i\027N\\3de\0064GOC\001+\003\rqW\r^\005\003Y\r\022q\"\0238wK:$xN]=QY\006LXM\035\005\t]\001\021)\031!C\001_\0051A/\0312mKR,\022\001\r\t\003cQj\021A\r\006\003gY\tA!\033;f[&\021QG\r\002\016)\006\024G.\032;Xe\006\004\b/\032:\t\021]\002!\021!Q\001\nA\nq\001^1cY\026$\b\005C\003:\001\021\005!(\001\004=S:LGO\020\013\004wqj\004CA\b\001\021\025\001\003\b1\001\"\021\025q\003\b1\0011\021\025y\004\001\"\021A\003-awnY6fIN#\030mY6\026\003\005\003\"A\021#\016\003\rS!aM\024\n\005\025\033%!C%uK6\034F/Y2l\021\0259\005\001\"\021I\003q!'/Y<TK\016|g\016Z1ss\032{'/Z4s_VtG\rT1zKJ$2!S(U!\tQU*D\001L\025\005a\025!B:dC2\f\027B\001(L\005\021)f.\033;\t\013A3\005\031A)\002\r5|Wo]3Y!\tQ%+\003\002T\027\n\031\021J\034;\t\013U3\005\031A)\002\r5|Wo]3Z\001")
/*    */ public class Tablet extends DynamicGuiContainer<Tablet> implements LockedHotbar {
/*  8 */   public void func_146984_a(Slot slot, int slotNumber, int button, int shift) { LockedHotbar.class.handleMouseClick(this, slot, slotNumber, button, shift); } private final TabletWrapper tablet; public boolean func_146983_a(int keyCode) { return LockedHotbar.class.checkHotbarKeys(this, keyCode); } public TabletWrapper tablet() { return this.tablet; } public Tablet(InventoryPlayer playerInventory, TabletWrapper tablet) { super(new Tablet(playerInventory, tablet)); LockedHotbar.class.$init$(this); } public ItemStack lockedStack() {
/*  9 */     return tablet().stack();
/*    */   }
/*    */   public void drawSecondaryForegroundLayer(int mouseX, int mouseY) {
/* 12 */     super.drawSecondaryForegroundLayer(mouseX, mouseY);
/* 13 */     this.field_146289_q.func_78276_b(
/* 14 */         Localization$.MODULE$.localizeImmediately(tablet().func_145825_b()), 
/* 15 */         8, 6, 4210752);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Tablet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */