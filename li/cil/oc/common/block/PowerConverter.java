/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import java.util.List;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.integration.Mods$;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.mutable.StringBuilder;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005-b\001B\001\003\0015\021a\002U8xKJ\034uN\034<feR,'O\003\002\004\t\005)!\r\\8dW*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\002\001\035I\001\"a\004\t\016\003\tI!!\005\002\003\027MKW\016\0357f\0052|7m\033\t\003'Yi\021\001\006\006\003+\t\ta\001\036:bSR\034\030BA\f\025\0055\001vn^3s\003\016\034W\r\035;pe\")\021\004\001C\0015\0051A(\0338jiz\"\022a\007\t\003\037\001Aq!\b\001C\002\023%a$A\005g_Jl\027\r\036;feV\tq\004\005\002!K5\t\021E\003\002#G\005!A/\032=u\025\005!\023\001\0026bm\006L!AJ\021\003\033\021+7-[7bY\032{'/\\1u\021\031A\003\001)A\005?\005Qam\034:nCR$XM\035\021\t\013)\002A\021K\026\002\035\r,8\017^8n)\026DH/\036:fgV\tA\006E\002.aIj\021A\f\006\002_\005)1oY1mC&\021\021G\f\002\006\003J\024\030-\037\t\004[M*\024B\001\033/\005\031y\005\017^5p]B\021a'\017\b\003[]J!\001\017\030\002\rA\023X\rZ3g\023\tQ4H\001\004TiJLgn\032\006\003q9BQ!\020\001\005Ry\n1\002^8pYRL\007\017V1jYR1qHQ$T9\022\004\"!\f!\n\005\005s#\001B+oSRDQa\021\037A\002\021\013\001\"\\3uC\022\fG/\031\t\003[\025K!A\022\030\003\007%sG\017C\003Iy\001\007\021*A\003ti\006\0347\016\005\002K#6\t1J\003\002M\033\006!\021\016^3n\025\tqu*A\005nS:,7M]1gi*\t\001+A\002oKRL!AU&\003\023%#X-\\*uC\016\\\007\"\002+=\001\004)\026A\0029mCf,'\017\005\002W56\tqK\003\002U1*\021\021,T\001\007K:$\030\016^=\n\005m;&\001D#oi&$\030\020\0257bs\026\024\b\"B/=\001\004q\026a\002;p_2$\030\016\035\t\004?\n,T\"\0011\013\005\005\034\023\001B;uS2L!a\0311\003\t1K7\017\036\005\006Kr\002\rAZ\001\tC\0224\030M\\2fIB\021QfZ\005\003Q:\022qAQ8pY\026\fg\016C\003k\001\021%1.\001\007bI\022,\005\020^3og&|g\016\006\002mcB\021Q\016]\007\002]*\021qnI\001\005Y\006tw-\003\002;]\")!/\033a\001g\006\t\001\020\005\002.i&\021QO\f\002\007\t>,(\r\\3\t\013]\004A\021\002=\002\021\005$GMU1uS>$BaP={y\")QL\036a\001=\")1P\036a\001k\005!a.Y7f\021\025ih\0171\001t\003\025\021\030\r^5p\021\031y\b\001\"\021\002\002\005\001RM\\3sOf$\006N]8vO\"\004X\017^\013\002g\"9\021Q\001\001\005B\005\035\021!\0045bgRKG.Z#oi&$\030\020F\002g\003\023AaaQA\002\001\004!\005bBA\007\001\021\005\023qB\001\021GJ,\027\r^3US2,WI\034;jif$b!!\005\002\034\005%\002\003BA\n\0033i!!!\006\013\007\005]A!\001\006uS2,WM\034;jifL1!AA\013\021!\ti\"a\003A\002\005}\021!B<pe2$\007\003BA\021\003Ki!!a\t\013\007\005uQ*\003\003\002(\005\r\"!B,pe2$\007BB\"\002\f\001\007A\t")
/*    */ public class PowerConverter extends SimpleBlock implements PowerAcceptor {
/* 15 */   public PowerConverter() { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); PowerAcceptor.class.$init$(this);
/* 16 */     if (Settings$.MODULE$.get().ignorePower()) {
/* 17 */       func_149647_a(null);
/* 18 */       NEI$.MODULE$.hide(this);
/*    */     } 
/*    */     
/* 21 */     this.formatter = new DecimalFormat("#.#"); } private final DecimalFormat formatter; private DecimalFormat formatter() { return this.formatter; }
/*    */ 
/*    */   
/*    */   public Option<String>[] customTextures() {
/* 25 */     (new Option[6])[0] = 
/* 26 */       (Option)None$.MODULE$;
/* 27 */     (new Option[6])[1] = (Option)None$.MODULE$;
/* 28 */     (new Option[6])[2] = (Option)new Some("PowerConverterSide");
/* 29 */     (new Option[6])[3] = (Option)new Some("PowerConverterSide");
/* 30 */     (new Option[6])[4] = (Option)new Some("PowerConverterSide");
/* 31 */     (new Option[6])[5] = (Option)new Some("PowerConverterSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */ 
/*    */   
/*    */   public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/* 37 */     PowerAcceptor.class.tooltipTail(this, metadata, stack, player, tooltip, advanced);
/*    */     
/* 39 */     if (Mods$.MODULE$.Factorization().isAvailable()) {
/* 40 */       addRatio(tooltip, "Factorization", Settings$.MODULE$.get().ratioFactorization());
/*    */     }
/* 42 */     if (Mods$.MODULE$.IndustrialCraft2().isAvailable() || Mods$.MODULE$.IndustrialCraft2Classic().isAvailable()) {
/* 43 */       addRatio(tooltip, "IndustrialCraft2", Settings$.MODULE$.get().ratioIndustrialCraft2());
/*    */     }
/* 45 */     if (Mods$.MODULE$.Mekanism().isAvailable()) {
/* 46 */       addRatio(tooltip, "Mekanism", Settings$.MODULE$.get().ratioMekanism());
/*    */     }
/* 48 */     if (Mods$.MODULE$.CoFHEnergy().isAvailable()) {
/* 49 */       addRatio(tooltip, "ThermalExpansion", Settings$.MODULE$.get().ratioRedstoneFlux());
/*    */     }
/*    */   }
/*    */   
/*    */   private String addExtension(double x) {
/* 54 */     return (x >= 1.0E9D) ? (new StringBuilder()).append(formatter().format(x / 1.0E9D)).append("G").toString() : (
/* 55 */       (x >= 1000000.0D) ? (new StringBuilder()).append(formatter().format(x / 1000000.0D)).append("M").toString() : (
/* 56 */       (x >= 1000.0D) ? (new StringBuilder()).append(formatter().format(x / 1000.0D)).append("K").toString() : 
/* 57 */       formatter().format(x)));
/*    */   }
/*    */   
/*    */   private void addRatio(List tooltip, String name, double ratio) {
/* 61 */     Tuple2.mcDD.sp sp = (ratio > true) ? new Tuple2.mcDD.sp(1.0D, ratio) : 
/* 62 */       new Tuple2.mcDD.sp(1.0D / ratio, 1.0D); if (sp != null) {
/* 63 */       double a = sp._1$mcD$sp(), b = sp._2$mcD$sp(); Tuple2.mcDD.sp sp2 = new Tuple2.mcDD.sp(a, b), sp1 = sp2; double d1 = sp1._1$mcD$sp(), d2 = sp1._2$mcD$sp(); tooltip.addAll(Tooltip$.MODULE$.get((new StringBuilder()).append(getClass().getSimpleName()).append(".").append(name).toString(), (Seq)Predef$.MODULE$.genericWrapArray(new Object[] { addExtension(d1), addExtension(d2) })));
/*    */     } 
/*    */     throw new MatchError(sp);
/*    */   }
/*    */   public double energyThroughput() {
/* 68 */     return Settings$.MODULE$.get().powerConverterRate();
/*    */   } public boolean hasTileEntity(int metadata) {
/* 70 */     return true;
/*    */   } public li.cil.oc.common.tileentity.PowerConverter createTileEntity(World world, int metadata) {
/* 72 */     return new li.cil.oc.common.tileentity.PowerConverter();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\PowerConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */