/*    */ package li.cil.oc.common.template;
/*    */ import java.lang.reflect.Method;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import scala.collection.Seq;
/*    */ import scala.collection.mutable.ArrayBuffer;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public final class DisassemblerTemplates$ {
/*    */   public static final DisassemblerTemplates$ MODULE$;
/*    */   
/*    */   private ArrayBuffer<DisassemblerTemplates.Template> templates() {
/* 13 */     return this.templates;
/*    */   } private final ArrayBuffer<DisassemblerTemplates.Template> templates; public void add(NBTTagCompound template) {
/*    */     try {
/* 16 */       (new Class[1])[0] = ItemStack.class; Method selector = li.cil.oc.common.IMC$.MODULE$.getStaticMethod(template.func_74779_i("select"), (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Class[1]));
/* 17 */       (new Class[2])[0] = ItemStack.class; (new Class[2])[1] = ItemStack[].class; Method disassembler = li.cil.oc.common.IMC$.MODULE$.getStaticMethod(template.func_74779_i("disassemble"), (Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new Class[2]));
/*    */       
/* 19 */       templates().$plus$eq(new DisassemblerTemplates.Template(selector, disassembler));
/*    */     } finally {
/*    */       Exception exception = null;
/*    */     } 
/*    */   }
/*    */   
/* 25 */   public Option<DisassemblerTemplates.Template> select(ItemStack stack) { return templates().find((Function1)new DisassemblerTemplates$$anonfun$select$1(stack)); } public final class DisassemblerTemplates$$anonfun$select$1 extends AbstractFunction1<DisassemblerTemplates.Template, Object> implements Serializable { public final boolean apply(DisassemblerTemplates.Template x$1) { return x$1.select(this.stack$1); }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     private final ItemStack stack$1;
/*    */ 
/*    */     
/*    */     public DisassemblerTemplates$$anonfun$select$1(ItemStack stack$1) {} }
/*    */ 
/*    */ 
/*    */   
/*    */   private DisassemblerTemplates$() {
/* 40 */     MODULE$ = this;
/*    */     this.templates = (ArrayBuffer<DisassemblerTemplates.Template>)scala.collection.mutable.ArrayBuffer$.MODULE$.empty();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\DisassemblerTemplates$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */