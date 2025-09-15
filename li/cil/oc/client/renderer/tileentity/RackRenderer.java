/*    */ package li.cil.oc.client.renderer.tileentity;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.Event;
/*    */ import li.cil.oc.api.event.RackMountableRenderEvent;
/*    */ import li.cil.oc.api.internal.Rack;
/*    */ import li.cil.oc.common.tileentity.Rack;
/*    */ import net.minecraft.client.gui.FontRenderer;
/*    */ import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import org.lwjgl.opengl.GL11;
/*    */ import scala.Serializable;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\0019;Q!\001\002\t\002=\tABU1dWJ+g\016Z3sKJT!a\001\003\002\025QLG.Z3oi&$\030P\003\002\006\r\005A!/\0328eKJ,'O\003\002\b\021\00511\r\\5f]RT!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001!\t\001\022#D\001\003\r\025\021\"\001#\001\024\0051\021\026mY6SK:$WM]3s'\t\tB\003\005\002\026;5\taC\003\002\004/)\021Q\001\007\006\003\017eQ!AG\016\002\0235Lg.Z2sC\032$(\"\001\017\002\0079,G/\003\002\037-\tIB+\0337f\013:$\030\016^=Ta\026\034\027.\0317SK:$WM]3s\021\025\001\023\003\"\001\"\003\031a\024N\\5u}Q\tq\002C\004$#\t\007IQ\002\023\002\017Y|eMZ:fiV\tQeD\001'?\021q\004\001\001\001\t\r!\n\002\025!\004&\003!1xJ\0324tKR\004\003b\002\026\022\005\004%iaK\001\006mNK'0Z\013\002Y=\tQf\b\003?\001\002\001\001BB\030\022A\0035A&\001\004w'&TX\r\t\005\006cE!\tEM\001\023e\026tG-\032:US2,WI\034;jif\fE\017\006\0044s\001+u)\023\t\003i]j\021!\016\006\002m\005)1oY1mC&\021\001(\016\002\005+:LG\017C\003;a\001\0071(\001\006uS2,WI\034;jif\004\"\001\020 \016\003uR!aA\r\n\005}j$A\003+jY\026,e\016^5us\")\021\t\ra\001\005\006\t\001\020\005\0025\007&\021A)\016\002\007\t>,(\r\\3\t\013\031\003\004\031\001\"\002\003eDQ\001\023\031A\002\t\013\021A\037\005\006\025B\002\raS\001\002MB\021A\007T\005\003\033V\022QA\0227pCR\004")
/*    */ public final class RackRenderer {
/*    */   public static void renderTileEntityAt(TileEntity paramTileEntity, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
/*    */     RackRenderer$.MODULE$.func_147500_a(paramTileEntity, paramDouble1, paramDouble2, paramDouble3, paramFloat);
/*    */   }
/*    */   
/*    */   public static FontRenderer func_147498_b() {
/*    */     return RackRenderer$.MODULE$.func_147498_b();
/*    */   }
/*    */   
/*    */   public static void func_147496_a(World paramWorld) {
/*    */     RackRenderer$.MODULE$.func_147496_a(paramWorld);
/*    */   }
/*    */   
/*    */   public static void func_147497_a(TileEntityRendererDispatcher paramTileEntityRendererDispatcher) {
/*    */     RackRenderer$.MODULE$.func_147497_a(paramTileEntityRendererDispatcher);
/*    */   }
/*    */   
/*    */   public final class RackRenderer$$anonfun$renderTileEntityAt$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/* 37 */     public final void apply(int i) { apply$mcVI$sp(i); } private final Rack rack$1; public RackRenderer$$anonfun$renderTileEntityAt$1(Rack rack$1) {} public void apply$mcVI$sp(int i) {
/* 38 */       if (this.rack$1.func_70301_a(i) != null) {
/* 39 */         GL11.glPushMatrix();
/* 40 */         GL11.glPushAttrib(1048575);
/*    */         
/* 42 */         float v0 = 0.125F + i * 0.1875F;
/* 43 */         float v1 = 0.125F + (i + 1) * 0.1875F;
/* 44 */         RackMountableRenderEvent.TileEntity event = new RackMountableRenderEvent.TileEntity((Rack)this.rack$1, i, this.rack$1.lastData()[i], v0, v1);
/* 45 */         MinecraftForge.EVENT_BUS.post((Event)event);
/*    */         
/* 47 */         GL11.glPopAttrib();
/* 48 */         GL11.glPopMatrix();
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\tileentity\RackRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */