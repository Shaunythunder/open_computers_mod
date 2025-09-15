/*    */ package li.cil.oc.server.fs;
/*    */ 
/*    */ import li.cil.oc.api.fs.FileSystem;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.mutable.Set;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Ud\001B\001\003\0015\0211dQ8na>\034\030\016^3SK\006$wJ\0347z\r&dWmU=ti\026l'BA\002\005\003\t17O\003\002\006\r\00511/\032:wKJT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001aB\006\t\003\037Qi\021\001\005\006\003#I\tA\001\\1oO*\t1#\001\003kCZ\f\027BA\013\021\005\031y%M[3diB\021qcG\007\0021)\0211!\007\006\0035\031\t1!\0319j\023\ta\002D\001\006GS2,7+_:uK6D\001B\b\001\003\002\003\006IaH\001\nM\006\034Go\034:jKN\004B\001I\024*c5\t\021E\003\002#G\0059Q.\036;bE2,'B\001\023&\003)\031w\016\0347fGRLwN\034\006\002M\005)1oY1mC&\021\001&\t\002\016\031&t7.\0323ICNDW*\0319\021\005)rcBA\026-\033\005)\023BA\027&\003\031\001&/\0323fM&\021q\006\r\002\007'R\024\030N\\4\013\0055*\003c\001\0328-5\t1G\003\0025k\005Q1m\0348dkJ\024XM\034;\013\005Y\022\022\001B;uS2L!\001O\032\003\021\r\013G\016\\1cY\026DQA\017\001\005\002m\na\001P5oSRtDC\001\037?!\ti\004!D\001\003\021\025q\022\b1\001 \021\035\001\005\0011A\005\002\005\013Q\001]1siN,\022A\021\t\005A\035Jc\003C\004E\001\001\007I\021A#\002\023A\f'\017^:`I\025\fHC\001$J!\tYs)\003\002IK\t!QK\\5u\021\035Q5)!AA\002\t\0131\001\037\0232\021\031a\005\001)Q\005\005\0061\001/\031:ug\002BQA\024\001\005B=\013!\"[:SK\006$wJ\0347z)\005\001\006CA\026R\023\t\021VEA\004C_>dW-\0318\t\013Q\003A\021I+\002\025M\004\030mY3U_R\fG\016F\001W!\tYs+\003\002YK\t!Aj\0348h\021\025Q\006\001\"\021V\003%\031\b/Y2f+N,G\rC\003]\001\021\005S,\001\004fq&\034Ho\035\013\003!zCQaX.A\002%\nA\001]1uQ\")\021\r\001C!E\006!1/\033>f)\t16\rC\003`A\002\007\021\006C\003f\001\021\005c-A\006jg\022K'/Z2u_JLHC\001)h\021\025yF\r1\001*\021\025I\007\001\"\021k\0031a\027m\035;N_\022Lg-[3e)\t16\016C\003`Q\002\007\021\006C\003n\001\021\005c.\001\003mSN$HCA8u!\rY\003O]\005\003c\026\022Q!\021:sCf\004\"aD:\n\005=\002\002\"B0m\001\004I\003\"\002<\001\t\003:\030A\0023fY\026$X\r\006\002Qq\")q,\036a\001S!)!\020\001C!w\006iQ.Y6f\t&\024Xm\031;pef$\"\001\025?\t\013}K\b\031A\025\t\013y\004A\021I@\002\rI,g.Y7f)\025\001\026\021AA\003\021\031\t\031! a\001S\005!aM]8n\021\031\t9! a\001S\005\021Ao\034\005\b\003\027\001A\021IA\007\003=\031X\r\036'bgRlu\016Z5gS\026$G#\002)\002\020\005E\001BB0\002\n\001\007\021\006C\004\002\024\005%\001\031\001,\002\tQLW.\032\005\b\003/\001A\021IA\r\003\021y\007/\0328\025\r\005m\021\021EA\022!\rY\023QD\005\004\003?)#aA%oi\"1q,!\006A\002%B\001\"!\n\002\026\001\007\021qE\001\005[>$W\rE\002\030\003SI1!a\013\031\005\021iu\016Z3\t\017\005=\002\001\"\021\0022\005Iq-\032;IC:$G.\032\013\005\003g\tI\004E\002\030\003kI1!a\016\031\005\031A\025M\0343mK\"A\0211HA\027\001\004\tY\"\001\004iC:$G.\032\005\b\003\001A\021IA!\003\025\031Gn\\:f)\0051\005bBA#\001\021\005\023qI\001\005Y>\fG\rF\002G\003\023B\001\"a\023\002D\001\007\021QJ\001\004]\n$\b\003BA(\0037j!!!\025\013\t\005-\0231\013\006\005\003+\n9&A\005nS:,7M]1gi*\021\021\021L\001\004]\026$\030\002BA/\003#\022aB\024\"U)\006<7i\\7q_VtG\rC\004\002b\001!\t%a\031\002\tM\fg/\032\013\004\r\006\025\004\002CA&\003?\002\r!!\024\t\017\005%\004\001\"\005\002l\005qa-\0338e\r&dWmU=ti\026lG\003BA7\003g\002BaKA8-%\031\021\021O\023\003\r=\003H/[8o\021\031y\026q\ra\001S\001")
/*    */ public class CompositeReadOnlyFileSystem implements FileSystem {
/* 14 */   public CompositeReadOnlyFileSystem(LinkedHashMap factories) { this.parts = LinkedHashMap$.MODULE$.empty();
/* 15 */     factories.withFilter((Function1)new CompositeReadOnlyFileSystem$$anonfun$1(this)).foreach((Function1)new CompositeReadOnlyFileSystem$$anonfun$2(this)); } private LinkedHashMap<String, FileSystem> parts; public LinkedHashMap<String, FileSystem> parts() { return this.parts; } public void parts_$eq(LinkedHashMap<String, FileSystem> x$1) { this.parts = x$1; } public final class CompositeReadOnlyFileSystem$$anonfun$1 extends AbstractFunction1<Tuple2<String, Callable<FileSystem>>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public CompositeReadOnlyFileSystem$$anonfun$1(CompositeReadOnlyFileSystem $outer) {} } public final class CompositeReadOnlyFileSystem$$anonfun$2 extends AbstractFunction1<Tuple2<String, Callable<FileSystem>>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final Object apply(Tuple2 x$1) { Tuple2 tuple2 = x$1; if (tuple2 != null) { String name = (String)tuple2._1(); Callable<FileSystem> factory = (Callable)tuple2._2();
/* 16 */         FileSystem fs = factory.call();
/* 17 */         return (fs == null) ? BoxedUnit.UNIT : 
/* 18 */           this.$outer.parts().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(name), fs)); }
/*    */       
/*    */       throw new MatchError(tuple2); }
/*    */     
/*    */     public CompositeReadOnlyFileSystem$$anonfun$2(CompositeReadOnlyFileSystem $outer) {} }
/*    */   public boolean isReadOnly() {
/* 24 */     return true;
/*    */   }
/* 26 */   public long spaceTotal() { return package$.MODULE$.max(spaceUsed(), BoxesRunTime.unboxToLong(((TraversableOnce)parts().values().map((Function1)new CompositeReadOnlyFileSystem$$anonfun$spaceTotal$1(this), Iterable$.MODULE$.canBuildFrom())).sum((Numeric)Numeric$LongIsIntegral$.MODULE$))); } public final class CompositeReadOnlyFileSystem$$anonfun$spaceTotal$1 extends AbstractFunction1<FileSystem, Object> implements Serializable { public static final long serialVersionUID = 0L; public final long apply(FileSystem x$2) { return x$2.spaceTotal(); }
/*    */      public CompositeReadOnlyFileSystem$$anonfun$spaceTotal$1(CompositeReadOnlyFileSystem $outer) {} }
/* 28 */   public long spaceUsed() { return BoxesRunTime.unboxToLong(((TraversableOnce)parts().values().map((Function1)new CompositeReadOnlyFileSystem$$anonfun$spaceUsed$1(this), Iterable$.MODULE$.canBuildFrom())).sum((Numeric)Numeric$LongIsIntegral$.MODULE$)); } public final class CompositeReadOnlyFileSystem$$anonfun$spaceUsed$1 extends AbstractFunction1<FileSystem, Object> implements Serializable { public static final long serialVersionUID = 0L; public final long apply(FileSystem x$3) { return x$3.spaceUsed(); }
/*    */     
/*    */     public CompositeReadOnlyFileSystem$$anonfun$spaceUsed$1(CompositeReadOnlyFileSystem $outer) {} }
/*    */   public boolean exists(String path) {
/* 32 */     return findFileSystem(path).isDefined();
/*    */   }
/* 34 */   public long size(String path) { return BoxesRunTime.unboxToLong(findFileSystem(path).fold((Function0)new CompositeReadOnlyFileSystem$$anonfun$size$1(this), (Function1)new CompositeReadOnlyFileSystem$$anonfun$size$2(this, path))); } public final class CompositeReadOnlyFileSystem$$anonfun$size$1 extends AbstractFunction0.mcJ.sp implements Serializable { public static final long serialVersionUID = 0L; public final long apply() { return apply$mcJ$sp(); } public long apply$mcJ$sp() { return 0L; } public CompositeReadOnlyFileSystem$$anonfun$size$1(CompositeReadOnlyFileSystem $outer) {} } public final class CompositeReadOnlyFileSystem$$anonfun$size$2 extends AbstractFunction1<FileSystem, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String path$2; public final long apply(FileSystem x$4) { return x$4.size(this.path$2); }
/*    */      public CompositeReadOnlyFileSystem$$anonfun$size$2(CompositeReadOnlyFileSystem $outer, String path$2) {} }
/* 36 */   public boolean isDirectory(String path) { return BoxesRunTime.unboxToBoolean(findFileSystem(path).fold((Function0)new CompositeReadOnlyFileSystem$$anonfun$isDirectory$1(this), (Function1)new CompositeReadOnlyFileSystem$$anonfun$isDirectory$2(this, path))); } public final class CompositeReadOnlyFileSystem$$anonfun$isDirectory$1 extends AbstractFunction0.mcZ.sp implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply() { return apply$mcZ$sp(); } public boolean apply$mcZ$sp() { return false; } public CompositeReadOnlyFileSystem$$anonfun$isDirectory$1(CompositeReadOnlyFileSystem $outer) {} } public final class CompositeReadOnlyFileSystem$$anonfun$isDirectory$2 extends AbstractFunction1<FileSystem, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String path$3; public final boolean apply(FileSystem x$5) { return x$5.isDirectory(this.path$3); }
/*    */      public CompositeReadOnlyFileSystem$$anonfun$isDirectory$2(CompositeReadOnlyFileSystem $outer, String path$3) {} }
/* 38 */   public long lastModified(String path) { return BoxesRunTime.unboxToLong(findFileSystem(path).fold((Function0)new CompositeReadOnlyFileSystem$$anonfun$lastModified$1(this), (Function1)new CompositeReadOnlyFileSystem$$anonfun$lastModified$2(this, path))); } public final class CompositeReadOnlyFileSystem$$anonfun$lastModified$1 extends AbstractFunction0.mcJ.sp implements Serializable { public static final long serialVersionUID = 0L; public final long apply() { return apply$mcJ$sp(); } public long apply$mcJ$sp() { return 0L; } public CompositeReadOnlyFileSystem$$anonfun$lastModified$1(CompositeReadOnlyFileSystem $outer) {} } public final class CompositeReadOnlyFileSystem$$anonfun$lastModified$2 extends AbstractFunction1<FileSystem, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String path$4; public final long apply(FileSystem x$6) { return x$6.lastModified(this.path$4); }
/*    */      public CompositeReadOnlyFileSystem$$anonfun$lastModified$2(CompositeReadOnlyFileSystem $outer, String path$4) {} }
/* 40 */   public String[] list(String path) { return isDirectory(path) ? 
/* 41 */       (String[])((TraversableOnce)parts().values().foldLeft(Set$.MODULE$.empty(), (Function2)new CompositeReadOnlyFileSystem$$anonfun$list$1(this, path)))
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 57 */       .toArray(ClassTag$.MODULE$.apply(String.class)) : 
/*    */       
/* 59 */       null; } public final class CompositeReadOnlyFileSystem$$anonfun$list$1 extends AbstractFunction2<Set<String>, FileSystem, Set<String>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final String path$5; public CompositeReadOnlyFileSystem$$anonfun$list$1(CompositeReadOnlyFileSystem $outer, String path$5) {} public final Set<String> apply(Set<String> acc, FileSystem fs) { if (fs.exists(this.path$5)) try { String[] l = fs.list(this.path$5); if (l != null) Predef$.MODULE$.refArrayOps((Object[])l).foreach((Function1)new CompositeReadOnlyFileSystem$$anonfun$list$1$$anonfun$apply$1(this, acc));  } finally {}  return acc; } public final class CompositeReadOnlyFileSystem$$anonfun$list$1$$anonfun$apply$1 extends AbstractFunction1<String, Set<String>> implements Serializable {
/*    */       public static final long serialVersionUID = 0L; private final Set acc$1; public CompositeReadOnlyFileSystem$$anonfun$list$1$$anonfun$apply$1(CompositeReadOnlyFileSystem$$anonfun$list$1 $outer, Set acc$1) {}
/*    */       public final Set<String> apply(String e) { String f = (new StringOps(Predef$.MODULE$.augmentString(e))).stripSuffix("/"); String d = (new StringBuilder()).append(f).append("/").toString(); this.acc$1.$minus$eq(f); this.acc$1.$minus$eq(d); return (Set<String>)this.acc$1.$plus$eq(e); } } }
/* 63 */   public boolean delete(String path) { return false; }
/*    */    public boolean makeDirectory(String path) {
/* 65 */     return false;
/*    */   } public boolean rename(String from, String to) {
/* 67 */     return false;
/*    */   } public boolean setLastModified(String path, long time) {
/* 69 */     return false;
/*    */   }
/*    */   
/*    */   public int open(String path, Mode mode) {
/* 73 */     Option<FileSystem> option = findFileSystem(path);
/* 74 */     if (option instanceof Some) { Some some = (Some)option; FileSystem fs = (FileSystem)some.x(); return fs.open(path, mode); }
/* 75 */      throw new FileNotFoundException(path);
/*    */   }
/*    */   
/* 78 */   public Handle getHandle(int handle) { return (Handle)parts().valuesIterator().map((Function1)new CompositeReadOnlyFileSystem$$anonfun$getHandle$1(this, handle)).find((Function1)new CompositeReadOnlyFileSystem$$anonfun$getHandle$2(this)).orNull(Predef$.MODULE$.$conforms()); } public final class CompositeReadOnlyFileSystem$$anonfun$getHandle$1 extends AbstractFunction1<FileSystem, Handle> implements Serializable { public static final long serialVersionUID = 0L; private final int handle$1; public final Handle apply(FileSystem x$7) { return x$7.getHandle(this.handle$1); } public CompositeReadOnlyFileSystem$$anonfun$getHandle$1(CompositeReadOnlyFileSystem $outer, int handle$1) {} } public final class CompositeReadOnlyFileSystem$$anonfun$getHandle$2 extends AbstractFunction1<Handle, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Handle x$8) { return !(x$8 == null); }
/*    */      public CompositeReadOnlyFileSystem$$anonfun$getHandle$2(CompositeReadOnlyFileSystem $outer) {} }
/* 80 */   public void close() { parts().values().foreach((Function1)new CompositeReadOnlyFileSystem$$anonfun$close$1(this)); } public final class CompositeReadOnlyFileSystem$$anonfun$close$1 extends AbstractFunction1<FileSystem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(FileSystem x$9) { x$9.close(); }
/*    */ 
/*    */     
/*    */     public CompositeReadOnlyFileSystem$$anonfun$close$1(CompositeReadOnlyFileSystem $outer) {} }
/*    */   
/* 85 */   public void load(NBTTagCompound nbt) { parts().withFilter((Function1)new CompositeReadOnlyFileSystem$$anonfun$load$1(this)).foreach((Function1)new CompositeReadOnlyFileSystem$$anonfun$load$2(this, nbt)); } public final class CompositeReadOnlyFileSystem$$anonfun$load$1 extends AbstractFunction1<Tuple2<String, FileSystem>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$2) { boolean bool; Tuple2 tuple2 = check$ifrefutable$2; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public CompositeReadOnlyFileSystem$$anonfun$load$1(CompositeReadOnlyFileSystem $outer) {} } public final class CompositeReadOnlyFileSystem$$anonfun$load$2 extends AbstractFunction1<Tuple2<String, FileSystem>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public final void apply(Tuple2 x$10) { Tuple2 tuple2 = x$10; if (tuple2 != null) { String name = (String)tuple2._1(); FileSystem fs = (FileSystem)tuple2._2();
/* 86 */         fs.load(this.nbt$1.func_74775_l(name)); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */         return; }
/*    */       
/*    */       throw new MatchError(tuple2); }
/*    */      public CompositeReadOnlyFileSystem$$anonfun$load$2(CompositeReadOnlyFileSystem $outer, NBTTagCompound nbt$1) {} }
/* 91 */   public void save(NBTTagCompound nbt) { parts().withFilter((Function1)new CompositeReadOnlyFileSystem$$anonfun$save$1(this)).foreach((Function1)new CompositeReadOnlyFileSystem$$anonfun$save$2(this, nbt)); } public final class CompositeReadOnlyFileSystem$$anonfun$save$1 extends AbstractFunction1<Tuple2<String, FileSystem>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$3) { boolean bool; Tuple2 tuple2 = check$ifrefutable$3; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public CompositeReadOnlyFileSystem$$anonfun$save$1(CompositeReadOnlyFileSystem $outer) {} } public final class CompositeReadOnlyFileSystem$$anonfun$save$2 extends AbstractFunction1<Tuple2<String, FileSystem>, NBTTagCompound> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$2; public final NBTTagCompound apply(Tuple2 x$11) { Tuple2 tuple2 = x$11; if (tuple2 != null) { String name = (String)tuple2._1(); FileSystem fs = (FileSystem)tuple2._2(); return 
/* 92 */           ExtendedNBT$.MODULE$.extendNBTTagCompound(this.nbt$2).setNewCompoundTag(name, (Function1)new CompositeReadOnlyFileSystem$$anonfun$save$2$$anonfun$apply$2(this, fs)); }  throw new MatchError(tuple2); } public CompositeReadOnlyFileSystem$$anonfun$save$2(CompositeReadOnlyFileSystem $outer, NBTTagCompound nbt$2) {} public final class CompositeReadOnlyFileSystem$$anonfun$save$2$$anonfun$apply$2 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final FileSystem fs$1; public final void apply(NBTTagCompound x$1) { this.fs$1.save(x$1); }
/*    */ 
/*    */       
/*    */       public CompositeReadOnlyFileSystem$$anonfun$save$2$$anonfun$apply$2(CompositeReadOnlyFileSystem$$anonfun$save$2 $outer, FileSystem fs$1) {} }
/*    */      }
/*    */   
/* 98 */   public Option<FileSystem> findFileSystem(String path) { return ((IterableLike)parts().valuesIterator().toSeq().reverse()).find((Function1)new CompositeReadOnlyFileSystem$$anonfun$findFileSystem$1(this, path)); } public final class CompositeReadOnlyFileSystem$$anonfun$findFileSystem$1 extends AbstractFunction1<FileSystem, Object> implements Serializable { public static final long serialVersionUID = 0L; private final String path$1; public final boolean apply(FileSystem x$12) { return x$12.exists(this.path$1); }
/*    */ 
/*    */     
/*    */     public CompositeReadOnlyFileSystem$$anonfun$findFileSystem$1(CompositeReadOnlyFileSystem $outer, String path$1) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\CompositeReadOnlyFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */