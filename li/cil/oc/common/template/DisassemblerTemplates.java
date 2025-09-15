/*    */ package li.cil.oc.common.template;
/*    */ 
/*    */ import java.lang.reflect.Method;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.Array$;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ import scala.Tuple2;
/*    */ import scala.collection.SeqLike;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001Y<Q!\001\002\t\0025\tQ\003R5tCN\034X-\0342mKJ$V-\0349mCR,7O\003\002\004\t\005AA/Z7qY\006$XM\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001!\tqq\"D\001\003\r\025\001\"\001#\001\022\005U!\025n]1tg\026l'\r\\3s)\026l\007\017\\1uKN\034\"a\004\n\021\005M1R\"\001\013\013\003U\tQa]2bY\006L!a\006\013\003\r\005s\027PU3g\021\025Ir\002\"\001\033\003\031a\024N\\5u}Q\tQ\002C\004\035\037\t\007I\021B\017\002\023Q,W\016\0357bi\026\034X#\001\020\021\007}!c%D\001!\025\t\t#%A\004nkR\f'\r\\3\013\005\r\"\022AC2pY2,7\r^5p]&\021Q\005\t\002\f\003J\024\030-\037\"vM\032,'\017\005\002(Q5\tqB\002\003*\037\001Q#\001\003+f[Bd\027\r^3\024\005!\022\002\002\003\027)\005\013\007I\021A\027\002\021M,G.Z2u_J,\022A\f\t\003_Yj\021\001\r\006\003cI\nqA]3gY\026\034GO\003\0024i\005!A.\0318h\025\005)\024\001\0026bm\006L!a\016\031\003\r5+G\017[8e\021!I\004F!A!\002\023q\023!C:fY\026\034Go\034:!\021!Y\004F!b\001\n\003i\023\001\0043jg\006\0348/Z7cY\026\024\b\002C\037)\005\003\005\013\021\002\030\002\033\021L7/Y:tK6\024G.\032:!\021\025I\002\006\"\001@)\r1\003)\021\005\006Yy\002\rA\f\005\006wy\002\rA\f\005\006\007\"\"\t\001R\001\007g\026dWm\031;\025\005\025C\005CA\nG\023\t9ECA\004C_>dW-\0318\t\013%\023\005\031\001&\002\013M$\030mY6\021\005-\023V\"\001'\013\0055s\025\001B5uK6T!a\024)\002\0235Lg.Z2sC\032$(\"A)\002\0079,G/\003\002T\031\nI\021\n^3n'R\f7m\033\005\006+\"\"\tAV\001\fI&\034\030m]:f[\ndW\rF\002XA\006\004Ba\005-[5&\021\021\f\006\002\007)V\004H.\032\032\021\007MYV,\003\002])\t1q\n\035;j_:\0042a\0050K\023\tyFCA\003BeJ\f\027\020C\003J)\002\007!\nC\003c)\002\007Q,A\006j]\036\024X\rZ5f]R\034\bB\0023\020A\003%a$\001\006uK6\004H.\031;fg\002BQAZ\b\005\002\035\f1!\0313e)\tA7\016\005\002\024S&\021!\016\006\002\005+:LG\017C\003\004K\002\007A\016\005\002na6\taN\003\002p\035\006\031aN\031;\n\005Et'A\004(C)R\013wmQ8na>,h\016\032\005\006\007>!\ta\035\013\003iV\0042aE.'\021\025I%\0171\001K\001")
/*    */ public final class DisassemblerTemplates {
/*    */   public static Option<Template> select(ItemStack paramItemStack) {
/*    */     return DisassemblerTemplates$.MODULE$.select(paramItemStack);
/*    */   }
/*    */   
/*    */   public static void add(NBTTagCompound paramNBTTagCompound) {
/*    */     DisassemblerTemplates$.MODULE$.add(paramNBTTagCompound);
/*    */   }
/*    */   
/*    */   public final class DisassemblerTemplates$$anonfun$select$1 extends AbstractFunction1<Template, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(DisassemblerTemplates.Template x$1) {
/* 25 */       return x$1.select(this.stack$1);
/*    */     } private final ItemStack stack$1; public DisassemblerTemplates$$anonfun$select$1(ItemStack stack$1) {} } public static class Template { private final Method selector; private final Method disassembler; public Method selector() {
/* 27 */       return this.selector; } public Template(Method selector, Method disassembler) {}
/* 28 */     public Method disassembler() { return this.disassembler; }
/* 29 */     public boolean select(ItemStack stack) { return BoxesRunTime.unboxToBoolean(IMC$.MODULE$.tryInvokeStatic(selector(), (Seq)Predef$.MODULE$.wrapRefArray(new Object[] { stack }, ), BoxesRunTime.boxToBoolean(false))); } public Tuple2<Option<ItemStack[]>, Option<ItemStack[]>> disassemble(ItemStack stack, ItemStack[] ingredients) {
/*    */       Tuple2<Option<ItemStack[]>, Option<ItemStack[]>> tuple2;
/* 31 */       Object object = IMC$.MODULE$.tryInvokeStatic(disassembler(), (Seq)Predef$.MODULE$.wrapRefArray(new Object[] { stack, ingredients }, ), null);
/* 32 */       Option option1 = Array$.MODULE$.unapplySeq(object); if (!option1.isEmpty() && option1.get() != null && ((SeqLike)option1.get()).lengthCompare(2) == 0) { Object stacks = ((SeqLike)option1.get()).apply(0), drops = ((SeqLike)option1.get()).apply(1); if (stacks instanceof ItemStack[]) { ItemStack[] arrayOfItemStack = (ItemStack[])stacks; if (drops instanceof ItemStack[]) { ItemStack[] arrayOfItemStack1 = (ItemStack[])drops; return new Tuple2(new Some(arrayOfItemStack), new Some(arrayOfItemStack1)); }  }  }
/* 33 */        Option option2 = Array$.MODULE$.unapplySeq(object); if (!option2.isEmpty() && option2.get() != null && ((SeqLike)option2.get()).lengthCompare(2) == 0) { Object object1 = ((SeqLike)option2.get()).apply(0), drops = ((SeqLike)option2.get()).apply(1); if (object1 instanceof ItemStack) { ItemStack itemStack = (ItemStack)object1; if (drops instanceof ItemStack[]) { ItemStack[] arrayOfItemStack = (ItemStack[])drops; (new ItemStack[1])[0] = itemStack; return new Tuple2(new Some(new ItemStack[1]), new Some(arrayOfItemStack)); }  }  }
/* 34 */        Option option3 = Array$.MODULE$.unapplySeq(object); if (!option3.isEmpty() && option3.get() != null && ((SeqLike)option3.get()).lengthCompare(2) == 0) { Object stacks = ((SeqLike)option3.get()).apply(0), drop = ((SeqLike)option3.get()).apply(1); if (stacks instanceof ItemStack[]) { ItemStack[] arrayOfItemStack = (ItemStack[])stacks; if (drop instanceof ItemStack) { ItemStack itemStack = (ItemStack)drop; (new ItemStack[1])[0] = itemStack; return new Tuple2(new Some(arrayOfItemStack), new Some(new ItemStack[1])); }  }  }
/* 35 */        if (object instanceof ItemStack[]) { ItemStack[] arrayOfItemStack = (ItemStack[])object; tuple2 = new Tuple2(new Some(arrayOfItemStack), None$.MODULE$); }
/* 36 */       else { tuple2 = new Tuple2(None$.MODULE$, None$.MODULE$); }
/*    */       
/*    */       return tuple2;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\template\DisassemblerTemplates.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */