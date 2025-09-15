/*    */ package li.cil.oc.server.machine.luaj;
/*    */ import li.cil.oc.api.driver.Item;
/*    */ import li.cil.repack.org.luaj.vm2.LuaTable;
/*    */ import li.cil.repack.org.luaj.vm2.LuaValue;
/*    */ import li.cil.repack.org.luaj.vm2.Varargs;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Function1;
/*    */ import scala.Serializable;
/*    */ import scala.Tuple2;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001-2A!\001\002\001\037\tY1i\\7qkR,'/\021)J\025\t\031A!\001\003mk\006T'BA\003\007\003\035i\027m\0315j]\026T!a\002\005\002\rM,'O^3s\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\003\001A\001\"!\005\n\016\003\tI!a\005\002\003\0171+\030MS!Q\023\"IQ\003\001B\001B\003%a#G\001\006_^tWM\035\t\003#]I!\001\007\002\003'1+\030M\023'vC\006\0238\r[5uK\016$XO]3\n\005U\021\002\"B\016\001\t\003a\022A\002\037j]&$h\b\006\002\036=A\021\021\003\001\005\006+i\001\rA\006\005\006A\001!\t%I\001\013S:LG/[1mSj,G#\001\022\021\005\r2S\"\001\023\013\003\025\nQa]2bY\006L!a\n\023\003\tUs\027\016\036\005\fS\001\001\n1!A\001\n\023Q\023$A\006tkB,'\017J8x]\026\024X#\001\f")
/*    */ public class ComputerAPI extends LuaJAPI {
/*    */   public ComputerAPI(LuaJLuaArchitecture owner) {
/* 14 */     super(owner);
/*    */   }
/*    */   
/*    */   public void initialize() {
/* 18 */     LuaTable computer = LuaValue.tableOf();
/*    */ 
/*    */     
/* 21 */     computer.set("realTime", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$1(this)));
/*    */     
/* 23 */     computer.set("uptime", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$2(this)));
/*    */ 
/*    */     
/* 26 */     computer.set("address", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$3(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 31 */     computer.set("freeMemory", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$4(this)));
/*    */     
/* 33 */     computer.set("totalMemory", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$5(this)));
/*    */     
/* 35 */     computer.set("pushSignal", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$6(this)));
/*    */ 
/*    */     
/* 38 */     computer.set("tmpAddress", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$7(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 45 */     computer.set("users", (LuaValue)ScalaClosure$.MODULE$.wrapVarArgClosure((Function1)new ComputerAPI$$anonfun$initialize$8(this)));
/*    */     
/* 47 */     computer.set("addUser", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$9(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 52 */     computer.set("removeUser", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$10(this)));
/*    */     
/* 54 */     computer.set("energy", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$11(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 60 */     computer.set("maxEnergy", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$12(this)));
/*    */     
/* 62 */     computer.set("getArchitectures", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$13(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 72 */     computer.set("getArchitecture", (LuaValue)ScalaClosure$.MODULE$.wrapClosure((Function1)new ComputerAPI$$anonfun$initialize$14(this)));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 78 */     computer.set("setArchitecture", (LuaValue)ScalaClosure$.MODULE$.wrapVarArgClosure((Function1)new ComputerAPI$$anonfun$initialize$15(this)));
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
/*    */ 
/*    */     
/* 97 */     lua().set("computer", (LuaValue)computer);
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$1 extends AbstractFunction1<Varargs, LuaNumber> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaNumber apply(Varargs x$1) {
/*    */       return LuaValue.valueOf(System.currentTimeMillis() / 1000.0D);
/*    */     }
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$1(ComputerAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$2 extends AbstractFunction1<Varargs, LuaNumber> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaNumber apply(Varargs x$2) {
/*    */       return LuaValue.valueOf(this.$outer.machine().upTime());
/*    */     }
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$2(ComputerAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$3 extends AbstractFunction1<Varargs, LuaValue> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaValue apply(Varargs x$3) {
/*    */       LuaValue luaValue;
/*    */       Option option = Option$.MODULE$.apply(this.$outer.node().address());
/*    */       if (option instanceof Some) {
/*    */         Some some = (Some)option;
/*    */         String address = (String)some.x();
/*    */         LuaString luaString = LuaValue.valueOf(address);
/*    */       } else {
/*    */         luaValue = LuaValue.NIL;
/*    */       } 
/*    */       return luaValue;
/*    */     }
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$3(ComputerAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$4 extends AbstractFunction1<Varargs, LuaInteger> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaInteger apply(Varargs x$4) {
/*    */       return LuaValue.valueOf(this.$outer.li$cil$oc$server$machine$luaj$ComputerAPI$$super$owner().memory() / 2);
/*    */     }
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$4(ComputerAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$5 extends AbstractFunction1<Varargs, LuaInteger> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaInteger apply(Varargs x$5) {
/*    */       return LuaValue.valueOf(this.$outer.li$cil$oc$server$machine$luaj$ComputerAPI$$super$owner().memory());
/*    */     }
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$5(ComputerAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$6 extends AbstractFunction1<Varargs, LuaBoolean> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaBoolean apply(Varargs args) {
/*    */       return LuaValue.valueOf(this.$outer.machine().signal(args.checkjstring(1), (Object[])ScalaClosure$.MODULE$.toSimpleJavaObjects(args, 2).toArray(ClassTag$.MODULE$.AnyRef())));
/*    */     }
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$6(ComputerAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$7 extends AbstractFunction1<Varargs, LuaValue> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$7(ComputerAPI $outer) {}
/*    */     
/*    */     public final LuaValue apply(Varargs x$6) {
/*    */       String address = this.$outer.machine().tmpAddress();
/*    */       return (address == null) ? LuaValue.NIL : (LuaValue)LuaValue.valueOf(address);
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$8 extends AbstractFunction1<Varargs, Varargs> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final Varargs apply(Varargs x$7) {
/*    */       return LuaValue.varargsOf((LuaValue[])Predef$.MODULE$.refArrayOps((Object[])this.$outer.machine().users()).map((Function1)new ComputerAPI$$anonfun$initialize$8$$anonfun$apply$3(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(LuaValue.class))));
/*    */     }
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$8(ComputerAPI $outer) {}
/*    */     
/*    */     public final class ComputerAPI$$anonfun$initialize$8$$anonfun$apply$3 extends AbstractFunction1<String, LuaString> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final LuaString apply(String x$1) {
/*    */         return LuaValue.valueOf(x$1);
/*    */       }
/*    */       
/*    */       public ComputerAPI$$anonfun$initialize$8$$anonfun$apply$3(ComputerAPI$$anonfun$initialize$8 $outer) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$9 extends AbstractFunction1<Varargs, LuaBoolean> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$9(ComputerAPI $outer) {}
/*    */     
/*    */     public final LuaBoolean apply(Varargs args) {
/*    */       this.$outer.machine().addUser(args.checkjstring(1));
/*    */       return LuaValue.TRUE;
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$10 extends AbstractFunction1<Varargs, LuaBoolean> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaBoolean apply(Varargs args) {
/*    */       return LuaValue.valueOf(this.$outer.machine().removeUser(args.checkjstring(1)));
/*    */     }
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$10(ComputerAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$11 extends AbstractFunction1<Varargs, LuaNumber> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$11(ComputerAPI $outer) {}
/*    */     
/*    */     public final LuaNumber apply(Varargs x$8) {
/*    */       return Settings$.MODULE$.get().ignorePower() ? LuaValue.valueOf(Double.POSITIVE_INFINITY) : LuaValue.valueOf(((Connector)this.$outer.node()).globalBuffer());
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$12 extends AbstractFunction1<Varargs, LuaNumber> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final LuaNumber apply(Varargs x$9) {
/*    */       return LuaValue.valueOf(((Connector)this.$outer.node()).globalBufferSize());
/*    */     }
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$12(ComputerAPI $outer) {}
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$13 extends AbstractFunction1<Varargs, LuaTable> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$13(ComputerAPI $outer) {}
/*    */     
/*    */     public final LuaTable apply(Varargs args) {
/*    */       LuaTable luaTable;
/*    */       Option option = ((TraversableOnce)WrapAsScala$.MODULE$.iterableAsScalaIterable(this.$outer.machine().host().internalComponents()).map((Function1)new ComputerAPI$$anonfun$initialize$13$$anonfun$2(this), Iterable$.MODULE$.canBuildFrom())).collectFirst((PartialFunction)new ComputerAPI$$anonfun$initialize$13$$anonfun$1(this));
/*    */       if (option instanceof Some) {
/*    */         Some some = (Some)option;
/*    */         Seq architectures = (Seq)some.x();
/*    */         luaTable = LuaValue.listOf((LuaValue[])((TraversableOnce)((TraversableLike)architectures.map((Function1)new ComputerAPI$$anonfun$initialize$13$$anonfun$apply$4(this), Seq$.MODULE$.canBuildFrom())).map((Function1)new ComputerAPI$$anonfun$initialize$13$$anonfun$apply$5(this), Seq$.MODULE$.canBuildFrom())).toArray(ClassTag$.MODULE$.apply(LuaValue.class)));
/*    */       } else {
/*    */         luaTable = LuaValue.tableOf();
/*    */       } 
/*    */       return luaTable;
/*    */     }
/*    */     
/*    */     public final class ComputerAPI$$anonfun$initialize$13$$anonfun$2 extends AbstractFunction1<ItemStack, Tuple2<ItemStack, Item>> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final Tuple2<ItemStack, Item> apply(ItemStack stack) {
/*    */         return new Tuple2(stack, Driver.driverFor(stack));
/*    */       }
/*    */       
/*    */       public ComputerAPI$$anonfun$initialize$13$$anonfun$2(ComputerAPI$$anonfun$initialize$13 $outer) {}
/*    */     }
/*    */     
/*    */     public final class ComputerAPI$$anonfun$initialize$13$$anonfun$1 extends AbstractPartialFunction<Tuple2<ItemStack, Item>, Seq<Class<? extends Architecture>>> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final <A1 extends Tuple2<ItemStack, Item>, B1> B1 applyOrElse(Tuple2 x1, Function1 default) {
/*    */         Tuple2 tuple2 = x1;
/*    */         if (tuple2 != null) {
/*    */           Item processor = (Item)tuple2._2();
/*    */           if (processor instanceof MutableProcessor) {
/*    */             MutableProcessor mutableProcessor = (MutableProcessor)processor;
/*    */             return (B1)WrapAsScala$.MODULE$.collectionAsScalaIterable(mutableProcessor.allArchitectures()).toSeq();
/*    */           } 
/*    */         } 
/*    */         if (tuple2 != null) {
/*    */           ItemStack stack = (ItemStack)tuple2._1();
/*    */           Item processor = (Item)tuple2._2();
/*    */           if (processor instanceof Processor) {
/*    */             Processor processor1 = (Processor)processor;
/*    */             (new Class[1])[0] = processor1.architecture(stack);
/*    */             return (B1)Seq$.MODULE$.apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new Class[1]));
/*    */           } 
/*    */         } 
/*    */         return (B1)default.apply(x1);
/*    */       }
/*    */       
/*    */       public final boolean isDefinedAt(Tuple2 x1) {
/*    */         Tuple2 tuple2 = x1;
/*    */         if (tuple2 != null) {
/*    */           Item processor = (Item)tuple2._2();
/*    */           if (processor instanceof MutableProcessor)
/*    */             return true; 
/*    */         } 
/*    */         if (tuple2 != null) {
/*    */           Item processor = (Item)tuple2._2();
/*    */           if (processor instanceof Processor)
/*    */             return true; 
/*    */         } 
/*    */         return false;
/*    */       }
/*    */       
/*    */       public ComputerAPI$$anonfun$initialize$13$$anonfun$1(ComputerAPI$$anonfun$initialize$13 $outer) {}
/*    */     }
/*    */     
/*    */     public final class ComputerAPI$$anonfun$initialize$13$$anonfun$apply$4 extends AbstractFunction1<Class<? extends Architecture>, String> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final String apply(Class x$1) {
/*    */         return Machine.getArchitectureName(x$1);
/*    */       }
/*    */       
/*    */       public ComputerAPI$$anonfun$initialize$13$$anonfun$apply$4(ComputerAPI$$anonfun$initialize$13 $outer) {}
/*    */     }
/*    */     
/*    */     public final class ComputerAPI$$anonfun$initialize$13$$anonfun$apply$5 extends AbstractFunction1<String, LuaString> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final LuaString apply(String x$1) {
/*    */         return LuaValue.valueOf(x$1);
/*    */       }
/*    */       
/*    */       public ComputerAPI$$anonfun$initialize$13$$anonfun$apply$5(ComputerAPI$$anonfun$initialize$13 $outer) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$14 extends AbstractFunction1<Varargs, LuaValue> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$14(ComputerAPI $outer) {}
/*    */     
/*    */     public final LuaValue apply(Varargs args) {
/*    */       return (LuaValue)((TraversableOnce)WrapAsScala$.MODULE$.iterableAsScalaIterable(this.$outer.machine().host().internalComponents()).map((Function1)new ComputerAPI$$anonfun$initialize$14$$anonfun$apply$6(this), Iterable$.MODULE$.canBuildFrom())).collectFirst((PartialFunction)new ComputerAPI$$anonfun$initialize$14$$anonfun$apply$1(this)).getOrElse((Function0)new ComputerAPI$$anonfun$initialize$14$$anonfun$apply$7(this));
/*    */     }
/*    */     
/*    */     public final class ComputerAPI$$anonfun$initialize$14$$anonfun$apply$6 extends AbstractFunction1<ItemStack, Tuple2<ItemStack, Item>> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final Tuple2<ItemStack, Item> apply(ItemStack stack) {
/*    */         return new Tuple2(stack, Driver.driverFor(stack));
/*    */       }
/*    */       
/*    */       public ComputerAPI$$anonfun$initialize$14$$anonfun$apply$6(ComputerAPI$$anonfun$initialize$14 $outer) {}
/*    */     }
/*    */     
/*    */     public final class ComputerAPI$$anonfun$initialize$14$$anonfun$apply$1 extends AbstractPartialFunction<Tuple2<ItemStack, Item>, LuaString> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final <A1 extends Tuple2<ItemStack, Item>, B1> B1 applyOrElse(Tuple2 x2, Function1 default) {
/*    */         Tuple2 tuple2 = x2;
/*    */         if (tuple2 != null) {
/*    */           ItemStack stack = (ItemStack)tuple2._1();
/*    */           Item processor = (Item)tuple2._2();
/*    */           if (processor instanceof Processor) {
/*    */             Processor processor1 = (Processor)processor;
/*    */             return (B1)LuaValue.valueOf(Machine.getArchitectureName(processor1.architecture(stack)));
/*    */           } 
/*    */         } 
/*    */         return (B1)default.apply(x2);
/*    */       }
/*    */       
/*    */       public final boolean isDefinedAt(Tuple2 x2) {
/*    */         Tuple2 tuple2 = x2;
/*    */         if (tuple2 != null) {
/*    */           Item processor = (Item)tuple2._2();
/*    */           if (processor instanceof Processor)
/*    */             return true; 
/*    */         } 
/*    */         return false;
/*    */       }
/*    */       
/*    */       public ComputerAPI$$anonfun$initialize$14$$anonfun$apply$1(ComputerAPI$$anonfun$initialize$14 $outer) {}
/*    */     }
/*    */     
/*    */     public final class ComputerAPI$$anonfun$initialize$14$$anonfun$apply$7 extends AbstractFunction0<LuaValue> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final LuaValue apply() {
/*    */         return LuaValue.NONE;
/*    */       }
/*    */       
/*    */       public ComputerAPI$$anonfun$initialize$14$$anonfun$apply$7(ComputerAPI$$anonfun$initialize$14 $outer) {}
/*    */     }
/*    */   }
/*    */   
/*    */   public final class ComputerAPI$$anonfun$initialize$15 extends AbstractFunction1<Varargs, Varargs> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public ComputerAPI$$anonfun$initialize$15(ComputerAPI $outer) {}
/*    */     
/*    */     public final Varargs apply(Varargs args) {
/*    */       String archName = args.checkjstring(1);
/*    */       return (Varargs)((TraversableOnce)WrapAsScala$.MODULE$.iterableAsScalaIterable(this.$outer.machine().host().internalComponents()).map((Function1)new ComputerAPI$$anonfun$initialize$15$$anonfun$apply$8(this), Iterable$.MODULE$.canBuildFrom())).collectFirst((PartialFunction)new ComputerAPI$$anonfun$initialize$15$$anonfun$apply$2(this, archName)).getOrElse((Function0)new ComputerAPI$$anonfun$initialize$15$$anonfun$apply$9(this));
/*    */     }
/*    */     
/*    */     public final class ComputerAPI$$anonfun$initialize$15$$anonfun$apply$8 extends AbstractFunction1<ItemStack, Tuple2<ItemStack, Item>> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final Tuple2<ItemStack, Item> apply(ItemStack stack) {
/*    */         return new Tuple2(stack, Driver.driverFor(stack));
/*    */       }
/*    */       
/*    */       public ComputerAPI$$anonfun$initialize$15$$anonfun$apply$8(ComputerAPI$$anonfun$initialize$15 $outer) {}
/*    */     }
/*    */     
/*    */     public final class ComputerAPI$$anonfun$initialize$15$$anonfun$apply$2 extends AbstractPartialFunction<Tuple2<ItemStack, Item>, Varargs> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       public final String archName$1;
/*    */       
/*    */       public final <A1 extends Tuple2<ItemStack, Item>, B1> B1 applyOrElse(Tuple2 x3, Function1 default) {
/*    */         // Byte code:
/*    */         //   0: aload_1
/*    */         //   1: astore_3
/*    */         //   2: aload_3
/*    */         //   3: ifnull -> 171
/*    */         //   6: aload_3
/*    */         //   7: invokevirtual _1 : ()Ljava/lang/Object;
/*    */         //   10: checkcast net/minecraft/item/ItemStack
/*    */         //   13: astore #4
/*    */         //   15: aload_3
/*    */         //   16: invokevirtual _2 : ()Ljava/lang/Object;
/*    */         //   19: checkcast li/cil/oc/api/driver/Item
/*    */         //   22: astore #5
/*    */         //   24: aload #5
/*    */         //   26: instanceof li/cil/oc/api/driver/item/MutableProcessor
/*    */         //   29: ifeq -> 171
/*    */         //   32: aload #5
/*    */         //   34: checkcast li/cil/oc/api/driver/item/MutableProcessor
/*    */         //   37: astore #6
/*    */         //   39: getstatic scala/collection/convert/WrapAsScala$.MODULE$ : Lscala/collection/convert/WrapAsScala$;
/*    */         //   42: aload #6
/*    */         //   44: invokeinterface allArchitectures : ()Ljava/util/Collection;
/*    */         //   49: invokevirtual collectionAsScalaIterable : (Ljava/util/Collection;)Lscala/collection/Iterable;
/*    */         //   52: new li/cil/oc/server/machine/luaj/ComputerAPI$$anonfun$initialize$15$$anonfun$apply$2$$anonfun$3
/*    */         //   55: dup
/*    */         //   56: aload_0
/*    */         //   57: invokespecial <init> : (Lli/cil/oc/server/machine/luaj/ComputerAPI$$anonfun$initialize$15$$anonfun$apply$2;)V
/*    */         //   60: invokeinterface find : (Lscala/Function1;)Lscala/Option;
/*    */         //   65: astore #8
/*    */         //   67: aload #8
/*    */         //   69: instanceof scala/Some
/*    */         //   72: ifeq -> 151
/*    */         //   75: aload #8
/*    */         //   77: checkcast scala/Some
/*    */         //   80: astore #9
/*    */         //   82: aload #9
/*    */         //   84: invokevirtual x : ()Ljava/lang/Object;
/*    */         //   87: checkcast java/lang/Class
/*    */         //   90: astore #10
/*    */         //   92: aload #10
/*    */         //   94: aload #6
/*    */         //   96: aload #4
/*    */         //   98: invokeinterface architecture : (Lnet/minecraft/item/ItemStack;)Ljava/lang/Class;
/*    */         //   103: astore #12
/*    */         //   105: dup
/*    */         //   106: ifnonnull -> 118
/*    */         //   109: pop
/*    */         //   110: aload #12
/*    */         //   112: ifnull -> 126
/*    */         //   115: goto -> 132
/*    */         //   118: aload #12
/*    */         //   120: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */         //   123: ifeq -> 132
/*    */         //   126: getstatic li/cil/repack/org/luaj/vm2/LuaValue.FALSE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*    */         //   129: goto -> 146
/*    */         //   132: aload #6
/*    */         //   134: aload #4
/*    */         //   136: aload #10
/*    */         //   138: invokeinterface setArchitecture : (Lnet/minecraft/item/ItemStack;Ljava/lang/Class;)V
/*    */         //   143: getstatic li/cil/repack/org/luaj/vm2/LuaValue.TRUE : Lli/cil/repack/org/luaj/vm2/LuaBoolean;
/*    */         //   146: astore #11
/*    */         //   148: goto -> 164
/*    */         //   151: getstatic li/cil/repack/org/luaj/vm2/LuaValue.NIL : Lli/cil/repack/org/luaj/vm2/LuaValue;
/*    */         //   154: ldc 'unknown architecture'
/*    */         //   156: invokestatic valueOf : (Ljava/lang/String;)Lli/cil/repack/org/luaj/vm2/LuaString;
/*    */         //   159: invokestatic varargsOf : (Lli/cil/repack/org/luaj/vm2/LuaValue;Lli/cil/repack/org/luaj/vm2/Varargs;)Lli/cil/repack/org/luaj/vm2/Varargs;
/*    */         //   162: astore #11
/*    */         //   164: aload #11
/*    */         //   166: astore #7
/*    */         //   168: goto -> 180
/*    */         //   171: aload_2
/*    */         //   172: aload_1
/*    */         //   173: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */         //   178: astore #7
/*    */         //   180: aload #7
/*    */         //   182: areturn
/*    */         // Line number table:
/*    */         //   Java source line number -> byte code offset
/*    */         //   #80	-> 0
/*    */         //   #81	-> 6
/*    */         //   #82	-> 67
/*    */         //   #83	-> 92
/*    */         //   #88	-> 126
/*    */         //   #84	-> 132
/*    */         //   #85	-> 143
/*    */         //   #83	-> 146
/*    */         //   #91	-> 151
/*    */         //   #81	-> 164
/*    */         //   #80	-> 171
/*    */         // Local variable table:
/*    */         //   start	length	slot	name	descriptor
/*    */         //   0	183	0	this	Lli/cil/oc/server/machine/luaj/ComputerAPI$$anonfun$initialize$15$$anonfun$apply$2;
/*    */         //   0	183	1	x3	Lscala/Tuple2;
/*    */         //   0	183	2	default	Lscala/Function1;
/*    */         //   15	168	4	stack	Lnet/minecraft/item/ItemStack;
/*    */         //   24	159	5	processor	Lli/cil/oc/api/driver/Item;
/*    */         //   92	91	10	archClass	Ljava/lang/Class;
/*    */       }
/*    */       
/*    */       public final boolean isDefinedAt(Tuple2 x3) {
/*    */         Tuple2 tuple2 = x3;
/*    */         if (tuple2 != null) {
/*    */           Item processor = (Item)tuple2._2();
/*    */           if (processor instanceof MutableProcessor)
/*    */             return true; 
/*    */         } 
/*    */         return false;
/*    */       }
/*    */       
/*    */       public ComputerAPI$$anonfun$initialize$15$$anonfun$apply$2(ComputerAPI$$anonfun$initialize$15 $outer, String archName$1) {}
/*    */       
/*    */       public final class ComputerAPI$$anonfun$initialize$15$$anonfun$apply$2$$anonfun$3 extends AbstractFunction1<Class<? extends Architecture>, Object> implements Serializable {
/*    */         public static final long serialVersionUID = 0L;
/*    */         
/*    */         public final boolean apply(Class arch) {
/*    */           String str = this.$outer.archName$1;
/*    */           if (Machine.getArchitectureName(arch) == null) {
/*    */             Machine.getArchitectureName(arch);
/*    */             if (str != null);
/*    */           } else if (Machine.getArchitectureName(arch).equals(str)) {
/*    */           
/*    */           } 
/*    */         }
/*    */         
/*    */         public ComputerAPI$$anonfun$initialize$15$$anonfun$apply$2$$anonfun$3(ComputerAPI$$anonfun$initialize$15$$anonfun$apply$2 $outer) {}
/*    */       }
/*    */     }
/*    */     
/*    */     public final class ComputerAPI$$anonfun$initialize$15$$anonfun$apply$9 extends AbstractFunction0<LuaValue> implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       
/*    */       public final LuaValue apply() {
/*    */         return LuaValue.NONE;
/*    */       }
/*    */       
/*    */       public ComputerAPI$$anonfun$initialize$15$$anonfun$apply$9(ComputerAPI$$anonfun$initialize$15 $outer) {}
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luaj\ComputerAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */