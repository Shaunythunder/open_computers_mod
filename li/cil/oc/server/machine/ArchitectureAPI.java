/*   */ package li.cil.oc.server.machine;
/*   */ 
/*   */ 
/*   */ @ScalaSignature(bytes = "\006\001]3Q!\001\002\002\0025\021q\"\021:dQ&$Xm\031;ve\026\f\005+\023\006\003\007\021\tq!\\1dQ&tWM\003\002\006\r\00511/\032:wKJT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\t\001a\002\005\002\020%5\t\001CC\001\022\003\025\0318-\0317b\023\t\031\002C\001\004B]f\024VM\032\005\t\007\001\021)\031!C\001+U\ta\003\005\002\03075\t\001D\003\002\0043)\021!DB\001\004CBL\027B\001\017\031\005\035i\025m\0315j]\026D\001B\b\001\003\002\003\006IAF\001\t[\006\034\007.\0338fA!)\001\005\001C\001C\0051A(\0338jiz\"\"A\t\023\021\005\r\002Q\"\001\002\t\013\ry\002\031\001\f\t\013\031\002A\021C\024\002\t9|G-Z\013\002QA\021\021\006L\007\002U)\0211&G\001\b]\026$xo\034:l\023\ti#F\001\003O_\022,\007\"B\030\001\t#\001\024AC2p[B|g.\0328ugV\t\021\007\005\0033oeJT\"A\032\013\005Q*\024\001B;uS2T\021AN\001\005U\0064\030-\003\0029g\t\031Q*\0319\021\005ijT\"A\036\013\005q*\024\001\0027b]\036L!AP\036\003\rM#(/\0338h\021\025\001\005A\"\001B\003)Ig.\033;jC2L'0\032\013\002\005B\021qbQ\005\003\tB\021A!\0268ji\")a\t\001C\001\017\006!An\\1e)\t\021\005\nC\003J\013\002\007!*A\002oER\004\"aS)\016\0031S!!S'\013\0059{\025!C7j]\026\034'/\0314u\025\005\001\026a\0018fi&\021!\013\024\002\017\035\n#F+Y4D_6\004x.\0368e\021\025!\006\001\"\001V\003\021\031\030M^3\025\005\t3\006\"B%T\001\004Q\005")
/*   */ public abstract class ArchitectureAPI {
/* 6 */   public Machine machine() { return this.machine; } private final Machine machine; public ArchitectureAPI(Machine machine) {} public Node node() {
/* 7 */     return machine().node();
/*   */   } public Map<String, String> components() {
/* 9 */     return machine().components();
/*   */   }
/*   */   
/*   */   public void load(NBTTagCompound nbt) {}
/*   */   
/*   */   public void save(NBTTagCompound nbt) {}
/*   */   
/*   */   public abstract void initialize();
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\ArchitectureAPI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */