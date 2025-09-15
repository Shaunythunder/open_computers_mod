/*    */ package li.cil.oc.integration.opencomputers;
/*    */ 
/*    */ import li.cil.oc.common.item.APU;
/*    */ import li.cil.oc.common.item.traits.Delegate;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ public final class DriverAPU$ extends DriverCPU implements HostAware {
/*    */   public static final DriverAPU$ MODULE$;
/*    */   
/* 12 */   private DriverAPU$() { MODULE$ = this; } public boolean worksWith(ItemStack stack) {
/* 13 */     (new ItemInfo[3])[0] = 
/* 14 */       Items.get("apu1");
/* 15 */     (new ItemInfo[3])[1] = Items.get("apu2");
/* 16 */     (new ItemInfo[3])[2] = Items.get("apuCreative");
/*    */     return isOneOf(stack, (Seq<ItemInfo>)scala.Predef$.MODULE$.wrapRefArray((Object[])new ItemInfo[3]));
/*    */   }
/*    */   public ManagedEnvironment createEnvironment(ItemStack stack, EnvironmentHost host) {
/* 20 */     int i = gpuTier(stack); switch (i) { default: case 2: case 1: 
/* 21 */       case 0: break; }  return (host.world() != null && (host.world()).field_72995_K) ? null : (ManagedEnvironment)new APU(0);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int supportedComponents(ItemStack stack) {
/* 27 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 28 */     if (option instanceof Some) { Some some = (Some)option; Delegate apu = (Delegate)some.x(); if (apu instanceof APU) { APU aPU = (APU)apu; return li.cil.oc.Settings$.MODULE$.get().cpuComponentSupport()[aPU.cpuTierForComponents()]; }  }
/* 29 */      return li.cil.oc.Settings$.MODULE$.get().cpuComponentSupport()[1];
/*    */   }
/*    */   
/*    */   public int cpuTier(ItemStack stack) {
/* 33 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 34 */     if (option instanceof Some) { Some some = (Some)option; Delegate apu = (Delegate)some.x(); if (apu instanceof APU) { APU aPU = (APU)apu; return aPU.cpuTier(); }  }
/* 35 */      return 0;
/*    */   }
/*    */   
/*    */   public int gpuTier(ItemStack stack) {
/* 39 */     Option option = li.cil.oc.common.item.Delegator$.MODULE$.subItem(stack);
/* 40 */     if (option instanceof Some) { Some some = (Some)option; Delegate apu = (Delegate)some.x(); if (apu instanceof APU) { APU aPU = (APU)apu; return aPU.gpuTier(); }  }
/* 41 */      return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\opencomputers\DriverAPU$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */