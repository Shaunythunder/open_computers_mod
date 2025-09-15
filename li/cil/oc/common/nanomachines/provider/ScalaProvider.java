/*    */ package li.cil.oc.common.nanomachines.provider;
/*    */ import li.cil.oc.api.nanomachines.Behavior;
/*    */ import li.cil.oc.api.prefab.AbstractProvider;
/*    */ import net.minecraft.entity.player.EntityPlayer;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001Y3Q!\001\002\002\002=\021QbU2bY\006\004&o\034<jI\026\024(BA\002\005\003!\001(o\034<jI\026\024(BA\003\007\0031q\027M\\8nC\016D\027N\\3t\025\t9\001\"\001\004d_6lwN\034\006\003\023)\t!a\\2\013\005-a\021aA2jY*\tQ\"\001\002mS\016\0011C\001\001\021!\t\tb#D\001\023\025\t\031B#\001\004qe\0264\027M\031\006\003+!\t1!\0319j\023\t9\"C\001\tBEN$(/Y2u!J|g/\0333fe\"A\021\004\001B\001B\003%!$\001\002jIB\0211$\t\b\0039}i\021!\b\006\002=\005)1oY1mC&\021\001%H\001\007!J,G-\0324\n\005\t\032#AB*ue&twM\003\002!;!)Q\005\001C\001M\0051A(\0338jiz\"\"aJ\025\021\005!\002Q\"\001\002\t\013e!\003\031\001\016\t\013-\002a\021\001\027\002)\r\024X-\031;f'\016\fG.\031\"fQ\0064\030n\034:t)\tic\bE\002/mer!a\f\033\017\005A\032T\"A\031\013\005Ir\021A\002\037s_>$h(C\001\037\023\t)T$A\004qC\016\\\027mZ3\n\005]B$\001C%uKJ\f'\r\\3\013\005Uj\002C\001\036=\033\005Y$BA\003\025\023\ti4H\001\005CK\"\fg/[8s\021\025y$\0061\001A\003\031\001H.Y=feB\021\021)S\007\002\005*\021qh\021\006\003\t\026\013a!\0328uSRL(B\001$H\003%i\027N\\3de\0064GOC\001I\003\rqW\r^\005\003\025\n\023A\"\0228uSRL\b\013\\1zKJDQ\001\024\001\005B5\013qb\031:fCR,')\0325bm&|'o\035\013\003\035V\0032a\024+:\033\005\001&BA)S\003\021a\027M\\4\013\003M\013AA[1wC&\021q\007\025\005\006-\003\r\001\021")
/*    */ public abstract class ScalaProvider extends AbstractProvider {
/*    */   public ScalaProvider(String id) {
/*  9 */     super(id);
/*    */   }
/*    */   public Iterable<Behavior> createBehaviors(EntityPlayer player) {
/* 12 */     return WrapAsJava$.MODULE$.asJavaIterable(createScalaBehaviors(player));
/*    */   }
/*    */   
/*    */   public abstract Iterable<Behavior> createScalaBehaviors(EntityPlayer paramEntityPlayer);
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\provider\ScalaProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */