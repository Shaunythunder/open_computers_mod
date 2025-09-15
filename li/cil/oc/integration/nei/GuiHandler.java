/*    */ package li.cil.oc.integration.nei;
/*    */ import li.cil.oc.client.gui.Database;
/*    */ import net.minecraft.client.gui.inventory.GuiContainer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.collection.immutable.Range;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001U3A!\001\002\001\033\tQq)^5IC:$G.\032:\013\005\r!\021a\0018fS*\021QAB\001\fS:$Xm\032:bi&|gN\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031\"\001\001\b\021\005=)R\"\001\t\013\005E\021\022aA1qS*\0211a\005\006\002)\005Y1m\0343fG\"L7m[3o\023\t1\002C\001\bJ\035\026Ku)^5BI\006\004H/\032:\t\013a\001A\021A\r\002\rqJg.\033;?)\005Q\002CA\016\001\033\005\021\001\"B\017\001\t\023q\022aB4fiNcw\016\036\013\005?!\022D\007E\002!G\025j\021!\t\006\002E\005)1oY1mC&\021A%\t\002\007\037B$\030n\0348\021\005\0012\023BA\024\"\005\rIe\016\036\005\006Sq\001\rAK\001\003I\n\004\"a\013\031\016\0031R!!\f\030\002\007\035,\030N\003\0020\r\00511\r\\5f]RL!!\r\027\003\021\021\013G/\0312bg\026DQa\r\017A\002\025\na!\\8vg\026D\b\"B\033\035\001\004)\023AB7pkN,\027\020C\0038\001\021\005\003(A\biC:$G.\032#sC\036tEI]8q)\031ID(\023&L'B\021\001EO\005\003w\005\022qAQ8pY\026\fg\016C\003.m\001\007Q\b\005\002?\0176\tqH\003\002A\003\006I\021N\034<f]R|'/\037\006\003[\tS!aL\"\013\005\021+\025!C7j]\026\034'/\0314u\025\0051\025a\0018fi&\021\001j\020\002\r\017VL7i\0348uC&tWM\035\005\006gY\002\r!\n\005\006kY\002\r!\n\005\006\031Z\002\r!T\001\rIJ\fwmZ3e'R\f7m\033\t\003\035Fk\021a\024\006\003!\016\013A!\033;f[&\021!k\024\002\n\023R,Wn\025;bG.DQ\001\026\034A\002\025\naAY;ui>t\007")
/*    */ public class GuiHandler extends INEIGuiAdapter {
/*    */   private Option<Object> getSlot(Database db, int mousex, int mousey) {
/* 11 */     int slotSize = 18;
/* 12 */     (new int[3])[0] = 3; (new int[3])[1] = 2; (new int[3])[2] = 0; int offset = 8 + (new int[3])[db.databaseInventory().tier()] * slotSize;
/* 13 */     int row = (mousey - offset - db.field_147009_r) / slotSize;
/* 14 */     int column = (mousex - offset - db.field_147003_i) / slotSize;
/* 15 */     int size = (int)RichDouble$.MODULE$.ceil$extension(Predef$.MODULE$.doubleWrapper(package$.MODULE$.sqrt(db.databaseInventory().func_70302_i_())));
/* 16 */     Range validSlots = RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), size);
/* 17 */     return (validSlots.contains(row) && validSlots.contains(column)) ? 
/* 18 */       Option$.MODULE$.apply(BoxesRunTime.boxToInteger(row * size + column)) : 
/*    */       
/* 20 */       (Option<Object>)None$.MODULE$;
/*    */   } public boolean handleDragNDrop(GuiContainer gui, int mousex, int mousey, ItemStack draggedStack, int button) {
/*    */     boolean bool;
/* 23 */     GuiContainer guiContainer = gui;
/* 24 */     if (guiContainer instanceof Database) { boolean bool1; Database database = (Database)guiContainer;
/* 25 */       Option<Object> option = getSlot(database, mousex, mousey);
/* 26 */       if (option instanceof Some) { Some some = (Some)option; int slot = BoxesRunTime.unboxToInt(some.x());
/* 27 */         ItemStack stack = draggedStack.func_77946_l();
/* 28 */         stack.field_77994_a = 1;
/* 29 */         PacketSender$.MODULE$.sendDatabaseSetSlot(slot, stack);
/* 30 */         bool1 = true; }
/* 31 */       else { bool1 = false; }
/*    */        bool = bool1; }
/* 33 */     else { bool = super.handleDragNDrop(gui, mousex, mousey, draggedStack, button); }
/*    */     
/*    */     return bool;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\nei\GuiHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */