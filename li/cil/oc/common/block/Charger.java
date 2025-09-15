/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import java.util.List;
/*    */ import li.cil.oc.common.block.traits.StateAware;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005=e\001B\001\003\0015\021qa\0215be\036,'O\003\002\004\t\005)!\r\\8dW*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001aE\003\001\035IA2\004\005\002\020!5\t!!\003\002\022\005\ti!+\0323ti>tW-Q<be\026\004\"a\005\f\016\003QQ!!\006\002\002\rQ\024\030-\033;t\023\t9BCA\007Q_^,'/Q2dKB$xN\035\t\003'eI!A\007\013\003\025M#\030\r^3Bo\006\024X\r\005\002\0249%\021Q\004\006\002\004\017VK\005\"B\020\001\t\003\001\023A\002\037j]&$h\bF\001\"!\ty\001\001C\003$\001\021EC%\001\bdkN$x.\034+fqR,(/Z:\026\003\025\0022AJ\025,\033\0059#\"\001\025\002\013M\034\027\r\\1\n\005):#!B!se\006L\bc\001\024-]%\021Qf\n\002\007\037B$\030n\0348\021\005=\022dB\001\0241\023\t\tt%\001\004Qe\026$WMZ\005\003gQ\022aa\025;sS:<'BA\031(\021\0251\004\001\"\0218\003I\021XmZ5ti\026\024(\t\\8dW&\033wN\\:\025\005aZ\004C\001\024:\023\tQtE\001\003V]&$\b\"\002\0376\001\004i\024\001D5d_:\024VmZ5ti\026\024\bC\001 J\033\005y$B\001!B\003\035!X\r\037;ve\026T!AQ\"\002\021I,g\016Z3sKJT!\001R#\002\r\rd\027.\0328u\025\t1u)A\005nS:,7M]1gi*\t\001*A\002oKRL!AS \003\033%K5m\0348SK\036L7\017^3s\021\025a\005\001\"\021N\003A)g.\032:hsRC'o\\;hQB,H/F\001O!\t1s*\003\002QO\t1Ai\\;cY\026DQA\025\001\005BM\013qaZ;j)f\004X-F\001U%\r)6L\030\004\005-\002\001AK\001\007=e\0264\027N\\3nK:$h(\003\002Y3\006A1\t[1sO\026\024\bE\003\002[\t\0059q)^5UsB,\007C\001\024]\023\tivE\001\004B]f\024VM\032\t\003?\nt!\001Y1\016\003\021I!A\027\003\n\005\rL&aB#ok64\026\r\034\005\006KV#\tAZ\001\bgV\024G+\0379f+\0059'c\0015\\[\032!a\013\001\001h\023\tQ7.\001\004CY>\0347\016\t\006\003Yf\013\001bQ1uK\036|'/\037\t\003]Bt!aX8\n\0051L\026BA2l\021\025\021\b\001\"\021t\003A\031'/Z1uKRKG.Z#oi&$\030\020\006\003us\006\005\001CA;y\033\0051(BA<\005\003)!\030\016\\3f]RLG/_\005\003\003YDQA_9A\002m\fQa^8sY\022\004\"\001 @\016\003uT!A_#\n\005}l(!B,pe2$\007bBA\002c\002\007\021QA\001\t[\026$\030\rZ1uCB\031a%a\002\n\007\005%qEA\002J]RDq!!\004\001\t\003\ny!\001\ndC:\034uN\0348fGR\024V\rZ:u_:,G\003DA\t\003/\ty\"a\t\002(\005-\002c\001\024\002\024%\031\021QC\024\003\017\t{w\016\\3b]\"9!0a\003A\002\005e\001c\001?\002\034%\031\021QD?\003\031%\023En\\2l\003\016\034Wm]:\t\021\005\005\0221\002a\001\003\013\t\021\001\037\005\t\003K\tY\0011\001\002\006\005\t\021\020\003\005\002*\005-\001\031AA\003\003\005Q\b\002CA\027\003\027\001\r!a\f\002\tMLG-\032\t\005\003c\ti$\004\002\0024)!\021QGA\034\003\021)H/\0337\013\007\025\tIDC\002\002<\035\013a\"\\5oK\016\024\030M\032;g_J<W-\003\003\002@\005M\"A\004$pe\036,G)\033:fGRLwN\034\005\b\003\007\002A\021IA#\003AygN\0217pG.\f5\r^5wCR,G\r\006\013\002\022\005\035\023\021JA&\003\033\ny%!\031\002d\0055\024\021\017\005\007u\006\005\003\031A>\t\021\005\005\022\021\ta\001\003\013A\001\"!\n\002B\001\007\021Q\001\005\t\003S\t\t\0051\001\002\006!A\021\021KA!\001\004\t\031&\001\004qY\006LXM\035\t\005\003+\ni&\004\002\002X)!\021\021KA-\025\r\tY&R\001\007K:$\030\016^=\n\t\005}\023q\013\002\r\013:$\030\016^=QY\006LXM\035\005\t\003[\t\t\0051\001\0020!A\021QMA!\001\004\t9'\001\003iSRD\006c\001\024\002j%\031\0211N\024\003\013\031cw.\031;\t\021\005=\024\021\ta\001\003O\nA\001[5u3\"A\0211OA!\001\004\t9'\001\003iSRT\006bBA<\001\021\005\023\021P\001\026_:tU-[4iE>\024(\t\\8dW\016C\027M\\4f)-A\0241PA?\003\n\t)a!\t\ri\f)\b1\001|\021!\t\t#!\036A\002\005\025\001\002CA\023\003k\002\r!!\002\t\021\005%\022Q\017a\001\003\013AqaAA;\001\004\t)\t\005\003\002\b\006-UBAAE\025\t\031Q)\003\003\002\016\006%%!\002\"m_\016\\\007")
/*    */ public class Charger extends RedstoneAware implements PowerAcceptor, StateAware, GUI {
/* 17 */   public boolean func_149740_M() { return StateAware.class.hasComparatorInputOverride(this); } public int func_149736_g(World world, int x, int y, int z, int side) { return StateAware.class.getComparatorInputOverride(this, world, x, y, z, side); } public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) { PowerAcceptor.class.tooltipTail(this, metadata, stack, player, tooltip, advanced); } public Charger() { PowerAcceptor.class.$init$(this); StateAware.class.$init$(this); GUI.class.$init$(this); } public Option<String>[] customTextures() {
/* 18 */     (new Option[6])[0] = 
/* 19 */       (Option)None$.MODULE$;
/* 20 */     (new Option[6])[1] = (Option)None$.MODULE$;
/* 21 */     (new Option[6])[2] = (Option)new Some("ChargerSide");
/* 22 */     (new Option[6])[3] = (Option)new Some("ChargerFront");
/* 23 */     (new Option[6])[4] = (Option)new Some("ChargerSide");
/* 24 */     (new Option[6])[5] = (Option)new Some("ChargerSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 28 */     super.func_149651_a(iconRegister);
/* 29 */     Textures$Charger$.MODULE$.iconFrontCharging_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":ChargerFrontOn").toString()));
/* 30 */     Textures$Charger$.MODULE$.iconSideCharging_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":ChargerSideOn").toString()));
/*    */   }
/*    */ 
/*    */   
/*    */   public double energyThroughput() {
/* 35 */     return Settings$.MODULE$.get().chargerRate();
/*    */   } public GuiType.EnumVal guiType() {
/* 37 */     return GuiType$.MODULE$.Charger();
/*    */   } public li.cil.oc.common.tileentity.Charger createTileEntity(World world, int metadata) {
/* 39 */     return new li.cil.oc.common.tileentity.Charger();
/*    */   }
/*    */   
/*    */   public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/* 43 */     return true;
/*    */   }
/*    */   
/*    */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/*    */     boolean bool;
/* 48 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 49 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Charger) { li.cil.oc.common.tileentity.Charger charger = (li.cil.oc.common.tileentity.Charger)tileEntity;
/* 50 */       if (!world.field_72995_K) {
/* 51 */         charger.invertSignal_$eq(!charger.invertSignal());
/* 52 */         charger.chargeSpeed_$eq(1.0D - charger.chargeSpeed());
/* 53 */         PacketSender$.MODULE$.sendChargerState(charger);
/* 54 */         Wrench$.MODULE$.wrenchUsed(player, BlockPosition$.MODULE$.apply(x, y, z));
/*    */       } 
/* 56 */       bool = true; }
/* 57 */     else { bool = false; }
/*    */     
/* 59 */     return Wrench$.MODULE$.holdsApplicableWrench(player, BlockPosition$.MODULE$.apply(x, y, z)) ? bool : GUI.class.onBlockActivated(this, world, x, y, z, player, side, hitX, hitY, hitZ);
/*    */   }
/*    */   public void func_149695_a(World world, int x, int y, int z, Block block) {
/* 62 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 63 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Charger) { li.cil.oc.common.tileentity.Charger charger = (li.cil.oc.common.tileentity.Charger)tileEntity; charger.onNeighborChanged(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 64 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/* 66 */     super.func_149695_a(world, x, y, z, block);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Charger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */