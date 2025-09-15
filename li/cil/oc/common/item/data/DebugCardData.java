/*    */ package li.cil.oc.common.item.data;
/*    */ 
/*    */ import li.cil.oc.server.component.DebugCard;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\t4A!\001\002\001\037\tiA)\0322vO\016\013'\017\032#bi\006T!a\001\003\002\t\021\fG/\031\006\003\013\031\tA!\033;f[*\021q\001C\001\007G>lWn\0348\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001a\005\002\001!A\021\021CE\007\002\005%\0211C\001\002\t\023R,W\016R1uC\")Q\003\001C\001-\0051A(\0338jiz\"\022a\006\t\003#\001AQ!\006\001\005\002e!\"a\006\016\t\013mA\002\031\001\017\002\013M$\030mY6\021\005u\031S\"\001\020\013\005\025y\"B\001\021\"\003%i\027N\\3de\0064GOC\001#\003\rqW\r^\005\003Iy\021\021\"\023;f[N#\030mY6\t\017\031\002\001\031!C\001O\0051\021mY2fgN,\022\001\013\t\004S1rS\"\001\026\013\003-\nQa]2bY\006L!!\f\026\003\r=\003H/[8o!\ty3I\004\0021\001:\021\021'\020\b\003emr!a\r\036\017\005QJdBA\0339\033\0051$BA\034\017\003\031a$o\\8u}%\tQ\"\003\002\f\031%\021\021BC\005\003y!\taa]3sm\026\024\030B\001 @\003%\031w.\0349p]\026tGO\003\002=\021%\021\021IQ\001\n\t\026\024WoZ\"be\022T!AP \n\005\021+%!D!dG\026\0348oQ8oi\026DHO\003\002B\005\"9q\t\001a\001\n\003A\025AC1dG\026\0348o\030\023fcR\021\021\n\024\t\003S)K!a\023\026\003\tUs\027\016\036\005\b\033\032\013\t\0211\001)\003\rAH%\r\005\007\037\002\001\013\025\002\025\002\017\005\0347-Z:tA!)\021\013\001C!%\006!An\\1e)\tI5\013C\003U!\002\007Q+A\002oER\004\"A\026-\016\003]S!\001V\020\n\005e;&A\004(C)R\013wmQ8na>,h\016\032\005\0067\002!\t\005X\001\005g\0064X\r\006\002J;\")AK\027a\001+\")q\f\001C\005A\0069A-\031;b)\006<GCA+b\021\025!f\f1\001V\001")
/*    */ public class DebugCardData extends ItemData {
/*  8 */   public DebugCardData() { super("debugCard");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     this.access = (Option<DebugCard.AccessContext>)None$.MODULE$; } private Option<DebugCard.AccessContext> access; public DebugCardData(ItemStack stack) { this(); load(stack); } public Option<DebugCard.AccessContext> access() { return this.access; } public void access_$eq(Option<DebugCard.AccessContext> x$1) { this.access = x$1; }
/*    */   
/*    */   public void load(NBTTagCompound nbt) {
/* 17 */     access_$eq(DebugCard$AccessContext$.MODULE$.load(dataTag(nbt)));
/*    */   }
/*    */   
/*    */   public void save(NBTTagCompound nbt) {
/* 21 */     NBTTagCompound tag = dataTag(nbt);
/* 22 */     DebugCard$AccessContext$.MODULE$.remove(tag);
/* 23 */     access().foreach((Function1)new DebugCardData$$anonfun$save$1(this, tag)); } public final class DebugCardData$$anonfun$save$1 extends AbstractFunction1<DebugCard.AccessContext, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final NBTTagCompound tag$1; public final void apply(DebugCard.AccessContext x$1) { x$1.save(this.tag$1); }
/*    */     
/*    */     public DebugCardData$$anonfun$save$1(DebugCardData $outer, NBTTagCompound tag$1) {} }
/*    */   private NBTTagCompound dataTag(NBTTagCompound nbt) {
/* 27 */     if (!nbt.func_74764_b((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString())) {
/* 28 */       nbt.func_74782_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString(), (NBTBase)new NBTTagCompound());
/*    */     }
/* 30 */     return nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("data").toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\DebugCardData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */