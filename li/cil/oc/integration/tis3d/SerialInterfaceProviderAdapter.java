/*     */ package li.cil.oc.integration.tis3d;
/*     */ 
/*     */ import li.cil.oc.api.internal.Adapter;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.tis3d.api.serial.SerialInterface;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.EnumFacing;
/*     */ import net.minecraft.world.World;
/*     */ import scala.Array$;
/*     */ import scala.Function1;
/*     */ import scala.Predef$;
/*     */ import scala.Serializable;
/*     */ import scala.collection.mutable.Queue;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\tMq!B\001\003\021\003i\021AH*fe&\fG.\0238uKJ4\027mY3Qe>4\030\016Z3s\003\022\f\007\017^3s\025\t\031A!A\003uSN\034DM\003\002\006\r\005Y\021N\034;fOJ\fG/[8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001\001\t\003\035=i\021A\001\004\006!\tA\t!\005\002\037'\026\024\030.\0317J]R,'OZ1dKB\023xN^5eKJ\fE-\0319uKJ\0342a\004\n\033!\t\031\002$D\001\025\025\t)b#\001\003mC:<'\"A\f\002\t)\fg/Y\005\0033Q\021aa\0242kK\016$\bCA\016\"\033\005a\"BA\017\037\003\031\031XM]5bY*\021q\004I\001\004CBL'BA\002\t\023\t\021CDA\fTKJL\027\r\\%oi\026\024h-Y2f!J|g/\0333fe\")Ae\004C\001K\0051A(\0338jiz\"\022!\004\005\006O=!\t\001K\001\005S:LG\017F\001*!\tQS&D\001,\025\005a\023!B:dC2\f\027B\001\030,\005\021)f.\033;\t\013AzA\021I\031\0023\035,G\017R8dk6,g\016^1uS>t'+\0324fe\026t7-\032\013\002eA\0211dM\005\003iq\021AeU3sS\006d\007K]8u_\016|G\016R8dk6,g\016^1uS>t'+\0324fe\026t7-\032\005\006m=!\teN\001\no>\0248n],ji\"$b\001O\036G\0276{\005C\001\026:\023\tQ4FA\004C_>dW-\0318\t\013q*\004\031A\037\002\013]|'\017\0343\021\005y\"U\"A \013\005q\002%BA!C\003%i\027N\\3de\0064GOC\001D\003\rqW\r^\005\003\013~\022QaV8sY\022DQaR\033A\002!\013\021\001\037\t\003U%K!AS\026\003\007%sG\017C\003Mk\001\007\001*A\001z\021\025qU\0071\001I\003\005Q\b\"\002)6\001\004\t\026\001B:jI\026\004\"AU+\016\003MS!\001\026!\002\tU$\030\016\\\005\003-N\023!\"\0228v[\032\0137-\0338h\021\025Av\002\"\021Z\0031Ig\016^3sM\006\034WMR8s)\031QVLX0aCB\0211dW\005\0039r\021qbU3sS\006d\027J\034;fe\032\f7-\032\005\006y]\003\r!\020\005\006\017^\003\r\001\023\005\006\031^\003\r\001\023\005\006\035^\003\r\001\023\005\006!^\003\r!\025\005\006G>!\t\005Z\001\bSN4\026\r\\5e)\035ATMZ4iS*DQ\001\0202A\002uBQa\0222A\002!CQ\001\0242A\002!CQA\0242A\002!CQ\001\0252A\002ECQa\0332A\002i\013qb]3sS\006d\027J\034;fe\032\f7-\032\004\005[>\001aN\001\fTKJL\027\r\\%oi\026\024h-Y2f\003\022\f\007\017^3s'\021a'c\034.\021\005A$X\"A9\013\005I\034\030a\0028fi^|'o\033\006\003?\031I!!^9\003\027\025sg/\033:p]6,g\016\036\005\to2\024)\031!C\001q\006QA/\0337f\013:$\030\016^=\026\003e\004\"A_?\016\003mT!\001`:\002\021%tG/\032:oC2L!A`>\003\017\005#\027\r\035;fe\"I\021\021\0017\003\002\003\006I!_\001\fi&dW-\0228uSRL\b\005\003\004%Y\022\005\021Q\001\013\005\003\017\tY\001E\002\002\n1l\021a\004\005\007o\006\r\001\031A=\t\023\005=AN1A\005\006\005E\021A\004\"vM\032,'oQ1qC\016LG/_\013\003\003'y!!!\006\036\005\001\001\t\002CA\rY\002\006i!a\005\002\037\t+hMZ3s\007\006\004\030mY5us\002B\021\"!\bm\005\004%)!a\b\002\025I,\027\r\032\"vM\032,'/\006\002\002\"A1\0211EA\027\003ci!!!\n\013\t\005\035\022\021F\001\b[V$\030M\0317f\025\r\tYcK\001\013G>dG.Z2uS>t\027\002BA\030\003K\021Q!U;fk\026\0042AKA\032\023\r\t)d\013\002\006'\"|'\017\036\005\t\003sa\007\025!\004\002\"\005Y!/Z1e\005V4g-\032:!\021%\ti\004\034b\001\n\013\ty\"A\006xe&$XMQ;gM\026\024\b\002CA!Y\002\006i!!\t\002\031]\024\030\016^3Ck\0324WM\035\021\t\023\005\025C\0161A\005\002\005\035\023!C5t%\026\fG-\0338h+\005A\004\"CA&Y\002\007I\021AA'\0035I7OU3bI&twm\030\023fcR\031\021&a\024\t\023\005E\023\021JA\001\002\004A\024a\001=%c!9\021Q\0137!B\023A\024AC5t%\026\fG-\0338hA!I\021\021\f7C\002\023\005\0211L\001\005]>$W-\006\002\002^A\031\001/a\030\n\007\005\005\024O\001\003O_\022,\007\002CA3Y\002\006I!!\030\002\0139|G-\032\021\t\017\005%D\016\"\021\002l\005IqN\\'fgN\fw-\032\013\004S\0055\004\002CA8\003O\002\r!!\035\002\0175,7o]1hKB\031\001/a\035\n\007\005U\024OA\004NKN\034\030mZ3\t\017\005eD\016\"\021\002|\005IqN\\\"p]:,7\r\036\013\004S\005u\004\002CA-\003o\002\r!!\030\t\017\005\005E\016\"\021\002\004\006aqN\034#jg\016|gN\\3diR\031\021&!\"\t\021\005e\023q\020a\001\003;Bq!!#m\t\003\tY)\001\006tKR\024V-\0313j]\036$b!!$\002\032\006%\006#\002\026\002\020\006M\025bAAIW\t)\021I\035:bsB\031!&!&\n\007\005]5F\001\004B]f\024VM\032\005\t\0037\0139\t1\001\002\036\00691m\0348uKb$\b\003BAP\003Kk!!!)\013\007\005\r6/A\004nC\016D\027N\\3\n\t\005\035\026\021\025\002\b\007>tG/\032=u\021!\tY+a\"A\002\0055\026\001B1sON\004B!a(\0020&!\021\021WAQ\005%\t%oZ;nK:$8\017\013\003\002\b\006U\006\003BAP\003oKA!!/\002\"\nA1)\0317mE\006\0347\016C\004\002>2$\t!a0\002\tI,\027\r\032\013\007\003\033\013\t-a1\t\021\005m\0251\030a\001\003;C\001\"a+\002<\002\007\021Q\026\025\005\003w\013)\fC\004\002J2$\t!a3\002\013]\024\030\016^3\025\r\0055\025QZAh\021!\tY*a2A\002\005u\005\002CAV\003\017\004\r!!,)\t\005\035\027Q\027\005\b\003+dG\021IAl\003!\031\027M\\,sSR,G#\001\035\t\017\005%G\016\"\021\002\\R\031\021&!8\t\021\005}\027\021\034a\001\003c\tQA^1mk\026Dq!a9m\t\003\n9.A\004dC:\024V-\0313\t\017\005\035H\016\"\021\002j\006!\001/Z3l)\t\t\t\004\003\004\002n2$\t\005K\001\005g.L\007\017\003\004\002r2$\t\005K\001\006e\026\034X\r\036\005\b\003kdG\021IA|\003-\021X-\0313Ge>lgJ\021+\025\007%\nI\020\003\005\002|\006M\b\031AA\003\rq'\r\036\t\005\003\024\031!\004\002\003\002)\031\0211 !\n\t\t\025!\021\001\002\017\035\n#F+Y4D_6\004x.\0368e\021\035\021I\001\034C!\005\027\t!b\036:ji\026$vN\024\"U)\rI#Q\002\005\t\003w\0249\0011\001\002~\"1!\021\0037\005\n!\nq\"\0328tkJ,7i\0348oK\016$X\r\032")
/*     */ public final class SerialInterfaceProviderAdapter {
/*     */   public static boolean isValid(World paramWorld, int paramInt1, int paramInt2, int paramInt3, EnumFacing paramEnumFacing, SerialInterface paramSerialInterface) {
/*     */     return SerialInterfaceProviderAdapter$.MODULE$.isValid(paramWorld, paramInt1, paramInt2, paramInt3, paramEnumFacing, paramSerialInterface);
/*     */   }
/*     */   
/*     */   public static SerialInterface interfaceFor(World paramWorld, int paramInt1, int paramInt2, int paramInt3, EnumFacing paramEnumFacing) {
/*     */     return SerialInterfaceProviderAdapter$.MODULE$.interfaceFor(paramWorld, paramInt1, paramInt2, paramInt3, paramEnumFacing);
/*     */   }
/*     */   
/*     */   public static boolean worksWith(World paramWorld, int paramInt1, int paramInt2, int paramInt3, EnumFacing paramEnumFacing) {
/*     */     return SerialInterfaceProviderAdapter$.MODULE$.worksWith(paramWorld, paramInt1, paramInt2, paramInt3, paramEnumFacing);
/*     */   }
/*     */   
/*     */   public static SerialProtocolDocumentationReference getDocumentationReference() {
/*     */     return SerialInterfaceProviderAdapter$.MODULE$.getDocumentationReference();
/*     */   }
/*     */   
/*     */   public static void init() {
/*     */     SerialInterfaceProviderAdapter$.MODULE$.init();
/*     */   }
/*     */   
/*     */   public static class SerialInterfaceAdapter implements Environment, SerialInterface {
/*     */     private final Adapter tileEntity;
/*     */     
/*  44 */     public Adapter tileEntity() { return this.tileEntity; } private final int BufferCapacity; public final int BufferCapacity() {
/*  45 */       return 128;
/*  46 */     } private final Queue<Object> readBuffer = (Queue<Object>)Queue$.MODULE$.empty(); public final Queue<Object> readBuffer() { return this.readBuffer; }
/*  47 */      private final Queue<Object> writeBuffer = (Queue<Object>)Queue$.MODULE$.empty(); public final Queue<Object> writeBuffer() { return this.writeBuffer; } private boolean isReading = false;
/*  48 */     public boolean isReading() { return this.isReading; } public void isReading_$eq(boolean x$1) { this.isReading = x$1; }
/*     */ 
/*     */ 
/*     */     
/*  52 */     private final Node node = Network.newNode(this, Visibility.Network).withComponent("serial_port").create(); public Node node() { return this.node; }
/*     */ 
/*     */ 
/*     */     
/*     */     public void onMessage(Message message) {}
/*     */     
/*     */     public void onConnect(Node node) {}
/*     */     
/*     */     public void onDisconnect(Node node) {}
/*     */     
/*     */     @Callback
/*     */     public Object[] setReading(Context context, Arguments args) {
/*  64 */       isReading_$eq(args.checkBoolean(0));
/*  65 */       return null;
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] read(Context context, Arguments args) {
/*  70 */       synchronized (readBuffer()) { return readBuffer().nonEmpty() ? 
/*  71 */           ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { readBuffer().dequeue()
/*     */               
/*  73 */               })) : null; }
/*     */     
/*     */     }
/*     */     
/*     */     @Callback
/*     */     public Object[] write(Context context, Arguments args) {
/*  79 */       synchronized (writeBuffer()) {
/*  80 */         writeBuffer().$plus$eq(BoxesRunTime.boxToShort((short)args.checkInteger(0)));
/*  81 */         return (writeBuffer().length() < 128) ? ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true)
/*     */               
/*  83 */               })) : ResultWrapper$.MODULE$.result((Seq)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(false), "buffer full" }));
/*     */       } 
/*     */     }
/*     */     
/*     */     public boolean canWrite()
/*     */     {
/*  89 */       synchronized (readBuffer()) { Boolean bool = BoxesRunTime.boxToBoolean((isReading() && readBuffer().length() < 128)); return BoxesRunTime.unboxToBoolean(bool); }
/*     */     
/*  91 */     } public void write(short value) { synchronized (readBuffer()) { readBuffer().$plus$eq(BoxesRunTime.boxToShort(value));
/*     */         return; }
/*     */        } public boolean canRead() {
/*  94 */       ensureConnected();
/*  95 */       synchronized (writeBuffer()) { Boolean bool = BoxesRunTime.boxToBoolean(writeBuffer().nonEmpty()); return BoxesRunTime.unboxToBoolean(bool); }
/*     */     
/*     */     }
/*  98 */     public short peek() { synchronized (writeBuffer()) { Object object = writeBuffer().front(); return BoxesRunTime.unboxToShort(object); }
/*     */        }
/* 100 */     public void skip() { synchronized (writeBuffer()) { writeBuffer().dequeue();
/*     */         return; }
/*     */        }
/* 103 */     public void reset() { synchronized (readBuffer()) { synchronized (writeBuffer()) {
/* 104 */           readBuffer().clear();
/* 105 */           writeBuffer().clear();
/* 106 */           node().remove();
/*     */           return;
/*     */         }  }
/*     */        } public final class SerialInterfaceProviderAdapter$SerialInterfaceAdapter$$anonfun$readFromNBT$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final short apply(int x$1) { return (short)x$1; } public SerialInterfaceProviderAdapter$SerialInterfaceAdapter$$anonfun$readFromNBT$1(SerialInterfaceProviderAdapter.SerialInterfaceAdapter $outer) {} }
/* 111 */     public void readFromNBT(NBTTagCompound nbt) { node().load(nbt);
/*     */       
/* 113 */       writeBuffer().clear();
/* 114 */       writeBuffer().$plus$plus$eq((TraversableOnce)Predef$.MODULE$.intArrayOps(nbt.func_74759_k("writeBuffer")).map((Function1)new SerialInterfaceProviderAdapter$SerialInterfaceAdapter$$anonfun$readFromNBT$1(this), Array$.MODULE$.fallbackCanBuildFrom(Predef$DummyImplicit$.MODULE$.dummyImplicit())));
/* 115 */       readBuffer().clear();
/* 116 */       readBuffer().$plus$plus$eq((TraversableOnce)Predef$.MODULE$.intArrayOps(nbt.func_74759_k("readBuffer")).map((Function1)new SerialInterfaceProviderAdapter$SerialInterfaceAdapter$$anonfun$readFromNBT$2(this), Array$.MODULE$.fallbackCanBuildFrom(Predef$DummyImplicit$.MODULE$.dummyImplicit())));
/* 117 */       isReading_$eq(nbt.func_74767_n("isReading")); } public final class SerialInterfaceProviderAdapter$SerialInterfaceAdapter$$anonfun$readFromNBT$2 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final short apply(int x$2) {
/*     */         return (short)x$2;
/*     */       } public SerialInterfaceProviderAdapter$SerialInterfaceAdapter$$anonfun$readFromNBT$2(SerialInterfaceProviderAdapter.SerialInterfaceAdapter $outer) {} }
/* 121 */     public void writeToNBT(NBTTagCompound nbt) { node().save(nbt);
/*     */       
/* 123 */       nbt.func_74783_a("writeBuffer", (int[])Predef$.MODULE$.shortArrayOps((short[])writeBuffer().toArray(ClassTag$.MODULE$.Short())).map((Function1)new SerialInterfaceProviderAdapter$SerialInterfaceAdapter$$anonfun$writeToNBT$1(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int())));
/* 124 */       nbt.func_74783_a("readBuffer", (int[])Predef$.MODULE$.shortArrayOps((short[])readBuffer().toArray(ClassTag$.MODULE$.Short())).map((Function1)new SerialInterfaceProviderAdapter$SerialInterfaceAdapter$$anonfun$writeToNBT$2(this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.Int())));
/* 125 */       nbt.func_74757_a("isReading", isReading()); } public final class SerialInterfaceProviderAdapter$SerialInterfaceAdapter$$anonfun$writeToNBT$1 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final int apply(short x$3) {
/*     */         return x$3;
/*     */       } public SerialInterfaceProviderAdapter$SerialInterfaceAdapter$$anonfun$writeToNBT$1(SerialInterfaceProviderAdapter.SerialInterfaceAdapter $outer) {} } private void ensureConnected() {
/* 129 */       Network network = node().network(); if (tileEntity().node().network() == null) { tileEntity().node().network(); if (network != null)
/* 130 */         { tileEntity().node().connect(node()); return; }  } else if (!tileEntity().node().network().equals(network)) { tileEntity().node().connect(node());
/*     */         return; }
/*     */     
/*     */     }
/*     */     
/*     */     public final class SerialInterfaceProviderAdapter$SerialInterfaceAdapter$$anonfun$writeToNBT$2 extends AbstractFunction1<Object, Object> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public final int apply(short x$4) {
/*     */         return x$4;
/*     */       }
/*     */       
/*     */       public SerialInterfaceProviderAdapter$SerialInterfaceAdapter$$anonfun$writeToNBT$2(SerialInterfaceProviderAdapter.SerialInterfaceAdapter $outer) {}
/*     */     }
/*     */     
/*     */     public SerialInterfaceAdapter(Adapter tileEntity) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\tis3d\SerialInterfaceProviderAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */