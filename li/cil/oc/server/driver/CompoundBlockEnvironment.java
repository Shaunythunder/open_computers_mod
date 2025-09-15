/*    */ package li.cil.oc.server.driver;
/*    */ 
/*    */ import li.cil.oc.api.network.ManagedEnvironment;
/*    */ import scala.Tuple2;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Ma\001B\001\003\0015\021\001dQ8na>,h\016\032\"m_\016\\WI\034<je>tW.\0328u\025\t\031A!\001\004ee&4XM\035\006\003\013\031\taa]3sm\026\024(BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\031\001A\004\f\021\005=!R\"\001\t\013\005E\021\022\001\0027b]\036T\021aE\001\005U\0064\030-\003\002\026!\t1qJ\0316fGR\004\"a\006\017\016\003aQ!!\007\016\002\0179,Go^8sW*\0211DB\001\004CBL\027BA\017\031\005Ii\025M\\1hK\022,eN^5s_:lWM\034;\t\021}\001!Q1A\005\002\001\nAA\\1nKV\t\021\005\005\002#Q9\0211EJ\007\002I)\tQ%A\003tG\006d\027-\003\002(I\0051\001K]3eK\032L!!\013\026\003\rM#(/\0338h\025\t9C\005\003\005-\001\t\005\t\025!\003\"\003\025q\027-\\3!\021!q\003A!b\001\n\003y\023\001D3om&\024xN\\7f]R\034X#\001\031\021\007\r\n4'\003\0023I\tQAH]3qK\006$X\r\032 \021\t\r\"\024EF\005\003k\021\022a\001V;qY\026\024\004\002C\034\001\005\003\005\013\021\002\031\002\033\025tg/\033:p]6,g\016^:!\021\025I\004\001\"\001;\003\031a\024N\\5u}Q\0311(\020 \021\005q\002Q\"\001\002\t\013}A\004\031A\021\t\0139B\004\031\001\031\t\017\001\003!\031!C\001\003\006!an\0343f+\005\021\005CA\fD\023\t!\005DA\005D_6\004xN\\3oi\"1a\t\001Q\001\n\t\013QA\\8eK\002Bq\001\023\001C\002\023\005\021*\001\013va\022\fG/\0338h\013:4\030N]8o[\026tGo]\013\002\025B\0311J\024\f\016\0031S!!\024\023\002\025\r|G\016\\3di&|g.\003\002P\031\n\0311+Z9\t\rE\003\001\025!\003K\003U)\b\017Z1uS:<WI\034<je>tW.\0328ug\002BQa\025\001\005BQ\013\021bY1o+B$\027\r^3\025\003U\003\"a\t,\n\005]##a\002\"p_2,\027M\034\005\0063\002!\tEW\001\007kB$\027\r^3\025\003m\003\"a\t/\n\005u##\001B+oSRDQa\030\001\005B\001\f\021b\0348NKN\034\030mZ3\025\005m\013\007\"\0022_\001\004\031\027aB7fgN\fw-\032\t\003/\021L!!\032\r\003\0175+7o]1hK\")q\r\001C!Q\006IqN\\\"p]:,7\r\036\013\0037&DQ\001\0214A\002)\004\"aF6\n\0051D\"\001\002(pI\026DQA\034\001\005B=\fAb\0348ESN\034wN\0348fGR$\"a\0279\t\013\001k\007\031\0016\t\013I\004A\021I:\002\t1|\027\r\032\013\0037RDQ!^9A\002Y\f1A\0342u!\t9X0D\001y\025\t)\030P\003\002{w\006IQ.\0338fGJ\fg\r\036\006\002y\006\031a.\032;\n\005yD(A\004(C)R\013wmQ8na>,h\016\032\005\b\003\003\001A\021IA\002\003\021\031\030M^3\025\007m\013)\001C\003v\002\007a\017C\004\002\n\001!I!a\003\002\021QL\b/\032%bg\",\"!!\004\021\007\r\ny!C\002\002\022\021\022A\001T8oO\002")
/*    */ public class CompoundBlockEnvironment implements ManagedEnvironment {
/*    */   private final String name;
/*    */   private final Seq<Tuple2<String, ManagedEnvironment>> environments;
/*    */   private final Component node;
/*    */   private final Seq<ManagedEnvironment> updatingEnvironments;
/*    */   
/* 13 */   public String name() { return this.name; } public Seq<Tuple2<String, ManagedEnvironment>> environments() { return this.environments; } public Component node() { return this.node; } public final class CompoundBlockEnvironment$$anonfun$1 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 x$1) { return !(((Environment)x$1._2()).node() == null); } public CompoundBlockEnvironment$$anonfun$1(CompoundBlockEnvironment $outer) {} } public final class CompoundBlockEnvironment$$anonfun$2 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Visibility> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final Visibility apply(Tuple2 x$2) { return ((Environment)x$2._2()).node().reachability(); }
/*    */     public CompoundBlockEnvironment$$anonfun$2(CompoundBlockEnvironment $outer) {} }
/* 17 */   public CompoundBlockEnvironment(String name, Seq<Tuple2<String, ManagedEnvironment>> environments) { (new Visibility[1])[0] = Visibility.None; this.node = (Component)Network.newNode((Environment)this, (Visibility)((TraversableOnce)((TraversableLike)((TraversableLike)environments.filter((Function1)new CompoundBlockEnvironment$$anonfun$1(this))).map((Function1)new CompoundBlockEnvironment$$anonfun$2(this), Seq$.MODULE$.canBuildFrom())).$plus$plus((GenTraversableOnce)Seq$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Visibility[1])), Seq$.MODULE$.canBuildFrom())).max(Ordering$.MODULE$.ordered((Function1)Predef$.MODULE$.$conforms())))
/* 18 */       .withComponent(name)
/* 19 */       .create();
/*    */     
/* 21 */     this.updatingEnvironments = (Seq<ManagedEnvironment>)((TraversableLike)environments.map((Function1)new CompoundBlockEnvironment$$anonfun$3(this), Seq$.MODULE$.canBuildFrom())).filter((Function1)new CompoundBlockEnvironment$$anonfun$4(this));
/*    */ 
/*    */ 
/*    */     
/* 25 */     environments.withFilter((Function1)new CompoundBlockEnvironment$$anonfun$5(this)).foreach((Function1)new CompoundBlockEnvironment$$anonfun$6(this)); } public Seq<ManagedEnvironment> updatingEnvironments() { return this.updatingEnvironments; } public final class CompoundBlockEnvironment$$anonfun$3 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, ManagedEnvironment> implements Serializable { public static final long serialVersionUID = 0L; public final ManagedEnvironment apply(Tuple2 x$3) { return (ManagedEnvironment)x$3._2(); } public CompoundBlockEnvironment$$anonfun$3(CompoundBlockEnvironment $outer) {} } public final class CompoundBlockEnvironment$$anonfun$4 extends AbstractFunction1<ManagedEnvironment, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(ManagedEnvironment x$4) { return x$4.canUpdate(); } public CompoundBlockEnvironment$$anonfun$4(CompoundBlockEnvironment $outer) {} } public final class CompoundBlockEnvironment$$anonfun$5 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Object> implements Serializable { public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public static final long serialVersionUID = 0L; public CompoundBlockEnvironment$$anonfun$5(CompoundBlockEnvironment $outer) {} } public final class CompoundBlockEnvironment$$anonfun$6 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Tuple2 x$5) { Tuple2 tuple2 = x$5; if (tuple2 != null) { ManagedEnvironment environment = (ManagedEnvironment)tuple2._2(); Node node = environment.node();
/* 26 */         if (node instanceof Component) { Component component = (Component)node; component.setVisibility(Visibility.Neighbors); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/* 27 */         else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*    */          BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }
/*    */       
/* 30 */       throw new MatchError(tuple2); } public CompoundBlockEnvironment$$anonfun$6(CompoundBlockEnvironment $outer) {} } public boolean canUpdate() { return environments().exists((Function1)new CompoundBlockEnvironment$$anonfun$canUpdate$1(this)); } public final class CompoundBlockEnvironment$$anonfun$canUpdate$1 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 x$6) { return ((ManagedEnvironment)x$6._2()).canUpdate(); }
/*    */     
/*    */     public CompoundBlockEnvironment$$anonfun$canUpdate$1(CompoundBlockEnvironment $outer) {} }
/* 33 */   public void update() { updatingEnvironments().foreach((Function1)new CompoundBlockEnvironment$$anonfun$update$1(this)); } public final class CompoundBlockEnvironment$$anonfun$update$1 extends AbstractFunction1<ManagedEnvironment, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public CompoundBlockEnvironment$$anonfun$update$1(CompoundBlockEnvironment $outer) {} public final void apply(ManagedEnvironment environment) {
/* 34 */       environment.update();
/*    */     } }
/*    */ 
/*    */   
/*    */   public void onMessage(Message message) {}
/*    */   
/*    */   public void onConnect(Node node) {
/* 41 */     Component component = node(); if (node == null) { if (component != null) return;  } else { if (node.equals(component))
/* 42 */       { environments().withFilter((Function1)new CompoundBlockEnvironment$$anonfun$onConnect$1(this)).withFilter((Function1)new CompoundBlockEnvironment$$anonfun$onConnect$2(this)).foreach((Function1)new CompoundBlockEnvironment$$anonfun$onConnect$3(this, node)); return; }  return; }  environments().withFilter((Function1)new CompoundBlockEnvironment$$anonfun$onConnect$1(this)).withFilter((Function1)new CompoundBlockEnvironment$$anonfun$onConnect$2(this)).foreach((Function1)new CompoundBlockEnvironment$$anonfun$onConnect$3(this, node)); } public final class CompoundBlockEnvironment$$anonfun$onConnect$1 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$2) { boolean bool; Tuple2 tuple2 = check$ifrefutable$2; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public CompoundBlockEnvironment$$anonfun$onConnect$1(CompoundBlockEnvironment $outer) {} } public final class CompoundBlockEnvironment$$anonfun$onConnect$2 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 x$7) { Tuple2 tuple2 = x$7; if (tuple2 != null) { ManagedEnvironment environment = (ManagedEnvironment)tuple2._2(); return !(environment.node() == null); }  throw new MatchError(tuple2); } public CompoundBlockEnvironment$$anonfun$onConnect$2(CompoundBlockEnvironment $outer) {} } public final class CompoundBlockEnvironment$$anonfun$onConnect$3 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Node node$1; public final void apply(Tuple2 x$8) { Tuple2 tuple2 = x$8; if (tuple2 != null) { ManagedEnvironment environment = (ManagedEnvironment)tuple2._2();
/* 43 */         this.node$1.connect(environment.node()); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */         return; }
/*    */       
/*    */       throw new MatchError(tuple2); }
/*    */     
/*    */     public CompoundBlockEnvironment$$anonfun$onConnect$3(CompoundBlockEnvironment $outer, Node node$1) {} }
/* 49 */   public void onDisconnect(Node node) { Component component = node(); if (node == null) { if (component != null) return;  } else { if (node.equals(component))
/* 50 */       { environments().withFilter((Function1)new CompoundBlockEnvironment$$anonfun$onDisconnect$1(this)).withFilter((Function1)new CompoundBlockEnvironment$$anonfun$onDisconnect$2(this)).foreach((Function1)new CompoundBlockEnvironment$$anonfun$onDisconnect$3(this)); return; }  return; }  environments().withFilter((Function1)new CompoundBlockEnvironment$$anonfun$onDisconnect$1(this)).withFilter((Function1)new CompoundBlockEnvironment$$anonfun$onDisconnect$2(this)).foreach((Function1)new CompoundBlockEnvironment$$anonfun$onDisconnect$3(this)); } public final class CompoundBlockEnvironment$$anonfun$onDisconnect$1 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$3) { boolean bool; Tuple2 tuple2 = check$ifrefutable$3; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public CompoundBlockEnvironment$$anonfun$onDisconnect$1(CompoundBlockEnvironment $outer) {} } public final class CompoundBlockEnvironment$$anonfun$onDisconnect$2 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 x$9) { Tuple2 tuple2 = x$9; if (tuple2 != null) { ManagedEnvironment environment = (ManagedEnvironment)tuple2._2(); return !(environment.node() == null); }  throw new MatchError(tuple2); } public CompoundBlockEnvironment$$anonfun$onDisconnect$2(CompoundBlockEnvironment $outer) {} } public final class CompoundBlockEnvironment$$anonfun$onDisconnect$3 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Tuple2 x$10) { Tuple2 tuple2 = x$10; if (tuple2 != null) { ManagedEnvironment environment = (ManagedEnvironment)tuple2._2();
/* 51 */         environment.node().remove(); BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */         return; }
/*    */       
/*    */       throw new MatchError(tuple2); }
/*    */     
/*    */     public CompoundBlockEnvironment$$anonfun$onDisconnect$3(CompoundBlockEnvironment $outer) {} }
/*    */   
/* 58 */   public void load(NBTTagCompound nbt) { if (nbt.func_74764_b("typeHash") && nbt.func_74763_f("typeHash") != typeHash())
/* 59 */       return;  node().load(nbt);
/* 60 */     environments().withFilter((Function1)new CompoundBlockEnvironment$$anonfun$load$1(this)).foreach((Function1)new CompoundBlockEnvironment$$anonfun$load$2(this, nbt)); } public final class CompoundBlockEnvironment$$anonfun$load$1 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$4) { boolean bool; Tuple2 tuple2 = check$ifrefutable$4; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; }
/*    */     
/*    */     public CompoundBlockEnvironment$$anonfun$load$1(CompoundBlockEnvironment $outer) {} }
/*    */   public final class CompoundBlockEnvironment$$anonfun$load$2 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     private final NBTTagCompound nbt$1;
/*    */     
/*    */     public final void apply(Tuple2 x$11) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: astore_2
/*    */       //   2: aload_2
/*    */       //   3: ifnull -> 61
/*    */       //   6: aload_2
/*    */       //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*    */       //   10: checkcast java/lang/String
/*    */       //   13: astore_3
/*    */       //   14: aload_2
/*    */       //   15: invokevirtual _2 : ()Ljava/lang/Object;
/*    */       //   18: checkcast li/cil/oc/api/network/ManagedEnvironment
/*    */       //   21: astore #4
/*    */       //   23: aload_0
/*    */       //   24: getfield nbt$1 : Lnet/minecraft/nbt/NBTTagCompound;
/*    */       //   27: aload_3
/*    */       //   28: invokevirtual func_74764_b : (Ljava/lang/String;)Z
/*    */       //   31: ifeq -> 55
/*    */       //   34: aload #4
/*    */       //   36: aload_0
/*    */       //   37: getfield nbt$1 : Lnet/minecraft/nbt/NBTTagCompound;
/*    */       //   40: aload_3
/*    */       //   41: invokevirtual func_74775_l : (Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;
/*    */       //   44: invokeinterface load : (Lnet/minecraft/nbt/NBTTagCompound;)V
/*    */       //   49: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */       //   52: goto -> 151
/*    */       //   55: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */       //   58: goto -> 151
/*    */       //   61: new scala/MatchError
/*    */       //   64: dup
/*    */       //   65: aload_2
/*    */       //   66: invokespecial <init> : (Ljava/lang/Object;)V
/*    */       //   69: athrow
/*    */       //   70: astore #6
/*    */       //   72: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*    */       //   75: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*    */       //   78: new scala/StringContext
/*    */       //   81: dup
/*    */       //   82: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   85: iconst_3
/*    */       //   86: anewarray java/lang/String
/*    */       //   89: dup
/*    */       //   90: iconst_0
/*    */       //   91: ldc 'A block component of type ''
/*    */       //   93: aastore
/*    */       //   94: dup
/*    */       //   95: iconst_1
/*    */       //   96: ldc '' (provided by driver ''
/*    */       //   98: aastore
/*    */       //   99: dup
/*    */       //   100: iconst_2
/*    */       //   101: ldc '') threw an error while loading.'
/*    */       //   103: aastore
/*    */       //   104: checkcast [Ljava/lang/Object;
/*    */       //   107: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   110: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */       //   113: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   116: iconst_2
/*    */       //   117: anewarray java/lang/Object
/*    */       //   120: dup
/*    */       //   121: iconst_0
/*    */       //   122: aload #4
/*    */       //   124: invokevirtual getClass : ()Ljava/lang/Class;
/*    */       //   127: invokevirtual getName : ()Ljava/lang/String;
/*    */       //   130: aastore
/*    */       //   131: dup
/*    */       //   132: iconst_1
/*    */       //   133: aload_3
/*    */       //   134: aastore
/*    */       //   135: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   138: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */       //   141: aload #6
/*    */       //   143: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */       //   148: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */       //   151: astore #5
/*    */       //   153: return
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #60	-> 0
/*    */       //   #61	-> 23
/*    */       //   #63	-> 34
/*    */       //   #61	-> 55
/*    */       //   #60	-> 61
/*    */       //   #65	-> 70
/*    */       //   #62	-> 70
/*    */       //   #61	-> 151
/*    */       //   #60	-> 153
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	154	0	this	Lli/cil/oc/server/driver/CompoundBlockEnvironment$$anonfun$load$2;
/*    */       //   0	154	1	x$11	Lscala/Tuple2;
/*    */       //   14	140	3	driver	Ljava/lang/String;
/*    */       //   23	131	4	environment	Lli/cil/oc/api/network/ManagedEnvironment;
/*    */       // Exception table:
/*    */       //   from	to	target	type
/*    */       //   34	55	70	finally
/*    */     }
/*    */     
/*    */     public CompoundBlockEnvironment$$anonfun$load$2(CompoundBlockEnvironment $outer, NBTTagCompound nbt$1) {} }
/*    */   
/* 72 */   public void save(NBTTagCompound nbt) { nbt.func_74772_a("typeHash", typeHash());
/* 73 */     node().save(nbt);
/* 74 */     environments().withFilter((Function1)new CompoundBlockEnvironment$$anonfun$save$1(this)).foreach((Function1)new CompoundBlockEnvironment$$anonfun$save$2(this, nbt)); } public final class CompoundBlockEnvironment$$anonfun$save$1 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$5) { boolean bool; Tuple2 tuple2 = check$ifrefutable$5; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } public CompoundBlockEnvironment$$anonfun$save$1(CompoundBlockEnvironment $outer) {} } public final class CompoundBlockEnvironment$$anonfun$save$2 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, Object> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$2; public final Object apply(Tuple2 x$12) { // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: astore_2
/*    */       //   2: aload_2
/*    */       //   3: ifnull -> 50
/*    */       //   6: aload_2
/*    */       //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*    */       //   10: checkcast java/lang/String
/*    */       //   13: astore_3
/*    */       //   14: aload_2
/*    */       //   15: invokevirtual _2 : ()Ljava/lang/Object;
/*    */       //   18: checkcast li/cil/oc/api/network/ManagedEnvironment
/*    */       //   21: astore #4
/*    */       //   23: getstatic li/cil/oc/util/ExtendedNBT$.MODULE$ : Lli/cil/oc/util/ExtendedNBT$;
/*    */       //   26: aload_0
/*    */       //   27: getfield nbt$2 : Lnet/minecraft/nbt/NBTTagCompound;
/*    */       //   30: invokevirtual extendNBTTagCompound : (Lnet/minecraft/nbt/NBTTagCompound;)Lli/cil/oc/util/ExtendedNBT$ExtendedNBTTagCompound;
/*    */       //   33: aload_3
/*    */       //   34: new li/cil/oc/server/driver/CompoundBlockEnvironment$$anonfun$save$2$$anonfun$apply$1
/*    */       //   37: dup
/*    */       //   38: aload_0
/*    */       //   39: aload #4
/*    */       //   41: invokespecial <init> : (Lli/cil/oc/server/driver/CompoundBlockEnvironment$$anonfun$save$2;Lli/cil/oc/api/network/ManagedEnvironment;)V
/*    */       //   44: invokevirtual setNewCompoundTag : (Ljava/lang/String;Lscala/Function1;)Lnet/minecraft/nbt/NBTTagCompound;
/*    */       //   47: goto -> 140
/*    */       //   50: new scala/MatchError
/*    */       //   53: dup
/*    */       //   54: aload_2
/*    */       //   55: invokespecial <init> : (Ljava/lang/Object;)V
/*    */       //   58: athrow
/*    */       //   59: astore #6
/*    */       //   61: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*    */       //   64: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*    */       //   67: new scala/StringContext
/*    */       //   70: dup
/*    */       //   71: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   74: iconst_3
/*    */       //   75: anewarray java/lang/String
/*    */       //   78: dup
/*    */       //   79: iconst_0
/*    */       //   80: ldc 'A block component of type ''
/*    */       //   82: aastore
/*    */       //   83: dup
/*    */       //   84: iconst_1
/*    */       //   85: ldc '' (provided by driver ''
/*    */       //   87: aastore
/*    */       //   88: dup
/*    */       //   89: iconst_2
/*    */       //   90: ldc '') threw an error while saving.'
/*    */       //   92: aastore
/*    */       //   93: checkcast [Ljava/lang/Object;
/*    */       //   96: invokevirtual wrapRefArray : ([Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   99: invokespecial <init> : (Lscala/collection/Seq;)V
/*    */       //   102: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*    */       //   105: iconst_2
/*    */       //   106: anewarray java/lang/Object
/*    */       //   109: dup
/*    */       //   110: iconst_0
/*    */       //   111: aload #4
/*    */       //   113: invokevirtual getClass : ()Ljava/lang/Class;
/*    */       //   116: invokevirtual getName : ()Ljava/lang/String;
/*    */       //   119: aastore
/*    */       //   120: dup
/*    */       //   121: iconst_1
/*    */       //   122: aload_3
/*    */       //   123: aastore
/*    */       //   124: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*    */       //   127: invokevirtual s : (Lscala/collection/Seq;)Ljava/lang/String;
/*    */       //   130: aload #6
/*    */       //   132: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */       //   137: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*    */       //   140: astore #5
/*    */       //   142: aload #5
/*    */       //   144: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #74	-> 0
/*    */       //   #76	-> 23
/*    */       //   #74	-> 50
/*    */       //   #78	-> 59
/*    */       //   #75	-> 59
/*    */       //   #75	-> 140
/*    */       //   #74	-> 142
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	145	0	this	Lli/cil/oc/server/driver/CompoundBlockEnvironment$$anonfun$save$2;
/*    */       //   0	145	1	x$12	Lscala/Tuple2;
/*    */       //   14	131	3	driver	Ljava/lang/String;
/*    */       //   23	122	4	environment	Lli/cil/oc/api/network/ManagedEnvironment;
/*    */       // Exception table:
/*    */       //   from	to	target	type
/*    */       //   23	50	59	finally } public CompoundBlockEnvironment$$anonfun$save$2(CompoundBlockEnvironment $outer, NBTTagCompound nbt$2) {} public final class CompoundBlockEnvironment$$anonfun$save$2$$anonfun$apply$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final ManagedEnvironment environment$1;
/*    */       public final void apply(NBTTagCompound x$1) {
/* 76 */         this.environment$1.save(x$1);
/*    */       }
/*    */       
/*    */       public CompoundBlockEnvironment$$anonfun$save$2$$anonfun$apply$1(CompoundBlockEnvironment$$anonfun$save$2 $outer, ManagedEnvironment environment$1) {} }
/*    */      }
/*    */ 
/*    */   
/*    */   private long typeHash() {
/* 84 */     Hasher hash = Hashing.sha256().newHasher();
/* 85 */     ((IterableLike)((SeqLike)environments().map((Function1)new CompoundBlockEnvironment$$anonfun$typeHash$1(this), Seq$.MODULE$.canBuildFrom())).sorted((Ordering)Ordering$String$.MODULE$)).foreach((Function1)new CompoundBlockEnvironment$$anonfun$typeHash$2(this, hash));
/* 86 */     return hash.hash().asLong();
/*    */   }
/*    */   
/*    */   public final class CompoundBlockEnvironment$$anonfun$typeHash$1 extends AbstractFunction1<Tuple2<String, ManagedEnvironment>, String> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final String apply(Tuple2 x$13) {
/*    */       return x$13._2().getClass().getName();
/*    */     }
/*    */     
/*    */     public CompoundBlockEnvironment$$anonfun$typeHash$1(CompoundBlockEnvironment $outer) {}
/*    */   }
/*    */   
/*    */   public final class CompoundBlockEnvironment$$anonfun$typeHash$2 extends AbstractFunction1<String, Hasher> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Hasher hash$1;
/*    */     
/*    */     public final Hasher apply(String x$14) {
/*    */       return this.hash$1.putString(x$14, Charset.defaultCharset());
/*    */     }
/*    */     
/*    */     public CompoundBlockEnvironment$$anonfun$typeHash$2(CompoundBlockEnvironment $outer, Hasher hash$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\driver\CompoundBlockEnvironment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */