/*    */ package li.cil.oc.server.machine.luaj;
/*    */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*    */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*    */ import li.cil.repack.org.luaj.vm2.Varargs;
/*    */ import scala.Tuple2;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001=3A!\001\002\001\037\ta1i\\7q_:,g\016^!Q\023*\0211\001B\001\005YV\f'N\003\002\006\r\0059Q.Y2iS:,'BA\004\t\003\031\031XM\035<fe*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\023\033\005\021\021BA\n\003\005\035aU/\031&B!&C\021\"\006\001\003\002\003\006IAF\r\002\013=<h.\032:\021\005E9\022B\001\r\003\005MaU/\031&Mk\006\f%o\0315ji\026\034G/\036:f\023\t)\"\003C\003\034\001\021\005A$\001\004=S:LGO\020\013\003;y\001\"!\005\001\t\013UQ\002\031\001\f\t\013\001\002A\021I\021\002\025%t\027\016^5bY&TX\rF\001#!\t\031c%D\001%\025\005)\023!B:dC2\f\027BA\024%\005\021)f.\033;\t\013%\002A\021\002\026\002\033]LG\017[\"p[B|g.\0328u)\rYcg\020\t\003YQj\021!\f\006\003]=\n1A^73\025\t\031\001G\003\0022e\005\031qN]4\013\005MR\021A\002:fa\006\0347.\003\0026[\t9a+\031:be\036\034\b\"B\034)\001\004A\024aB1eIJ,7o\035\t\003sqr!a\t\036\n\005m\"\023A\002)sK\022,g-\003\002>}\t11\013\036:j]\036T!a\017\023\t\013\001C\003\031A!\002\003\031\004Ba\t\"EW%\0211\t\n\002\n\rVt7\r^5p]F\002\"!\022&\016\003\031S!a\022%\002\0179,Go^8sW*\021\021\nC\001\004CBL\027BA&G\005%\031u.\0349p]\026tG\017C\006N\001A\005\031\021!A\005\n9K\022aC:va\026\024He\\<oKJ,\022A\006")
/*    */ public class ComponentAPI extends LuaJAPI {
/*    */   public ComponentAPI(LuaJLuaArchitecture owner) {
/* 10 */     super(owner);
/*    */   }
/*    */   public void initialize() {
/* 13 */     LuaTable component = LuaValue.tableOf();
/*    */     
/* 15 */     component.set("list", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComponentAPI$$anonfun$initialize$1(this)));
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
/* 28 */     component.set("type", (LuaValue)ScalaClosure$.MODULE$.wrapVarArgClosure((Function1)new ComponentAPI$$anonfun$initialize$2(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     component.set("slot", (LuaValue)ScalaClosure$.MODULE$.wrapVarArgClosure((Function1)new ComponentAPI$$anonfun$initialize$3(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 47 */     component.set("methods", (LuaValue)ScalaClosure$.MODULE$.wrapVarArgClosure((Function1)new ComponentAPI$$anonfun$initialize$4(this)));
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
/* 63 */     component.set("invoke", (LuaValue)ScalaClosure$.MODULE$.wrapVarArgClosure((Function1)new ComponentAPI$$anonfun$initialize$5(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 70 */     component.set("doc", (LuaValue)ScalaClosure$.MODULE$.wrapVarArgClosure((Function1)new ComponentAPI$$anonfun$initialize$6(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 78 */     lua().set("component", (LuaValue)component);
/*    */   }
/*    */   
/*    */   public final class ComponentAPI$$anonfun$initialize$1 extends AbstractFunction1<Varargs, LuaTable> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaTable apply(Varargs args) {
/*    */       synchronized (this.$outer.components()) {
/*    */         Option filter = args.isstring(1) ? Option$.MODULE$.apply(args.tojstring(1)) : (Option)None$.MODULE$;
/*    */         boolean exact = args.optboolean(2, false);
/*    */         LuaTable table = LuaValue.tableOf(0, this.$outer.components().size());
/*    */         WrapAsScala$.MODULE$.mapAsScalaMap(this.$outer.components()).withFilter((Function1)new ComponentAPI$$anonfun$initialize$1$$anonfun$apply$1(this)).foreach((Function1)new ComponentAPI$$anonfun$initialize$1$$anonfun$apply$2(this, filter, exact, table));
/*    */         return table;
/*    */       } 
/*    */     }
/*    */     
/*    */     public ComponentAPI$$anonfun$initialize$1(ComponentAPI $outer) {}
/*    */     
/*    */     public final boolean li$cil$oc$server$machine$luaj$ComponentAPI$$anonfun$$matches$1(String name, Option filter$1, boolean exact$1) {
/*    */       if (exact$1) {
/*    */         Object object = filter$1.get();
/*    */         if (name == null) {
/*    */           if (object != null);
/*    */         } else if (name.equals(object)) {
/*    */         
/*    */         } 
/*    */       } else {
/*    */         return name.contains((CharSequence)filter$1.get());
/*    */       } 
/*    */     }
/*    */     
/*    */     public final class ComponentAPI$$anonfun$initialize$1$$anonfun$apply$1 extends AbstractFunction1<Tuple2<String, String>, Object> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final boolean apply(Tuple2 check$ifrefutable$1) {
/*    */         boolean bool;
/*    */         Tuple2 tuple2 = check$ifrefutable$1;
/*    */         if (tuple2 != null) {
/*    */           bool = true;
/*    */         } else {
/*    */           bool = false;
/*    */         } 
/*    */         return bool;
/*    */       }
/*    */       
/*    */       public ComponentAPI$$anonfun$initialize$1$$anonfun$apply$1(ComponentAPI$$anonfun$initialize$1 $outer) {}
/*    */     }
/*    */     
/*    */     public final class ComponentAPI$$anonfun$initialize$1$$anonfun$apply$2 extends AbstractFunction1<Tuple2<String, String>, BoxedUnit> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final Option filter$1;
/*    */       private final boolean exact$1;
/*    */       private final LuaTable table$1;
/*    */       
/*    */       public final void apply(Tuple2 x$1) {
/*    */         Tuple2 tuple2 = x$1;
/*    */         if (tuple2 != null) {
/*    */           String address = (String)tuple2._1(), name = (String)tuple2._2();
/*    */           this.table$1.set(address, name);
/*    */           BoxedUnit boxedUnit = (this.filter$1.isEmpty() || this.$outer.li$cil$oc$server$machine$luaj$ComponentAPI$$anonfun$$matches$1(name, this.filter$1, this.exact$1)) ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*    */           return;
/*    */         } 
/*    */         throw new MatchError(tuple2);
/*    */       }
/*    */       
/*    */       public ComponentAPI$$anonfun$initialize$1$$anonfun$apply$2(ComponentAPI$$anonfun$initialize$1 $outer, Option filter$1, boolean exact$1, LuaTable table$1) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ComponentAPI$$anonfun$initialize$2 extends AbstractFunction1<Varargs, Varargs> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final Varargs apply(Varargs args) {
/*    */       synchronized (this.$outer.components()) {
/*    */         Varargs varargs;
/*    */         String str = (String)this.$outer.components().get(args.checkjstring(1));
/*    */         if (str != null) {
/*    */           String str1 = str;
/*    */           LuaString luaString = LuaValue.valueOf(str1);
/*    */         } else {
/*    */           varargs = LuaValue.varargsOf(LuaValue.NIL, (Varargs)LuaValue.valueOf("no such component"));
/*    */         } 
/*    */         return varargs;
/*    */       } 
/*    */     }
/*    */     
/*    */     public ComponentAPI$$anonfun$initialize$2(ComponentAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class ComponentAPI$$anonfun$initialize$3 extends AbstractFunction1<Varargs, Varargs> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final Varargs apply(Varargs args) {
/*    */       synchronized (this.$outer.components()) {
/*    */         Varargs varargs;
/*    */         String address = args.checkjstring(1);
/*    */         String str1 = (String)this.$outer.components().get(address);
/*    */         if (str1 != null) {
/*    */           LuaInteger luaInteger = LuaValue.valueOf(this.$outer.machine().host().componentSlot(address));
/*    */         } else {
/*    */           varargs = LuaValue.varargsOf(LuaValue.NIL, (Varargs)LuaValue.valueOf("no such component"));
/*    */         } 
/*    */         return varargs;
/*    */       } 
/*    */     }
/*    */     
/*    */     public ComponentAPI$$anonfun$initialize$3(ComponentAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class ComponentAPI$$anonfun$initialize$4 extends AbstractFunction1<Varargs, Varargs> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ComponentAPI$$anonfun$initialize$4(ComponentAPI $outer) {}
/*    */     
/*    */     public final Varargs apply(Varargs args) {
/*    */       return this.$outer.li$cil$oc$server$machine$luaj$ComponentAPI$$withComponent(args.checkjstring(1), (Function1<Component, Varargs>)new ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3(this));
/*    */     }
/*    */     
/*    */     public final class ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3 extends AbstractFunction1<Component, LuaTable> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3(ComponentAPI$$anonfun$initialize$4 $outer) {}
/*    */       
/*    */       public final LuaTable apply(Component component) {
/*    */         LuaTable table = LuaValue.tableOf();
/*    */         WrapAsScala$.MODULE$.mapAsScalaMap(this.$outer.li$cil$oc$server$machine$luaj$ComponentAPI$$anonfun$$$outer().machine().methods(component.host())).withFilter((Function1)new ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3$$anonfun$apply$4(this)).foreach((Function1)new ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3$$anonfun$apply$5(this, table));
/*    */         return table;
/*    */       }
/*    */       
/*    */       public final class ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3$$anonfun$apply$4 extends AbstractFunction1<Tuple2<String, Callback>, Object> implements Serializable {
/*    */         public static final long serialVersionUID = 0L;
/*    */         
/*    */         public final boolean apply(Tuple2 check$ifrefutable$2) {
/*    */           boolean bool;
/*    */           Tuple2 tuple2 = check$ifrefutable$2;
/*    */           if (tuple2 != null) {
/*    */             bool = true;
/*    */           } else {
/*    */             bool = false;
/*    */           } 
/*    */           return bool;
/*    */         }
/*    */         
/*    */         public ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3$$anonfun$apply$4(ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3 $outer) {}
/*    */       }
/*    */       
/*    */       public final class ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3$$anonfun$apply$5 extends AbstractFunction1<Tuple2<String, Callback>, BoxedUnit> implements Serializable {
/*    */         public static final long serialVersionUID = 0L;
/*    */         private final LuaTable table$2;
/*    */         
/*    */         public final void apply(Tuple2 x$2) {
/*    */           Tuple2 tuple2 = x$2;
/*    */           if (tuple2 != null) {
/*    */             String name = (String)tuple2._1();
/*    */             Callback annotation = (Callback)tuple2._2();
/*    */             (new LuaValue[6])[0] = (LuaValue)LuaValue.valueOf("direct");
/*    */             (new LuaValue[6])[1] = (LuaValue)LuaValue.valueOf(annotation.direct());
/*    */             (new LuaValue[6])[2] = (LuaValue)LuaValue.valueOf("getter");
/*    */             (new LuaValue[6])[3] = (LuaValue)LuaValue.valueOf(annotation.getter());
/*    */             (new LuaValue[6])[4] = (LuaValue)LuaValue.valueOf("setter");
/*    */             (new LuaValue[6])[5] = (LuaValue)LuaValue.valueOf(annotation.setter());
/*    */             this.table$2.set(name, (LuaValue)LuaValue.tableOf(new LuaValue[6]));
/*    */             BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */             return;
/*    */           } 
/*    */           throw new MatchError(tuple2);
/*    */         }
/*    */         
/*    */         public ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3$$anonfun$apply$5(ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3 $outer, LuaTable table$2) {}
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ComponentAPI$$anonfun$initialize$5 extends AbstractFunction1<Varargs, Varargs> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ComponentAPI$$anonfun$initialize$5(ComponentAPI $outer) {}
/*    */     
/*    */     public final Varargs apply(Varargs args) {
/*    */       String address = args.checkjstring(1);
/*    */       String method = args.checkjstring(2);
/*    */       IndexedSeq params = ScalaClosure$.MODULE$.toSimpleJavaObjects(args, 3);
/*    */       return this.$outer.li$cil$oc$server$machine$luaj$ComponentAPI$$super$owner().invoke((Function0<Object[]>)new ComponentAPI$$anonfun$initialize$5$$anonfun$apply$6(this, address, method, params));
/*    */     }
/*    */     
/*    */     public final class ComponentAPI$$anonfun$initialize$5$$anonfun$apply$6 extends AbstractFunction0<Object[]> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final String address$1;
/*    */       private final String method$1;
/*    */       private final IndexedSeq params$1;
/*    */       
/*    */       public final Object[] apply() {
/*    */         return this.$outer.li$cil$oc$server$machine$luaj$ComponentAPI$$anonfun$$$outer().machine().invoke(this.address$1, this.method$1, (Object[])this.params$1.toArray(ClassTag$.MODULE$.AnyRef()));
/*    */       }
/*    */       
/*    */       public ComponentAPI$$anonfun$initialize$5$$anonfun$apply$6(ComponentAPI$$anonfun$initialize$5 $outer, String address$1, String method$1, IndexedSeq params$1) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ComponentAPI$$anonfun$initialize$6 extends AbstractFunction1<Varargs, Varargs> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ComponentAPI$$anonfun$initialize$6(ComponentAPI $outer) {}
/*    */     
/*    */     public final Varargs apply(Varargs args) {
/*    */       return this.$outer.li$cil$oc$server$machine$luaj$ComponentAPI$$withComponent(args.checkjstring(1), (Function1<Component, Varargs>)new ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7(this, args));
/*    */     }
/*    */     
/*    */     public final class ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7 extends AbstractFunction1<Component, Varargs> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final Varargs args$1;
/*    */       
/*    */       public ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7(ComponentAPI$$anonfun$initialize$6 $outer, Varargs args$1) {}
/*    */       
/*    */       public final Varargs apply(Component component) {
/*    */         String method = this.args$1.checkjstring(2);
/*    */         Map methods = this.$outer.li$cil$oc$server$machine$luaj$ComponentAPI$$anonfun$$$outer().machine().methods(component.host());
/*    */         return this.$outer.li$cil$oc$server$machine$luaj$ComponentAPI$$anonfun$$$outer().li$cil$oc$server$machine$luaj$ComponentAPI$$super$owner().documentation((Function0<String>)new ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7$$anonfun$apply$8(this, method, methods));
/*    */       }
/*    */       
/*    */       public final class ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7$$anonfun$apply$8 extends AbstractFunction0<String> implements Serializable {
/*    */         public static final long serialVersionUID = 0L;
/*    */         private final String method$2;
/*    */         private final Map methods$1;
/*    */         
/*    */         public final String apply() {
/*    */           return (String)Option$.MODULE$.apply(this.methods$1.get(this.method$2)).map((Function1)new ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7$$anonfun$apply$8$$anonfun$apply$9(this)).orNull(Predef$.MODULE$.$conforms());
/*    */         }
/*    */         
/*    */         public ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7$$anonfun$apply$8(ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7 $outer, String method$2, Map methods$1) {}
/*    */         
/*    */         public final class ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7$$anonfun$apply$8$$anonfun$apply$9 extends AbstractFunction1<Callback, String> implements Serializable {
/*    */           public static final long serialVersionUID = 0L;
/*    */           
/*    */           public final String apply(Callback x$3) {
/*    */             return x$3.doc();
/*    */           }
/*    */           
/*    */           public ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7$$anonfun$apply$8$$anonfun$apply$9(ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7$$anonfun$apply$8 $outer) {}
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public Varargs li$cil$oc$server$machine$luaj$ComponentAPI$$withComponent(String address, Function1 f) {
/*    */     // Byte code:
/*    */     //   0: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*    */     //   3: aload_0
/*    */     //   4: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*    */     //   7: invokeinterface network : ()Lli/cil/oc/api/network/Network;
/*    */     //   12: aload_1
/*    */     //   13: invokeinterface node : (Ljava/lang/String;)Lli/cil/oc/api/network/Node;
/*    */     //   18: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*    */     //   21: astore_3
/*    */     //   22: aload_3
/*    */     //   23: instanceof scala/Some
/*    */     //   26: ifeq -> 119
/*    */     //   29: aload_3
/*    */     //   30: checkcast scala/Some
/*    */     //   33: astore #4
/*    */     //   35: aload #4
/*    */     //   37: invokevirtual x : ()Ljava/lang/Object;
/*    */     //   40: checkcast li/cil/oc/api/network/Node
/*    */     //   43: astore #5
/*    */     //   45: aload #5
/*    */     //   47: instanceof li/cil/oc/api/network/Component
/*    */     //   50: ifeq -> 119
/*    */     //   53: aload #5
/*    */     //   55: checkcast li/cil/oc/api/network/Component
/*    */     //   58: astore #6
/*    */     //   60: aload #6
/*    */     //   62: aload_0
/*    */     //   63: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*    */     //   66: invokeinterface canBeSeenFrom : (Lli/cil/oc/api/network/Node;)Z
/*    */     //   71: ifne -> 103
/*    */     //   74: aload #6
/*    */     //   76: aload_0
/*    */     //   77: invokevirtual node : ()Lli/cil/oc/api/network/Node;
/*    */     //   80: astore #7
/*    */     //   82: dup
/*    */     //   83: ifnonnull -> 95
/*    */     //   86: pop
/*    */     //   87: aload #7
/*    */     //   89: ifnull -> 103
/*    */     //   92: goto -> 119
/*    */     //   95: aload #7
/*    */     //   97: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   100: ifeq -> 119
/*    */     //   103: aload_2
/*    */     //   104: aload #6
/*    */     //   106: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   111: checkcast li/cil/repack/org/luaj/vm2/Varargs
/*    */     //   114: astore #8
/*    */     //   116: goto -> 132
/*    */     //   119: getstatic li/cil/repack/org/luaj/vm2/LuaValue.NIL : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*    */     //   122: ldc 'no such component'
/*    */     //   124: invokestatic valueOf : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaString;
/*    */     //   127: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*    */     //   130: astore #8
/*    */     //   132: aload #8
/*    */     //   134: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #81	-> 0
/*    */     //   #82	-> 22
/*    */     //   #83	-> 103
/*    */     //   #85	-> 119
/*    */     //   #81	-> 132
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	135	0	this	Lli/cil/oc/server/machine/luaj/ComponentAPI;
/*    */     //   0	135	1	address	Ljava/lang/String;
/*    */     //   0	135	2	f	Lscala/Function1;
/*    */     //   45	90	5	component	Lli/cil/oc/api/network/Node;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luaj\ComponentAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */