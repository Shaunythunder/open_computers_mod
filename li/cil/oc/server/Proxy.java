/*    */ package li.cil.oc.server;
/*    */ import cpw.mods.fml.common.event.FMLInitializationEvent;
/*    */ import cpw.mods.fml.common.network.IGuiHandler;
/*    */ import cpw.mods.fml.common.network.NetworkRegistry;
/*    */ import li.cil.oc.OpenComputers$;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\00192Q!\001\002\001\t)\021Q\001\025:pqfT!a\001\003\002\rM,'O^3s\025\t)a!\001\002pG*\021q\001C\001\004G&d'\"A\005\002\0051L7C\001\001\f!\taq\"D\001\016\025\tqA!\001\004d_6lwN\\\005\003\0035AQ!\005\001\005\002M\ta\001P5oSRt4\001\001\013\002)A\021Q\003A\007\002\005!)q\003\001C!1\005!\021N\\5u)\tIr\004\005\002\033;5\t1DC\001\035\003\025\0318-\0317b\023\tq2D\001\003V]&$\b\"\002\021\027\001\004\t\023!A3\021\005\tbS\"A\022\013\005\021*\023!B3wK:$(B\001\b'\025\t9\003&A\002g[2T!!\013\026\002\t5|Gm\035\006\002W\005\0311\r]<\n\0055\032#A\006$N\031&s\027\016^5bY&T\030\r^5p]\0263XM\034;")
/*    */ public class Proxy extends Proxy {
/*    */   public void init(FMLInitializationEvent e) {
/* 10 */     super.init(e);
/*    */     
/* 12 */     NetworkRegistry.INSTANCE.registerGuiHandler(OpenComputers$.MODULE$, (IGuiHandler)GuiHandler$.MODULE$);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\Proxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */