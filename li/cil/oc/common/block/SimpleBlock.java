/*     */ package li.cil.oc.common.block;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.common.tileentity.traits.Colored;
/*     */ import li.cil.oc.common.tileentity.traits.Rotatable;
/*     */ import li.cil.oc.util.Color$;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.util.Vec3;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\021mc\001B\001\003\0015\0211bU5na2,'\t\\8dW*\0211\001B\001\006E2|7m\033\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\021\001A\004\t\003\037Ui\021\001\005\006\003\007EQ!AE\n\002\0235Lg.Z2sC\032$(\"\001\013\002\0079,G/\003\002\027!\t)!\t\\8dW\"A\001\004\001B\001B\003%\021$\001\005nCR,'/[1m!\tQB$D\001\034\025\tA\002#\003\002\0367\tAQ*\031;fe&\fG\016C\003 \001\021\005\001%\001\004=S:LGO\020\013\003C\r\002\"A\t\001\016\003\tAq\001\007\020\021\002\003\007\021\004C\004&\001\001\007I\021\001\024\002\035MDwn^%o\023R,W\016T5tiV\tq\005\005\002)W5\t\021FC\001+\003\025\0318-\0317b\023\ta\023FA\004C_>dW-\0318\t\0179\002\001\031!C\001_\005\0212\017[8x\023:LE/Z7MSN$x\fJ3r)\t\0014\007\005\002)c%\021!'\013\002\005+:LG\017C\0045[\005\005\t\031A\024\002\007a$\023\007\003\0047\001\001\006KaJ\001\020g\"|w/\0238Ji\026lG*[:uA!9\001\b\001b\001\n#I\024a\004<bY&$'k\034;bi&|gn]0\026\003i\0022\001K\036>\023\ta\024FA\003BeJ\f\027\020\005\002?\t6\tqH\003\002A\003\006!Q\017^5m\025\t)!I\003\002D'\005qQ.\0338fGJ\fg\r\0364pe\036,\027BA#@\00591uN]4f\t&\024Xm\031;j_:Daa\022\001!\002\023Q\024\001\005<bY&$'k\034;bi&|gn]0!\021\025I\005\001\"\001K\003=\031'/Z1uK&#X-\\*uC\016\\GCA&R!\tau*D\001N\025\tq\025#\001\003ji\026l\027B\001)N\005%IE/Z7Ti\006\0347\016C\004S\021B\005\t\031A*\002\r\005lw.\0368u!\tAC+\003\002VS\t\031\021J\034;\t\017]\003!\031!C\0011\006)\021nY8ogV\t\021\fE\002)wi\003\"aW/\016\003qS!\001Q\t\n\005yc&!B%JG>t\007B\0021\001A\003%\021,\001\004jG>t7\017\t\005\006E\002!\tbY\001\017GV\034Ho\\7UKb$XO]3t+\005!\007c\001\025<KB\031\001F\0325\n\005\035L#AB(qi&|g\016\005\002jY:\021\001F[\005\003W&\na\001\025:fI\0264\027BA7o\005\031\031FO]5oO*\0211.\013\005\006a\002!\t%]\001\016O\026$(+\0328eKJ$\026\020]3\025\003MCQa\035\001\005BQ\fqbY8m_JlU\017\034;ja2LWM\035\013\007'Vdh0!\001\t\013Y\024\b\031A<\002\013]|'\017\0343\021\005aTX\"A=\013\005Y\f\022BA>z\0051I%\t\\8dW\006\0337-Z:t\021\025i(\0171\001T\003\005A\b\"B@s\001\004\031\026!A=\t\r\005\r!\0171\001T\003\005Q\bf\002:\002\b\005}\021\021\005\t\005\003\023\tY\"\004\002\002\f)!\021QBA\b\003)\021X\r\\1v]\016DWM\035\006\005\003#\t\031\"A\002g[2TA!!\006\002\030\005!Qn\0343t\025\t\tI\"A\002da^LA!!\b\002\f\tA1+\0333f\037:d\0270A\003wC2,X\r\n\002\002$%!\021QEA\024\003\031\031E*S#O)*!\021\021FA\006\003\021\031\026\016Z3\t\017\0055\002\001\"\022\0020\0059q-\032;JG>tG#\002.\0022\005U\002bBA\032\003W\001\raU\001\005g&$W\rC\004\0028\005-\002\031A*\002\0215,G/\0313bi\006D\003\"a\013\002\b\005}\021\021\005\005\b\003[\001A\021AA\037)\025Q\026qHA!\021\035\t\031$a\017A\002uBq!a\016\002<\001\0071\013\013\005\002<\005\035\021qDA\021\021\035\ti\003\001C#\003\017\"2BWA%\003\027\ni%a\024\002R!1a/!\022A\002]Da!`A#\001\004\031\006BB@\002F\001\0071\013C\004\002\004\005\025\003\031A*\t\017\005M\022Q\ta\001'\"B\021QIA\004\003?\t\t\003C\004\002.\001!\t!a\026\025\033i\013I&a\027\002^\005}\023\021MA3\021\0311\030Q\013a\001o\"1Q0!\026A\002MCaa`A+\001\004\031\006bBA\002\003+\002\ra\025\005\b\003G\n)\0061\001>\003)9Gn\0342bYNKG-\032\005\b\003O\n)\0061\001>\003%awnY1m'&$W\r\013\005\002V\005\035\021qDA\021\021\035\ti\007\001C!\003_\n!C]3hSN$XM\035\"m_\016\\\027jY8ogR\031\001'!\035\t\021\005M\0241\016a\001\003k\nA\"[2p]J+w-[:uKJ\004B!a\036\002\0066\021\021\021\020\006\005\003w\ni(A\004uKb$XO]3\013\t\005}\024\021Q\001\te\026tG-\032:fe*\031\0211Q\t\002\r\rd\027.\0328u\023\021\t9)!\037\003\033%K5m\0348SK\036L7\017^3sQ!\tY'a\002\002 \005\005\002bBAG\001\021\005\021qR\001\016aJ,\027\n^3n%\026tG-\032:\025\007A\n\t\nC\004\0028\005-\005\031A*)\021\005-\025qAA\020\003CAq!a&\001\t\013\nI*A\016tKR\024En\\2l\005>,h\016Z:G_JLE/Z7SK:$WM\035\013\002a!9\021q\023\001\005\002\005uEc\001\031\002 \"9\021qGAN\001\004\031\006bBAR\001\021\025\023QU\001\025g\"|W\017\0343TS\022,')\032*f]\022,'/\0323\025\027\035\n9+!+\002,\0065\026q\026\005\007m\006\005\006\031A<\t\ru\f\t\0131\001T\021\031y\030\021\025a\001'\"9\0211AAQ\001\004\031\006bBA\032\003C\003\ra\025\005\b\003G\003A\021AAZ)-9\023QWA\\\003s\013Y,!0\t\rY\f\t\f1\001x\021\031i\030\021\027a\001'\"1q0!-A\002MCq!a\001\0022\002\0071\013C\004\0024\005E\006\031A\037\t\017\005\005\007\001\"\001\002D\0061!/\031:jif$B!!2\002LB\031A*a2\n\007\005%WJ\001\006F]Vl'+\031:jifDq!!4\002@\002\0071*A\003ti\006\0347\016C\004\002R\002!\t!a5\002\035\005$G-\0238g_Jl\027\r^5p]RY\001'!6\002X\006e\0271^A\021\035\t9$a4A\002MCq!!4\002P\002\0071\n\003\005\002\\\006=\007\031AAo\003\031\001H.Y=feB!\021q\\At\033\t\t\tO\003\003\002\\\006\r(bAAs#\0051QM\034;jifLA!!;\002b\naQI\034;jif\004F.Y=fe\"A\021Q^Ah\001\004\ty/A\004u_>dG/\0339\021\013\005E\030\021 5\016\005\005M(b\001!\002v*\021\021q_\001\005U\0064\030-\003\003\002|\006M(\001\002'jgRDq!a@\002P\002\007q%\001\005bIZ\fgnY3eQ!\ty-a\002\002 \005\005\002b\002B\003\001\021E!qA\001\fi>|G\016^5q\021\026\fG\rF\0061\005\023\021YA!\004\003\020\tE\001bBA\034\005\007\001\ra\025\005\b\003\033\024\031\0011\001L\021!\tYNa\001A\002\005u\007\002CAw\005\007\001\r!a<\t\017\005}(1\001a\001O!9!Q\003\001\005\022\t]\021a\003;p_2$\030\016\035\"pIf$2\002\rB\r\0057\021iBa\b\003\"!9\021q\007B\n\001\004\031\006bBAg\005'\001\ra\023\005\t\0037\024\031\0021\001\002^\"A\021Q\036B\n\001\004\ty\017C\004\002\000\nM\001\031A\024\t\017\t\025\002\001\"\005\003(\005YAo\\8mi&\004H+Y5m)-\001$\021\006B\026\005[\021yC!\r\t\017\005]\"1\005a\001'\"9\021Q\032B\022\001\004Y\005\002CAn\005G\001\r!!8\t\021\0055(1\005a\001\003_Dq!a@\003$\001\007q\005C\004\0036\001!\tAa\016\002\023\035,GOR1dS:<G#C\037\003:\tm\"Q\bB \021\0311(1\007a\001o\"1QPa\rA\002MCaa B\032\001\004\031\006bBA\002\005g\001\ra\025\005\b\005\007\002A\021\001B#\003%\031X\r\036$bG&tw\rF\006(\005\017\022yE!\025\003T\tU\003b\002<\003B\001\007!\021\n\t\004q\n-\023b\001B's\n)qk\034:mI\"1QP!\021A\002MCaa B!\001\004\031\006bBA\002\005\003\002\ra\025\005\b\003?\021\t\0051\001>\021\035\021I\006\001C\001\0057\n\001e]3u%>$\030\r^5p]\032\023x.\\#oi&$\030\020U5uG\"\fe\016Z-boRYqE!\030\003`\t\005$1\rB3\021\0351(q\013a\001\005\023Ba! B,\001\004\031\006BB@\003X\001\0071\013C\004\002\004\t]\003\031A*\t\021\005}!q\013a\001\005O\002BA!\033\003l5\021\0211]\005\005\005[\n\031O\001\004F]RLG/\037\005\b\005c\002A\021\001B:\003\035!x\016T8dC2$2\"\020B;\005o\022IHa\037\003~!1aOa\034A\002]Da! B8\001\004\031\006BB@\003p\001\0071\013C\004\002\004\t=\004\031A*\t\017\005}!q\016a\001{!9!\021\021\001\005B\t\r\025aC5t'&$WmU8mS\022$2b\nBC\005\017\023IIa#\003\016\"1aOa A\002]Da! B@\001\004\031\006BB@\003\000\001\0071\013C\004\002\004\t}\004\031A*\t\017\005M\"q\020a\001{!9!\021\023\001\005B\tM\025aD2b]\"\013'O^3ti\ncwnY6\025\013\035\022)Ja&\t\021\005m'q\022a\001\003;DqA!'\003\020\002\0071+\001\003nKR\f\007b\002BO\001\021\005#qT\001\026G\006t')\032*fa2\f7-\0323Cs2+\027M^3t)%9#\021\025BR\005K\0239\013\003\004w\0057\003\ra\036\005\007{\nm\005\031A*\t\r}\024Y\n1\001T\021\035\t\031Aa'A\002MCqAa+\001\t\003\022i+\001\tdC:\034%/Z1ukJ,7\013]1x]RYqEa,\003:\nm&Q\030B`\021!\021\tL!+A\002\tM\026\001C2sK\006$XO]3\021\t\t%$QW\005\005\005o\013\031O\001\tF]Vl7I]3biV\024X\rV=qK\"1aO!+A\002]Da! BU\001\004\031\006BB@\003*\002\0071\013C\004\002\004\t%\006\031A*\t\017\t\r\007\001\"\021\003F\006\tr-\032;WC2LGMU8uCRLwN\\:\025\023i\0229M!3\003L\n5\007b\002<\003B\002\007!\021\n\005\007{\n\005\007\031A*\t\r}\024\t\r1\001T\021\035\t\031A!1A\002MCqA!5\001\t\003\022\031.A\tp]\ncwnY6Qe\026$Um\035;s_f$2\002\rBk\005/\024INa7\003^\"9aOa4A\002\t%\003BB?\003P\002\0071\013\003\004\000\005\037\004\ra\025\005\b\003\007\021y\r1\001T\021\035\t9Da4A\002MCqA!9\001\t\003\022\031/A\006s_R\fG/\032\"m_\016\\GcC\024\003f\n\035(\021\036Bv\005[DqA\036Bp\001\004\021I\005\003\004~\005?\004\ra\025\005\007\n}\007\031A*\t\017\005\r!q\034a\001'\"9!q\036Bp\001\004i\024\001B1ySNDqAa=\001\t\003\022)0A\007sK\016|Gn\\;s\0052|7m\033\013\016O\t](\021 B~\005{\024yp!\001\t\017Y\024\t\0201\001\003J!1QP!=A\002MCaa By\001\004\031\006bBA\002\005c\004\ra\025\005\b\003g\021\t\0201\001>\021\035\031\031A!=A\002M\013aaY8m_V\024\bbBB\004\001\021\0253\021B\001\033g\026$(\t\\8dW\n{WO\0343t\005\006\034X\rZ(o'R\fG/\032\013\na\r-1QBB\b\007#AaA^B\003\001\0049\bBB?\004\006\001\0071\013\003\004\000\007\013\001\ra\025\005\b\003\007\031)\0011\001T\021\035\031)\002\001C\t\007/\tA\004Z8TKR\024En\\2l\005>,h\016Z:CCN,Gm\0248Ti\006$X\rF\0051\0073\031Yb!\b\004 !1aoa\005A\002]Da!`B\n\001\004\031\006BB@\004\024\001\0071\013C\004\002\004\rM\001\031A*\t\017\r\r\002\001\"\005\004&\005q1/\032;CY>\0347NQ8v]\022\034Hc\001\031\004(!A1\021FB\021\001\004\031Y#\001\004c_VtGm\035\t\0047\0165\022bAB\0309\ni\021\t_5t\0032LwM\\3e\005\nCqaa\r\001\t\003\032)$A\td_2d\027n]5p]J\013\027\020\026:bG\026$bba\016\004>\r}2\021IB\"\007\013\032y\005E\002\\\007sI1aa\017]\005QiuN^5oO>\023'.Z2u!>\034\030\016^5p]\"9ao!\rA\002\t%\003BB?\0042\001\0071\013\003\004\000\007c\001\ra\025\005\b\003\007\031\t\0041\001T\021!\0319e!\rA\002\r%\023!B:uCJ$\bcA.\004L%\0311Q\n/\003\tY+7m\r\005\t\007#\032\t\0041\001\004J\005\031QM\0343\t\017\rU\003\001\"\021\004X\005yr-\032;D_2d\027n]5p]\n{WO\0343j]\036\024u\016\037$s_6\004vn\0347\025\025\r-2\021LB.\007;\032y\006C\004w\007'\002\rA!\023\t\ru\034\031\0061\001T\021\031y81\013a\001'\"9\0211AB*\001\004\031\006bBB2\001\021E1QM\001\nS:$XM]:fGR$bba\016\004h\r%41NB7\007_\032\t\bC\004w\007C\002\rA!\023\t\ru\034\t\0071\001T\021\031y8\021\ra\001'\"9\0211AB1\001\004\031\006\002CB$\007C\002\ra!\023\t\021\rE3\021\ra\001\007\023Bqa!\036\001\t\013\0329(A\ndC:\004F.Y2f\0052|7m[(o'&$W\rF\006(\007s\032Yh! \004\000\r\005\005b\002<\004t\001\007!\021\n\005\007{\016M\004\031A*\t\r}\034\031\b1\001T\021\035\t\031aa\035A\002MCq!a\r\004t\001\0071\013C\004\004v\001!\ta!\"\025\027\035\0329i!#\004\f\01655q\022\005\bm\016\r\005\031\001B%\021\031i81\021a\001'\"1qpa!A\002MCq!a\001\004\004\002\0071\013C\004\0024\r\r\005\031A\037\t\017\rM\005\001\"\022\004\026\006\0212-\0318D_:tWm\031;SK\022\034Ho\0348f)-93qSBM\0077\033ija(\t\rY\034\t\n1\001x\021\031i8\021\023a\001'\"1qp!%A\002MCq!a\001\004\022\002\0071\013C\004\0024\rE\005\031A*\t\017\rM\005\001\"\001\004$RYqe!*\004(\016%61VBW\021\03118\021\025a\001o\"1Qp!)A\002MCaa`BQ\001\004\031\006bBA\002\007C\003\ra\025\005\b\003g\031\t\0131\001>\021\035\031\t\f\001C#\007g\013a#[:Qe>4\030\016Z5oON#(o\0348h!><XM\035\013\f'\016U6qWB]\007w\033i\f\003\004w\007_\003\ra\036\005\007{\016=\006\031A*\t\r}\034y\0131\001T\021\035\t\031aa,A\002MCq!a\r\0040\002\0071\013C\004\0042\002!\ta!1\025\027M\033\031m!2\004H\016%71\032\005\007m\016}\006\031A<\t\ru\034y\f1\001T\021\031y8q\030a\001'\"9\0211AB`\001\004\031\006bBA\032\007\003\r!\020\005\b\007\037\004AQIBi\003QI7\017\025:pm&$\027N\\4XK\006\\\007k\\<feRY1ka5\004V\016]7\021\\Bn\021\03118Q\032a\001o\"1Qp!4A\002MCaa`Bg\001\004\031\006bBA\002\007\033\004\ra\025\005\b\003g\031i\r1\001T\021\035\031y\r\001C\001\007?$2bUBq\007G\034)oa:\004j\"1ao!8A\002]Da!`Bo\001\004\031\006BB@\004^\002\0071\013C\004\002\004\ru\007\031A*\t\017\005M2Q\034a\001{!91Q\036\001\005B\r=\030\001E8o\0052|7m[!di&4\030\r^3e)M93\021_Bz\007k\0349p!?\004|\016uHq\001C\006\021\035181\036a\001\005\023Ba!`Bv\001\004\031\006BB@\004l\002\0071\013C\004\002\004\r-\b\031A*\t\021\005m71\036a\001\003;Dq!a\r\004l\002\0071\013\003\005\004\000\016-\b\031\001C\001\003\021A\027\016\036-\021\007!\"\031!C\002\005\006%\022QA\0227pCRD\001\002\"\003\004l\002\007A\021A\001\005Q&$\030\f\003\005\005\016\r-\b\031\001C\001\003\021A\027\016\036.\t\017\r5\b\001\"\001\005\022Q\031r\005b\005\005\026\021]A\021\004C\016\t;!y\002\"\t\005$!9a\017b\004A\002\t%\003BB?\005\020\001\0071\013\003\004\000\t\037\001\ra\025\005\b\003\007!y\0011\001T\021!\tY\016b\004A\002\005u\007bBA\032\t\037\001\r!\020\005\t\007$y\0011\001\005\002!AA\021\002C\b\001\004!\t\001\003\005\005\016\021=\001\031\001C\001\021%!9\003AI\001\n\003!I#A\rde\026\fG/Z%uK6\034F/Y2lI\021,g-Y;mi\022\nTC\001C\026U\r\031FQF\026\003\t_\001B\001\"\r\005<5\021A1\007\006\005\tk!9$A\005v]\016DWmY6fI*\031A\021H\025\002\025\005tgn\034;bi&|g.\003\003\005>\021M\"!E;oG\",7m[3e-\006\024\030.\0318dK\036IA\021\t\002\002\002#\005A1I\001\f'&l\007\017\\3CY>\0347\016E\002#\t\0132\001\"\001\002\002\002#\005AqI\n\005\t\013\"I\005E\002)\t\027J1\001\"\024*\005\031\te.\037*fM\"9q\004\"\022\005\002\021ECC\001C\"\021)!)\006\"\022\022\002\023\005AqK\001\034I1,7o]5oSR$sM]3bi\026\024H\005Z3gCVdG\017J\031\026\005\021e#fA\r\005.\001")
/*     */ public class SimpleBlock extends Block {
/*     */   private boolean showInItemList;
/*     */   
/*  28 */   public SimpleBlock(Material material) { super(material);
/*  29 */     func_149711_c(2.0F);
/*  30 */     func_149752_b(5.0F);
/*  31 */     func_149647_a((CreativeTabs)CreativeTab$.MODULE$);
/*     */     
/*  33 */     this.showInItemList = true;
/*     */     
/*  35 */     (new ForgeDirection[2])[0] = ForgeDirection.UP; (new ForgeDirection[2])[1] = ForgeDirection.DOWN; this.validRotations_ = new ForgeDirection[2];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  43 */     this.icons = new IIcon[6]; } private final ForgeDirection[] validRotations_; private final IIcon[] icons; public boolean showInItemList() { return this.showInItemList; } public void showInItemList_$eq(boolean x$1) { this.showInItemList = x$1; } public ForgeDirection[] validRotations_() { return this.validRotations_; } public ItemStack createItemStack(int amount) { return new ItemStack(this, amount); } public int createItemStack$default$1() { return 1; } public IIcon[] icons() { return this.icons; }
/*     */   
/*  45 */   public Option<String>[] customTextures() { return (Option<String>[])Array$.MODULE$.fill(6, (Function0)new SimpleBlock$$anonfun$customTextures$1(this), ClassTag$.MODULE$.apply(Option.class)); } public final class SimpleBlock$$anonfun$customTextures$1 extends AbstractFunction0<None$> implements Serializable { public static final long serialVersionUID = 0L; public final None$ apply() { return None$.MODULE$; }
/*     */      public SimpleBlock$$anonfun$customTextures$1(SimpleBlock $outer) {} } public int func_149645_b() {
/*  47 */     return Settings$.MODULE$.blockRenderId();
/*     */   }
/*     */   @SideOnly(Side.CLIENT)
/*     */   public int func_149720_d(IBlockAccess world, int x, int y, int z) { int i;
/*  51 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/*  52 */     if (tileEntity instanceof Colored) { Colored colored = (Colored)tileEntity; i = colored.color(); }
/*  53 */     else { i = func_149741_i(world.func_72805_g(x, y, z)); }
/*     */     
/*     */     return i; } @SideOnly(Side.CLIENT)
/*     */   public final IIcon func_149691_a(int side, int metadata) {
/*  57 */     return getIcon(ForgeDirection.getOrientation(side), metadata);
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public IIcon getIcon(ForgeDirection side, int metadata) {
/*  60 */     return icons()[side.ordinal()];
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public final IIcon func_149673_e(IBlockAccess world, int x, int y, int z, int side) {
/*  63 */     return getIcon(world, x, y, z, ForgeDirection.getOrientation(side), toLocal(world, x, y, z, ForgeDirection.getOrientation(side)));
/*     */   } @SideOnly(Side.CLIENT)
/*     */   public IIcon getIcon(IBlockAccess world, int x, int y, int z, ForgeDirection globalSide, ForgeDirection localSide) {
/*  66 */     return icons()[localSide.ordinal()];
/*     */   }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*  70 */   public void func_149651_a(IIconRegister iconRegister) { icons()[ForgeDirection.DOWN.ordinal()] = iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":GenericTop").toString());
/*  71 */     icons()[ForgeDirection.UP.ordinal()] = icons()[ForgeDirection.DOWN.ordinal()];
/*  72 */     icons()[ForgeDirection.NORTH.ordinal()] = iconRegister.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":GenericSide").toString());
/*  73 */     icons()[ForgeDirection.SOUTH.ordinal()] = icons()[ForgeDirection.NORTH.ordinal()];
/*  74 */     icons()[ForgeDirection.WEST.ordinal()] = icons()[ForgeDirection.NORTH.ordinal()];
/*  75 */     icons()[ForgeDirection.EAST.ordinal()] = icons()[ForgeDirection.NORTH.ordinal()];
/*     */     
/*  77 */     Option[] custom = (Option[])customTextures();
/*  78 */     Predef$.MODULE$.refArrayOps((Object[])ForgeDirection.VALID_DIRECTIONS).foreach((Function1)new SimpleBlock$$anonfun$registerBlockIcons$1(this, iconRegister, custom)); } public final class SimpleBlock$$anonfun$registerBlockIcons$1 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final IIconRegister iconRegister$1; private final Option[] custom$1; public SimpleBlock$$anonfun$registerBlockIcons$1(SimpleBlock $outer, IIconRegister iconRegister$1, Option[] custom$1) {} public final void apply(ForgeDirection side) {
/*  79 */       Option option = this.custom$1[side.ordinal()];
/*  80 */       if (option instanceof Some) { Some some = (Some)option; String name = (String)some.x();
/*  81 */         this.$outer.icons()[side.ordinal()] = this.iconRegister$1.func_94245_a(name);
/*  82 */         this.$outer.icons()[side.ordinal()] = this.iconRegister$1.func_94245_a((new StringBuilder()).append(Settings$.MODULE$.resourceDomain()).append(":").append(name).toString()); BoxedUnit boxedUnit = name.contains(":") ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*  83 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     } }
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void preItemRender(int metadata) {}
/*     */   
/*     */   public final void func_149683_g() {
/*  91 */     setBlockBoundsForItemRender(0);
/*     */   } public void setBlockBoundsForItemRender(int metadata) {
/*  93 */     super.func_149683_g();
/*     */   } public final boolean func_149646_a(IBlockAccess world, int x, int y, int z, int side) {
/*  95 */     return shouldSideBeRendered(world, x, y, z, ForgeDirection.getOrientation(side));
/*     */   } public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/*  97 */     return super.func_149646_a(world, x, y, z, side.ordinal());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public EnumRarity rarity(ItemStack stack) {
/* 103 */     return EnumRarity.common;
/*     */   }
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void addInformation(int metadata, ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
/* 107 */     tooltipHead(metadata, stack, player, tooltip, advanced);
/* 108 */     tooltipBody(metadata, stack, player, tooltip, advanced);
/* 109 */     tooltipTail(metadata, stack, player, tooltip, advanced);
/*     */   }
/*     */ 
/*     */   
/*     */   public void tooltipHead(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {}
/*     */   
/*     */   public void tooltipBody(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/* 116 */     tooltip.addAll(Tooltip$.MODULE$.get(getClass().getSimpleName(), (Seq)Predef$.MODULE$.genericWrapArray(new Object[0])));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void tooltipTail(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public ForgeDirection getFacing(IBlockAccess world, int x, int y, int z) {
/*     */     ForgeDirection forgeDirection;
/* 127 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 128 */     if (tileEntity instanceof Rotatable) { Rotatable rotatable = (Rotatable)tileEntity; forgeDirection = rotatable.facing(); }
/* 129 */     else { forgeDirection = ForgeDirection.UNKNOWN; }
/*     */     
/*     */     return forgeDirection;
/*     */   } public boolean setFacing(World world, int x, int y, int z, ForgeDirection value) { boolean bool;
/* 133 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 134 */     if (tileEntity instanceof Rotatable) { Rotatable rotatable = (Rotatable)tileEntity; rotatable.setFromFacing(value); bool = true; }
/* 135 */     else { bool = false; }
/*     */     
/*     */     return bool; }
/*     */   public boolean setRotationFromEntityPitchAndYaw(World world, int x, int y, int z, Entity value) { boolean bool;
/* 139 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 140 */     if (tileEntity instanceof Rotatable) { Rotatable rotatable = (Rotatable)tileEntity; rotatable.setFromEntityPitchAndYaw(value); bool = true; }
/* 141 */     else { bool = false; }
/*     */     
/*     */     return bool; } public ForgeDirection toLocal(IBlockAccess world, int x, int y, int z, ForgeDirection value) {
/*     */     ForgeDirection forgeDirection;
/* 145 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 146 */     if (tileEntity instanceof Rotatable) { Rotatable rotatable = (Rotatable)tileEntity; forgeDirection = rotatable.toLocal(value); }
/* 147 */     else { forgeDirection = value; }
/*     */     
/*     */     return forgeDirection;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/* 154 */     return true;
/*     */   } public boolean canHarvestBlock(EntityPlayer player, int meta) {
/* 156 */     return true;
/*     */   } public boolean canBeReplacedByLeaves(IBlockAccess world, int x, int y, int z) {
/* 158 */     return false;
/*     */   } public boolean canCreatureSpawn(EnumCreatureType creature, IBlockAccess world, int x, int y, int z) {
/* 160 */     return false;
/*     */   } public ForgeDirection[] getValidRotations(World world, int x, int y, int z) {
/* 162 */     return validRotations_();
/*     */   }
/*     */   public void func_149725_f(World world, int x, int y, int z, int metadata) {
/* 165 */     if (!world.field_72995_K) { TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 166 */       if (tileEntity instanceof Inventory) { Inventory inventory = (Inventory)tileEntity; inventory.dropAllSlots(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 167 */       else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */        }
/*     */   
/*     */   }
/*     */   
/*     */   public boolean rotateBlock(World world, int x, int y, int z, ForgeDirection axis) {
/* 173 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 174 */     if (tileEntity instanceof Rotatable) { Rotatable rotatable = (Rotatable)tileEntity; if (rotatable.rotate(axis)) {
/* 175 */         world.func_147471_g(x, y, z);
/*     */         return true;
/*     */       }  }
/*     */     
/*     */     return false;
/*     */   } public boolean recolourBlock(World world, int x, int y, int z, ForgeDirection side, int colour) {
/* 181 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 182 */     if (tileEntity instanceof Colored) { Colored colored = (Colored)tileEntity; if (colored.color() != Color$.MODULE$.byMeta(colour)) {
/* 183 */         colored.color_$eq(Color$.MODULE$.byMeta(colour));
/* 184 */         world.func_147471_g(x, y, z); return true;
/*     */       }  }
/* 186 */      return super.recolourBlock(world, x, y, z, side, colour);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final synchronized void func_149719_a(IBlockAccess world, int x, int y, int z) {
/* 196 */     doSetBlockBoundsBasedOnState(world, x, y, z);
/*     */   }
/*     */   public void doSetBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
/* 199 */     super.func_149719_a(world, x, y, z);
/*     */   }
/*     */   public void setBlockBounds(AxisAlignedBB bounds) {
/* 202 */     func_149676_a(
/* 203 */         (float)bounds.field_72340_a, 
/* 204 */         (float)bounds.field_72338_b, 
/* 205 */         (float)bounds.field_72339_c, 
/* 206 */         (float)bounds.field_72336_d, 
/* 207 */         (float)bounds.field_72337_e, 
/* 208 */         (float)bounds.field_72334_f);
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized MovingObjectPosition func_149731_a(World world, int x, int y, int z, Vec3 start, Vec3 end) {
/* 213 */     return intersect(world, x, y, z, start, end);
/*     */   }
/*     */   public synchronized AxisAlignedBB func_149668_a(World world, int x, int y, int z) {
/* 216 */     doSetBlockBoundsBasedOnState((IBlockAccess)world, x, y, z);
/* 217 */     return super.func_149668_a(world, x, y, z);
/*     */   }
/*     */   
/*     */   public MovingObjectPosition intersect(World world, int x, int y, int z, Vec3 start, Vec3 end) {
/* 221 */     return super.func_149731_a(world, x, y, z, start, end);
/*     */   }
/*     */   public final boolean func_149707_d(World world, int x, int y, int z, int side) {
/* 224 */     return canPlaceBlockOnSide(world, x, y, z, toLocal((IBlockAccess)world, x, y, z, ForgeDirection.getOrientation(side).getOpposite()));
/*     */   }
/*     */   public boolean canPlaceBlockOnSide(World world, int x, int y, int z, ForgeDirection side) {
/* 227 */     return super.func_149707_d(world, x, y, z, side.getOpposite().ordinal());
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side) {
/* 232 */     int i = side; switch (i) { default: case 3: case 2: case 1: case 0: case -1: case -2: break; }  return canConnectRedstone(world, x, y, z, 
/* 233 */         ForgeDirection.DOWN);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/* 242 */     return false;
/*     */   }
/*     */   public final int func_149748_c(IBlockAccess world, int x, int y, int z, int side) {
/* 245 */     return isProvidingStrongPower(world, x, y, z, ForgeDirection.getOrientation(side).getOpposite());
/*     */   }
/*     */   public int isProvidingStrongPower(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/* 248 */     return isProvidingWeakPower(world, x, y, z, side);
/*     */   }
/*     */   public final int func_149709_b(IBlockAccess world, int x, int y, int z, int side) {
/* 251 */     return isProvidingWeakPower(world, x, y, z, ForgeDirection.getOrientation(side).getOpposite());
/*     */   } public int isProvidingWeakPower(IBlockAccess world, int x, int y, int z, ForgeDirection side) {
/* 253 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_149727_a(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/* 259 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 260 */     if (tileEntity instanceof Colored) { Colored colored = (Colored)tileEntity; if (Color$.MODULE$.isDye(player.func_70694_bm())) {
/* 261 */         colored.color_$eq(Color$.MODULE$.dyeColor(player.func_70694_bm()));
/* 262 */         world.func_147471_g(x, y, z);
/* 263 */         colored.consumesDye() ? 
/* 264 */           player.func_70694_bm().func_77979_a(1) : BoxedUnit.UNIT; return true;
/*     */       }  }
/*     */     
/* 267 */     return onBlockActivated(world, x, y, z, player, ForgeDirection.getOrientation(side), hitX, hitY, hitZ);
/*     */   }
/*     */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/* 270 */     return false;
/*     */   }
/*     */   
/*     */   public static Material $lessinit$greater$default$1() {
/*     */     return SimpleBlock$.MODULE$.$lessinit$greater$default$1();
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\SimpleBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */