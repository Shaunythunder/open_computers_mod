/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ import li.cil.oc.client.Textures$;
/*    */ import li.cil.oc.common.tileentity.Raid;
/*    */ import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import net.minecraft.world.World;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001};Q!\001\002\t\002=\tABU1jIJ+g\016Z3sKJT!a\001\003\002\025QLG.Z3oi&$\030P\003\002\006\r\005A!/\0328eKJ,'O\003\002\b\021\00511\r\\5f]RT!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001!\t\001\022#D\001\003\r\025\021\"\001#\001\024\0051\021\026-\0333SK:$WM]3s'\t\tB\003\005\002\026;5\taC\003\002\004/)\021Q\001\007\006\003\017eQ!AG\016\002\0235Lg.Z2sC\032$(\"\001\017\002\0079,G/\003\002\037-\tIB+\0337f\013:$\030\016^=Ta\026\034\027.\0317SK:$WM]3s\021\025\001\023\003\"\001\"\003\031a\024N\\5u}Q\tq\002C\003$#\021\005C%\001\nsK:$WM\035+jY\026,e\016^5us\006#HCB\023,e]J4\b\005\002'S5\tqEC\001)\003\025\0318-\0317b\023\tQsE\001\003V]&$\b\"\002\027#\001\004i\023A\003;jY\026,e\016^5usB\021a\006M\007\002_)\0211!G\005\003c=\022!\002V5mK\026sG/\033;z\021\025\031$\0051\0015\003\005A\bC\001\0246\023\t1tE\001\004E_V\024G.\032\005\006q\t\002\r\001N\001\002s\")!H\ta\001i\005\t!\020C\003=E\001\007Q(A\001g!\t1c(\003\002@O\t)a\t\\8bi\"9\021)\005b\001\n\023\021\025AA;2+\005i\004B\002#\022A\003%Q(A\002vc\001BqAR\tC\002\023%!)\001\002gg\"1\001*\005Q\001\nu\n1AZ:!\021\025Q\025\003\"\003L\003)\021XM\0343feNcw\016\036\013\003K1CQ!T%A\0029\013Aa\0357piB\021aeT\005\003!\036\0221!\0238u\021)\021\026\003%A\001\002\003%\taU\001\026aJ|G/Z2uK\022$#-\0338e)\026DH/\036:f)\t!V\f\006\002&+\"9a+UA\001\002\0049\026a\001=%cA\021\001lW\007\0023*\021!,G\001\005kRLG.\003\002]3\n\001\"+Z:pkJ\034W\rT8dCRLwN\034\005\b-F\013\t\0211\001_\035\t\001\002\001")
/*    */ public final class RaidRenderer {
/*    */   public static void protected$bindTexture(RaidRenderer$ paramRaidRenderer$, ResourceLocation paramResourceLocation) {
/*    */     RaidRenderer$.MODULE$.protected$bindTexture(paramRaidRenderer$, paramResourceLocation);
/*    */   }
/*    */   
/*    */   public static void renderTileEntityAt(TileEntity paramTileEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*    */     RaidRenderer$.MODULE$.func_147500_a(paramTileEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat);
/*    */   }
/*    */   
/*    */   public static FontRenderer func_147498_b() {
/*    */     return RaidRenderer$.MODULE$.func_147498_b();
/*    */   }
/*    */   
/*    */   public static void func_147496_a(World paramWorld) {
/*    */     RaidRenderer$.MODULE$.func_147496_a(paramWorld);
/*    */   }
/*    */   
/*    */   public static void func_147497_a(TileEntityRendererDispatcher paramTileEntityRendererDispatcher) {
/*    */     RaidRenderer$.MODULE$.func_147497_a(paramTileEntityRendererDispatcher);
/*    */   }
/*    */   
/*    */   public final class RaidRenderer$$anonfun$renderTileEntityAt$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(int slot) {
/* 36 */       apply$mcVI$sp(slot);
/*    */     } private final Raid raid$1; public RaidRenderer$$anonfun$renderTileEntityAt$1(Raid raid$1) {} public void apply$mcVI$sp(int slot) {
/* 38 */       if (this.raid$1.presence()[slot]) {
/*    */ 
/*    */ 
/*    */         
/* 42 */         if (System.currentTimeMillis() - this.raid$1.lastAccess() < 400L && (this.raid$1.world()).field_73012_v.nextDouble() > 0.1D && slot == this.raid$1.lastAccess() % this.raid$1.func_70302_i_()) {
/* 43 */           RaidRenderer$.MODULE$.protected$bindTexture(RaidRenderer$.MODULE$, Textures$.MODULE$.blockRaidFrontActivity());
/* 44 */           RaidRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RaidRenderer$$renderSlot(slot);
/*    */         } 
/*    */       } else {
/*    */         RaidRenderer$.MODULE$.protected$bindTexture(RaidRenderer$.MODULE$, Textures$.MODULE$.blockRaidFrontError());
/*    */         RaidRenderer$.MODULE$.li$cil$oc$client$renderer$tileentity$RaidRenderer$$renderSlot(slot);
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\RaidRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */