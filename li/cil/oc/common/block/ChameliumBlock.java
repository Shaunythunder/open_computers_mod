/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001U2A!\001\002\001\033\tq1\t[1nK2LW/\034\"m_\016\\'BA\002\005\003\025\021Gn\\2l\025\t)a!\001\004d_6lwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011C\001\001\017!\ty\001#D\001\003\023\t\t\"AA\006TS6\004H.\032\"m_\016\\\007\"B\n\001\t\003!\022A\002\037j]&$h\bF\001\026!\ty\001\001C\003\030\001\021E\003$\001\bdkN$x.\034+fqR,(/Z:\026\003e\0012AG\017 \033\005Y\"\"\001\017\002\013M\034\027\r\\1\n\005yY\"!B!se\006L\bc\001\016!E%\021\021e\007\002\007\037B$\030n\0348\021\005\r2cB\001\016%\023\t)3$\001\004Qe\026$WMZ\005\003O!\022aa\025;sS:<'BA\023\034\021\025Q\003\001\"\021,\00399W\r\036*f]\022,'oQ8m_J$\"\001L\030\021\005ii\023B\001\030\034\005\rIe\016\036\005\006a%\002\r\001L\001\005[\026$\030\rC\0033\001\021\0053'A\007eC6\fw-\032#s_B\004X\r\032\013\003YQBQ\001M\031A\0021\002")
/*    */ public class ChameliumBlock extends SimpleBlock {
/*  6 */   public ChameliumBlock() { super(Material.field_151576_e); } public Option<String>[] customTextures() {
/*  7 */     (new Option[6])[0] = 
/*  8 */       (Option)new Some("White");
/*  9 */     (new Option[6])[1] = (Option)new Some("White");
/* 10 */     (new Option[6])[2] = (Option)new Some("White");
/* 11 */     (new Option[6])[3] = (Option)new Some("White");
/* 12 */     (new Option[6])[4] = (Option)new Some("White");
/* 13 */     (new Option[6])[5] = (Option)new Some("White");
/*    */     return (Option<String>[])new Option[6];
/*    */   } public int func_149741_i(int meta) {
/* 16 */     return BoxesRunTime.unboxToInt(Color$.MODULE$.byOreName().apply(Color$.MODULE$.dyes()[RichInt$.MODULE$.min$extension(Predef$.MODULE$.intWrapper(RichInt$.MODULE$.max$extension(Predef$.MODULE$.intWrapper(meta), 0)), (Color$.MODULE$.dyes()).length)]));
/*    */   } public int func_149692_a(int meta) {
/* 18 */     return meta;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\ChameliumBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */