/*     */ package li.cil.oc.client.renderer.item;public final class HoverBootRenderer$ extends ModelBiped { public static final HoverBootRenderer$ MODULE$; private final ResourceLocation texture; private final ModelRenderer bootLeft; private final ModelRenderer bootRight; private final ModelRenderer body;
/*     */   private final ModelRenderer wing0;
/*     */   private final ModelRenderer wing1;
/*     */   private final ModelRenderer wing2;
/*     */   private final ModelRenderer wing3;
/*     */   private final HoverBootRenderer.LightModelRenderer light0;
/*     */   private final HoverBootRenderer.LightModelRenderer light1;
/*     */   private final HoverBootRenderer.LightModelRenderer light2;
/*     */   private final HoverBootRenderer.LightModelRenderer light3;
/*     */   private int lightColor;
/*     */   
/*  12 */   private HoverBootRenderer$() { MODULE$ = this;
/*  13 */     this.texture = new ResourceLocation(li.cil.oc.Settings$.MODULE$.resourceDomain(), "textures/model/drone.png");
/*     */     
/*  15 */     this.bootLeft = new ModelRenderer((ModelBase)this, "bootLeft");
/*  16 */     this.bootRight = new ModelRenderer((ModelBase)this, "bootRight");
/*  17 */     this.body = new ModelRenderer((ModelBase)this, "body");
/*  18 */     this.wing0 = new ModelRenderer((ModelBase)this, "wing0");
/*  19 */     this.wing1 = new ModelRenderer((ModelBase)this, "wing1");
/*  20 */     this.wing2 = new ModelRenderer((ModelBase)this, "wing2");
/*  21 */     this.wing3 = new ModelRenderer((ModelBase)this, "wing3");
/*  22 */     this.light0 = new HoverBootRenderer.LightModelRenderer((ModelBase)this, "light0");
/*  23 */     this.light1 = new HoverBootRenderer.LightModelRenderer((ModelBase)this, "light1");
/*  24 */     this.light2 = new HoverBootRenderer.LightModelRenderer((ModelBase)this, "light2");
/*  25 */     this.light3 = new HoverBootRenderer.LightModelRenderer((ModelBase)this, "light3");
/*     */     
/*  27 */     bootLeft().func_78792_a(body());
/*  28 */     bootLeft().func_78792_a(wing0());
/*  29 */     bootLeft().func_78792_a(wing1());
/*     */     
/*  31 */     bootRight().func_78792_a(body());
/*  32 */     bootRight().func_78792_a(wing2());
/*  33 */     bootRight().func_78792_a(wing3());
/*     */     
/*  35 */     wing0().func_78792_a(light0());
/*  36 */     wing1().func_78792_a(light1());
/*  37 */     wing2().func_78792_a(light2());
/*  38 */     wing3().func_78792_a(light3());
/*     */     
/*  40 */     ((ModelBase)this).field_78090_t = 64;
/*  41 */     ((ModelBase)this).field_78089_u = 32;
/*     */     
/*  43 */     func_78085_a("body.middle", 0, 23);
/*  44 */     func_78085_a("body.top", 0, 1);
/*  45 */     func_78085_a("body.bottom", 0, 17);
/*  46 */     func_78085_a("wing0.flap0", 0, 9);
/*  47 */     func_78085_a("wing0.pin0", 0, 27);
/*  48 */     func_78085_a("wing1.flap1", 0, 9);
/*  49 */     func_78085_a("wing1.pin1", 0, 27);
/*  50 */     func_78085_a("wing2.flap2", 0, 9);
/*  51 */     func_78085_a("wing2.pin2", 0, 27);
/*  52 */     func_78085_a("wing3.flap3", 0, 9);
/*  53 */     func_78085_a("wing3.pin3", 0, 27);
/*     */     
/*  55 */     func_78085_a("light0.flap0", 24, 0);
/*  56 */     func_78085_a("light1.flap1", 24, 0);
/*  57 */     func_78085_a("light2.flap2", 24, 0);
/*  58 */     func_78085_a("light3.flap3", 24, 0);
/*     */     
/*  60 */     (bootRight()).field_82908_p = 0.63125F;
/*  61 */     (bootLeft()).field_82908_p = 0.631875F;
/*     */     
/*  63 */     (body().func_78786_a("top", -3.0F, 1.0F, -3.0F, 6, 1, 6)).field_78796_g = (float)scala.math.package$.MODULE$.toRadians(45.0D);
/*  64 */     (body().func_78786_a("middle", -1.0F, 0.0F, -1.0F, 2, 1, 2)).field_78796_g = (float)scala.math.package$.MODULE$.toRadians(45.0D);
/*  65 */     (body().func_78786_a("bottom", -2.0F, -1.0F, -2.0F, 4, 1, 4)).field_78796_g = (float)scala.math.package$.MODULE$.toRadians(45.0D);
/*  66 */     wing0().func_78786_a("flap0", -1.0F, 0.0F, -7.0F, 6, 1, 6);
/*  67 */     wing0().func_78786_a("pin0", 0.0F, -1.0F, -3.0F, 1, 3, 1);
/*  68 */     wing1().func_78786_a("flap1", -1.0F, 0.0F, 1.0F, 6, 1, 6);
/*  69 */     wing1().func_78786_a("pin1", 0.0F, -1.0F, 2.0F, 1, 3, 1);
/*  70 */     wing2().func_78786_a("flap2", -5.0F, 0.0F, 1.0F, 6, 1, 6);
/*  71 */     wing2().func_78786_a("pin2", -1.0F, -1.0F, 2.0F, 1, 3, 1);
/*  72 */     wing3().func_78786_a("flap3", -5.0F, 0.0F, -7.0F, 6, 1, 6);
/*  73 */     wing3().func_78786_a("pin3", -1.0F, -1.0F, -3.0F, 1, 3, 1);
/*     */     
/*  75 */     light0().func_78786_a("flap0", -1.0F, 0.0F, -7.0F, 6, 1, 6);
/*  76 */     light1().func_78786_a("flap1", -1.0F, 0.0F, 1.0F, 6, 1, 6);
/*  77 */     light2().func_78786_a("flap2", -5.0F, 0.0F, 1.0F, 6, 1, 6);
/*  78 */     light3().func_78786_a("flap3", -5.0F, 0.0F, -7.0F, 6, 1, 6);
/*     */ 
/*     */     
/*  81 */     this.field_78124_i.field_78804_l.clear();
/*  82 */     this.field_78123_h.field_78804_l.clear();
/*     */     
/*  84 */     this.field_78124_i.func_78792_a(bootLeft());
/*  85 */     this.field_78123_h.func_78792_a(bootRight());
/*     */     
/*  87 */     this.field_78116_c.field_78807_k = true;
/*  88 */     this.field_78114_d.field_78807_k = true;
/*  89 */     this.field_78115_e.field_78807_k = true;
/*  90 */     this.field_78112_f.field_78807_k = true;
/*  91 */     this.field_78113_g.field_78807_k = true;
/*  92 */     this.field_78121_j.field_78807_k = true;
/*  93 */     this.field_78122_k.field_78807_k = true;
/*     */     
/*  95 */     this.lightColor = 6741333; } public ResourceLocation texture() { return this.texture; } public ModelRenderer bootLeft() { return this.bootLeft; } public ModelRenderer bootRight() { return this.bootRight; } public ModelRenderer body() { return this.body; } public ModelRenderer wing0() { return this.wing0; } public ModelRenderer wing1() { return this.wing1; } public int lightColor() { return this.lightColor; } public ModelRenderer wing2() { return this.wing2; } public ModelRenderer wing3() { return this.wing3; } public HoverBootRenderer.LightModelRenderer light0() { return this.light0; } public HoverBootRenderer.LightModelRenderer light1() { return this.light1; } public HoverBootRenderer.LightModelRenderer light2() { return this.light2; } public HoverBootRenderer.LightModelRenderer light3() { return this.light3; } public void lightColor_$eq(int x$1) { this.lightColor = x$1; }
/*     */ 
/*     */   
/*     */   public void func_78088_a(Entity entity, float f0, float f1, float f2, float f3, float f4, float f5) {
/*  99 */     this.field_78117_n = entity.func_70093_af();
/* 100 */     super.func_78088_a(entity, f0, f1, f2, f3, f4, f5);
/*     */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\item\HoverBootRenderer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */