/*    */ package li.cil.oc.common.item.data;
/*    */ 
/*    */ import li.cil.oc.Settings$;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.world.World;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0014A!\001\002\001\037\t)b*\031<jO\006$\030n\0348Va\036\024\030\rZ3ECR\f'BA\002\005\003\021!\027\r^1\013\005\0251\021\001B5uK6T!a\002\005\002\r\r|W.\\8o\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\003\001A\001\"!\005\n\016\003\tI!a\005\002\003\021%#X-\034#bi\006DQ!\006\001\005\002Y\ta\001P5oSRtD#A\f\021\005E\001\001\"B\013\001\t\003IBCA\f\033\021\025Y\002\0041\001\035\003\025\031H/Y2l!\ti2%D\001\037\025\t)qD\003\002!C\005IQ.\0338fGJ\fg\r\036\006\002E\005\031a.\032;\n\005\021r\"!C%uK6\034F/Y2l\021\0351\003\0011A\005\002\035\n1!\\1q+\005a\002bB\025\001\001\004%\tAK\001\b[\006\004x\fJ3r)\tY\023\007\005\002-_5\tQFC\001/\003\025\0318-\0317b\023\t\001TF\001\003V]&$\bb\002\032)\003\003\005\r\001H\001\004q\022\n\004B\002\033\001A\003&A$\001\003nCB\004\003\"\002\034\001\t\0039\024aB7ba\022\013G/\031\013\003q\001\003\"!\017 \016\003iR!a\017\037\002\017M$xN]1hK*\021QhH\001\006o>\024H\016Z\005\003i\022q!T1q\t\006$\030\rC\003>k\001\007\021\t\005\002C\0076\tA(\003\002Ey\t)qk\034:mI\")a\t\001C\001\017\0069q-\032;TSj,GC\001%L!\ta\023*\003\002K[\t\031\021J\034;\t\013u*\005\031A!\t\0135\003A\021\t(\002\t1|\027\r\032\013\003W=CQa\007'A\002qAQ!\025\001\005BI\013Aa]1wKR\0211f\025\005\0067A\003\r\001\b\005\006\033\002!\t%\026\013\003WYCQa\026+A\002a\0131A\0342u!\tI6,D\001[\025\t9v$\003\002]5\nqaJ\021+UC\036\034u.\0349pk:$\007\"B)\001\t\003rFCA\026`\021\0259V\f1\001Y\001")
/*    */ public class NavigationUpgradeData extends ItemData {
/* 11 */   public NavigationUpgradeData() { super("navigationUpgrade");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 17 */     this.map = new ItemStack((Item)Items.field_151098_aY); } private ItemStack map; public NavigationUpgradeData(ItemStack stack) { this(); load(stack); } public ItemStack map() { return this.map; } public void map_$eq(ItemStack x$1) { this.map = x$1; } public MapData mapData(World world) {
/*    */     try {
/* 19 */       return ((ItemMap)map().func_77973_b()).func_77873_a(map(), world);
/*    */     } finally {
/*    */       null;
/*    */     } 
/*    */   } public int getSize(World world) {
/* 24 */     MapData info = mapData(world);
/* 25 */     return 128 * (1 << info.field_76197_d);
/*    */   }
/*    */   
/*    */   public void load(ItemStack stack) {
/* 29 */     if (stack.func_77942_o()) {
/* 30 */       load(stack.func_77978_p().func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString()));
/*    */     }
/*    */   }
/*    */   
/*    */   public void save(ItemStack stack) {
/* 35 */     if (!stack.func_77942_o()) {
/* 36 */       stack.func_77982_d(new NBTTagCompound());
/*    */     }
/* 38 */     save(ExtendedNBT$.MODULE$.toNbt(stack).func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString()));
/*    */   }
/*    */   
/*    */   public void load(NBTTagCompound nbt) {
/* 42 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("map").toString())) {
/* 43 */       map_$eq(ItemStack.func_77949_a(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("map").toString())));
/*    */     }
/*    */   }
/*    */   
/*    */   public void save(NBTTagCompound nbt) {
/* 48 */     if (map() != null)
/* 49 */     { ItemStack itemStack = map(); ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("map").toString(), (Function1)new NavigationUpgradeData$$anonfun$save$1(this, itemStack)); }  } public final class NavigationUpgradeData$$anonfun$save$1 extends AbstractFunction1<NBTTagCompound, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; private final ItemStack eta$0$1$1; public final NBTTagCompound apply(NBTTagCompound x$1) { return this.eta$0$1$1.func_77955_b(x$1); }
/*    */ 
/*    */     
/*    */     public NavigationUpgradeData$$anonfun$save$1(NavigationUpgradeData $outer, ItemStack eta$0$1$1) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\NavigationUpgradeData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */