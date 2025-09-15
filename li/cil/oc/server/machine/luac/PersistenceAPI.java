/*     */ package li.cil.oc.server.machine.luac;
/*     */ 
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.repack.com.naef.jnlua.LuaState;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.collection.mutable.ArrayBuffer;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\0214A!\001\002\001\037\tq\001+\032:tSN$XM\\2f\003BK%BA\002\005\003\021aW/Y2\013\005\0251\021aB7bG\"Lg.\032\006\003\017!\taa]3sm\026\024(BA\005\013\003\ty7M\003\002\f\031\005\0311-\0337\013\0035\t!\001\\5\004\001M\021\001\001\005\t\003#Ii\021AA\005\003'\t\021ABT1uSZ,G*^1B!&C\021\"\006\001\003\002\003\006IAF\r\002\013=<h.\032:\021\005E9\022B\001\r\003\005Uq\025\r^5wK2+\030-\021:dQ&$Xm\031;ve\026L!!\006\n\t\013m\001A\021\001\017\002\rqJg.\033;?)\tib\004\005\002\022\001!)QC\007a\001-!9\001\005\001a\001\n\023\t\023A\0039feNL7\017^&fsV\t!\005\005\002$Q5\tAE\003\002&M\005!A.\0318h\025\0059\023\001\0026bm\006L!!\013\023\003\rM#(/\0338h\021\035Y\003\0011A\005\n1\na\002]3sg&\034HoS3z?\022*\027\017\006\002.gA\021a&M\007\002_)\t\001'A\003tG\006d\027-\003\0023_\t!QK\\5u\021\035!$&!AA\002\t\n1\001\037\0232\021\0311\004\001)Q\005E\005Y\001/\032:tSN$8*Z=!\021\025A\004\001\"\021:\003)Ig.\033;jC2L'0\032\013\002[!)1\b\001C!y\005!An\\1e)\tiS\bC\003?u\001\007q(A\002oER\004\"\001\021$\016\003\005S!A\020\"\013\005\r#\025!C7j]\026\034'/\0314u\025\005)\025a\0018fi&\021q)\021\002\017\035\n#F+Y4D_6\004x.\0368e\021\025I\005\001\"\021K\003\021\031\030M^3\025\0055Z\005\"\002 I\001\004y\004\"B'\001\t\003I\024!C2p]\032Lw-\036:f\021\025y\005\001\"\001Q\003\035\001XM]:jgR$\"!U,\021\0079\022F+\003\002T_\t)\021I\035:bsB\021a&V\005\003->\022AAQ=uK\")\001L\024a\0013\006)\021N\0343fqB\021aFW\005\0037>\0221!\0238u\021\025i\006\001\"\001_\003%)h\016]3sg&\034H\017\006\002`EB\021a\006Y\005\003C>\022qAQ8pY\026\fg\016C\003d9\002\007\021+A\003wC2,X\r")
/*     */ public class PersistenceAPI extends NativeLuaAPI {
/*     */   private String li$cil$oc$server$machine$luac$PersistenceAPI$$persistKey;
/*     */   
/*  12 */   public PersistenceAPI(NativeLuaArchitecture owner) { super(owner);
/*  13 */     this.li$cil$oc$server$machine$luac$PersistenceAPI$$persistKey = (new StringBuilder()).append("__persist").append(UUID.randomUUID().toString().replaceAll("-", "")).toString(); } public String li$cil$oc$server$machine$luac$PersistenceAPI$$persistKey() { return this.li$cil$oc$server$machine$luac$PersistenceAPI$$persistKey; } private void li$cil$oc$server$machine$luac$PersistenceAPI$$persistKey_$eq(String x$1) { this.li$cil$oc$server$machine$luac$PersistenceAPI$$persistKey = x$1; }
/*     */   public final class PersistenceAPI$$anonfun$initialize$1 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public PersistenceAPI$$anonfun$initialize$1(PersistenceAPI $outer) {} public final int apply(LuaState lua) { lua.pushString(this.$outer.li$cil$oc$server$machine$luac$PersistenceAPI$$persistKey());
/*  17 */       return 1; } } public void initialize() { ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new PersistenceAPI$$anonfun$initialize$1(this));
/*     */ 
/*     */ 
/*     */     
/*  21 */     lua().setGlobal("persistKey");
/*     */     
/*  23 */     if (Settings$.MODULE$.get().allowPersistence())
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */       
/*  29 */       lua().newTable();
/*  30 */       lua().newTable();
/*     */       
/*  32 */       int perms = lua().getTop() - 1;
/*  33 */       int uperms = lua().getTop();
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
/*  84 */       lua().pushString("_G");
/*  85 */       lua().getGlobal("_G");
/*     */       
/*  87 */       li$cil$oc$server$machine$luac$PersistenceAPI$$flattenAndStore$1(perms, uperms);
/*  88 */       lua().setField(lua().getRegistryIndex(), "uperms");
/*  89 */       lua().setField(lua().getRegistryIndex(), "perms"); }  }
/*     */   public final void li$cil$oc$server$machine$luac$PersistenceAPI$$flattenAndStore$1(int perms$1, int uperms$1) { if (lua().isFunction(-1) || lua().isTable(-1)) { lua().pushValue(-2); lua().getTable(uperms$1); Predef$.MODULE$.assert(lua().isNil(-1), (Function0)new PersistenceAPI$$anonfun$li$cil$oc$server$machine$luac$PersistenceAPI$$flattenAndStore$1$1(this)); lua().pop(1); lua().pushValue(-1); lua().getTable(perms$1); boolean isNew = lua().isNil(-1); lua().pop(1); if (isNew) { lua().pushValue(-1); lua().pushValue(-3); lua().rawSet(perms$1); lua().pushValue(-2); lua().pushValue(-2); lua().rawSet(uperms$1); if (lua().isTable(-1)) { String key = lua().toString(-2); ArrayBuffer childKeys = (ArrayBuffer)ArrayBuffer$.MODULE$.empty(); lua().pushNil(); while (lua().next(-2)) { lua().pop(1); childKeys.$plus$eq(lua().toString(-1)); }
/*     */            childKeys.sortWith((Function2)new PersistenceAPI$$anonfun$li$cil$oc$server$machine$luac$PersistenceAPI$$flattenAndStore$1$2(this)); childKeys.foreach((Function1)new PersistenceAPI$$anonfun$li$cil$oc$server$machine$luac$PersistenceAPI$$flattenAndStore$1$3(this, perms$1, uperms$1, key)); }
/*     */          }
/*     */        }
/*  94 */      lua().pop(2); } public void load(NBTTagCompound nbt) { super.load(nbt);
/*  95 */     if (nbt.func_74764_b("persistKey"))
/*  96 */       li$cil$oc$server$machine$luac$PersistenceAPI$$persistKey_$eq(nbt.func_74779_i("persistKey"));  } public final class PersistenceAPI$$anonfun$li$cil$oc$server$machine$luac$PersistenceAPI$$flattenAndStore$1$1 extends AbstractFunction0<String> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final String apply() { return (new StringBuilder()).append("duplicate permanent value named ").append(this.$outer.lua().toString(-3)).toString(); } public PersistenceAPI$$anonfun$li$cil$oc$server$machine$luac$PersistenceAPI$$flattenAndStore$1$1(PersistenceAPI $outer) {} } public final class PersistenceAPI$$anonfun$li$cil$oc$server$machine$luac$PersistenceAPI$$flattenAndStore$1$2 extends AbstractFunction2<String, String, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(String a, String b) { return (a.compareTo(b) < 0); } public PersistenceAPI$$anonfun$li$cil$oc$server$machine$luac$PersistenceAPI$$flattenAndStore$1$2(PersistenceAPI $outer) {} } public final class PersistenceAPI$$anonfun$li$cil$oc$server$machine$luac$PersistenceAPI$$flattenAndStore$1$3 extends AbstractFunction1<String, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final int perms$1; private final int uperms$1; private final String key$1; public PersistenceAPI$$anonfun$li$cil$oc$server$machine$luac$PersistenceAPI$$flattenAndStore$1$3(PersistenceAPI $outer, int perms$1, int uperms$1, String key$1) {}
/*     */     public final void apply(String childKey) { this.$outer.lua().pushString((new StringBuilder()).append(this.key$1).append(".").append(childKey).toString()); this.$outer.lua().getField(-2, childKey); this.$outer.li$cil$oc$server$machine$luac$PersistenceAPI$$flattenAndStore$1(this.perms$1, this.uperms$1); } }
/* 101 */   public void save(NBTTagCompound nbt) { super.save(nbt);
/* 102 */     nbt.func_74778_a("persistKey", li$cil$oc$server$machine$luac$PersistenceAPI$$persistKey()); }
/*     */ 
/*     */   
/*     */   public void configure() {
/* 106 */     lua().getGlobal("eris");
/*     */     
/* 108 */     lua().getField(-1, "settings");
/* 109 */     lua().pushString("spkey");
/* 110 */     lua().pushString(li$cil$oc$server$machine$luac$PersistenceAPI$$persistKey());
/* 111 */     lua().call(2, 0);
/*     */     
/* 113 */     lua().getField(-1, "settings");
/* 114 */     lua().pushString("path");
/* 115 */     lua().pushBoolean(Settings$.MODULE$.get().debugPersistence());
/* 116 */     lua().call(2, 0);
/*     */     
/* 118 */     lua().pop(1);
/*     */   }
/*     */   
/*     */   public byte[] persist(int index) {
/* 122 */     if (Settings$.MODULE$.get().allowPersistence())
/* 123 */     { configure();
/*     */       
/* 125 */       try { lua().gc(LuaState.GcAction.STOP, 0);
/* 126 */         lua().getGlobal("eris");
/* 127 */         lua().getField(-1, "persist");
/* 128 */         if (lua().isFunction(-1))
/* 129 */         { lua().getField(lua().getRegistryIndex(), "perms");
/* 130 */           lua().pushValue(index);
/*     */           
/* 132 */           try { lua().call(2, 1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 138 */             if (lua().isString(-1)) {
/*     */               
/* 140 */               byte[] result = lua().toByteArray(-1);
/*     */               
/* 142 */               return result;
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 151 */             return (byte[])Array$.MODULE$.apply((Seq)Nil$.MODULE$, ClassTag$.MODULE$.Byte()); } finally { lua().pop(1); }  }  lua().pop(2); return (byte[])Array$.MODULE$.apply((Seq)Nil$.MODULE$, ClassTag$.MODULE$.Byte()); } finally { lua().gc(LuaState.GcAction.RESTART, 0); }  }  return (byte[])Array$.MODULE$.apply((Seq)Nil$.MODULE$, ClassTag$.MODULE$.Byte());
/*     */   }
/*     */   
/*     */   public boolean unpersist(byte[] value) {
/* 155 */     if (Settings$.MODULE$.get().allowPersistence())
/* 156 */     { configure();
/*     */       
/* 158 */       try { lua().gc(LuaState.GcAction.STOP, 0);
/* 159 */         lua().getGlobal("eris");
/* 160 */         lua().getField(-1, "unpersist");
/* 161 */         if (lua().isFunction(-1)) {
/* 162 */           lua().getField(lua().getRegistryIndex(), "uperms");
/* 163 */           lua().pushByteArray(value);
/* 164 */           lua().call(2, 1);
/* 165 */           lua().insert(-2);
/* 166 */           lua().pop(1);
/* 167 */           return true;
/*     */         } 
/* 169 */         lua().pop(1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 175 */         return false; } finally { lua().gc(LuaState.GcAction.RESTART, 0); }  }  return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luac\PersistenceAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */