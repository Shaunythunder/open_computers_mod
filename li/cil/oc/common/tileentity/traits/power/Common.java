/*    */ package li.cil.oc.common.tileentity.traits.power;@ScalaSignature(bytes = "\006\001\005%baB\001\003!\003\r\t!\005\002\007\007>lWn\0348\013\005\r!\021!\0029po\026\024(BA\003\007\003\031!(/Y5ug*\021q\001C\001\013i&dW-\0328uSRL(BA\005\013\003\031\031w.\\7p]*\0211\002D\001\003_\016T!!\004\b\002\007\rLGNC\001\020\003\ta\027n\001\001\024\007\001\0212\004\005\002\02435\tAC\003\002\b+)\021acF\001\n[&tWm\031:bMRT\021\001G\001\004]\026$\030B\001\016\025\005)!\026\016\\3F]RLG/\037\t\0039ui\021\001B\005\0035\021AQa\b\001\005\002\001\na\001J5oSR$C#A\021\021\005\t*S\"A\022\013\003\021\nQa]2bY\006L!AJ\022\003\tUs\027\016\036\005\006Q\001!\t\"K\001\rQ\006\0348i\0348oK\016$xN\035\013\003U5\002\"AI\026\n\0051\032#a\002\"p_2,\027M\034\005\006]\035\002\raL\001\005g&$W\r\005\0021m5\t\021G\003\0023g\005!Q\017^5m\025\tIAG\003\0026/\005qQ.\0338fGJ\fg\r\0364pe\036,\027BA\0342\00591uN]4f\t&\024Xm\031;j_:DCaJ\035F\rB\021!hQ\007\002w)\021A(P\001\013e\026d\027-\0368dQ\026\024(B\001 @\003\r1W\016\034\006\003\001\006\013A!\\8eg*\t!)A\002da^L!\001R\036\003\021MKG-Z(oYf\fQA^1mk\026$\023aR\005\003\021&\013aa\021'J\013:#&B\001&<\003\021\031\026\016Z3\t\0131\003A\021C'\002\023\r|gN\\3di>\024HC\001(Z!\r\021s*U\005\003!\016\022aa\0249uS>t\007C\001*X\033\005\031&B\001+V\003\035qW\r^<pe.T!A\026\006\002\007\005\004\030.\003\002Y'\nI1i\0348oK\016$xN\035\005\006]-\003\ra\f\005\0067\0021\t\001X\001\021K:,'oZ=UQJ|Wo\0325qkR,\022!\030\t\003EyK!aX\022\003\r\021{WO\0317f\021\025\t\007\001\"\005c\003-!(/_!mYNKG-Z:\025\t\005\032\007.\034\005\006I\002\004\r!Z\001\taJ|g/\0333feB)!EZ/0;&\021qm\t\002\n\rVt7\r^5p]JBQ!\0331A\002)\f\021B\032:p[>#\b.\032:\021\t\tZW,X\005\003Y\016\022\021BR;oGRLwN\\\031\t\0139\004\007\031\0016\002\017Q|w\n\0365fe\")\001\017\001C\001c\006y1-\0318D_:tWm\031;Q_^,'\017\006\002+e\")af\034a\001_!)A\017\001C\001k\006yAO]=DQ\006tw-\032\"vM\032,'\017\006\003^m^L\b\"\002\030t\001\004y\003\"\002=t\001\004i\026AB1n_VtG\017C\004{gB\005\t\031\001\026\002\023\021|'+Z2fSZ,\007\"\002?\001\t\003i\030\001D4m_\n\fGNQ;gM\026\024HCA/\021\025q3\0201\0010\021\035\t\t\001\001C\001\003\007\t\001c\0327pE\006d')\0364gKJ\034\026N_3\025\007u\013)\001C\003/\002\007q\006C\004\002\n\001!\t!a\003\002\031\035dwNY1m\t\026l\027M\0343\025\007u\013i\001\003\004/\003\017\001\ra\f\005\n\003#\001\021\023!C\001\003'\t\021\004\036:z\007\"\fgnZ3Ck\0324WM\035\023eK\032\fW\017\034;%gU\021\021Q\003\026\004U\005]1FAA\r!\021\tY\"!\n\016\005\005u!\002BA\020\003C\t\021\"\0368dQ\026\0347.\0323\013\007\005\r2%\001\006b]:|G/\031;j_:LA!a\n\002\036\t\tRO\\2iK\016\\W\r\032,be&\fgnY3")
/*    */ public interface Common extends TileEntity { @SideOnly(Side.CLIENT)
/*    */   boolean hasConnector(ForgeDirection paramForgeDirection);
/*    */   
/*    */   Option<Connector> connector(ForgeDirection paramForgeDirection);
/*    */   
/*    */   double energyThroughput();
/*    */   
/*    */   void tryAllSides(Function2<Object, ForgeDirection, Object> paramFunction2, Function1<Object, Object> paramFunction11, Function1<Object, Object> paramFunction12);
/*    */   
/*    */   boolean canConnectPower(ForgeDirection paramForgeDirection);
/*    */   
/*    */   double tryChangeBuffer(ForgeDirection paramForgeDirection, double paramDouble, boolean paramBoolean);
/*    */   
/*    */   boolean tryChangeBuffer$default$3();
/*    */   
/*    */   double globalBuffer(ForgeDirection paramForgeDirection);
/*    */   
/*    */   double globalBufferSize(ForgeDirection paramForgeDirection);
/*    */   
/*    */   double globalDemand(ForgeDirection paramForgeDirection);
/*    */   
/*    */   public final class Common$$anonfun$tryAllSides$1 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable {
/*    */     public final void apply(ForgeDirection side) {
/* 25 */       double demand = this.toOther$1.apply$mcDD$sp(package$.MODULE$.min(this.budget$1.elem, this.$outer.globalDemand(side)));
/* 26 */       if (demand > true) {
/* 27 */         double energy = this.fromOther$1.apply$mcDD$sp(BoxesRunTime.unboxToDouble(this.provider$1.apply(BoxesRunTime.boxToDouble(demand), side)));
/* 28 */         if (energy > false)
/* 29 */           this.budget$1.elem -= this.$outer.tryChangeBuffer(side, energy, this.$outer.tryChangeBuffer$default$3()); 
/*    */       } 
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final DoubleRef budget$1;
/*    */     private final Function2 provider$1;
/*    */     private final Function1 fromOther$1;
/*    */     private final Function1 toOther$1;
/*    */     
/*    */     public Common$$anonfun$tryAllSides$1(Common $outer, DoubleRef budget$1, Function2 provider$1, Function1 fromOther$1, Function1 toOther$1) {}
/*    */   } }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\power\Common.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */