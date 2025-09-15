/*    */ package li.cil.oc.common.container;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001)3A!\001\002\001\033\tAA)\031;bE\006\034XM\003\002\004\t\005I1m\0348uC&tWM\035\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\021\001A\004\t\003\037Ai\021AA\005\003#\t\021a\001\0257bs\026\024\b\"C\n\001\005\003\005\013\021\002\013!\003=\001H.Y=fe&sg/\0328u_JL\bCA\013\037\033\0051\"BA\f\031\003\031\001H.Y=fe*\021\021DG\001\007K:$\030\016^=\013\005ma\022!C7j]\026\034'/\0314u\025\005i\022a\0018fi&\021qD\006\002\020\023:4XM\034;pef\004F.Y=fe&\0211\003\005\005\nE\001\021\t\021)A\005G%\n\021\003Z1uC\n\f7/Z%om\026tGo\034:z!\t!s%D\001&\025\t1C!A\005j]Z,g\016^8ss&\021\001&\n\002\022\t\006$\030MY1tK&sg/\0328u_JL\030B\001\026\021\0039yG\017[3s\023:4XM\034;pefDQ\001\f\001\005\0025\na\001P5oSRtDc\001\0300aA\021q\002\001\005\006'-\002\r\001\006\005\006E-\002\ra\t\005\be\001\021\r\021\"\0014\003\021\021xn^:\026\003Q\002\"!\016\035\016\003YR\021aN\001\006g\016\fG.Y\005\003sY\0221!\0238u\021\031Y\004\001)A\005i\005)!o\\<tA!9Q\b\001b\001\n\003\031\024AB8gMN,G\017\003\004@\001\001\006I\001N\001\b_\03247/\032;!\021\025\t\005\001\"\021C\003=\031\027M\\%oi\026\024\030m\031;XSRDGCA\"G!\t)D)\003\002Fm\t9!i\\8mK\006t\007\"B\fA\001\0049\005CA\013I\023\tIeC\001\007F]RLG/\037)mCf,'\017")
/*    */ public class Database extends Player {
/*    */   private final int rows;
/*    */   
/*  7 */   public Database(InventoryPlayer playerInventory, DatabaseInventory databaseInventory) { super(playerInventory, (IInventory)databaseInventory);
/*  8 */     this.rows = (int)RichDouble$.MODULE$.ceil$extension(Predef$.MODULE$.doubleWrapper(package$.MODULE$.sqrt(((DatabaseInventory)otherInventory()).func_70302_i_())));
/*  9 */     (new int[3])[0] = 3; (new int[3])[1] = 2; (new int[3])[2] = 0; this.offset = 8 + (new int[3])[((DatabaseInventory)otherInventory()).tier()] * slotSize(); RichInt$.MODULE$
/*    */       
/* 11 */       .until$extension0(Predef$.MODULE$.intWrapper(0), rows()).foreach$mVc$sp((Function1)new Database$$anonfun$1(this));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     addPlayerInventorySlots(8, 174); }
/*    */   private final int offset; public int rows() { return this.rows; } public boolean func_75145_c(EntityPlayer player) {
/* 18 */     EntityPlayer entityPlayer = (playerInventory()).field_70458_d; if (player == null) { if (entityPlayer != null); } else if (player.equals(entityPlayer))
/*    */     {  }
/*    */   
/*    */   }
/*    */   
/*    */   public int offset() {
/*    */     return this.offset;
/*    */   }
/*    */   
/*    */   public final class Database$$anonfun$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(int row) {
/*    */       apply$mcVI$sp(row);
/*    */     }
/*    */     
/*    */     public void apply$mcVI$sp(int row) {
/*    */       RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), this.$outer.rows()).foreach$mVc$sp((Function1)new Database$$anonfun$1$$anonfun$apply$mcVI$sp$1(this, row));
/*    */     }
/*    */     
/*    */     public Database$$anonfun$1(Database $outer) {}
/*    */     
/*    */     public final class Database$$anonfun$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*    */       public static final long serialVersionUID = 0L;
/*    */       private final int row$1;
/*    */       
/*    */       public final void apply(int col) {
/*    */         apply$mcVI$sp(col);
/*    */       }
/*    */       
/*    */       public Database$$anonfun$1$$anonfun$apply$mcVI$sp$1(Database$$anonfun$1 $outer, int row$1) {}
/*    */       
/*    */       public void apply$mcVI$sp(int col) {
/*    */         this.$outer.li$cil$oc$common$container$Database$$anonfun$$$outer().addSlotToContainer(this.$outer.li$cil$oc$common$container$Database$$anonfun$$$outer().offset() + col * this.$outer.li$cil$oc$common$container$Database$$anonfun$$$outer().slotSize(), this.$outer.li$cil$oc$common$container$Database$$anonfun$$$outer().offset() + this.row$1 * this.$outer.li$cil$oc$common$container$Database$$anonfun$$$outer().slotSize(), this.$outer.li$cil$oc$common$container$Database$$anonfun$$$outer().addSlotToContainer$default$3(), this.$outer.li$cil$oc$common$container$Database$$anonfun$$$outer().addSlotToContainer$default$4());
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Database.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */