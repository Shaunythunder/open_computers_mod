/*    */ package li.cil.oc.server.network;
/*    */ @ScalaSignature(bytes = "\006\001\005}aaB\001\003!\003\r\t!\004\002\n\007>tg.Z2u_JT!a\001\003\002\0179,Go^8sW*\021QAB\001\007g\026\024h/\032:\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001a\005\003\001\035Ya\002CA\b\025\033\005\001\"BA\t\023\003\021a\027M\\4\013\003M\tAA[1wC&\021Q\003\005\002\007\037\nTWm\031;\021\005]YR\"\001\r\013\005\rI\"B\001\016\007\003\r\t\007/[\005\003\003a\001\"!\b\020\016\003\tI!a\b\002\003\t9{G-\032\005\006C\001!\tAI\001\007I%t\027\016\036\023\025\003\r\002\"\001J\024\016\003\025R\021AJ\001\006g\016\fG.Y\005\003Q\025\022A!\0268ji\"9!\006\001a\001\n\003Y\023a\0047pG\006d')\0364gKJ\034\026N_3\026\0031\002\"\001J\027\n\0059*#A\002#pk\ndW\rC\0041\001\001\007I\021A\031\002'1|7-\0317Ck\0324WM]*ju\026|F%Z9\025\005\r\022\004bB\0320\003\003\005\r\001L\001\004q\022\n\004BB\033\001A\003&A&\001\tm_\016\fGNQ;gM\026\0248+\033>fA!9q\007\001a\001\n\003Y\023a\0037pG\006d')\0364gKJDq!\017\001A\002\023\005!(A\bm_\016\fGNQ;gM\026\024x\fJ3r)\t\0313\bC\0044q\005\005\t\031\001\027\t\ru\002\001\025)\003-\0031awnY1m\005V4g-\032:!\021\035y\004\0011A\005\002\001\0131\002Z5tiJL'-\036;peV\t\021\tE\002%\005\022K!aQ\023\003\r=\003H/[8o!\tiR)\003\002G\005\tYA)[:ue&\024W\017^8s\021\035A\005\0011A\005\002%\013q\002Z5tiJL'-\036;pe~#S-\035\013\003G)CqaM$\002\002\003\007\021\t\003\004M\001\001\006K!Q\001\rI&\034HO]5ckR|'\017\t\005\006\035\002!\taT\001\rO2|'-\0317Ck\0324WM\035\013\002Y!)\021\013\001C\001\037\006\001r\r\\8cC2\024UO\0324feNK'0\032\005\006'\002!\t\001V\001\rG\"\fgnZ3Ck\0324WM\035\013\003YUCQA\026*A\0021\nQ\001Z3mi\006DQ\001\027\001\005\ne\013aa\0315b]\036,GC\001\027[\021\0251v\0131\001-\021\025a\006\001\"\001^\003=!(/_\"iC:<WMQ;gM\026\024HC\0010b!\t!s,\003\002aK\t9!i\\8mK\006t\007\"\002,\\\001\004a\003\"B2\001\t\003!\027AE:fi2{7-\0317Ck\0324WM]*ju\026$\"aI3\t\013\031\024\007\031\001\027\002\tML'0\032\005\006Q\002!\t%[\001\r_:$\025n]2p]:,7\r\036\013\003G)DQa[4A\0021\fAA\\8eKB\021q#\\\005\003?aAQa\034\001\005BA\fA\001\\8bIR\0211%\035\005\006e:\004\ra]\001\004]\n$\bC\001;{\033\005)(B\001:w\025\t9\b0A\005nS:,7M]1gi*\t\0210A\002oKRL!a_;\003\0359\023E\013V1h\007>l\007o\\;oI\")Q\020\001C!}\006!1/\031<f)\t\031s\020C\003sy\002\0071\017\003\b\002\004\001\001\n1!A\001\n\023\t)!!\003\002%M,\b/\032:%_:$\025n]2p]:,7\r\036\013\004G\005\035\001BB6\002\002\001\007A.\003\002i=!q\021Q\002\001\021\002\007\005\t\021\"\003\002\020\005M\021AC:va\026\024H\005\\8bIR\0311%!\005\t\rI\fY\0011\001t\023\tyg\004\003\b\002\030\001\001\n1!A\001\n\023\tI\"!\b\002\025M,\b/\032:%g\0064X\rF\002$\0037AaA]A\013\001\004\031\030BA?\037\001")
/*    */ public interface Connector extends Connector, Node { double localBufferSize(); @TraitSetter
/*    */   void localBufferSize_$eq(double paramDouble); double localBuffer(); @TraitSetter
/*    */   void localBuffer_$eq(double paramDouble);
/*    */   Option<Distributor> distributor();
/*    */   @TraitSetter
/*    */   void distributor_$eq(Option<Distributor> paramOption);
/*    */   double globalBuffer();
/*    */   double globalBufferSize();
/*    */   double changeBuffer(double paramDouble);
/*    */   boolean tryChangeBuffer(double paramDouble);
/*    */   void setLocalBufferSize(double paramDouble);
/*    */   void onDisconnect(Node paramNode);
/*    */   void load(NBTTagCompound paramNBTTagCompound);
/*    */   void save(NBTTagCompound paramNBTTagCompound);
/* 17 */   public final class Connector$$anonfun$globalBuffer$1 extends AbstractFunction0.mcD.sp implements Serializable { public final double apply() { return apply$mcD$sp(); } public static final long serialVersionUID = 0L; public double apply$mcD$sp() { return this.$outer.localBuffer(); } public Connector$$anonfun$globalBuffer$1(Connector $outer) {} } public final class Connector$$anonfun$globalBuffer$2 extends AbstractFunction1<Distributor, Object> implements Serializable { public static final long serialVersionUID = 0L; public final double apply(Distributor x$1) { return x$1.globalBuffer(); }
/*    */      public Connector$$anonfun$globalBuffer$2(Connector $outer) {} } public final class Connector$$anonfun$globalBufferSize$1 extends AbstractFunction0.mcD.sp implements Serializable { public static final long serialVersionUID = 0L;
/* 19 */     public final double apply() { return apply$mcD$sp(); } public double apply$mcD$sp() { return this.$outer.localBufferSize(); } public Connector$$anonfun$globalBufferSize$1(Connector $outer) {} } public final class Connector$$anonfun$globalBufferSize$2 extends AbstractFunction1<Distributor, Object> implements Serializable { public static final long serialVersionUID = 0L; public final double apply(Distributor x$2) { return x$2.globalBufferSize(); }
/*    */ 
/*    */     
/*    */     public Connector$$anonfun$globalBufferSize$2(Connector $outer) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\Connector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */