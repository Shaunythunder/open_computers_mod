/*    */ package li.cil.oc.server.machine.luac;
/*    */ import li.cil.repack.com.naef.jnlua.LuaState;
/*    */ import scala.Tuple2;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0353A!\001\002\001\037\ta1i\\7q_:,g\016^!Q\023*\0211\001B\001\005YV\f7M\003\002\006\r\0059Q.Y2iS:,'BA\004\t\003\031\031XM\035<fe*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\023\033\005\021\021BA\n\003\0051q\025\r^5wK2+\030-\021)J\021%)\002A!A!\002\0231\022$A\003po:,'\017\005\002\022/%\021\001D\001\002\026\035\006$\030N^3Mk\006\f%o\0315ji\026\034G/\036:f\023\t)\"\003C\003\034\001\021\005A$\001\004=S:LGO\020\013\003;y\001\"!\005\001\t\013UQ\002\031\001\f\t\013\001\002A\021A\021\002\025%t\027\016^5bY&TX\rF\001#!\t\031c%D\001%\025\005)\023!B:dC2\f\027BA\024%\005\021)f.\033;\t\013%\002A\021\002\026\002\033]LG\017[\"p[B|g.\0328u)\rYcf\016\t\003G1J!!\f\023\003\007%sG\017C\0030Q\001\007\001'A\004bI\022\024Xm]:\021\005E\"dBA\0223\023\t\031D%\001\004Qe\026$WMZ\005\003kY\022aa\025;sS:<'BA\032%\021\025A\004\0061\001:\003\0051\007\003B\022;y-J!a\017\023\003\023\031+hn\031;j_:\f\004CA\037C\033\005q$BA A\003\035qW\r^<pe.T!!\021\005\002\007\005\004\030.\003\002D}\tI1i\\7q_:,g\016\036\005\f\013\002\001\n1!A\001\n\0231\025$A\006tkB,'\017J8x]\026\024X#\001\f")
/*    */ public class ComponentAPI extends NativeLuaAPI {
/*    */   public ComponentAPI(NativeLuaArchitecture owner) {
/*  8 */     super(owner);
/*    */   } public void initialize() {
/* 10 */     lua().newTable();
/*    */     
/* 12 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComponentAPI$$anonfun$initialize$1(this));
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
/* 26 */     lua().setField(-2, "list");
/*    */     
/* 28 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComponentAPI$$anonfun$initialize$2(this));
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
/* 39 */     lua().setField(-2, "type");
/*    */     
/* 41 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComponentAPI$$anonfun$initialize$3(this));
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
/* 53 */     lua().setField(-2, "slot");
/*    */     
/* 55 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComponentAPI$$anonfun$initialize$4(this));
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
/*    */     
/* 72 */     lua().setField(-2, "methods");
/*    */     
/* 74 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComponentAPI$$anonfun$initialize$5(this));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 80 */     lua().setField(-2, "invoke");
/*    */     
/* 82 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComponentAPI$$anonfun$initialize$6(this));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 89 */     lua().setField(-2, "doc");
/*    */     
/* 91 */     lua().setGlobal("component");
/*    */   }
/*    */   
/*    */   public final class ComponentAPI$$anonfun$initialize$1 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final int apply(LuaState lua) {
/*    */       synchronized (this.$outer.components()) {
/*    */         Option filter = lua.isString(1) ? Option$.MODULE$.apply(lua.toString(1)) : (Option)None$.MODULE$;
/*    */         boolean exact = lua.isBoolean(2) ? lua.toBoolean(2) : true;
/*    */         lua.newTable(0, this.$outer.components().size());
/*    */         WrapAsScala$.MODULE$.mapAsScalaMap(this.$outer.components()).withFilter((Function1)new ComponentAPI$$anonfun$initialize$1$$anonfun$apply$1(this)).foreach((Function1)new ComponentAPI$$anonfun$initialize$1$$anonfun$apply$2(this, filter, exact, lua));
/*    */         Integer integer = BoxesRunTime.boxToInteger(1);
/*    */         return BoxesRunTime.unboxToInt(integer);
/*    */       } 
/*    */     }
/*    */     
/*    */     public ComponentAPI$$anonfun$initialize$1(ComponentAPI $outer) {}
/*    */     
/*    */     public final boolean li$cil$oc$server$machine$luac$ComponentAPI$$anonfun$$matches$1(String name, Option filter$1, boolean exact$1) {
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
/*    */       private final LuaState lua$1;
/*    */       
/*    */       public final void apply(Tuple2 x$1) {
/*    */         Tuple2 tuple2 = x$1;
/*    */         if (tuple2 != null) {
/*    */           String address = (String)tuple2._1(), name = (String)tuple2._2();
/*    */           this.lua$1.pushString(address);
/*    */           this.lua$1.pushString(name);
/*    */           this.lua$1.rawSet(-3);
/*    */           BoxedUnit boxedUnit = (this.filter$1.isEmpty() || this.$outer.li$cil$oc$server$machine$luac$ComponentAPI$$anonfun$$matches$1(name, this.filter$1, this.exact$1)) ? BoxedUnit.UNIT : BoxedUnit.UNIT;
/*    */           return;
/*    */         } 
/*    */         throw new MatchError(tuple2);
/*    */       }
/*    */       
/*    */       public ComponentAPI$$anonfun$initialize$1$$anonfun$apply$2(ComponentAPI$$anonfun$initialize$1 $outer, Option filter$1, boolean exact$1, LuaState lua$1) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ComponentAPI$$anonfun$initialize$2 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final int apply(LuaState lua) {
/*    */       synchronized (this.$outer.components()) {
/*    */         byte b;
/*    */         String str = (String)this.$outer.components().get(lua.checkString(1));
/*    */         if (str != null) {
/*    */           String str1 = str;
/*    */           lua.pushString(str1);
/*    */           b = 1;
/*    */         } else {
/*    */           lua.pushNil();
/*    */           lua.pushString("no such component");
/*    */           b = 2;
/*    */         } 
/*    */         Integer integer = BoxesRunTime.boxToInteger(b);
/*    */         return BoxesRunTime.unboxToInt(integer);
/*    */       } 
/*    */     }
/*    */     
/*    */     public ComponentAPI$$anonfun$initialize$2(ComponentAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class ComponentAPI$$anonfun$initialize$3 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final int apply(LuaState lua) {
/*    */       synchronized (this.$outer.components()) {
/*    */         byte b;
/*    */         String address = lua.checkString(1);
/*    */         String str1 = (String)this.$outer.components().get(address);
/*    */         if (str1 != null) {
/*    */           lua.pushInteger(this.$outer.li$cil$oc$server$machine$luac$ComponentAPI$$super$owner().machine().host().componentSlot(address));
/*    */           b = 1;
/*    */         } else {
/*    */           lua.pushNil();
/*    */           lua.pushString("no such component");
/*    */           b = 2;
/*    */         } 
/*    */         Integer integer = BoxesRunTime.boxToInteger(b);
/*    */         return BoxesRunTime.unboxToInt(integer);
/*    */       } 
/*    */     }
/*    */     
/*    */     public ComponentAPI$$anonfun$initialize$3(ComponentAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class ComponentAPI$$anonfun$initialize$4 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ComponentAPI$$anonfun$initialize$4(ComponentAPI $outer) {}
/*    */     
/*    */     public final int apply(LuaState lua) {
/*    */       return this.$outer.li$cil$oc$server$machine$luac$ComponentAPI$$withComponent(lua.checkString(1), (Function1<Component, Object>)new ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3(this, lua));
/*    */     }
/*    */     
/*    */     public final class ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3 extends AbstractFunction1<Component, Object> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       public final LuaState lua$2;
/*    */       
/*    */       public ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3(ComponentAPI$$anonfun$initialize$4 $outer, LuaState lua$2) {}
/*    */       
/*    */       public final int apply(Component component) {
/*    */         this.lua$2.newTable();
/*    */         WrapAsScala$.MODULE$.mapAsScalaMap(this.$outer.li$cil$oc$server$machine$luac$ComponentAPI$$anonfun$$$outer().machine().methods(component.host())).withFilter((Function1)new ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3$$anonfun$apply$4(this)).foreach((Function1)new ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3$$anonfun$apply$5(this));
/*    */         return 1;
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
/*    */         
/*    */         public final void apply(Tuple2 x$2) {
/*    */           Tuple2 tuple2 = x$2;
/*    */           if (tuple2 != null) {
/*    */             String name = (String)tuple2._1();
/*    */             Callback annotation = (Callback)tuple2._2();
/*    */             this.$outer.lua$2.pushString(name);
/*    */             this.$outer.lua$2.newTable();
/*    */             this.$outer.lua$2.pushBoolean(annotation.direct());
/*    */             this.$outer.lua$2.setField(-2, "direct");
/*    */             this.$outer.lua$2.pushBoolean(annotation.getter());
/*    */             this.$outer.lua$2.setField(-2, "getter");
/*    */             this.$outer.lua$2.pushBoolean(annotation.setter());
/*    */             this.$outer.lua$2.setField(-2, "setter");
/*    */             this.$outer.lua$2.rawSet(-3);
/*    */             BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */             return;
/*    */           } 
/*    */           throw new MatchError(tuple2);
/*    */         }
/*    */         
/*    */         public ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3$$anonfun$apply$5(ComponentAPI$$anonfun$initialize$4$$anonfun$apply$3 $outer) {}
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ComponentAPI$$anonfun$initialize$5 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ComponentAPI$$anonfun$initialize$5(ComponentAPI $outer) {}
/*    */     
/*    */     public final int apply(LuaState lua) {
/*    */       String address = lua.checkString(1);
/*    */       String method = lua.checkString(2);
/*    */       IndexedSeq args = ExtendedLuaState$.MODULE$.extendLuaState(lua).toSimpleJavaObjects(3);
/*    */       return this.$outer.li$cil$oc$server$machine$luac$ComponentAPI$$super$owner().invoke((Function0<Object[]>)new ComponentAPI$$anonfun$initialize$5$$anonfun$apply$6(this, address, method, args));
/*    */     }
/*    */     
/*    */     public final class ComponentAPI$$anonfun$initialize$5$$anonfun$apply$6 extends AbstractFunction0<Object[]> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final String address$1;
/*    */       private final String method$1;
/*    */       private final IndexedSeq args$1;
/*    */       
/*    */       public final Object[] apply() {
/*    */         return this.$outer.li$cil$oc$server$machine$luac$ComponentAPI$$anonfun$$$outer().machine().invoke(this.address$1, this.method$1, (Object[])this.args$1.toArray(ClassTag$.MODULE$.AnyRef()));
/*    */       }
/*    */       
/*    */       public ComponentAPI$$anonfun$initialize$5$$anonfun$apply$6(ComponentAPI$$anonfun$initialize$5 $outer, String address$1, String method$1, IndexedSeq args$1) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ComponentAPI$$anonfun$initialize$6 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ComponentAPI$$anonfun$initialize$6(ComponentAPI $outer) {}
/*    */     
/*    */     public final int apply(LuaState lua) {
/*    */       return this.$outer.li$cil$oc$server$machine$luac$ComponentAPI$$withComponent(lua.checkString(1), (Function1<Component, Object>)new ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7(this, lua));
/*    */     }
/*    */     
/*    */     public final class ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7 extends AbstractFunction1<Component, Object> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final LuaState lua$3;
/*    */       
/*    */       public ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7(ComponentAPI$$anonfun$initialize$6 $outer, LuaState lua$3) {}
/*    */       
/*    */       public final int apply(Component component) {
/*    */         String method = this.lua$3.checkString(2);
/*    */         Map methods = this.$outer.li$cil$oc$server$machine$luac$ComponentAPI$$anonfun$$$outer().machine().methods(component.host());
/*    */         return this.$outer.li$cil$oc$server$machine$luac$ComponentAPI$$anonfun$$$outer().li$cil$oc$server$machine$luac$ComponentAPI$$super$owner().documentation((Function0<String>)new ComponentAPI$$anonfun$initialize$6$$anonfun$apply$7$$anonfun$apply$8(this, method, methods));
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
/*    */   public int li$cil$oc$server$machine$luac$ComponentAPI$$withComponent(String address, Function1 f) {
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
/*    */     //   111: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*    */     //   114: istore #8
/*    */     //   116: goto -> 138
/*    */     //   119: aload_0
/*    */     //   120: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*    */     //   123: invokevirtual pushNil : ()V
/*    */     //   126: aload_0
/*    */     //   127: invokevirtual lua : ()Lli/cil/repack/com/naef/jnlua/LuaState;
/*    */     //   130: ldc 'no such component'
/*    */     //   132: invokevirtual pushString : (Ljava/lang/String;)V
/*    */     //   135: iconst_2
/*    */     //   136: istore #8
/*    */     //   138: iload #8
/*    */     //   140: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #94	-> 0
/*    */     //   #95	-> 22
/*    */     //   #96	-> 103
/*    */     //   #98	-> 119
/*    */     //   #99	-> 126
/*    */     //   #100	-> 135
/*    */     //   #97	-> 136
/*    */     //   #94	-> 138
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	141	0	this	Lli/cil/oc/server/machine/luac/ComponentAPI;
/*    */     //   0	141	1	address	Ljava/lang/String;
/*    */     //   0	141	2	f	Lscala/Function1;
/*    */     //   45	96	5	component	Lli/cil/oc/api/network/Node;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luac\ComponentAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */