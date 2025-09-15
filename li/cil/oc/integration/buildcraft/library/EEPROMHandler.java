/*    */ package li.cil.oc.integration.buildcraft.library;@ScalaSignature(bytes = "\006\001!<Q!\001\002\t\002=\tQ\"R#Q%>k\005*\0318eY\026\024(BA\002\005\003\035a\027N\031:befT!!\002\004\002\025\t,\030\016\0343de\0064GO\003\002\b\021\005Y\021N\034;fOJ\fG/[8o\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001\001\t\003!Ei\021A\001\004\006%\tA\ta\005\002\016\013\026\003&kT'IC:$G.\032:\024\005E!\002CA\013\033\033\0051\"BA\002\030\025\tA\022$A\002ba&T\021!B\005\0037Y\021Q\003T5ce\006\024\030\020V=qK\"\013g\016\0327fe:\023E\013C\003\036#\021\005a$\001\004=S:LGO\020\013\002\037!)\001%\005C!C\005I\021n\035%b]\022dWM\035\013\004E!\"\004CA\022'\033\005!#\"A\023\002\013M\034\027\r\\1\n\005\035\"#a\002\"p_2,\027M\034\005\006S}\001\rAK\001\006gR\f7m\033\t\003WIj\021\001\f\006\003[9\nA!\033;f[*\021q\006M\001\n[&tWm\031:bMRT\021!M\001\004]\026$\030BA\032-\005%IE/Z7Ti\006\0347\016C\0036?\001\007a'A\006iC:$G.\032:UsB,\007CA\034D\035\tA\024I\004\002:\001:\021!h\020\b\003wyj\021\001\020\006\003{9\ta\001\020:p_Rt\024\"A\003\n\005aI\022BA\002\030\023\t\021e#\001\nMS\n\024\030M]=UsB,\007*\0318eY\026\024\030B\001#F\005-A\025M\0343mKJ$\026\020]3\013\005\t3\002\"B$\022\t\003B\025\001D4fiR+\007\020^\"pY>\024H#A%\021\005\rR\025BA&%\005\rIe\016\036\005\006\033F!\tET\001\bO\026$h*Y7f)\tyu\013\005\002Q+6\t\021K\003\002S'\006!A.\0318h\025\005!\026\001\0026bm\006L!AV)\003\rM#(/\0338h\021\025IC\n1\001+\021\025I\026\003\"\021[\003\021aw.\0313\025\007)ZF\fC\003*1\002\007!\006C\003^1\002\007a,A\002oER\004\"aX1\016\003\001T!!\030\030\n\005\t\004'A\004(C)R\013wmQ8na>,h\016\032\005\006IF!\t%Z\001\006gR|'/\032\013\004E\031<\007\"B\025d\001\004Q\003\"B/d\001\004q\006")
/*    */ public final class EEPROMHandler { public static boolean store(ItemStack paramItemStack, NBTTagCompound paramNBTTagCompound) {
/*    */     return EEPROMHandler$.MODULE$.store(paramItemStack, paramNBTTagCompound);
/*    */   }
/*    */   public static ItemStack load(ItemStack paramItemStack, NBTTagCompound paramNBTTagCompound) {
/*    */     return EEPROMHandler$.MODULE$.load(paramItemStack, paramNBTTagCompound);
/*    */   }
/*    */   public static String getName(ItemStack paramItemStack) {
/*    */     return EEPROMHandler$.MODULE$.getName(paramItemStack);
/*    */   }
/*    */   public static int getTextColor() {
/*    */     return EEPROMHandler$.MODULE$.getTextColor();
/*    */   }
/*    */   
/*    */   public static boolean isHandler(ItemStack paramItemStack, LibraryTypeHandler.HandlerType paramHandlerType) {
/*    */     return EEPROMHandler$.MODULE$.isHandler(paramItemStack, paramHandlerType);
/*    */   }
/*    */   
/*    */   public static String getOutputExtension() {
/*    */     return EEPROMHandler$.MODULE$.getOutputExtension();
/*    */   }
/*    */   
/*    */   public static boolean isInputExtension(String paramString) {
/*    */     return EEPROMHandler$.MODULE$.isInputExtension(paramString);
/*    */   }
/*    */   
/*    */   public final class EEPROMHandler$$anonfun$load$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(Object x0$1) {
/* 30 */       Object object = x0$1;
/* 31 */       if (object instanceof String) { String str = (String)object; this.stackData$1.func_74782_a(str, this.nbt$1.func_74781_a(str)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */         return; }
/*    */       
/*    */       throw new MatchError(object);
/*    */     }
/*    */     private final NBTTagCompound nbt$1; private final NBTTagCompound stackData$1;
/*    */     public EEPROMHandler$$anonfun$load$1(NBTTagCompound nbt$1, NBTTagCompound stackData$1) {} }
/*    */   public final class EEPROMHandler$$anonfun$store$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$2; private final NBTTagCompound stackData$2;
/*    */     
/*    */     public final void apply(Object x0$2) {
/* 41 */       Object object = x0$2;
/* 42 */       if (object instanceof String) { String str = (String)object; this.nbt$2.func_74782_a(str, this.stackData$2.func_74781_a(str)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */         return; }
/*    */       
/*    */       throw new MatchError(object);
/*    */     }
/*    */     
/*    */     public EEPROMHandler$$anonfun$store$1(NBTTagCompound nbt$2, NBTTagCompound stackData$2) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\buildcraft\library\EEPROMHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */