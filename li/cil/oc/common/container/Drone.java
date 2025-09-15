/*    */ package li.cil.oc.common.container;
/*    */ 
/*    */ import net.minecraft.inventory.Slot;
/*    */ import scala.Predef$;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005\rb\001B\001\003\0015\021Q\001\022:p]\026T!a\001\003\002\023\r|g\016^1j]\026\024(BA\003\007\003\031\031w.\\7p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\005\001q\001CA\b\021\033\005\021\021BA\t\003\005\031\001F.Y=fe\"I1\003\001B\001B\003%A\003I\001\020a2\f\0270\032:J]Z,g\016^8ssB\021QCH\007\002-)\021q\003G\001\007a2\f\0270\032:\013\005eQ\022AB3oi&$\030P\003\002\0349\005IQ.\0338fGJ\fg\r\036\006\002;\005\031a.\032;\n\005}1\"aD%om\026tGo\034:z!2\f\0270\032:\n\005M\001\002\002\003\022\001\005\013\007I\021A\022\002\013\021\024xN\\3\026\003\021\002\"!J\024\016\003\031R!!\007\003\n\005\0051\003\002C\025\001\005\003\005\013\021\002\023\002\r\021\024xN\\3!\021\025Y\003\001\"\001-\003\031a\024N\\5u}Q\031QFL\030\021\005=\001\001\"B\n+\001\004!\002\"\002\022+\001\004!\003bB\031\001\005\004%\tAM\001\007I\026dG/Y-\026\003M\002\"\001N\034\016\003UR\021AN\001\006g\016\fG.Y\005\003qU\0221!\0238u\021\031Q\004\001)A\005g\0059A-\0327uCf\003c\001\002\037\001\001u\022Q\"\0238wK:$xN]=TY>$8CA\036?!\tyq(\003\002A\005\t\0312\013^1uS\016\034u.\0349p]\026tGo\0257pi\"I1a\017B\001B\003%aBQ\005\003\007}B\001\002R\036\003\002\003\006I!R\001\nS:4XM\034;pef\004\"A\022%\016\003\035S!\001\022\016\n\005%;%AC%J]Z,g\016^8ss\"A1j\017B\001B\003%1'A\003j]\022,\007\020\003\005Nw\t\005\t\025!\0034\003\005A\b\002C(<\005\003\005\013\021B\032\002\003eDQaK\036\005\002E#bA\025+V-^C\006CA*<\033\005\001\001\"B\002Q\001\004q\001\"\002#Q\001\004)\005\"B&Q\001\004\031\004\"B'Q\001\004\031\004\"B(Q\001\004\031\004\"\002.<\t\003Y\026aB5t-\006d\027\016Z\013\0029B\021A'X\005\003=V\022qAQ8pY\026\fg\016C\003aw\021\005\023-A\007gk:\034w,M\0312eMBtL\031\013\0029\"\"qlY8q!\t!W.D\001f\025\t1w-\001\006sK2\fWO\\2iKJT!\001[5\002\007\031lGN\003\002kW\006!Qn\0343t\025\005a\027aA2qo&\021a.\032\002\t'&$Wm\0248ms\006)a/\0317vK\022\n\021/\003\002sg\00611\tT%F\035RS!\001^3\002\tMKG-\032\005\006mn\"\te^\001\027O\026$()Y2lOJ|WO\0343JG>t\027J\0343fqR\t\001\020\005\002zy6\t!P\003\002|5\005!Q\017^5m\023\ti(PA\003J\023\016|g\016\003\004\000w\021\005\023\021A\001\tO\026$8\013^1dWR\021\0211\001\t\005\003\013\tY!\004\002\002\b)\031\021\021\002\016\002\t%$X-\\\005\005\003\033\t9AA\005Ji\026l7\013^1dW\"a\021\021\003\001\021\002\003\005\t\021\"\001\002\024\005a\002O]8uK\016$X\r\032\023bI\022\034Fn\034;U_\016{g\016^1j]\026\024H\003BA\013\003C!B!a\006\002\036A\031a)!\007\n\007\005mqI\001\003TY>$\bBCA\020\003\037\t\t\0211\001\002\030\005\031\001\020J\031\t\023\005}\021qBA\001\002\004i\003")
/*    */ public class Drone extends Player {
/*    */   private final li.cil.oc.common.entity.Drone drone;
/*    */   private final int deltaY;
/*    */   
/* 11 */   public li.cil.oc.common.entity.Drone drone() { return this.drone; } public int deltaY() { return this.deltaY; } public Drone(InventoryPlayer playerInventory, li.cil.oc.common.entity.Drone drone) { super(playerInventory, (IInventory)drone.mainInventory());
/* 12 */     this.deltaY = 0; RichInt$.MODULE$
/*    */       
/* 14 */       .to$extension0(Predef$.MODULE$.intWrapper(0), 1).foreach$mVc$sp((Function1)new Drone$$anonfun$1(this));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 22 */     addPlayerInventorySlots(8, 66); } public final class Drone$$anonfun$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final void apply(int i) { apply$mcVI$sp(i); } public Drone$$anonfun$1(Drone $outer) {} public void apply$mcVI$sp(int i) { int y = 8 + i * this.$outer.slotSize() - this.$outer.deltaY(); RichInt$.MODULE$.to$extension0(Predef$.MODULE$.intWrapper(0), 3).foreach((Function1)new Drone$$anonfun$1$$anonfun$apply$mcVI$sp$1(this, y)); } public final class Drone$$anonfun$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1<Object, Slot> implements Serializable {
/* 24 */       public static final long serialVersionUID = 0L; private final int y$1; public Drone$$anonfun$1$$anonfun$apply$mcVI$sp$1(Drone$$anonfun$1 $outer, int y$1) {} public final Slot apply(int j) { int x = 98 + j * this.$outer.li$cil$oc$common$container$Drone$$anonfun$$$outer().slotSize(); return this.$outer.li$cil$oc$common$container$Drone$$anonfun$$$outer().protected$addSlotToContainer(this.$outer.li$cil$oc$common$container$Drone$$anonfun$$$outer(), new Drone.InventorySlot(this.$outer.li$cil$oc$common$container$Drone$$anonfun$$$outer(), this.$outer.li$cil$oc$common$container$Drone$$anonfun$$$outer(), this.$outer.li$cil$oc$common$container$Drone$$anonfun$$$outer().otherInventory(), (this.$outer.li$cil$oc$common$container$Drone$$anonfun$$$outer()).field_75151_b.size(), x, this.y$1)); } } } public class InventorySlot extends StaticComponentSlot { public InventorySlot(Drone $outer, Player container, IInventory inventory, int index, int x, int y) { super(container, inventory, index, x, y, Slot$.MODULE$.Any(), 2147483647); } public boolean isValid() {
/* 25 */       return RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), li$cil$oc$common$container$Drone$InventorySlot$$$outer().drone().mainInventory().func_70302_i_()).contains(getSlotIndex());
/*    */     } @SideOnly(Side.CLIENT)
/*    */     public boolean func_111238_b() {
/* 28 */       return (isValid() && ComponentSlot$class.func_111238_b(this));
/*    */     }
/*    */     public IIcon func_75212_b() {
/* 31 */       return isValid() ? super.func_75212_b() : 
/* 32 */         Icons$.MODULE$.get(-1);
/*    */     }
/*    */     
/*    */     public ItemStack func_75211_c() {
/* 36 */       return isValid() ? super.func_75211_c() : 
/* 37 */         null;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Drone.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */