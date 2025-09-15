/*    */ package li.cil.oc.common.container;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005mbaB\001\003!\003\r\t!\004\002\016\007>l\007o\0348f]R\034Fn\034;\013\005\r!\021!C2p]R\f\027N\\3s\025\t)a!\001\004d_6lwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011C\001\001\017!\tya#D\001\021\025\t\t\"#A\005j]Z,g\016^8ss*\0211\003F\001\n[&tWm\031:bMRT\021!F\001\004]\026$\030BA\f\021\005\021\031Fn\034;\t\013e\001A\021\001\016\002\r\021Jg.\033;%)\005Y\002C\001\017 \033\005i\"\"\001\020\002\013M\034\027\r\\1\n\005\001j\"\001B+oSRDQa\001\001\007\002\t*\022a\t\t\003I\025j\021AA\005\003M\t\021a\001\0257bs\026\024\b\"\002\025\001\r\003I\023\001B:m_R,\022A\013\t\003W9r!\001\b\027\n\0055j\022A\002)sK\022,g-\003\0020a\t11\013\036:j]\036T!!L\017\t\013I\002a\021A\032\002\tQLWM]\013\002iA\021A$N\005\003mu\0211!\0238u\021\025A\004A\"\001:\003!!\030.\032:JG>tW#\001\036\021\005mrT\"\001\037\013\005u\022\022\001B;uS2L!a\020\037\003\013%K5m\0348\t\017\005\003\001\031!C\001\005\006q1\r[1oO\026d\025n\035;f]\026\024X#A\"\021\007q!e)\003\002F;\t1q\n\035;j_:\004B\001H$\0177%\021\001*\b\002\n\rVt7\r^5p]FBqA\023\001A\002\023\0051*\001\ndQ\006tw-\032'jgR,g.\032:`I\025\fHCA\016M\021\035i\025*!AA\002\r\0131\001\037\0232\021\031y\005\001)Q\005\007\006y1\r[1oO\026d\025n\035;f]\026\024\b\005C\003R\001\021\005#+A\007gk:\034w,M\0312eMBtL\031\013\002'B\021A\004V\005\003+v\021qAQ8pY\026\fg\016\013\003Q/\016$\007C\001-b\033\005I&B\001.\\\003)\021X\r\\1v]\016DWM\035\006\0039v\0131AZ7m\025\tqv,\001\003n_\022\034(\"\0011\002\007\r\004x/\003\002c3\nA1+\0333f\037:d\0270A\003wC2,X\rJ\001f\023\t1w-\001\004D\031&+e\n\026\006\003Qf\013AaU5eK\")!\016\001C!W\006Y\021n]%uK64\026\r\\5e)\t\031F\016C\003nS\002\007a.A\003ti\006\0347\016\005\002pe6\t\001O\003\002r%\005!\021\016^3n\023\t\031\bOA\005Ji\026l7\013^1dW\")Q\017\001C!m\006\001rN\034)jG.,\bO\022:p[Ncw\016\036\013\0057]\f\t\001C\003yi\002\007\0210\001\004qY\006LXM\035\t\003uzl\021a\037\006\003qrT!! \n\002\r\025tG/\033;z\023\ty8P\001\007F]RLG/\037)mCf,'\017C\003ni\002\007a\016C\004\002\006\001!\t%a\002\002\021A,Ho\025;bG.$2aGA\005\021\031i\0271\001a\001]\"1\021Q\002\001\005Bi\tQb\0348TY>$8\t[1oO\026$\007bBA\t\001\021E\0211C\001\017G2,\027M]%g\023:4\030\r\\5e)\rY\022Q\003\005\007q\006=\001\031A=\t\033\005e\001\001%A\002\002\003%IAUA\016\003M\031X\017]3sI\031,hnY02cE\0224\007O0c\023\t\tf\003\003\b\002 \001\001\n1!A\001\n\023\t\t#!\013\002-M,\b/\032:%_:\004\026nY6va\032\023x.\\*m_R$RaGA\022\003KA\001\"TA\017\003\003\005\r!\037\005\n\003O\ti\"!AA\0029\f1\001\037\0233\023\t)h\003\003\b\002.\001\001\n1!A\001\n\023\ty#a\r\002\035M,\b/\032:%aV$8\013^1dWR\0311$!\r\t\0215\013Y#!AA\0029L1!!\002\027\0215\t9\004\001I\001\004\003\005I\021\002\016\002:\005\0312/\0369fe\022zgn\0257pi\016C\027M\\4fI&\031\021Q\002\f")
/*    */ public interface ComponentSlot {
/*    */   Player container();
/*    */   
/*    */   String slot();
/*    */   
/*    */   int tier();
/*    */   
/*    */   IIcon tierIcon();
/*    */   
/*    */   Option<Function1<Slot, BoxedUnit>> changeListener();
/*    */   
/*    */   @TraitSetter
/*    */   void changeListener_$eq(Option<Function1<Slot, BoxedUnit>> paramOption);
/*    */   
/*    */   @SideOnly(Side.CLIENT)
/*    */   boolean func_111238_b();
/*    */   
/*    */   boolean isItemValid(ItemStack paramItemStack);
/*    */   
/*    */   void onPickupFromSlot(EntityPlayer paramEntityPlayer, ItemStack paramItemStack);
/*    */   
/*    */   void putStack(ItemStack paramItemStack);
/*    */   
/*    */   void onSlotChanged();
/*    */   
/*    */   void clearIfInvalid(EntityPlayer paramEntityPlayer);
/*    */   
/*    */   public final class ComponentSlot$$anonfun$onPickupFromSlot$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*    */     public final void apply(Object slot) {
/* 33 */       Object object = slot;
/* 34 */       if (object instanceof ComponentSlot) { Object object1 = object; ((ComponentSlot)object1).clearIfInvalid(this.player$1); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 35 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */     
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final EntityPlayer player$1;
/*    */     
/*    */     public ComponentSlot$$anonfun$onPickupFromSlot$1(ComponentSlot $outer, EntityPlayer player$1) {}
/*    */   }
/*    */   
/*    */   public final class ComponentSlot$$anonfun$onSlotChanged$1
/*    */     extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(Object slot) {
/* 50 */       Object object = slot;
/* 51 */       if (object instanceof ComponentSlot) { Object object1 = object; ((ComponentSlot)object1).clearIfInvalid((this.$outer.container().playerInventory()).field_70458_d); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 52 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*    */        } public ComponentSlot$$anonfun$onSlotChanged$1(ComponentSlot $outer) {} } public final class ComponentSlot$$anonfun$onSlotChanged$2 extends AbstractFunction1<Function1<Slot, BoxedUnit>, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Function1 x$1) {
/* 54 */       x$1.apply(this.$outer);
/*    */     }
/*    */     
/*    */     public ComponentSlot$$anonfun$onSlotChanged$2(ComponentSlot $outer) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\ComponentSlot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */