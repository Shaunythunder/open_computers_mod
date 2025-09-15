/*     */ package li.cil.oc.util;
/*     */ 
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import net.minecraftforge.fluids.Fluid;
/*     */ import net.minecraftforge.fluids.FluidContainerRegistry;
/*     */ import net.minecraftforge.fluids.FluidStack;
/*     */ import net.minecraftforge.fluids.FluidTankInfo;
/*     */ import net.minecraftforge.fluids.IFluidContainerItem;
/*     */ import net.minecraftforge.fluids.IFluidHandler;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.collection.immutable.List;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\tEx!B\001\003\021\003Y\021a\005$mk&$7i\0348uC&tWM]+uS2\034(BA\002\005\003\021)H/\0337\013\005\0251\021AA8d\025\t9\001\"A\002dS2T\021!C\001\003Y&\034\001\001\005\002\r\0335\t!AB\003\017\005!\005qBA\nGYVLGmQ8oi\006Lg.\032:Vi&d7o\005\002\016!A\021\021\003F\007\002%)\t1#A\003tG\006d\027-\003\002\026%\t1\021I\\=SK\032DQaF\007\005\002a\ta\001P5oSRtD#A\006\t\013iiA\021A\016\002\035\031dW/\0333IC:$G.\032:J]R\031A$\013\032\021\007Eir$\003\002\037%\t1q\n\035;j_:\004\"\001I\024\016\003\005R!AI\022\002\r\031dW/\0333t\025\t!S%\001\bnS:,7M]1gi\032|'oZ3\013\003\031\n1A\\3u\023\tA\023EA\007J\r2,\030\016\032%b]\022dWM\035\005\006Ue\001\raK\001\nS:4XM\034;pef\004\"\001\f\031\016\0035R!A\013\030\013\005=*\023!C7j]\026\034'/\0314u\023\t\tTF\001\006J\023:4XM\034;pefDQaM\rA\002Q\nAa\0357piB\021\021#N\005\003mI\0211!\0238u\021\025AT\002\"\001:\003Y\021X\r\0357bs\006\024G.\032$mk&$\007*\0318eY\026\024HcA\020;y!)1h\016a\001?\0059\001.\0318eY\026\024\bbB\0378!\003\005\rAP\001\tg&lW\017\\1uKB\021\021cP\005\003\001J\021qAQ8pY\026\fg\016C\003C\033\021\0051)\001\nhKR\034uN\034;bS:,'OU3tk2$HC\001#K!\t)\005*D\001G\025\t9e&\001\003ji\026l\027BA%G\005%IE/Z7Ti\006\0347\016C\003L\003\002\007q$A\005d_:$\030-\0338fe\")Q*\004C\001\035\0061!/\0329mCf$2a\024*U!\t\t\002+\003\002R%\t!QK\\5u\021\025\031F\n1\001 \003)\021X\r\0357bs\006\024G.\032\005\006w1\003\ra\b\004\b-6\001\n1%\003X\005A\031uN\034;bS:,'o\026:baB,'oE\002V1~\001\"!\0270\016\003iS!a\027/\002\t1\fgn\032\006\002;\006!!.\031<b\023\ty&L\001\004PE*,7\r\036\005\006CV3\tAY\001\nO\026$(+Z:vYR,\022\001\022\004\005I6!QM\001\fGS2dW\rZ\"p]R\f\027N\\3s/J\f\007\017]3s'\r\031\007L\032\t\003OVk\021!\004\005\tS\016\024)\031!C\001E\006)1\017^1dW\"A1n\031B\001B\003%A)\001\004ti\006\0347\016\t\005\006/\r$\t!\034\013\003]>\004\"aZ2\t\013%d\007\031\001#\t\017E\034'\031!C\005e\006)a\r\\;jIV\t1\017\005\002!i&\021Q/\t\002\013\r2,\030\016Z*uC\016\\\007BB<dA\003%1/\001\004gYVLG\r\t\005\bs\016\024\r\021\"\003{\003!\031\027\r]1dSRLX#\001\033\t\rq\034\007\025!\0035\003%\031\027\r]1dSRL\b\005C\004G\002\007I\021\0022\002\rI,7/\0367u\021%\t\ta\031a\001\n\023\t\031!\001\006sKN,H\016^0%KF$2aTA\003\021!\t9a`A\001\002\004!\025a\001=%c!9\0211B2!B\023!\025a\002:fgVdG\017\t\005\n\003\037\031\007\031!C\005\003#\tQ\001Z5sif,\022A\020\005\n\003+\031\007\031!C\005\003/\t\021\002Z5sif|F%Z9\025\007=\013I\002C\005\002\b\005M\021\021!a\001}!9\021QD2!B\023q\024A\0023jeRL\b\005C\004\002\"\r$\t%a\t\002\t\031LG\016\034\013\bi\005\025\022qGA\036\021!\t9#a\bA\002\005%\022\001\0024s_6\004B!a\013\00245\021\021Q\006\006\004\007\005=\"bAA\031G\00511m\\7n_:LA!!\016\002.\tqai\034:hK\022K'/Z2uS>t\007bBA\035\003?\001\ra]\001\te\026\034x.\036:dK\"9\021QHA\020\001\004q\024A\0023p\r&dG\016C\004\002B\r$\t%a\021\002\013\021\024\030-\0338\025\017M\f)%a\022\002J!A\021qEA \001\004\tI\003C\004\002:\005}\002\031A:\t\017\005-\023q\ba\001}\0059Am\034#sC&t\007bBA!G\022\005\023q\n\013\bg\006E\0231KA,\021!\t9#!\024A\002\005%\002bBA+\003\033\002\r\001N\001\t[\006DHI]1j]\"9\0211JA'\001\004q\004bBA.G\022\005\023QL\001\bG\006tg)\0337m)\025q\024qLA1\021!\t9#!\027A\002\005%\002bB9\002Z\001\007\0211\r\t\004A\005\025\024bAA4C\t)a\t\\;jI\"9\0211N2\005B\0055\024\001C2b]\022\023\030-\0338\025\013y\ny'!\035\t\021\005\035\022\021\016a\001\003SAq!]A5\001\004\t\031\007C\004\002v\r$\t%a\036\002\027\035,G\017V1oW&sgm\034\013\005\003s\n)\tE\003\022\003w\ny(C\002\002~I\021Q!\021:sCf\0042\001IAA\023\r\t\031)\t\002\016\r2,\030\016\032+b].LeNZ8\t\021\005\035\0221\017a\001\003SAQ!Y2\005B\t4a!a#\016\t\0055%!F#naRL8i\0348uC&tWM],sCB\004XM]\n\005\003\023Cf\rC\005j\003\023\023)\031!C\001E\"I1.!#\003\002\003\006I\001\022\005\b/\005%E\021AAK)\021\t9*!'\021\007\035\fI\t\003\004j\003'\003\r\001\022\005\t}\006%\005\031!C\005E\"Q\021\021AAE\001\004%I!a(\025\007=\013\t\013C\005\002\b\005u\025\021!a\001\t\"A\0211BAEA\003&A\t\003\006\002\020\005%\005\031!C\005\003#A!\"!\006\002\n\002\007I\021BAU)\ry\0251\026\005\n\003\017\t9+!AA\002yB\001\"!\b\002\n\002\006KA\020\005\t\003C\tI\t\"\021\0022R9A'a-\0026\006]\006\002CA\024\003_\003\r!!\013\t\017\005e\022q\026a\001g\"9\021QHAX\001\004q\004\002CA!\003\023#\t%a/\025\017M\fi,a0\002B\"A\021qEA]\001\004\tI\003C\004\002:\005e\006\031A:\t\017\005-\023\021\030a\001}!A\021\021IAE\t\003\n)\rF\004t\003\017\fI-a3\t\021\005\035\0221\031a\001\003SAq!!\026\002D\002\007A\007C\004\002L\005\r\007\031\001 \t\021\005m\023\021\022C!\003\037$RAPAi\003'D\001\"a\n\002N\002\007\021\021\006\005\bc\0065\007\031AA2\021!\tY'!#\005B\005]G#\002 \002Z\006m\007\002CA\024\003+\004\r!!\013\t\017E\f)\0161\001\002d!A\021QOAE\t\003\ny\016\006\003\002z\005\005\b\002CA\024\003;\004\r!!\013\t\r\005\fI\t\"\021c\r\031\t9/\004\003\002j\nIb\t\\;jI\016{g\016^1j]\026\024\030\n^3n/J\f\007\017]3s'\021\t)\017\0274\t\023%\f)O!b\001\n\003\021\007\"C6\002f\n\005\t\025!\003E\021\0359\022Q\035C\001\003c$B!a=\002vB\031q-!:\t\r%\fy\0171\001E\021)\tI0!:C\002\023%\0211`\001\023M2,\030\016Z\"p]R\f\027N\\3s\023R,W.\006\002\002~B\031\001%a@\n\007\t\005\021EA\nJ\r2,\030\016Z\"p]R\f\027N\\3s\023R,W\016C\005\003\006\005\025\b\025!\003\002~\006\031b\r\\;jI\016{g\016^1j]\026\024\030\n^3nA!A\021\021EAs\t\003\022I\001F\0045\005\027\021iAa\004\t\021\005\035\"q\001a\001\003SAq!!\017\003\b\001\0071\017C\004\002>\t\035\001\031\001 \t\021\005\005\023Q\035C!\005'!ra\035B\013\005/\021I\002\003\005\002(\tE\001\031AA\025\021\035\tID!\005A\002MDq!a\023\003\022\001\007a\b\003\005\002B\005\025H\021\tB\017)\035\031(q\004B\021\005GA\001\"a\n\003\034\001\007\021\021\006\005\b\003+\022Y\0021\0015\021\035\tYEa\007A\002yB\001\"a\027\002f\022\005#q\005\013\006}\t%\"1\006\005\t\003O\021)\0031\001\002*!9\021O!\nA\002\005\r\004\002CA6\003K$\tEa\f\025\013y\022\tDa\r\t\021\005\035\"Q\006a\001\003SAq!\035B\027\001\004\t\031\007\003\005\002v\005\025H\021\tB\034)\021\tIH!\017\t\021\005\035\"Q\007a\001\003SAa!YAs\t\003\022gA\002B \033\021\021\tE\001\fSKBd\027-_1cY\0264E.^5e\021\006tG\r\\3s'\021\021i\004W\020\t\025m\022iD!b\001\n\003\021)%F\001 \021)\021IE!\020\003\002\003\006IaH\001\tQ\006tG\r\\3sA!QQH!\020\003\006\004%\t!!\005\t\025\t=#Q\bB\001B\003%a(A\005tS6,H.\031;fA!9qC!\020\005\002\tMCC\002B+\005/\022I\006E\002h\005{Aaa\017B)\001\004y\002\002C\037\003RA\005\t\031\001 \t\025\tu#Q\ba\001\n\003\021y&A\004bGRLwN\\:\026\005\t\005\004C\002B2\005g\022IH\004\003\003f\t=d\002\002B4\005[j!A!\033\013\007\t-$\"\001\004=e>|GOP\005\002'%\031!\021\017\n\002\017A\f7m[1hK&!!Q\017B<\005\021a\025n\035;\013\007\tE$\003E\003\022\005wzr*C\002\003~I\021\021BR;oGRLwN\\\031\t\025\t\005%Q\ba\001\n\003\021\031)A\006bGRLwN\\:`I\025\fHcA(\003\006\"Q\021q\001B@\003\003\005\rA!\031\t\023\t%%Q\bQ!\n\t\005\024\001C1di&|gn\035\021\t\0175\023i\004\"\001\003\016R\031qJa$\t\rm\022Y\t1\001 \021!\t\tC!\020\005B\tMEc\002\033\003\026\n]%\021\024\005\t\003O\021\t\n1\001\002*!9\021\021\bBI\001\004\031\bbBA\037\005#\003\rA\020\005\t\003\003\022i\004\"\021\003\036R91Oa(\003\"\n\r\006\002CA\024\0057\003\r!!\013\t\017\005e\"1\024a\001g\"9\0211\nBN\001\004q\004\002CA!\005{!\tEa*\025\017M\024IKa+\003.\"A\021q\005BS\001\004\tI\003C\004\002V\t\025\006\031\001\033\t\017\005-#Q\025a\001}!A\0211\fB\037\t\003\022\t\fF\003?\005g\023)\f\003\005\002(\t=\006\031AA\025\021\035\t(q\026a\001\003GB\001\"a\033\003>\021\005#\021\030\013\006}\tm&Q\030\005\t\003O\0219\f1\001\002*!9\021Oa.A\002\005\r\004\002CA;\005{!\tE!1\025\t\005e$1\031\005\t\003O\021y\f1\001\002*\035I!qY\007\002\002#%!\021Z\001\027%\026\004H.Y=bE2,g\t\\;jI\"\013g\016\0327feB\031qMa3\007\023\t}R\"!A\t\n\t57c\001Bf!!9qCa3\005\002\tEGC\001Be\021)\021)Na3\022\002\023\005!q[\001\034I1,7o]5oSR$sM]3bi\026\024H\005Z3gCVdG\017\n\032\026\005\te'f\001 \003\\.\022!Q\034\t\005\005?\024I/\004\002\003b*!!1\035Bs\003%)hn\0315fG.,GMC\002\003hJ\t!\"\0318o_R\fG/[8o\023\021\021YO!9\003#Ut7\r[3dW\026$g+\031:jC:\034W\rC\005\003p6\t\n\021\"\001\003X\006\001#/\0329mCf\f'\r\\3GYVLG\rS1oI2,'\017\n3fM\006,H\016\036\0233\001")
/*     */ public final class FluidContainerUtils
/*     */ {
/*     */   public static boolean replayableFluidHandler$default$2() {
/*     */     return FluidContainerUtils$.MODULE$.replayableFluidHandler$default$2();
/*     */   }
/*     */   
/*     */   public static void replay(IFluidHandler paramIFluidHandler1, IFluidHandler paramIFluidHandler2) {
/*     */     FluidContainerUtils$.MODULE$.replay(paramIFluidHandler1, paramIFluidHandler2);
/*     */   }
/*     */   
/*     */   public static ItemStack getContainerResult(IFluidHandler paramIFluidHandler) {
/*     */     return FluidContainerUtils$.MODULE$.getContainerResult(paramIFluidHandler);
/*     */   }
/*     */   
/*     */   public static IFluidHandler replayableFluidHandler(IFluidHandler paramIFluidHandler, boolean paramBoolean) {
/*     */     return FluidContainerUtils$.MODULE$.replayableFluidHandler(paramIFluidHandler, paramBoolean);
/*     */   }
/*     */   
/*     */   public static Option<IFluidHandler> fluidHandlerIn(IInventory paramIInventory, int paramInt) {
/*     */     return FluidContainerUtils$.MODULE$.fluidHandlerIn(paramIInventory, paramInt);
/*     */   }
/*     */   
/*     */   public static class FilledContainerWrapper
/*     */     implements ContainerWrapper
/*     */   {
/*     */     private final ItemStack stack;
/*     */     private final FluidStack fluid;
/*     */     private final int capacity;
/*     */     private ItemStack result;
/*     */     private boolean dirty;
/*     */     
/*     */     public ItemStack stack() {
/*  57 */       return this.stack;
/*  58 */     } private FluidStack fluid() { return this.fluid; } private int capacity() { return this.capacity; } public FilledContainerWrapper(ItemStack stack) { this.fluid = FluidContainerRegistry.getFluidForFilledItem(stack);
/*  59 */       this.capacity = FluidContainerRegistry.getContainerCapacity(stack);
/*  60 */       this.result = null;
/*  61 */       this.dirty = false; } private ItemStack result() { return this.result; } private boolean dirty() { return this.dirty; } private void result_$eq(ItemStack x$1) { this.result = x$1; } private void dirty_$eq(boolean x$1) { this.dirty = x$1; }
/*     */      public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
/*  63 */       return 0;
/*     */     }
/*     */     public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
/*  66 */       if (dirty()) { null; return null; }
/*  67 */        return (resource != null && resource.isFluidEqual(fluid())) ? 
/*  68 */         drain(from, resource.amount, doDrain) : null;
/*     */     }
/*     */     
/*     */     public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
/*  72 */       if (dirty()) { null; return null; }
/*     */ 
/*     */       
/*  75 */       if (doDrain) {
/*  76 */         result_$eq(FluidContainerRegistry.drainFluidContainer(stack()));
/*  77 */         dirty_$eq(true);
/*     */       } 
/*  79 */       return (maxDrain < capacity()) ? null : fluid();
/*     */     }
/*     */     
/*     */     public boolean canFill(ForgeDirection from, Fluid fluid) {
/*  83 */       return false;
/*     */     }
/*     */     
/*     */     public boolean canDrain(ForgeDirection from, Fluid fluid) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: invokespecial dirty : ()Z
/*     */       //   4: ifeq -> 9
/*     */       //   7: iconst_0
/*     */       //   8: ireturn
/*     */       //   9: aload_2
/*     */       //   10: ifnull -> 45
/*     */       //   13: aload_0
/*     */       //   14: invokespecial fluid : ()Lnet/minecraftforge/fluids/FluidStack;
/*     */       //   17: invokevirtual getFluid : ()Lnet/minecraftforge/fluids/Fluid;
/*     */       //   20: aload_2
/*     */       //   21: astore_3
/*     */       //   22: dup
/*     */       //   23: ifnonnull -> 34
/*     */       //   26: pop
/*     */       //   27: aload_3
/*     */       //   28: ifnull -> 41
/*     */       //   31: goto -> 45
/*     */       //   34: aload_3
/*     */       //   35: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   38: ifeq -> 45
/*     */       //   41: iconst_1
/*     */       //   42: goto -> 46
/*     */       //   45: iconst_0
/*     */       //   46: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #86	-> 0
/*     */       //   #87	-> 9
/*     */       //   #85	-> 46
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	47	0	this	Lli/cil/oc/util/FluidContainerUtils$FilledContainerWrapper;
/*     */       //   0	47	1	from	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   0	47	2	fluid	Lnet/minecraftforge/fluids/Fluid;
/*     */     }
/*     */     
/*     */     public FluidTankInfo[] getTankInfo(ForgeDirection from) {
/*  91 */       (new FluidTankInfo[1])[0] = new FluidTankInfo(fluid(), capacity()); return new FluidTankInfo[1];
/*     */     }
/*     */     public ItemStack getResult() {
/*  94 */       return result();
/*     */     } } public static class EmptyContainerWrapper implements ContainerWrapper { private final ItemStack stack;
/*     */     public ItemStack stack() {
/*  97 */       return this.stack;
/*  98 */     } private ItemStack result = null; private ItemStack result() { return this.result; } private void result_$eq(ItemStack x$1) { this.result = x$1; } private boolean dirty = false;
/*  99 */     private boolean dirty() { return this.dirty; } private void dirty_$eq(boolean x$1) { this.dirty = x$1; }
/*     */     
/*     */     public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
/* 102 */       if (dirty()) return 0; 
/* 103 */       ItemStack filledContainer = FluidContainerRegistry.fillFluidContainer(resource, stack());
/*     */ 
/*     */       
/* 106 */       if (doFill) {
/* 107 */         result_$eq(filledContainer);
/* 108 */         dirty_$eq(true);
/*     */       } 
/* 110 */       return (filledContainer == null) ? 0 : (FluidContainerRegistry.getFluidForFilledItem(filledContainer)).amount;
/*     */     }
/*     */     
/*     */     public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
/* 114 */       return null;
/*     */     } public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
/* 116 */       return null;
/*     */     }
/*     */     public boolean canFill(ForgeDirection from, Fluid fluid) {
/* 119 */       if (dirty()) return false; 
/* 120 */       return !(FluidContainerRegistry.fillFluidContainer(new FluidStack(fluid, 2147483647), stack()) == null);
/*     */     }
/*     */     public boolean canDrain(ForgeDirection from, Fluid fluid) {
/* 123 */       return false;
/*     */     }
/*     */     public FluidTankInfo[] getTankInfo(ForgeDirection from) {
/* 126 */       (new FluidTankInfo[1])[0] = new FluidTankInfo(null, 2147483647); return new FluidTankInfo[1];
/*     */     }
/*     */     public ItemStack getResult() {
/* 129 */       return result();
/*     */     } public EmptyContainerWrapper(ItemStack stack) {} }
/*     */   public static class FluidContainerItemWrapper implements ContainerWrapper { private final ItemStack stack; private final IFluidContainerItem fluidContainerItem;
/* 132 */     public ItemStack stack() { return this.stack; }
/* 133 */     public FluidContainerItemWrapper(ItemStack stack) { this.fluidContainerItem = (IFluidContainerItem)stack.func_77973_b(); } private IFluidContainerItem fluidContainerItem() { return this.fluidContainerItem; }
/*     */     
/*     */     public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
/* 136 */       return fluidContainerItem().fill(stack(), resource, doFill);
/*     */     }
/*     */     
/*     */     public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
/* 140 */       return (fluidContainerItem().getFluid(stack()) != null && fluidContainerItem().getFluid(stack()).isFluidEqual(resource)) ? 
/* 141 */         fluidContainerItem().drain(stack(), resource.amount, doDrain) : null;
/*     */     }
/*     */     
/*     */     public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
/* 145 */       return fluidContainerItem().drain(stack(), maxDrain, doDrain);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean canFill(ForgeDirection from, Fluid fluid) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: invokespecial fluidContainerItem : ()Lnet/minecraftforge/fluids/IFluidContainerItem;
/*     */       //   4: aload_0
/*     */       //   5: invokevirtual stack : ()Lnet/minecraft/item/ItemStack;
/*     */       //   8: invokeinterface getFluid : (Lnet/minecraft/item/ItemStack;)Lnet/minecraftforge/fluids/FluidStack;
/*     */       //   13: ifnonnull -> 20
/*     */       //   16: iconst_1
/*     */       //   17: goto -> 94
/*     */       //   20: aload_0
/*     */       //   21: invokespecial fluidContainerItem : ()Lnet/minecraftforge/fluids/IFluidContainerItem;
/*     */       //   24: aload_0
/*     */       //   25: invokevirtual stack : ()Lnet/minecraft/item/ItemStack;
/*     */       //   28: invokeinterface getFluid : (Lnet/minecraft/item/ItemStack;)Lnet/minecraftforge/fluids/FluidStack;
/*     */       //   33: invokevirtual getFluid : ()Lnet/minecraftforge/fluids/Fluid;
/*     */       //   36: aload_2
/*     */       //   37: astore_3
/*     */       //   38: dup
/*     */       //   39: ifnonnull -> 50
/*     */       //   42: pop
/*     */       //   43: aload_3
/*     */       //   44: ifnull -> 57
/*     */       //   47: goto -> 93
/*     */       //   50: aload_3
/*     */       //   51: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   54: ifeq -> 93
/*     */       //   57: aload_0
/*     */       //   58: invokespecial fluidContainerItem : ()Lnet/minecraftforge/fluids/IFluidContainerItem;
/*     */       //   61: aload_0
/*     */       //   62: invokevirtual stack : ()Lnet/minecraft/item/ItemStack;
/*     */       //   65: invokeinterface getFluid : (Lnet/minecraft/item/ItemStack;)Lnet/minecraftforge/fluids/FluidStack;
/*     */       //   70: getfield amount : I
/*     */       //   73: aload_0
/*     */       //   74: invokespecial fluidContainerItem : ()Lnet/minecraftforge/fluids/IFluidContainerItem;
/*     */       //   77: aload_0
/*     */       //   78: invokevirtual stack : ()Lnet/minecraft/item/ItemStack;
/*     */       //   81: invokeinterface getCapacity : (Lnet/minecraft/item/ItemStack;)I
/*     */       //   86: if_icmpge -> 93
/*     */       //   89: iconst_1
/*     */       //   90: goto -> 94
/*     */       //   93: iconst_0
/*     */       //   94: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #149	-> 0
/*     */       //   #150	-> 20
/*     */       //   #151	-> 93
/*     */       //   #149	-> 94
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	95	0	this	Lli/cil/oc/util/FluidContainerUtils$FluidContainerItemWrapper;
/*     */       //   0	95	1	from	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   0	95	2	fluid	Lnet/minecraftforge/fluids/Fluid;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean canDrain(ForgeDirection from, Fluid fluid) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: invokespecial fluidContainerItem : ()Lnet/minecraftforge/fluids/IFluidContainerItem;
/*     */       //   4: aload_0
/*     */       //   5: invokevirtual stack : ()Lnet/minecraft/item/ItemStack;
/*     */       //   8: invokeinterface getFluid : (Lnet/minecraft/item/ItemStack;)Lnet/minecraftforge/fluids/FluidStack;
/*     */       //   13: ifnonnull -> 20
/*     */       //   16: iconst_0
/*     */       //   17: goto -> 82
/*     */       //   20: aload_0
/*     */       //   21: invokespecial fluidContainerItem : ()Lnet/minecraftforge/fluids/IFluidContainerItem;
/*     */       //   24: aload_0
/*     */       //   25: invokevirtual stack : ()Lnet/minecraft/item/ItemStack;
/*     */       //   28: invokeinterface getFluid : (Lnet/minecraft/item/ItemStack;)Lnet/minecraftforge/fluids/FluidStack;
/*     */       //   33: invokevirtual getFluid : ()Lnet/minecraftforge/fluids/Fluid;
/*     */       //   36: aload_2
/*     */       //   37: astore_3
/*     */       //   38: dup
/*     */       //   39: ifnonnull -> 50
/*     */       //   42: pop
/*     */       //   43: aload_3
/*     */       //   44: ifnull -> 57
/*     */       //   47: goto -> 81
/*     */       //   50: aload_3
/*     */       //   51: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   54: ifeq -> 81
/*     */       //   57: iconst_0
/*     */       //   58: aload_0
/*     */       //   59: invokespecial fluidContainerItem : ()Lnet/minecraftforge/fluids/IFluidContainerItem;
/*     */       //   62: aload_0
/*     */       //   63: invokevirtual stack : ()Lnet/minecraft/item/ItemStack;
/*     */       //   66: invokeinterface getFluid : (Lnet/minecraft/item/ItemStack;)Lnet/minecraftforge/fluids/FluidStack;
/*     */       //   71: getfield amount : I
/*     */       //   74: if_icmpge -> 81
/*     */       //   77: iconst_1
/*     */       //   78: goto -> 82
/*     */       //   81: iconst_0
/*     */       //   82: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #155	-> 0
/*     */       //   #156	-> 20
/*     */       //   #157	-> 81
/*     */       //   #155	-> 82
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	83	0	this	Lli/cil/oc/util/FluidContainerUtils$FluidContainerItemWrapper;
/*     */       //   0	83	1	from	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   0	83	2	fluid	Lnet/minecraftforge/fluids/Fluid;
/*     */     }
/*     */ 
/*     */     
/*     */     public FluidTankInfo[] getTankInfo(ForgeDirection from) {
/* 161 */       (new FluidTankInfo[1])[0] = new FluidTankInfo(fluidContainerItem().getFluid(stack()), fluidContainerItem().getCapacity(stack())); return new FluidTankInfo[1];
/*     */     }
/*     */     public ItemStack getResult() {
/* 164 */       return stack();
/*     */     } }
/*     */   public static class ReplayableFluidHandler implements IFluidHandler { private final IFluidHandler handler; private final boolean simulate;
/* 167 */     public IFluidHandler handler() { return this.handler; } public boolean simulate() { return this.simulate; }
/* 168 */      private List<Function1<IFluidHandler, BoxedUnit>> actions = scala.collection.immutable.List$.MODULE$.empty(); public List<Function1<IFluidHandler, BoxedUnit>> actions() { return this.actions; } public void actions_$eq(List<Function1<IFluidHandler, BoxedUnit>> x$1) { this.actions = x$1; }
/*     */ 
/*     */     
/* 171 */     public void replay(IFluidHandler handler) { actions().foreach((Function1)new FluidContainerUtils$ReplayableFluidHandler$$anonfun$replay$1(this, handler)); } public final class FluidContainerUtils$ReplayableFluidHandler$$anonfun$replay$1 extends AbstractFunction1<Function1<IFluidHandler, BoxedUnit>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IFluidHandler handler$1; public final void apply(Function1 action) { action.apply(this.handler$1); }
/*     */       
/*     */       public FluidContainerUtils$ReplayableFluidHandler$$anonfun$replay$1(FluidContainerUtils.ReplayableFluidHandler $outer, IFluidHandler handler$1) {} }
/*     */     public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
/* 175 */       actions_$eq((List<Function1<IFluidHandler, BoxedUnit>>)actions().$plus$colon(new FluidContainerUtils$ReplayableFluidHandler$$anonfun$fill$1(this, from, resource, doFill), scala.collection.immutable.List$.MODULE$.canBuildFrom()));
/*     */ 
/*     */ 
/*     */       
/* 179 */       return handler().fill(from, resource, (doFill && !simulate()));
/*     */     } public final class FluidContainerUtils$ReplayableFluidHandler$$anonfun$fill$1 extends AbstractFunction1<IFluidHandler, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final ForgeDirection from$1; private final FluidStack resource$1; private final boolean doFill$1; public FluidContainerUtils$ReplayableFluidHandler$$anonfun$fill$1(FluidContainerUtils.ReplayableFluidHandler $outer, ForgeDirection from$1, FluidStack resource$1, boolean doFill$1) {} public final void apply(IFluidHandler h) {
/*     */         h.fill(this.from$1, this.resource$1, this.doFill$1);
/*     */       } }
/* 184 */     public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) { actions_$eq((List<Function1<IFluidHandler, BoxedUnit>>)actions().$plus$colon(new FluidContainerUtils$ReplayableFluidHandler$$anonfun$drain$1(this, from, resource, doDrain), scala.collection.immutable.List$.MODULE$.canBuildFrom()));
/*     */ 
/*     */ 
/*     */       
/* 188 */       return handler().drain(from, resource, (doDrain && !simulate())); } public final class FluidContainerUtils$ReplayableFluidHandler$$anonfun$drain$1 extends AbstractFunction1<IFluidHandler, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final ForgeDirection from$2; private final FluidStack resource$2; private final boolean doDrain$1; public FluidContainerUtils$ReplayableFluidHandler$$anonfun$drain$1(FluidContainerUtils.ReplayableFluidHandler $outer, ForgeDirection from$2, FluidStack resource$2, boolean doDrain$1) {} public final void apply(IFluidHandler h) {
/*     */         h.drain(this.from$2, this.resource$2, this.doDrain$1);
/*     */       } }
/* 192 */     public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) { actions_$eq((List<Function1<IFluidHandler, BoxedUnit>>)actions().$plus$colon(new FluidContainerUtils$ReplayableFluidHandler$$anonfun$drain$2(this, from, maxDrain, doDrain), scala.collection.immutable.List$.MODULE$.canBuildFrom()));
/*     */ 
/*     */ 
/*     */       
/* 196 */       return handler().drain(from, maxDrain, (doDrain && !simulate())); } public final class FluidContainerUtils$ReplayableFluidHandler$$anonfun$drain$2 extends AbstractFunction1<IFluidHandler, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; private final ForgeDirection from$3; private final int maxDrain$1; private final boolean doDrain$2; public FluidContainerUtils$ReplayableFluidHandler$$anonfun$drain$2(FluidContainerUtils.ReplayableFluidHandler $outer, ForgeDirection from$3, int maxDrain$1, boolean doDrain$2) {} public final void apply(IFluidHandler h) {
/*     */         h.drain(this.from$3, this.maxDrain$1, this.doDrain$2);
/*     */       } } public boolean canFill(ForgeDirection from, Fluid fluid) {
/* 200 */       return handler().canFill(from, fluid);
/*     */     }
/*     */     
/*     */     public boolean canDrain(ForgeDirection from, Fluid fluid) {
/* 204 */       return handler().canDrain(from, fluid);
/*     */     }
/*     */     
/*     */     public FluidTankInfo[] getTankInfo(ForgeDirection from) {
/* 208 */       return handler().getTankInfo(from);
/*     */     }
/*     */     
/*     */     public ReplayableFluidHandler(IFluidHandler handler, boolean simulate) {} }
/*     */ 
/*     */   
/*     */   public static class ReplayableFluidHandler$ {
/*     */     public static final ReplayableFluidHandler$ MODULE$;
/*     */     
/*     */     public boolean $lessinit$greater$default$2() {
/*     */       return true;
/*     */     }
/*     */     
/*     */     public ReplayableFluidHandler$() {
/*     */       MODULE$ = this;
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface ContainerWrapper extends IFluidHandler {
/*     */     ItemStack getResult();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\o\\util\FluidContainerUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */