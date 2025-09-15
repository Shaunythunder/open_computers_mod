/*    */ package li.cil.oc.server.component.traits;
/*    */ 
/*    */ import li.cil.oc.api.machine.Arguments;
/*    */ import li.cil.oc.api.machine.Context;
/*    */ import li.cil.oc.util.InventoryUtils$;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.item.ItemStack;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001=4q!\001\002\021\002\007\005qB\001\rJ]Z,g\016^8ss^{'\017\0343D_:$(o\0347NWJR!a\001\003\002\rQ\024\030-\033;t\025\t)a!A\005d_6\004xN\\3oi*\021q\001C\001\007g\026\024h/\032:\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001aE\003\001!YQR\004\005\002\022)5\t!CC\001\024\003\025\0318-\0317b\023\t)\"C\001\004B]f\024VM\032\t\003/ai\021AA\005\0033\t\021a\"\0238wK:$xN]=Bo\006\024X\r\005\002\0307%\021AD\001\002\013/>\024H\016Z!xCJ,\007CA\f\037\023\ty\"A\001\bTS\022,'+Z:ue&\034G/\0323\t\013\005\002A\021\001\022\002\r\021Jg.\033;%)\005\031\003CA\t%\023\t)#C\001\003V]&$\b\"B\024\001\t\003A\023\001\0043s_BLe\016^8TY>$HcA\025-mA\031\021C\013\t\n\005-\022\"!B!se\006L\b\"B\027'\001\004q\023aB2p]R,\007\020\036\t\003_Qj\021\001\r\006\003cI\nq!\\1dQ&tWM\003\0024\021\005\031\021\r]5\n\005U\002$aB\"p]R,\007\020\036\005\006o\031\002\r\001O\001\005CJ<7\017\005\0020s%\021!\b\r\002\n\003J<W/\\3oiNDCA\n\037@\001B\021q&P\005\003}A\022\001bQ1mY\n\f7m[\001\004I>\034\027%A!\002\003g1WO\\2uS>t\007FZ1dS:<'H\\;nE\026\024H\006I:m_RTd.^7cKJ\\F\006I2pk:$(H\\;nE\026\0248\f\f\021ge>l7+\0333fu9,XNY3s;vK#HY8pY\026\fg\016I\027.A\021\023x\016]:!i\",\007e]3mK\016$X\r\032\021ji\026l\007e\035;bG.\004\023N\034;pAQDW\rI:qK\016Lg-[3eAMdw\016\036\021pM\002\ng\016I5om\026tGo\034:z]!)1\t\001C\001\t\006a1/^2l\rJ|Wn\0257piR\031\021&\022$\t\0135\022\005\031\001\030\t\013]\022\005\031\001\035)\t\tct\bS\021\002\023\006\tyAZ;oGRLwN\034\025gC\016Lgn\032\036ok6\024WM\035\027!g2|GO\0178v[\n,'o\027\027!G>,h\016\036\036ok6\024WM].-A\031\024x.\\*jI\026Td.^7cKJlV,\013\036c_>dW-\0318![5\0023+^2lg\002JG/Z7tA\031\024x.\034\021uQ\026\0043\017]3dS\032LW\r\032\021tY>$\be\0344!C:\004\023N\034<f]R|'/\037\030\t\013-\003A\021\002'\002\033]LG\017[%om\026tGo\034:z)\021IS*\0262\t\0139S\005\031A(\002\021\tdwnY6Q_N\004\"\001U*\016\003ES!A\025\005\002\tU$\030\016\\\005\003)F\023QB\0217pG.\004vn]5uS>t\007\"\002,K\001\0049\026\001\0034s_6\034\026\016Z3\021\005a\003W\"A-\013\005IS&BA.]\003\031\031w.\\7p]*\021QLX\001\017[&tWm\031:bMR4wN]4f\025\005y\026a\0018fi&\021\021-\027\002\017\r>\024x-\032#je\026\034G/[8o\021\025\031'\n1\001e\003\0051\007\003B\tfO&J!A\032\n\003\023\031+hn\031;j_:\f\004C\0015n\033\005I'B\0016l\003%IgN^3oi>\024\030P\003\002m=\006IQ.\0338fGJ\fg\r^\005\003]&\024!\"S%om\026tGo\034:z\001")
/*    */ public interface InventoryWorldControlMk2 extends InventoryAware, WorldAware, SideRestricted {
/*    */   @Callback(doc = "function(facing:number, slot:number[, count:number[, fromSide:number]]):boolean -- Drops the selected item stack into the specified slot of an inventory.")
/*    */   Object[] dropIntoSlot(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(facing:number, slot:number[, count:number[, fromSide:number]]):boolean -- Sucks items from the specified slot of an inventory.")
/*    */   Object[] suckFromSlot(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   public final class InventoryWorldControlMk2$$anonfun$dropIntoSlot$1 extends AbstractFunction1<IInventory, Object[]> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     private final int count$1;
/*    */     private final ForgeDirection fromSide$1;
/*    */     private final ItemStack stack$1;
/*    */     
/*    */     public final Object[] apply(IInventory inventory) {
/* 23 */       int slot = ExtendedArguments$.MODULE$.extendedArguments(this.args$1).checkSlot(inventory, 1);
/* 24 */       if (InventoryUtils$.MODULE$.insertIntoInventorySlot(this.stack$1, inventory, Option$.MODULE$.apply(this.fromSide$1), slot, this.count$1, InventoryUtils$.MODULE$.insertIntoInventorySlot$default$6())) {
/*    */ 
/*    */ 
/*    */         
/* 28 */         if (this.stack$1.field_77994_a == 0) {
/*    */           
/* 30 */           this.$outer.inventory().func_70299_a(this.$outer.selectedSlot(), null);
/*    */         }
/*    */         else {
/*    */           
/* 34 */           this.$outer.inventory().func_70296_d();
/*    */         } 
/*    */         
/* 37 */         this.context$1.pause(Settings$.MODULE$.get().dropDelay());
/*    */         
/* 39 */         return package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true) }));
/*    */       } 
/*    */       throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, package$.MODULE$.result(Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false), "inventory full/invalid slot" })));
/*    */     }
/*    */     private final Object nonLocalReturnKey1$1; private final Context context$1; private final Arguments args$1;
/*    */     public InventoryWorldControlMk2$$anonfun$dropIntoSlot$1(InventoryWorldControlMk2 $outer, int count$1, ForgeDirection fromSide$1, ItemStack stack$1, Object nonLocalReturnKey1$1, Context context$1, Arguments args$1) {} }
/*    */   public final class InventoryWorldControlMk2$$anonfun$suckFromSlot$1 extends AbstractFunction1<IInventory, Object[]> implements Serializable { public static final long serialVersionUID = 0L; private final int count$2; private final ForgeDirection fromSide$2; private final Context context$2;
/*    */     private final Arguments args$2;
/*    */     
/*    */     public InventoryWorldControlMk2$$anonfun$suckFromSlot$1(InventoryWorldControlMk2 $outer, int count$2, ForgeDirection fromSide$2, Context context$2, Arguments args$2) {}
/*    */     
/*    */     public final Object[] apply(IInventory inventory) {
/* 51 */       int slot = ExtendedArguments$.MODULE$.extendedArguments(this.args$2).checkSlot(inventory, 1);
/* 52 */       int extracted = InventoryUtils$.MODULE$.extractFromInventorySlot((Function1)new InventoryWorldControlMk2$$anonfun$suckFromSlot$1$$anonfun$1(this), inventory, this.fromSide$2, slot, this.count$2);
/*    */       
/* 54 */       this.context$2.pause(Settings$.MODULE$.get().suckDelay());
/* 55 */       return (extracted > 0) ? package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(extracted)
/*    */             
/* 57 */             })) : package$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false) }));
/*    */     }
/*    */     
/*    */     public final class InventoryWorldControlMk2$$anonfun$suckFromSlot$1$$anonfun$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final void apply(ItemStack x$1) {
/*    */         ItemStack x$6 = x$1;
/*    */         IInventory x$7 = this.$outer.li$cil$oc$server$component$traits$InventoryWorldControlMk2$$anonfun$$$outer().inventory();
/*    */         Option x$8 = Option$.MODULE$.apply(this.$outer.li$cil$oc$server$component$traits$InventoryWorldControlMk2$$anonfun$$$outer().insertionSlots()), x$9 = InventoryUtils$.MODULE$.insertIntoInventory$default$3();
/*    */         int x$10 = InventoryUtils$.MODULE$.insertIntoInventory$default$4();
/*    */         boolean x$11 = InventoryUtils$.MODULE$.insertIntoInventory$default$5();
/*    */         InventoryUtils$.MODULE$.insertIntoInventory(x$6, x$7, x$9, x$10, x$11, x$8);
/*    */       }
/*    */       
/*    */       public InventoryWorldControlMk2$$anonfun$suckFromSlot$1$$anonfun$1(InventoryWorldControlMk2$$anonfun$suckFromSlot$1 $outer) {}
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\InventoryWorldControlMk2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */