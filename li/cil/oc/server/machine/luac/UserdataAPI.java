/*     */ package li.cil.oc.server.machine.luac;
/*     */ import li.cil.oc.api.Persistable;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Value;
/*     */ import li.cil.oc.util.ExtendedLuaState$;
/*     */ import li.cil.repack.com.naef.jnlua.LuaState;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.immutable.IndexedSeq;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001-2A!\001\002\001\037\tYQk]3sI\006$\030-\021)J\025\t\031A!\001\003mk\006\034'BA\003\007\003\035i\027m\0315j]\026T!a\002\005\002\rM,'O^3s\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\003\001A\001\"!\005\n\016\003\tI!a\005\002\003\0319\013G/\033<f\031V\f\027\tU%\t\023U\001!\021!Q\001\nYI\022!B8x]\026\024\bCA\t\030\023\tA\"AA\013OCRLg/\032'vC\006\0238\r[5uK\016$XO]3\n\005U\021\002\"B\016\001\t\003a\022A\002\037j]&$h\b\006\002\036=A\021\021\003\001\005\006+i\001\rA\006\005\006A\001!\t!I\001\013S:LG/[1mSj,G#\001\022\021\005\r2S\"\001\023\013\003\025\nQa]2bY\006L!a\n\023\003\tUs\027\016\036\005\fS\001\001\n1!A\001\n\023Q\023$A\006tkB,'\017J8x]\026\024X#\001\f")
/*     */ public class UserdataAPI extends NativeLuaAPI {
/*     */   public UserdataAPI(NativeLuaArchitecture owner) {
/*  19 */     super(owner);
/*     */   } public void initialize() {
/*  21 */     lua().newTable();
/*     */     
/*  23 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UserdataAPI$$anonfun$initialize$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  34 */     lua().setField(-2, "save");
/*     */     
/*  36 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UserdataAPI$$anonfun$initialize$2(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     lua().setField(-2, "load");
/*     */     
/*  57 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UserdataAPI$$anonfun$initialize$3(this));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  62 */     lua().setField(-2, "apply");
/*     */     
/*  64 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UserdataAPI$$anonfun$initialize$4(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     lua().setField(-2, "unapply");
/*     */     
/*  74 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UserdataAPI$$anonfun$initialize$5(this));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     lua().setField(-2, "call");
/*     */     
/*  81 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UserdataAPI$$anonfun$initialize$6(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     lua().setField(-2, "dispose");
/*     */     
/*  90 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UserdataAPI$$anonfun$initialize$7(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     lua().setField(-2, "methods");
/*     */     
/* 100 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UserdataAPI$$anonfun$initialize$8(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 106 */     lua().setField(-2, "invoke");
/*     */     
/* 108 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new UserdataAPI$$anonfun$initialize$9(this));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 113 */     lua().setField(-2, "doc");
/*     */     
/* 115 */     lua().setGlobal("userdata");
/*     */   }
/*     */   
/*     */   public final class UserdataAPI$$anonfun$initialize$1 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UserdataAPI$$anonfun$initialize$1(UserdataAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       NBTTagCompound nbt = new NBTTagCompound();
/*     */       Persistable persistable = (Persistable)lua.toJavaObjectRaw(1);
/*     */       lua.pushString(persistable.getClass().getName());
/*     */       persistable.save(nbt);
/*     */       ByteArrayOutputStream baos = new ByteArrayOutputStream();
/*     */       DataOutputStream dos = new DataOutputStream(baos);
/*     */       CompressedStreamTools.func_74800_a(nbt, dos);
/*     */       lua.pushByteArray(baos.toByteArray());
/*     */       return 2;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UserdataAPI$$anonfun$initialize$2 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UserdataAPI$$anonfun$initialize$2(UserdataAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       try {
/*     */         String className = lua.toString(1);
/*     */         Class<?> clazz = Class.forName(className);
/*     */         Persistable persistable = (Persistable)clazz.newInstance();
/*     */         byte[] data = lua.toByteArray(2);
/*     */         ByteArrayInputStream bais = new ByteArrayInputStream(data);
/*     */         DataInputStream dis = new DataInputStream(bais);
/*     */         NBTTagCompound nbt = CompressedStreamTools.func_74794_a(dis);
/*     */         persistable.load(nbt);
/*     */         return 1;
/*     */       } finally {
/*     */         OpenComputers$.MODULE$.log().warn("Error in userdata load function.", null);
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UserdataAPI$$anonfun$initialize$3 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UserdataAPI$$anonfun$initialize$3(UserdataAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       Value value = (Value)lua.toJavaObjectRaw(1);
/*     */       IndexedSeq args = ExtendedLuaState$.MODULE$.extendLuaState(lua).toSimpleJavaObjects(2);
/*     */       return this.$outer.li$cil$oc$server$machine$luac$UserdataAPI$$super$owner().invoke((Function0<Object[]>)new UserdataAPI$$anonfun$initialize$3$$anonfun$apply$1(this, value, args));
/*     */     }
/*     */     
/*     */     public final class UserdataAPI$$anonfun$initialize$3$$anonfun$apply$1 extends AbstractFunction0<Object[]> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final Value value$1;
/*     */       private final IndexedSeq args$1;
/*     */       
/*     */       public final Object[] apply() {
/*     */         return Registry$.MODULE$.convert(new Object[] { this.value$1.apply((Context)this.$outer.li$cil$oc$server$machine$luac$UserdataAPI$$anonfun$$$outer().machine(), (Arguments)new ArgumentsImpl((Seq)this.args$1)) });
/*     */       }
/*     */       
/*     */       public UserdataAPI$$anonfun$initialize$3$$anonfun$apply$1(UserdataAPI$$anonfun$initialize$3 $outer, Value value$1, IndexedSeq args$1) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UserdataAPI$$anonfun$initialize$4 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UserdataAPI$$anonfun$initialize$4(UserdataAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       Value value = (Value)lua.toJavaObjectRaw(1);
/*     */       IndexedSeq args = ExtendedLuaState$.MODULE$.extendLuaState(lua).toSimpleJavaObjects(2);
/*     */       return this.$outer.li$cil$oc$server$machine$luac$UserdataAPI$$super$owner().invoke((Function0<Object[]>)new UserdataAPI$$anonfun$initialize$4$$anonfun$apply$2(this, value, args));
/*     */     }
/*     */     
/*     */     public final class UserdataAPI$$anonfun$initialize$4$$anonfun$apply$2 extends AbstractFunction0<Null$> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final Value value$2;
/*     */       private final IndexedSeq args$2;
/*     */       
/*     */       public UserdataAPI$$anonfun$initialize$4$$anonfun$apply$2(UserdataAPI$$anonfun$initialize$4 $outer, Value value$2, IndexedSeq args$2) {}
/*     */       
/*     */       public final Null$ apply() {
/*     */         this.value$2.unapply((Context)this.$outer.li$cil$oc$server$machine$luac$UserdataAPI$$anonfun$$$outer().machine(), (Arguments)new ArgumentsImpl((Seq)this.args$2));
/*     */         return null;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UserdataAPI$$anonfun$initialize$5 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UserdataAPI$$anonfun$initialize$5(UserdataAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       Value value = (Value)lua.toJavaObjectRaw(1);
/*     */       IndexedSeq args = ExtendedLuaState$.MODULE$.extendLuaState(lua).toSimpleJavaObjects(2);
/*     */       return this.$outer.li$cil$oc$server$machine$luac$UserdataAPI$$super$owner().invoke((Function0<Object[]>)new UserdataAPI$$anonfun$initialize$5$$anonfun$apply$3(this, value, args));
/*     */     }
/*     */     
/*     */     public final class UserdataAPI$$anonfun$initialize$5$$anonfun$apply$3 extends AbstractFunction0<Object[]> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final Value value$3;
/*     */       private final IndexedSeq args$3;
/*     */       
/*     */       public final Object[] apply() {
/*     */         return Registry$.MODULE$.convert(this.value$3.call((Context)this.$outer.li$cil$oc$server$machine$luac$UserdataAPI$$anonfun$$$outer().machine(), (Arguments)new ArgumentsImpl((Seq)this.args$3)));
/*     */       }
/*     */       
/*     */       public UserdataAPI$$anonfun$initialize$5$$anonfun$apply$3(UserdataAPI$$anonfun$initialize$5 $outer, Value value$3, IndexedSeq args$3) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UserdataAPI$$anonfun$initialize$6 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UserdataAPI$$anonfun$initialize$6(UserdataAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       Value value = (Value)lua.toJavaObjectRaw(1);
/*     */       try {
/*     */         value.dispose((Context)this.$outer.machine());
/*     */       } finally {
/*     */         Exception exception = null;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UserdataAPI$$anonfun$initialize$7 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UserdataAPI$$anonfun$initialize$7(UserdataAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       Value value = (Value)lua.toJavaObjectRaw(1);
/*     */       ExtendedLuaState.ExtendedLuaState qual$1 = ExtendedLuaState$.MODULE$.extendLuaState(lua);
/*     */       Map x$2 = (Map)WrapAsScala$.MODULE$.mapAsScalaMap(this.$outer.machine().methods(value)).map((Function1)new UserdataAPI$$anonfun$initialize$7$$anonfun$1(this), Map$.MODULE$.canBuildFrom());
/*     */       IdentityHashMap x$3 = qual$1.pushValue$default$2();
/*     */       qual$1.pushValue(x$2, x$3);
/*     */       return 1;
/*     */     }
/*     */     
/*     */     public final class UserdataAPI$$anonfun$initialize$7$$anonfun$1 extends AbstractFunction1<Tuple2<String, Callback>, Tuple2<String, Object>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public UserdataAPI$$anonfun$initialize$7$$anonfun$1(UserdataAPI$$anonfun$initialize$7 $outer) {}
/*     */       
/*     */       public final Tuple2<String, Object> apply(Tuple2 entry) {
/*     */         Tuple2 tuple2 = entry;
/*     */         if (tuple2 != null) {
/*     */           String name = (String)tuple2._1();
/*     */           Callback annotation = (Callback)tuple2._2();
/*     */           Tuple2 tuple22 = new Tuple2(name, annotation), tuple21 = tuple22;
/*     */           String str1 = (String)tuple21._1();
/*     */           Callback callback1 = (Callback)tuple21._2();
/*     */           return Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(str1), BoxesRunTime.boxToBoolean(callback1.direct()));
/*     */         } 
/*     */         throw new MatchError(tuple2);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UserdataAPI$$anonfun$initialize$8 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UserdataAPI$$anonfun$initialize$8(UserdataAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       Value value = (Value)lua.toJavaObjectRaw(1);
/*     */       String method = lua.checkString(2);
/*     */       IndexedSeq args = ExtendedLuaState$.MODULE$.extendLuaState(lua).toSimpleJavaObjects(3);
/*     */       return this.$outer.li$cil$oc$server$machine$luac$UserdataAPI$$super$owner().invoke((Function0<Object[]>)new UserdataAPI$$anonfun$initialize$8$$anonfun$apply$4(this, value, method, args));
/*     */     }
/*     */     
/*     */     public final class UserdataAPI$$anonfun$initialize$8$$anonfun$apply$4 extends AbstractFunction0<Object[]> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final Value value$4;
/*     */       private final String method$1;
/*     */       private final IndexedSeq args$4;
/*     */       
/*     */       public final Object[] apply() {
/*     */         return this.$outer.li$cil$oc$server$machine$luac$UserdataAPI$$anonfun$$$outer().machine().invoke(this.value$4, this.method$1, (Object[])this.args$4.toArray(ClassTag$.MODULE$.AnyRef()));
/*     */       }
/*     */       
/*     */       public UserdataAPI$$anonfun$initialize$8$$anonfun$apply$4(UserdataAPI$$anonfun$initialize$8 $outer, Value value$4, String method$1, IndexedSeq args$4) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public final class UserdataAPI$$anonfun$initialize$9 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public UserdataAPI$$anonfun$initialize$9(UserdataAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       Value value = (Value)lua.toJavaObjectRaw(1);
/*     */       String method = lua.checkString(2);
/*     */       return this.$outer.li$cil$oc$server$machine$luac$UserdataAPI$$super$owner().documentation((Function0<String>)new UserdataAPI$$anonfun$initialize$9$$anonfun$apply$5(this, value, method));
/*     */     }
/*     */     
/*     */     public final class UserdataAPI$$anonfun$initialize$9$$anonfun$apply$5 extends AbstractFunction0<String> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final Value value$5;
/*     */       private final String method$2;
/*     */       
/*     */       public final String apply() {
/*     */         return ((Callback)WrapAsScala$.MODULE$.mapAsScalaMap(this.$outer.li$cil$oc$server$machine$luac$UserdataAPI$$anonfun$$$outer().machine().methods(this.value$5)).apply(this.method$2)).doc();
/*     */       }
/*     */       
/*     */       public UserdataAPI$$anonfun$initialize$9$$anonfun$apply$5(UserdataAPI$$anonfun$initialize$9 $outer, Value value$5, String method$2) {}
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luac\UserdataAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */