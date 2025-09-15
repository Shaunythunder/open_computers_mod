/*    */ package li.cil.oc.common.block;
/*    */ 
/*    */ import li.cil.oc.Settings$;
/*    */ import li.cil.oc.client.Textures$Transposer$;
/*    */ import net.minecraft.client.renderer.texture.IIconRegister;
/*    */ import net.minecraft.tileentity.TileEntity;
/*    */ import net.minecraft.world.World;
/*    */ import scala.Option;
/*    */ import scala.Some;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005-a\001B\001\003\0015\021!\002\026:b]N\004xn]3s\025\t\031A!A\003cY>\0347N\003\002\006\r\00511m\\7n_:T!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\t\001a\002\005\002\020!5\t!!\003\002\022\005\tY1+[7qY\026\024En\\2l\021\025\031\002\001\"\001\025\003\031a\024N\\5u}Q\tQ\003\005\002\020\001!)q\003\001C)1\005q1-^:u_6$V\r\037;ve\026\034X#A\r\021\007iir$D\001\034\025\005a\022!B:dC2\f\027B\001\020\034\005\025\t%O]1z!\rQ\002EI\005\003Cm\021aa\0249uS>t\007CA\022'\035\tQB%\003\002&7\0051\001K]3eK\032L!a\n\025\003\rM#(/\0338h\025\t)3\004C\003+\001\021\0053&\001\nsK\036L7\017^3s\0052|7m[%d_:\034HC\001\0270!\tQR&\003\002/7\t!QK\\5u\021\025\001\024\0061\0012\0031I7m\0348SK\036L7\017^3s!\t\021T(D\0014\025\t!T'A\004uKb$XO]3\013\005Y:\024\001\003:f]\022,'/\032:\013\005aJ\024AB2mS\026tGO\003\002;w\005IQ.\0338fGJ\fg\r\036\006\002y\005\031a.\032;\n\005y\032$!D%JG>t'+Z4jgR,'\017\013\003*\0012k\005CA!K\033\005\021%BA\"E\003)\021X\r\\1v]\016DWM\035\006\003\013\032\0131AZ7m\025\t9\005*\001\003n_\022\034(\"A%\002\007\r\004x/\003\002L\005\nA1+\0333f\037:d\0270A\003wC2,X\rJ\001O\023\ty\005+\001\004D\031&+e\n\026\006\003#\n\013AaU5eK\")1\013\001C!)\006Y\021n]*jI\026\034v\016\\5e)\031)\006l\0303gQB\021!DV\005\003/n\021qAQ8pY\026\fg\016C\003Z%\002\007!,A\003x_JdG\r\005\002\\;6\tAL\003\002Zs%\021a\f\030\002\r\023\ncwnY6BG\016,7o\035\005\006AJ\003\r!Y\001\002qB\021!DY\005\003Gn\0211!\0238u\021\025)'\0131\001b\003\005I\b\"B4S\001\004\t\027!\001>\t\013%\024\006\031\0016\002\tMLG-\032\t\003WFl\021\001\034\006\003[:\fA!\036;jY*\021Qa\034\006\003an\na\"\\5oK\016\024\030M\032;g_J<W-\003\002sY\nqai\034:hK\022K'/Z2uS>t\007\"\002;\001\t\003*\030!\0045bgRKG.Z#oi&$\030\020\006\002Vm\")qo\035a\001C\006AQ.\032;bI\006$\030\rC\003z\001\021\005#0\001\tde\026\fG/\032+jY\026,e\016^5usR)10!\001\002\nA\021Ap`\007\002{*\021a\020B\001\013i&dW-\0328uSRL\030BA\001~\021\031I\006\0201\001\002\004A\0311,!\002\n\007\005\035ALA\003X_JdG\rC\003xq\002\007\021\r")
/*    */ public class Transposer extends SimpleBlock {
/* 13 */   public Transposer() { super(SimpleBlock$.MODULE$.$lessinit$greater$default$1()); } public Option<String>[] customTextures() {
/* 14 */     (new Option[6])[0] = 
/* 15 */       (Option)new Some("TransposerTop");
/* 16 */     (new Option[6])[1] = (Option)new Some("TransposerTop");
/* 17 */     (new Option[6])[2] = (Option)new Some("TransposerSide");
/* 18 */     (new Option[6])[3] = (Option)new Some("TransposerSide");
/* 19 */     (new Option[6])[4] = (Option)new Some("TransposerSide");
/* 20 */     (new Option[6])[5] = (Option)new Some("TransposerSide");
/*    */     return (Option<String>[])new Option[6];
/*    */   }
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void func_149651_a(IIconRegister iconRegister) {
/* 25 */     super.func_149651_a(iconRegister);
/* 26 */     Textures$Transposer$.MODULE$.iconOn_$eq(iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":TransposerOn").toString()));
/*    */   }
/*    */   public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/* 29 */     return false;
/*    */   }
/*    */   
/*    */   public boolean hasTileEntity(int metadata) {
/* 33 */     return true;
/*    */   } public li.cil.oc.common.tileentity.Transposer createTileEntity(World world, int metadata) {
/* 35 */     return new li.cil.oc.common.tileentity.Transposer();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Transposer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */