/*    */ package li.cil.oc.server.machine.luaj;
/*    */ import li.cil.oc.api.machine.Value;
/*    */ import li.cil.oc.util.ScalaClosure$;
/*    */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*    */ import li.cil.repack.org.luaj.vm2.Varargs;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.immutable.IndexedSeq;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001-2A!\001\002\001\037\tYQk]3sI\006$\030-\021)J\025\t\031A!\001\003mk\006T'BA\003\007\003\035i\027m\0315j]\026T!a\002\005\002\rM,'O^3s\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\003\001A\001\"!\005\n\016\003\tI!a\005\002\003\0171+\030MS!Q\023\"IQ\003\001B\001B\003%a#G\001\006_^tWM\035\t\003#]I!\001\007\002\003'1+\030M\023'vC\006\0238\r[5uK\016$XO]3\n\005U\021\002\"B\016\001\t\003a\022A\002\037j]&$h\b\006\002\036=A\021\021\003\001\005\006+i\001\rA\006\005\006A\001!\t%I\001\013S:LG/[1mSj,G#\001\022\021\005\r2S\"\001\023\013\003\025\nQa]2bY\006L!a\n\023\003\tUs\027\016\036\005\fS\001\001\n1!A\001\n\023Q\023$A\006tkB,'\017J8x]\026\024X#\001\f")
/*    */ public class UserdataAPI extends LuaJAPI {
/*    */   public UserdataAPI(LuaJLuaArchitecture owner) {
/* 13 */     super(owner);
/*    */   } public void initialize() {
/* 15 */     LuaTable userdata = LuaValue.tableOf();
/*    */     
/* 17 */     userdata.set("apply", (LuaValue)ScalaClosure$.MODULE$.wrapVarArgClosure((Function1)new UserdataAPI$$anonfun$initialize$1(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     userdata.set("unapply", (LuaValue)ScalaClosure$.MODULE$.wrapVarArgClosure((Function1)new UserdataAPI$$anonfun$initialize$2(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     userdata.set("call", (LuaValue)ScalaClosure$.MODULE$.wrapVarArgClosure((Function1)new UserdataAPI$$anonfun$initialize$3(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     userdata.set("dispose", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new UserdataAPI$$anonfun$initialize$4(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 46 */     userdata.set("methods", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new UserdataAPI$$anonfun$initialize$5(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 54 */     userdata.set("invoke", (LuaValue)ScalaClosure$.MODULE$.wrapVarArgClosure((Function1)new UserdataAPI$$anonfun$initialize$6(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 61 */     userdata.set("doc", (LuaValue)ScalaClosure$.MODULE$.wrapVarArgClosure((Function1)new UserdataAPI$$anonfun$initialize$7(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 67 */     lua().set("userdata", (LuaValue)userdata);
/*    */   }
/*    */   
/*    */   public final class UserdataAPI$$anonfun$initialize$1 extends AbstractFunction1<Varargs, Varargs> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UserdataAPI$$anonfun$initialize$1(UserdataAPI $outer) {}
/*    */     
/*    */     public final Varargs apply(Varargs args) {
/*    */       Value value = (Value)args.checkuserdata(1, Value.class);
/*    */       IndexedSeq params = ScalaClosure$.MODULE$.toSimpleJavaObjects(args, 2);
/*    */       return this.$outer.li$cil$oc$server$machine$luaj$UserdataAPI$$super$owner().invoke((Function0<Object[]>)new UserdataAPI$$anonfun$initialize$1$$anonfun$apply$1(this, value, params));
/*    */     }
/*    */     
/*    */     public final class UserdataAPI$$anonfun$initialize$1$$anonfun$apply$1 extends AbstractFunction0<Object[]> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final Value value$1;
/*    */       private final IndexedSeq params$1;
/*    */       
/*    */       public final Object[] apply() {
/*    */         return Registry$.MODULE$.convert(new Object[] { this.value$1.apply((Context)this.$outer.li$cil$oc$server$machine$luaj$UserdataAPI$$anonfun$$$outer().machine(), (Arguments)new ArgumentsImpl((Seq)this.params$1)) });
/*    */       }
/*    */       
/*    */       public UserdataAPI$$anonfun$initialize$1$$anonfun$apply$1(UserdataAPI$$anonfun$initialize$1 $outer, Value value$1, IndexedSeq params$1) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class UserdataAPI$$anonfun$initialize$2 extends AbstractFunction1<Varargs, Varargs> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UserdataAPI$$anonfun$initialize$2(UserdataAPI $outer) {}
/*    */     
/*    */     public final Varargs apply(Varargs args) {
/*    */       Value value = (Value)args.checkuserdata(1, Value.class);
/*    */       IndexedSeq params = ScalaClosure$.MODULE$.toSimpleJavaObjects(args, 2);
/*    */       return this.$outer.li$cil$oc$server$machine$luaj$UserdataAPI$$super$owner().invoke((Function0<Object[]>)new UserdataAPI$$anonfun$initialize$2$$anonfun$apply$2(this, value, params));
/*    */     }
/*    */     
/*    */     public final class UserdataAPI$$anonfun$initialize$2$$anonfun$apply$2 extends AbstractFunction0<Null$> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final Value value$2;
/*    */       private final IndexedSeq params$2;
/*    */       
/*    */       public UserdataAPI$$anonfun$initialize$2$$anonfun$apply$2(UserdataAPI$$anonfun$initialize$2 $outer, Value value$2, IndexedSeq params$2) {}
/*    */       
/*    */       public final Null$ apply() {
/*    */         this.value$2.unapply((Context)this.$outer.li$cil$oc$server$machine$luaj$UserdataAPI$$anonfun$$$outer().machine(), (Arguments)new ArgumentsImpl((Seq)this.params$2));
/*    */         return null;
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public final class UserdataAPI$$anonfun$initialize$3 extends AbstractFunction1<Varargs, Varargs> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UserdataAPI$$anonfun$initialize$3(UserdataAPI $outer) {}
/*    */     
/*    */     public final Varargs apply(Varargs args) {
/*    */       Value value = (Value)args.checkuserdata(1, Value.class);
/*    */       IndexedSeq params = ScalaClosure$.MODULE$.toSimpleJavaObjects(args, 2);
/*    */       return this.$outer.li$cil$oc$server$machine$luaj$UserdataAPI$$super$owner().invoke((Function0<Object[]>)new UserdataAPI$$anonfun$initialize$3$$anonfun$apply$3(this, value, params));
/*    */     }
/*    */     
/*    */     public final class UserdataAPI$$anonfun$initialize$3$$anonfun$apply$3 extends AbstractFunction0<Object[]> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final Value value$3;
/*    */       private final IndexedSeq params$3;
/*    */       
/*    */       public final Object[] apply() {
/*    */         return Registry$.MODULE$.convert(this.value$3.call((Context)this.$outer.li$cil$oc$server$machine$luaj$UserdataAPI$$anonfun$$$outer().machine(), (Arguments)new ArgumentsImpl((Seq)this.params$3)));
/*    */       }
/*    */       
/*    */       public UserdataAPI$$anonfun$initialize$3$$anonfun$apply$3(UserdataAPI$$anonfun$initialize$3 $outer, Value value$3, IndexedSeq params$3) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class UserdataAPI$$anonfun$initialize$4 extends AbstractFunction1<Varargs, LuaValue> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UserdataAPI$$anonfun$initialize$4(UserdataAPI $outer) {}
/*    */     
/*    */     public final LuaValue apply(Varargs args) {
/*    */       Value value = (Value)args.checkuserdata(1, Value.class);
/*    */       try {
/*    */         value.dispose((Context)this.$outer.machine());
/*    */       } finally {
/*    */         Exception exception = null;
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   public final class UserdataAPI$$anonfun$initialize$5 extends AbstractFunction1<Varargs, LuaTable> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UserdataAPI$$anonfun$initialize$5(UserdataAPI $outer) {}
/*    */     
/*    */     public final LuaTable apply(Varargs args) {
/*    */       Object value = args.checkuserdata(1, Value.class);
/*    */       return LuaValue.tableOf((LuaValue[])((TraversableOnce)((GenericTraversableTemplate)WrapAsScala$.MODULE$.mapAsScalaMap(this.$outer.machine().methods(value)).map((Function1)new UserdataAPI$$anonfun$initialize$5$$anonfun$apply$4(this), Iterable$.MODULE$.canBuildFrom())).flatten((Function1)Predef$.MODULE$.$conforms())).toArray(ClassTag$.MODULE$.apply(LuaValue.class)));
/*    */     }
/*    */     
/*    */     public final class UserdataAPI$$anonfun$initialize$5$$anonfun$apply$4 extends AbstractFunction1<Tuple2<String, Callback>, Seq<LuaValue>> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public UserdataAPI$$anonfun$initialize$5$$anonfun$apply$4(UserdataAPI$$anonfun$initialize$5 $outer) {}
/*    */       
/*    */       public final Seq<LuaValue> apply(Tuple2 entry) {
/*    */         Tuple2 tuple2 = entry;
/*    */         if (tuple2 != null) {
/*    */           String name = (String)tuple2._1();
/*    */           Callback annotation = (Callback)tuple2._2();
/*    */           Tuple2 tuple22 = new Tuple2(name, annotation), tuple21 = tuple22;
/*    */           String str1 = (String)tuple21._1();
/*    */           Callback callback1 = (Callback)tuple21._2();
/*    */           (new LuaValue[2])[0] = (LuaValue)LuaValue.valueOf(str1);
/*    */           (new LuaValue[2])[1] = (LuaValue)LuaValue.valueOf(callback1.direct());
/*    */           return (Seq<LuaValue>)Seq$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new LuaValue[2]));
/*    */         } 
/*    */         throw new MatchError(tuple2);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public final class UserdataAPI$$anonfun$initialize$6 extends AbstractFunction1<Varargs, Varargs> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UserdataAPI$$anonfun$initialize$6(UserdataAPI $outer) {}
/*    */     
/*    */     public final Varargs apply(Varargs args) {
/*    */       Value value = (Value)args.checkuserdata(1, Value.class);
/*    */       String method = args.checkjstring(2);
/*    */       IndexedSeq params = ScalaClosure$.MODULE$.toSimpleJavaObjects(args, 3);
/*    */       return this.$outer.li$cil$oc$server$machine$luaj$UserdataAPI$$super$owner().invoke((Function0<Object[]>)new UserdataAPI$$anonfun$initialize$6$$anonfun$apply$5(this, value, method, params));
/*    */     }
/*    */     
/*    */     public final class UserdataAPI$$anonfun$initialize$6$$anonfun$apply$5 extends AbstractFunction0<Object[]> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final Value value$4;
/*    */       private final String method$1;
/*    */       private final IndexedSeq params$4;
/*    */       
/*    */       public final Object[] apply() {
/*    */         return this.$outer.li$cil$oc$server$machine$luaj$UserdataAPI$$anonfun$$$outer().machine().invoke(this.value$4, this.method$1, (Object[])this.params$4.toArray(ClassTag$.MODULE$.AnyRef()));
/*    */       }
/*    */       
/*    */       public UserdataAPI$$anonfun$initialize$6$$anonfun$apply$5(UserdataAPI$$anonfun$initialize$6 $outer, Value value$4, String method$1, IndexedSeq params$4) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class UserdataAPI$$anonfun$initialize$7 extends AbstractFunction1<Varargs, Varargs> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public UserdataAPI$$anonfun$initialize$7(UserdataAPI $outer) {}
/*    */     
/*    */     public final Varargs apply(Varargs args) {
/*    */       Value value = (Value)args.checkuserdata(1, Value.class);
/*    */       String method = args.checkjstring(2);
/*    */       return this.$outer.li$cil$oc$server$machine$luaj$UserdataAPI$$super$owner().documentation((Function0<String>)new UserdataAPI$$anonfun$initialize$7$$anonfun$apply$6(this, value, method));
/*    */     }
/*    */     
/*    */     public final class UserdataAPI$$anonfun$initialize$7$$anonfun$apply$6 extends AbstractFunction0<String> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final Value value$5;
/*    */       private final String method$2;
/*    */       
/*    */       public final String apply() {
/*    */         return ((Callback)WrapAsScala$.MODULE$.mapAsScalaMap(this.$outer.li$cil$oc$server$machine$luaj$UserdataAPI$$anonfun$$$outer().machine().methods(this.value$5)).apply(this.method$2)).doc();
/*    */       }
/*    */       
/*    */       public UserdataAPI$$anonfun$initialize$7$$anonfun$apply$6(UserdataAPI$$anonfun$initialize$7 $outer, Value value$5, String method$2) {}
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luaj\UserdataAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */