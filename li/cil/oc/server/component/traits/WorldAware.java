/*    */ package li.cil.oc.server.component.traits;
/*    */ 
/*    */ import li.cil.oc.util.BlockPosition;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ import net.minecraft.util.AxisAlignedBB;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.Option;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.mutable.Buffer;
/*    */ import scala.reflect.ClassTag;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005mcaB\001\003!\003\r\ta\004\002\013/>\024H\016Z!xCJ,'BA\002\005\003\031!(/Y5ug*\021QAB\001\nG>l\007o\0348f]RT!a\002\005\002\rM,'O^3s\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\003\001A\001\"!\005\013\016\003IQ\021aE\001\006g\016\fG.Y\005\003+I\021a!\0218z%\0264\007\"B\f\001\t\003A\022A\002\023j]&$H\005F\001\032!\t\t\"$\003\002\034%\t!QK\\5u\021\025i\002A\"\001\037\003!\001xn]5uS>tW#A\020\021\005\001\032S\"A\021\013\005\tB\021\001B;uS2L!\001J\021\003\033\tcwnY6Q_NLG/[8o\021\0251\003\001\"\001(\003\0259xN\0357e+\005A\003CA\0250\033\005Q#B\001\024,\025\taS&A\005nS:,7M]1gi*\ta&A\002oKRL!\001\r\026\003\013]{'\017\0343\t\013I\002A\021A\032\002\025\031\f7.\032)mCf,'/F\0015!\t)$(D\0017\025\t9\004(\001\004qY\006LXM\035\006\003s-\na!\0328uSRL\030BA\0367\0051)e\016^5usBc\027-_3s\021\025i\004\001\"\001?\003-i\027-_%oi\026\024\030m\031;\025\007}\022E\t\005\002\022\001&\021\021I\005\002\b\005>|G.Z1o\021\025\031E\b1\001 \003!\021Gn\\2l!>\034\b\"B#=\001\0041\025\001\0024bG\026\004\"aR'\016\003!S!AI%\013\005)[\025AB2p[6|gN\003\002M[\005qQ.\0338fGJ\fg\r\0364pe\036,\027B\001(I\00591uN]4f\t&\024Xm\031;j_:DQ\001\025\001\005\002E\013\001#\0328uSRLWm]%o\005>,h\016Z:\026\005IsFCA*q)\t!\006\016E\002V5rk\021A\026\006\003/b\013q!\\;uC\ndWM\003\002Z%\005Q1m\0347mK\016$\030n\0348\n\005m3&A\002\"vM\032,'\017\005\002^=2\001A!B0P\005\004\001'\001\002+za\026\f\"!\0313\021\005E\021\027BA2\023\005\035qu\016\0365j]\036\004\"!\0324\016\003aJ!a\032\035\003\r\025sG/\033;z\021\035Iw*!AA\004)\f!\"\032<jI\026t7-\032\0232!\rYg\016X\007\002Y*\021QNE\001\be\0264G.Z2u\023\tyGN\001\005DY\006\0348\017V1h\021\025\tx\n1\001s\003\031\021w.\0368egB\0211/^\007\002i*\021!eK\005\003mR\024Q\"\021=jg\006c\027n\0328fI\n\023\005\"\002=\001\t\003I\030aD3oi&$\030.Z:J]\ncwnY6\026\005itHcA>\002\006Q\021Ap \t\004+jk\bCA/\t\025yvO1\001a\021%\t\ta^A\001\002\b\t\031!\001\006fm&$WM\\2fII\0022a\0338~\021\025\031u\0171\001 \021\035\tI\001\001C\001\003\027\ta\"\0328uSRLWm](o'&$W-\006\003\002\016\005UA\003BA\b\003;!B!!\005\002\030A!QKWA\n!\ri\026Q\003\003\007?\006\035!\031\0011\t\025\005e\021qAA\001\002\b\tY\"\001\006fm&$WM\\2fIM\002Ba\0338\002\024!9\021qDA\004\001\0041\025\001B:jI\026Dq!a\t\001\t\003\t)#A\007dY>\034Xm\035;F]RLG/_\013\005\003O\t\031\004\006\003\002*\005mB\003BA\026\003k\001R!EA\027\003cI1!a\f\023\005\031y\005\017^5p]B\031Q,a\r\005\r}\013\tC1\001a\021)\t9$!\t\002\002\003\017\021\021H\001\013KZLG-\0328dK\022\"\004\003B6o\003cAq!a\b\002\"\001\007a\tC\004\002@\001!\t!!\021\002\031\tdwnY6D_:$XM\034;\025\t\005\r\023\021\f\t\007#\005\025s(!\023\n\007\005\035#C\001\004UkBdWM\r\t\005\003\027\n)&\004\002\002N)!\021qJA)\003\021a\027M\\4\013\005\005M\023\001\0026bm\006LA!a\026\002N\t11\013\036:j]\036Dq!a\b\002>\001\007a\t")
/*    */ public interface WorldAware
/*    */ {
/*    */   BlockPosition position();
/*    */   
/*    */   World world();
/*    */   
/*    */   EntityPlayer fakePlayer();
/*    */   
/*    */   boolean mayInteract(BlockPosition paramBlockPosition, ForgeDirection paramForgeDirection);
/*    */   
/*    */   <Type extends Entity> Buffer<Type> entitiesInBounds(AxisAlignedBB paramAxisAlignedBB, ClassTag<Type> paramClassTag);
/*    */   
/*    */   <Type extends Entity> Buffer<Type> entitiesInBlock(BlockPosition paramBlockPosition, ClassTag<Type> paramClassTag);
/*    */   
/*    */   <Type extends Entity> Buffer<Type> entitiesOnSide(ForgeDirection paramForgeDirection, ClassTag<Type> paramClassTag);
/*    */   
/*    */   <Type extends Entity> Option<Type> closestEntity(ForgeDirection paramForgeDirection, ClassTag<Type> paramClassTag);
/*    */   
/*    */   Tuple2<Object, String> blockContent(ForgeDirection paramForgeDirection);
/*    */   
/*    */   public final class WorldAware$$anonfun$entitiesInBounds$1
/*    */     extends AbstractFunction1<Object, Type>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final Type apply(Object x$1) {
/* 52 */       return (Type)x$1;
/*    */     }
/*    */     
/*    */     public WorldAware$$anonfun$entitiesInBounds$1(WorldAware $outer) {}
/*    */   }
/*    */   
/*    */   public final class WorldAware$$anonfun$closestEntity$1
/*    */     extends AbstractFunction1<Entity, Type>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final Type apply(Entity x$2) {
/* 65 */       return (Type)x$2;
/*    */     }
/*    */     
/*    */     public WorldAware$$anonfun$closestEntity$1(WorldAware $outer) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\traits\WorldAware.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */