/*     */ package li.cil.oc.server.machine.luac;
/*     */ import li.cil.oc.api.driver.Item;
/*     */ import li.cil.repack.com.naef.jnlua.LuaState;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001-2A!\001\002\001\037\tY1i\\7qkR,'/\021)J\025\t\031A!\001\003mk\006\034'BA\003\007\003\035i\027m\0315j]\026T!a\002\005\002\rM,'O^3s\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\003\001A\001\"!\005\n\016\003\tI!a\005\002\003\0319\013G/\033<f\031V\f\027\tU%\t\023U\001!\021!Q\001\nYI\022!B8x]\026\024\bCA\t\030\023\tA\"AA\013OCRLg/\032'vC\006\0238\r[5uK\016$XO]3\n\005U\021\002\"B\016\001\t\003a\022A\002\037j]&$h\b\006\002\036=A\021\021\003\001\005\006+i\001\rA\006\005\006A\001!\t!I\001\013S:LG/[1mSj,G#\001\022\021\005\r2S\"\001\023\013\003\025\nQa]2bY\006L!a\n\023\003\tUs\027\016\036\005\fS\001\001\n1!A\001\n\023Q\023$A\006tkB,'\017J8x]\026\024X#\001\f")
/*     */ public class ComputerAPI extends NativeLuaAPI {
/*     */   public ComputerAPI(NativeLuaArchitecture owner) {
/*  12 */     super(owner);
/*     */   }
/*     */   
/*     */   public void initialize() {
/*  16 */     lua().newTable();
/*     */ 
/*     */     
/*  19 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$1(this));
/*     */ 
/*     */ 
/*     */     
/*  23 */     lua().setField(-2, "realTime");
/*     */ 
/*     */     
/*  26 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$2(this));
/*     */ 
/*     */ 
/*     */     
/*  30 */     lua().setField(-2, "uptime");
/*     */ 
/*     */     
/*  33 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$3(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  40 */     lua().setField(-2, "address");
/*     */     
/*  42 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$4(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  48 */     lua().setField(-2, "freeMemory");
/*     */ 
/*     */     
/*  51 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$5(this));
/*     */ 
/*     */ 
/*     */     
/*  55 */     lua().setField(-2, "totalMemory");
/*     */     
/*  57 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$6(this));
/*     */ 
/*     */ 
/*     */     
/*  61 */     lua().setField(-2, "pushSignal");
/*     */ 
/*     */     
/*  64 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$7(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  70 */     lua().setField(-2, "tmpAddress");
/*     */ 
/*     */     
/*  73 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$8(this));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     lua().setField(-2, "users");
/*     */     
/*  80 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$9(this));
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
/*  93 */     lua().setField(-2, "addUser");
/*     */     
/*  95 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$10(this));
/*     */ 
/*     */ 
/*     */     
/*  99 */     lua().setField(-2, "removeUser");
/*     */     
/* 101 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$11(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     lua().setField(-2, "energy");
/*     */     
/* 110 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$12(this));
/*     */ 
/*     */ 
/*     */     
/* 114 */     lua().setField(-2, "maxEnergy");
/*     */     
/* 116 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$13(this));
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
/* 128 */     lua().setField(-2, "getArchitectures");
/*     */     
/* 130 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$14(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 137 */     lua().setField(-2, "getArchitecture");
/*     */     
/* 139 */     ExtendedLuaState$.MODULE$.extendLuaState(lua()).pushScalaFunction((Function1)new ComputerAPI$$anonfun$initialize$15(this));
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
/* 159 */     lua().setField(-2, "setArchitecture");
/*     */ 
/*     */     
/* 162 */     lua().setGlobal("computer");
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$1 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$1(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushNumber(System.currentTimeMillis() / 1000.0D);
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$2 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$2(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushNumber(this.$outer.machine().upTime());
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$3 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$3(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       Option option = Option$.MODULE$.apply(this.$outer.node().address());
/*     */       if (None$.MODULE$.equals(option)) {
/*     */         lua.pushNil();
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } else {
/*     */         if (option instanceof Some) {
/*     */           Some some = (Some)option;
/*     */           String address = (String)some.x();
/*     */           lua.pushString(address);
/*     */           BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */           return 1;
/*     */         } 
/*     */         throw new MatchError(option);
/*     */       } 
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$4 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$4(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushInteger((int)(RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(lua.getFreeMemory()), lua.getTotalMemory() - this.$outer.li$cil$oc$server$machine$luac$ComputerAPI$$super$owner().kernelMemory()) / this.$outer.li$cil$oc$server$machine$luac$ComputerAPI$$super$owner().ramScale()));
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$5 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$5(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushInteger((int)((lua.getTotalMemory() - this.$outer.li$cil$oc$server$machine$luac$ComputerAPI$$super$owner().kernelMemory()) / this.$outer.li$cil$oc$server$machine$luac$ComputerAPI$$super$owner().ramScale()));
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$6 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$6(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushBoolean(this.$outer.machine().signal(lua.checkString(1), (Object[])ExtendedLuaState$.MODULE$.extendLuaState(lua).toSimpleJavaObjects(2).toArray(ClassTag$.MODULE$.AnyRef())));
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$7 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$7(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       String address = this.$outer.machine().tmpAddress();
/*     */       if (address == null) {
/*     */         lua.pushNil();
/*     */       } else {
/*     */         lua.pushString(address);
/*     */       } 
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$8 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$8(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       String[] users = this.$outer.machine().users();
/*     */       Predef$.MODULE$.refArrayOps((Object[])users).foreach((Function1)new ComputerAPI$$anonfun$initialize$8$$anonfun$apply$5(this, lua));
/*     */       return users.length;
/*     */     }
/*     */     
/*     */     public final class ComputerAPI$$anonfun$initialize$8$$anonfun$apply$5 extends AbstractFunction1<String, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final LuaState lua$1;
/*     */       
/*     */       public final void apply(String x$1) {
/*     */         this.lua$1.pushString(x$1);
/*     */       }
/*     */       
/*     */       public ComputerAPI$$anonfun$initialize$8$$anonfun$apply$5(ComputerAPI$$anonfun$initialize$8 $outer, LuaState lua$1) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$9 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$9(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       String user = lua.checkString(1);
/*     */     }
/*     */     
/*     */     public final class ComputerAPI$$anonfun$initialize$9$$anonfun$apply$6 extends AbstractFunction0<String> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final Throwable e$1;
/*     */       
/*     */       public final String apply() {
/*     */         return this.e$1.toString();
/*     */       }
/*     */       
/*     */       public ComputerAPI$$anonfun$initialize$9$$anonfun$apply$6(ComputerAPI$$anonfun$initialize$9 $outer, Throwable e$1) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$10 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$10(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushBoolean(this.$outer.machine().removeUser(lua.checkString(1)));
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$11 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$11(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       if (Settings$.MODULE$.get().ignorePower()) {
/*     */         lua.pushNumber(Double.POSITIVE_INFINITY);
/*     */       } else {
/*     */         lua.pushNumber(((Connector)this.$outer.node()).globalBuffer());
/*     */       } 
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$12 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$12(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       lua.pushNumber(((Connector)this.$outer.node()).globalBufferSize());
/*     */       return 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$13 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$13(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       Option option = ((TraversableOnce)WrapAsScala$.MODULE$.iterableAsScalaIterable(this.$outer.machine().host().internalComponents()).map((Function1)new ComputerAPI$$anonfun$initialize$13$$anonfun$2(this), Iterable$.MODULE$.canBuildFrom())).collectFirst((PartialFunction)new ComputerAPI$$anonfun$initialize$13$$anonfun$1(this));
/*     */       if (option instanceof Some) {
/*     */         Some some = (Some)option;
/*     */         Seq architectures = (Seq)some.x();
/*     */         ExtendedLuaState.ExtendedLuaState qual$1 = ExtendedLuaState$.MODULE$.extendLuaState(lua);
/*     */         Seq x$1 = (Seq)architectures.map((Function1)new ComputerAPI$$anonfun$initialize$13$$anonfun$3(this), Seq$.MODULE$.canBuildFrom());
/*     */         IdentityHashMap x$2 = qual$1.pushValue$default$2();
/*     */         qual$1.pushValue(x$1, x$2);
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } else {
/*     */         lua.newTable();
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } 
/*     */       return 1;
/*     */     }
/*     */     
/*     */     public final class ComputerAPI$$anonfun$initialize$13$$anonfun$2 extends AbstractFunction1<ItemStack, Tuple2<ItemStack, Item>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public final Tuple2<ItemStack, Item> apply(ItemStack stack) {
/*     */         return new Tuple2(stack, Driver.driverFor(stack));
/*     */       }
/*     */       
/*     */       public ComputerAPI$$anonfun$initialize$13$$anonfun$2(ComputerAPI$$anonfun$initialize$13 $outer) {}
/*     */     }
/*     */     
/*     */     public final class ComputerAPI$$anonfun$initialize$13$$anonfun$1 extends AbstractPartialFunction<Tuple2<ItemStack, Item>, Seq<Class<? extends Architecture>>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public final <A1 extends Tuple2<ItemStack, Item>, B1> B1 applyOrElse(Tuple2 x1, Function1 default) {
/*     */         Tuple2 tuple2 = x1;
/*     */         if (tuple2 != null) {
/*     */           Item processor = (Item)tuple2._2();
/*     */           if (processor instanceof MutableProcessor) {
/*     */             MutableProcessor mutableProcessor = (MutableProcessor)processor;
/*     */             return (B1)WrapAsScala$.MODULE$.collectionAsScalaIterable(mutableProcessor.allArchitectures()).toSeq();
/*     */           } 
/*     */         } 
/*     */         if (tuple2 != null) {
/*     */           ItemStack stack = (ItemStack)tuple2._1();
/*     */           Item processor = (Item)tuple2._2();
/*     */           if (processor instanceof Processor) {
/*     */             Processor processor1 = (Processor)processor;
/*     */             (new Class[1])[0] = processor1.architecture(stack);
/*     */             return (B1)Seq$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Class[1]));
/*     */           } 
/*     */         } 
/*     */         return (B1)default.apply(x1);
/*     */       }
/*     */       
/*     */       public final boolean isDefinedAt(Tuple2 x1) {
/*     */         Tuple2 tuple2 = x1;
/*     */         if (tuple2 != null) {
/*     */           Item processor = (Item)tuple2._2();
/*     */           if (processor instanceof MutableProcessor)
/*     */             return true; 
/*     */         } 
/*     */         if (tuple2 != null) {
/*     */           Item processor = (Item)tuple2._2();
/*     */           if (processor instanceof Processor)
/*     */             return true; 
/*     */         } 
/*     */         return false;
/*     */       }
/*     */       
/*     */       public ComputerAPI$$anonfun$initialize$13$$anonfun$1(ComputerAPI$$anonfun$initialize$13 $outer) {}
/*     */     }
/*     */     
/*     */     public final class ComputerAPI$$anonfun$initialize$13$$anonfun$3 extends AbstractFunction1<Class<? extends Architecture>, String> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public final String apply(Class x$1) {
/*     */         return Machine.getArchitectureName(x$1);
/*     */       }
/*     */       
/*     */       public ComputerAPI$$anonfun$initialize$13$$anonfun$3(ComputerAPI$$anonfun$initialize$13 $outer) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$14 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$14(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       return BoxesRunTime.unboxToInt(((TraversableOnce)WrapAsScala$.MODULE$.iterableAsScalaIterable(this.$outer.machine().host().internalComponents()).map((Function1)new ComputerAPI$$anonfun$initialize$14$$anonfun$apply$7(this), Iterable$.MODULE$.canBuildFrom())).collectFirst((PartialFunction)new ComputerAPI$$anonfun$initialize$14$$anonfun$apply$3(this, lua)).getOrElse((Function0)new ComputerAPI$$anonfun$initialize$14$$anonfun$apply$1(this)));
/*     */     }
/*     */     
/*     */     public final class ComputerAPI$$anonfun$initialize$14$$anonfun$apply$7 extends AbstractFunction1<ItemStack, Tuple2<ItemStack, Item>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public final Tuple2<ItemStack, Item> apply(ItemStack stack) {
/*     */         return new Tuple2(stack, Driver.driverFor(stack));
/*     */       }
/*     */       
/*     */       public ComputerAPI$$anonfun$initialize$14$$anonfun$apply$7(ComputerAPI$$anonfun$initialize$14 $outer) {}
/*     */     }
/*     */     
/*     */     public final class ComputerAPI$$anonfun$initialize$14$$anonfun$apply$3 extends AbstractPartialFunction<Tuple2<ItemStack, Item>, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final LuaState lua$2;
/*     */       
/*     */       public final <A1 extends Tuple2<ItemStack, Item>, B1> B1 applyOrElse(Tuple2 x2, Function1 default) {
/*     */         Tuple2 tuple2 = x2;
/*     */         if (tuple2 != null) {
/*     */           ItemStack stack = (ItemStack)tuple2._1();
/*     */           Item processor = (Item)tuple2._2();
/*     */           if (processor instanceof Processor) {
/*     */             Processor processor1 = (Processor)processor;
/*     */             this.lua$2.pushString(Machine.getArchitectureName(processor1.architecture(stack)));
/*     */             return (B1)BoxesRunTime.boxToInteger(1);
/*     */           } 
/*     */         } 
/*     */         return (B1)default.apply(x2);
/*     */       }
/*     */       
/*     */       public final boolean isDefinedAt(Tuple2 x2) {
/*     */         Tuple2 tuple2 = x2;
/*     */         if (tuple2 != null) {
/*     */           Item processor = (Item)tuple2._2();
/*     */           if (processor instanceof Processor)
/*     */             return true; 
/*     */         } 
/*     */         return false;
/*     */       }
/*     */       
/*     */       public ComputerAPI$$anonfun$initialize$14$$anonfun$apply$3(ComputerAPI$$anonfun$initialize$14 $outer, LuaState lua$2) {}
/*     */     }
/*     */     
/*     */     public final class ComputerAPI$$anonfun$initialize$14$$anonfun$apply$1 extends AbstractFunction0.mcI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public final int apply() {
/*     */         return apply$mcI$sp();
/*     */       }
/*     */       
/*     */       public int apply$mcI$sp() {
/*     */         return 0;
/*     */       }
/*     */       
/*     */       public ComputerAPI$$anonfun$initialize$14$$anonfun$apply$1(ComputerAPI$$anonfun$initialize$14 $outer) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public final class ComputerAPI$$anonfun$initialize$15 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public ComputerAPI$$anonfun$initialize$15(ComputerAPI $outer) {}
/*     */     
/*     */     public final int apply(LuaState lua) {
/*     */       String archName = lua.checkString(1);
/*     */       return BoxesRunTime.unboxToInt(((TraversableOnce)WrapAsScala$.MODULE$.iterableAsScalaIterable(this.$outer.machine().host().internalComponents()).map((Function1)new ComputerAPI$$anonfun$initialize$15$$anonfun$apply$8(this), Iterable$.MODULE$.canBuildFrom())).collectFirst((PartialFunction)new ComputerAPI$$anonfun$initialize$15$$anonfun$apply$4(this, archName, lua)).getOrElse((Function0)new ComputerAPI$$anonfun$initialize$15$$anonfun$apply$2(this)));
/*     */     }
/*     */     
/*     */     public final class ComputerAPI$$anonfun$initialize$15$$anonfun$apply$8 extends AbstractFunction1<ItemStack, Tuple2<ItemStack, Item>> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public final Tuple2<ItemStack, Item> apply(ItemStack stack) {
/*     */         return new Tuple2(stack, Driver.driverFor(stack));
/*     */       }
/*     */       
/*     */       public ComputerAPI$$anonfun$initialize$15$$anonfun$apply$8(ComputerAPI$$anonfun$initialize$15 $outer) {}
/*     */     }
/*     */     
/*     */     public final class ComputerAPI$$anonfun$initialize$15$$anonfun$apply$4 extends AbstractPartialFunction<Tuple2<ItemStack, Item>, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       public final String archName$1;
/*     */       private final LuaState lua$3;
/*     */       
/*     */       public final <A1 extends Tuple2<ItemStack, Item>, B1> B1 applyOrElse(Tuple2 x3, Function1 default) {
/*     */         // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: astore_3
/*     */         //   2: aload_3
/*     */         //   3: ifnull -> 191
/*     */         //   6: aload_3
/*     */         //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*     */         //   10: checkcast net/minecraft/item/ItemStack
/*     */         //   13: astore #4
/*     */         //   15: aload_3
/*     */         //   16: invokevirtual _2 : ()Ljava/lang/Object;
/*     */         //   19: checkcast li/cil/oc/api/driver/Item
/*     */         //   22: astore #5
/*     */         //   24: aload #5
/*     */         //   26: instanceof li/cil/oc/api/driver/item/MutableProcessor
/*     */         //   29: ifeq -> 191
/*     */         //   32: aload #5
/*     */         //   34: checkcast li/cil/oc/api/driver/item/MutableProcessor
/*     */         //   37: astore #6
/*     */         //   39: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*     */         //   42: aload #6
/*     */         //   44: invokeinterface allArchitectures : ()Ljava/util/Collection;
/*     */         //   49: invokevirtual collectionAsScalaIterable : (Ljava/util/Collection;)Lscala/collection/Iterable;
/*     */         //   52: new li/cil/oc/server/machine/luac/ComputerAPI$$anonfun$initialize$15$$anonfun$apply$4$$anonfun$4
/*     */         //   55: dup
/*     */         //   56: aload_0
/*     */         //   57: invokespecial <init> : (Lli/cil/oc/server/machine/luac/ComputerAPI$$anonfun$initialize$15$$anonfun$apply$4;)V
/*     */         //   60: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*     */         //   65: astore #8
/*     */         //   67: aload #8
/*     */         //   69: instanceof scala/Some
/*     */         //   72: ifeq -> 162
/*     */         //   75: aload #8
/*     */         //   77: checkcast scala/Some
/*     */         //   80: astore #9
/*     */         //   82: aload #9
/*     */         //   84: invokevirtual x : ()Ljava/lang/Object;
/*     */         //   87: checkcast java/lang/Class
/*     */         //   90: astore #10
/*     */         //   92: aload #10
/*     */         //   94: aload #6
/*     */         //   96: aload #4
/*     */         //   98: invokeinterface architecture : (Lnet/minecraft/item/ItemStack;)Ljava/lang/Class;
/*     */         //   103: astore #12
/*     */         //   105: dup
/*     */         //   106: ifnonnull -> 118
/*     */         //   109: pop
/*     */         //   110: aload #12
/*     */         //   112: ifnull -> 126
/*     */         //   115: goto -> 137
/*     */         //   118: aload #12
/*     */         //   120: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */         //   123: ifeq -> 137
/*     */         //   126: aload_0
/*     */         //   127: getfield lua$3 : Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */         //   130: iconst_0
/*     */         //   131: invokevirtual pushBoolean : (Z)V
/*     */         //   134: goto -> 156
/*     */         //   137: aload #6
/*     */         //   139: aload #4
/*     */         //   141: aload #10
/*     */         //   143: invokeinterface setArchitecture : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)V
/*     */         //   148: aload_0
/*     */         //   149: getfield lua$3 : Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */         //   152: iconst_1
/*     */         //   153: invokevirtual pushBoolean : (Z)V
/*     */         //   156: iconst_1
/*     */         //   157: istore #11
/*     */         //   159: goto -> 181
/*     */         //   162: aload_0
/*     */         //   163: getfield lua$3 : Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */         //   166: invokevirtual pushNil : ()V
/*     */         //   169: aload_0
/*     */         //   170: getfield lua$3 : Lli/cil/repack/com/naef/jnlua/LuaState;
/*     */         //   173: ldc 'unknown architecture'
/*     */         //   175: invokevirtual pushString : (Ljava/lang/String;)V
/*     */         //   178: iconst_2
/*     */         //   179: istore #11
/*     */         //   181: iload #11
/*     */         //   183: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */         //   186: astore #7
/*     */         //   188: goto -> 200
/*     */         //   191: aload_2
/*     */         //   192: aload_1
/*     */         //   193: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */         //   198: astore #7
/*     */         //   200: aload #7
/*     */         //   202: areturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #141	-> 0
/*     */         //   #142	-> 6
/*     */         //   #143	-> 67
/*     */         //   #144	-> 92
/*     */         //   #149	-> 126
/*     */         //   #145	-> 137
/*     */         //   #146	-> 148
/*     */         //   #151	-> 156
/*     */         //   #143	-> 157
/*     */         //   #153	-> 162
/*     */         //   #154	-> 169
/*     */         //   #155	-> 178
/*     */         //   #152	-> 179
/*     */         //   #142	-> 181
/*     */         //   #141	-> 191
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	203	0	this	Lli/cil/oc/server/machine/luac/ComputerAPI$$anonfun$initialize$15$$anonfun$apply$4;
/*     */         //   0	203	1	x3	Lscala/Tuple2;
/*     */         //   0	203	2	default	Lscala/Function1;
/*     */         //   15	188	4	stack	Lnet/minecraft/item/ItemStack;
/*     */         //   24	179	5	processor	Lli/cil/oc/api/driver/Item;
/*     */         //   92	111	10	archClass	Ljava/lang/Class;
/*     */       }
/*     */       
/*     */       public final boolean isDefinedAt(Tuple2 x3) {
/*     */         Tuple2 tuple2 = x3;
/*     */         if (tuple2 != null) {
/*     */           Item processor = (Item)tuple2._2();
/*     */           if (processor instanceof MutableProcessor)
/*     */             return true; 
/*     */         } 
/*     */         return false;
/*     */       }
/*     */       
/*     */       public ComputerAPI$$anonfun$initialize$15$$anonfun$apply$4(ComputerAPI$$anonfun$initialize$15 $outer, String archName$1, LuaState lua$3) {}
/*     */       
/*     */       public final class ComputerAPI$$anonfun$initialize$15$$anonfun$apply$4$$anonfun$4 extends AbstractFunction1<Class<? extends Architecture>, Object> implements Serializable {
/*     */         public static final long serialVersionUID = 0L;
/*     */         
/*     */         public final boolean apply(Class arch) {
/*     */           String str = this.$outer.archName$1;
/*     */           if (Machine.getArchitectureName(arch) == null) {
/*     */             Machine.getArchitectureName(arch);
/*     */             if (str != null);
/*     */           } else if (Machine.getArchitectureName(arch).equals(str)) {
/*     */           
/*     */           } 
/*     */         }
/*     */         
/*     */         public ComputerAPI$$anonfun$initialize$15$$anonfun$apply$4$$anonfun$4(ComputerAPI$$anonfun$initialize$15$$anonfun$apply$4 $outer) {}
/*     */       }
/*     */     }
/*     */     
/*     */     public final class ComputerAPI$$anonfun$initialize$15$$anonfun$apply$2 extends AbstractFunction0.mcI.sp implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public final int apply() {
/*     */         return apply$mcI$sp();
/*     */       }
/*     */       
/*     */       public int apply$mcI$sp() {
/*     */         return 0;
/*     */       }
/*     */       
/*     */       public ComputerAPI$$anonfun$initialize$15$$anonfun$apply$2(ComputerAPI$$anonfun$initialize$15 $outer) {}
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luac\ComputerAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */