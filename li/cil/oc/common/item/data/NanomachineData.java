/*    */ package li.cil.oc.common.item.data;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0054A!\001\002\001\037\tya*\0318p[\006\034\007.\0338f\t\006$\030M\003\002\004\t\005!A-\031;b\025\t)a!\001\003ji\026l'BA\004\t\003\031\031w.\\7p]*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\023\033\005\021\021BA\n\003\005!IE/Z7ECR\f\007\"B\013\001\t\0031\022A\002\037j]&$h\bF\001\030!\t\t\002\001C\003\026\001\021\005\021\004\006\002\0305!)1\004\007a\0019\005)1\017^1dWB\021QdI\007\002=)\021Qa\b\006\003A\005\n\021\"\\5oK\016\024\030M\032;\013\003\t\n1A\\3u\023\t!cDA\005Ji\026l7\013^1dW\")Q\003\001C\001MQ\021qc\n\005\006Q\025\002\r!K\001\013G>tGO]8mY\026\024\bC\001\026.\033\005Y#B\001\027\007\0031q\027M\\8nC\016D\027N\\3t\023\tq3F\001\bD_:$(o\0347mKJLU\016\0357\t\017A\002\001\031!C\001c\005!Q/^5e+\005\021\004CA\0329\033\005!$BA\0337\003\021a\027M\\4\013\003]\nAA[1wC&\021\021\b\016\002\007'R\024\030N\\4\t\017m\002\001\031!C\001y\005AQ/^5e?\022*\027\017\006\002>\007B\021a(Q\007\002)\t\001)A\003tG\006d\027-\003\002C\t!QK\\5u\021\035!%(!AA\002I\n1\001\037\0232\021\0311\005\001)Q\005e\005)Q/^5eA!9\001\n\001a\001\n\003I\025!D2p]\032Lw-\036:bi&|g.F\001K!\rq4*T\005\003\031~\022aa\0249uS>t\007C\001(R\033\005y%B\001) \003\rq'\r^\005\003%>\023aB\024\"U)\006<7i\\7q_VtG\rC\004U\001\001\007I\021A+\002#\r|gNZ5hkJ\fG/[8o?\022*\027\017\006\002>-\"9AiUA\001\002\004Q\005B\002-\001A\003&!*\001\bd_:4\027nZ;sCRLwN\034\021\t\013i\003A\021I.\002\t1|\027\r\032\013\003{qCQ\001U-A\0025CQA\030\001\005B}\013Aa]1wKR\021Q\b\031\005\006!v\003\r!\024")
/*    */ public class NanomachineData extends ItemData {
/*    */   private String uuid;
/*    */   private Option<NBTTagCompound> configuration;
/*    */   
/*  8 */   public NanomachineData() { super("nanomachines");
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
/* 22 */     this.uuid = "";
/* 23 */     this.configuration = (Option<NBTTagCompound>)None$.MODULE$; } public NanomachineData(ItemStack stack) { this(); load(stack); } public NanomachineData(ControllerImpl controller) { this(); uuid_$eq(controller.uuid()); NBTTagCompound nbt = new NBTTagCompound(); controller.configuration().save(nbt, true); configuration_$eq(Option$.MODULE$.apply(nbt)); } public Option<NBTTagCompound> configuration() { return this.configuration; } public String uuid() { return this.uuid; } public void uuid_$eq(String x$1) { this.uuid = x$1; } public void configuration_$eq(Option<NBTTagCompound> x$1) { this.configuration = x$1; }
/*    */   
/*    */   public void load(NBTTagCompound nbt) {
/* 26 */     uuid_$eq(nbt.func_74779_i((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("uuid").toString()));
/* 27 */     if (nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("configuration").toString())) {
/* 28 */       configuration_$eq(Option$.MODULE$.apply(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("configuration").toString())));
/*    */     } else {
/*    */       
/* 31 */       configuration_$eq((Option<NBTTagCompound>)None$.MODULE$);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void save(NBTTagCompound nbt) {
/* 36 */     nbt.func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("uuid").toString(), uuid());
/* 37 */     configuration().foreach((Function1)new NanomachineData$$anonfun$save$1(this, nbt)); } public final class NanomachineData$$anonfun$save$1 extends AbstractFunction1<NBTTagCompound, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nbt$1; public final void apply(NBTTagCompound x$1) { this.nbt$1.func_74782_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("configuration").toString(), (NBTBase)x$1); }
/*    */ 
/*    */     
/*    */     public NanomachineData$$anonfun$save$1(NanomachineData $outer, NBTTagCompound nbt$1) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\NanomachineData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */