/*    */ package li.cil.oc.common.item.data;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\0313A!\001\002\001\037\tq\001j\034<fe\n{w\016^:ECR\f'BA\002\005\003\021!\027\r^1\013\005\0251\021\001B5uK6T!a\002\005\002\r\r|W.\\8o\025\tI!\"\001\002pG*\0211\002D\001\004G&d'\"A\007\002\0051L7\001A\n\003\001A\001\"!\005\n\016\003\tI!a\005\002\003\021%#X-\034#bi\006DQ!\006\001\005\002Y\ta\001P5oSRtD#A\f\021\005E\001\001\"B\013\001\t\003IBCA\f\033\021\025Y\002\0041\001\035\003\025\031H/Y2l!\ti2%D\001\037\025\t)qD\003\002!C\005IQ.\0338fGJ\fg\r\036\006\002E\005\031a.\032;\n\005\021r\"!C%uK6\034F/Y2l\021\0351\003\0011A\005\002\035\naa\0315be\036,W#\001\025\021\005%bS\"\001\026\013\003-\nQa]2bY\006L!!\f\026\003\r\021{WO\0317f\021\035y\003\0011A\005\002A\n!b\0315be\036,w\fJ3r)\t\tD\007\005\002*e%\0211G\013\002\005+:LG\017C\0046]\005\005\t\031\001\025\002\007a$\023\007\003\0048\001\001\006K\001K\001\bG\"\f'oZ3!\021\025I\004\001\"\021;\003\021aw.\0313\025\005EZ\004\"\002\0379\001\004i\024a\0018ciB\021a\bQ\007\002)\021AhH\005\003\003~\022aB\024\"U)\006<7i\\7q_VtG\rC\003D\001\021\005C)\001\003tCZ,GCA\031F\021\025a$\t1\001>\001")
/*    */ public class HoverBootsData extends ItemData {
/*    */   private double charge;
/*    */   
/*  8 */   public HoverBootsData() { super("hoverBoots");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     this.charge = 0.0D; } public double charge() { return this.charge; } public HoverBootsData(ItemStack stack) { this(); load(stack); } public void charge_$eq(double x$1) { this.charge = x$1; }
/*    */   
/*    */   public void load(NBTTagCompound nbt) {
/* 17 */     charge_$eq(nbt.func_74769_h((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("charge").toString()));
/*    */   }
/*    */   
/*    */   public void save(NBTTagCompound nbt) {
/* 21 */     nbt.func_74780_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("charge").toString(), charge());
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\HoverBootsData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */