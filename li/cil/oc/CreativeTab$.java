/*    */ package li.cil.oc;
/*    */ public final class CreativeTab$ extends CreativeTabs {
/*    */   public static final CreativeTab$ MODULE$;
/*    */   
/*  5 */   private CreativeTab$() { super(CreativeTabs.getNextID(), "OpenComputers"); MODULE$ = this; } private ItemStack stack; private volatile boolean bitmap$0; private ItemStack stack$lzycompute() {
/*  6 */     synchronized (this) { if (!this.bitmap$0) { this.stack = Items.get("case1").createItemStack(1); this.bitmap$0 = true; }  return this.stack; }  } private ItemStack stack() { return this.bitmap$0 ? this.stack : stack$lzycompute(); }
/*    */    public Item func_78016_d() {
/*  8 */     return stack().func_77973_b();
/*    */   } public ItemStack func_151244_d() {
/* 10 */     return stack();
/*    */   } public String func_78024_c() {
/* 12 */     return func_78013_b();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\CreativeTab$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */