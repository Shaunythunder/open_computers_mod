/*    */ package li.cil.oc.common;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import java.util.Random;
/*    */ import java.util.concurrent.Callable;
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.api.Items;
/*    */ import li.cil.oc.api.fs.FileSystem;
/*    */ import net.minecraft.inventory.IInventory;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.WeightedRandomChestContent;
/*    */ import net.minecraftforge.common.ChestGenHooks;
/*    */ import net.minecraftforge.event.world.WorldEvent;
/*    */ import scala.Array$;
/*    */ import scala.Option;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.mutable.ArrayBuffer;
/*    */ import scala.collection.mutable.Map;
/*    */ import scala.reflect.ClassTag$;
/*    */ import scala.reflect.ScalaSignature;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0055h\001B\001\003\001-\021A\001T8pi*\0211\001B\001\007G>lWn\0348\013\005\0251\021AA8d\025\t9\001\"A\002dS2T\021!C\001\003Y&\034\001a\005\002\001\031A\021Q\002F\007\002\035)\021q\002E\001\005kRLGN\003\002\022%\005IQ.\0338fGJ\fg\r\036\006\002'\005\031a.\032;\n\005Uq!AG,fS\036DG/\0323SC:$w.\\\"iKN$8i\0348uK:$\b\"B\f\001\t\003A\022A\002\037j]&$h\bF\001\032!\tQ\002!D\001\003\021\025a\002\001\"\021\036\003Q9WM\\3sCR,7\t[3ti\016{g\016^3oiR\031aDK\032\021\007}\021C%D\001!\025\005\t\023!B:dC2\f\027BA\022!\005\025\t%O]1z!\t)\003&D\001'\025\t9\003#\001\003ji\026l\027BA\025'\005%IE/Z7Ti\006\0347\016C\003,7\001\007A&\001\004sC:$w.\034\t\003[Ej\021A\f\006\003\037=R\021\001M\001\005U\0064\030-\003\0023]\t1!+\0318e_6DQ\001N\016A\002U\nAB\\3x\023:4XM\034;pef\004\"AN\035\016\003]R!\001\017\t\002\023%tg/\0328u_JL\030B\001\0368\005)I\025J\034<f]R|'/_\004\006y\tA\t!P\001\005\031>|G\017\005\002\033}\031)\021A\001E\001M\021a\b\021\t\003?\005K!A\021\021\003\r\005s\027PU3g\021\0259b\b\"\001E)\005i\004b\002$?\005\004%\taR\001\013G>tG/Y5oKJ\034X#\001%\021\007}\021\023\n\005\002K\0336\t1J\003\002M_\005!A.\0318h\023\tq5J\001\004TiJLgn\032\005\007!z\002\013\021\002%\002\027\r|g\016^1j]\026\0248\017\t\005\b%z\022\r\021\"\001T\003%1\027m\031;pe&,7/F\001U!\021)&\f\0302\016\003YS!a\026-\002\0175,H/\0312mK*\021\021\fI\001\013G>dG.Z2uS>t\027BA.W\005\ri\025\r\035\t\003;\002t!a\b0\n\005}\003\023A\002)sK\022,g-\003\002OC*\021q\f\t\t\004G\032DW\"\0013\013\005\025t\023AC2p]\016,(O]3oi&\021q\r\032\002\t\007\006dG.\0312mKB\021\021N\\\007\002U*\0211\016\\\001\003MNT!!\034\003\002\007\005\004\030.\003\002pU\nQa)\0337f'f\034H/Z7\t\rEt\004\025!\003U\003)1\027m\031;pe&,7\017\t\005\bgz\022\r\021\"\001u\003-9Gn\0342bY\022K7o[:\026\003U\0042!\026<y\023\t9hKA\006BeJ\f\027PQ;gM\026\024\b\003B\020zImL!A\037\021\003\rQ+\b\017\\33!\tyB0\003\002~A\t\031\021J\034;\t\r}t\004\025!\003v\00319Gn\0342bY\022K7o[:!\021!\t\031A\020b\001\n\003!\030AC<pe2$G)[:lg\"9\021q\001 !\002\023)\030aC<pe2$G)[:lg\002Bq!a\003?\t\003\ti!A\beSN\\7OR8s\007f\034G.\0338h+\t\ty\001E\002Vm\022B\021\"a\005?\005\004%\t!!\004\002+\021L7o[:G_J\034\025p\0317j]\036\034VM\035<fe\"A\021q\003 !\002\023\ty!\001\feSN\\7OR8s\007f\034G.\0338h'\026\024h/\032:!\021%\tYB\020b\001\n\003\ti!A\013eSN\\7OR8s\007f\034G.\0338h\0072LWM\034;\t\021\005}a\b)A\005\003\037\ta\003Z5tWN4uN]\"zG2LgnZ\"mS\026tG\017\t\005\n\003Gq$\031!C\001\003\033\t\001\003Z5tWN4uN]*b[Bd\027N\\4\t\021\005\035b\b)A\005\003\037\t\021\003Z5tWN4uN]*b[Bd\027N\\4!\021%\tYC\020b\001\n\003\ti!\001\beSN\\7OR8s\0072LWM\034;\t\021\005=b\b)A\005\003\037\tq\002Z5tWN4uN]\"mS\026tG\017\t\005\b\003gqD\021AA\033\003)I7\017T8pi\022K7o\033\013\005\003o\ti\004E\002 \003sI1!a\017!\005\035\021un\0347fC:Dq!a\020\0022\001\007A%A\003ti\006\0347\016C\004\002Dy\"\t!!\022\002!I,w-[:uKJdun\034;ESN\\G#\003\023\002H\005-\023qJA*\021\035\tI%!\021A\002q\013AA\\1nK\"9\021QJA!\001\004Y\030!B2pY>\024\bbBA)\003\003\002\rAY\001\bM\006\034Go\034:z\021!\t)&!\021A\002\005]\022a\0043p%\026\034\027\016]3Ds\016d\027N\\4\t\017\005ec\b\"\001\002\\\005!\021N\\5u)\t\ti\006E\002 \003?J1!!\031!\005\021)f.\033;\t\017\005\025d\b\"\001\002h\005a\021N\\5u\r>\024xk\034:mIR!\021QLA5\021!\tY'a\031A\002\0055\024!A3\021\t\005=\0241\021\b\005\003c\ny(\004\002\002t)!\021QOA<\003\0259xN\0357e\025\021\tI(a\037\002\013\0254XM\034;\013\007\005u$#\001\bnS:,7M]1gi\032|'oZ3\n\t\005\005\0251O\001\013/>\024H\016Z#wK:$\030\002BAC\003\017\023A\001T8bI*!\021\021QA:Q\021\t\031'a#\021\t\0055\025\021U\007\003\003\037SA!!%\002\024\006aQM^3oi\"\fg\016\0327fe*\0311!!&\013\t\005]\025\021T\001\004M6d'\002BAN\003;\013A!\\8eg*\021\021qT\001\004GB<\030\002BAR\003\037\023abU;cg\016\024\030NY3Fm\026tG\017C\004\002(z\"I!!+\002\035A\f'o]3M_>$H)[:lgRA\021QLAV\003k\013I\f\003\005\002.\006\025\006\031AAX\003\021a\027n\035;\021\0075\n\t,C\002\0024:\022!\002\025:pa\026\024H/[3t\021\035\t9,!*A\002U\f1!Y2d\021!\tY,!*A\002\005]\022\001C3yi\026\024h.\0317\t\017\005}f\b\"\001\002B\006q1M]3bi\026dun\034;ESN\\G#\003\023\002D\006\025\027\021ZAf\021\035\tI%!0A\002qCq!a2\002>\002\007A,\001\003qCRD\007\002CA^\003{\003\r!a\016\t\025\0055\023Q\030I\001\002\004\ti\r\005\003 \003\037\\\030bAAiA\t1q\n\035;j_:D\021\"!6?#\003%\t!a6\0021\r\024X-\031;f\031>|G\017R5tW\022\"WMZ1vYR$C'\006\002\002Z*\"\021QZAnW\t\ti\016\005\003\002`\006%XBAAq\025\021\t\031/!:\002\023Ut7\r[3dW\026$'bAAtA\005Q\021M\0348pi\006$\030n\0348\n\t\005-\030\021\035\002\022k:\034\007.Z2lK\0224\026M]5b]\016,\007")
/*    */ public class Loot
/*    */   extends WeightedRandomChestContent
/*    */ {
/*    */   public Loot() {
/* 28 */     super(Items.get("floppy").createItemStack(1), 1, 1, Settings$.MODULE$.get().lootProbability());
/*    */   } public ItemStack[] generateChestContent(Random random, IInventory newInventory) {
/* 30 */     return Loot$.MODULE$.disksForSampling().nonEmpty() ? 
/* 31 */       ChestGenHooks.generateStacks(random, (ItemStack)Loot$.MODULE$.disksForSampling().apply(random.nextInt(Loot$.MODULE$.disksForSampling().length())), 
/* 32 */         this.field_76295_d, this.field_76296_e) : 
/* 33 */       (ItemStack[])Array$.MODULE$.empty(ClassTag$.MODULE$.apply(ItemStack.class));
/*    */   }
/*    */   
/*    */   public static String[] containers() {
/*    */     return Loot$.MODULE$.containers();
/*    */   }
/*    */   
/*    */   public static Map<String, Callable<FileSystem>> factories() {
/*    */     return Loot$.MODULE$.factories();
/*    */   }
/*    */   
/*    */   public static ArrayBuffer<Tuple2<ItemStack, Object>> globalDisks() {
/*    */     return Loot$.MODULE$.globalDisks();
/*    */   }
/*    */   
/*    */   public static ArrayBuffer<Tuple2<ItemStack, Object>> worldDisks() {
/*    */     return Loot$.MODULE$.worldDisks();
/*    */   }
/*    */   
/*    */   public static ArrayBuffer<ItemStack> disksForCycling() {
/*    */     return Loot$.MODULE$.disksForCycling();
/*    */   }
/*    */   
/*    */   public static ArrayBuffer<ItemStack> disksForCyclingServer() {
/*    */     return Loot$.MODULE$.disksForCyclingServer();
/*    */   }
/*    */   
/*    */   public static ArrayBuffer<ItemStack> disksForCyclingClient() {
/*    */     return Loot$.MODULE$.disksForCyclingClient();
/*    */   }
/*    */   
/*    */   public static ArrayBuffer<ItemStack> disksForSampling() {
/*    */     return Loot$.MODULE$.disksForSampling();
/*    */   }
/*    */   
/*    */   public static ArrayBuffer<ItemStack> disksForClient() {
/*    */     return Loot$.MODULE$.disksForClient();
/*    */   }
/*    */   
/*    */   public static boolean isLootDisk(ItemStack paramItemStack) {
/*    */     return Loot$.MODULE$.isLootDisk(paramItemStack);
/*    */   }
/*    */   
/*    */   public static ItemStack registerLootDisk(String paramString, int paramInt, Callable<FileSystem> paramCallable, boolean paramBoolean) {
/*    */     return Loot$.MODULE$.registerLootDisk(paramString, paramInt, paramCallable, paramBoolean);
/*    */   }
/*    */   
/*    */   public static void init() {
/*    */     Loot$.MODULE$.init();
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void initForWorld(WorldEvent.Load paramLoad) {
/*    */     Loot$.MODULE$.initForWorld(paramLoad);
/*    */   }
/*    */   
/*    */   public static ItemStack createLootDisk(String paramString1, String paramString2, boolean paramBoolean, Option<Object> paramOption) {
/*    */     return Loot$.MODULE$.createLootDisk(paramString1, paramString2, paramBoolean, paramOption);
/*    */   }
/*    */   
/*    */   public static Option<Object> createLootDisk$default$4() {
/*    */     return Loot$.MODULE$.createLootDisk$default$4();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\Loot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */