/*    */ package li.cil.oc.client.gui;
/*    */ import net.minecraft.client.renderer.texture.TextureMap;
/*    */ import net.minecraft.util.IIcon;
/*    */ import scala.collection.mutable.Map;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class Icons$ {
/*    */   public static final Icons$ MODULE$;
/*    */   private final Map<String, IIcon> li$cil$oc$client$gui$Icons$$bySlotType;
/*    */   private final Map<Object, IIcon> li$cil$oc$client$gui$Icons$$byTier;
/*    */   
/*    */   public Map<String, IIcon> li$cil$oc$client$gui$Icons$$bySlotType() {
/* 13 */     return this.li$cil$oc$client$gui$Icons$$bySlotType;
/*    */   } public Map<Object, IIcon> li$cil$oc$client$gui$Icons$$byTier() {
/* 15 */     return this.li$cil$oc$client$gui$Icons$$byTier;
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/* 19 */   public void onItemIconRegister(TextureStitchEvent e) { TextureMap iconRegister = e.map;
/* 20 */     if (iconRegister.func_130086_a() == 1)
/* 21 */     { scala.Predef$.MODULE$.refArrayOps((Object[])li.cil.oc.common.Slot$.MODULE$.All()).foreach((Function1)new Icons$$anonfun$onItemIconRegister$1(iconRegister));
/*    */ 
/*    */ 
/*    */       
/* 25 */       li$cil$oc$client$gui$Icons$$byTier().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(-1)), iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":icons/na").toString()))); scala.runtime.RichInt$.MODULE$
/* 26 */         .to$extension0(scala.Predef$.MODULE$.intWrapper(0), 2).foreach((Function1)new Icons$$anonfun$onItemIconRegister$2(iconRegister)); }  } public final class Icons$$anonfun$onItemIconRegister$1 extends AbstractFunction1<String, Map<String, IIcon>> implements Serializable {
/* 27 */     public static final long serialVersionUID = 0L; private final TextureMap iconRegister$1; public Icons$$anonfun$onItemIconRegister$1(TextureMap iconRegister$1) {} public final Map<String, IIcon> apply(String name) { return (Map<String, IIcon>)Icons$.MODULE$.li$cil$oc$client$gui$Icons$$bySlotType().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(name), this.iconRegister$1.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":icons/").append(name).toString()))); } } public final class Icons$$anonfun$onItemIconRegister$2 extends AbstractFunction1<Object, Map<Object, IIcon>> implements Serializable { public static final long serialVersionUID = 0L; public final Map<Object, IIcon> apply(int tier) { return (Map<Object, IIcon>)Icons$.MODULE$.li$cil$oc$client$gui$Icons$$byTier().$plus$eq(scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(tier)), this.iconRegister$1.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":icons/tier").append(BoxesRunTime.boxToInteger(tier)).toString()))); }
/*    */     
/*    */     private final TextureMap iconRegister$1;
/*    */     public Icons$$anonfun$onItemIconRegister$2(TextureMap iconRegister$1) {} }
/*    */   public IIcon get(String slotType) {
/* 32 */     return (IIcon)li$cil$oc$client$gui$Icons$$bySlotType().get(slotType).orNull(scala.Predef$.MODULE$.$conforms());
/*    */   }
/* 34 */   public IIcon get(int tier) { return (IIcon)li$cil$oc$client$gui$Icons$$byTier().get(BoxesRunTime.boxToInteger(tier)).orNull(scala.Predef$.MODULE$.$conforms()); } private Icons$() {
/* 35 */     MODULE$ = this;
/*    */     this.li$cil$oc$client$gui$Icons$$bySlotType = scala.collection.mutable.Map$.MODULE$.empty();
/*    */     this.li$cil$oc$client$gui$Icons$$byTier = scala.collection.mutable.Map$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Icons$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */