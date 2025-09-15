/*    */ package li.cil.oc.integration.igw;
/*    */ 
/*    */ import cpw.mods.fml.common.eventhandler.SubscribeEvent;
/*    */ import igwmod.api.PageChangeEvent;
/*    */ import li.cil.oc.api.Manual;
/*    */ import li.cil.oc.api.detail.ItemInfo;
/*    */ import li.cil.oc.client.renderer.markdown.segment.Segment;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.Iterable;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxedUnit;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class WikiEventHandler$ {
/*    */   public static final WikiEventHandler$ MODULE$;
/*    */   
/* 20 */   public String lastPath() { return this.lastPath; } private String lastPath; public void lastPath_$eq(String x$1) { this.lastPath = x$1; }
/*    */ 
/*    */   
/* 23 */   public void init() { MinecraftForge.EVENT_BUS.register(this);
/*    */     
/* 25 */     li.cil.oc.common.init.Items$.MODULE$.descriptors().withFilter((Function1)new WikiEventHandler$$anonfun$init$1()).foreach((Function1)new WikiEventHandler$$anonfun$init$2()); } public final class WikiEventHandler$$anonfun$init$1 extends AbstractFunction1<Tuple2<String, ItemInfo>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class WikiEventHandler$$anonfun$init$2 extends AbstractFunction1<Tuple2<String, ItemInfo>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { ItemInfo info = (ItemInfo)tuple2._2();
/* 26 */         ItemStack stack = info.createItemStack(1);
/* 27 */         String path = Manual.pathFor(stack);
/*    */         
/* 29 */         WikiRegistry.registerBlockAndItemPageEntry(stack); BoxedUnit boxedUnit = (path == null || Manual.contentFor(path) == null) ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*    */         return; }
/*    */       
/*    */       throw new MatchError(tuple2); }
/*    */      }
/*    */   @SubscribeEvent
/*    */   public void onPageChangeEvent(PageChangeEvent e) {
/* 36 */     String path = 
/* 37 */       (e.associatedStack == null) ? (
/*    */       
/* 39 */       e.currentFile.startsWith("OpenComputers:") ? (
/* 40 */       new StringOps(scala.Predef$.MODULE$.augmentString(e.currentFile))).stripPrefix("OpenComputers:") : 
/* 41 */       null) : (new StringBuilder()).append("/").append(Manual.pathFor(e.associatedStack)).toString();
/*    */     
/* 43 */     String base = lastPath();
/* 44 */     lastPath_$eq("");
/* 45 */     if (path != null) {
/* 46 */       String resolvedPath = li.cil.oc.client.Manual$.MODULE$.makeRelative(path, base);
/* 47 */       Iterable content = Manual.contentFor(resolvedPath);
/* 48 */       if (content != null) {
/* 49 */         Segment document = li.cil.oc.client.renderer.markdown.Document$.MODULE$.parse(scala.collection.convert.WrapAsScala$.MODULE$.iterableAsScalaIterable(content));
/* 50 */         Iterable processed = document.renderAsText(li.cil.oc.client.renderer.markdown.MarkupFormat$.MODULE$.IGWMod());
/* 51 */         e.pageText = new ArrayList(scala.collection.convert.WrapAsJava$.MODULE$.asJavaCollection(processed));
/* 52 */         e.currentFile = resolvedPath;
/* 53 */         lastPath_$eq(resolvedPath);
/*    */       } 
/*    */     } 
/*    */   } private WikiEventHandler$() {
/* 57 */     MODULE$ = this;
/*    */     this.lastPath = "";
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\igw\WikiEventHandler$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */