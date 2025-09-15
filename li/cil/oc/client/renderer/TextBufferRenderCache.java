/*    */ package li.cil.oc.client.renderer;
/*    */ 
/*    */ import com.google.common.cache.RemovalNotification;
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import cpw.mods.fml.common.gameevent.TickEvent;
/*    */ import li.cil.oc.client.renderer.font.TextBufferRenderData;
/*    */ import li.cil.oc.client.renderer.font.TextureFontRenderer;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import scala.Serializable;
/*    */ import scala.reflect.ScalaSignature;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\025s!B\001\003\021\003i\021!\006+fqR\024UO\0324feJ+g\016Z3s\007\006\034\007.\032\006\003\007\021\t\001B]3oI\026\024XM\035\006\003\013\031\taa\0317jK:$(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001A\021abD\007\002\005\031)\001C\001E\001#\t)B+\032=u\005V4g-\032:SK:$WM]\"bG\",7\003B\b\0235!\002\"a\005\r\016\003QQ!!\006\f\002\t1\fgn\032\006\002/\005!!.\031<b\023\tIBC\001\004PE*,7\r\036\t\0047\001\022S\"\001\017\013\005uq\022AC2p]\016,(O]3oi*\021qDF\001\005kRLG.\003\002\"9\tA1)\0317mC\ndW\r\005\002$M5\tAEC\001&\003\025\0318-\0317b\023\t9CEA\002J]R\004B!\013\0325E5\t!F\003\002,Y\005)1-Y2iK*\021QFL\001\007G>lWn\0348\013\005=\002\024AB4p_\036dWMC\0012\003\r\031w.\\\005\003g)\022qBU3n_Z\fG\016T5ti\026tWM\035\t\003kqj\021A\016\006\003oa\n!\002^5mK\026tG/\033;z\025\tI$(A\005nS:,7M]1gi*\t1(A\002oKRL!!\020\034\003\025QKG.Z#oi&$\030\020C\003@\037\021\005\001)\001\004=S:LGO\020\013\002\033!91a\004b\001\n\003\021U#A\"\021\005\021;U\"A#\013\005\031\023\021\001\0024p]RL!\001S#\003'Q+\007\020^;sK\032{g\016\036*f]\022,'/\032:\t\r){\001\025!\003D\003%\021XM\0343fe\026\024\b\005C\004,\037\t\007I\021\002'\026\0035\003B!\013(QE%\021qJ\013\002\006\007\006\034\007.\032\t\003\tFK!AU#\003)Q+\007\020\036\"vM\032,'OU3oI\026\024H)\031;b\021\031!v\002)A\005\033\00611-Y2iK\002B\021BV\bA\002\003\007I\021B,\002\033\r,(O]3oi\n+hMZ3s+\005\001\006\"C-\020\001\004\005\r\021\"\003[\003E\031WO\035:f]R\024UO\0324fe~#S-\035\013\0037z\003\"a\t/\n\005u##\001B+oSRDqa\030-\002\002\003\007\001+A\002yIEBa!Y\b!B\023\001\026AD2veJ,g\016\036\"vM\032,'\017\t\005\006G>!\t\001Z\001\007e\026tG-\032:\025\005m+\007\"\0024c\001\004\001\026A\0022vM\032,'\017C\003i\037\021%\021.A\007d_6\004\030\016\\3Pe\022\023\030m\036\013\003U6\004\"aI6\n\0051$#AB!osZ\013G\016C\003oO\002\007!%\001\003mSN$\b\"\0029\020\t\003\t\030\001B2bY2$\022A\t\005\006g>!\t\001^\001\n_:\024V-\\8wC2$\"aW;\t\013Y\024\b\031A<\002\003\025\004B!\013=5E%\021\021P\013\002\024%\026lwN^1m\035>$\030NZ5dCRLwN\034\005\006w>!\t\001`\001\007_:$\026nY6\025\005mk\b\"\002<{\001\004q\bcA@\00229!\021\021AA\026\035\021\t\031!!\n\017\t\005\025\021\021\005\b\005\003\017\tYB\004\003\002\n\005Ua\002BA\006\003#i!!!\004\013\007\005=A\"\001\004=e>|GOP\005\003\003'\t1a\0319x\023\021\t9\"!\007\002\t5|Gm\035\006\003\003'IA!!\b\002 \005\031a-\0347\013\t\005]\021\021D\005\004[\005\r\"\002BA\017\003?IA!a\n\002*\005Iq-Y7fKZ,g\016\036\006\004[\005\r\022\002BA\027\003_\t\021\002V5dW\0263XM\034;\013\t\005\035\022\021F\005\005\003g\t)DA\bDY&,g\016\036+jG.,e/\0328u\025\021\ti#a\f)\007i\fI\004\005\003\002<\005\005SBAA\037\025\021\ty$!\013\002\031\0254XM\034;iC:$G.\032:\n\t\005\r\023Q\b\002\017'V\0247o\031:jE\026,e/\0328u\001")
/*    */ public final class TextBufferRenderCache
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onTick(TickEvent.ClientTickEvent paramClientTickEvent) {
/*    */     TextBufferRenderCache$.MODULE$.onTick(paramClientTickEvent);
/*    */   }
/*    */   
/*    */   public static void onRemoval(RemovalNotification<TileEntity, Object> paramRemovalNotification) {
/*    */     TextBufferRenderCache$.MODULE$.onRemoval(paramRemovalNotification);
/*    */   }
/*    */   
/*    */   public static int call() {
/*    */     return TextBufferRenderCache$.MODULE$.call();
/*    */   }
/*    */   
/*    */   public static void render(TextBufferRenderData paramTextBufferRenderData) {
/*    */     TextBufferRenderCache$.MODULE$.render(paramTextBufferRenderData);
/*    */   }
/*    */   
/*    */   public static TextureFontRenderer renderer() {
/*    */     return TextBufferRenderCache$.MODULE$.renderer();
/*    */   }
/*    */   
/*    */   public final class TextBufferRenderCache$$anonfun$compileOrDraw$1
/*    */     extends AbstractFunction1<int[], BoxedUnit>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(int[] line) {
/* 46 */       TextBufferRenderCache$.MODULE$.renderer().generateChars(line);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\TextBufferRenderCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */