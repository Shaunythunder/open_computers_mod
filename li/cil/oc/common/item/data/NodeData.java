/*    */ package li.cil.oc.common.item.data;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\00114A!\001\002\001\037\tAaj\0343f\t\006$\030M\003\002\004\t\005!A-\031;b\025\t)a!\001\003ji\026l'BA\004\t\003\031\031w.\\7p]*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\023\033\005\021\021BA\n\003\005!IE/Z7ECR\f\007\"B\013\001\t\0031\022A\002\037j]&$h\bF\001\030!\t\t\002\001C\003\026\001\021\005\021\004\006\002\0305!)1\004\007a\0019\005)1\017^1dWB\021QdI\007\002=)\021Qa\b\006\003A\005\n\021\"\\5oK\016\024\030M\032;\013\003\t\n1A\\3u\023\t!cDA\005Ji\026l7\013^1dW\"9a\005\001a\001\n\0039\023aB1eIJ,7o]\013\002QA\031\021\006\f\030\016\003)R\021aK\001\006g\016\fG.Y\005\003[)\022aa\0249uS>t\007CA\0303\035\tI\003'\003\0022U\0051\001K]3eK\032L!a\r\033\003\rM#(/\0338h\025\t\t$\006C\0047\001\001\007I\021A\034\002\027\005$GM]3tg~#S-\035\013\003qm\002\"!K\035\n\005iR#\001B+oSRDq\001P\033\002\002\003\007\001&A\002yIEBaA\020\001!B\023A\023\001C1eIJ,7o\035\021\t\017\001\003\001\031!C\001\003\0061!-\0364gKJ,\022A\021\t\004S1\032\005CA\025E\023\t)%F\001\004E_V\024G.\032\005\b\017\002\001\r\021\"\001I\003)\021WO\0324fe~#S-\035\013\003q%Cq\001\020$\002\002\003\007!\t\003\004L\001\001\006KAQ\001\bEV4g-\032:!\021\035i\005\0011A\005\0029\013!B^5tS\nLG.\033;z+\005y\005cA\025-!B\021\021KV\007\002%*\0211\013V\001\b]\026$xo\034:l\025\t)\006\"A\002ba&L!a\026*\003\025YK7/\0332jY&$\030\020C\004Z\001\001\007I\021\001.\002\035YL7/\0332jY&$\030p\030\023fcR\021\001h\027\005\bya\013\t\0211\001P\021\031i\006\001)Q\005\037\006Ya/[:jE&d\027\016^=!\021\025y\006\001\"\021a\003\021aw.\0313\025\005a\n\007\"\0022_\001\004\031\027a\0018ciB\021AMZ\007\002K*\021!mH\005\003O\026\024aB\024\"U)\006<7i\\7q_VtG\rC\003j\001\021\005#.\001\003tCZ,GC\001\035l\021\025\021\007\0161\001d\001")
/*    */ public class NodeData extends ItemData {
/*    */   private Option<String> address;
/*    */   private Option<Object> buffer;
/*    */   private Option<Visibility> visibility;
/*    */   
/*  9 */   public NodeData() { super(null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 15 */     this.address = (Option<String>)None$.MODULE$;
/* 16 */     this.buffer = (Option<Object>)None$.MODULE$;
/* 17 */     this.visibility = (Option<Visibility>)None$.MODULE$; } public NodeData(ItemStack stack) { this(); load(stack); } public Option<String> address() { return this.address; } public Option<Visibility> visibility() { return this.visibility; } public void address_$eq(Option<String> x$1) { this.address = x$1; } public Option<Object> buffer() { return this.buffer; } public void buffer_$eq(Option<Object> x$1) { this.buffer = x$1; } public void visibility_$eq(Option<Visibility> x$1) { this.visibility = x$1; }
/*    */   
/*    */   public void load(NBTTagCompound nbt) {
/* 20 */     NBTTagCompound nodeNbt = nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString()).func_74775_l("node");
/* 21 */     if (nodeNbt.func_74764_b("address")) {
/* 22 */       address_$eq(Option$.MODULE$.apply(nodeNbt.func_74779_i("address")));
/*    */     }
/* 24 */     if (nodeNbt.func_74764_b("buffer")) {
/* 25 */       buffer_$eq(Option$.MODULE$.apply(BoxesRunTime.boxToDouble(nodeNbt.func_74769_h("buffer"))));
/*    */     }
/* 27 */     if (nodeNbt.func_74764_b("visibility"))
/* 28 */       visibility_$eq(Option$.MODULE$.apply(Visibility.values()[nodeNbt.func_74762_e("visibility")])); 
/*    */   } public final class NodeData$$anonfun$save$3 extends AbstractFunction1<String, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final NBTTagCompound nodeNbt$1; public final void apply(String x$1) {
/*    */       this.nodeNbt$1.func_74778_a("address", x$1);
/*    */     } public NodeData$$anonfun$save$3(NodeData $outer, NBTTagCompound nodeNbt$1) {} }
/* 33 */   public void save(NBTTagCompound nbt) { if (!nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString())) {
/* 34 */       nbt.func_74782_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString(), (NBTBase)new NBTTagCompound());
/*    */     }
/* 36 */     NBTTagCompound dataNbt = nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString());
/* 37 */     if (!dataNbt.func_74764_b("node")) {
/* 38 */       dataNbt.func_74782_a("node", (NBTBase)new NBTTagCompound());
/*    */     }
/* 40 */     NBTTagCompound nodeNbt = dataNbt.func_74775_l("node");
/* 41 */     address().foreach((Function1)new NodeData$$anonfun$save$3(this, nodeNbt));
/* 42 */     buffer().foreach((Function1)new NodeData$$anonfun$save$1(this, nodeNbt));
/* 43 */     visibility().map((Function1)new NodeData$$anonfun$save$4(this)).foreach((Function1)new NodeData$$anonfun$save$2(this, nodeNbt)); } public final class NodeData$$anonfun$save$1 extends AbstractFunction1.mcVD.sp implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nodeNbt$1; public final void apply(double x$2) { apply$mcVD$sp(x$2); } public void apply$mcVD$sp(double x$2) { this.nodeNbt$1.func_74780_a("buffer", x$2); } public NodeData$$anonfun$save$1(NodeData $outer, NBTTagCompound nodeNbt$1) {} } public final class NodeData$$anonfun$save$4 extends AbstractFunction1<Visibility, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int apply(Visibility x$3) { return x$3.ordinal(); } public NodeData$$anonfun$save$4(NodeData $outer) {} } public final class NodeData$$anonfun$save$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound nodeNbt$1; public final void apply(int x$4) { apply$mcVI$sp(x$4); } public void apply$mcVI$sp(int x$4) { this.nodeNbt$1.func_74768_a("visibility", x$4); }
/*    */ 
/*    */     
/*    */     public NodeData$$anonfun$save$2(NodeData $outer, NBTTagCompound nodeNbt$1) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\NodeData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */