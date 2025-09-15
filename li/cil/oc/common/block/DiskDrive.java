/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005]d\001B\001\003\0015\021\021\002R5tW\022\023\030N^3\013\005\r!\021!\0022m_\016\\'BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001q!\003\005\002\020!5\t!!\003\002\022\005\tY1+[7qY\026\024En\\2l!\t\031b#D\001\025\025\t)\"!\001\004ue\006LGo]\005\003/Q\0211aR+J\021\025I\002\001\"\001\033\003\031a\024N\\5u}Q\t1\004\005\002\020\001!)Q\004\001C)=\005q1-^:u_6$V\r\037;ve\026\034X#A\020\021\007\001\032S%D\001\"\025\005\021\023!B:dC2\f\027B\001\023\"\005\025\t%O]1z!\r\001c\005K\005\003O\005\022aa\0249uS>t\007CA\025-\035\t\001#&\003\002,C\0051\001K]3eK\032L!!\f\030\003\rM#(/\0338h\025\tY\023\005C\0031\001\021E\023'A\006u_>dG/\0339UC&dGC\002\0326u\031{\025\f\005\002!g%\021A'\t\002\005+:LG\017C\0037_\001\007q'\001\005nKR\fG-\031;b!\t\001\003(\003\002:C\t\031\021J\034;\t\013mz\003\031\001\037\002\013M$\030mY6\021\005u\"U\"\001 \013\005}\002\025\001B5uK6T!!\021\"\002\0235Lg.Z2sC\032$(\"A\"\002\0079,G/\003\002F}\tI\021\n^3n'R\f7m\033\005\006\017>\002\r\001S\001\007a2\f\0270\032:\021\005%kU\"\001&\013\005\035[%B\001'A\003\031)g\016^5us&\021aJ\023\002\r\013:$\030\016^=QY\006LXM\035\005\006!>\002\r!U\001\bi>|G\016^5q!\r\021v\013K\007\002'*\021A+V\001\005kRLGNC\001W\003\021Q\027M^1\n\005a\033&\001\002'jgRDQAW\030A\002m\013\001\"\0313wC:\034W\r\032\t\003AqK!!X\021\003\017\t{w\016\\3b]\")q\f\001C!A\0069q-^5UsB,W#A1\023\007\tD7N\002\003d\001\001\t'\001\004\037sK\032Lg.Z7f]Rt\024BA3g\003)!\025n]6Ee&4X\r\t\006\003O\022\tqaR;j)f\004X\r\005\002!S&\021!.\t\002\007\003:L(+\0324\021\0051|gBA7o\033\005!\021BA4\005\023\t\001hMA\004F]Vlg+\0317\t\013I\024G\021A:\002\017M,(\rV=qKV\tAOE\002vQj4Aa\031\001\001i&\021q\017_\001\007\0052|7m\033\021\013\005e4\027\001C\"bi\026<wN]=\021\005mlhB\0017}\023\tIh-\003\002qq\"1q\020\001C!\003\003\tQ\002[1t)&dW-\0228uSRLHcA.\002\004!)aG a\001o!9\021q\001\001\005B\005%\021\001E2sK\006$X\rV5mK\026sG/\033;z)\031\tY!!\006\002$A!\021QBA\n\033\t\tyAC\002\002\022\021\t!\002^5mK\026tG/\033;z\023\r\t\021q\002\005\t\003/\t)\0011\001\002\032\005)qo\034:mIB!\0211DA\020\033\t\tiBC\002\002\030\001KA!!\t\002\036\t)qk\034:mI\"1a'!\002A\002]Bq!a\n\001\t\003\nI#\001\016iCN\034u.\0349be\006$xN]%oaV$xJ^3se&$W\rF\001\\\021\035\ti\003\001C!\003_\t!dZ3u\007>l\007/\031:bi>\024\030J\0349vi>3XM\035:jI\026$2bNA\031\003g\t9$a\017\002@!A\021qCA\026\001\004\tI\002C\004\0026\005-\002\031A\034\002\003aDq!!\017\002,\001\007q'A\001z\021\035\ti$a\013A\002]\n\021A\037\005\b\003\003\nY\0031\0018\003\021\031\030\016Z3\t\017\005\025\003\001\"\021\002H\005\001rN\034\"m_\016\\\027i\031;jm\006$X\r\032\013\0247\006%\0231JA'\003\037\n\t&a\025\002f\005=\0241\017\005\t\003/\t\031\0051\001\002\032!9\021QGA\"\001\0049\004bBA\035\003\007\002\ra\016\005\b\003{\t\031\0051\0018\021\0319\0251\ta\001\021\"A\021\021IA\"\001\004\t)\006\005\003\002X\005\005TBAA-\025\r!\0261\f\006\004\013\005u#bAA0\005\006qQ.\0338fGJ\fg\r\0364pe\036,\027\002BA2\0033\022aBR8sO\026$\025N]3di&|g\016\003\005\002h\005\r\003\031AA5\003\021A\027\016\036-\021\007\001\nY'C\002\002n\005\022QA\0227pCRD\001\"!\035\002D\001\007\021\021N\001\005Q&$\030\f\003\005\002v\005\r\003\031AA5\003\021A\027\016\036.")
/*    */ public class DiskDrive extends SimpleBlock implements GUI {
/* 12 */   public DiskDrive() { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); GUI.class.$init$(this); } public Option<String>[] customTextures() {
/* 13 */     (new Option[6])[0] = 
/* 14 */       (Option)None$.MODULE$;
/* 15 */     (new Option[6])[1] = (Option)None$.MODULE$;
/* 16 */     (new Option[6])[2] = (Option)new Some("DiskDriveSide");
/* 17 */     (new Option[6])[3] = (Option)new Some("DiskDriveFront");
/* 18 */     (new Option[6])[4] = (Option)new Some("DiskDriveSide");
/* 19 */     (new Option[6])[5] = (Option)new Some("DiskDriveSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */ 
/*    */   
/*    */   public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/* 25 */     super.tooltipTail(metadata, stack, player, tooltip, advanced);
/* 26 */     if (Mods$.MODULE$.ComputerCraft().isAvailable()) {
/* 27 */       tooltip.addAll(Tooltip$.MODULE$.get((new StringBuilder()).append(getClass().getSimpleName()).append(".CC").toString(), (Seq)Predef$.MODULE$.genericWrapArray(new Object[0])));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public GuiType.EnumVal guiType() {
/* 33 */     return GuiType$.MODULE$.DiskDrive();
/*    */   } public boolean hasTileEntity(int metadata) {
/* 35 */     return true;
/*    */   } public li.cil.oc.common.tileentity.DiskDrive createTileEntity(World world, int metadata) {
/* 37 */     return new li.cil.oc.common.tileentity.DiskDrive();
/*    */   }
/*    */   
/*    */   public boolean func_149740_M() {
/* 41 */     return true;
/*    */   }
/*    */   public int func_149736_g(World world, int x, int y, int z, int side) {
/* 44 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 45 */     if (tileEntity instanceof li.cil.oc.common.tileentity.DiskDrive) { li.cil.oc.common.tileentity.DiskDrive diskDrive = (li.cil.oc.common.tileentity.DiskDrive)tileEntity; if (diskDrive.func_70301_a(0) != null) return 15;  }
/* 46 */      return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/*    */     boolean bool;
/* 54 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 55 */     if (tileEntity instanceof li.cil.oc.common.tileentity.DiskDrive) { li.cil.oc.common.tileentity.DiskDrive diskDrive = (li.cil.oc.common.tileentity.DiskDrive)tileEntity;
/* 56 */       boolean isDiskInDrive = !(diskDrive.func_70301_a(0) == null);
/* 57 */       boolean isHoldingDisk = diskDrive.func_94041_b(0, player.func_70694_bm());
/* 58 */       isDiskInDrive ? (
/* 59 */         world.field_72995_K ? BoxedUnit.UNIT : 
/* 60 */         BoxesRunTime.boxToBoolean(diskDrive.dropSlot(0, 1, Option$.MODULE$.apply(diskDrive.facing())))) : BoxedUnit.UNIT;
/*    */ 
/*    */       
/* 63 */       if (isHoldingDisk)
/*    */       {
/* 65 */         diskDrive.func_70299_a(0, player.field_71071_by.func_70298_a(player.field_71071_by.field_70461_c, 1));
/*    */       }
/* 67 */       bool = (isDiskInDrive || isHoldingDisk) ? true : false; }
/* 68 */     else { bool = false; }
/*    */     
/* 70 */     return player.func_70093_af() ? bool : GUI.class.onBlockActivated(this, world, x, y, z, player, side, hitX, hitY, hitZ);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\DiskDrive.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */