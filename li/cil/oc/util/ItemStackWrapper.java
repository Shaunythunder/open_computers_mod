/*    */ package li.cil.oc.util;
/*    */ 
/*    */ import java.util.Objects;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import scala.math.Ordered;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001q3A!\001\002\001\027\t\001\022\n^3n'R\f7m[,sCB\004XM\035\006\003\007\021\tA!\036;jY*\021QAB\001\003_\016T!a\002\005\002\007\rLGNC\001\n\003\ta\027n\001\001\024\007\001a!\003\005\002\016!5\taBC\001\020\003\025\0318-\0317b\023\t\tbB\001\004B]f\024VM\032\t\004'mqbB\001\013\032\035\t)\002$D\001\027\025\t9\"\"\001\004=e>|GOP\005\002\037%\021!DD\001\ba\006\0347.Y4f\023\taRDA\004Pe\022,'/\0323\013\005iq\001CA\020\001\033\005\021\001\002C\021\001\005\013\007I\021\001\022\002\013%tg.\032:\026\003\r\002\"\001J\026\016\003\025R!AJ\024\002\t%$X-\034\006\003Q%\n\021\"\\5oK\016\024\030M\032;\013\003)\n1A\\3u\023\taSEA\005Ji\026l7\013^1dW\"Aa\006\001B\001B\003%1%\001\004j]:,'\017\t\005\006a\001!\t!M\001\007y%t\027\016\036 \025\005y\021\004\"B\0210\001\004\031\003\"\002\033\001\t\003)\024AA5e+\0051\004CA\0078\023\tAdBA\002J]RDQA\017\001\005\002U\na\001Z1nC\036,\007\"\002\037\001\t\003j\024aB2p[B\f'/\032\013\003myBQaP\036A\002y\tA\001\0365bi\")\021\t\001C!\005\006A\001.Y:i\007>$W\rF\0017\021\025!\005\001\"\021F\003\031)\027/^1mgR\021a)\023\t\003\033\035K!\001\023\b\003\017\t{w\016\\3b]\")!j\021a\001\027\006\031qN\0316\021\0055a\025BA'\017\005\r\te.\037\005\006\037\002!\t\005U\001\006G2|g.\032\013\002=!)!\013\001C!'\006AAo\\*ue&tw\rF\001U!\t)&,D\001W\025\t9\006,\001\003mC:<'\"A-\002\t)\fg/Y\005\0037Z\023aa\025;sS:<\007")
/*    */ public class ItemStackWrapper implements Ordered<ItemStackWrapper> {
/* 10 */   public boolean $less(Object that) { return Ordered.class.$less(this, that); } private final ItemStack inner; public boolean $greater(Object that) { return Ordered.class.$greater(this, that); } public boolean $less$eq(Object that) { return Ordered.class.$less$eq(this, that); } public boolean $greater$eq(Object that) { return Ordered.class.$greater$eq(this, that); } public int compareTo(Object that) { return Ordered.class.compareTo(this, that); } public ItemStack inner() { return this.inner; } public ItemStackWrapper(ItemStack inner) { Ordered.class.$init$(this); } public int id() {
/* 11 */     return (inner().func_77973_b() == null) ? 0 : Item.func_150891_b(inner().func_77973_b());
/*    */   } public int damage() {
/* 13 */     return (inner().func_77973_b() == null) ? 0 : inner().func_77960_j();
/*    */   }
/*    */   public int compare(ItemStackWrapper that) {
/* 16 */     return (id() == that.id()) ? (damage() - that.damage()) : (
/* 17 */       id() - that.id());
/*    */   }
/*    */   
/* 20 */   public int hashCode() { return Objects.hash(new Object[] { BoxesRunTime.boxToInteger(id()), BoxesRunTime.boxToInteger(damage()) }); }
/*    */   public boolean equals(Object obj) { boolean bool;
/* 22 */     Object object = obj;
/* 23 */     if (object instanceof ItemStackWrapper) { ItemStackWrapper itemStackWrapper = (ItemStackWrapper)object; bool = (compare(itemStackWrapper) == 0) ? true : false; }
/* 24 */     else { bool = false; }
/*    */     
/*    */     return bool; } public ItemStackWrapper clone() {
/* 27 */     return new ItemStackWrapper(inner());
/*    */   } public String toString() {
/* 29 */     return inner().toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\ItemStackWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */