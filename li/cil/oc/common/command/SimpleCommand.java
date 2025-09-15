/*    */ package li.cil.oc.common.command;
/*    */ import net.minecraft.command.ICommandSender;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ import scala.collection.convert.WrapAsJava$;
/*    */ import scala.collection.mutable.ListBuffer;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001=4Q!\001\002\002\0025\021QbU5na2,7i\\7nC:$'BA\002\005\003\035\031w.\\7b]\022T!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\003\0019\001\"aD\013\016\003AQ!aA\t\013\005I\031\022!C7j]\026\034'/\0314u\025\005!\022a\0018fi&\021a\003\005\002\f\007>lW.\0318e\005\006\034X\r\003\005\031\001\t\025\r\021\"\001\032\003\021q\027-\\3\026\003i\001\"aG\021\017\005qyR\"A\017\013\003y\tQa]2bY\006L!\001I\017\002\rA\023X\rZ3g\023\t\0213E\001\004TiJLgn\032\006\003AuA\001\"\n\001\003\002\003\006IAG\001\006]\006lW\r\t\005\006O\001!\t\001K\001\007y%t\027\016\036 \025\005%Z\003C\001\026\001\033\005\021\001\"\002\r'\001\004Q\002bB\027\001\001\004%\tBL\001\bC2L\027m]3t+\005y\003c\001\031655\t\021G\003\0023g\0059Q.\036;bE2,'B\001\033\036\003)\031w\016\0347fGRLwN\\\005\003mE\022!\002T5ti\n+hMZ3s\021\035A\004\0011A\005\022e\n1\"\0317jCN,7o\030\023fcR\021!(\020\t\0039mJ!\001P\017\003\tUs\027\016\036\005\b}]\n\t\0211\0010\003\rAH%\r\005\007\001\002\001\013\025B\030\002\021\005d\027.Y:fg\002BQA\021\001\005B\r\013abZ3u\007>lW.\0318e\035\006lW\rF\001\033\021\025)\005\001\"\021G\003E9W\r^\"p[6\fg\016Z!mS\006\034Xm\035\013\002\017B\031\001*\024\016\016\003%S!AS&\002\tU$\030\016\034\006\002\031\006!!.\031<b\023\tq\025J\001\003MSN$\b\"\002)\001\t\003\n\026AG2b]\016{W.\\1oIN+g\016Z3s+N,7i\\7nC:$GC\001*V!\ta2+\003\002U;\t9!i\\8mK\006t\007\"\002,P\001\0049\026AB:pkJ\034W\r\005\002\0201&\021\021\f\005\002\017\023\016{W.\\1oIN+g\016Z3s\021\025Y\006\001\"\021]\003=I7/V:fe:\fW.Z%oI\026DHc\001*^C\")1A\027a\001=B\031Ad\030\016\n\005\001l\"!B!se\006L\b\"\0022[\001\004\031\027!A5\021\005q!\027BA3\036\005\rIe\016\036\005\006O\002!\t\005[\001\030C\022$G+\0312D_6\004H.\032;j_:|\005\017^5p]N$2![7o!\rAUJ\033\t\0039-L!\001\\\017\003\r\005s\027PU3g\021\0251f\r1\001X\021\025\031a\r1\001_\001")
/*    */ public abstract class SimpleCommand extends CommandBase {
/*    */   public String name() {
/* 10 */     return this.name;
/* 11 */   } private final String name; private ListBuffer<String> aliases = (ListBuffer<String>)ListBuffer$.MODULE$.empty(); public ListBuffer<String> aliases() { return this.aliases; } public void aliases_$eq(ListBuffer<String> x$1) { this.aliases = x$1; }
/*    */    public String func_71517_b() {
/* 13 */     return name();
/*    */   } public List<String> func_71514_a() {
/* 15 */     return WrapAsJava$.MODULE$.bufferAsJavaList((Buffer)aliases());
/*    */   } public boolean func_71519_b(ICommandSender source) {
/* 17 */     return (super.func_71519_b(source) || (MinecraftServer.func_71276_C() != null && MinecraftServer.func_71276_C().func_71264_H()));
/*    */   } public boolean func_82358_a(String[] command, int i) {
/* 19 */     return false;
/*    */   } public List<Object> func_71516_a(ICommandSender source, String[] command) {
/* 21 */     return WrapAsJava$.MODULE$.seqAsJavaList((Seq)List$.MODULE$.empty());
/*    */   }
/*    */   
/*    */   public SimpleCommand(String name) {}
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\command\SimpleCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */