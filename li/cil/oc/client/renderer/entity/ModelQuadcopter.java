/*     */ package li.cil.oc.client.renderer.entity;@ScalaSignature(bytes = "\006\001\005ua\001B\001\003\005=\021q\"T8eK2\fV/\0313d_B$XM\035\006\003\007\021\ta!\0328uSRL(BA\003\007\003!\021XM\0343fe\026\024(BA\004\t\003\031\031G.[3oi*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\032\033\005\021\"BA\n\025\003\025iw\016Z3m\025\t9QC\003\002\027/\005IQ.\0338fGJ\fg\r\036\006\0021\005\031a.\032;\n\005i\021\"!C'pI\026d')Y:f\021\025a\002\001\"\001\036\003\031a\024N\\5u}Q\ta\004\005\002 \0015\t!\001C\004\"\001\t\007I\021\001\022\002\017Q,\007\020^;sKV\t1\005\005\002%O5\tQE\003\002'+\005!Q\017^5m\023\tASE\001\tSKN|WO]2f\031>\034\027\r^5p]\"1!\006\001Q\001\n\r\n\001\002^3yiV\024X\r\t\005\bY\001\021\r\021\"\001.\003\021\021w\016Z=\026\0039\002\"!E\030\n\005A\022\"!D'pI\026d'+\0328eKJ,'\017\003\0043\001\001\006IAL\001\006E>$\027\020\t\005\bi\001\021\r\021\"\001.\003\0259\030N\\41\021\0311\004\001)A\005]\0051q/\0338ha\001Bq\001\017\001C\002\023\005Q&A\003xS:<\027\007\003\004;\001\001\006IAL\001\007o&tw-\r\021\t\017q\002!\031!C\001[\005)q/\0338he!1a\b\001Q\001\n9\naa^5oOJ\002\003b\002!\001\005\004%\t!L\001\006o&twm\r\005\007\005\002\001\013\021\002\030\002\r]LgnZ\032!\021\035!\005A1A\005\0025\na\001\\5hQR\004\004B\002$\001A\003%a&A\004mS\036DG\017\r\021\t\017!\003!\031!C\001[\0051A.[4iiFBaA\023\001!\002\023q\023a\0027jO\"$\030\007\t\005\b\031\002\021\r\021\"\001.\003\031a\027n\0325ue!1a\n\001Q\001\n9\nq\001\\5hQR\024\004\005C\004Q\001\t\007I\021A\027\002\r1Lw\r\033;4\021\031\021\006\001)A\005]\0059A.[4iiN\002\003b\002+\001\005\004%I!V\001\006g\016\fG.Z\013\002-B\021qKW\007\0021*\t\021,A\003tG\006d\027-\003\002\\1\n)a\t\\8bi\"1Q\f\001Q\001\nY\013aa]2bY\026\004\003bB0\001\005\004%I\001Y\001\003kB,\022!\031\t\003I\tL!aY\023\003\tY+7m\r\005\007K\002\001\013\021B1\002\007U\004\b\005C\003h\001\021%\001.\001\005e_J+g\016Z3s)\rIG.\036\t\003/*L!a\033-\003\tUs\027\016\036\005\006[\032\004\rA\\\001\006IJ|g.\032\t\003_Nl\021\001\035\006\003\007ET!A\035\005\002\r\r|W.\\8o\023\t!\bOA\003Ee>tW\rC\003wM\002\007a+\001\002ei\")\001\020\001C\001s\0061!/\0328eKJ$\022!\033\005\006q\002!\te\037\013\017Sr\f)!!\003\002\016\005E\021QCA\r\021\025\031!\0201\001~!\rq\030\021A\007\002*\0211!F\005\004\003\007y(AB#oi&$\030\020\003\004\002\bi\004\rAV\001\003MFBa!a\003{\001\0041\026A\00143\021\031\tyA\037a\001-\006\021am\r\005\007\003'Q\b\031\001,\002\005\031$\004BBA\fu\002\007a+\001\002gk!1\0211\004>A\002Y\013!A\032\034")
/*     */ public final class ModelQuadcopter extends ModelBase { private final ResourceLocation texture; private final ModelRenderer body;
/*     */   private final ModelRenderer wing0;
/*     */   private final ModelRenderer wing1;
/*     */   private final ModelRenderer wing2;
/*     */   private final ModelRenderer wing3;
/*     */   private final ModelRenderer light0;
/*     */   private final ModelRenderer light1;
/*     */   private final ModelRenderer light2;
/*     */   private final ModelRenderer light3;
/*     */   private final float scale;
/*     */   private final Vec3 up;
/*     */   
/*  14 */   public ModelQuadcopter() { this.texture = new ResourceLocation(Settings$.MODULE$.resourceDomain(), "textures/model/drone.png");
/*     */     
/*  16 */     this.body = new ModelRenderer(this, "body");
/*  17 */     this.wing0 = new ModelRenderer(this, "wing0");
/*  18 */     this.wing1 = new ModelRenderer(this, "wing1");
/*  19 */     this.wing2 = new ModelRenderer(this, "wing2");
/*  20 */     this.wing3 = new ModelRenderer(this, "wing3");
/*  21 */     this.light0 = new ModelRenderer(this, "light0");
/*  22 */     this.light1 = new ModelRenderer(this, "light1");
/*  23 */     this.light2 = new ModelRenderer(this, "light2");
/*  24 */     this.light3 = new ModelRenderer(this, "light3");
/*     */     
/*  26 */     this.field_78090_t = 64;
/*  27 */     this.field_78089_u = 32;
/*     */     
/*  29 */     func_78085_a("body.middle", 0, 23);
/*  30 */     func_78085_a("body.top", 0, 1);
/*  31 */     func_78085_a("body.bottom", 0, 17);
/*  32 */     func_78085_a("wing0.flap0", 0, 9);
/*  33 */     func_78085_a("wing0.pin0", 0, 27);
/*  34 */     func_78085_a("wing1.flap1", 0, 9);
/*  35 */     func_78085_a("wing1.pin1", 0, 27);
/*  36 */     func_78085_a("wing2.flap2", 0, 9);
/*  37 */     func_78085_a("wing2.pin2", 0, 27);
/*  38 */     func_78085_a("wing3.flap3", 0, 9);
/*  39 */     func_78085_a("wing3.pin3", 0, 27);
/*     */     
/*  41 */     func_78085_a("light0.flap0", 24, 0);
/*  42 */     func_78085_a("light1.flap1", 24, 0);
/*  43 */     func_78085_a("light2.flap2", 24, 0);
/*  44 */     func_78085_a("light3.flap3", 24, 0);
/*     */     
/*  46 */     (body().func_78786_a("top", -3.0F, 1.0F, -3.0F, 6, 1, 6)).field_78796_g = (float)package$.MODULE$.toRadians(45.0D);
/*  47 */     (body().func_78786_a("middle", -1.0F, 0.0F, -1.0F, 2, 1, 2)).field_78796_g = (float)package$.MODULE$.toRadians(45.0D);
/*  48 */     (body().func_78786_a("bottom", -2.0F, -1.0F, -2.0F, 4, 1, 4)).field_78796_g = (float)package$.MODULE$.toRadians(45.0D);
/*  49 */     wing0().func_78786_a("flap0", 1.0F, 0.0F, -7.0F, 6, 1, 6);
/*  50 */     wing0().func_78786_a("pin0", 2.0F, -1.0F, -3.0F, 1, 3, 1);
/*  51 */     wing1().func_78786_a("flap1", 1.0F, 0.0F, 1.0F, 6, 1, 6);
/*  52 */     wing1().func_78786_a("pin1", 2.0F, -1.0F, 2.0F, 1, 3, 1);
/*  53 */     wing2().func_78786_a("flap2", -7.0F, 0.0F, 1.0F, 6, 1, 6);
/*  54 */     wing2().func_78786_a("pin2", -3.0F, -1.0F, 2.0F, 1, 3, 1);
/*  55 */     wing3().func_78786_a("flap3", -7.0F, 0.0F, -7.0F, 6, 1, 6);
/*  56 */     wing3().func_78786_a("pin3", -3.0F, -1.0F, -3.0F, 1, 3, 1);
/*     */     
/*  58 */     light0().func_78786_a("flap0", 1.0F, 0.0F, -7.0F, 6, 1, 6);
/*  59 */     light1().func_78786_a("flap1", 1.0F, 0.0F, 1.0F, 6, 1, 6);
/*  60 */     light2().func_78786_a("flap2", -7.0F, 0.0F, 1.0F, 6, 1, 6);
/*  61 */     light3().func_78786_a("flap3", -7.0F, 0.0F, -7.0F, 6, 1, 6);
/*     */     
/*  63 */     this.scale = 0.0625F;
/*  64 */     this.up = Vec3.func_72443_a(0.0D, 1.0D, 0.0D); } public ResourceLocation texture() { return this.texture; } public ModelRenderer body() { return this.body; } public ModelRenderer wing0() { return this.wing0; } public ModelRenderer wing1() { return this.wing1; } public ModelRenderer wing2() { return this.wing2; } private Vec3 up() { return this.up; }
/*     */   public ModelRenderer wing3() { return this.wing3; }
/*     */   public ModelRenderer light0() { return this.light0; }
/*  67 */   public ModelRenderer light1() { return this.light1; } public ModelRenderer light2() { return this.light2; } public ModelRenderer light3() { return this.light3; } private float scale() { return this.scale; } private void doRender(Drone drone, float dt) { if (drone.isRunning()) {
/*  68 */       int timeJitter = drone.hashCode() ^ 0xFF;
/*  69 */       GL11.glTranslatef(0.0F, (float)(package$.MODULE$.sin(timeJitter + (drone.field_70170_p.func_82737_E() + dt) / 20.0D) * 0.0625D), 0.0F);
/*     */     } 
/*     */     
/*  72 */     Vec3 velocity = Vec3.func_72443_a(drone.field_70159_w, drone.field_70181_x, drone.field_70179_y);
/*  73 */     Vec3 direction = velocity.func_72432_b();
/*  74 */     if (direction.func_72430_b(up()) < 0.99D) {
/*     */       
/*  76 */       Vec3 rotationAxis = direction.func_72431_c(up());
/*  77 */       double relativeSpeed = velocity.func_72433_c() / drone.maxVelocity();
/*  78 */       GL11.glRotated(relativeSpeed * -20, rotationAxis.field_72450_a, rotationAxis.field_72448_b, rotationAxis.field_72449_c);
/*     */     } 
/*     */     
/*  81 */     GL11.glRotatef(drone.bodyAngle(), 0.0F, 1.0F, 0.0F);
/*     */     
/*  83 */     body().func_78785_a(scale());
/*     */     
/*  85 */     (wing0()).field_78795_f = drone.flapAngles()[0][0];
/*  86 */     (wing0()).field_78808_h = drone.flapAngles()[0][1];
/*  87 */     (wing1()).field_78795_f = drone.flapAngles()[1][0];
/*  88 */     (wing1()).field_78808_h = drone.flapAngles()[1][1];
/*  89 */     (wing2()).field_78795_f = drone.flapAngles()[2][0];
/*  90 */     (wing2()).field_78808_h = drone.flapAngles()[2][1];
/*  91 */     (wing3()).field_78795_f = drone.flapAngles()[3][0];
/*  92 */     (wing3()).field_78808_h = drone.flapAngles()[3][1];
/*     */     
/*  94 */     wing0().func_78785_a(scale());
/*  95 */     wing1().func_78785_a(scale());
/*  96 */     wing2().func_78785_a(scale());
/*  97 */     wing3().func_78785_a(scale());
/*     */     
/*  99 */     if (drone.isRunning()) {
/* 100 */       RenderState$.MODULE$.disableLighting();
/* 101 */       GL11.glDepthFunc(515);
/*     */       
/* 103 */       (light0()).field_78795_f = drone.flapAngles()[0][0];
/* 104 */       (light0()).field_78808_h = drone.flapAngles()[0][1];
/* 105 */       (light1()).field_78795_f = drone.flapAngles()[1][0];
/* 106 */       (light1()).field_78808_h = drone.flapAngles()[1][1];
/* 107 */       (light2()).field_78795_f = drone.flapAngles()[2][0];
/* 108 */       (light2()).field_78808_h = drone.flapAngles()[2][1];
/* 109 */       (light3()).field_78795_f = drone.flapAngles()[3][0];
/* 110 */       (light3()).field_78808_h = drone.flapAngles()[3][1];
/*     */ 
/*     */       
/* 113 */       GL11.glBlendFunc(770, 1);
/*     */       
/* 115 */       int lightColor = drone.lightColor();
/* 116 */       byte r = (byte)(lightColor >>> 16 & 0xFF);
/* 117 */       byte g = (byte)(lightColor >>> 8 & 0xFF);
/* 118 */       byte b = (byte)(lightColor >>> 0 & 0xFF);
/* 119 */       GL11.glColor3ub(r, g, b);
/*     */       
/* 121 */       light0().func_78785_a(scale());
/* 122 */       light1().func_78785_a(scale());
/* 123 */       light2().func_78785_a(scale());
/* 124 */       light3().func_78785_a(scale());
/*     */     }  }
/*     */ 
/*     */ 
/*     */   
/*     */   public void render() {
/* 130 */     body().func_78785_a(scale());
/*     */     
/* 132 */     float tilt = (float)package$.MODULE$.toRadians(2.0D);
/* 133 */     (wing0()).field_78795_f = tilt;
/* 134 */     (wing0()).field_78808_h = tilt;
/* 135 */     (wing1()).field_78795_f = -tilt;
/* 136 */     (wing1()).field_78808_h = tilt;
/* 137 */     (wing2()).field_78795_f = -tilt;
/* 138 */     (wing2()).field_78808_h = -tilt;
/* 139 */     (wing3()).field_78795_f = tilt;
/* 140 */     (wing3()).field_78808_h = -tilt;
/*     */     
/* 142 */     wing0().func_78785_a(scale());
/* 143 */     wing1().func_78785_a(scale());
/* 144 */     wing2().func_78785_a(scale());
/* 145 */     wing3().func_78785_a(scale());
/*     */     
/* 147 */     RenderState$.MODULE$.disableLighting();
/* 148 */     GL11.glDepthFunc(515);
/*     */     
/* 150 */     (light0()).field_78795_f = tilt;
/* 151 */     (light0()).field_78808_h = tilt;
/* 152 */     (light1()).field_78795_f = -tilt;
/* 153 */     (light1()).field_78808_h = tilt;
/* 154 */     (light2()).field_78795_f = -tilt;
/* 155 */     (light2()).field_78808_h = -tilt;
/* 156 */     (light3()).field_78795_f = tilt;
/* 157 */     (light3()).field_78808_h = -tilt;
/*     */     
/* 159 */     GL11.glBlendFunc(770, 1);
/* 160 */     GL11.glColor3ub((byte)102, (byte)221, (byte)85);
/*     */     
/* 162 */     light0().func_78785_a(scale());
/* 163 */     light1().func_78785_a(scale());
/* 164 */     light2().func_78785_a(scale());
/* 165 */     light3().func_78785_a(scale());
/*     */   }
/*     */   
/*     */   public void func_78088_a(Entity entity, float f1, float f2, float f3, float f4, float f5, float f6) {
/* 169 */     doRender((Drone)entity, f6);
/*     */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\renderer\entity\ModelQuadcopter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */