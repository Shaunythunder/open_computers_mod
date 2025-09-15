/*    */ package li.cil.oc.integration.fmp;
/*    */ 
/*    */ import codechicken.multipart.JIconHitEffects;
/*    */ import codechicken.multipart.TIconHitEffects;
/*    */ import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.particle.EffectRenderer;
/*    */ import net.minecraft.item.ItemStack;
/*    */ import net.minecraft.util.IIcon;
/*    */ import net.minecraft.util.MovingObjectPosition;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001]4Q!\001\002\002\0025\021qbU5na2,'\t\\8dWB\013'\017\036\006\003\007\021\t1AZ7q\025\t)a!A\006j]R,wM]1uS>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\031\001A\004\f\021\005=!R\"\001\t\013\005E\021\022!C7vYRL\007/\031:u\025\005\031\022aC2pI\026\034\007.[2lK:L!!\006\t\003\025QkU\017\034;j!\006\024H\017\005\002\020/%\021\001\004\005\002\020)&\033wN\034%ji\0263g-Z2ug\")!\004\001C\0017\0051A(\0338jiz\"\022\001\b\t\003;\001i\021A\001\005\006?\0011\t\001I\001\fg&l\007\017\\3CY>\0347.F\001\"!\t\021s%D\001$\025\t!S%A\003cY>\0347N\003\002'\r\00511m\\7n_:L!\001K\022\003\027MKW\016\0357f\0052|7m\033\005\006U\001!\teK\001\ta&\0347.\023;f[R\021AF\016\t\003[Qj\021A\f\006\003_A\nA!\033;f[*\021\021GM\001\n[&tWm\031:bMRT\021aM\001\004]\026$\030BA\033/\005%IE/Z7Ti\006\0347\016C\0038S\001\007\001(A\002iSR\004\"!\017\037\016\003iR!a\017\031\002\tU$\030\016\\\005\003{i\022A#T8wS:<wJ\0316fGR\004vn]5uS>t\007\"B \001\t\003\002\025\001C4fi\022\023x\016]:\026\003\005\0032AQ$-\033\005\031%B\001#F\003\021a\027M\\4\013\003\031\013AA[1wC&\021\001j\021\002\t\023R,'/\0312mK\")!\n\001C!\027\006\031R\r\0379m_NLwN\034*fg&\034H/\0318dKR\021AJ\025\t\003\033Bk\021A\024\006\002\037\006)1oY1mC&\021\021K\024\002\006\r2|\027\r\036\005\006'&\003\r\001V\001\007K:$\030\016^=\021\005U;V\"\001,\013\005M\003\024B\001-W\005\031)e\016^5us\")!\f\001C!7\006iq-\032;Ce>\\WM\\%d_:$\"\001X0\021\005ej\026B\0010;\005\025I\025jY8o\021\025\001\027\f1\001b\003\021\031\030\016Z3\021\0055\023\027BA2O\005\rIe\016\036\025\0053\026\f(\017\005\002g_6\tqM\003\002iS\006Q!/\0327bk:\034\007.\032:\013\005)\\\027a\0014nY*\021A.\\\001\005[>$7OC\001o\003\r\031\007o^\005\003a\036\024\001bU5eK>sG._\001\006m\006dW/\032\023\002g&\021A/^\001\007\0072KUI\024+\013\005Y<\027\001B*jI\026\004")
/*    */ public abstract class SimpleBlockPart extends TMultiPart implements TIconHitEffects {
/*    */   @SideOnly(Side.CLIENT)
/* 15 */   public void addHitEffects(MovingObjectPosition hit, EffectRenderer effectRenderer) { TIconHitEffects.class.addHitEffects(this, hit, effectRenderer); } @SideOnly(Side.CLIENT) public void addDestroyEffects(EffectRenderer effectRenderer) { TIconHitEffects.class.addDestroyEffects(this, effectRenderer); } @SideOnly(Side.CLIENT) public IIcon getBreakingIcon(Object subPart, int side) { return JIconHitEffects.class.getBreakingIcon((JIconHitEffects)this, subPart, side); } public SimpleBlockPart() { JIconHitEffects.class.$init$((JIconHitEffects)this); TIconHitEffects.class.$init$(this); }
/*    */   
/*    */   public ItemStack pickItem(MovingObjectPosition hit) {
/* 18 */     return new ItemStack((Block)simpleBlock());
/*    */   } public Iterable<ItemStack> getDrops() {
/* 20 */     (new ItemStack[1])[0] = new ItemStack((Block)simpleBlock()); return WrapAsJava$.MODULE$.asJavaIterable((Iterable)package$.MODULE$.Iterable().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new ItemStack[1])));
/*    */   } public float explosionResistance(Entity entity) {
/* 22 */     return simpleBlock().func_149638_a(entity);
/*    */   } @SideOnly(Side.CLIENT)
/*    */   public IIcon getBrokenIcon(int side) {
/* 25 */     return simpleBlock().getIcon(ForgeDirection.getOrientation(side), 0);
/*    */   }
/*    */   
/*    */   public abstract SimpleBlock simpleBlock();
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\fmp\SimpleBlockPart.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */