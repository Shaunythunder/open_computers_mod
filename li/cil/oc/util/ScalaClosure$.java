/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import java.util.Map;
/*    */ import li.cil.repack.org.luaj.vm2.LuaInteger;
/*    */ import li.cil.repack.org.luaj.vm2.LuaNumber;
/*    */ import li.cil.repack.org.luaj.vm2.LuaString;
/*    */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*    */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*    */ import li.cil.repack.org.luaj.vm2.Varargs;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.Iterable;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.collection.mutable.Map;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ 
/*    */ public final class ScalaClosure$ {
/*    */   public static final ScalaClosure$ MODULE$;
/*    */   
/* 22 */   public ScalaClosure wrapClosure(Function1 f) { return new ScalaClosure((Function1<Varargs, Varargs>)new ScalaClosure$$anonfun$wrapClosure$1(f)); } public final class ScalaClosure$$anonfun$wrapClosure$1 extends AbstractFunction1<Varargs, Varargs> implements Serializable { public static final long serialVersionUID = 0L; private final Function1 f$1; public final Varargs apply(Varargs args) { LuaValue luaValue2, luaValue1 = (LuaValue)this.f$1.apply(args);
/* 23 */       if (luaValue1 != null) { LuaValue luaValue = luaValue1; }
/* 24 */       else { LuaValue luaValue = luaValue1; if (LuaValue.NONE == null) { if (luaValue != null)
/* 25 */           { (new LuaValue[1])[0] = luaValue1; Varargs varargs = LuaValue.varargsOf(new LuaValue[1]); }  } else { if (LuaValue.NONE.equals(luaValue)) LuaValue luaValue3 = LuaValue.NONE;  (new LuaValue[1])[0] = luaValue1; Varargs varargs = LuaValue.varargsOf(new LuaValue[1]); }
/*    */          luaValue2 = LuaValue.NONE; }
/*    */       
/* 28 */       return (Varargs)luaValue2; } public ScalaClosure$$anonfun$wrapClosure$1(Function1 f$1) {} } public ScalaClosure wrapVarArgClosure(Function1<Varargs, Varargs> f) { return new ScalaClosure(f); } public LuaValue toLuaValue(Object value) { Object object3;
/*    */     boolean bool;
/*    */     LuaValue luaValue;
/* 31 */     Object object2 = value;
/* 32 */     if (object2 instanceof ScalaNumber) { ScalaNumber scalaNumber = (ScalaNumber)object2; object3 = scalaNumber.underlying(); }
/* 33 */     else if (object2 instanceof Object) { Object object = object2; }
/* 34 */     else if (object2 == null) { object3 = null; }
/* 35 */     else { object3 = object2; }
/*    */      Object object1 = object3;
/* 37 */     if (object1 == null) { bool = true; } else if (scala.Unit$.MODULE$.equals(object1)) { bool = true; } else if (object1 instanceof scala.runtime.BoxedUnit) { bool = true; } else { bool = false; }  if (bool) { luaValue = LuaValue.NIL; }
/* 38 */     else if (object1 instanceof Boolean) { Boolean bool1 = (Boolean)object1; LuaBoolean luaBoolean = LuaValue.valueOf(bool1.booleanValue()); }
/* 39 */     else if (object1 instanceof Byte) { Byte byte_ = (Byte)object1; LuaInteger luaInteger = LuaValue.valueOf(byte_.byteValue()); }
/* 40 */     else if (object1 instanceof Character) { Character character = (Character)object1; LuaString luaString = LuaValue.valueOf(String.valueOf(character)); }
/* 41 */     else if (object1 instanceof Short) { Short short_ = (Short)object1; LuaInteger luaInteger = LuaValue.valueOf(short_.shortValue()); }
/* 42 */     else if (object1 instanceof Integer) { Integer integer = (Integer)object1; LuaInteger luaInteger = LuaValue.valueOf(integer.intValue()); }
/* 43 */     else if (object1 instanceof Long) { Long long_ = (Long)object1; LuaNumber luaNumber = LuaValue.valueOf(long_.longValue()); }
/* 44 */     else if (object1 instanceof Float) { Float float_ = (Float)object1; LuaNumber luaNumber = LuaValue.valueOf(float_.floatValue()); }
/* 45 */     else if (object1 instanceof Double) { Double double_ = (Double)object1; LuaNumber luaNumber = LuaValue.valueOf(double_.doubleValue()); }
/* 46 */     else if (object1 instanceof String) { String str = (String)object1; LuaString luaString = LuaValue.valueOf(str); }
/* 47 */     else if (object1 instanceof byte[]) { byte[] arrayOfByte = (byte[])object1; LuaString luaString = LuaValue.valueOf(arrayOfByte); }
/* 48 */     else if (scala.runtime.ScalaRunTime$.MODULE$.isArray(object1, 1)) { Object object = object1; luaValue = toLuaList((Iterable<Object>)scala.Predef$.MODULE$.genericWrapArray(object)); }
/* 49 */     else { if (object1 instanceof Value) { Value value1 = (Value)object1; if (li.cil.oc.Settings$.MODULE$.get().allowUserdata()) return (LuaValue)LuaValue.userdataOf(value1);  }
/* 50 */        if (object1 instanceof Product) { Object object = object1; luaValue = toLuaList(((Product)object).productIterator().toIterable()); }
/* 51 */       else if (object1 instanceof Seq) { Seq seq = (Seq)object1; luaValue = toLuaList((Iterable<Object>)seq); }
/* 52 */       else if (object1 instanceof Map) { Map map = (Map)object1; luaValue = toLuaTable(scala.collection.convert.WrapAsScala$.MODULE$.mapAsScalaMap(map).toMap(scala.Predef$.MODULE$.$conforms())); }
/* 53 */       else if (object1 instanceof Map) { Map<?, ?> map = (Map)object1; luaValue = toLuaTable(map); }
/* 54 */       else if (object1 instanceof Map) { Map map = (Map)object1; luaValue = toLuaTable(map.toMap(scala.Predef$.MODULE$.$conforms())); }
/*    */       else
/* 56 */       { li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringBuilder()).append("Tried to push an unsupported value of type to Lua: ").append(value.getClass().getName()).append(".").toString());
/* 57 */         luaValue = LuaValue.NIL; }
/*    */        }
/*    */     
/*    */     return luaValue; }
/*    */   
/* 62 */   public LuaValue toLuaList(Iterable value) { return (LuaValue)LuaValue.listOf((LuaValue[])((TraversableOnce)value.map((Function1)new ScalaClosure$$anonfun$toLuaList$1(), scala.collection.Iterable$.MODULE$.canBuildFrom())).toArray(scala.reflect.ClassTag$.MODULE$.apply(LuaValue.class))); } public final class ScalaClosure$$anonfun$toLuaList$1 extends AbstractFunction1<Object, LuaValue> implements Serializable { public static final long serialVersionUID = 0L; public final LuaValue apply(Object value) { return ScalaClosure$.MODULE$.toLuaValue(value); }
/*    */      }
/*    */ 
/*    */   
/* 66 */   public LuaValue toLuaTable(Map value) { return (LuaValue)LuaValue.tableOf((LuaValue[])((TraversableOnce)value.flatMap((Function1)new ScalaClosure$$anonfun$toLuaTable$1(), scala.collection.immutable.Iterable$.MODULE$.canBuildFrom()))
/*    */         
/* 68 */         .toArray(scala.reflect.ClassTag$.MODULE$.apply(LuaValue.class))); } public final class ScalaClosure$$anonfun$toLuaTable$1 extends AbstractFunction1<Tuple2<Object, Object>, Seq<LuaValue>> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final Seq<LuaValue> apply(Tuple2 x0$1) { Tuple2 tuple2 = x0$1; if (tuple2 != null) { Object k = tuple2._1(), v = tuple2._2(); (new LuaValue[2])[0] = ScalaClosure$.MODULE$.toLuaValue(k); (new LuaValue[2])[1] = ScalaClosure$.MODULE$.toLuaValue(v); return (Seq)scala.collection.Seq$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new LuaValue[2])); }
/*    */        throw new MatchError(tuple2); } }
/* 71 */   public Object toSimpleJavaObject(LuaValue value) { LuaValue luaValue; Object object; LuaTable table; int i = value.type(); switch (i)
/*    */     { default:
/*    */       
/*    */       
/*    */       case 7:
/*    */       
/*    */       
/*    */       case 5:
/* 79 */         table = value.checktable();case 4: luaValue = value; if (luaValue instanceof LuaString) { LuaString luaString = (LuaString)luaValue; object = scala.Predef$.MODULE$.byteArrayOps(luaString.m_bytes).slice(luaString.m_offset, luaString.m_offset + luaString.m_length); } else { object = value.tojstring(); } case 3: 
/* 80 */       case 1: break; }  return BoxesRunTime.boxToBoolean(value.toboolean()); } public final class ScalaClosure$$anonfun$toSimpleJavaObject$1 extends AbstractFunction1<LuaValue, Tuple2<Object, Object>> implements Serializable { public static final long serialVersionUID = 0L; public final Tuple2<Object, Object> apply(LuaValue key) { return scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(ScalaClosure$.MODULE$.toSimpleJavaObject(key)), ScalaClosure$.MODULE$.toSimpleJavaObject(this.table$1.get(key))); }
/*    */     
/*    */     private final LuaTable table$1;
/*    */     public ScalaClosure$$anonfun$toSimpleJavaObject$1(LuaTable table$1) {} }
/*    */   public int toSimpleJavaObjects$default$2() {
/* 85 */     return 1; }
/* 86 */   public IndexedSeq<Object> toSimpleJavaObjects(Varargs args, int start) { return (IndexedSeq<Object>)scala.runtime.RichInt$.MODULE$.to$extension0(scala.Predef$.MODULE$.intWrapper(start), args.narg()).map((Function1)new ScalaClosure$$anonfun$toSimpleJavaObjects$1(args), scala.collection.immutable.IndexedSeq$.MODULE$.canBuildFrom()); } public final class ScalaClosure$$anonfun$toSimpleJavaObjects$1 extends AbstractFunction1<Object, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Varargs args$1; public final Object apply(int index) { return ScalaClosure$.MODULE$.toSimpleJavaObject(this.args$1.arg(index)); } public ScalaClosure$$anonfun$toSimpleJavaObjects$1(Varargs args$1) {} } private ScalaClosure$() {
/* 87 */     MODULE$ = this;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ScalaClosure$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */