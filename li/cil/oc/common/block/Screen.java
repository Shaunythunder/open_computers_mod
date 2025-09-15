/*     */ package li.cil.oc.common.block;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.List;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.world.IBlockAccess;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.MatchError;
/*     */ import scala.Serializable;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.GenTraversableOnce;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\025ef\001B\001\003\0015\021aaU2sK\026t'BA\002\005\003\025\021Gn\\2l\025\t)a!\001\004d_6lwN\034\006\003\017!\t!a\\2\013\005%Q\021aA2jY*\t1\"\001\002mS\016\0011C\001\001\017!\ty\001#D\001\003\023\t\t\"AA\007SK\022\034Ho\0348f\003^\f'/\032\005\t'\001\021)\031!C\001)\005!A/[3s+\005)\002C\001\f\032\033\0059\"\"\001\r\002\013M\034\027\r\\1\n\005i9\"aA%oi\"AA\004\001B\001B\003%Q#A\003uS\026\024\b\005C\003\037\001\021\005q$\001\004=S:LGO\020\013\003A\005\002\"a\004\001\t\013Mi\002\031A\013\t\013\r\002A\021\t\023\002\027%\0348+\0333f'>d\027\016\032\013\007K!\032TgN\035\021\005Y1\023BA\024\030\005\035\021un\0347fC:DQ!\013\022A\002)\nQa^8sY\022\004\"aK\031\016\0031R!!K\027\013\0059z\023!C7j]\026\034'/\0314u\025\005\001\024a\0018fi&\021!\007\f\002\r\023\ncwnY6BG\016,7o\035\005\006i\t\002\r!F\001\002q\")aG\ta\001+\005\t\021\020C\0039E\001\007Q#A\001{\021\025Q$\0051\001<\003\021\031\030\016Z3\021\005q\022U\"A\037\013\005yz\024\001B;uS2T!!\002!\013\005\005{\023AD7j]\026\034'/\0314uM>\024x-Z\005\003\007v\022aBR8sO\026$\025N]3di&|g\016C\003F\001\021\005c)\001\bhKR\024VM\0343fe\016{Gn\034:\025\005U9\005\"\002%E\001\004)\022\001C7fi\006$\027\r^1)\t\021Sek\026\t\003\027Rk\021\001\024\006\003\033:\013!B]3mCVt7\r[3s\025\ty\005+A\002g[2T!!\025*\002\t5|Gm\035\006\002'\006\0311\r]<\n\005Uc%\001C*jI\026|e\016\\=\002\013Y\fG.^3%\003aK!!\027.\002\r\rc\025*\022(U\025\tYF*\001\003TS\022,\007\"B/\001\t\003r\026A\002:be&$\030\020\006\002`KB\021\001mY\007\002C*\021!-L\001\005SR,W.\003\002eC\nQQI\\;n%\006\024\030\016^=\t\013\031d\006\031A4\002\013M$\030mY6\021\005\001D\027BA5b\005%IE/Z7Ti\006\0347\016C\003l\001\021EC.A\006u_>dG/\0339C_\022LHcB7qcJ\\\030q\003\t\003-9L!a\\\f\003\tUs\027\016\036\005\006\021*\004\r!\006\005\006M*\004\ra\032\005\006g*\004\r\001^\001\007a2\f\0270\032:\021\005ULX\"\001<\013\005M<(B\001=.\003\031)g\016^5us&\021!P\036\002\r\013:$\030\016^=QY\006LXM\035\005\006y*\004\r!`\001\bi>|G\016^5q!\025q\030QAA\005\033\005y(b\001 \002\002)\021\0211A\001\005U\0064\030-C\002\002\b}\024A\001T5tiB!\0211BA\t\035\r1\022QB\005\004\003\0379\022A\002)sK\022,g-\003\003\002\024\005U!AB*ue&twMC\002\002\020]Aa!!\007k\001\004)\023\001C1em\006t7-\0323\b\017\005u\001\001#\001\002 \005)\021jY8ogB!\021\021EA\022\033\005\001aaBA\023\001!\005\021q\005\002\006\023\016|gn]\n\005\003G\tI\003E\002\027\003WI1!!\f\030\005\031\te.\037*fM\"9a$a\t\005\002\005EBCAA\020\021)\t)$a\tA\002\023\005\021qG\001\002EV\021\021\021\b\t\005\003w\ty$\004\002\002>)\021a(L\005\005\003\003\niDA\003J\023\016|g\016\003\006\002F\005\r\002\031!C\001\003\017\nQAY0%KF$2!\\A%\021)\tY%a\021\002\002\003\007\021\021H\001\004q\022\n\004\"CA(\003G\001\013\025BA\035\003\t\021\007\005\003\006\002T\005\r\002\031!C\001\003o\t!A\031\032\t\025\005]\0231\005a\001\n\003\tI&\001\004ce}#S-\035\013\004[\006m\003BCA&\003+\n\t\0211\001\002:!I\021qLA\022A\003&\021\021H\001\004EJ\002\003BCA2\003G\001\r\021\"\001\0028\005\031!M\0317\t\025\005\035\0241\005a\001\n\003\tI'A\004cE2|F%Z9\025\0075\fY\007\003\006\002L\005\025\024\021!a\001\003sA\021\"a\034\002$\001\006K!!\017\002\t\t\024G\016\t\005\013\003g\n\031\0031A\005\002\005]\022\001\0022cYJB!\"a\036\002$\001\007I\021AA=\003!\021'\r\034\032`I\025\fHcA7\002|!Q\0211JA;\003\003\005\r!!\017\t\023\005}\0241\005Q!\n\005e\022!\0022cYJ\002\003BCAB\003G\001\r\021\"\001\0028\005\031!MY7\t\025\005\035\0251\005a\001\n\003\tI)A\004cE6|F%Z9\025\0075\fY\t\003\006\002L\005\025\025\021!a\001\003sA\021\"a$\002$\001\006K!!\017\002\t\t\024W\016\t\005\013\003'\013\031\0031A\005\002\005]\022\001\0022c[JB!\"a&\002$\001\007I\021AAM\003!\021'-\034\032`I\025\fHcA7\002\034\"Q\0211JAK\003\003\005\r!!\017\t\023\005}\0251\005Q!\n\005e\022!\0022c[J\002\003BCAR\003G\001\r\021\"\001\0028\005\031!M\031:\t\025\005\035\0261\005a\001\n\003\tI+A\004cEJ|F%Z9\025\0075\fY\013\003\006\002L\005\025\026\021!a\001\003sA\021\"a,\002$\001\006K!!\017\002\t\t\024'\017\t\005\013\003g\013\031\0031A\005\002\005]\022\001\0022ceJB!\"a.\002$\001\007I\021AA]\003!\021'M\035\032`I\025\fHcA7\002<\"Q\0211JA[\003\003\005\r!!\017\t\023\005}\0261\005Q!\n\005e\022!\0022ceJ\002\003BCAb\003G\001\r\021\"\001\0028\005\031!\r\0332\t\025\005\035\0271\005a\001\n\003\tI-A\004cQ\n|F%Z9\025\0075\fY\r\003\006\002L\005\025\027\021!a\001\003sA\021\"a4\002$\001\006K!!\017\002\t\tD'\r\t\005\013\003'\f\031\0031A\005\002\005]\022\001\0022iEJB!\"a6\002$\001\007I\021AAm\003!\021\007N\031\032`I\025\fHcA7\002\\\"Q\0211JAk\003\003\005\r!!\017\t\023\005}\0271\005Q!\n\005e\022!\0022iEJ\002\003BCAr\003G\001\r\021\"\001\0028\005\031!\r[7\t\025\005\035\0301\005a\001\n\003\tI/A\004cQ6|F%Z9\025\0075\fY\017\003\006\002L\005\025\030\021!a\001\003sA\021\"a<\002$\001\006K!!\017\002\t\tDW\016\t\005\013\003g\f\031\0031A\005\002\005]\022\001\0022i[JB!\"a>\002$\001\007I\021AA}\003!\021\007.\034\032`I\025\fHcA7\002|\"Q\0211JA{\003\003\005\r!!\017\t\023\005}\0301\005Q!\n\005e\022!\0022i[J\002\003B\003B\002\003G\001\r\021\"\001\0028\005\031!\r\033;\t\025\t\035\0211\005a\001\n\003\021I!A\004cQR|F%Z9\025\0075\024Y\001\003\006\002L\t\025\021\021!a\001\003sA\021Ba\004\002$\001\006K!!\017\002\t\tDG\017\t\005\013\005'\t\031\0031A\005\002\005]\022\001\0022iiJB!Ba\006\002$\001\007I\021\001B\r\003!\021\007\016\036\032`I\025\fHcA7\003\034!Q\0211\nB\013\003\003\005\r!!\017\t\023\t}\0211\005Q!\n\005e\022!\0022iiJ\002\003B\003B\022\003G\001\r\021\"\001\0028\005\031!-\0347\t\025\t\035\0221\005a\001\n\003\021I#A\004c[2|F%Z9\025\0075\024Y\003\003\006\002L\t\025\022\021!a\001\003sA\021Ba\f\002$\001\006K!!\017\002\t\tlG\016\t\005\013\005g\t\031\0031A\005\002\005]\022a\0012n[\"Q!qGA\022\001\004%\tA!\017\002\017\tlWn\030\023fcR\031QNa\017\t\025\005-#QGA\001\002\004\tI\004C\005\003@\005\r\002\025)\003\002:\005!!-\\7!\021)\021\031%a\tA\002\023\005\021qG\001\004E6\024\bB\003B$\003G\001\r\021\"\001\003J\0059!-\034:`I\025\fHcA7\003L!Q\0211\nB#\003\003\005\r!!\017\t\023\t=\0231\005Q!\n\005e\022\001\0022ne\002B!Ba\025\002$\001\007I\021AA\034\003\r\021G\017\034\005\013\005/\n\031\0031A\005\002\te\023a\0022uY~#S-\035\013\004[\nm\003BCA&\005+\n\t\0211\001\002:!I!qLA\022A\003&\021\021H\001\005ERd\007\005\003\006\003d\005\r\002\031!C\001\003o\t1A\031;n\021)\0219'a\tA\002\023\005!\021N\001\bERlw\fJ3r)\ri'1\016\005\013\003\027\022)'!AA\002\005e\002\"\003B8\003G\001\013\025BA\035\003\021\021G/\034\021\t\025\tM\0241\005a\001\n\003\t9$A\002ciJD!Ba\036\002$\001\007I\021\001B=\003\035\021GO]0%KF$2!\034B>\021)\tYE!\036\002\002\003\007\021\021\b\005\n\005\n\031\003)Q\005\003s\tAA\031;sA!Q!1QA\022\001\004%\t!a\016\002\007\t4(\r\003\006\003\b\006\r\002\031!C\001\005\023\013qA\031<c?\022*\027\017F\002n\005\027C!\"a\023\003\006\006\005\t\031AA\035\021%\021y)a\t!B\023\tI$\001\003cm\n\004\003B\003BJ\003G\001\r\021\"\001\0028\005!!M\03623\021)\0219*a\tA\002\023\005!\021T\001\tEZ\024'g\030\023fcR\031QNa'\t\025\005-#QSA\001\002\004\tI\004C\005\003 \006\r\002\025)\003\002:\005)!M\03623A!Q!1UA\022\001\004%\t!a\016\002\007\t4X\016\003\006\003(\006\r\002\031!C\001\005S\013qA\031<n?\022*\027\017F\002n\005WC!\"a\023\003&\006\005\t\031AA\035\021%\021y+a\t!B\023\tI$\001\003cm6\004\003B\003BZ\003G\001\r\021\"\001\0028\005\031!M\036;\t\025\t]\0261\005a\001\n\003\021I,A\004cmR|F%Z9\025\0075\024Y\f\003\006\002L\tU\026\021!a\001\003sA\021Ba0\002$\001\006K!!\017\002\t\t4H\017\t\005\013\005\007\f\031\0031A\005\002\005]\022!\0014\t\025\t\035\0271\005a\001\n\003\021I-A\003g?\022*\027\017F\002n\005\027D!\"a\023\003F\006\005\t\031AA\035\021%\021y-a\t!B\023\tI$\001\002gA!Q!1[A\022\001\004%\t!a\016\002\005\031\024\004B\003Bl\003G\001\r\021\"\001\003Z\0061aMM0%KF$2!\034Bn\021)\tYE!6\002\002\003\007\021\021\b\005\n\005?\f\031\003)Q\005\003s\t1A\032\032!\021)\021\031/a\tA\002\023\005\021qG\001\004M\nd\007B\003Bt\003G\001\r\021\"\001\003j\0069aM\0317`I\025\fHcA7\003l\"Q\0211\nBs\003\003\005\r!!\017\t\023\t=\0301\005Q!\n\005e\022\001\0024cY\002B!Ba=\002$\001\007I\021AA\034\003\0211'\r\034\032\t\025\t]\0301\005a\001\n\003\021I0\001\005gE2\024t\fJ3r)\ri'1 \005\013\003\027\022)0!AA\002\005e\002\"\003B\000\003G\001\013\025BA\035\003\0251'\r\034\032!\021)\031\031!a\tA\002\023\005\021qG\001\004M\nl\007BCB\004\003G\001\r\021\"\001\004\n\0059aMY7`I\025\fHcA7\004\f!Q\0211JB\003\003\003\005\r!!\017\t\023\r=\0211\005Q!\n\005e\022\001\0024c[\002B!ba\005\002$\001\007I\021AA\034\003\0211'-\034\032\t\025\r]\0211\005a\001\n\003\031I\"\001\005gE6\024t\fJ3r)\ri71\004\005\013\003\027\032)\"!AA\002\005e\002\"CB\020\003G\001\013\025BA\035\003\0251'-\034\032!\021)\031\031#a\tA\002\023\005\021qG\001\004M\n\024\bBCB\024\003G\001\r\021\"\001\004*\0059aM\031:`I\025\fHcA7\004,!Q\0211JB\023\003\003\005\r!!\017\t\023\r=\0221\005Q!\n\005e\022\001\0024ce\002B!ba\r\002$\001\007I\021AA\034\003\0211'M\035\032\t\025\r]\0221\005a\001\n\003\031I$\001\005gEJ\024t\fJ3r)\ri71\b\005\013\003\027\032)$!AA\002\005e\002\"CB \003G\001\013\025BA\035\003\0251'M\035\032!\021)\031\031%a\tA\002\023\005\021qG\001\004M\"\024\007BCB$\003G\001\r\021\"\001\004J\0059a\r\0332`I\025\fHcA7\004L!Q\0211JB#\003\003\005\r!!\017\t\023\r=\0231\005Q!\n\005e\022\001\0024iE\002B!ba\025\002$\001\007I\021AA\034\003\0211\007N\031\032\t\025\r]\0231\005a\001\n\003\031I&\001\005gQ\n\024t\fJ3r)\ri71\f\005\013\003\027\032)&!AA\002\005e\002\"CB0\003G\001\013\025BA\035\003\0251\007N\031\032!\021)\031\031'a\tA\002\023\005\021qG\001\004M\"l\007BCB4\003G\001\r\021\"\001\004j\0059a\r[7`I\025\fHcA7\004l!Q\0211JB3\003\003\005\r!!\017\t\023\r=\0241\005Q!\n\005e\022\001\0024i[\002B!ba\035\002$\001\007I\021AA\034\003\0211\007.\034\032\t\025\r]\0241\005a\001\n\003\031I(\001\005gQ6\024t\fJ3r)\ri71\020\005\013\003\027\032)(!AA\002\005e\002\"CB@\003G\001\013\025BA\035\003\0251\007.\034\032!\021)\031\031)a\tA\002\023\005\021qG\001\004M\"$\bBCBD\003G\001\r\021\"\001\004\n\0069a\r\033;`I\025\fHcA7\004\f\"Q\0211JBC\003\003\005\r!!\017\t\023\r=\0251\005Q!\n\005e\022\001\0024ii\002B!ba%\002$\001\007I\021AA\034\003\0211\007\016\036\032\t\025\r]\0251\005a\001\n\003\031I*\001\005gQR\024t\fJ3r)\ri71\024\005\013\003\027\032)*!AA\002\005e\002\"CBP\003G\001\013\025BA\035\003\0251\007\016\036\032!\021%y\0251\005a\001\n\003\t9\004\003\006\004&\006\r\002\031!C\001\007O\013qAZ7m?\022*\027\017F\002n\007SC!\"a\023\004$\006\005\t\031AA\035\021%\031i+a\t!B\023\tI$\001\003g[2\004\003BCBY\003G\001\r\021\"\001\0028\005\031a-\\7\t\025\rU\0261\005a\001\n\003\0319,A\004g[6|F%Z9\025\0075\034I\f\003\006\002L\rM\026\021!a\001\003sA\021b!0\002$\001\006K!!\017\002\t\031lW\016\t\005\013\007\003\f\031\0031A\005\002\005]\022a\0014ne\"Q1QYA\022\001\004%\taa2\002\017\031l'o\030\023fcR\031Qn!3\t\025\005-31YA\001\002\004\tI\004C\005\004N\006\r\002\025)\003\002:\005!a-\034:!\021)\031\t.a\tA\002\023\005\021qG\001\004MRd\007BCBk\003G\001\r\021\"\001\004X\0069a\r\0367`I\025\fHcA7\004Z\"Q\0211JBj\003\003\005\r!!\017\t\023\ru\0271\005Q!\n\005e\022\001\0024uY\002B!b!9\002$\001\007I\021AA\034\003\r1G/\034\005\013\007K\f\031\0031A\005\002\r\035\030a\0024u[~#S-\035\013\004[\016%\bBCA&\007G\f\t\0211\001\002:!I1Q^A\022A\003&\021\021H\001\005MRl\007\005\003\006\004r\006\r\002\031!C\001\003o\t1A\032;s\021)\031)0a\tA\002\023\0051q_\001\bMR\024x\fJ3r)\ri7\021 \005\013\003\027\032\0310!AA\002\005e\002\"CB\003G\001\013\025BA\035\003\0211GO\035\021\t\025\021\005\0211\005a\001\n\003\t9$A\002gm\nD!\002\"\002\002$\001\007I\021\001C\004\003\0351gOY0%KF$2!\034C\005\021)\tY\005b\001\002\002\003\007\021\021\b\005\n\t\033\t\031\003)Q\005\003s\tAA\032<cA!QA\021CA\022\001\004%\t!a\016\002\t\0314(M\r\005\013\t+\t\031\0031A\005\002\021]\021\001\0034wEJzF%Z9\025\0075$I\002\003\006\002L\021M\021\021!a\001\003sA\021\002\"\b\002$\001\006K!!\017\002\013\0314(M\r\021\t\025\021\005\0221\005a\001\n\003\t9$A\002gm6D!\002\"\n\002$\001\007I\021\001C\024\003\0351g/\\0%KF$2!\034C\025\021)\tY\005b\t\002\002\003\007\021\021\b\005\n\t[\t\031\003)Q\005\003s\tAA\032<nA!QA\021GA\022\001\004%\t!a\016\002\007\0314H\017\003\006\0056\005\r\002\031!C\001\to\tqA\032<u?\022*\027\017F\002n\tsA!\"a\023\0054\005\005\t\031AA\035\021%!i$a\t!B\023\tI$\001\003gmR\004\003\002\003C!\003G!\t\001b\021\002\005\031DWC\001C#!\0251BqIA\035\023\r!Ie\006\002\006\003J\024\030-\037\005\t\t\033\n\031\003\"\001\005D\005\021aM\036\005\t\t#\n\031\003\"\001\005D\005\021!\r\033\005\t\t+\n\031\003\"\001\005D\005\021!M\036\005\t\t3\n\031\003\"\001\005D\005\031a\r\0365\t\021\021u\0231\005C\001\t\007\n1AZ7i\021!!\t'a\t\005\002\021\r\023a\0014cQ\"AAQMA\022\t\003!\031%A\002ci\"D\001\002\"\033\002$\021\005A1I\001\004E6D\007\002\003C7\003G!\t\001b\021\002\007\t\024\007\016\003\005\005r\005\rB\021\001C\"\003\r1GO\036\005\t\tk\n\031\003\"\001\005D\005\031a-\034<\t\021\021e\0241\005C\001\t\007\n1A\0322w\021!!i(a\t\005\002\021\r\023a\0012um\"AA\021QA\022\t\003!\031%A\002c[ZD\001\002\"\"\002$\021\005A1I\001\004E\n4\b\002\003CE\003G!\t\001b\021\002\007\031D'\007\003\005\005\016\006\rB\021\001C\"\003\r1gO\r\005\t\t#\013\031\003\"\001\005D\005\031!\r\033\032\t\021\021U\0251\005C\001\t\007\n1A\031<3\021!!I*a\t\005\002\021\r\023\001\0024cQJB\001\002\"(\002$\021\005A1I\001\005E\nD'\007\003\005\005\"\006\rB\021\001C\"\003\r1W\017\032\005\t\tK\013\031\003\"\001\005D\005\031!-\0363\t\021\021%\0261\005C\001\t\007\n1AZ:o\021!!i+a\t\005\002\021\r\023a\0014fo\"AA\021WA\022\t\003!\031%A\002cg:D\001\002\".\002$\021\005A1I\001\004E\026<\b\002\003C]\003G!\t\001b\021\002\007M,H\r\003\005\005>\006\rB\021\001C\"\003\r\0318/\032\005\t\t\003\f\031\003\"\001\005D\005\0311O\\<\t\021\021\025\0271\005C\001\t\007\n!\001\0365\t\021\021%\0271\005C\001\t\007\n!\001\036<\t\017\0215\007\001\"\021\005P\0069q-\032;JG>tGCDA\035\t#$\031\016\"6\005X\022eGQ\034\005\007S\021-\007\031\001\026\t\rQ\"Y\r1\001\026\021\0311D1\032a\001+!1\001\bb3A\002UAq\001b7\005L\002\0071(A\005x_JdGmU5eK\"9Aq\034Cf\001\004Y\024!\0037pG\006d7+\0333f\021\035!i\r\001C!\tG$b!!\017\005f\022\035\bB\002\036\005b\002\0071\b\003\004I\tC\004\r!\006\005\b\tW\004A\021\tCw\003I\021XmZ5ti\026\024(\t\\8dW&\033wN\\:\025\0075$y\017\003\005\005r\022%\b\031\001Cz\0031I7m\0348SK\036L7\017^3s!\021!)0b\001\016\005\021](\002\002C}\tw\fq\001^3yiV\024XM\003\003\005~\022}\030\001\003:f]\022,'/\032:\013\007\025\005Q&\001\004dY&,g\016^\005\005\013\013!9PA\007J\023\016|gNU3hSN$XM\035\005\b\013\023\001A\021IC\006\0035A\027m\035+jY\026,e\016^5usR\031Q%\"\004\t\r!+9\0011\001\026\021\035)\t\002\001C!\013'\t\001c\031:fCR,G+\0337f\013:$\030\016^=\025\r\025UQqDC\024!\021)9\"\"\b\016\005\025e!bAC\016\t\005QA/\0337fK:$\030\016^=\n\007\005)I\002C\004*\013\037\001\r!\"\t\021\007-*\031#C\002\006&1\022QaV8sY\022Da\001SC\b\001\004)\002bBC\026\001\021\005SQF\001\020_:\024En\\2l!2\f7-\0323CsRiQ.b\f\0062\025MRQGC\034\013\003Bq!KC\025\001\004)\t\003\003\0045\013S\001\r!\006\005\007m\025%\002\031A\013\t\ra*I\0031\001\026\021\035\031X\021\006a\001\013s\001B!b\017\006>5\tq/C\002\006@]\024\001#\0228uSRLH*\033<j]\036\024\025m]3\t\r\031,I\0031\001h\021\035))\005\001C!\013\017\n\001c\0348CY>\0347.Q2uSZ\fG/\0323\025'\025*I%b\023\006N\025=S\021KC*\013+*y&b\031\t\017%*\031\0051\001\006\"!1A'b\021A\002UAaANC\"\001\004)\002B\002\035\006D\001\007Q\003\003\004t\013\007\002\r\001\036\005\007u\025\r\003\031A\036\t\021\025]S1\ta\001\0133\nA\001[5u1B\031a#b\027\n\007\025usCA\003GY>\fG\017\003\005\006b\025\r\003\031AC-\003\021A\027\016^-\t\021\025\025T1\ta\001\0133\nA\001[5u5\"9Q\021\016\001\005\002\025-\024A\003:jO\"$8\t\\5dWR)R%\"\034\006p\025ET1OC;\013o*I(b\037\006~\025}\004bB\025\006h\001\007Q\021\005\005\007i\025\035\004\031A\013\t\rY*9\0071\001\026\021\031ATq\ra\001+!11/b\032A\002QDaAOC4\001\004Y\004\002CC,\013O\002\r!\"\027\t\021\025\005Tq\ra\001\0133B\001\"\"\032\006h\001\007Q\021\f\005\b\013\003+9\0071\001&\003\0251wN]2f\021\035))\t\001C!\013\017\013qb\0348F]RLG/_,bY.Lgn\032\013\f[\026%U1RCG\013\037+\t\nC\004*\013\007\003\r!\"\t\t\rQ*\031\t1\001\026\021\0311T1\021a\001+!1\001(b!A\002UAq\001_CB\001\004)\031\n\005\003\006<\025U\025bACLo\n1QI\034;jifDq!b'\001\t\003*i*A\rp]\026sG/\033;z\007>dG.\0333fI^KG\017\033\"m_\016\\GcC7\006 \026\005V1UCS\013OCq!KCM\001\004)\t\003\003\0045\0133\003\r!\006\005\007m\025e\005\031A\013\t\ra*I\n1\001\026\021\035AX\021\024a\001\013'Cq!b+\001\t\003*i+A\thKR4\026\r\\5e%>$\030\r^5p]N$\"\"b,\0062\026MVQWC\\!\0211BqI\036\t\017%*I\0131\001\006\"!1A'\"+A\002UAaANCU\001\004)\002B\002\035\006*\002\007Q\003")
/*     */ public class Screen extends RedstoneAware {
/*     */   private final int tier;
/*     */   
/*  28 */   public int tier() { return this.tier; } private volatile Icons$ Icons$module; public Screen(int tier) {
/*  29 */     li.cil.oc.integration.coloredlights.ModColoredLights$.MODULE$.setLightLevel(this, 5, 5, 5);
/*     */   }
/*  31 */   public boolean isSideSolid(IBlockAccess world, int x, int y, int z, ForgeDirection side) { ForgeDirection forgeDirection = ForgeDirection.SOUTH; if (toLocal(world, x, y, z, side) == null) { toLocal(world, x, y, z, side); if (forgeDirection != null); } else if (toLocal(world, x, y, z, side).equals(forgeDirection))
/*     */     {  }
/*     */      } @SideOnly(Side.CLIENT)
/*  34 */   public int func_149741_i(int metadata) { return li.cil.oc.util.Color$.MODULE$.byTier()[tier()]; }
/*     */ 
/*     */   
/*     */   public EnumRarity rarity(ItemStack stack) {
/*  38 */     return li.cil.oc.util.Rarity$.MODULE$.byTier(tier());
/*     */   }
/*     */   public void tooltipBody(int metadata, ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
/*  41 */     Tuple2 tuple2 = li.cil.oc.Settings$.MODULE$.screenResolutionsByTier()[tier()]; if (tuple2 != null) { int w = tuple2._1$mcI$sp(), h = tuple2._2$mcI$sp(); Tuple2.mcII.sp sp2 = new Tuple2.mcII.sp(w, h), sp1 = sp2; int i = sp1._1$mcI$sp(), j = sp1._2$mcI$sp();
/*  42 */       int depth = li.cil.oc.util.PackedColor$Depth$.MODULE$.bits(li.cil.oc.Settings$.MODULE$.screenDepthsByTier()[tier()]);
/*  43 */       tooltip.addAll(li.cil.oc.util.Tooltip$.MODULE$.get(getClass().getSimpleName(), (Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(i), BoxesRunTime.boxToInteger(j), BoxesRunTime.boxToInteger(depth) })));
/*     */       return; }
/*     */     
/*     */     throw new MatchError(tuple2);
/*     */   }
/*  48 */   private Icons$ Icons$lzycompute() { synchronized (this) { if (this.Icons$module == null) this.Icons$module = new Icons$(this);  null; return this.Icons$module; }  } public Icons$ Icons() { return (this.Icons$module == null) ? Icons$lzycompute() : this.Icons$module; }
/*  49 */    public class Icons$ { private IIcon b = null; private IIcon b2 = null; private IIcon bbl = null; private IIcon bbl2 = null; private IIcon bbm = null; private IIcon bbm2 = null; private IIcon bbr = null; private IIcon bbr2 = null; private IIcon bhb = null; private IIcon bhb2 = null; private IIcon bhm = null; private IIcon bhm2 = null; private IIcon bht = null; private IIcon bht2 = null; private IIcon bml = null; private IIcon bmm = null; private IIcon bmr = null; private IIcon btl = null; private IIcon btm = null; private IIcon btr = null; private IIcon bvb = null; private IIcon bvb2 = null; private IIcon bvm = null; private IIcon bvt = null; private IIcon f = null; private IIcon f2 = null; private IIcon fbl = null; private IIcon fbl2 = null; private IIcon fbm = null; private IIcon fbm2 = null; private IIcon fbr = null; private IIcon fbr2 = null; private IIcon fhb = null; private IIcon fhb2 = null; private IIcon fhm = null; private IIcon fhm2 = null; private IIcon fht = null; private IIcon fht2 = null; private IIcon fml = null; private IIcon fmm = null; private IIcon fmr = null; private IIcon ftl = null; private IIcon ftm = null; private IIcon ftr = null; private IIcon fvb = null; private IIcon fvb2 = null; private IIcon fvm = null; private IIcon fvt = null; public IIcon b() { return this.b; } public void b_$eq(IIcon x$1) { this.b = x$1; } public IIcon b2() { return this.b2; } public void b2_$eq(IIcon x$1) { this.b2 = x$1; } public IIcon bbl() { return this.bbl; } public void bbl_$eq(IIcon x$1) { this.bbl = x$1; } public IIcon bbl2() { return this.bbl2; } public void bbl2_$eq(IIcon x$1) { this.bbl2 = x$1; } public IIcon bbm() { return this.bbm; } public void bbm_$eq(IIcon x$1) { this.bbm = x$1; } public IIcon bbm2() { return this.bbm2; } public void bbm2_$eq(IIcon x$1) { this.bbm2 = x$1; } public IIcon bbr() { return this.bbr; } public void bbr_$eq(IIcon x$1) { this.bbr = x$1; } public IIcon bbr2() { return this.bbr2; } public void bbr2_$eq(IIcon x$1) { this.bbr2 = x$1; } public IIcon bhb() { return this.bhb; } public void bhb_$eq(IIcon x$1) { this.bhb = x$1; } public IIcon bhb2() { return this.bhb2; } public void bhb2_$eq(IIcon x$1) { this.bhb2 = x$1; } public IIcon bhm() { return this.bhm; } public void bhm_$eq(IIcon x$1) { this.bhm = x$1; } public IIcon bhm2() { return this.bhm2; } public void bhm2_$eq(IIcon x$1) { this.bhm2 = x$1; } public IIcon bht() { return this.bht; } public void bht_$eq(IIcon x$1) { this.bht = x$1; } public IIcon bht2() { return this.bht2; } public void bht2_$eq(IIcon x$1) { this.bht2 = x$1; } public IIcon bml() { return this.bml; } public void bml_$eq(IIcon x$1) { this.bml = x$1; } public IIcon bmm() { return this.bmm; } public void bmm_$eq(IIcon x$1) { this.bmm = x$1; } public IIcon bmr() { return this.bmr; } public void bmr_$eq(IIcon x$1) { this.bmr = x$1; } public IIcon btl() { return this.btl; } public void btl_$eq(IIcon x$1) { this.btl = x$1; } public IIcon btm() { return this.btm; } public void btm_$eq(IIcon x$1) { this.btm = x$1; } public IIcon btr() { return this.btr; } public void btr_$eq(IIcon x$1) { this.btr = x$1; } public IIcon bvb() { return this.bvb; } public void bvb_$eq(IIcon x$1) { this.bvb = x$1; } public IIcon bvb2() { return this.bvb2; } public void bvb2_$eq(IIcon x$1) { this.bvb2 = x$1; } public IIcon bvm() { return this.bvm; } public void bvm_$eq(IIcon x$1) { this.bvm = x$1; } public IIcon bvt() { return this.bvt; } public void bvt_$eq(IIcon x$1) { this.bvt = x$1; } public IIcon f() { return this.f; } public void f_$eq(IIcon x$1) { this.f = x$1; } public IIcon f2() { return this.f2; } public void f2_$eq(IIcon x$1) { this.f2 = x$1; } public IIcon fbl() { return this.fbl; } public void fbl_$eq(IIcon x$1) { this.fbl = x$1; } public IIcon fbl2() { return this.fbl2; } public void fbl2_$eq(IIcon x$1) { this.fbl2 = x$1; } public IIcon fbm() { return this.fbm; } public void fbm_$eq(IIcon x$1) { this.fbm = x$1; } public IIcon fbm2() { return this.fbm2; } public void fbm2_$eq(IIcon x$1) { this.fbm2 = x$1; } public IIcon fbr() { return this.fbr; } public void fbr_$eq(IIcon x$1) { this.fbr = x$1; } public IIcon fbr2() { return this.fbr2; } public void fbr2_$eq(IIcon x$1) { this.fbr2 = x$1; } public IIcon fhb() { return this.fhb; } public void fhb_$eq(IIcon x$1) { this.fhb = x$1; } public IIcon fhb2() { return this.fhb2; } public void fhb2_$eq(IIcon x$1) { this.fhb2 = x$1; } public IIcon fhm() { return this.fhm; } public void fhm_$eq(IIcon x$1) { this.fhm = x$1; } public IIcon fhm2() { return this.fhm2; } public void fhm2_$eq(IIcon x$1) { this.fhm2 = x$1; } public IIcon fht() { return this.fht; } public void fht_$eq(IIcon x$1) { this.fht = x$1; } public IIcon fht2() { return this.fht2; } public void fht2_$eq(IIcon x$1) { this.fht2 = x$1; } public IIcon fml() { return this.fml; } public void fml_$eq(IIcon x$1) { this.fml = x$1; } public IIcon fmm() { return this.fmm; } public void fmm_$eq(IIcon x$1) { this.fmm = x$1; } public IIcon fmr() { return this.fmr; } public void fmr_$eq(IIcon x$1) { this.fmr = x$1; } public IIcon ftl() { return this.ftl; } public void ftl_$eq(IIcon x$1) { this.ftl = x$1; } public IIcon ftm() { return this.ftm; } public void ftm_$eq(IIcon x$1) { this.ftm = x$1; } public IIcon ftr() { return this.ftr; } public void ftr_$eq(IIcon x$1) { this.ftr = x$1; } public IIcon fvb() { return this.fvb; } public void fvb_$eq(IIcon x$1) { this.fvb = x$1; } public IIcon fvb2() { return this.fvb2; } public void fvb2_$eq(IIcon x$1) { this.fvb2 = x$1; } public IIcon fvm() { return this.fvm; } public void fvm_$eq(IIcon x$1) { this.fvm = x$1; } public IIcon fvt() { return this.fvt; } public void fvt_$eq(IIcon x$1) { this.fvt = x$1; }
/*     */      public IIcon[] fh() {
/*  51 */       (new IIcon[3])[0] = fht(); (new IIcon[3])[1] = fhm(); (new IIcon[3])[2] = fhb(); return new IIcon[3];
/*     */     } public IIcon[] fv() {
/*  53 */       (new IIcon[3])[0] = fvt(); (new IIcon[3])[1] = fvm(); (new IIcon[3])[2] = fvb(); return new IIcon[3];
/*     */     } public IIcon[] bh() {
/*  55 */       (new IIcon[3])[0] = bht(); (new IIcon[3])[1] = bhm(); (new IIcon[3])[2] = bhb(); return new IIcon[3];
/*     */     } public IIcon[] bv() {
/*  57 */       (new IIcon[3])[0] = bvt(); (new IIcon[3])[1] = bvm(); (new IIcon[3])[2] = bvb(); return new IIcon[3];
/*     */     } public IIcon[] fth() {
/*  59 */       (new IIcon[3])[0] = ftl(); (new IIcon[3])[1] = ftm(); (new IIcon[3])[2] = ftr(); return new IIcon[3];
/*     */     } public IIcon[] fmh() {
/*  61 */       (new IIcon[3])[0] = fml(); (new IIcon[3])[1] = fmm(); (new IIcon[3])[2] = fmr(); return new IIcon[3];
/*     */     } public IIcon[] fbh() {
/*  63 */       (new IIcon[3])[0] = fbl(); (new IIcon[3])[1] = fbm(); (new IIcon[3])[2] = fbr(); return new IIcon[3];
/*     */     } public IIcon[] bth() {
/*  65 */       (new IIcon[3])[0] = btl(); (new IIcon[3])[1] = btm(); (new IIcon[3])[2] = btr(); return new IIcon[3];
/*     */     } public IIcon[] bmh() {
/*  67 */       (new IIcon[3])[0] = bml(); (new IIcon[3])[1] = bmm(); (new IIcon[3])[2] = bmr(); return new IIcon[3];
/*     */     } public IIcon[] bbh() {
/*  69 */       (new IIcon[3])[0] = bbl(); (new IIcon[3])[1] = bbm(); (new IIcon[3])[2] = bbr(); return new IIcon[3];
/*     */     } public IIcon[] ftv() {
/*  71 */       (new IIcon[3])[0] = ftl(); (new IIcon[3])[1] = fml(); (new IIcon[3])[2] = fbl(); return new IIcon[3];
/*     */     } public IIcon[] fmv() {
/*  73 */       (new IIcon[3])[0] = ftm(); (new IIcon[3])[1] = fmm(); (new IIcon[3])[2] = fbm(); return new IIcon[3];
/*     */     } public IIcon[] fbv() {
/*  75 */       (new IIcon[3])[0] = ftr(); (new IIcon[3])[1] = fmr(); (new IIcon[3])[2] = fbr(); return new IIcon[3];
/*     */     } public IIcon[] btv() {
/*  77 */       (new IIcon[3])[0] = btl(); (new IIcon[3])[1] = bml(); (new IIcon[3])[2] = bbl(); return new IIcon[3];
/*     */     } public IIcon[] bmv() {
/*  79 */       (new IIcon[3])[0] = btm(); (new IIcon[3])[1] = bmm(); (new IIcon[3])[2] = bbm(); return new IIcon[3];
/*     */     } public IIcon[] bbv() {
/*  81 */       (new IIcon[3])[0] = btr(); (new IIcon[3])[1] = bmr(); (new IIcon[3])[2] = bbr(); return new IIcon[3];
/*     */     } public IIcon[] fh2() {
/*  83 */       (new IIcon[3])[0] = fht2(); (new IIcon[3])[1] = fhm2(); (new IIcon[3])[2] = fhb2(); return new IIcon[3];
/*     */     } public IIcon[] fv2() {
/*  85 */       (new IIcon[3])[0] = fvt(); (new IIcon[3])[1] = fvm(); (new IIcon[3])[2] = fvb2(); return new IIcon[3];
/*     */     } public IIcon[] bh2() {
/*  87 */       (new IIcon[3])[0] = bht2(); (new IIcon[3])[1] = bhm2(); (new IIcon[3])[2] = bhb2(); return new IIcon[3];
/*     */     } public IIcon[] bv2() {
/*  89 */       (new IIcon[3])[0] = bvt(); (new IIcon[3])[1] = bvm(); (new IIcon[3])[2] = bvb2(); return new IIcon[3];
/*     */     } public IIcon[] fbh2() {
/*  91 */       (new IIcon[3])[0] = fbl2(); (new IIcon[3])[1] = fbm2(); (new IIcon[3])[2] = fbr2(); return new IIcon[3];
/*     */     } public IIcon[] bbh2() {
/*  93 */       (new IIcon[3])[0] = bbl2(); (new IIcon[3])[1] = bbm2(); (new IIcon[3])[2] = bbr2(); return new IIcon[3];
/*     */     } public IIcon[] fud() {
/*  95 */       return (IIcon[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fh2()).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fv2()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fth()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fmh()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fbh2()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)));
/*     */     } public IIcon[] bud() {
/*  97 */       return (IIcon[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bh2()).reverse()).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bv2()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bth()).reverse()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bmh()).reverse()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bbh2()).reverse()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)));
/*     */     } public IIcon[] fsn() {
/*  99 */       return (IIcon[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fh()).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fv()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fth()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fmh()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fbh()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)));
/*     */     } public IIcon[] few() {
/* 101 */       return (IIcon[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fv()).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fh()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().ftv()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fmv()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().fbv()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)));
/*     */     } public IIcon[] bsn() {
/* 103 */       return (IIcon[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bh()).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bv()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bth()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bmh()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bbh()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)));
/*     */     } public IIcon[] bew() {
/* 105 */       return (IIcon[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bv()).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bh()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().btv()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bmv()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)))).$plus$plus((GenTraversableOnce)scala.Predef$.MODULE$.refArrayOps((Object[])this.$outer.Icons().bbv()), scala.Array$.MODULE$.canBuildFrom(scala.reflect.ClassTag$.MODULE$.apply(IIcon.class)));
/*     */     } public IIcon[] sud() {
/* 107 */       (new IIcon[3])[0] = this.$outer.Icons().bvt(); (new IIcon[3])[1] = this.$outer.Icons().bvm(); (new IIcon[3])[2] = this.$outer.Icons().bvb2(); return new IIcon[3];
/*     */     } public IIcon[] sse() {
/* 109 */       (new IIcon[3])[0] = this.$outer.Icons().bhb2(); (new IIcon[3])[1] = this.$outer.Icons().bhm2(); (new IIcon[3])[2] = this.$outer.Icons().bht2(); return new IIcon[3];
/*     */     } public IIcon[] snw() {
/* 111 */       (new IIcon[3])[0] = this.$outer.Icons().bht2(); (new IIcon[3])[1] = this.$outer.Icons().bhm2(); (new IIcon[3])[2] = this.$outer.Icons().bhb2(); return new IIcon[3];
/*     */     } public IIcon[] th() {
/* 113 */       (new IIcon[3])[0] = this.$outer.Icons().bhb(); (new IIcon[3])[1] = this.$outer.Icons().bhm(); (new IIcon[3])[2] = this.$outer.Icons().bht(); return new IIcon[3];
/*     */     } public IIcon[] tv() {
/* 115 */       (new IIcon[3])[0] = this.$outer.Icons().bvb(); (new IIcon[3])[1] = this.$outer.Icons().bvm(); (new IIcon[3])[2] = this.$outer.Icons().bvt(); return new IIcon[3];
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Icons$(Screen $outer) {} }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IIcon getIcon(IBlockAccess world, int x, int y, int z, ForgeDirection worldSide, ForgeDirection localSide) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore #7
/*     */     //   3: aconst_null
/*     */     //   4: astore #8
/*     */     //   6: aload_1
/*     */     //   7: iload_2
/*     */     //   8: iload_3
/*     */     //   9: iload #4
/*     */     //   11: invokeinterface func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   16: astore #9
/*     */     //   18: aload #9
/*     */     //   20: instanceof li/cil/oc/common/tileentity/Screen
/*     */     //   23: ifeq -> 2962
/*     */     //   26: iconst_1
/*     */     //   27: istore #7
/*     */     //   29: aload #9
/*     */     //   31: checkcast li/cil/oc/common/tileentity/Screen
/*     */     //   34: astore #8
/*     */     //   36: aload #8
/*     */     //   38: invokevirtual width : ()I
/*     */     //   41: iconst_1
/*     */     //   42: if_icmpgt -> 54
/*     */     //   45: aload #8
/*     */     //   47: invokevirtual height : ()I
/*     */     //   50: iconst_1
/*     */     //   51: if_icmple -> 2962
/*     */     //   54: aload #8
/*     */     //   56: invokevirtual width : ()I
/*     */     //   59: iconst_1
/*     */     //   60: isub
/*     */     //   61: istore #11
/*     */     //   63: aload #8
/*     */     //   65: invokevirtual height : ()I
/*     */     //   68: iconst_1
/*     */     //   69: isub
/*     */     //   70: istore #12
/*     */     //   72: aload #8
/*     */     //   74: invokevirtual localPosition : ()Lscala/Tuple2;
/*     */     //   77: astore #14
/*     */     //   79: aload #14
/*     */     //   81: ifnull -> 2952
/*     */     //   84: aload #14
/*     */     //   86: invokevirtual _1$mcI$sp : ()I
/*     */     //   89: istore #15
/*     */     //   91: aload #14
/*     */     //   93: invokevirtual _2$mcI$sp : ()I
/*     */     //   96: istore #16
/*     */     //   98: new scala/Tuple2$mcII$sp
/*     */     //   101: dup
/*     */     //   102: iload #15
/*     */     //   104: iload #16
/*     */     //   106: invokespecial <init> : (II)V
/*     */     //   109: astore #17
/*     */     //   111: aload #17
/*     */     //   113: astore #13
/*     */     //   115: aload #13
/*     */     //   117: invokevirtual _1$mcI$sp : ()I
/*     */     //   120: istore #18
/*     */     //   122: aload #13
/*     */     //   124: invokevirtual _2$mcI$sp : ()I
/*     */     //   127: istore #19
/*     */     //   129: aload #8
/*     */     //   131: invokevirtual pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   134: astore #22
/*     */     //   136: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   139: aload #22
/*     */     //   141: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   144: ifeq -> 163
/*     */     //   147: new scala/Tuple2$mcII$sp
/*     */     //   150: dup
/*     */     //   151: iload #18
/*     */     //   153: iload #19
/*     */     //   155: invokespecial <init> : (II)V
/*     */     //   158: astore #23
/*     */     //   160: goto -> 454
/*     */     //   163: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   166: aload #22
/*     */     //   168: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   171: ifeq -> 315
/*     */     //   174: aload #8
/*     */     //   176: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   179: astore #24
/*     */     //   181: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   184: aload #24
/*     */     //   186: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   189: ifeq -> 208
/*     */     //   192: new scala/Tuple2$mcII$sp
/*     */     //   195: dup
/*     */     //   196: iload #18
/*     */     //   198: iload #19
/*     */     //   200: invokespecial <init> : (II)V
/*     */     //   203: astore #25
/*     */     //   205: goto -> 298
/*     */     //   208: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   211: aload #24
/*     */     //   213: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   216: ifeq -> 241
/*     */     //   219: new scala/Tuple2$mcII$sp
/*     */     //   222: dup
/*     */     //   223: iload #11
/*     */     //   225: iload #18
/*     */     //   227: isub
/*     */     //   228: iload #12
/*     */     //   230: iload #19
/*     */     //   232: isub
/*     */     //   233: invokespecial <init> : (II)V
/*     */     //   236: astore #25
/*     */     //   238: goto -> 298
/*     */     //   241: getstatic net/minecraftforge/common/util/ForgeDirection.EAST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   244: aload #24
/*     */     //   246: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   249: ifeq -> 271
/*     */     //   252: new scala/Tuple2$mcII$sp
/*     */     //   255: dup
/*     */     //   256: iload #11
/*     */     //   258: iload #18
/*     */     //   260: isub
/*     */     //   261: iload #19
/*     */     //   263: invokespecial <init> : (II)V
/*     */     //   266: astore #25
/*     */     //   268: goto -> 298
/*     */     //   271: getstatic net/minecraftforge/common/util/ForgeDirection.WEST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   274: aload #24
/*     */     //   276: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   279: ifeq -> 305
/*     */     //   282: new scala/Tuple2$mcII$sp
/*     */     //   285: dup
/*     */     //   286: iload #18
/*     */     //   288: iload #12
/*     */     //   290: iload #19
/*     */     //   292: isub
/*     */     //   293: invokespecial <init> : (II)V
/*     */     //   296: astore #25
/*     */     //   298: aload #25
/*     */     //   300: astore #23
/*     */     //   302: goto -> 454
/*     */     //   305: new java/lang/AssertionError
/*     */     //   308: dup
/*     */     //   309: ldc 'yaw has invalid value'
/*     */     //   311: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   314: athrow
/*     */     //   315: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   318: aload #22
/*     */     //   320: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   323: ifeq -> 2941
/*     */     //   326: aload #8
/*     */     //   328: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   331: astore #26
/*     */     //   333: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   336: aload #26
/*     */     //   338: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   341: ifeq -> 363
/*     */     //   344: new scala/Tuple2$mcII$sp
/*     */     //   347: dup
/*     */     //   348: iload #18
/*     */     //   350: iload #12
/*     */     //   352: iload #19
/*     */     //   354: isub
/*     */     //   355: invokespecial <init> : (II)V
/*     */     //   358: astore #27
/*     */     //   360: goto -> 450
/*     */     //   363: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   366: aload #26
/*     */     //   368: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   371: ifeq -> 393
/*     */     //   374: new scala/Tuple2$mcII$sp
/*     */     //   377: dup
/*     */     //   378: iload #11
/*     */     //   380: iload #18
/*     */     //   382: isub
/*     */     //   383: iload #19
/*     */     //   385: invokespecial <init> : (II)V
/*     */     //   388: astore #27
/*     */     //   390: goto -> 450
/*     */     //   393: getstatic net/minecraftforge/common/util/ForgeDirection.EAST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   396: aload #26
/*     */     //   398: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   401: ifeq -> 426
/*     */     //   404: new scala/Tuple2$mcII$sp
/*     */     //   407: dup
/*     */     //   408: iload #11
/*     */     //   410: iload #18
/*     */     //   412: isub
/*     */     //   413: iload #12
/*     */     //   415: iload #19
/*     */     //   417: isub
/*     */     //   418: invokespecial <init> : (II)V
/*     */     //   421: astore #27
/*     */     //   423: goto -> 450
/*     */     //   426: getstatic net/minecraftforge/common/util/ForgeDirection.WEST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   429: aload #26
/*     */     //   431: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   434: ifeq -> 2931
/*     */     //   437: new scala/Tuple2$mcII$sp
/*     */     //   440: dup
/*     */     //   441: iload #18
/*     */     //   443: iload #19
/*     */     //   445: invokespecial <init> : (II)V
/*     */     //   448: astore #27
/*     */     //   450: aload #27
/*     */     //   452: astore #23
/*     */     //   454: aload #23
/*     */     //   456: astore #21
/*     */     //   458: aload #21
/*     */     //   460: ifnull -> 2921
/*     */     //   463: aload #21
/*     */     //   465: invokevirtual _1$mcI$sp : ()I
/*     */     //   468: istore #28
/*     */     //   470: aload #21
/*     */     //   472: invokevirtual _2$mcI$sp : ()I
/*     */     //   475: istore #29
/*     */     //   477: new scala/Tuple2$mcII$sp
/*     */     //   480: dup
/*     */     //   481: iload #28
/*     */     //   483: iload #29
/*     */     //   485: invokespecial <init> : (II)V
/*     */     //   488: astore #30
/*     */     //   490: aload #30
/*     */     //   492: astore #20
/*     */     //   494: aload #20
/*     */     //   496: invokevirtual _1$mcI$sp : ()I
/*     */     //   499: istore #31
/*     */     //   501: aload #20
/*     */     //   503: invokevirtual _2$mcI$sp : ()I
/*     */     //   506: istore #32
/*     */     //   508: aload #6
/*     */     //   510: astore #33
/*     */     //   512: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   515: aload #33
/*     */     //   517: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   520: ifeq -> 529
/*     */     //   523: iconst_1
/*     */     //   524: istore #34
/*     */     //   526: goto -> 549
/*     */     //   529: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   532: aload #33
/*     */     //   534: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   537: ifeq -> 546
/*     */     //   540: iconst_1
/*     */     //   541: istore #34
/*     */     //   543: goto -> 549
/*     */     //   546: iconst_0
/*     */     //   547: istore #34
/*     */     //   549: iload #34
/*     */     //   551: ifeq -> 1597
/*     */     //   554: aload #6
/*     */     //   556: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   559: astore #38
/*     */     //   561: dup
/*     */     //   562: ifnonnull -> 574
/*     */     //   565: pop
/*     */     //   566: aload #38
/*     */     //   568: ifnull -> 582
/*     */     //   571: goto -> 613
/*     */     //   574: aload #38
/*     */     //   576: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   579: ifeq -> 613
/*     */     //   582: new scala/Tuple3
/*     */     //   585: dup
/*     */     //   586: aload_0
/*     */     //   587: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   590: invokevirtual fud : ()[Lnet/minecraft/util/IIcon;
/*     */     //   593: aload_0
/*     */     //   594: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   597: invokevirtual fsn : ()[Lnet/minecraft/util/IIcon;
/*     */     //   600: aload_0
/*     */     //   601: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   604: invokevirtual few : ()[Lnet/minecraft/util/IIcon;
/*     */     //   607: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   610: goto -> 641
/*     */     //   613: new scala/Tuple3
/*     */     //   616: dup
/*     */     //   617: aload_0
/*     */     //   618: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   621: invokevirtual bud : ()[Lnet/minecraft/util/IIcon;
/*     */     //   624: aload_0
/*     */     //   625: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   628: invokevirtual bsn : ()[Lnet/minecraft/util/IIcon;
/*     */     //   631: aload_0
/*     */     //   632: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   635: invokevirtual bew : ()[Lnet/minecraft/util/IIcon;
/*     */     //   638: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   641: astore #37
/*     */     //   643: aload #37
/*     */     //   645: ifnull -> 1587
/*     */     //   648: aload #37
/*     */     //   650: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   653: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   656: astore #39
/*     */     //   658: aload #37
/*     */     //   660: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   663: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   666: astore #40
/*     */     //   668: aload #37
/*     */     //   670: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   673: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   676: astore #41
/*     */     //   678: new scala/Tuple3
/*     */     //   681: dup
/*     */     //   682: aload #39
/*     */     //   684: aload #40
/*     */     //   686: aload #41
/*     */     //   688: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   691: astore #42
/*     */     //   693: aload #42
/*     */     //   695: astore #36
/*     */     //   697: aload #36
/*     */     //   699: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   702: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   705: astore #43
/*     */     //   707: aload #36
/*     */     //   709: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   712: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   715: astore #44
/*     */     //   717: aload #36
/*     */     //   719: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   722: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   725: astore #45
/*     */     //   727: aload #8
/*     */     //   729: invokevirtual pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   732: astore #48
/*     */     //   734: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   737: aload #48
/*     */     //   739: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   742: ifeq -> 752
/*     */     //   745: aload #43
/*     */     //   747: astore #49
/*     */     //   749: goto -> 858
/*     */     //   752: aload #8
/*     */     //   754: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   757: astore #50
/*     */     //   759: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   762: aload #50
/*     */     //   764: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   767: ifeq -> 776
/*     */     //   770: iconst_1
/*     */     //   771: istore #51
/*     */     //   773: goto -> 796
/*     */     //   776: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   779: aload #50
/*     */     //   781: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   784: ifeq -> 793
/*     */     //   787: iconst_1
/*     */     //   788: istore #51
/*     */     //   790: goto -> 796
/*     */     //   793: iconst_0
/*     */     //   794: istore #51
/*     */     //   796: iload #51
/*     */     //   798: ifeq -> 808
/*     */     //   801: aload #44
/*     */     //   803: astore #52
/*     */     //   805: goto -> 854
/*     */     //   808: getstatic net/minecraftforge/common/util/ForgeDirection.EAST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   811: aload #50
/*     */     //   813: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   816: ifeq -> 825
/*     */     //   819: iconst_1
/*     */     //   820: istore #53
/*     */     //   822: goto -> 845
/*     */     //   825: getstatic net/minecraftforge/common/util/ForgeDirection.WEST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   828: aload #50
/*     */     //   830: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   833: ifeq -> 842
/*     */     //   836: iconst_1
/*     */     //   837: istore #53
/*     */     //   839: goto -> 845
/*     */     //   842: iconst_0
/*     */     //   843: istore #53
/*     */     //   845: iload #53
/*     */     //   847: ifeq -> 1577
/*     */     //   850: aload #45
/*     */     //   852: astore #52
/*     */     //   854: aload #52
/*     */     //   856: astore #49
/*     */     //   858: aload #49
/*     */     //   860: astore #47
/*     */     //   862: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   865: aload #47
/*     */     //   867: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   870: astore #54
/*     */     //   872: aload #54
/*     */     //   874: invokevirtual isEmpty : ()Z
/*     */     //   877: ifne -> 1567
/*     */     //   880: aload #54
/*     */     //   882: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   885: ifnull -> 1567
/*     */     //   888: aload #54
/*     */     //   890: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   893: checkcast scala/collection/SeqLike
/*     */     //   896: bipush #15
/*     */     //   898: invokeinterface lengthCompare : (I)I
/*     */     //   903: iconst_0
/*     */     //   904: if_icmpne -> 1567
/*     */     //   907: aload #54
/*     */     //   909: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   912: checkcast scala/collection/SeqLike
/*     */     //   915: iconst_0
/*     */     //   916: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   921: checkcast net/minecraft/util/IIcon
/*     */     //   924: astore #55
/*     */     //   926: aload #54
/*     */     //   928: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   931: checkcast scala/collection/SeqLike
/*     */     //   934: iconst_1
/*     */     //   935: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   940: checkcast net/minecraft/util/IIcon
/*     */     //   943: astore #56
/*     */     //   945: aload #54
/*     */     //   947: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   950: checkcast scala/collection/SeqLike
/*     */     //   953: iconst_2
/*     */     //   954: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   959: checkcast net/minecraft/util/IIcon
/*     */     //   962: astore #57
/*     */     //   964: aload #54
/*     */     //   966: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   969: checkcast scala/collection/SeqLike
/*     */     //   972: iconst_3
/*     */     //   973: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   978: checkcast net/minecraft/util/IIcon
/*     */     //   981: astore #58
/*     */     //   983: aload #54
/*     */     //   985: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   988: checkcast scala/collection/SeqLike
/*     */     //   991: iconst_4
/*     */     //   992: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   997: checkcast net/minecraft/util/IIcon
/*     */     //   1000: astore #59
/*     */     //   1002: aload #54
/*     */     //   1004: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1007: checkcast scala/collection/SeqLike
/*     */     //   1010: iconst_5
/*     */     //   1011: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1016: checkcast net/minecraft/util/IIcon
/*     */     //   1019: astore #60
/*     */     //   1021: aload #54
/*     */     //   1023: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1026: checkcast scala/collection/SeqLike
/*     */     //   1029: bipush #6
/*     */     //   1031: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1036: checkcast net/minecraft/util/IIcon
/*     */     //   1039: astore #61
/*     */     //   1041: aload #54
/*     */     //   1043: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1046: checkcast scala/collection/SeqLike
/*     */     //   1049: bipush #7
/*     */     //   1051: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1056: checkcast net/minecraft/util/IIcon
/*     */     //   1059: astore #62
/*     */     //   1061: aload #54
/*     */     //   1063: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1066: checkcast scala/collection/SeqLike
/*     */     //   1069: bipush #8
/*     */     //   1071: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1076: checkcast net/minecraft/util/IIcon
/*     */     //   1079: astore #63
/*     */     //   1081: aload #54
/*     */     //   1083: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1086: checkcast scala/collection/SeqLike
/*     */     //   1089: bipush #9
/*     */     //   1091: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1096: checkcast net/minecraft/util/IIcon
/*     */     //   1099: astore #64
/*     */     //   1101: aload #54
/*     */     //   1103: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1106: checkcast scala/collection/SeqLike
/*     */     //   1109: bipush #10
/*     */     //   1111: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1116: checkcast net/minecraft/util/IIcon
/*     */     //   1119: astore #65
/*     */     //   1121: aload #54
/*     */     //   1123: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1126: checkcast scala/collection/SeqLike
/*     */     //   1129: bipush #11
/*     */     //   1131: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1136: checkcast net/minecraft/util/IIcon
/*     */     //   1139: astore #66
/*     */     //   1141: aload #54
/*     */     //   1143: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1146: checkcast scala/collection/SeqLike
/*     */     //   1149: bipush #12
/*     */     //   1151: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1156: checkcast net/minecraft/util/IIcon
/*     */     //   1159: astore #67
/*     */     //   1161: aload #54
/*     */     //   1163: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1166: checkcast scala/collection/SeqLike
/*     */     //   1169: bipush #13
/*     */     //   1171: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1176: checkcast net/minecraft/util/IIcon
/*     */     //   1179: astore #68
/*     */     //   1181: aload #54
/*     */     //   1183: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1186: checkcast scala/collection/SeqLike
/*     */     //   1189: bipush #14
/*     */     //   1191: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   1196: checkcast net/minecraft/util/IIcon
/*     */     //   1199: astore #69
/*     */     //   1201: new scala/Tuple15
/*     */     //   1204: dup
/*     */     //   1205: aload #55
/*     */     //   1207: aload #56
/*     */     //   1209: aload #57
/*     */     //   1211: aload #58
/*     */     //   1213: aload #59
/*     */     //   1215: aload #60
/*     */     //   1217: aload #61
/*     */     //   1219: aload #62
/*     */     //   1221: aload #63
/*     */     //   1223: aload #64
/*     */     //   1225: aload #65
/*     */     //   1227: aload #66
/*     */     //   1229: aload #67
/*     */     //   1231: aload #68
/*     */     //   1233: aload #69
/*     */     //   1235: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   1238: astore #70
/*     */     //   1240: aload #70
/*     */     //   1242: astore #46
/*     */     //   1244: aload #46
/*     */     //   1246: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   1249: checkcast net/minecraft/util/IIcon
/*     */     //   1252: astore #71
/*     */     //   1254: aload #46
/*     */     //   1256: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   1259: checkcast net/minecraft/util/IIcon
/*     */     //   1262: astore #72
/*     */     //   1264: aload #46
/*     */     //   1266: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   1269: checkcast net/minecraft/util/IIcon
/*     */     //   1272: astore #73
/*     */     //   1274: aload #46
/*     */     //   1276: invokevirtual _4 : ()Ljava/lang/Object;
/*     */     //   1279: checkcast net/minecraft/util/IIcon
/*     */     //   1282: astore #74
/*     */     //   1284: aload #46
/*     */     //   1286: invokevirtual _5 : ()Ljava/lang/Object;
/*     */     //   1289: checkcast net/minecraft/util/IIcon
/*     */     //   1292: astore #75
/*     */     //   1294: aload #46
/*     */     //   1296: invokevirtual _6 : ()Ljava/lang/Object;
/*     */     //   1299: checkcast net/minecraft/util/IIcon
/*     */     //   1302: astore #76
/*     */     //   1304: aload #46
/*     */     //   1306: invokevirtual _7 : ()Ljava/lang/Object;
/*     */     //   1309: checkcast net/minecraft/util/IIcon
/*     */     //   1312: astore #77
/*     */     //   1314: aload #46
/*     */     //   1316: invokevirtual _8 : ()Ljava/lang/Object;
/*     */     //   1319: checkcast net/minecraft/util/IIcon
/*     */     //   1322: astore #78
/*     */     //   1324: aload #46
/*     */     //   1326: invokevirtual _9 : ()Ljava/lang/Object;
/*     */     //   1329: checkcast net/minecraft/util/IIcon
/*     */     //   1332: astore #79
/*     */     //   1334: aload #46
/*     */     //   1336: invokevirtual _10 : ()Ljava/lang/Object;
/*     */     //   1339: checkcast net/minecraft/util/IIcon
/*     */     //   1342: astore #80
/*     */     //   1344: aload #46
/*     */     //   1346: invokevirtual _11 : ()Ljava/lang/Object;
/*     */     //   1349: checkcast net/minecraft/util/IIcon
/*     */     //   1352: astore #81
/*     */     //   1354: aload #46
/*     */     //   1356: invokevirtual _12 : ()Ljava/lang/Object;
/*     */     //   1359: checkcast net/minecraft/util/IIcon
/*     */     //   1362: astore #82
/*     */     //   1364: aload #46
/*     */     //   1366: invokevirtual _13 : ()Ljava/lang/Object;
/*     */     //   1369: checkcast net/minecraft/util/IIcon
/*     */     //   1372: astore #83
/*     */     //   1374: aload #46
/*     */     //   1376: invokevirtual _14 : ()Ljava/lang/Object;
/*     */     //   1379: checkcast net/minecraft/util/IIcon
/*     */     //   1382: astore #84
/*     */     //   1384: aload #46
/*     */     //   1386: invokevirtual _15 : ()Ljava/lang/Object;
/*     */     //   1389: checkcast net/minecraft/util/IIcon
/*     */     //   1392: astore #85
/*     */     //   1394: aload #8
/*     */     //   1396: invokevirtual height : ()I
/*     */     //   1399: iconst_1
/*     */     //   1400: if_icmpne -> 1431
/*     */     //   1403: iload #31
/*     */     //   1405: iconst_0
/*     */     //   1406: if_icmpne -> 1414
/*     */     //   1409: aload #71
/*     */     //   1411: goto -> 1562
/*     */     //   1414: iload #31
/*     */     //   1416: iload #11
/*     */     //   1418: if_icmpne -> 1426
/*     */     //   1421: aload #73
/*     */     //   1423: goto -> 1562
/*     */     //   1426: aload #72
/*     */     //   1428: goto -> 1562
/*     */     //   1431: aload #8
/*     */     //   1433: invokevirtual width : ()I
/*     */     //   1436: iconst_1
/*     */     //   1437: if_icmpne -> 1468
/*     */     //   1440: iload #32
/*     */     //   1442: iconst_0
/*     */     //   1443: if_icmpne -> 1451
/*     */     //   1446: aload #76
/*     */     //   1448: goto -> 1562
/*     */     //   1451: iload #32
/*     */     //   1453: iload #12
/*     */     //   1455: if_icmpne -> 1463
/*     */     //   1458: aload #74
/*     */     //   1460: goto -> 1562
/*     */     //   1463: aload #75
/*     */     //   1465: goto -> 1562
/*     */     //   1468: iload #31
/*     */     //   1470: iconst_0
/*     */     //   1471: if_icmpne -> 1502
/*     */     //   1474: iload #32
/*     */     //   1476: iconst_0
/*     */     //   1477: if_icmpne -> 1485
/*     */     //   1480: aload #83
/*     */     //   1482: goto -> 1562
/*     */     //   1485: iload #32
/*     */     //   1487: iload #12
/*     */     //   1489: if_icmpne -> 1497
/*     */     //   1492: aload #77
/*     */     //   1494: goto -> 1562
/*     */     //   1497: aload #80
/*     */     //   1499: goto -> 1562
/*     */     //   1502: iload #31
/*     */     //   1504: iload #11
/*     */     //   1506: if_icmpne -> 1537
/*     */     //   1509: iload #32
/*     */     //   1511: iconst_0
/*     */     //   1512: if_icmpne -> 1520
/*     */     //   1515: aload #85
/*     */     //   1517: goto -> 1562
/*     */     //   1520: iload #32
/*     */     //   1522: iload #12
/*     */     //   1524: if_icmpne -> 1532
/*     */     //   1527: aload #79
/*     */     //   1529: goto -> 1562
/*     */     //   1532: aload #82
/*     */     //   1534: goto -> 1562
/*     */     //   1537: iload #32
/*     */     //   1539: iconst_0
/*     */     //   1540: if_icmpne -> 1548
/*     */     //   1543: aload #84
/*     */     //   1545: goto -> 1562
/*     */     //   1548: iload #32
/*     */     //   1550: iload #12
/*     */     //   1552: if_icmpne -> 1560
/*     */     //   1555: aload #78
/*     */     //   1557: goto -> 1562
/*     */     //   1560: aload #81
/*     */     //   1562: astore #35
/*     */     //   1564: goto -> 2914
/*     */     //   1567: new scala/MatchError
/*     */     //   1570: dup
/*     */     //   1571: aload #47
/*     */     //   1573: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   1576: athrow
/*     */     //   1577: new java/lang/AssertionError
/*     */     //   1580: dup
/*     */     //   1581: ldc 'yaw has invalid value'
/*     */     //   1583: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   1586: athrow
/*     */     //   1587: new scala/MatchError
/*     */     //   1590: dup
/*     */     //   1591: aload #37
/*     */     //   1593: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   1596: athrow
/*     */     //   1597: getstatic net/minecraftforge/common/util/ForgeDirection.EAST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   1600: aload #33
/*     */     //   1602: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1605: ifeq -> 1614
/*     */     //   1608: iconst_1
/*     */     //   1609: istore #86
/*     */     //   1611: goto -> 1634
/*     */     //   1614: getstatic net/minecraftforge/common/util/ForgeDirection.WEST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   1617: aload #33
/*     */     //   1619: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1622: ifeq -> 1631
/*     */     //   1625: iconst_1
/*     */     //   1626: istore #86
/*     */     //   1628: goto -> 1634
/*     */     //   1631: iconst_0
/*     */     //   1632: istore #86
/*     */     //   1634: iload #86
/*     */     //   1636: ifeq -> 2176
/*     */     //   1639: aload #6
/*     */     //   1641: getstatic net/minecraftforge/common/util/ForgeDirection.EAST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   1644: astore #89
/*     */     //   1646: dup
/*     */     //   1647: ifnonnull -> 1659
/*     */     //   1650: pop
/*     */     //   1651: aload #89
/*     */     //   1653: ifnull -> 1667
/*     */     //   1656: goto -> 1698
/*     */     //   1659: aload #89
/*     */     //   1661: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1664: ifeq -> 1698
/*     */     //   1667: new scala/Tuple3
/*     */     //   1670: dup
/*     */     //   1671: aload_0
/*     */     //   1672: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   1675: invokevirtual sud : ()[Lnet/minecraft/util/IIcon;
/*     */     //   1678: aload_0
/*     */     //   1679: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   1682: invokevirtual sse : ()[Lnet/minecraft/util/IIcon;
/*     */     //   1685: aload_0
/*     */     //   1686: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   1689: invokevirtual snw : ()[Lnet/minecraft/util/IIcon;
/*     */     //   1692: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   1695: goto -> 1726
/*     */     //   1698: new scala/Tuple3
/*     */     //   1701: dup
/*     */     //   1702: aload_0
/*     */     //   1703: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   1706: invokevirtual sud : ()[Lnet/minecraft/util/IIcon;
/*     */     //   1709: aload_0
/*     */     //   1710: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   1713: invokevirtual snw : ()[Lnet/minecraft/util/IIcon;
/*     */     //   1716: aload_0
/*     */     //   1717: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   1720: invokevirtual sse : ()[Lnet/minecraft/util/IIcon;
/*     */     //   1723: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   1726: astore #88
/*     */     //   1728: aload #88
/*     */     //   1730: ifnull -> 2166
/*     */     //   1733: aload #88
/*     */     //   1735: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   1738: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   1741: astore #90
/*     */     //   1743: aload #88
/*     */     //   1745: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   1748: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   1751: astore #91
/*     */     //   1753: aload #88
/*     */     //   1755: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   1758: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   1761: astore #92
/*     */     //   1763: new scala/Tuple3
/*     */     //   1766: dup
/*     */     //   1767: aload #90
/*     */     //   1769: aload #91
/*     */     //   1771: aload #92
/*     */     //   1773: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   1776: astore #93
/*     */     //   1778: aload #93
/*     */     //   1780: astore #87
/*     */     //   1782: aload #87
/*     */     //   1784: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   1787: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   1790: astore #94
/*     */     //   1792: aload #87
/*     */     //   1794: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   1797: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   1800: astore #95
/*     */     //   1802: aload #87
/*     */     //   1804: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   1807: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   1810: astore #96
/*     */     //   1812: aload #8
/*     */     //   1814: invokevirtual pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   1817: astore #99
/*     */     //   1819: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   1822: aload #99
/*     */     //   1824: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1827: ifeq -> 1837
/*     */     //   1830: aload #94
/*     */     //   1832: astore #100
/*     */     //   1834: goto -> 1943
/*     */     //   1837: aload #8
/*     */     //   1839: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   1842: astore #101
/*     */     //   1844: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   1847: aload #101
/*     */     //   1849: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1852: ifeq -> 1861
/*     */     //   1855: iconst_1
/*     */     //   1856: istore #102
/*     */     //   1858: goto -> 1881
/*     */     //   1861: getstatic net/minecraftforge/common/util/ForgeDirection.EAST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   1864: aload #101
/*     */     //   1866: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1869: ifeq -> 1878
/*     */     //   1872: iconst_1
/*     */     //   1873: istore #102
/*     */     //   1875: goto -> 1881
/*     */     //   1878: iconst_0
/*     */     //   1879: istore #102
/*     */     //   1881: iload #102
/*     */     //   1883: ifeq -> 1893
/*     */     //   1886: aload #95
/*     */     //   1888: astore #103
/*     */     //   1890: goto -> 1939
/*     */     //   1893: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   1896: aload #101
/*     */     //   1898: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1901: ifeq -> 1910
/*     */     //   1904: iconst_1
/*     */     //   1905: istore #104
/*     */     //   1907: goto -> 1930
/*     */     //   1910: getstatic net/minecraftforge/common/util/ForgeDirection.WEST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   1913: aload #101
/*     */     //   1915: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   1918: ifeq -> 1927
/*     */     //   1921: iconst_1
/*     */     //   1922: istore #104
/*     */     //   1924: goto -> 1930
/*     */     //   1927: iconst_0
/*     */     //   1928: istore #104
/*     */     //   1930: iload #104
/*     */     //   1932: ifeq -> 2156
/*     */     //   1935: aload #96
/*     */     //   1937: astore #103
/*     */     //   1939: aload #103
/*     */     //   1941: astore #100
/*     */     //   1943: aload #100
/*     */     //   1945: astore #98
/*     */     //   1947: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   1950: aload #98
/*     */     //   1952: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   1955: astore #105
/*     */     //   1957: aload #105
/*     */     //   1959: invokevirtual isEmpty : ()Z
/*     */     //   1962: ifne -> 2146
/*     */     //   1965: aload #105
/*     */     //   1967: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1970: ifnull -> 2146
/*     */     //   1973: aload #105
/*     */     //   1975: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1978: checkcast scala/collection/SeqLike
/*     */     //   1981: iconst_3
/*     */     //   1982: invokeinterface lengthCompare : (I)I
/*     */     //   1987: iconst_0
/*     */     //   1988: if_icmpne -> 2146
/*     */     //   1991: aload #105
/*     */     //   1993: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1996: checkcast scala/collection/SeqLike
/*     */     //   1999: iconst_0
/*     */     //   2000: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   2005: checkcast net/minecraft/util/IIcon
/*     */     //   2008: astore #106
/*     */     //   2010: aload #105
/*     */     //   2012: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2015: checkcast scala/collection/SeqLike
/*     */     //   2018: iconst_1
/*     */     //   2019: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   2024: checkcast net/minecraft/util/IIcon
/*     */     //   2027: astore #107
/*     */     //   2029: aload #105
/*     */     //   2031: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2034: checkcast scala/collection/SeqLike
/*     */     //   2037: iconst_2
/*     */     //   2038: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   2043: checkcast net/minecraft/util/IIcon
/*     */     //   2046: astore #108
/*     */     //   2048: new scala/Tuple3
/*     */     //   2051: dup
/*     */     //   2052: aload #106
/*     */     //   2054: aload #107
/*     */     //   2056: aload #108
/*     */     //   2058: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   2061: astore #109
/*     */     //   2063: aload #109
/*     */     //   2065: astore #97
/*     */     //   2067: aload #97
/*     */     //   2069: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   2072: checkcast net/minecraft/util/IIcon
/*     */     //   2075: astore #110
/*     */     //   2077: aload #97
/*     */     //   2079: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   2082: checkcast net/minecraft/util/IIcon
/*     */     //   2085: astore #111
/*     */     //   2087: aload #97
/*     */     //   2089: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   2092: checkcast net/minecraft/util/IIcon
/*     */     //   2095: astore #112
/*     */     //   2097: aload #8
/*     */     //   2099: invokevirtual height : ()I
/*     */     //   2102: iconst_1
/*     */     //   2103: if_icmpne -> 2116
/*     */     //   2106: aload_0
/*     */     //   2107: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   2110: invokevirtual b2 : ()Lnet/minecraft/util/IIcon;
/*     */     //   2113: goto -> 2141
/*     */     //   2116: iload #32
/*     */     //   2118: iconst_0
/*     */     //   2119: if_icmpne -> 2127
/*     */     //   2122: aload #112
/*     */     //   2124: goto -> 2141
/*     */     //   2127: iload #32
/*     */     //   2129: iload #12
/*     */     //   2131: if_icmpne -> 2139
/*     */     //   2134: aload #110
/*     */     //   2136: goto -> 2141
/*     */     //   2139: aload #111
/*     */     //   2141: astore #35
/*     */     //   2143: goto -> 2914
/*     */     //   2146: new scala/MatchError
/*     */     //   2149: dup
/*     */     //   2150: aload #98
/*     */     //   2152: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   2155: athrow
/*     */     //   2156: new java/lang/AssertionError
/*     */     //   2159: dup
/*     */     //   2160: ldc 'yaw has invalid value'
/*     */     //   2162: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   2165: athrow
/*     */     //   2166: new scala/MatchError
/*     */     //   2169: dup
/*     */     //   2170: aload #88
/*     */     //   2172: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   2175: athrow
/*     */     //   2176: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2179: aload #33
/*     */     //   2181: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2184: ifeq -> 2193
/*     */     //   2187: iconst_1
/*     */     //   2188: istore #113
/*     */     //   2190: goto -> 2213
/*     */     //   2193: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2196: aload #33
/*     */     //   2198: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2201: ifeq -> 2210
/*     */     //   2204: iconst_1
/*     */     //   2205: istore #113
/*     */     //   2207: goto -> 2213
/*     */     //   2210: iconst_0
/*     */     //   2211: istore #113
/*     */     //   2213: iload #113
/*     */     //   2215: ifeq -> 2911
/*     */     //   2218: aload #6
/*     */     //   2220: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2223: astore #116
/*     */     //   2225: dup
/*     */     //   2226: ifnonnull -> 2238
/*     */     //   2229: pop
/*     */     //   2230: aload #116
/*     */     //   2232: ifnull -> 2246
/*     */     //   2235: goto -> 2250
/*     */     //   2238: aload #116
/*     */     //   2240: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2243: ifeq -> 2250
/*     */     //   2246: iconst_1
/*     */     //   2247: goto -> 2251
/*     */     //   2250: iconst_0
/*     */     //   2251: aload #8
/*     */     //   2253: invokevirtual pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2256: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2259: astore #117
/*     */     //   2261: dup
/*     */     //   2262: ifnonnull -> 2274
/*     */     //   2265: pop
/*     */     //   2266: aload #117
/*     */     //   2268: ifnull -> 2282
/*     */     //   2271: goto -> 2286
/*     */     //   2274: aload #117
/*     */     //   2276: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2279: ifeq -> 2286
/*     */     //   2282: iconst_1
/*     */     //   2283: goto -> 2287
/*     */     //   2286: iconst_0
/*     */     //   2287: ixor
/*     */     //   2288: ifeq -> 2315
/*     */     //   2291: new scala/Tuple2
/*     */     //   2294: dup
/*     */     //   2295: aload_0
/*     */     //   2296: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   2299: invokevirtual snw : ()[Lnet/minecraft/util/IIcon;
/*     */     //   2302: aload_0
/*     */     //   2303: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   2306: invokevirtual sse : ()[Lnet/minecraft/util/IIcon;
/*     */     //   2309: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   2312: goto -> 2336
/*     */     //   2315: new scala/Tuple2
/*     */     //   2318: dup
/*     */     //   2319: aload_0
/*     */     //   2320: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   2323: invokevirtual sse : ()[Lnet/minecraft/util/IIcon;
/*     */     //   2326: aload_0
/*     */     //   2327: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   2330: invokevirtual snw : ()[Lnet/minecraft/util/IIcon;
/*     */     //   2333: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   2336: astore #115
/*     */     //   2338: aload #115
/*     */     //   2340: ifnull -> 2901
/*     */     //   2343: aload #115
/*     */     //   2345: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   2348: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   2351: astore #118
/*     */     //   2353: aload #115
/*     */     //   2355: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   2358: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   2361: astore #119
/*     */     //   2363: new scala/Tuple2
/*     */     //   2366: dup
/*     */     //   2367: aload #118
/*     */     //   2369: aload #119
/*     */     //   2371: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   2374: astore #120
/*     */     //   2376: aload #120
/*     */     //   2378: astore #114
/*     */     //   2380: aload #114
/*     */     //   2382: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   2385: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   2388: astore #121
/*     */     //   2390: aload #114
/*     */     //   2392: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   2395: checkcast [Lnet/minecraft/util/IIcon;
/*     */     //   2398: astore #122
/*     */     //   2400: aload #8
/*     */     //   2402: invokevirtual pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2405: astore #125
/*     */     //   2407: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2410: aload #125
/*     */     //   2412: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2415: ifeq -> 2531
/*     */     //   2418: aload #8
/*     */     //   2420: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2423: astore #127
/*     */     //   2425: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2428: aload #127
/*     */     //   2430: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2433: ifeq -> 2448
/*     */     //   2436: aload_0
/*     */     //   2437: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   2440: invokevirtual th : ()[Lnet/minecraft/util/IIcon;
/*     */     //   2443: astore #128
/*     */     //   2445: goto -> 2514
/*     */     //   2448: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2451: aload #127
/*     */     //   2453: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2456: ifeq -> 2471
/*     */     //   2459: aload_0
/*     */     //   2460: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   2463: invokevirtual bh : ()[Lnet/minecraft/util/IIcon;
/*     */     //   2466: astore #128
/*     */     //   2468: goto -> 2514
/*     */     //   2471: getstatic net/minecraftforge/common/util/ForgeDirection.EAST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2474: aload #127
/*     */     //   2476: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2479: ifeq -> 2494
/*     */     //   2482: aload_0
/*     */     //   2483: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   2486: invokevirtual bv : ()[Lnet/minecraft/util/IIcon;
/*     */     //   2489: astore #128
/*     */     //   2491: goto -> 2514
/*     */     //   2494: getstatic net/minecraftforge/common/util/ForgeDirection.WEST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2497: aload #127
/*     */     //   2499: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2502: ifeq -> 2521
/*     */     //   2505: aload_0
/*     */     //   2506: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   2509: invokevirtual tv : ()[Lnet/minecraft/util/IIcon;
/*     */     //   2512: astore #128
/*     */     //   2514: aload #128
/*     */     //   2516: astore #126
/*     */     //   2518: goto -> 2637
/*     */     //   2521: new java/lang/AssertionError
/*     */     //   2524: dup
/*     */     //   2525: ldc 'yaw has invalid value'
/*     */     //   2527: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   2530: athrow
/*     */     //   2531: aload #8
/*     */     //   2533: invokevirtual yaw : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2536: astore #129
/*     */     //   2538: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2541: aload #129
/*     */     //   2543: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2546: ifeq -> 2555
/*     */     //   2549: iconst_1
/*     */     //   2550: istore #130
/*     */     //   2552: goto -> 2575
/*     */     //   2555: getstatic net/minecraftforge/common/util/ForgeDirection.WEST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2558: aload #129
/*     */     //   2560: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2563: ifeq -> 2572
/*     */     //   2566: iconst_1
/*     */     //   2567: istore #130
/*     */     //   2569: goto -> 2575
/*     */     //   2572: iconst_0
/*     */     //   2573: istore #130
/*     */     //   2575: iload #130
/*     */     //   2577: ifeq -> 2587
/*     */     //   2580: aload #121
/*     */     //   2582: astore #131
/*     */     //   2584: goto -> 2633
/*     */     //   2587: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2590: aload #129
/*     */     //   2592: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2595: ifeq -> 2604
/*     */     //   2598: iconst_1
/*     */     //   2599: istore #132
/*     */     //   2601: goto -> 2624
/*     */     //   2604: getstatic net/minecraftforge/common/util/ForgeDirection.EAST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2607: aload #129
/*     */     //   2609: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2612: ifeq -> 2621
/*     */     //   2615: iconst_1
/*     */     //   2616: istore #132
/*     */     //   2618: goto -> 2624
/*     */     //   2621: iconst_0
/*     */     //   2622: istore #132
/*     */     //   2624: iload #132
/*     */     //   2626: ifeq -> 2891
/*     */     //   2629: aload #122
/*     */     //   2631: astore #131
/*     */     //   2633: aload #131
/*     */     //   2635: astore #126
/*     */     //   2637: aload #126
/*     */     //   2639: astore #124
/*     */     //   2641: getstatic scala/Array$.MODULE$ : Lscala/Array$;
/*     */     //   2644: aload #124
/*     */     //   2646: invokevirtual unapplySeq : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   2649: astore #133
/*     */     //   2651: aload #133
/*     */     //   2653: invokevirtual isEmpty : ()Z
/*     */     //   2656: ifne -> 2881
/*     */     //   2659: aload #133
/*     */     //   2661: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2664: ifnull -> 2881
/*     */     //   2667: aload #133
/*     */     //   2669: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2672: checkcast scala/collection/SeqLike
/*     */     //   2675: iconst_3
/*     */     //   2676: invokeinterface lengthCompare : (I)I
/*     */     //   2681: iconst_0
/*     */     //   2682: if_icmpne -> 2881
/*     */     //   2685: aload #133
/*     */     //   2687: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2690: checkcast scala/collection/SeqLike
/*     */     //   2693: iconst_0
/*     */     //   2694: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   2699: checkcast net/minecraft/util/IIcon
/*     */     //   2702: astore #134
/*     */     //   2704: aload #133
/*     */     //   2706: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2709: checkcast scala/collection/SeqLike
/*     */     //   2712: iconst_1
/*     */     //   2713: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   2718: checkcast net/minecraft/util/IIcon
/*     */     //   2721: astore #135
/*     */     //   2723: aload #133
/*     */     //   2725: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   2728: checkcast scala/collection/SeqLike
/*     */     //   2731: iconst_2
/*     */     //   2732: invokeinterface apply : (I)Ljava/lang/Object;
/*     */     //   2737: checkcast net/minecraft/util/IIcon
/*     */     //   2740: astore #136
/*     */     //   2742: new scala/Tuple3
/*     */     //   2745: dup
/*     */     //   2746: aload #134
/*     */     //   2748: aload #135
/*     */     //   2750: aload #136
/*     */     //   2752: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   2755: astore #137
/*     */     //   2757: aload #137
/*     */     //   2759: astore #123
/*     */     //   2761: aload #123
/*     */     //   2763: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   2766: checkcast net/minecraft/util/IIcon
/*     */     //   2769: astore #138
/*     */     //   2771: aload #123
/*     */     //   2773: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   2776: checkcast net/minecraft/util/IIcon
/*     */     //   2779: astore #139
/*     */     //   2781: aload #123
/*     */     //   2783: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   2786: checkcast net/minecraft/util/IIcon
/*     */     //   2789: astore #140
/*     */     //   2791: aload #8
/*     */     //   2793: invokevirtual width : ()I
/*     */     //   2796: iconst_1
/*     */     //   2797: if_icmpne -> 2851
/*     */     //   2800: aload #8
/*     */     //   2802: invokevirtual pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2805: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2808: astore #141
/*     */     //   2810: dup
/*     */     //   2811: ifnonnull -> 2823
/*     */     //   2814: pop
/*     */     //   2815: aload #141
/*     */     //   2817: ifnull -> 2831
/*     */     //   2820: goto -> 2841
/*     */     //   2823: aload #141
/*     */     //   2825: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2828: ifeq -> 2841
/*     */     //   2831: aload_0
/*     */     //   2832: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   2835: invokevirtual b : ()Lnet/minecraft/util/IIcon;
/*     */     //   2838: goto -> 2876
/*     */     //   2841: aload_0
/*     */     //   2842: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   2845: invokevirtual b2 : ()Lnet/minecraft/util/IIcon;
/*     */     //   2848: goto -> 2876
/*     */     //   2851: iload #31
/*     */     //   2853: iconst_0
/*     */     //   2854: if_icmpne -> 2862
/*     */     //   2857: aload #140
/*     */     //   2859: goto -> 2876
/*     */     //   2862: iload #31
/*     */     //   2864: iload #11
/*     */     //   2866: if_icmpne -> 2874
/*     */     //   2869: aload #138
/*     */     //   2871: goto -> 2876
/*     */     //   2874: aload #139
/*     */     //   2876: astore #35
/*     */     //   2878: goto -> 2914
/*     */     //   2881: new scala/MatchError
/*     */     //   2884: dup
/*     */     //   2885: aload #124
/*     */     //   2887: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   2890: athrow
/*     */     //   2891: new java/lang/AssertionError
/*     */     //   2894: dup
/*     */     //   2895: ldc 'yaw has invalid value'
/*     */     //   2897: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   2900: athrow
/*     */     //   2901: new scala/MatchError
/*     */     //   2904: dup
/*     */     //   2905: aload #115
/*     */     //   2907: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   2910: athrow
/*     */     //   2911: aconst_null
/*     */     //   2912: astore #35
/*     */     //   2914: aload #35
/*     */     //   2916: astore #10
/*     */     //   2918: goto -> 3291
/*     */     //   2921: new scala/MatchError
/*     */     //   2924: dup
/*     */     //   2925: aload #21
/*     */     //   2927: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   2930: athrow
/*     */     //   2931: new java/lang/AssertionError
/*     */     //   2934: dup
/*     */     //   2935: ldc 'yaw has invalid value'
/*     */     //   2937: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   2940: athrow
/*     */     //   2941: new java/lang/AssertionError
/*     */     //   2944: dup
/*     */     //   2945: ldc_w 'pitch has invalid value'
/*     */     //   2948: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   2951: athrow
/*     */     //   2952: new scala/MatchError
/*     */     //   2955: dup
/*     */     //   2956: aload #14
/*     */     //   2958: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   2961: athrow
/*     */     //   2962: iload #7
/*     */     //   2964: ifeq -> 3282
/*     */     //   2967: aload #8
/*     */     //   2969: invokevirtual pitch : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2972: astore #144
/*     */     //   2974: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   2977: aload #144
/*     */     //   2979: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   2982: ifeq -> 3025
/*     */     //   2985: new scala/Tuple4
/*     */     //   2988: dup
/*     */     //   2989: aload_0
/*     */     //   2990: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   2993: invokevirtual f2 : ()Lnet/minecraft/util/IIcon;
/*     */     //   2996: aload_0
/*     */     //   2997: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   3000: invokevirtual b2 : ()Lnet/minecraft/util/IIcon;
/*     */     //   3003: aload_0
/*     */     //   3004: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   3007: invokevirtual b : ()Lnet/minecraft/util/IIcon;
/*     */     //   3010: aload_0
/*     */     //   3011: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   3014: invokevirtual b2 : ()Lnet/minecraft/util/IIcon;
/*     */     //   3017: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   3020: astore #145
/*     */     //   3022: goto -> 3062
/*     */     //   3025: new scala/Tuple4
/*     */     //   3028: dup
/*     */     //   3029: aload_0
/*     */     //   3030: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   3033: invokevirtual f : ()Lnet/minecraft/util/IIcon;
/*     */     //   3036: aload_0
/*     */     //   3037: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   3040: invokevirtual b : ()Lnet/minecraft/util/IIcon;
/*     */     //   3043: aload_0
/*     */     //   3044: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   3047: invokevirtual b2 : ()Lnet/minecraft/util/IIcon;
/*     */     //   3050: aload_0
/*     */     //   3051: invokevirtual Icons : ()Lli/cil/oc/common/block/Screen$Icons$;
/*     */     //   3054: invokevirtual b2 : ()Lnet/minecraft/util/IIcon;
/*     */     //   3057: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   3060: astore #145
/*     */     //   3062: aload #145
/*     */     //   3064: astore #143
/*     */     //   3066: aload #143
/*     */     //   3068: ifnull -> 3272
/*     */     //   3071: aload #143
/*     */     //   3073: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   3076: checkcast net/minecraft/util/IIcon
/*     */     //   3079: astore #146
/*     */     //   3081: aload #143
/*     */     //   3083: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   3086: checkcast net/minecraft/util/IIcon
/*     */     //   3089: astore #147
/*     */     //   3091: aload #143
/*     */     //   3093: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   3096: checkcast net/minecraft/util/IIcon
/*     */     //   3099: astore #148
/*     */     //   3101: aload #143
/*     */     //   3103: invokevirtual _4 : ()Ljava/lang/Object;
/*     */     //   3106: checkcast net/minecraft/util/IIcon
/*     */     //   3109: astore #149
/*     */     //   3111: new scala/Tuple4
/*     */     //   3114: dup
/*     */     //   3115: aload #146
/*     */     //   3117: aload #147
/*     */     //   3119: aload #148
/*     */     //   3121: aload #149
/*     */     //   3123: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   3126: astore #150
/*     */     //   3128: aload #150
/*     */     //   3130: astore #142
/*     */     //   3132: aload #142
/*     */     //   3134: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   3137: checkcast net/minecraft/util/IIcon
/*     */     //   3140: astore #151
/*     */     //   3142: aload #142
/*     */     //   3144: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   3147: checkcast net/minecraft/util/IIcon
/*     */     //   3150: astore #152
/*     */     //   3152: aload #142
/*     */     //   3154: invokevirtual _3 : ()Ljava/lang/Object;
/*     */     //   3157: checkcast net/minecraft/util/IIcon
/*     */     //   3160: astore #153
/*     */     //   3162: aload #142
/*     */     //   3164: invokevirtual _4 : ()Ljava/lang/Object;
/*     */     //   3167: checkcast net/minecraft/util/IIcon
/*     */     //   3170: astore #154
/*     */     //   3172: aload #6
/*     */     //   3174: astore #155
/*     */     //   3176: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   3179: aload #155
/*     */     //   3181: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   3184: ifeq -> 3194
/*     */     //   3187: aload #151
/*     */     //   3189: astore #156
/*     */     //   3191: goto -> 3265
/*     */     //   3194: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   3197: aload #155
/*     */     //   3199: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   3202: ifeq -> 3212
/*     */     //   3205: aload #152
/*     */     //   3207: astore #156
/*     */     //   3209: goto -> 3265
/*     */     //   3212: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   3215: aload #155
/*     */     //   3217: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   3220: ifeq -> 3229
/*     */     //   3223: iconst_1
/*     */     //   3224: istore #157
/*     */     //   3226: goto -> 3249
/*     */     //   3229: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   3232: aload #155
/*     */     //   3234: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   3237: ifeq -> 3246
/*     */     //   3240: iconst_1
/*     */     //   3241: istore #157
/*     */     //   3243: goto -> 3249
/*     */     //   3246: iconst_0
/*     */     //   3247: istore #157
/*     */     //   3249: iload #157
/*     */     //   3251: ifeq -> 3261
/*     */     //   3254: aload #153
/*     */     //   3256: astore #156
/*     */     //   3258: goto -> 3265
/*     */     //   3261: aload #154
/*     */     //   3263: astore #156
/*     */     //   3265: aload #156
/*     */     //   3267: astore #10
/*     */     //   3269: goto -> 3291
/*     */     //   3272: new scala/MatchError
/*     */     //   3275: dup
/*     */     //   3276: aload #143
/*     */     //   3278: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   3281: athrow
/*     */     //   3282: aload_0
/*     */     //   3283: aload #6
/*     */     //   3285: iconst_0
/*     */     //   3286: invokevirtual getIcon : (Lnet/minecraftforge/common/util/ForgeDirection;I)Lnet/minecraft/util/IIcon;
/*     */     //   3289: astore #10
/*     */     //   3291: aload #10
/*     */     //   3293: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #123	-> 0
/*     */     //   #122	-> 6
/*     */     //   #123	-> 18
/*     */     //   #124	-> 54
/*     */     //   #125	-> 63
/*     */     //   #126	-> 72
/*     */     //   #127	-> 129
/*     */     //   #128	-> 136
/*     */     //   #129	-> 163
/*     */     //   #130	-> 181
/*     */     //   #131	-> 192
/*     */     //   #132	-> 208
/*     */     //   #133	-> 219
/*     */     //   #134	-> 241
/*     */     //   #135	-> 252
/*     */     //   #136	-> 271
/*     */     //   #137	-> 282
/*     */     //   #129	-> 298
/*     */     //   #138	-> 305
/*     */     //   #140	-> 315
/*     */     //   #141	-> 333
/*     */     //   #142	-> 344
/*     */     //   #143	-> 363
/*     */     //   #144	-> 374
/*     */     //   #145	-> 393
/*     */     //   #146	-> 404
/*     */     //   #147	-> 426
/*     */     //   #148	-> 437
/*     */     //   #140	-> 450
/*     */     //   #127	-> 454
/*     */     //   #156	-> 508
/*     */     //   #157	-> 512
/*     */     //   #159	-> 554
/*     */     //   #160	-> 613
/*     */     //   #159	-> 641
/*     */     //   #158	-> 648
/*     */     //   #159	-> 693
/*     */     //   #158	-> 695
/*     */     //   #161	-> 727
/*     */     //   #162	-> 734
/*     */     //   #163	-> 752
/*     */     //   #164	-> 759
/*     */     //   #165	-> 808
/*     */     //   #163	-> 854
/*     */     //   #161	-> 858
/*     */     //   #169	-> 1394
/*     */     //   #170	-> 1403
/*     */     //   #171	-> 1414
/*     */     //   #172	-> 1426
/*     */     //   #174	-> 1431
/*     */     //   #175	-> 1440
/*     */     //   #176	-> 1451
/*     */     //   #177	-> 1463
/*     */     //   #180	-> 1468
/*     */     //   #181	-> 1474
/*     */     //   #182	-> 1485
/*     */     //   #183	-> 1497
/*     */     //   #185	-> 1502
/*     */     //   #186	-> 1509
/*     */     //   #187	-> 1520
/*     */     //   #188	-> 1532
/*     */     //   #191	-> 1537
/*     */     //   #192	-> 1548
/*     */     //   #193	-> 1560
/*     */     //   #157	-> 1562
/*     */     //   #161	-> 1567
/*     */     //   #166	-> 1577
/*     */     //   #159	-> 1587
/*     */     //   #196	-> 1597
/*     */     //   #198	-> 1639
/*     */     //   #199	-> 1698
/*     */     //   #198	-> 1726
/*     */     //   #197	-> 1733
/*     */     //   #198	-> 1778
/*     */     //   #197	-> 1780
/*     */     //   #200	-> 1812
/*     */     //   #201	-> 1819
/*     */     //   #202	-> 1837
/*     */     //   #203	-> 1844
/*     */     //   #204	-> 1893
/*     */     //   #202	-> 1939
/*     */     //   #200	-> 1943
/*     */     //   #208	-> 2097
/*     */     //   #209	-> 2106
/*     */     //   #212	-> 2116
/*     */     //   #213	-> 2127
/*     */     //   #214	-> 2139
/*     */     //   #196	-> 2141
/*     */     //   #200	-> 2146
/*     */     //   #205	-> 2156
/*     */     //   #198	-> 2166
/*     */     //   #216	-> 2176
/*     */     //   #218	-> 2218
/*     */     //   #219	-> 2315
/*     */     //   #218	-> 2336
/*     */     //   #217	-> 2343
/*     */     //   #218	-> 2376
/*     */     //   #217	-> 2378
/*     */     //   #220	-> 2400
/*     */     //   #221	-> 2407
/*     */     //   #222	-> 2425
/*     */     //   #223	-> 2448
/*     */     //   #224	-> 2471
/*     */     //   #225	-> 2494
/*     */     //   #221	-> 2514
/*     */     //   #226	-> 2521
/*     */     //   #228	-> 2531
/*     */     //   #229	-> 2538
/*     */     //   #230	-> 2587
/*     */     //   #228	-> 2633
/*     */     //   #220	-> 2637
/*     */     //   #234	-> 2791
/*     */     //   #235	-> 2800
/*     */     //   #236	-> 2841
/*     */     //   #239	-> 2851
/*     */     //   #240	-> 2862
/*     */     //   #241	-> 2874
/*     */     //   #216	-> 2876
/*     */     //   #220	-> 2881
/*     */     //   #231	-> 2891
/*     */     //   #218	-> 2901
/*     */     //   #243	-> 2911
/*     */     //   #156	-> 2914
/*     */     //   #123	-> 2916
/*     */     //   #127	-> 2921
/*     */     //   #149	-> 2931
/*     */     //   #151	-> 2941
/*     */     //   #126	-> 2952
/*     */     //   #122	-> 2962
/*     */     //   #246	-> 2967
/*     */     //   #247	-> 2974
/*     */     //   #248	-> 3025
/*     */     //   #246	-> 3062
/*     */     //   #250	-> 3172
/*     */     //   #251	-> 3176
/*     */     //   #252	-> 3194
/*     */     //   #253	-> 3212
/*     */     //   #254	-> 3261
/*     */     //   #250	-> 3265
/*     */     //   #245	-> 3267
/*     */     //   #246	-> 3272
/*     */     //   #256	-> 3282
/*     */     //   #122	-> 3291
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	3294	0	this	Lli/cil/oc/common/block/Screen;
/*     */     //   0	3294	1	world	Lnet/minecraft/world/IBlockAccess;
/*     */     //   0	3294	2	x	I
/*     */     //   0	3294	3	y	I
/*     */     //   0	3294	4	z	I
/*     */     //   0	3294	5	worldSide	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   0	3294	6	localSide	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   63	2853	11	right	I
/*     */     //   72	2844	12	bottom	I
/*     */     //   91	3203	15	px	I
/*     */     //   98	3196	16	py	I
/*     */     //   122	2794	18	px	I
/*     */     //   129	2787	19	py	I
/*     */     //   470	2824	28	lx	I
/*     */     //   477	2817	29	ly	I
/*     */     //   501	2415	31	lx	I
/*     */     //   508	2408	32	ly	I
/*     */     //   658	2636	39	ud	[Lnet/minecraft/util/IIcon;
/*     */     //   668	2626	40	sn	[Lnet/minecraft/util/IIcon;
/*     */     //   678	2616	41	ew	[Lnet/minecraft/util/IIcon;
/*     */     //   707	2587	43	ud	[Lnet/minecraft/util/IIcon;
/*     */     //   717	2577	44	sn	[Lnet/minecraft/util/IIcon;
/*     */     //   727	2567	45	ew	[Lnet/minecraft/util/IIcon;
/*     */     //   926	2368	55	ht	Lnet/minecraft/util/IIcon;
/*     */     //   945	2349	56	hm	Lnet/minecraft/util/IIcon;
/*     */     //   964	2330	57	hb	Lnet/minecraft/util/IIcon;
/*     */     //   983	2311	58	vt	Lnet/minecraft/util/IIcon;
/*     */     //   1002	2292	59	vm	Lnet/minecraft/util/IIcon;
/*     */     //   1021	2273	60	vb	Lnet/minecraft/util/IIcon;
/*     */     //   1041	2253	61	tl	Lnet/minecraft/util/IIcon;
/*     */     //   1061	2233	62	tm	Lnet/minecraft/util/IIcon;
/*     */     //   1081	2213	63	tr	Lnet/minecraft/util/IIcon;
/*     */     //   1101	2193	64	ml	Lnet/minecraft/util/IIcon;
/*     */     //   1121	2173	65	mm	Lnet/minecraft/util/IIcon;
/*     */     //   1141	2153	66	mr	Lnet/minecraft/util/IIcon;
/*     */     //   1161	2133	67	bl	Lnet/minecraft/util/IIcon;
/*     */     //   1181	2113	68	bm	Lnet/minecraft/util/IIcon;
/*     */     //   1201	2093	69	br	Lnet/minecraft/util/IIcon;
/*     */     //   1254	2040	71	ht	Lnet/minecraft/util/IIcon;
/*     */     //   1264	2030	72	hm	Lnet/minecraft/util/IIcon;
/*     */     //   1274	2020	73	hb	Lnet/minecraft/util/IIcon;
/*     */     //   1284	2010	74	vt	Lnet/minecraft/util/IIcon;
/*     */     //   1294	2000	75	vm	Lnet/minecraft/util/IIcon;
/*     */     //   1304	1990	76	vb	Lnet/minecraft/util/IIcon;
/*     */     //   1314	1980	77	tl	Lnet/minecraft/util/IIcon;
/*     */     //   1324	1970	78	tm	Lnet/minecraft/util/IIcon;
/*     */     //   1334	1960	79	tr	Lnet/minecraft/util/IIcon;
/*     */     //   1344	1950	80	ml	Lnet/minecraft/util/IIcon;
/*     */     //   1354	1940	81	mm	Lnet/minecraft/util/IIcon;
/*     */     //   1364	1930	82	mr	Lnet/minecraft/util/IIcon;
/*     */     //   1374	1920	83	bl	Lnet/minecraft/util/IIcon;
/*     */     //   1384	1910	84	bm	Lnet/minecraft/util/IIcon;
/*     */     //   1394	1900	85	br	Lnet/minecraft/util/IIcon;
/*     */     //   1743	1551	90	ud	[Lnet/minecraft/util/IIcon;
/*     */     //   1753	1541	91	sn	[Lnet/minecraft/util/IIcon;
/*     */     //   1763	1531	92	ew	[Lnet/minecraft/util/IIcon;
/*     */     //   1792	1502	94	ud	[Lnet/minecraft/util/IIcon;
/*     */     //   1802	1492	95	sn	[Lnet/minecraft/util/IIcon;
/*     */     //   1812	1482	96	ew	[Lnet/minecraft/util/IIcon;
/*     */     //   2010	1284	106	t	Lnet/minecraft/util/IIcon;
/*     */     //   2029	1265	107	m	Lnet/minecraft/util/IIcon;
/*     */     //   2048	1246	108	b	Lnet/minecraft/util/IIcon;
/*     */     //   2077	1217	110	t	Lnet/minecraft/util/IIcon;
/*     */     //   2087	1207	111	m	Lnet/minecraft/util/IIcon;
/*     */     //   2097	1197	112	b	Lnet/minecraft/util/IIcon;
/*     */     //   2353	941	118	sn	[Lnet/minecraft/util/IIcon;
/*     */     //   2363	931	119	ew	[Lnet/minecraft/util/IIcon;
/*     */     //   2390	904	121	sn	[Lnet/minecraft/util/IIcon;
/*     */     //   2400	894	122	ew	[Lnet/minecraft/util/IIcon;
/*     */     //   2704	590	134	t	Lnet/minecraft/util/IIcon;
/*     */     //   2723	571	135	m	Lnet/minecraft/util/IIcon;
/*     */     //   2742	552	136	b	Lnet/minecraft/util/IIcon;
/*     */     //   2771	523	138	t	Lnet/minecraft/util/IIcon;
/*     */     //   2781	513	139	m	Lnet/minecraft/util/IIcon;
/*     */     //   2791	503	140	b	Lnet/minecraft/util/IIcon;
/*     */     //   3081	213	146	f	Lnet/minecraft/util/IIcon;
/*     */     //   3091	203	147	b	Lnet/minecraft/util/IIcon;
/*     */     //   3101	193	148	t	Lnet/minecraft/util/IIcon;
/*     */     //   3111	183	149	s	Lnet/minecraft/util/IIcon;
/*     */     //   3142	125	151	f	Lnet/minecraft/util/IIcon;
/*     */     //   3152	115	152	b	Lnet/minecraft/util/IIcon;
/*     */     //   3162	105	153	t	Lnet/minecraft/util/IIcon;
/*     */     //   3172	95	154	s	Lnet/minecraft/util/IIcon;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IIcon getIcon(ForgeDirection side, int metadata)
/*     */   {
/*     */     IIcon iIcon;
/* 260 */     ForgeDirection forgeDirection = side;
/* 261 */     if (ForgeDirection.SOUTH.equals(forgeDirection)) { iIcon = Icons().f2(); }
/* 262 */     else { boolean bool; if (ForgeDirection.DOWN.equals(forgeDirection)) { bool = true; } else if (ForgeDirection.UP.equals(forgeDirection)) { bool = true; } else { bool = false; }  if (bool) { iIcon = Icons().b(); }
/* 263 */       else { iIcon = Icons().b2(); }
/*     */        }
/*     */     
/*     */     return iIcon; } public void func_149651_a(IIconRegister iconRegister) {
/* 267 */     Icons().b_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/b").toString()));
/* 268 */     Icons().b2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/b2").toString()));
/* 269 */     Icons().bbl_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bbl").toString()));
/* 270 */     Icons().bbl2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bbl2").toString()));
/* 271 */     Icons().bbm_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bbm").toString()));
/* 272 */     Icons().bbm2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bbm2").toString()));
/* 273 */     Icons().bbr_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bbr").toString()));
/* 274 */     Icons().bbr2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bbr2").toString()));
/* 275 */     Icons().bhb_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bhb").toString()));
/* 276 */     Icons().bhb2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bhb2").toString()));
/* 277 */     Icons().bhm_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bhm").toString()));
/* 278 */     Icons().bhm2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bhm2").toString()));
/* 279 */     Icons().bht_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bht").toString()));
/* 280 */     Icons().bht2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bht2").toString()));
/* 281 */     Icons().bml_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bml").toString()));
/* 282 */     Icons().bmm_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bmm").toString()));
/* 283 */     Icons().bmr_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bmr").toString()));
/* 284 */     Icons().btl_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/btl").toString()));
/* 285 */     Icons().btm_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/btm").toString()));
/* 286 */     Icons().btr_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/btr").toString()));
/* 287 */     Icons().bvb_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bvb").toString()));
/* 288 */     Icons().bvb2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bvb2").toString()));
/* 289 */     Icons().bvm_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bvm").toString()));
/* 290 */     Icons().bvt_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/bvt").toString()));
/* 291 */     Icons().f_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/f").toString()));
/* 292 */     Icons().f2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/f2").toString()));
/* 293 */     Icons().fbl_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fbl").toString()));
/* 294 */     Icons().fbl2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fbl2").toString()));
/* 295 */     Icons().fbm_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fbm").toString()));
/* 296 */     Icons().fbm2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fbm2").toString()));
/* 297 */     Icons().fbr_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fbr").toString()));
/* 298 */     Icons().fbr2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fbr2").toString()));
/* 299 */     Icons().fhb_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fhb").toString()));
/* 300 */     Icons().fhb2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fhb2").toString()));
/* 301 */     Icons().fhm_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fhm").toString()));
/* 302 */     Icons().fhm2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fhm2").toString()));
/* 303 */     Icons().fht_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fht").toString()));
/* 304 */     Icons().fht2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fht2").toString()));
/* 305 */     Icons().fml_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fml").toString()));
/* 306 */     Icons().fmm_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fmm").toString()));
/* 307 */     Icons().fmr_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fmr").toString()));
/* 308 */     Icons().ftl_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/ftl").toString()));
/* 309 */     Icons().ftm_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/ftm").toString()));
/* 310 */     Icons().ftr_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/ftr").toString()));
/* 311 */     Icons().fvb_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fvb").toString()));
/* 312 */     Icons().fvb2_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fvb2").toString()));
/* 313 */     Icons().fvm_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fvm").toString()));
/* 314 */     Icons().fvt_$eq(iconRegister.func_94245_a((new StringBuilder()).append(li.cil.oc.Settings$.MODULE$.resourceDomain()).append(":screen/fvt").toString()));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasTileEntity(int metadata) {
/* 319 */     return true;
/*     */   } public li.cil.oc.common.tileentity.Screen createTileEntity(World world, int metadata) {
/* 321 */     return new li.cil.oc.common.tileentity.Screen(tier());
/*     */   }
/*     */ 
/*     */   
/*     */   public void func_149689_a(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) {
/* 326 */     super.func_149689_a(world, x, y, z, player, stack);
/* 327 */     TileEntity tileEntity = world.func_147438_o(x, y, z);
/* 328 */     if (tileEntity instanceof li.cil.oc.common.tileentity.Screen) { li.cil.oc.common.tileentity.Screen screen = (li.cil.oc.common.tileentity.Screen)tileEntity; screen.delayUntilCheckForMultiBlock_$eq(0); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 329 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ) {
/* 334 */     return rightClick(world, x, y, z, player, side, hitX, hitY, hitZ, false);
/*     */   }
/*     */   
/*     */   public boolean rightClick(World world, int x, int y, int z, EntityPlayer player, ForgeDirection side, float hitX, float hitY, float hitZ, boolean force) {
/*     */     // Byte code:
/*     */     //   0: getstatic li/cil/oc/integration/util/Wrench$.MODULE$ : Lli/cil/oc/integration/util/Wrench$;
/*     */     //   3: aload #5
/*     */     //   5: getstatic li/cil/oc/util/BlockPosition$.MODULE$ : Lli/cil/oc/util/BlockPosition$;
/*     */     //   8: iload_2
/*     */     //   9: iload_3
/*     */     //   10: iload #4
/*     */     //   12: invokevirtual apply : (III)Lli/cil/oc/util/BlockPosition;
/*     */     //   15: invokevirtual holdsApplicableWrench : (Lnet/minecraft/entity/player/EntityPlayer;Lli/cil/oc/util/BlockPosition;)Z
/*     */     //   18: ifeq -> 58
/*     */     //   21: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   24: aload_0
/*     */     //   25: aload_1
/*     */     //   26: iload_2
/*     */     //   27: iload_3
/*     */     //   28: iload #4
/*     */     //   30: invokevirtual getValidRotations : (Lnet/minecraft/world/World;III)[Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   33: checkcast [Ljava/lang/Object;
/*     */     //   36: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   39: aload #6
/*     */     //   41: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   46: ifeq -> 58
/*     */     //   49: iload #10
/*     */     //   51: ifne -> 58
/*     */     //   54: iconst_0
/*     */     //   55: goto -> 309
/*     */     //   58: aload #5
/*     */     //   60: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */     //   63: invokestatic get : (Lnet/minecraft/item/ItemStack;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   66: ldc_w 'analyzer'
/*     */     //   69: invokestatic get : (Ljava/lang/String;)Lli/cil/oc/api/detail/ItemInfo;
/*     */     //   72: astore #11
/*     */     //   74: dup
/*     */     //   75: ifnonnull -> 87
/*     */     //   78: pop
/*     */     //   79: aload #11
/*     */     //   81: ifnull -> 95
/*     */     //   84: goto -> 99
/*     */     //   87: aload #11
/*     */     //   89: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   92: ifeq -> 99
/*     */     //   95: iconst_0
/*     */     //   96: goto -> 309
/*     */     //   99: iconst_0
/*     */     //   100: istore #12
/*     */     //   102: aconst_null
/*     */     //   103: astore #13
/*     */     //   105: aload_1
/*     */     //   106: iload_2
/*     */     //   107: iload_3
/*     */     //   108: iload #4
/*     */     //   110: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   113: astore #14
/*     */     //   115: aload #14
/*     */     //   117: instanceof li/cil/oc/common/tileentity/Screen
/*     */     //   120: ifeq -> 199
/*     */     //   123: iconst_1
/*     */     //   124: istore #12
/*     */     //   126: aload #14
/*     */     //   128: checkcast li/cil/oc/common/tileentity/Screen
/*     */     //   131: astore #13
/*     */     //   133: aload #13
/*     */     //   135: invokevirtual hasKeyboard : ()Z
/*     */     //   138: ifeq -> 199
/*     */     //   141: iload #10
/*     */     //   143: ifne -> 162
/*     */     //   146: aload #5
/*     */     //   148: invokevirtual func_70093_af : ()Z
/*     */     //   151: aload #13
/*     */     //   153: invokevirtual origin : ()Lli/cil/oc/common/tileentity/Screen;
/*     */     //   156: invokevirtual invertTouchMode : ()Z
/*     */     //   159: if_icmpne -> 199
/*     */     //   162: aload_1
/*     */     //   163: getfield field_72995_K : Z
/*     */     //   166: ifeq -> 193
/*     */     //   169: aload #5
/*     */     //   171: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   174: getstatic li/cil/oc/common/GuiType$.MODULE$ : Lli/cil/oc/common/GuiType$;
/*     */     //   177: invokevirtual Screen : ()Lli/cil/oc/common/GuiType$EnumVal;
/*     */     //   180: invokeinterface id : ()I
/*     */     //   185: aload_1
/*     */     //   186: iload_2
/*     */     //   187: iload_3
/*     */     //   188: iload #4
/*     */     //   190: invokevirtual openGui : (Ljava/lang/Object;ILnet/minecraft/world/World;III)V
/*     */     //   193: iconst_1
/*     */     //   194: istore #15
/*     */     //   196: goto -> 307
/*     */     //   199: iload #12
/*     */     //   201: ifeq -> 304
/*     */     //   204: aload #13
/*     */     //   206: invokevirtual tier : ()I
/*     */     //   209: iconst_0
/*     */     //   210: if_icmple -> 304
/*     */     //   213: aload #6
/*     */     //   215: aload #13
/*     */     //   217: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   220: astore #16
/*     */     //   222: dup
/*     */     //   223: ifnonnull -> 235
/*     */     //   226: pop
/*     */     //   227: aload #16
/*     */     //   229: ifnull -> 243
/*     */     //   232: goto -> 304
/*     */     //   235: aload #16
/*     */     //   237: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   240: ifeq -> 304
/*     */     //   243: aload_1
/*     */     //   244: getfield field_72995_K : Z
/*     */     //   247: ifeq -> 298
/*     */     //   250: aload #5
/*     */     //   252: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
/*     */     //   255: getfield field_71439_g : Lnet/minecraft/client/entity/EntityClientPlayerMP;
/*     */     //   258: astore #17
/*     */     //   260: dup
/*     */     //   261: ifnonnull -> 273
/*     */     //   264: pop
/*     */     //   265: aload #17
/*     */     //   267: ifnull -> 281
/*     */     //   270: goto -> 298
/*     */     //   273: aload #17
/*     */     //   275: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   278: ifeq -> 298
/*     */     //   281: aload #13
/*     */     //   283: fload #7
/*     */     //   285: f2d
/*     */     //   286: fload #8
/*     */     //   288: f2d
/*     */     //   289: fload #9
/*     */     //   291: f2d
/*     */     //   292: invokevirtual click : (DDD)Z
/*     */     //   295: goto -> 299
/*     */     //   298: iconst_1
/*     */     //   299: istore #15
/*     */     //   301: goto -> 307
/*     */     //   304: iconst_0
/*     */     //   305: istore #15
/*     */     //   307: iload #15
/*     */     //   309: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #338	-> 0
/*     */     //   #339	-> 58
/*     */     //   #341	-> 99
/*     */     //   #340	-> 105
/*     */     //   #341	-> 115
/*     */     //   #345	-> 162
/*     */     //   #346	-> 169
/*     */     //   #348	-> 193
/*     */     //   #341	-> 194
/*     */     //   #340	-> 199
/*     */     //   #349	-> 204
/*     */     //   #350	-> 243
/*     */     //   #351	-> 281
/*     */     //   #353	-> 298
/*     */     //   #350	-> 299
/*     */     //   #354	-> 304
/*     */     //   #340	-> 307
/*     */     //   #338	-> 309
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	310	0	this	Lli/cil/oc/common/block/Screen;
/*     */     //   0	310	1	world	Lnet/minecraft/world/World;
/*     */     //   0	310	2	x	I
/*     */     //   0	310	3	y	I
/*     */     //   0	310	4	z	I
/*     */     //   0	310	5	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   0	310	6	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   0	310	7	hitX	F
/*     */     //   0	310	8	hitY	F
/*     */     //   0	310	9	hitZ	F
/*     */     //   0	310	10	force	Z
/*     */   }
/*     */   
/*     */   public void func_149724_b(World world, int x, int y, int z, Entity entity) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getfield field_72995_K : Z
/*     */     //   4: ifne -> 92
/*     */     //   7: aload_1
/*     */     //   8: iload_2
/*     */     //   9: iload_3
/*     */     //   10: iload #4
/*     */     //   12: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   15: astore #6
/*     */     //   17: aload #6
/*     */     //   19: instanceof li/cil/oc/common/tileentity/Screen
/*     */     //   22: ifeq -> 87
/*     */     //   25: aload #6
/*     */     //   27: checkcast li/cil/oc/common/tileentity/Screen
/*     */     //   30: astore #7
/*     */     //   32: aload #7
/*     */     //   34: invokevirtual tier : ()I
/*     */     //   37: iconst_0
/*     */     //   38: if_icmple -> 87
/*     */     //   41: aload #7
/*     */     //   43: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   46: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   49: astore #8
/*     */     //   51: dup
/*     */     //   52: ifnonnull -> 64
/*     */     //   55: pop
/*     */     //   56: aload #8
/*     */     //   58: ifnull -> 72
/*     */     //   61: goto -> 87
/*     */     //   64: aload #8
/*     */     //   66: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   69: ifeq -> 87
/*     */     //   72: aload #7
/*     */     //   74: aload #5
/*     */     //   76: invokevirtual walk : (Lnet/minecraft/entity/Entity;)V
/*     */     //   79: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   82: astore #9
/*     */     //   84: goto -> 92
/*     */     //   87: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   90: astore #9
/*     */     //   92: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #359	-> 0
/*     */     //   #360	-> 17
/*     */     //   #361	-> 87
/*     */     //   #359	-> 92
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	93	0	this	Lli/cil/oc/common/block/Screen;
/*     */     //   0	93	1	world	Lnet/minecraft/world/World;
/*     */     //   0	93	2	x	I
/*     */     //   0	93	3	y	I
/*     */     //   0	93	4	z	I
/*     */     //   0	93	5	entity	Lnet/minecraft/entity/Entity;
/*     */   }
/*     */   
/*     */   public void func_149670_a(World world, int x, int y, int z, Entity entity) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: getfield field_72995_K : Z
/*     */     //   4: ifeq -> 347
/*     */     //   7: new scala/Tuple2
/*     */     //   10: dup
/*     */     //   11: aload #5
/*     */     //   13: aload_1
/*     */     //   14: iload_2
/*     */     //   15: iload_3
/*     */     //   16: iload #4
/*     */     //   18: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   21: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   24: astore #6
/*     */     //   26: aload #6
/*     */     //   28: ifnull -> 342
/*     */     //   31: aload #6
/*     */     //   33: invokevirtual _1 : ()Ljava/lang/Object;
/*     */     //   36: checkcast net/minecraft/entity/Entity
/*     */     //   39: astore #7
/*     */     //   41: aload #6
/*     */     //   43: invokevirtual _2 : ()Ljava/lang/Object;
/*     */     //   46: checkcast net/minecraft/tileentity/TileEntity
/*     */     //   49: astore #8
/*     */     //   51: aload #7
/*     */     //   53: instanceof net/minecraft/entity/projectile/EntityArrow
/*     */     //   56: ifeq -> 342
/*     */     //   59: aload #7
/*     */     //   61: checkcast net/minecraft/entity/projectile/EntityArrow
/*     */     //   64: astore #9
/*     */     //   66: aload #8
/*     */     //   68: instanceof li/cil/oc/common/tileentity/Screen
/*     */     //   71: ifeq -> 342
/*     */     //   74: aload #8
/*     */     //   76: checkcast li/cil/oc/common/tileentity/Screen
/*     */     //   79: astore #10
/*     */     //   81: aload #10
/*     */     //   83: invokevirtual tier : ()I
/*     */     //   86: iconst_0
/*     */     //   87: if_icmple -> 342
/*     */     //   90: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   93: dconst_0
/*     */     //   94: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   97: dconst_1
/*     */     //   98: aload #9
/*     */     //   100: getfield field_70165_t : D
/*     */     //   103: iload_2
/*     */     //   104: i2d
/*     */     //   105: dsub
/*     */     //   106: invokevirtual min : (DD)D
/*     */     //   109: invokevirtual max : (DD)D
/*     */     //   112: dstore #12
/*     */     //   114: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   117: dconst_0
/*     */     //   118: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   121: dconst_1
/*     */     //   122: aload #9
/*     */     //   124: getfield field_70163_u : D
/*     */     //   127: iload_3
/*     */     //   128: i2d
/*     */     //   129: dsub
/*     */     //   130: invokevirtual min : (DD)D
/*     */     //   133: invokevirtual max : (DD)D
/*     */     //   136: dstore #14
/*     */     //   138: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   141: dconst_0
/*     */     //   142: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   145: dconst_1
/*     */     //   146: aload #9
/*     */     //   148: getfield field_70161_v : D
/*     */     //   151: iload #4
/*     */     //   153: i2d
/*     */     //   154: dsub
/*     */     //   155: invokevirtual min : (DD)D
/*     */     //   158: invokevirtual max : (DD)D
/*     */     //   161: dstore #16
/*     */     //   163: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   166: dload #12
/*     */     //   168: ldc2_w 0.5
/*     */     //   171: dsub
/*     */     //   172: invokevirtual abs : (D)D
/*     */     //   175: dstore #18
/*     */     //   177: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   180: dload #14
/*     */     //   182: ldc2_w 0.5
/*     */     //   185: dsub
/*     */     //   186: invokevirtual abs : (D)D
/*     */     //   189: dstore #20
/*     */     //   191: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   194: dload #16
/*     */     //   196: ldc2_w 0.5
/*     */     //   199: dsub
/*     */     //   200: invokevirtual abs : (D)D
/*     */     //   203: dstore #22
/*     */     //   205: dload #18
/*     */     //   207: dload #20
/*     */     //   209: dcmpl
/*     */     //   210: ifle -> 242
/*     */     //   213: dload #18
/*     */     //   215: dload #22
/*     */     //   217: dcmpl
/*     */     //   218: ifle -> 242
/*     */     //   221: dload #12
/*     */     //   223: ldc2_w 0.5
/*     */     //   226: dcmpg
/*     */     //   227: ifge -> 236
/*     */     //   230: getstatic net/minecraftforge/common/util/ForgeDirection.WEST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   233: goto -> 289
/*     */     //   236: getstatic net/minecraftforge/common/util/ForgeDirection.EAST : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   239: goto -> 289
/*     */     //   242: dload #20
/*     */     //   244: dload #22
/*     */     //   246: dcmpl
/*     */     //   247: ifle -> 271
/*     */     //   250: dload #14
/*     */     //   252: ldc2_w 0.5
/*     */     //   255: dcmpg
/*     */     //   256: ifge -> 265
/*     */     //   259: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   262: goto -> 289
/*     */     //   265: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   268: goto -> 289
/*     */     //   271: dload #16
/*     */     //   273: ldc2_w 0.5
/*     */     //   276: dcmpg
/*     */     //   277: ifge -> 286
/*     */     //   280: getstatic net/minecraftforge/common/util/ForgeDirection.NORTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   283: goto -> 289
/*     */     //   286: getstatic net/minecraftforge/common/util/ForgeDirection.SOUTH : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   289: astore #24
/*     */     //   291: aload #24
/*     */     //   293: aload #10
/*     */     //   295: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   298: astore #25
/*     */     //   300: dup
/*     */     //   301: ifnonnull -> 313
/*     */     //   304: pop
/*     */     //   305: aload #25
/*     */     //   307: ifnull -> 321
/*     */     //   310: goto -> 334
/*     */     //   313: aload #25
/*     */     //   315: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   318: ifeq -> 334
/*     */     //   321: aload #10
/*     */     //   323: aload #9
/*     */     //   325: invokevirtual shot : (Lnet/minecraft/entity/projectile/EntityArrow;)V
/*     */     //   328: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   331: goto -> 337
/*     */     //   334: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   337: astore #11
/*     */     //   339: goto -> 347
/*     */     //   342: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */     //   345: astore #11
/*     */     //   347: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #365	-> 0
/*     */     //   #366	-> 31
/*     */     //   #367	-> 90
/*     */     //   #368	-> 114
/*     */     //   #369	-> 138
/*     */     //   #370	-> 163
/*     */     //   #371	-> 177
/*     */     //   #372	-> 191
/*     */     //   #373	-> 205
/*     */     //   #374	-> 221
/*     */     //   #375	-> 236
/*     */     //   #377	-> 242
/*     */     //   #378	-> 250
/*     */     //   #379	-> 265
/*     */     //   #382	-> 271
/*     */     //   #383	-> 286
/*     */     //   #373	-> 289
/*     */     //   #385	-> 291
/*     */     //   #386	-> 321
/*     */     //   #385	-> 334
/*     */     //   #366	-> 337
/*     */     //   #388	-> 342
/*     */     //   #365	-> 347
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	348	0	this	Lli/cil/oc/common/block/Screen;
/*     */     //   0	348	1	world	Lnet/minecraft/world/World;
/*     */     //   0	348	2	x	I
/*     */     //   0	348	3	y	I
/*     */     //   0	348	4	z	I
/*     */     //   0	348	5	entity	Lnet/minecraft/entity/Entity;
/*     */     //   41	307	7	arrow	Lnet/minecraft/entity/Entity;
/*     */     //   51	297	8	screen	Lnet/minecraft/tileentity/TileEntity;
/*     */     //   114	234	12	hitX	D
/*     */     //   138	210	14	hitY	D
/*     */     //   163	185	16	hitZ	D
/*     */     //   177	171	18	absX	D
/*     */     //   191	157	20	absY	D
/*     */     //   205	143	22	absZ	D
/*     */     //   291	57	24	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */   }
/*     */   
/*     */   public ForgeDirection[] getValidRotations(World world, int x, int y, int z) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: iload_2
/*     */     //   2: iload_3
/*     */     //   3: iload #4
/*     */     //   5: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*     */     //   8: astore #5
/*     */     //   10: aload #5
/*     */     //   12: instanceof li/cil/oc/common/tileentity/Screen
/*     */     //   15: ifeq -> 128
/*     */     //   18: aload #5
/*     */     //   20: checkcast li/cil/oc/common/tileentity/Screen
/*     */     //   23: astore #6
/*     */     //   25: aload #6
/*     */     //   27: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   30: getstatic net/minecraftforge/common/util/ForgeDirection.UP : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   33: astore #8
/*     */     //   35: dup
/*     */     //   36: ifnonnull -> 48
/*     */     //   39: pop
/*     */     //   40: aload #8
/*     */     //   42: ifnull -> 87
/*     */     //   45: goto -> 56
/*     */     //   48: aload #8
/*     */     //   50: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   53: ifne -> 87
/*     */     //   56: aload #6
/*     */     //   58: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   61: getstatic net/minecraftforge/common/util/ForgeDirection.DOWN : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   64: astore #9
/*     */     //   66: dup
/*     */     //   67: ifnonnull -> 79
/*     */     //   70: pop
/*     */     //   71: aload #9
/*     */     //   73: ifnull -> 87
/*     */     //   76: goto -> 93
/*     */     //   79: aload #9
/*     */     //   81: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   84: ifeq -> 93
/*     */     //   87: getstatic net/minecraftforge/common/util/ForgeDirection.VALID_DIRECTIONS : [Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   90: goto -> 123
/*     */     //   93: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   96: getstatic net/minecraftforge/common/util/ForgeDirection.VALID_DIRECTIONS : [Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   99: checkcast [Ljava/lang/Object;
/*     */     //   102: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   105: new li/cil/oc/common/block/Screen$$anonfun$getValidRotations$1
/*     */     //   108: dup
/*     */     //   109: aload_0
/*     */     //   110: aload #6
/*     */     //   112: invokespecial <init> : (Lli/cil/oc/common/block/Screen;Lli/cil/oc/common/tileentity/Screen;)V
/*     */     //   115: invokeinterface filter : (Lscala/Function1;)Ljava/lang/Object;
/*     */     //   120: checkcast [Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   123: astore #7
/*     */     //   125: goto -> 139
/*     */     //   128: aload_0
/*     */     //   129: aload_1
/*     */     //   130: iload_2
/*     */     //   131: iload_3
/*     */     //   132: iload #4
/*     */     //   134: invokespecial getValidRotations : (Lnet/minecraft/world/World;III)[Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   137: astore #7
/*     */     //   139: aload #7
/*     */     //   141: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #394	-> 0
/*     */     //   #395	-> 10
/*     */     //   #396	-> 25
/*     */     //   #397	-> 93
/*     */     //   #398	-> 105
/*     */     //   #397	-> 115
/*     */     //   #396	-> 123
/*     */     //   #400	-> 128
/*     */     //   #394	-> 139
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	142	0	this	Lli/cil/oc/common/block/Screen;
/*     */     //   0	142	1	world	Lnet/minecraft/world/World;
/*     */     //   0	142	2	x	I
/*     */     //   0	142	3	y	I
/*     */     //   0	142	4	z	I
/*     */   }
/*     */   
/*     */   public final class Screen$$anonfun$getValidRotations$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final li.cil.oc.common.tileentity.Screen x2$1;
/*     */     
/*     */     public final boolean apply(ForgeDirection d) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: aload_0
/*     */       //   2: getfield x2$1 : Lli/cil/oc/common/tileentity/Screen;
/*     */       //   5: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   8: astore_2
/*     */       //   9: dup
/*     */       //   10: ifnonnull -> 21
/*     */       //   13: pop
/*     */       //   14: aload_2
/*     */       //   15: ifnull -> 59
/*     */       //   18: goto -> 28
/*     */       //   21: aload_2
/*     */       //   22: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   25: ifne -> 59
/*     */       //   28: aload_1
/*     */       //   29: aload_0
/*     */       //   30: getfield x2$1 : Lli/cil/oc/common/tileentity/Screen;
/*     */       //   33: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   36: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   39: astore_3
/*     */       //   40: dup
/*     */       //   41: ifnonnull -> 52
/*     */       //   44: pop
/*     */       //   45: aload_3
/*     */       //   46: ifnull -> 59
/*     */       //   49: goto -> 63
/*     */       //   52: aload_3
/*     */       //   53: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   56: ifeq -> 63
/*     */       //   59: iconst_0
/*     */       //   60: goto -> 64
/*     */       //   63: iconst_1
/*     */       //   64: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #398	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	65	0	this	Lli/cil/oc/common/block/Screen$$anonfun$getValidRotations$1;
/*     */       //   0	65	1	d	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     }
/*     */     
/*     */     public Screen$$anonfun$getValidRotations$1(Screen $outer, li.cil.oc.common.tileentity.Screen x2$1) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\block\Screen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */