/*    */ package li.cil.oc.common.block;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001M4A!\001\002\001\033\tAq+Y=q_&tGO\003\002\004\t\005)!\r\\8dW*\021QAB\001\007G>lWn\0348\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001a\005\002\001\035A\021q\002E\007\002\005%\021\021C\001\002\016%\026$7\017^8oK\006;\030M]3\t\013M\001A\021\001\013\002\rqJg.\033;?)\005)\002CA\b\001\021\0259\002\001\"\025\031\0039\031Wo\035;p[R+\007\020^;sKN,\022!\007\t\0045uyR\"A\016\013\003q\tQa]2bY\006L!AH\016\003\013\005\023(/Y=\021\007i\001#%\003\002\"7\t1q\n\035;j_:\004\"a\t\024\017\005i!\023BA\023\034\003\031\001&/\0323fM&\021q\005\013\002\007'R\024\030N\\4\013\005\025Z\002\"\002\026\001\t\003Z\023\001E2sK\006$X\rV5mK\026sG/\033;z)\ra\023\007\020\t\003[Aj\021A\f\006\003_\021\t!\002^5mK\026tG/\033;z\023\t\ta\006C\0033S\001\0071'A\003x_JdG\r\005\0025u5\tQG\003\0023m)\021q\007O\001\n[&tWm\031:bMRT\021!O\001\004]\026$\030BA\0366\005\0259vN\0357e\021\025i\024\0061\001?\003!iW\r^1eCR\f\007C\001\016@\023\t\0015DA\002J]RDQA\021\001\005B\r\013\001c\0348CY>\0347.Q2uSZ\fG/\0323\025\025\021;\005J\023'O/\n<\027\016\005\002\033\013&\021ai\007\002\b\005>|G.Z1o\021\025\021\024\t1\0014\021\025I\025\t1\001?\003\005A\b\"B&B\001\004q\024!A=\t\0135\013\005\031\001 \002\003iDQaT!A\002A\013a\001\0357bs\026\024\bCA)V\033\005\021&BA(T\025\t!f'\001\004f]RLG/_\005\003-J\023A\"\0228uSRL\b\013\\1zKJDQ\001W!A\002e\013Aa]5eKB\021!\fY\007\0027*\021A,X\001\005kRLGN\003\002\006=*\021q\fO\001\017[&tWm\031:bMR4wN]4f\023\t\t7L\001\bG_J<W\rR5sK\016$\030n\0348\t\013\r\f\005\031\0013\002\t!LG\017\027\t\0035\025L!AZ\016\003\013\031cw.\031;\t\013!\f\005\031\0013\002\t!LG/\027\005\006U\006\003\r\001Z\001\005Q&$(\fC\003m\001\021\005S.A\thKR4\026\r\\5e%>$\030\r^5p]N$RA\\8qcJ\0042AG\017Z\021\025\0214\0161\0014\021\025I5\0161\001?\021\025Y5\0161\001?\021\025i5\0161\001?\001")
/*    */ public class Waypoint extends RedstoneAware {
/*    */   public Option<String>[] customTextures() {
/* 11 */     (new Option[6])[0] = 
/* 12 */       (Option)None$.MODULE$;
/* 13 */     (new Option[6])[1] = (Option)new Some("WaypointTop");
/* 14 */     (new Option[6])[2] = (Option)new Some("WaypointBack");
/* 15 */     (new Option[6])[3] = (Option)new Some("WaypointFront");
/* 16 */     (new Option[6])[4] = (Option)new Some("WaypointSide");
/* 17 */     (new Option[6])[5] = (Option)new Some("WaypointSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   
/*    */   public li.cil.oc.common.tileentity.Waypoint createTileEntity(World world, int metadata) {
/* 22 */     return new li.cil.oc.common.tileentity.Waypoint();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/* 28 */     if (world.field_72995_K) {
/* 29 */       player.openGui(OpenComputers$.MODULE$, GuiType$.MODULE$.Waypoint().id(), world, x, y, z);
/*    */     }
/*    */ 
/*    */     
/* 33 */     return player.func_70093_af() ? super.onBlockActivated(world, x, y, z, player, side, hitX, hitY, hitZ) : true;
/*    */   }
/*    */   public ForgeDirection[] getValidRotations(World world, int x, int y, int z) {
/*    */     ForgeDirection[] arrayOfForgeDirection;
/* 37 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 38 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Waypoint) { li.cil.oc.common.tileentity.Waypoint waypoint = (li.cil.oc.common.tileentity.Waypoint)tileEntity;
/* 39 */       arrayOfForgeDirection = (ForgeDirection[])Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).filter(
/* 40 */           (Function1)new Waypoint$$anonfun$getValidRotations$1(this, waypoint)); }
/*    */     else
/* 42 */     { arrayOfForgeDirection = super.getValidRotations(world, x, y, z); }
/*    */     
/*    */     return arrayOfForgeDirection;
/*    */   }
/*    */   
/*    */   public final class Waypoint$$anonfun$getValidRotations$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final li.cil.oc.common.tileentity.Waypoint x2$1;
/*    */     
/*    */     public final boolean apply(ForgeDirection d) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: aload_0
/*    */       //   2: getfield x2$1 : Lli/cil/oc/common/tileentity/Waypoint;
/*    */       //   5: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */       //   8: astore_2
/*    */       //   9: dup
/*    */       //   10: ifnonnull -> 21
/*    */       //   13: pop
/*    */       //   14: aload_2
/*    */       //   15: ifnull -> 59
/*    */       //   18: goto -> 28
/*    */       //   21: aload_2
/*    */       //   22: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   25: ifne -> 59
/*    */       //   28: aload_1
/*    */       //   29: aload_0
/*    */       //   30: getfield x2$1 : Lli/cil/oc/common/tileentity/Waypoint;
/*    */       //   33: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */       //   36: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*    */       //   39: astore_3
/*    */       //   40: dup
/*    */       //   41: ifnonnull -> 52
/*    */       //   44: pop
/*    */       //   45: aload_3
/*    */       //   46: ifnull -> 59
/*    */       //   49: goto -> 63
/*    */       //   52: aload_3
/*    */       //   53: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */       //   56: ifeq -> 63
/*    */       //   59: iconst_0
/*    */       //   60: goto -> 64
/*    */       //   63: iconst_1
/*    */       //   64: ireturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #40	-> 0
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	65	0	this	Lli/cil/oc/common/block/Waypoint$$anonfun$getValidRotations$1;
/*    */       //   0	65	1	d	Lnet/minecraftforge/common/util/ForgeDirection;
/*    */     }
/*    */     
/*    */     public Waypoint$$anonfun$getValidRotations$1(Waypoint $outer, li.cil.oc.common.tileentity.Waypoint x2$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Waypoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */