/*    */ package li.cil.oc.common.nanomachines.provider;
/*    */ @ScalaSignature(bytes = "\006\001\001<Q!\001\002\t\002=\ta\"T1h]\026$\bK]8wS\022,'O\003\002\004\t\005A\001O]8wS\022,'O\003\002\006\r\005aa.\0318p[\006\034\007.\0338fg*\021q\001C\001\007G>lWn\0348\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001\001\005\002\021#5\t!AB\003\023\005!\0051C\001\bNC\036tW\r\036)s_ZLG-\032:\024\005E!\002C\001\t\026\023\t1\"AA\007TG\006d\027\r\025:pm&$WM\035\005\0061E!\t!G\001\007y%t\027\016\036 \025\003=AQaG\t\005Bq\tAc\031:fCR,7kY1mC\n+\007.\031<j_J\034HCA\017U!\rq2%J\007\002?)\021\001%I\001\013G>dG.Z2uS>t'\"\001\022\002\013M\034\027\r\\1\n\005\021z\"\001C%uKJ\f'\r\\3\021\005\031:S\"A\t\007\t!\n\002!\013\002\017\033\006<g.\032;CK\"\fg/[8s'\t9#\006\005\002,a5\tAF\003\002.]\0051\001O]3gC\nT!a\f\005\002\007\005\004\030.\003\0022Y\t\001\022IY:ue\006\034GOQ3iCZLwN\035\005\tg\035\022\t\021)A\005i\0051\001\017\\1zKJ\004\"!N\037\016\003YR!aM\034\013\005aJ\024AB3oi&$\030P\003\002;w\005IQ.\0338fGJ\fg\r\036\006\002y\005\031a.\032;\n\005y2$\001D#oi&$\030\020\0257bs\026\024\b\"\002\r(\t\003\001ECA\023B\021\025\031t\b1\0015\021\025\031u\005\"\021E\003-9W\r\036(b[\026D\025N\034;\025\003\025\003\"AR&\016\003\035S!\001S%\002\t1\fgn\032\006\002\025\006!!.\031<b\023\tauI\001\004TiJLgn\032\005\006\035\036\"\teT\001\007kB$\027\r^3\025\003A\003\"!\025*\016\003\005J!aU\021\003\tUs\027\016\036\005\006gi\001\r\001\016\005\006-F!\teV\001\024e\026\fGMQ3iCZLwN\035$s_6t%\t\026\013\004KaK\006\"B\032V\001\004!\004\"\002.V\001\004Y\026a\0018ciB\021ALX\007\002;*\021!,O\005\003?v\023aB\024\"U)\006<7i\\7q_VtG\r")
/*    */ public final class MagnetProvider { public static MagnetBehavior readBehaviorFromNBT(EntityPlayer paramEntityPlayer, NBTTagCompound paramNBTTagCompound) {
/*    */     return MagnetProvider$.MODULE$.readBehaviorFromNBT(paramEntityPlayer, paramNBTTagCompound);
/*    */   }
/*    */   public static Iterable<MagnetBehavior> createScalaBehaviors(EntityPlayer paramEntityPlayer) {
/*    */     return MagnetProvider$.MODULE$.createScalaBehaviors(paramEntityPlayer);
/*    */   }
/*    */   public static Iterable<Behavior> createBehaviors(EntityPlayer paramEntityPlayer) {
/*    */     return MagnetProvider$.MODULE$.createBehaviors(paramEntityPlayer);
/*    */   }
/*    */   public static Behavior readFromNBT(EntityPlayer paramEntityPlayer, NBTTagCompound paramNBTTagCompound) {
/*    */     return MagnetProvider$.MODULE$.readFromNBT(paramEntityPlayer, paramNBTTagCompound);
/*    */   }
/*    */   public static NBTTagCompound writeToNBT(Behavior paramBehavior) {
/*    */     return MagnetProvider$.MODULE$.writeToNBT(paramBehavior);
/*    */   }
/* 18 */   public static class MagnetBehavior extends AbstractBehavior { public MagnetBehavior(EntityPlayer player) { super(player); } public final EntityPlayer li$cil$oc$common$nanomachines$provider$MagnetProvider$MagnetBehavior$$player; public String getNameHint() {
/* 19 */       return "magnet";
/*    */     }
/*    */     
/* 22 */     public void update() { World world = this.li$cil$oc$common$nanomachines$provider$MagnetProvider$MagnetBehavior$$player.func_130014_f_();
/* 23 */       if (!world.field_72995_K)
/* 24 */       { double actualRange = Settings$.MODULE$.get().nanomachineMagnetRange() * Nanomachines.getController(this.li$cil$oc$common$nanomachines$provider$MagnetProvider$MagnetBehavior$$player).getInputCount((Behavior)this);
/* 25 */         List items = world.func_72872_a(EntityItem.class, this.li$cil$oc$common$nanomachines$provider$MagnetProvider$MagnetBehavior$$player.field_70121_D.func_72314_b(actualRange, actualRange, actualRange));
/* 26 */         WrapAsScala$.MODULE$.asScalaBuffer(items).collect((PartialFunction)new MagnetProvider$MagnetBehavior$$anonfun$update$1(this), Buffer$.MODULE$.canBuildFrom()); }  } public final class MagnetProvider$MagnetBehavior$$anonfun$update$1 extends AbstractPartialFunction<Object, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final <A1, B1> B1 applyOrElse(Object x1, Function1 default) { Object object = x1;
/* 27 */         if (object instanceof EntityItem) { EntityItem entityItem = (EntityItem)object; if (entityItem.field_145804_b < 1 && entityItem.func_92059_d() != null && Predef$.MODULE$.refArrayOps((Object[])this.$outer.li$cil$oc$common$nanomachines$provider$MagnetProvider$MagnetBehavior$$player.field_71071_by.field_70462_a).exists((Function1)new MagnetProvider$MagnetBehavior$$anonfun$update$1$$anonfun$applyOrElse$1(this, entityItem))) {
/* 28 */             double dx = this.$outer.li$cil$oc$common$nanomachines$provider$MagnetProvider$MagnetBehavior$$player.field_70165_t - entityItem.field_70165_t;
/* 29 */             double dy = this.$outer.li$cil$oc$common$nanomachines$provider$MagnetProvider$MagnetBehavior$$player.field_70163_u - entityItem.field_70163_u;
/* 30 */             double dz = this.$outer.li$cil$oc$common$nanomachines$provider$MagnetProvider$MagnetBehavior$$player.field_70161_v - entityItem.field_70161_v;
/* 31 */             Vec3 delta = Vec3.func_72443_a(dx, dy, dz).func_72432_b();
/* 32 */             entityItem.func_70024_g(delta.field_72450_a * 0.1D, delta.field_72448_b * 0.1D, delta.field_72449_c * 0.1D); return (B1)BoxedUnit.UNIT;
/*    */           }  }
/*    */         
/*    */         return (B1)default.apply(x1); }
/*    */ 
/*    */       
/*    */       public final boolean isDefinedAt(Object x1) {
/*    */         Object object = x1;
/*    */         if (object instanceof EntityItem) {
/*    */           EntityItem entityItem = (EntityItem)object;
/*    */           if (entityItem.field_145804_b < 1 && entityItem.func_92059_d() != null && Predef$.MODULE$.refArrayOps((Object[])this.$outer.li$cil$oc$common$nanomachines$provider$MagnetProvider$MagnetBehavior$$player.field_71071_by.field_70462_a).exists((Function1)new MagnetProvider$MagnetBehavior$$anonfun$update$1$$anonfun$isDefinedAt$1(this, entityItem)))
/*    */             return true; 
/*    */         } 
/*    */         return false;
/*    */       }
/*    */       
/*    */       public MagnetProvider$MagnetBehavior$$anonfun$update$1(MagnetProvider.MagnetBehavior $outer) {}
/*    */       
/*    */       public final class MagnetProvider$MagnetBehavior$$anonfun$update$1$$anonfun$applyOrElse$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*    */         public static final long serialVersionUID = 0L;
/*    */         private final EntityItem x2$1;
/*    */         
/*    */         public final boolean apply(ItemStack stack) {
/*    */           return (stack == null || (stack.field_77994_a < stack.func_77976_d() && stack.func_77969_a(this.x2$1.func_92059_d())));
/*    */         }
/*    */         
/*    */         public MagnetProvider$MagnetBehavior$$anonfun$update$1$$anonfun$applyOrElse$1(MagnetProvider$MagnetBehavior$$anonfun$update$1 $outer, EntityItem x2$1) {}
/*    */       }
/*    */       
/*    */       public final class MagnetProvider$MagnetBehavior$$anonfun$update$1$$anonfun$isDefinedAt$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*    */         public static final long serialVersionUID = 0L;
/*    */         private final EntityItem x2$2;
/*    */         
/*    */         public final boolean apply(ItemStack stack) {
/*    */           return (stack == null || (stack.field_77994_a < stack.func_77976_d() && stack.func_77969_a(this.x2$2.func_92059_d())));
/*    */         }
/*    */         
/*    */         public MagnetProvider$MagnetBehavior$$anonfun$update$1$$anonfun$isDefinedAt$1(MagnetProvider$MagnetBehavior$$anonfun$update$1 $outer, EntityItem x2$2) {}
/*    */       } }
/*    */      }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\nanomachines\provider\MagnetProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */