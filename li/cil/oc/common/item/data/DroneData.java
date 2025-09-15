/*    */ package li.cil.oc.common.item.data;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001-3A!\001\002\001\037\tIAI]8oK\022\013G/\031\006\003\007\021\tA\001Z1uC*\021QAB\001\005SR,WN\003\002\b\021\00511m\\7n_:T!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001'\t\001\001\003\005\002\022%5\t!!\003\002\024\005\t\031R*[2s_\016|g\016\036:pY2,'\017R1uC\")Q\003\001C\001-\0051A(\0338jiz\"\022a\006\t\003#\001AQ!\006\001\005\002e!\"a\006\016\t\013mA\002\031\001\017\002\013M$\030mY6\021\005u\031S\"\001\020\013\005\025y\"B\001\021\"\003%i\027N\\3de\0064GOC\001#\003\rqW\r^\005\003Iy\021\021\"\023;f[N#\030mY6\t\017\031\002\001\031!C\001O\005!a.Y7f+\005A\003CA\025/\033\005Q#BA\026-\003\021a\027M\\4\013\0035\nAA[1wC&\021qF\013\002\007'R\024\030N\\4\t\017E\002\001\031!C\001e\005Aa.Y7f?\022*\027\017\006\0024sA\021AgN\007\002k)\ta'A\003tG\006d\027-\003\0029k\t!QK\\5u\021\035Q\004'!AA\002!\n1\001\037\0232\021\031a\004\001)Q\005Q\005)a.Y7fA!)a\b\001C!\005!An\\1e)\t\031\004\tC\003B{\001\007!)A\002oER\004\"aQ#\016\003\021S!!Q\020\n\005\031#%A\004(C)R\013wmQ8na>,h\016\032\005\006\021\002!\t%S\001\005g\0064X\r\006\0024\025\")\021i\022a\001\005\002")
/*    */ public class DroneData extends MicrocontrollerData {
/*    */   private String name;
/*    */   
/*  8 */   public DroneData() { super("drone");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     this.name = ""; } public String name() { return this.name; } public DroneData(ItemStack stack) { this(); load(stack); } public void name_$eq(String x$1) { this.name = x$1; }
/*    */   
/*    */   public void load(NBTTagCompound nbt) {
/* 17 */     super.load(nbt);
/* 18 */     if (nbt.func_74764_b("display") && nbt.func_74775_l("display").func_74764_b("Name")) {
/* 19 */       name_$eq(nbt.func_74775_l("display").func_74779_i("Name"));
/*    */     }
/* 21 */     if (Strings.isNullOrEmpty(name())) {
/* 22 */       name_$eq(RobotData$.MODULE$.randomName());
/*    */     }
/*    */   }
/*    */   
/*    */   public void save(NBTTagCompound nbt) {
/* 27 */     super.save(nbt);
/* 28 */     if (!Strings.isNullOrEmpty(name())) {
/* 29 */       if (!nbt.func_74764_b("display")) {
/* 30 */         nbt.func_74782_a("display", (NBTBase)new NBTTagCompound());
/*    */       }
/* 32 */       nbt.func_74775_l("display").func_74778_a("Name", name());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\data\DroneData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */