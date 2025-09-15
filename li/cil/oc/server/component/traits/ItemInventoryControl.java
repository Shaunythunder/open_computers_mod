/*    */ package li.cil.oc.server.component.traits;
/*    */ 
/*    */ import net.minecraft.inventory.IInventory;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\r4q!\001\002\021\002\007\005qB\001\013Ji\026l\027J\034<f]R|'/_\"p]R\024x\016\034\006\003\007\021\ta\001\036:bSR\034(BA\003\007\003%\031w.\0349p]\026tGO\003\002\b\021\00511/\032:wKJT!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001'\r\001\001C\006\t\003#Qi\021A\005\006\002'\005)1oY1mC&\021QC\005\002\007\003:L(+\0324\021\005]AR\"\001\002\n\005e\021!AD%om\026tGo\034:z\003^\f'/\032\005\0067\001!\t\001H\001\007I%t\027\016\036\023\025\003u\001\"!\005\020\n\005}\021\"\001B+oSRDQ!\t\001\005\002\t\nAcZ3u\023R,W.\0238wK:$xN]=TSj,GcA\022'aA\031\021\003\n\t\n\005\025\022\"!B!se\006L\b\"B\024!\001\004A\023aB2p]R,\007\020\036\t\003S9j\021A\013\006\003W1\nq!\\1dQ&tWM\003\002.\021\005\031\021\r]5\n\005=R#aB\"p]R,\007\020\036\005\006c\001\002\rAM\001\005CJ<7\017\005\002*g%\021AG\013\002\n\003J<W/\\3oiNDC\001\t\034:uA\021\021fN\005\003q)\022\001bQ1mY\n\f7m[\001\004I>\034\027%A\036\002)\032,hn\031;j_:D3\017\\8uu9,XNY3sSirW/\0342fe\002jS\006\t+iK\002\032\030N_3!_\032\004\023M\034\021ji\026l\007%\0338wK:$xN]=!S:\004C\017[3!gB,7-\0334jK\022\0043\017\\8u]!)Q\b\001C\001}\005)BM]8q\023:$x.\023;f[&sg/\0328u_JLHcA\022@\001\")q\005\020a\001Q!)\021\007\020a\001e!\"AHN\035CC\005\031\025!a\003gk:\034G/[8oQ%tg/\0328u_JL8\013\\8uu9,XNY3sY\001\032Hn\034;;]Vl'-\032:\\Y\001\032w.\0368uu9,XNY3s{Y\"T,\013\036ok6\024WM\035\021.[\001\"%o\0349tA\005t\007%\033;f[\002Jg\016^8!i\",\007e\0359fG&4\027.\0323!g2|G\017I5oAQDW\rI5uK6\004\023N\034<f]R|'/\037\030\t\013\025\003A\021\001$\002+M,8m\033$s_6LE/Z7J]Z,g\016^8ssR\0311e\022%\t\013\035\"\005\031\001\025\t\013E\"\005\031\001\032)\t\0213\024HS\021\002\027\006\tyAZ;oGRLwN\034\025j]Z,g\016^8ssNcw\016\036\036ok6\024WM\035\027!g2|GO\0178v[\n,'o\027\027!G>,h\016\036\036ok6\024WM]\0377iuK#H\\;nE\026\024\b%L\027!'V\0347n\035\021b]\002JG/Z7!_V$\be\0344!i\",\007e\0359fG&4\027.\0323!g2|G\017I5oAQDW\rI5uK6\004\023N\034<f]R|'/\037\030\t\0135\003A\021\002(\002#]LG\017[%uK6LeN^3oi>\024\030\020F\002$\037RCQ\001\025'A\002E\013Aa\0357piB\021\021CU\005\003'J\0211!\0238u\021\025)F\n1\001W\003\0051\007\003B\tX3\016J!\001\027\n\003\023\031+hn\031;j_:\f\004C\001.b\033\005Y&B\001/^\003%IgN^3oi>\024\030P\003\002_?\006IQ.\0338fGJ\fg\r\036\006\002A\006\031a.\032;\n\005\t\\&AC%J]Z,g\016^8ss\002")
/*    */ public interface ItemInventoryControl extends InventoryAware {
/*    */   @Callback(doc = "function(slot:number):number -- The size of an item inventory in the specified slot.")
/*    */   Object[] getItemInventorySize(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(inventorySlot:number, slot:number[, count:number=64]):number -- Drops an item into the specified slot in the item inventory.")
/*    */   Object[] dropIntoItemInventory(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   @Callback(doc = "function(inventorySlot:number, slot:number[, count:number=64]):number -- Sucks an item out of the specified slot in the item inventory.")
/*    */   Object[] suckFromItemInventory(Context paramContext, Arguments paramArguments);
/*    */   
/*    */   public final class ItemInventoryControl$$anonfun$getItemInventorySize$1 extends AbstractFunction1<IInventory, Object[]> implements Serializable { public final Object[] apply(IInventory itemInventory) {
/* 17 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(itemInventory.func_70302_i_()) }));
/*    */     } public static final long serialVersionUID = 0L;
/*    */     public ItemInventoryControl$$anonfun$getItemInventorySize$1(ItemInventoryControl $outer) {} }
/*    */   public final class ItemInventoryControl$$anonfun$dropIntoItemInventory$1 extends AbstractFunction1<IInventory, Object[]> implements Serializable { public static final long serialVersionUID = 0L; private final Arguments args$1;
/*    */     public ItemInventoryControl$$anonfun$dropIntoItemInventory$1(ItemInventoryControl $outer, Arguments args$1) {}
/*    */     public final Object[] apply(IInventory itemInventory) {
/* 23 */       int slot = ExtendedArguments$.MODULE$.extendedArguments(this.args$1).checkSlot(itemInventory, 1);
/* 24 */       ExtendedArguments.ExtendedArguments qual$1 = ExtendedArguments$.MODULE$.extendedArguments(this.args$1); int x$3 = 2, x$4 = qual$1.optItemCount$default$2(), count = qual$1.optItemCount(x$3, x$4);
/* 25 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(InventoryUtils$.MODULE$.extractAnyFromInventory((Function1)new ItemInventoryControl$$anonfun$dropIntoItemInventory$1$$anonfun$apply$1(this, slot, itemInventory), this.$outer.inventory(), ForgeDirection.UNKNOWN, count)) })); } public final class ItemInventoryControl$$anonfun$dropIntoItemInventory$1$$anonfun$apply$1 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final int slot$1; private final IInventory itemInventory$1; public final void apply(ItemStack x$1) { InventoryUtils$.MODULE$.insertIntoInventorySlot(x$1, this.itemInventory$1, Option$.MODULE$.apply(ForgeDirection.UNKNOWN), this.slot$1, InventoryUtils$.MODULE$.insertIntoInventorySlot$default$5(), InventoryUtils$.MODULE$.insertIntoInventorySlot$default$6()); }
/*    */       
/*    */       public ItemInventoryControl$$anonfun$dropIntoItemInventory$1$$anonfun$apply$1(ItemInventoryControl$$anonfun$dropIntoItemInventory$1 $outer, int slot$1, IInventory itemInventory$1) {} } }
/*    */   public final class ItemInventoryControl$$anonfun$suckFromItemInventory$1 extends AbstractFunction1<IInventory, Object[]> implements Serializable { public static final long serialVersionUID = 0L; private final Arguments args$2;
/*    */     
/*    */     public ItemInventoryControl$$anonfun$suckFromItemInventory$1(ItemInventoryControl $outer, Arguments args$2) {}
/*    */     
/* 32 */     public final Object[] apply(IInventory itemInventory) { int slot = ExtendedArguments$.MODULE$.extendedArguments(this.args$2).checkSlot(itemInventory, 1);
/* 33 */       ExtendedArguments.ExtendedArguments qual$2 = ExtendedArguments$.MODULE$.extendedArguments(this.args$2); int x$5 = 2, x$6 = qual$2.optItemCount$default$2(), count = qual$2.optItemCount(x$5, x$6);
/* 34 */       return ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(InventoryUtils$.MODULE$.extractFromInventorySlot((Function1)new ItemInventoryControl$$anonfun$suckFromItemInventory$1$$anonfun$apply$2(this), itemInventory, ForgeDirection.UNKNOWN, slot, count)) })); } public final class ItemInventoryControl$$anonfun$suckFromItemInventory$1$$anonfun$apply$2 extends AbstractFunction1<ItemStack, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(ItemStack x$2) { ItemStack x$7 = x$2; IInventory x$8 = this.$outer.li$cil$oc$server$component$traits$ItemInventoryControl$$anonfun$$$outer().inventory(); Option x$9 = Option$.MODULE$.apply(this.$outer.li$cil$oc$server$component$traits$ItemInventoryControl$$anonfun$$$outer().insertionSlots()), x$10 = InventoryUtils$.MODULE$.insertIntoInventory$default$3(); int x$11 = InventoryUtils$.MODULE$.insertIntoInventory$default$4(); boolean x$12 = InventoryUtils$.MODULE$.insertIntoInventory$default$5(); InventoryUtils$.MODULE$.insertIntoInventory(x$7, x$8, x$10, x$11, x$12, x$9); }
/*    */ 
/*    */       
/*    */       public ItemInventoryControl$$anonfun$suckFromItemInventory$1$$anonfun$apply$2(ItemInventoryControl$$anonfun$suckFromItemInventory$1 $outer) {} }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\ItemInventoryControl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */