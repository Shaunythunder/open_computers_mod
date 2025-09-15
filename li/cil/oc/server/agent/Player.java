/*     */ package li.cil.oc.server.agent;
/*     */ 
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import cpw.mods.fml.common.ObfuscationReflectionHelper;
/*     */ import cpw.mods.fml.common.eventhandler.Event;
/*     */ import java.util.UUID;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.event.RobotAttackEntityEvent;
/*     */ import li.cil.oc.api.event.RobotExhaustionEvent;
/*     */ import li.cil.oc.api.event.RobotPlaceBlockEvent;
/*     */ import li.cil.oc.api.internal.Agent;
/*     */ import li.cil.oc.api.network.Connector;
/*     */ import li.cil.oc.api.network.EnvironmentHost;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.integration.Mods$;
/*     */ import li.cil.oc.integration.util.PortalGun$;
/*     */ import li.cil.oc.util.BlockPosition;
/*     */ import li.cil.oc.util.BlockPosition$;
/*     */ import li.cil.oc.util.InventoryUtils$;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.IMerchant;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.item.EntityMinecartHopper;
/*     */ import net.minecraft.entity.passive.EntityHorse;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.inventory.Container;
/*     */ import net.minecraft.inventory.ContainerPlayer;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemBlock;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTBase;
/*     */ import net.minecraft.network.NetHandlerPlayServer;
/*     */ import net.minecraft.potion.PotionEffect;
/*     */ import net.minecraft.tileentity.TileEntityBeacon;
/*     */ import net.minecraft.tileentity.TileEntityBrewingStand;
/*     */ import net.minecraft.tileentity.TileEntityDispenser;
/*     */ import net.minecraft.tileentity.TileEntityFurnace;
/*     */ import net.minecraft.tileentity.TileEntityHopper;
/*     */ import net.minecraft.util.AxisAlignedBB;
/*     */ import net.minecraft.util.ChunkCoordinates;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraft.world.WorldServer;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.common.util.FakePlayer;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.event.entity.player.PlayerInteractEvent;
/*     */ import scala.Enumeration;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Serializable;
/*     */ import scala.collection.GenTraversableOnce;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.convert.WrapAsScala$;
/*     */ import scala.collection.mutable.Buffer;
/*     */ import scala.collection.mutable.Buffer$;
/*     */ import scala.reflect.ClassTag;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.reflect.package$;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.NonLocalReturnControl;
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
/*     */ @ScalaSignature(bytes = "\006\001\025uu!B\001\003\021\003i\021A\002)mCf,'O\003\002\004\t\005)\021mZ3oi*\021QAB\001\007g\026\024h/\032:\013\005\035A\021AA8d\025\tI!\"A\002dS2T\021aC\001\003Y&\034\001\001\005\002\017\0375\t!AB\003\021\005!\005\021C\001\004QY\006LXM]\n\003\037I\001\"a\005\f\016\003QQ\021!F\001\006g\016\fG.Y\005\003/Q\021a!\0218z%\0264\007\"B\r\020\t\003Q\022A\002\037j]&$h\bF\001\016\021\025ar\002\"\001\036\003)\001(o\0344jY\0264uN\035\013\003=!\002\"a\b\024\016\003\001R!!\t\022\002\017\005,H\017\0337jE*\0211\005J\001\007[>T\027M\\4\013\003\025\n1aY8n\023\t9\003EA\006HC6,\007K]8gS2,\007\"B\002\034\001\004I\003C\001\0260\033\005Y#B\001\027.\003!Ig\016^3s]\006d'B\001\030\007\003\r\t\007/[\005\003a-\022Q!Q4f]RDQAM\b\005\002M\nQ\002Z3uKJl\027N\\3V+&#EC\001\033=!\t)$(D\0017\025\t9\004(\001\003vi&d'\"A\035\002\t)\fg/Y\005\003wY\022A!V+J\t\"9Q(\rI\001\002\004q\024A\0039mCf,'/V+J\tB\0311c\020\033\n\005\001#\"AB(qi&|g\016C\003C\037\021\0051)A\rva\022\fG/\032)pg&$\030n\0348B]\022\024v\016^1uS>tGC\002#H\013\003+\031\t\005\002\024\013&\021a\t\006\002\005+:LG\017C\003I\003\002\007\021*\001\004qY\006LXM\035\t\003\035)3A\001\005\002\001\027N\021!\n\024\t\003\033Vk\021A\024\006\003o=S!\001U)\002\r\r|W.\\8o\025\t\0216+\001\bnS:,7M]1gi\032|'oZ3\013\003Q\0131A\\3u\023\t1fJ\001\006GC.,\007\013\\1zKJD\001b\001&\003\006\004%\t\001W\013\002S!A!L\023B\001B\003%\021&\001\004bO\026tG\017\t\005\0063)#\t\001\030\013\003\023vCQaA.A\002%Bqa\030&A\002\023\005\001-\001\004gC\016LgnZ\013\002CB\021QJY\005\003G:\023aBR8sO\026$\025N]3di&|g\016C\004f\025\002\007I\021\0014\002\025\031\f7-\0338h?\022*\027\017\006\002EO\"9\001\016ZA\001\002\004\t\027a\001=%c!1!N\023Q!\n\005\fqAZ1dS:<\007\005C\004m\025\002\007I\021\0011\002\tMLG-\032\005\b]*\003\r\021\"\001p\003!\031\030\016Z3`I\025\fHC\001#q\021\035AW.!AA\002\005DaA\035&!B\023\t\027!B:jI\026\004\003\"\003;K\001\004\005\r\021\"\001v\0035\033Wo\035;p[&#X-\\%o+N,')Z2bkN,W*\0338fGJ\fg\r^%t\0052|w\016Z=TiV\004\030\016Z!oI6\0137.Z:SC:$w.\\'fi\"|Gm]\"mS\026tGoU5eK\022,\022A\036\t\003orl\021\001\037\006\003sj\fA!\033;f[*\0211pU\001\n[&tWm\031:bMRL!! =\003\023%#X-\\*uC\016\\\007BC@K\001\004\005\r\021\"\001\002\002\005\t6-^:u_6LE/Z7J]V\033XMQ3dCV\034X-T5oK\016\024\030M\032;Jg\ncwn\0343z'R,\b/\0333B]\022l\025m[3t%\006tGm\\7NKRDw\016Z:DY&,g\016^*jI\026$w\fJ3r)\r!\0251\001\005\bQz\f\t\0211\001w\021\035\t9A\023Q!\nY\fajY;ti>l\027\n^3n\023:,6/\032\"fG\006,8/Z'j]\026\034'/\0314u\023N\024En\\8esN#X\017]5e\003:$W*Y6fgJ\013g\016Z8n\033\026$\bn\0343t\0072LWM\034;TS\022,G\r\t\005\b\003\027QE\021AA\007\003\0259xN\0357e+\t\ty\001\005\003\002\022\005UQBAA\n\025\r\tYA_\005\005\003/\t\031BA\003X_JdG\rC\004\002\034)#\t%!\b\002)\035,G\017\0257bs\026\0248i\\8sI&t\027\r^3t)\t\ty\002\005\003\002\"\005\025RBAA\022\025\t9$0\003\003\002(\005\r\"\001E\"ik:\\7i\\8sI&t\027\r^3t\021\035\tYC\023C!\003[\t1cZ3u\t\0264\027-\0367u\013f,\007*Z5hQR$\"!a\f\021\007M\t\t$C\002\0024Q\021QA\0227pCRDq!a\016K\t\003\nI$\001\bhKR$\025n\0359mCft\025-\\3\025\005\005m\002\003BA\037\003\007j!!a\020\013\007\005\005\003(\001\003mC:<\027\002BA#\003\021aa\025;sS:<\007bBA%\025\022\005\0211J\001\016G2|7/Z:u\013:$\030\016^=\026\t\0055\023q\013\013\005\003\037\ny\b\006\003\002R\005=\004\003B\n@\003'\002B!!\026\002X1\001A\001CA-\003\017\022\r!a\027\003\tQK\b/Z\t\005\003;\n\031\007E\002\024\003?J1!!\031\025\005\035qu\016\0365j]\036\004B!!\032\002l5\021\021q\r\006\004\003SR\030AB3oi&$\0300\003\003\002n\005\035$AB#oi&$\030\020\003\006\002r\005\035\023\021!a\002\003g\n!\"\032<jI\026t7-\032\0232!\031\t)(a\037\002T5\021\021q\017\006\004\003s\"\022a\002:fM2,7\r^\005\005\003{\n9H\001\005DY\006\0348\017V1h\021!a\027q\tI\001\002\004\t\007bBAB\025\022\005\021QQ\001\017K:$\030\016^5fg>s7+\0333f+\021\t9)!(\025\t\005%\025Q\025\013\005\003\027\013y\n\005\004\002\016\006]\0251T\007\003\003\037SA!!%\002\024\0069Q.\036;bE2,'bAAK)\005Q1m\0347mK\016$\030n\0348\n\t\005e\025q\022\002\007\005V4g-\032:\021\t\005U\023Q\024\003\t\0033\n\tI1\001\002\\!Q\021\021UAA\003\003\005\035!a)\002\025\0254\030\016Z3oG\026$#\007\005\004\002v\005m\0241\024\005\007Y\006\005\005\031A1\t\017\005%&\n\"\001\002,\006yQM\034;ji&,7/\0238CY>\0347.\006\003\002.\006UF\003BAX\003{#B!!-\0028B1\021QRAL\003g\003B!!\026\0026\022A\021\021LAT\005\004\tY\006\003\006\002:\006\035\026\021!a\002\003w\013!\"\032<jI\026t7-\032\0234!\031\t)(a\037\0024\"A\021qXAT\001\004\t\t-\001\005cY>\0347\016U8t!\021\t\031-a2\016\005\005\025'BA\034\007\023\021\tI-!2\003\033\tcwnY6Q_NLG/[8o\021\035\tiM\023C\005\003\037\fQ\"\0313kC\016,g\016^%uK6\034XCAAi!\031\ti)a&\002TB!\021Q[Am\033\t\t9NC\002z\003OJA!a7\002X\nQQI\034;jifLE/Z7\t\017\005}'\n\"\003\002b\006\0312m\0347mK\016$HI]8qa\026$\027\n^3ngR\031A)a9\t\021\005\025\030Q\034a\001\003O\f1\"\033;f[N\024UMZ8sKB1\021\021^A}\003'tA!a;\002v:!\021Q^Az\033\t\tyOC\002\002r2\ta\001\020:p_Rt\024\"A\013\n\007\005]H#A\004qC\016\\\027mZ3\n\t\005m\030Q \002\t\023R,'/\0312mK*\031\021q\037\013\t\017\t\005!\n\"\021\003\004\005\t\023\r\036;bG.$\026M]4fi\026sG/\033;z/&$\bnQ;se\026tG/\023;f[R\031AI!\002\t\021\005%\024q a\001\003GBqA!\003K\t\003\022Y!\001\007j]R,'/Y2u/&$\b\016\006\003\003\016\tM\001cA\n\003\020%\031!\021\003\013\003\017\t{w\016\\3b]\"A\021\021\016B\004\001\004\t\031\007C\004\003\030)#\tA!\007\002-\005\034G/\033<bi\026\024En\\2l\037J,6/Z%uK6$\"Ca\007\003,\tU\"\021\bB\037\005\021\031Ea\022\003LA!!Q\004B\022\035\rq!qD\005\004\005C\021\021AD!di&4\030\r^5p]RK\b/Z\005\005\005K\0219CA\003WC2,X-C\002\003*Q\0211\"\0228v[\026\024\030\r^5p]\"A!Q\006B\013\001\004\021y#A\001y!\r\031\"\021G\005\004\005g!\"aA%oi\"A!q\007B\013\001\004\021y#A\001z\021!\021YD!\006A\002\t=\022!\001>\t\0171\024)\0021\001\0030!A!\021\tB\013\001\004\ty#\001\003iSRD\006\002\003B#\005+\001\r!a\f\002\t!LG/\027\005\t\005\023\022)\0021\001\0020\005!\001.\033;[\021!\021iE!\006A\002\t=\023\001\0033ve\006$\030n\0348\021\007M\021\t&C\002\003TQ\021a\001R8vE2,\007b\002B,\025\022\005!\021L\001\020kN,W)];jaB,G-\023;f[R!!Q\002B.\021!\021iE!\026A\002\t=\003b\002B0\025\022%!\021M\001\013iJLXk]3Ji\026lGC\002B\007\005G\0229\007C\004\003f\tu\003\031\001<\002\013M$\030mY6\t\021\t5#Q\fa\001\005\037BqAa\033K\t\003\021i'\001\006qY\006\034WM\0217pG.$\"C!\004\003p\tM$Q\017B<\005s\022YH! \003\000!A!\021\017B5\001\004\021y#\001\003tY>$\b\002\003B\027\005S\002\rAa\f\t\021\t]\"\021\016a\001\005_A\001Ba\017\003j\001\007!q\006\005\bY\n%\004\031\001B\030\021!\021\tE!\033A\002\005=\002\002\003B#\005S\002\r!a\f\t\021\t%#\021\016a\001\003_AqAa!K\t\003\021))\001\006dY&\0347N\0217pG.$BBa\024\003\b\n%%1\022BG\005\037C\001B!\f\003\002\002\007!q\006\005\t\005o\021\t\t1\001\0030!A!1\bBA\001\004\021y\003C\004m\005\003\003\rAa\f\t\025\tE%\021\021I\001\002\004\021i!A\005j[6,G-[1uK\"9!Q\023&\005\n\t]\025\001E5t\023R,W.V:f\0032dwn^3e)\021\021iA!'\t\017\t\025$1\023a\001m\"9!Q\024&\005B\t}\025A\b3s_B\004F.Y=fe&#X-\\,ji\"\024\026M\0343p[\016Cw.[2f)\031\t\031N!)\003$\"9!Q\rBN\001\0041\b\002\003BS\0057\003\rA!\004\002\017%t\007\013\\1dK\"9!\021\026&\005\n\t-\026\001D:i_VdGmQ1oG\026dG\003\002B\007\005[C\001Ba,\003(\002\007!\021W\001\002MB)1Ca-\0038&\031!Q\027\013\003\023\031+hn\031;j_:\004\004\003\002B]\005\007l!Aa/\013\007!\023iL\003\003\002j\t}&b\001Ba#\006)QM^3oi&!!Q\031B^\005M\001F.Y=fe&sG/\032:bGR,e/\0328u\021\035\021IM\023C\005\005\027\f1cY1mYV\033\030N\\4Ji\026l\027J\\*m_R,BA!4\003RRQ!q\032Bo\005W\024iO!>\021\t\005U#\021\033\003\t\005'\0249M1\001\003V\n\tA+\005\003\002^\t]\007cA\n\003Z&\031!1\034\013\003\007\005s\027\020\003\005\003`\n\035\007\031\001Bq\003%IgN^3oi>\024\030\020\005\003\003d\n\035XB\001Bs\025\r\021yN_\005\005\005S\024)O\001\006J\023:4XM\034;pefD\001B!\035\003H\002\007!q\006\005\t\005_\0239\r1\001\003pB11C!=w\005\037L1Aa=\025\005%1UO\\2uS>t\027\007\003\006\003x\n\035\007\023!a\001\005\033\taA]3qC&\024\bb\002B~\025\022%!Q`\001\niJL(+\0329bSJ$R\001\022B\000\007\003AqA!\032\003z\002\007a\017C\004\004\004\te\b\031\001<\002\021=dGm\025;bG.Dqaa\002K\t\023\031I!A\026uef\004F.Y2f\0052|7m[,iS2,\007*\0318eY&twMR;o]f\034\006/Z2jC2\034\025m]3t)I\021iaa\003\004\016\r=1\021CB\n\007+\0319b!\007\t\017\t\0254Q\001a\001m\"A!QFB\003\001\004\021y\003\003\005\0038\r\025\001\031\001B\030\021!\021Yd!\002A\002\t=\002b\0027\004\006\001\007!q\006\005\t\005\003\032)\0011\001\0020!A!QIB\003\001\004\ty\003\003\005\003J\r\025\001\031AA\030\021\035\031iB\023C\005\007?\t!#[:T_6,7*\0338e\037\032\004\026n\035;p]R!!QBB\021\021\035\021)ga\007A\002YDqa!\nK\t\003\0329#\001\007tKRLE/Z7J]V\033X\rF\003E\007S\031Y\003C\004\003f\r\r\002\031\001<\t\021\r521\005a\001\005_\t1\"^:f\tV\024\030\r^5p]\"91\021\007&\005B\rM\022AD2mK\006\024\030\n^3n\023:,6/\032\013\002\t\"91q\007&\005B\re\022!D1eI\026C\b.Y;ti&|g\016F\002E\007wA\001b!\020\0046\001\007\021qF\001\007C6|WO\034;\t\017\r\005#\n\"\021\004D\005\021B-[:qY\006Lx)V%NKJ\034\007.\0318u)\025!5QIB(\021!\0319ea\020A\002\r%\023\001C7fe\016D\027M\034;\021\t\005\02541J\005\005\007\033\n9GA\005J\033\026\0248\r[1oi\"A1\021KB \001\004\031\031&\001\003oC6,\007\003BB+\0077r1aEB,\023\r\031I\006F\001\007!J,G-\0324\n\t\005\0253Q\f\006\004\0073\"\002bBB1\025\022\00531G\001\fG2|7/Z*de\026,g\016C\004\004f)#\tea\r\002\023M<\030N\\4Ji\026l\007bBB5\025\022\00531N\001\033G\006t7i\\7nC:$7+\0328eKJ,6/Z\"p[6\fg\016\032\013\007\005\033\031ig!\035\t\021\r=4q\ra\001\005_\tQ\001\\3wK2D\001ba\035\004h\001\00711K\001\bG>lW.\0318e\021\035\0319H\023C!\007s\nqbY1o\003R$\030mY6QY\006LXM\035\013\005\005\033\031Y\bC\004I\007k\002\ra! \021\t\r}41Q\007\003\007\003S1\001SA4\023\021\031)i!!\003\031\025sG/\033;z!2\f\0270\032:\t\017\r%%\n\"\021\004\f\00611-\0318FCR$BA!\004\004\016\"A1qRBD\001\004\021i!A\003wC2,X\rC\004\004\024*#\te!&\002%%\034\bk\034;j_:\f\005\017\0357jG\006\024G.\032\013\005\005\033\0319\n\003\005\004\032\016E\005\031ABN\003\031)gMZ3diB!1QTBR\033\t\031yJC\002\004\"j\fa\001]8uS>t\027\002BBS\007?\023A\002U8uS>tWI\0324fGRDqa!+K\t\003\032Y+A\tbiR\f7m[#oi&$\0300Q:N_\n$BA!\004\004.\"A\021\021NBT\001\004\t\031\007C\004\0042*#\tea-\002!\005$H/Y2l\013:$\030\016^=Ge>lGC\002B\007\007k\033y\f\003\005\0048\016=\006\031AB]\003\031\031x.\036:dKB!\021\021EB^\023\021\031i,a\t\003\031\021\013W.Y4f'>,(oY3\t\021\r\0057q\026a\001\003_\ta\001Z1nC\036,\007bBBc\025\022\0053qY\001\005Q\026\fG\016F\002E\007\023D\001b!\020\004D\002\007\021q\006\005\b\007\033TE\021IBh\003%\031X\r\036%fC2$\b\016F\002E\007#D\001ba$\004L\002\007\021q\006\005\b\007+TE\021IB\032\003\035\031X\r\036#fC\022Dqa!7K\t\003\032\031$\001\bp]2Kg/\0338h+B$\027\r^3\t\017\ru'\n\"\021\004`\006aqN\\%uK6\004\026nY6vaR)Ai!9\004d\"A\021\021NBn\001\004\t\031\007\003\005\004f\016m\007\031\001B\030\003\025\031w.\0368u\021\035\031IO\023C!\007W\fQc]3u\007V\024(/\0328u\023R,Wn\024:Be6|'\017F\003E\007[\034y\017\003\005\003r\r\035\b\031\001B\030\021\035\021)ga:A\002YDqaa=K\t\003\032)0\001\ttKR\024VM^3oO\026$\026M]4fiR\031Aia>\t\021\005%4\021\037a\001\007s\004B!!\032\004|&!1Q`A4\005A)e\016^5us2Kg/\0338h\005\006\034X\rC\004\005\002)#\t\005b\001\002\037M,G\017T1ti\006#H/Y2lKJ$2\001\022C\003\021!\tIga@A\002\005\r\004b\002C\005\025\022\005C1B\001\f[>,h\016^#oi&$\030\020F\002E\t\033A\001\"!\033\005\b\001\007\0211\r\005\b\t#QE\021\tC\n\0031\031H.Z3q\023:\024U\rZ!u)!!)\002\"\t\005$\021\025\002\003\002C\f\t;i!\001\"\007\013\t\021m1\021Q\001\r\013:$\030\016^=QY\006LXM]\005\005\t?!IB\001\006F]Vl7\013^1ukND\001B!\f\005\020\001\007!q\006\005\t\005o!y\0011\001\0030!A!1\bC\b\001\004\021y\003C\004\005*)#\t\005b\013\002\035\005$Gm\0215bi6+7o]1hKR\031A\t\"\f\t\021\021=Bq\005a\001\tc\tq!\\3tg\006<W\r\005\003\002\"\021M\022\002\002C\033\003G\021a\"S\"iCR\034u.\0349p]\026tG\017C\004\005:)#\t\005b\017\002'\021L7\017\0357bs\036+\026jV8sW\n,gn\0315\025\017\021#i\004b\020\005B!A!Q\006C\034\001\004\021y\003\003\005\0038\021]\002\031\001B\030\021!\021Y\004b\016A\002\t=\002b\002C#\025\022\005CqI\001\026I&\034\b\017\\1z\017VKUI\\2iC:$X.\0328u)%!E\021\nC&\t\033\"y\005\003\005\003.\021\r\003\031\001B\030\021!\0219\004b\021A\002\t=\002\002\003B\036\t\007\002\rAa\f\t\021\021EC1\ta\001\007'\n1!\0333l\021\035!)F\023C!\t/\nq\002Z5ta2\f\027pR+J\003:4\030\016\034\013\b\t\022eC1\fC/\021!\021i\003b\025A\002\t=\002\002\003B\034\t'\002\rAa\f\t\021\tmB1\013a\001\005_Aq\001\"\031K\t\003\"\031'A\beSN\004H.Y=H+&\033\005.Z:u)\r!EQ\r\005\t\005?$y\0061\001\003b\"9A\021\016&\005B\021-\024\001\0073jgBd\027-_$V\023\"{\007\017]3s\033&tWmY1siR\031A\t\"\034\t\021\021=Dq\ra\001\tc\nAaY1siB!\021Q\033C:\023\021!)(a6\003)\025sG/\033;z\033&tWmY1si\"{\007\017]3s\021\035!IH\023C!\tw\nq\002Z5ta2\f\027pR+J\021>\0248/\032\013\006\t\022uDQ\022\005\t\t\"9\b1\001\005\002\006)\001n\034:tKB!A1\021CE\033\t!)I\003\003\005\b\006\035\024a\0029bgNLg/Z\005\005\t\027#)IA\006F]RLG/\037%peN,\007\002\003Bp\to\002\rA!9\t\017\021E%\n\"\021\005\024\006ia-\0368d?F\"d'\r\0315?\006$2\001\022CK\021!!9\nb$A\002\021e\025A\003;jY\026,e\016^5usB!A1\024CQ\033\t!iJC\002\005 j\f!\002^5mK\026tG/\033;z\023\021!\031\013\"(\003!QKG.Z#oi&$\030PQ3bG>t\007b\002CT\025\022\005C\021V\001\016MVt7mX\0315mAJ\004hX1\025\007\021#Y\013\003\005\005\030\022\025\006\031\001CW!\021!Y\nb,\n\t\021EFQ\024\002\027)&dW-\0228uSRL(I]3xS:<7\013^1oI\"9AQ\027&\005B\021]\026!\0044v]\016|\026\007\016\0342aIz\026\rF\002E\tsC\001\002b&\0054\002\007A1\030\t\005\t7#i,\003\003\005@\022u%a\005+jY\026,e\016^5us\022K7\017]3og\026\024\bb\002Cb\025\022\005CQY\001\016MVt7mX\0315mE\002\024gX1\025\007\021#9\r\003\005\005\030\022\005\007\031\001Ce!\021!Y\nb3\n\t\0215GQ\024\002\022)&dW-\0228uSRLh)\036:oC\016,\007b\002Ci\025\022\005C1[\001\016MVt7mX\0315mAJ4gX1\025\007\021#)\016\003\005\005\030\022=\007\031\001Cl!\021!Y\n\"7\n\t\021mGQ\024\002\021)&dW-\0228uSRL\bj\0349qKJ4a\001b8K\001\021\005(A\004#b[\006<Wm\024<feRKW.Z\n\004\t;\024\002B\003%\005^\n\025\r\021\"\001\005fV\t\021\n\003\006\005j\022u'\021!Q\001\n%\013q\001\0357bs\026\024\b\005C\006\003.\021u'Q1A\005\002\0215XC\001B\030\021-!\t\020\"8\003\002\003\006IAa\f\002\005a\004\003b\003B\034\t;\024)\031!C\001\t[D1\002b>\005^\n\005\t\025!\003\0030\005\021\021\020\t\005\f\005w!iN!b\001\n\003!i\017C\006\005~\022u'\021!Q\001\n\t=\022A\001>!\021)aGQ\034BC\002\023\005AQ\036\005\013e\022u'\021!Q\001\n\t=\002bCC\003\t;\024)\031!C\001\t[\f!\002^5dWN$v\016^1m\021-)I\001\"8\003\002\003\006IAa\f\002\027QL7m[:U_R\fG\016\t\005\b3\021uG\021AC\007)9)y!b\005\006\026\025]Q\021DC\016\013;\001B!\"\005\005^6\t!\n\003\004I\013\027\001\r!\023\005\t\005[)Y\0011\001\0030!A!qGC\006\001\004\021y\003\003\005\003<\025-\001\031\001B\030\021\035aW1\002a\001\005_A\001\"\"\002\006\f\001\007!q\006\005\013\003\027!iN1A\005\002\0055\001\"CC\022\t;\004\013\021BA\b\003\0319xN\0357eA!QQq\005Co\001\004%\t\001\"<\002\013QL7m[:\t\025\025-BQ\034a\001\n\003)i#A\005uS\016\\7o\030\023fcR\031A)b\f\t\023!,I#!AA\002\t=\002\"CC\032\t;\004\013\025\002B\030\003\031!\030nY6tA!QQq\007Co\001\004%\t\001\"<\002\0351\f7\017\036#b[\006<WmU3oi\"QQ1\bCo\001\004%\t!\"\020\002%1\f7\017\036#b[\006<WmU3oi~#S-\035\013\004\t\026}\002\"\0035\006:\005\005\t\031\001B\030\021%)\031\005\"8!B\023\021y#A\bmCN$H)Y7bO\026\034VM\034;!\021!)9\005\"8\005\002\rM\022\001\002;jG.D\021\"b\023K#\003%\t!\"\024\002/\rdwn]3ti\026sG/\033;zI\021,g-Y;mi\022\nT\003BC(\013K*\"!\"\025+\007\005,\031f\013\002\006VA!QqKC1\033\t)IF\003\003\006\\\025u\023!C;oG\",7m[3e\025\r)y\006F\001\013C:tw\016^1uS>t\027\002BC2\0133\022\021#\0368dQ\026\0347.\0323WCJL\027M\\2f\t!\tI&\"\023C\002\005m\003\"CC5\025F\005I\021BC6\003u\031\027\r\0347Vg&tw-\023;f[&s7\013\\8uI\021,g-Y;mi\022\"T\003BC7\013c*\"!b\034+\t\t5Q1\013\003\t\005',9G1\001\003V\"IQQ\017&\022\002\023\005QQN\001\025G2L7m\033\"m_\016\\G\005Z3gCVdG\017J\033\t\035\025e$\n%A\002\002\003%I!b\037\006\000\00593/\0369fe\022\nG\017^1dWR\013'oZ3u\013:$\030\016^=XSRD7)\036:sK:$\030\n^3n)\r!UQ\020\005\nQ\026]\024\021!a\001\003GJAA!\001\004\004\")q,\021a\001C\")A.\021a\001C\"9QqQ\b\005\002\025%\025aF:fi&sg/\0328u_JL\b\013\\1zKJLE/Z7t)\r!U1\022\005\007\021\026\025\005\031A%\t\017\025=u\002\"\001\006\022\006aB-\032;fGRLeN^3oi>\024\030\020\0257bs\026\0248\t[1oO\026\034Hc\001#\006\024\"1\001*\"$A\002%C\021\"b&\020#\003%\t!\"'\002/\021,G/\032:nS:,W+V%EI\021,g-Y;mi\022\nTCACNU\rqT1\013")
/*     */ public class Player
/*     */   extends FakePlayer
/*     */ {
/*     */   private final Agent agent;
/*     */   private ForgeDirection facing;
/*     */   private ForgeDirection side;
/*     */   private ItemStack customItemInUseBecauseMinecraftIsBloodyStupidAndMakesRandomMethodsClientSided;
/*     */   
/*     */   public Agent agent() {
/* 130 */     return this.agent; } public Player(Agent agent) { super((WorldServer)agent.world(), Player$.MODULE$.profileFor(agent));
/* 131 */     ((EntityPlayerMP)this).field_71135_a = new NetHandlerPlayServer(this.field_71133_b, FakeNetworkManager$.MODULE$, (EntityPlayerMP)this);
/*     */     
/* 133 */     this.field_71075_bZ.field_75101_c = true;
/* 134 */     this.field_71075_bZ.field_75102_a = true;
/* 135 */     this.field_71075_bZ.field_75100_b = true;
/* 136 */     ((Entity)this).field_70122_E = true;
/* 137 */     ((Entity)this).field_70129_M = 0.5F;
/* 138 */     ((EntityPlayer)this).eyeHeight = 0.0F;
/* 139 */     func_70105_a(1.0F, 1.0F);
/*     */ 
/*     */     
/* 142 */     Inventory inventory = new Inventory(agent);
/* 143 */     if (Mods$.MODULE$.BattleGear2().isAvailable()) {
/* 144 */       ObfuscationReflectionHelper.setPrivateValue(EntityPlayer.class, this, inventory, new String[] { "inventory", "field_71071_by", "bm" });
/*     */     } else {
/* 146 */       ((EntityPlayer)this).field_71071_by = inventory;
/* 147 */     }  this.field_71071_by.field_70458_d = (EntityPlayer)this;
/*     */ 
/*     */     
/* 150 */     ((EntityPlayer)this).field_71069_bz = (Container)new ContainerPlayer(this.field_71071_by, !(world()).field_72995_K, (EntityPlayer)this);
/* 151 */     ((EntityPlayer)this).field_71070_bA = this.field_71069_bz;
/*     */ 
/*     */     
/* 154 */     this.facing = ForgeDirection.SOUTH; this.side = ForgeDirection.SOUTH;
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
/* 166 */     this.field_71134_c.setBlockReachDistance(1.0D); }
/*     */   public ForgeDirection facing() { return this.facing; }
/*     */   public void facing_$eq(ForgeDirection x$1) { this.facing = x$1; }
/*     */   public ForgeDirection side() { return this.side; }
/* 170 */   public void side_$eq(ForgeDirection x$1) { this.side = x$1; } public ItemStack customItemInUseBecauseMinecraftIsBloodyStupidAndMakesRandomMethodsClientSided() { return this.customItemInUseBecauseMinecraftIsBloodyStupidAndMakesRandomMethodsClientSided; } public <Type extends Entity> ForgeDirection closestEntity$default$1() { return facing(); }
/* 171 */   public void customItemInUseBecauseMinecraftIsBloodyStupidAndMakesRandomMethodsClientSided_$eq(ItemStack x$1) { this.customItemInUseBecauseMinecraftIsBloodyStupidAndMakesRandomMethodsClientSided = x$1; } public World world() { return agent().world(); } public ChunkCoordinates func_82114_b() { return BlockPosition$.MODULE$.apply((EnvironmentHost)agent()).toChunkCoordinates(); } public float getDefaultEyeHeight() { return 0.0F; } public String getDisplayName() { return agent().name(); } public <Type extends Entity> Option<Type> closestEntity(ForgeDirection side, ClassTag evidence$1) { AxisAlignedBB bounds = BlockPosition$.MODULE$.apply((EnvironmentHost)agent()).offset(side).bounds();
/* 172 */     return Option$.MODULE$.apply(world().func_72857_a(package$.MODULE$.classTag(evidence$1).runtimeClass(), bounds, (Entity)this)).map((Function1)new Player$$anonfun$closestEntity$1(this)); } public final class Player$$anonfun$closestEntity$1 extends AbstractFunction1<Entity, Type> implements Serializable { public static final long serialVersionUID = 0L; public final Type apply(Entity x$1) { return (Type)x$1; }
/*     */     
/*     */     public Player$$anonfun$closestEntity$1(Player $outer) {} }
/*     */   public <Type extends Entity> Buffer<Type> entitiesOnSide(ForgeDirection side, ClassTag<Type> evidence$2) {
/* 176 */     return entitiesInBlock(BlockPosition$.MODULE$.apply((EnvironmentHost)agent()).offset(side), evidence$2);
/*     */   }
/*     */   
/*     */   public <Type extends Entity> Buffer<Type> entitiesInBlock(BlockPosition blockPos, ClassTag evidence$3) {
/* 180 */     return (Buffer<Type>)WrapAsScala$.MODULE$.asScalaBuffer(world().func_72872_a(package$.MODULE$.classTag(evidence$3).runtimeClass(), blockPos.bounds())).map((Function1)new Player$$anonfun$entitiesInBlock$1(this), Buffer$.MODULE$.canBuildFrom()); } public final class Player$$anonfun$entitiesInBlock$1 extends AbstractFunction1<Object, Type> implements Serializable { public static final long serialVersionUID = 0L; public final Type apply(Object x$2) { return (Type)x$2; }
/*     */     
/*     */     public Player$$anonfun$entitiesInBlock$1(Player $outer) {} }
/*     */   
/* 184 */   private Buffer<EntityItem> adjacentItems() { return (Buffer<EntityItem>)WrapAsScala$.MODULE$.asScalaBuffer(world().func_72872_a(EntityItem.class, BlockPosition$.MODULE$.apply((EnvironmentHost)agent()).bounds().func_72314_b(2.0D, 2.0D, 2.0D))).map((Function1)new Player$$anonfun$adjacentItems$1(this), Buffer$.MODULE$.canBuildFrom()); } public final class Player$$anonfun$adjacentItems$1 extends AbstractFunction1<Object, EntityItem> implements Serializable { public static final long serialVersionUID = 0L; public final EntityItem apply(Object x$3) { return (EntityItem)x$3; }
/*     */     
/*     */     public Player$$anonfun$adjacentItems$1(Player $outer) {} }
/*     */   
/* 188 */   private void collectDroppedItems(Iterable itemsBefore) { Buffer<EntityItem> itemsAfter = adjacentItems();
/* 189 */     Buffer itemsDropped = itemsAfter.$minus$minus((GenTraversableOnce)itemsBefore);
/* 190 */     if (itemsDropped.nonEmpty())
/* 191 */       itemsDropped.foreach((Function1)new Player$$anonfun$collectDroppedItems$1(this));  } public final class Player$$anonfun$collectDroppedItems$1 extends AbstractFunction1<EntityItem, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public Player$$anonfun$collectDroppedItems$1(Player $outer) {} public final void apply(EntityItem drop) {
/* 192 */       drop.field_145804_b = 0;
/* 193 */       drop.func_70100_b_((EntityPlayer)this.$outer);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_71059_n(Entity entity)
/*     */   {
/* 201 */     callUsingItemInSlot(agent().equipmentInventory(), 0, (Function1<ItemStack, ?>)new Player$$anonfun$attackTargetEntityWithCurrentItem$1(this, entity), callUsingItemInSlot$default$4()); } public final class Player$$anonfun$attackTargetEntityWithCurrentItem$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final Entity entity$1; public final Object apply(ItemStack stack) { Entity entity = this.entity$1;
/* 202 */       if (entity instanceof EntityPlayer) { EntityPlayer entityPlayer = (EntityPlayer)entity; if (!this.$outer.func_96122_a(entityPlayer)) return BoxedUnit.UNIT;  }
/*     */       
/* 204 */       RobotAttackEntityEvent.Pre event = new RobotAttackEntityEvent.Pre(this.$outer.agent(), this.entity$1);
/* 205 */       MinecraftForge.EVENT_BUS.post((Event)event);
/*     */       
/* 207 */       this.$outer.li$cil$oc$server$agent$Player$$super$attackTargetEntityWithCurrentItem(this.entity$1);
/* 208 */       return event.isCanceled() ? BoxedUnit.UNIT : BoxesRunTime.boxToBoolean(MinecraftForge.EVENT_BUS.post((Event)new RobotAttackEntityEvent.Post(this.$outer.agent(), this.entity$1))); }
/*     */      public Player$$anonfun$attackTargetEntityWithCurrentItem$1(Player $outer, Entity entity$1) {} }
/*     */   public boolean func_70998_m(Entity entity) {
/*     */     boolean cancel;
/*     */     try {
/*     */     
/*     */     } finally {
/* 215 */       Exception exception = null;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 221 */     return (!cancel && BoxesRunTime.unboxToBoolean(callUsingItemInSlot(agent().equipmentInventory(), 0, (Function1<ItemStack, ?>)new Player$$anonfun$interactWith$1(this, entity), callUsingItemInSlot$default$4())));
/*     */   } public final class Player$$anonfun$1 extends AbstractFunction1<StackTraceElement, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(StackTraceElement x$4) {
/*     */       return x$4.getClassName().startsWith("mods.battlegear2.");
/*     */     }
/*     */     public Player$$anonfun$1(Player $outer) {} }
/*     */   public final class Player$$anonfun$interactWith$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Entity entity$2;
/*     */     public Player$$anonfun$interactWith$1(Player $outer, Entity entity$2) {}
/*     */     public final boolean apply(ItemStack stack) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   4: aload_1
/*     */       //   5: invokevirtual li$cil$oc$server$agent$Player$$isItemUseAllowed : (Lnet/minecraft/item/ItemStack;)Z
/*     */       //   8: ifeq -> 86
/*     */       //   11: aload_0
/*     */       //   12: getfield entity$2 : Lnet/minecraft/entity/Entity;
/*     */       //   15: aload_0
/*     */       //   16: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   19: invokevirtual func_130002_c : (Lnet/minecraft/entity/player/EntityPlayer;)Z
/*     */       //   22: ifne -> 82
/*     */       //   25: aload_0
/*     */       //   26: getfield entity$2 : Lnet/minecraft/entity/Entity;
/*     */       //   29: astore_3
/*     */       //   30: aload_3
/*     */       //   31: instanceof net/minecraft/entity/EntityLivingBase
/*     */       //   34: ifeq -> 74
/*     */       //   37: aload_3
/*     */       //   38: checkcast net/minecraft/entity/EntityLivingBase
/*     */       //   41: astore #4
/*     */       //   43: aload_0
/*     */       //   44: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   47: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */       //   50: ifnull -> 74
/*     */       //   53: aload_0
/*     */       //   54: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   57: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */       //   60: aload_0
/*     */       //   61: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   64: aload #4
/*     */       //   66: invokevirtual func_111282_a : (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;)Z
/*     */       //   69: istore #5
/*     */       //   71: goto -> 77
/*     */       //   74: iconst_0
/*     */       //   75: istore #5
/*     */       //   77: iload #5
/*     */       //   79: ifeq -> 86
/*     */       //   82: iconst_1
/*     */       //   83: goto -> 87
/*     */       //   86: iconst_0
/*     */       //   87: istore_2
/*     */       //   88: aload_0
/*     */       //   89: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   92: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */       //   95: ifnull -> 119
/*     */       //   98: aload_0
/*     */       //   99: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   102: invokevirtual func_70694_bm : ()Lnet/minecraft/item/ItemStack;
/*     */       //   105: getfield field_77994_a : I
/*     */       //   108: iconst_0
/*     */       //   109: if_icmpgt -> 119
/*     */       //   112: aload_0
/*     */       //   113: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   116: invokevirtual func_71028_bD : ()V
/*     */       //   119: iload_2
/*     */       //   120: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #222	-> 0
/*     */       //   #223	-> 30
/*     */       //   #224	-> 74
/*     */       //   #222	-> 77
/*     */       //   #226	-> 88
/*     */       //   #227	-> 112
/*     */       //   #229	-> 119
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	121	0	this	Lli/cil/oc/server/agent/Player$$anonfun$interactWith$1;
/*     */       //   0	121	1	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   88	32	2	result	Z
/*     */     } }
/* 233 */   public Enumeration.Value activateBlockOrUseItem(int x, int y, int z, int side, float hitX, float hitY, float hitZ, double duration) { Object object = new Object(); try {  }
/* 234 */     catch (NonLocalReturnControl nonLocalReturnControl) { if (nonLocalReturnControl.key() == object) return (Enumeration.Value)nonLocalReturnControl.value();  }  return callUsingItemInSlot(agent().equipmentInventory(), 0, (Function1<ItemStack, Enumeration.Value>)new Player$$anonfun$activateBlockOrUseItem$1(this, x, y, z, side, hitX, hitY, hitZ, duration, object), callUsingItemInSlot$default$4()); } public final class Player$$anonfun$activateBlockOrUseItem$1 extends AbstractFunction1<ItemStack, Enumeration.Value> implements Serializable { public static final long serialVersionUID = 0L; public final int x$6; public final int y$1; public final int z$1; public final int side$1; private final float hitX$1; private final float hitY$1; private final float hitZ$1; private final double duration$1; private final Object nonLocalReturnKey1$1; public Player$$anonfun$activateBlockOrUseItem$1(Player $outer, int x$6, int y$1, int z$1, int side$1, float hitX$1, float hitY$1, float hitZ$1, double duration$1, Object nonLocalReturnKey1$1) {} public final Enumeration.Value apply(ItemStack stack) {
/* 235 */       if (this.$outer.li$cil$oc$server$agent$Player$$shouldCancel((Function0<PlayerInteractEvent>)new Player$$anonfun$activateBlockOrUseItem$1$$anonfun$apply$2(this))) {
/* 236 */         throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, ActivationType$.MODULE$.None());
/*     */       }
/*     */       
/* 239 */       Item item = (stack == null) ? null : stack.func_77973_b();
/* 240 */       if (!PortalGun$.MODULE$.isPortalGun(stack) && 
/* 241 */         item != null && item.onItemUseFirst(stack, (EntityPlayer)this.$outer, this.$outer.world(), this.x$6, this.y$1, this.z$1, this.side$1, this.hitX$1, this.hitY$1, this.hitZ$1)) {
/* 242 */         throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, ActivationType$.MODULE$.ItemUsed());
/*     */       }
/*     */ 
/*     */       
/* 246 */       Block block = this.$outer.world().func_147439_a(this.x$6, this.y$1, this.z$1);
/* 247 */       boolean canActivate = (block != null && Settings$.MODULE$.get().allowActivateBlocks());
/* 248 */       boolean shouldActivate = (canActivate && (!this.$outer.func_70093_af() || item == null || item.doesSneakBypassUse(this.$outer.world(), this.x$6, this.y$1, this.z$1, (EntityPlayer)this.$outer)));
/* 249 */       Enumeration.Value result = 
/* 250 */         (shouldActivate && block.func_149727_a(this.$outer.world(), this.x$6, this.y$1, this.z$1, (EntityPlayer)this.$outer, this.side$1, this.hitX$1, this.hitY$1, this.hitZ$1)) ? 
/* 251 */         ActivationType$.MODULE$.BlockActivated() : (
/* 252 */         (this.$outer.li$cil$oc$server$agent$Player$$isItemUseAllowed(stack) && this.$outer.li$cil$oc$server$agent$Player$$tryPlaceBlockWhileHandlingFunnySpecialCases(stack, this.x$6, this.y$1, this.z$1, this.side$1, this.hitX$1, this.hitY$1, this.hitZ$1)) ? 
/* 253 */         ActivationType$.MODULE$.ItemPlaced() : (
/* 254 */         this.$outer.li$cil$oc$server$agent$Player$$tryUseItem(stack, this.duration$1) ? 
/* 255 */         ActivationType$.MODULE$.ItemUsed() : 
/*     */         
/* 257 */         ActivationType$.MODULE$.None()));
/*     */       
/* 259 */       return result;
/*     */     } public final class Player$$anonfun$activateBlockOrUseItem$1$$anonfun$apply$2 extends AbstractFunction0<PlayerInteractEvent> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public final PlayerInteractEvent apply() {
/*     */         return ForgeEventFactory.onPlayerInteract((EntityPlayer)this.$outer.li$cil$oc$server$agent$Player$$anonfun$$$outer(), PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK, this.$outer.x$6, this.$outer.y$1, this.$outer.z$1, this.$outer.side$1, this.$outer.li$cil$oc$server$agent$Player$$anonfun$$$outer().world());
/*     */       } public Player$$anonfun$activateBlockOrUseItem$1$$anonfun$apply$2(Player$$anonfun$activateBlockOrUseItem$1 $outer) {} } }
/* 264 */   public boolean useEquippedItem(double duration) { return BoxesRunTime.unboxToBoolean(callUsingItemInSlot(agent().equipmentInventory(), 0, (Function1<ItemStack, ?>)new Player$$anonfun$useEquippedItem$1(this, duration), callUsingItemInSlot$default$4())); } public final class Player$$anonfun$useEquippedItem$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; private final double duration$2; public Player$$anonfun$useEquippedItem$1(Player $outer, double duration$2) {} public final boolean apply(ItemStack stack) {
/* 265 */       return this.$outer.li$cil$oc$server$agent$Player$$shouldCancel((Function0<PlayerInteractEvent>)new Player$$anonfun$useEquippedItem$1$$anonfun$apply$3(this)) ? false : 
/* 266 */         this.$outer.li$cil$oc$server$agent$Player$$tryUseItem(stack, this.duration$2);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final class Player$$anonfun$useEquippedItem$1$$anonfun$apply$3
/*     */       extends AbstractFunction0<PlayerInteractEvent>
/*     */       implements Serializable
/*     */     {
/*     */       public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */       
/*     */       public final PlayerInteractEvent apply() {
/*     */         return ForgeEventFactory.onPlayerInteract((EntityPlayer)this.$outer.li$cil$oc$server$agent$Player$$anonfun$$$outer(), PlayerInteractEvent.Action.RIGHT_CLICK_AIR, 0, 0, 0, 0, this.$outer.li$cil$oc$server$agent$Player$$anonfun$$$outer().world());
/*     */       }
/*     */ 
/*     */       
/*     */       public Player$$anonfun$useEquippedItem$1$$anonfun$apply$3(Player$$anonfun$useEquippedItem$1 $outer) {}
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean li$cil$oc$server$agent$Player$$tryUseItem(ItemStack stack, double duration) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual func_71041_bz : ()V
/*     */     //   4: aload_1
/*     */     //   5: ifnull -> 382
/*     */     //   8: aload_1
/*     */     //   9: getfield field_77994_a : I
/*     */     //   12: iconst_0
/*     */     //   13: if_icmple -> 382
/*     */     //   16: aload_0
/*     */     //   17: aload_1
/*     */     //   18: invokevirtual li$cil$oc$server$agent$Player$$isItemUseAllowed : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   21: ifeq -> 382
/*     */     //   24: aload_1
/*     */     //   25: getfield field_77994_a : I
/*     */     //   28: istore #4
/*     */     //   30: aload_1
/*     */     //   31: ifnonnull -> 38
/*     */     //   34: iconst_0
/*     */     //   35: goto -> 42
/*     */     //   38: aload_1
/*     */     //   39: invokevirtual func_77960_j : ()I
/*     */     //   42: istore #5
/*     */     //   44: aload_1
/*     */     //   45: invokevirtual func_77942_o : ()Z
/*     */     //   48: ifeq -> 61
/*     */     //   51: aload_1
/*     */     //   52: invokevirtual func_77978_p : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */     //   55: invokevirtual func_74737_b : ()Lnet/minecraft/nbt/NBTBase;
/*     */     //   58: goto -> 62
/*     */     //   61: aconst_null
/*     */     //   62: astore #6
/*     */     //   64: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   67: iconst_0
/*     */     //   68: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */     //   71: aload_1
/*     */     //   72: invokevirtual func_77988_m : ()I
/*     */     //   75: dload_2
/*     */     //   76: bipush #20
/*     */     //   78: i2d
/*     */     //   79: dmul
/*     */     //   80: d2i
/*     */     //   81: invokevirtual min : (II)I
/*     */     //   84: invokevirtual max : (II)I
/*     */     //   87: istore #7
/*     */     //   89: aload_0
/*     */     //   90: invokevirtual facing : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   93: astore #8
/*     */     //   95: aload_0
/*     */     //   96: aload_0
/*     */     //   97: getfield field_70165_t : D
/*     */     //   100: aload #8
/*     */     //   102: getfield offsetX : I
/*     */     //   105: i2d
/*     */     //   106: ldc2_w 0.6
/*     */     //   109: dmul
/*     */     //   110: dadd
/*     */     //   111: putfield field_70165_t : D
/*     */     //   114: aload_0
/*     */     //   115: aload_0
/*     */     //   116: getfield field_70163_u : D
/*     */     //   119: aload #8
/*     */     //   121: getfield offsetY : I
/*     */     //   124: i2d
/*     */     //   125: ldc2_w 0.6
/*     */     //   128: dmul
/*     */     //   129: dadd
/*     */     //   130: putfield field_70163_u : D
/*     */     //   133: aload_0
/*     */     //   134: aload_0
/*     */     //   135: getfield field_70161_v : D
/*     */     //   138: aload #8
/*     */     //   140: getfield offsetZ : I
/*     */     //   143: i2d
/*     */     //   144: ldc2_w 0.6
/*     */     //   147: dmul
/*     */     //   148: dadd
/*     */     //   149: putfield field_70161_v : D
/*     */     //   152: aload_1
/*     */     //   153: aload_0
/*     */     //   154: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   157: aload_0
/*     */     //   158: invokevirtual func_77957_a : (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/item/ItemStack;
/*     */     //   161: astore #9
/*     */     //   163: aload_0
/*     */     //   164: invokevirtual func_71039_bw : ()Z
/*     */     //   167: ifeq -> 200
/*     */     //   170: aload_0
/*     */     //   171: invokevirtual customItemInUseBecauseMinecraftIsBloodyStupidAndMakesRandomMethodsClientSided : ()Lnet/minecraft/item/ItemStack;
/*     */     //   174: invokevirtual func_77988_m : ()I
/*     */     //   177: iload #7
/*     */     //   179: isub
/*     */     //   180: istore #10
/*     */     //   182: aload_0
/*     */     //   183: invokevirtual customItemInUseBecauseMinecraftIsBloodyStupidAndMakesRandomMethodsClientSided : ()Lnet/minecraft/item/ItemStack;
/*     */     //   186: aload_0
/*     */     //   187: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */     //   190: aload_0
/*     */     //   191: iload #10
/*     */     //   193: invokevirtual func_77974_b : (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;I)V
/*     */     //   196: aload_0
/*     */     //   197: invokevirtual func_71041_bz : ()V
/*     */     //   200: aload_0
/*     */     //   201: aload_0
/*     */     //   202: getfield field_70165_t : D
/*     */     //   205: aload #8
/*     */     //   207: getfield offsetX : I
/*     */     //   210: i2d
/*     */     //   211: ldc2_w 0.6
/*     */     //   214: dmul
/*     */     //   215: dsub
/*     */     //   216: putfield field_70165_t : D
/*     */     //   219: aload_0
/*     */     //   220: aload_0
/*     */     //   221: getfield field_70163_u : D
/*     */     //   224: aload #8
/*     */     //   226: getfield offsetY : I
/*     */     //   229: i2d
/*     */     //   230: ldc2_w 0.6
/*     */     //   233: dmul
/*     */     //   234: dsub
/*     */     //   235: putfield field_70163_u : D
/*     */     //   238: aload_0
/*     */     //   239: aload_0
/*     */     //   240: getfield field_70161_v : D
/*     */     //   243: aload #8
/*     */     //   245: getfield offsetZ : I
/*     */     //   248: i2d
/*     */     //   249: ldc2_w 0.6
/*     */     //   252: dmul
/*     */     //   253: dsub
/*     */     //   254: putfield field_70161_v : D
/*     */     //   257: aload_0
/*     */     //   258: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   261: invokeinterface machine : ()Lli/cil/oc/api/machine/Machine;
/*     */     //   266: iload #7
/*     */     //   268: i2d
/*     */     //   269: ldc2_w 20.0
/*     */     //   272: ddiv
/*     */     //   273: invokeinterface pause : (D)Z
/*     */     //   278: pop
/*     */     //   279: aload #9
/*     */     //   281: aload_1
/*     */     //   282: astore #12
/*     */     //   284: dup
/*     */     //   285: ifnonnull -> 297
/*     */     //   288: pop
/*     */     //   289: aload #12
/*     */     //   291: ifnull -> 305
/*     */     //   294: goto -> 348
/*     */     //   297: aload #12
/*     */     //   299: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   302: ifeq -> 348
/*     */     //   305: aload #9
/*     */     //   307: ifnull -> 344
/*     */     //   310: aload_0
/*     */     //   311: iload #4
/*     */     //   313: iload #5
/*     */     //   315: aload #9
/*     */     //   317: invokespecial sizeOrDamageChanged$1 : (IILnet/minecraft/item/ItemStack;)Z
/*     */     //   320: ifne -> 348
/*     */     //   323: aload_0
/*     */     //   324: aload #6
/*     */     //   326: aload #9
/*     */     //   328: invokespecial tagChanged$1 : (Lnet/minecraft/nbt/NBTBase;Lnet/minecraft/item/ItemStack;)Z
/*     */     //   331: ifne -> 348
/*     */     //   334: getstatic li/cil/oc/integration/util/PortalGun$.MODULE$ : Lli/cil/oc/integration/util/PortalGun$;
/*     */     //   337: aload_1
/*     */     //   338: invokevirtual isStandardPortalGun : (Lnet/minecraft/item/ItemStack;)Z
/*     */     //   341: ifne -> 348
/*     */     //   344: iconst_0
/*     */     //   345: goto -> 349
/*     */     //   348: iconst_1
/*     */     //   349: istore #11
/*     */     //   351: iload #11
/*     */     //   353: ifeq -> 373
/*     */     //   356: aload_0
/*     */     //   357: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   360: invokeinterface equipmentInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   365: iconst_0
/*     */     //   366: aload #9
/*     */     //   368: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   373: iload #11
/*     */     //   375: ifeq -> 382
/*     */     //   378: iconst_1
/*     */     //   379: goto -> 383
/*     */     //   382: iconst_0
/*     */     //   383: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #273	-> 0
/*     */     //   #274	-> 4
/*     */     //   #275	-> 24
/*     */     //   #276	-> 30
/*     */     //   #277	-> 44
/*     */     //   #278	-> 64
/*     */     //   #281	-> 89
/*     */     //   #282	-> 95
/*     */     //   #283	-> 114
/*     */     //   #284	-> 133
/*     */     //   #285	-> 152
/*     */     //   #286	-> 163
/*     */     //   #287	-> 170
/*     */     //   #288	-> 182
/*     */     //   #289	-> 196
/*     */     //   #291	-> 200
/*     */     //   #292	-> 219
/*     */     //   #293	-> 238
/*     */     //   #294	-> 257
/*     */     //   #299	-> 279
/*     */     //   #300	-> 351
/*     */     //   #301	-> 356
/*     */     //   #303	-> 373
/*     */     //   #274	-> 378
/*     */     //   #272	-> 383
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	384	0	this	Lli/cil/oc/server/agent/Player;
/*     */     //   0	384	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	384	2	duration	D
/*     */     //   30	345	4	oldSize	I
/*     */     //   44	331	5	oldDamage	I
/*     */     //   64	311	6	oldData	Lnet/minecraft/nbt/NBTBase;
/*     */     //   89	286	7	heldTicks	I
/*     */     //   95	280	8	offset	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     //   163	212	9	newStack	Lnet/minecraft/item/ItemStack;
/*     */     //   182	18	10	remaining	I
/*     */     //   351	24	11	stackChanged	Z
/*     */   }
/*     */ 
/*     */   
/*     */   private final boolean sizeOrDamageChanged$1(int oldSize$1, int oldDamage$1, ItemStack newStack$1)
/*     */   {
/* 296 */     return (newStack$1.field_77994_a != oldSize$1 || newStack$1.func_77960_j() != oldDamage$1); } private final boolean tagChanged$1(NBTBase oldData$1, ItemStack newStack$1) {
/* 297 */     return !((oldData$1 != null || !newStack$1.func_77942_o()) && (oldData$1 == null || newStack$1.func_77942_o()) && (
/* 298 */       oldData$1 == null || !newStack$1.func_77942_o() || oldData$1.equals(newStack$1.func_77978_p())));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean placeBlock(int slot, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
/* 307 */     Object object = new Object(); try {  }
/* 308 */     catch (NonLocalReturnControl nonLocalReturnControl) { if (nonLocalReturnControl.key() == object) return nonLocalReturnControl.value$mcZ$sp();  }  return BoxesRunTime.unboxToBoolean(callUsingItemInSlot(agent().mainInventory(), slot, (Function1<ItemStack, ?>)new Player$$anonfun$placeBlock$1(this, x, y, z, side, hitX, hitY, hitZ, object), 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 314 */           false));
/*     */   } public final class Player$$anonfun$placeBlock$1 extends AbstractFunction1<ItemStack, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final int x$7; public final int y$2; public final int z$2; public final int side$2; private final float hitX$2; private final float hitY$2; private final float hitZ$2; private final Object nonLocalReturnKey2$1; public Player$$anonfun$placeBlock$1(Player $outer, int x$7, int y$2, int z$2, int side$2, float hitX$2, float hitY$2, float hitZ$2, Object nonLocalReturnKey2$1) {} public final boolean apply(ItemStack stack) { if (this.$outer.li$cil$oc$server$agent$Player$$shouldCancel((Function0<PlayerInteractEvent>)new Player$$anonfun$placeBlock$1$$anonfun$apply$4(this))) throw new NonLocalReturnControl.mcZ.sp(this.nonLocalReturnKey2$1, false);  return this.$outer.li$cil$oc$server$agent$Player$$tryPlaceBlockWhileHandlingFunnySpecialCases(stack, this.x$7, this.y$2, this.z$2, this.side$2, this.hitX$2, this.hitY$2, this.hitZ$2); } public final class Player$$anonfun$placeBlock$1$$anonfun$apply$4 extends AbstractFunction0<PlayerInteractEvent> implements Serializable {
/* 317 */       public static final long serialVersionUID = 0L; public final PlayerInteractEvent apply() { return ForgeEventFactory.onPlayerInteract((EntityPlayer)this.$outer.li$cil$oc$server$agent$Player$$anonfun$$$outer(), PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK, this.$outer.x$7, this.$outer.y$2, this.$outer.z$2, this.$outer.side$2, this.$outer.li$cil$oc$server$agent$Player$$anonfun$$$outer().world()); } public Player$$anonfun$placeBlock$1$$anonfun$apply$4(Player$$anonfun$placeBlock$1 $outer) {} } } public double clickBlock(int x, int y, int z, int side, boolean immediate) { Object object = new Object(); try {  }
/* 318 */     catch (NonLocalReturnControl nonLocalReturnControl) { if (nonLocalReturnControl.key() == object) return nonLocalReturnControl.value$mcD$sp();  }  return BoxesRunTime.unboxToDouble(callUsingItemInSlot(agent().equipmentInventory(), 0, (Function1<ItemStack, ?>)new Player$$anonfun$clickBlock$1(this, x, y, z, side, immediate, object), callUsingItemInSlot$default$4())); } public boolean clickBlock$default$5() { return false; } public final class Player$$anonfun$clickBlock$1 extends AbstractFunction1<ItemStack, Object> implements Serializable { public static final long serialVersionUID = 0L; public final int x$8; public final int y$3; public final int z$3; public final int side$3; private final boolean immediate$1; private final Object nonLocalReturnKey3$1; public Player$$anonfun$clickBlock$1(Player $outer, int x$8, int y$3, int z$3, int side$3, boolean immediate$1, Object nonLocalReturnKey3$1) {} public final double apply(ItemStack stack) { // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   4: new li/cil/oc/server/agent/Player$$anonfun$clickBlock$1$$anonfun$apply$5
/*     */       //   7: dup
/*     */       //   8: aload_0
/*     */       //   9: invokespecial <init> : (Lli/cil/oc/server/agent/Player$$anonfun$clickBlock$1;)V
/*     */       //   12: invokevirtual li$cil$oc$server$agent$Player$$shouldCancel : (Lscala/Function0;)Z
/*     */       //   15: ifeq -> 31
/*     */       //   18: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   21: dup
/*     */       //   22: aload_0
/*     */       //   23: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   26: dconst_0
/*     */       //   27: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   30: athrow
/*     */       //   31: invokestatic func_71276_C : ()Lnet/minecraft/server/MinecraftServer;
/*     */       //   34: aload_0
/*     */       //   35: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   38: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   41: aload_0
/*     */       //   42: getfield x$8 : I
/*     */       //   45: aload_0
/*     */       //   46: getfield y$3 : I
/*     */       //   49: aload_0
/*     */       //   50: getfield z$3 : I
/*     */       //   53: aload_0
/*     */       //   54: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   57: invokevirtual func_96290_a : (Lnet/minecraft/world/World;IIILnet/minecraft/entity/player/EntityPlayer;)Z
/*     */       //   60: ifeq -> 76
/*     */       //   63: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   66: dup
/*     */       //   67: aload_0
/*     */       //   68: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   71: dconst_0
/*     */       //   72: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   75: athrow
/*     */       //   76: aload_0
/*     */       //   77: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   80: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   83: aload_0
/*     */       //   84: getfield x$8 : I
/*     */       //   87: aload_0
/*     */       //   88: getfield y$3 : I
/*     */       //   91: aload_0
/*     */       //   92: getfield z$3 : I
/*     */       //   95: invokevirtual func_147439_a : (III)Lnet/minecraft/block/Block;
/*     */       //   98: astore_2
/*     */       //   99: aload_0
/*     */       //   100: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   103: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   106: aload_0
/*     */       //   107: getfield x$8 : I
/*     */       //   110: aload_0
/*     */       //   111: getfield y$3 : I
/*     */       //   114: aload_0
/*     */       //   115: getfield z$3 : I
/*     */       //   118: invokevirtual func_72805_g : (III)I
/*     */       //   121: istore_3
/*     */       //   122: aload_2
/*     */       //   123: ifnonnull -> 130
/*     */       //   126: iconst_0
/*     */       //   127: goto -> 131
/*     */       //   130: iconst_1
/*     */       //   131: istore #4
/*     */       //   133: iload #4
/*     */       //   135: ifeq -> 177
/*     */       //   138: aload_2
/*     */       //   139: aload_0
/*     */       //   140: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   143: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   146: aload_0
/*     */       //   147: getfield x$8 : I
/*     */       //   150: aload_0
/*     */       //   151: getfield y$3 : I
/*     */       //   154: aload_0
/*     */       //   155: getfield z$3 : I
/*     */       //   158: invokevirtual isAir : (Lnet/minecraft/world/IBlockAccess;III)Z
/*     */       //   161: ifne -> 177
/*     */       //   164: aload_2
/*     */       //   165: iload_3
/*     */       //   166: iconst_0
/*     */       //   167: invokevirtual func_149678_a : (IZ)Z
/*     */       //   170: ifeq -> 177
/*     */       //   173: iconst_1
/*     */       //   174: goto -> 178
/*     */       //   177: iconst_0
/*     */       //   178: istore #5
/*     */       //   180: iload #5
/*     */       //   182: ifeq -> 1205
/*     */       //   185: new net/minecraftforge/event/world/BlockEvent$BreakEvent
/*     */       //   188: dup
/*     */       //   189: aload_0
/*     */       //   190: getfield x$8 : I
/*     */       //   193: aload_0
/*     */       //   194: getfield y$3 : I
/*     */       //   197: aload_0
/*     */       //   198: getfield z$3 : I
/*     */       //   201: aload_0
/*     */       //   202: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   205: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   208: aload_2
/*     */       //   209: iload_3
/*     */       //   210: aload_0
/*     */       //   211: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   214: invokespecial <init> : (IIILnet/minecraft/world/World;Lnet/minecraft/block/Block;ILnet/minecraft/entity/player/EntityPlayer;)V
/*     */       //   217: astore #6
/*     */       //   219: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */       //   222: aload #6
/*     */       //   224: invokevirtual post : (Lcpw/mods/fml/common/eventhandler/Event;)Z
/*     */       //   227: pop
/*     */       //   228: aload #6
/*     */       //   230: invokevirtual isCanceled : ()Z
/*     */       //   233: ifeq -> 249
/*     */       //   236: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   239: dup
/*     */       //   240: aload_0
/*     */       //   241: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   244: dconst_0
/*     */       //   245: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   248: athrow
/*     */       //   249: aload_2
/*     */       //   250: aload_0
/*     */       //   251: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   254: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   257: aload_0
/*     */       //   258: getfield x$8 : I
/*     */       //   261: aload_0
/*     */       //   262: getfield y$3 : I
/*     */       //   265: aload_0
/*     */       //   266: getfield z$3 : I
/*     */       //   269: aload_0
/*     */       //   270: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   273: invokevirtual func_149699_a : (Lnet/minecraft/world/World;IIILnet/minecraft/entity/player/EntityPlayer;)V
/*     */       //   276: aload_0
/*     */       //   277: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   280: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   283: aload_0
/*     */       //   284: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   287: aload_0
/*     */       //   288: getfield x$8 : I
/*     */       //   291: aload_0
/*     */       //   292: getfield y$3 : I
/*     */       //   295: aload_0
/*     */       //   296: getfield z$3 : I
/*     */       //   299: aload_0
/*     */       //   300: getfield side$3 : I
/*     */       //   303: invokevirtual func_72886_a : (Lnet/minecraft/entity/player/EntityPlayer;IIII)Z
/*     */       //   306: pop
/*     */       //   307: aload_2
/*     */       //   308: aload_0
/*     */       //   309: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   312: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   315: aload_0
/*     */       //   316: getfield x$8 : I
/*     */       //   319: aload_0
/*     */       //   320: getfield y$3 : I
/*     */       //   323: aload_0
/*     */       //   324: getfield z$3 : I
/*     */       //   327: invokevirtual func_149712_f : (Lnet/minecraft/world/World;III)F
/*     */       //   330: fstore #7
/*     */       //   332: fload #7
/*     */       //   334: iconst_0
/*     */       //   335: i2f
/*     */       //   336: fcmpg
/*     */       //   337: ifge -> 344
/*     */       //   340: iconst_1
/*     */       //   341: goto -> 345
/*     */       //   344: iconst_0
/*     */       //   345: istore #8
/*     */       //   347: iload #8
/*     */       //   349: ifeq -> 356
/*     */       //   352: iconst_0
/*     */       //   353: goto -> 357
/*     */       //   356: iconst_1
/*     */       //   357: istore #9
/*     */       //   359: iload #9
/*     */       //   361: ifeq -> 1192
/*     */       //   364: aload_0
/*     */       //   365: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   368: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   371: invokevirtual func_72912_H : ()Lnet/minecraft/world/storage/WorldInfo;
/*     */       //   374: invokevirtual func_76077_q : ()Lnet/minecraft/world/WorldSettings$GameType;
/*     */       //   377: invokevirtual func_82752_c : ()Z
/*     */       //   380: ifeq -> 418
/*     */       //   383: aload_0
/*     */       //   384: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   387: aload_0
/*     */       //   388: getfield x$8 : I
/*     */       //   391: aload_0
/*     */       //   392: getfield y$3 : I
/*     */       //   395: aload_0
/*     */       //   396: getfield z$3 : I
/*     */       //   399: invokevirtual func_82246_f : (III)Z
/*     */       //   402: ifne -> 418
/*     */       //   405: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   408: dup
/*     */       //   409: aload_0
/*     */       //   410: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   413: dconst_0
/*     */       //   414: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   417: athrow
/*     */       //   418: aload_2
/*     */       //   419: getstatic net/minecraft/init/Blocks.field_150321_G : Lnet/minecraft/block/Block;
/*     */       //   422: astore #11
/*     */       //   424: dup
/*     */       //   425: ifnonnull -> 437
/*     */       //   428: pop
/*     */       //   429: aload #11
/*     */       //   431: ifnull -> 445
/*     */       //   434: goto -> 461
/*     */       //   437: aload #11
/*     */       //   439: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   442: ifeq -> 461
/*     */       //   445: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */       //   448: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */       //   451: invokevirtual screwCobwebs : ()Z
/*     */       //   454: ifeq -> 461
/*     */       //   457: iconst_1
/*     */       //   458: goto -> 462
/*     */       //   461: iconst_0
/*     */       //   462: istore #10
/*     */       //   464: aload_2
/*     */       //   465: aload_0
/*     */       //   466: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   469: iload_3
/*     */       //   470: invokestatic canHarvestBlock : (Lnet/minecraft/block/Block;Lnet/minecraft/entity/player/EntityPlayer;I)Z
/*     */       //   473: ifne -> 481
/*     */       //   476: iload #10
/*     */       //   478: ifeq -> 1179
/*     */       //   481: aload_0
/*     */       //   482: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   485: aload_2
/*     */       //   486: iconst_0
/*     */       //   487: iload_3
/*     */       //   488: aload_0
/*     */       //   489: getfield x$8 : I
/*     */       //   492: aload_0
/*     */       //   493: getfield y$3 : I
/*     */       //   496: aload_0
/*     */       //   497: getfield z$3 : I
/*     */       //   500: invokevirtual getBreakSpeed : (Lnet/minecraft/block/Block;ZIIII)F
/*     */       //   503: fstore #12
/*     */       //   505: iload #10
/*     */       //   507: ifeq -> 522
/*     */       //   510: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */       //   513: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */       //   516: invokevirtual swingDelay : ()D
/*     */       //   519: goto -> 533
/*     */       //   522: fload #7
/*     */       //   524: f2d
/*     */       //   525: ldc2_w 1.5
/*     */       //   528: dmul
/*     */       //   529: fload #12
/*     */       //   531: f2d
/*     */       //   532: ddiv
/*     */       //   533: dstore #13
/*     */       //   535: getstatic scala/runtime/RichDouble$.MODULE$ : Lscala/runtime/RichDouble$;
/*     */       //   538: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   541: dload #13
/*     */       //   543: invokevirtual doubleWrapper : (D)D
/*     */       //   546: invokevirtual isInfinity$extension : (D)Z
/*     */       //   549: ifeq -> 565
/*     */       //   552: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   555: dup
/*     */       //   556: aload_0
/*     */       //   557: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   560: dconst_0
/*     */       //   561: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   564: athrow
/*     */       //   565: new li/cil/oc/api/event/RobotBreakBlockEvent$Pre
/*     */       //   568: dup
/*     */       //   569: aload_0
/*     */       //   570: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   573: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */       //   576: aload_0
/*     */       //   577: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   580: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   583: aload_0
/*     */       //   584: getfield x$8 : I
/*     */       //   587: aload_0
/*     */       //   588: getfield y$3 : I
/*     */       //   591: aload_0
/*     */       //   592: getfield z$3 : I
/*     */       //   595: dload #13
/*     */       //   597: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */       //   600: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */       //   603: invokevirtual harvestRatio : ()D
/*     */       //   606: dmul
/*     */       //   607: invokespecial <init> : (Lli/cil/oc/api/internal/Agent;Lnet/minecraft/world/World;IIID)V
/*     */       //   610: astore #15
/*     */       //   612: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */       //   615: aload #15
/*     */       //   617: invokevirtual post : (Lcpw/mods/fml/common/eventhandler/Event;)Z
/*     */       //   620: pop
/*     */       //   621: aload #15
/*     */       //   623: invokevirtual isCanceled : ()Z
/*     */       //   626: ifeq -> 642
/*     */       //   629: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   632: dup
/*     */       //   633: aload_0
/*     */       //   634: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   637: dconst_0
/*     */       //   638: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   641: athrow
/*     */       //   642: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */       //   645: ldc2_w 0.05
/*     */       //   648: aload #15
/*     */       //   650: invokevirtual getBreakTime : ()D
/*     */       //   653: invokevirtual max : (DD)D
/*     */       //   656: dstore #16
/*     */       //   658: getstatic li/cil/oc/integration/tcon/ModTinkersConstruct$.MODULE$ : Lli/cil/oc/integration/tcon/ModTinkersConstruct$;
/*     */       //   661: aload_1
/*     */       //   662: invokevirtual isInfiTool : (Lnet/minecraft/item/ItemStack;)Z
/*     */       //   665: ifne -> 678
/*     */       //   668: getstatic li/cil/oc/integration/magtools/ModMagnanimousTools$.MODULE$ : Lli/cil/oc/integration/magtools/ModMagnanimousTools$;
/*     */       //   671: aload_1
/*     */       //   672: invokevirtual isMagTool : (Lnet/minecraft/item/ItemStack;)Z
/*     */       //   675: ifeq -> 682
/*     */       //   678: iconst_1
/*     */       //   679: goto -> 683
/*     */       //   682: iconst_0
/*     */       //   683: istore #18
/*     */       //   685: iload #18
/*     */       //   687: ifeq -> 722
/*     */       //   690: aload_0
/*     */       //   691: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   694: aload_0
/*     */       //   695: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   698: getfield field_70163_u : D
/*     */       //   701: ldc2_w 1.62
/*     */       //   704: dsub
/*     */       //   705: putfield field_70163_u : D
/*     */       //   708: aload_0
/*     */       //   709: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   712: aload_0
/*     */       //   713: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   716: getfield field_70163_u : D
/*     */       //   719: putfield field_70167_r : D
/*     */       //   722: aload_1
/*     */       //   723: ifnull -> 757
/*     */       //   726: aload_1
/*     */       //   727: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */       //   730: aload_1
/*     */       //   731: aload_0
/*     */       //   732: getfield x$8 : I
/*     */       //   735: aload_0
/*     */       //   736: getfield y$3 : I
/*     */       //   739: aload_0
/*     */       //   740: getfield z$3 : I
/*     */       //   743: aload_0
/*     */       //   744: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   747: invokevirtual onBlockStartBreak : (Lnet/minecraft/item/ItemStack;IIILnet/minecraft/entity/player/EntityPlayer;)Z
/*     */       //   750: ifeq -> 757
/*     */       //   753: iconst_1
/*     */       //   754: goto -> 758
/*     */       //   757: iconst_0
/*     */       //   758: istore #19
/*     */       //   760: iload #19
/*     */       //   762: ifeq -> 816
/*     */       //   765: iload #18
/*     */       //   767: ifeq -> 816
/*     */       //   770: aload_0
/*     */       //   771: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   774: aload_0
/*     */       //   775: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   778: getfield field_70163_u : D
/*     */       //   781: ldc2_w 1.62
/*     */       //   784: dadd
/*     */       //   785: putfield field_70163_u : D
/*     */       //   788: aload_0
/*     */       //   789: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   792: aload_0
/*     */       //   793: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   796: getfield field_70163_u : D
/*     */       //   799: putfield field_70167_r : D
/*     */       //   802: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   805: dup
/*     */       //   806: aload_0
/*     */       //   807: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   810: dload #16
/*     */       //   812: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   815: athrow
/*     */       //   816: iload #19
/*     */       //   818: ifeq -> 834
/*     */       //   821: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   824: dup
/*     */       //   825: aload_0
/*     */       //   826: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   829: dconst_0
/*     */       //   830: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   833: athrow
/*     */       //   834: aload_0
/*     */       //   835: getfield immediate$1 : Z
/*     */       //   838: ifeq -> 1149
/*     */       //   841: aload_0
/*     */       //   842: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   845: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   848: iconst_m1
/*     */       //   849: aload_0
/*     */       //   850: getfield x$8 : I
/*     */       //   853: aload_0
/*     */       //   854: getfield y$3 : I
/*     */       //   857: aload_0
/*     */       //   858: getfield z$3 : I
/*     */       //   861: iconst_m1
/*     */       //   862: invokevirtual func_147443_d : (IIIII)V
/*     */       //   865: aload_0
/*     */       //   866: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   869: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   872: aload_0
/*     */       //   873: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   876: sipush #2001
/*     */       //   879: aload_0
/*     */       //   880: getfield x$8 : I
/*     */       //   883: aload_0
/*     */       //   884: getfield y$3 : I
/*     */       //   887: aload_0
/*     */       //   888: getfield z$3 : I
/*     */       //   891: aload_2
/*     */       //   892: invokestatic func_149682_b : (Lnet/minecraft/block/Block;)I
/*     */       //   895: iload_3
/*     */       //   896: bipush #12
/*     */       //   898: ishl
/*     */       //   899: iadd
/*     */       //   900: invokevirtual func_72889_a : (Lnet/minecraft/entity/player/EntityPlayer;IIIII)V
/*     */       //   903: aload_1
/*     */       //   904: ifnull -> 935
/*     */       //   907: aload_1
/*     */       //   908: aload_0
/*     */       //   909: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   912: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   915: aload_2
/*     */       //   916: aload_0
/*     */       //   917: getfield x$8 : I
/*     */       //   920: aload_0
/*     */       //   921: getfield y$3 : I
/*     */       //   924: aload_0
/*     */       //   925: getfield z$3 : I
/*     */       //   928: aload_0
/*     */       //   929: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   932: invokevirtual func_150999_a : (Lnet/minecraft/world/World;Lnet/minecraft/block/Block;IIILnet/minecraft/entity/player/EntityPlayer;)V
/*     */       //   935: aload_2
/*     */       //   936: aload_0
/*     */       //   937: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   940: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   943: aload_0
/*     */       //   944: getfield x$8 : I
/*     */       //   947: aload_0
/*     */       //   948: getfield y$3 : I
/*     */       //   951: aload_0
/*     */       //   952: getfield z$3 : I
/*     */       //   955: iload_3
/*     */       //   956: aload_0
/*     */       //   957: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   960: invokevirtual func_149681_a : (Lnet/minecraft/world/World;IIIILnet/minecraft/entity/player/EntityPlayer;)V
/*     */       //   963: aload_2
/*     */       //   964: aload_0
/*     */       //   965: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   968: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   971: aload_0
/*     */       //   972: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   975: aload_0
/*     */       //   976: getfield x$8 : I
/*     */       //   979: aload_0
/*     */       //   980: getfield y$3 : I
/*     */       //   983: aload_0
/*     */       //   984: getfield z$3 : I
/*     */       //   987: aload_2
/*     */       //   988: aload_0
/*     */       //   989: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   992: iload_3
/*     */       //   993: invokevirtual canHarvestBlock : (Lnet/minecraft/entity/player/EntityPlayer;I)Z
/*     */       //   996: invokevirtual removedByPlayer : (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;IIIZ)Z
/*     */       //   999: ifeq -> 1147
/*     */       //   1002: aload_2
/*     */       //   1003: aload_0
/*     */       //   1004: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   1007: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   1010: aload_0
/*     */       //   1011: getfield x$8 : I
/*     */       //   1014: aload_0
/*     */       //   1015: getfield y$3 : I
/*     */       //   1018: aload_0
/*     */       //   1019: getfield z$3 : I
/*     */       //   1022: iload_3
/*     */       //   1023: invokevirtual func_149664_b : (Lnet/minecraft/world/World;IIII)V
/*     */       //   1026: aload_2
/*     */       //   1027: aload_0
/*     */       //   1028: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   1031: iload_3
/*     */       //   1032: invokevirtual canHarvestBlock : (Lnet/minecraft/entity/player/EntityPlayer;I)Z
/*     */       //   1035: ifeq -> 1098
/*     */       //   1038: aload_2
/*     */       //   1039: aload_0
/*     */       //   1040: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   1043: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   1046: aload_0
/*     */       //   1047: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   1050: aload_0
/*     */       //   1051: getfield x$8 : I
/*     */       //   1054: aload_0
/*     */       //   1055: getfield y$3 : I
/*     */       //   1058: aload_0
/*     */       //   1059: getfield z$3 : I
/*     */       //   1062: iload_3
/*     */       //   1063: invokevirtual func_149636_a : (Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;IIII)V
/*     */       //   1066: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */       //   1069: new li/cil/oc/api/event/RobotBreakBlockEvent$Post
/*     */       //   1072: dup
/*     */       //   1073: aload_0
/*     */       //   1074: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   1077: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */       //   1080: aload #6
/*     */       //   1082: invokevirtual getExpToDrop : ()I
/*     */       //   1085: i2d
/*     */       //   1086: invokespecial <init> : (Lli/cil/oc/api/internal/Agent;D)V
/*     */       //   1089: invokevirtual post : (Lcpw/mods/fml/common/eventhandler/Event;)Z
/*     */       //   1092: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   1095: goto -> 1132
/*     */       //   1098: aload_1
/*     */       //   1099: ifnonnull -> 1108
/*     */       //   1102: getstatic scala/runtime/BoxedUnit.UNIT : Lscala/runtime/BoxedUnit;
/*     */       //   1105: goto -> 1132
/*     */       //   1108: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */       //   1111: new li/cil/oc/api/event/RobotBreakBlockEvent$Post
/*     */       //   1114: dup
/*     */       //   1115: aload_0
/*     */       //   1116: getfield $outer : Lli/cil/oc/server/agent/Player;
/*     */       //   1119: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */       //   1122: dconst_0
/*     */       //   1123: invokespecial <init> : (Lli/cil/oc/api/internal/Agent;D)V
/*     */       //   1126: invokevirtual post : (Lcpw/mods/fml/common/eventhandler/Event;)Z
/*     */       //   1129: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   1132: pop
/*     */       //   1133: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   1136: dup
/*     */       //   1137: aload_0
/*     */       //   1138: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   1141: dload #16
/*     */       //   1143: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   1146: athrow
/*     */       //   1147: dconst_0
/*     */       //   1148: dreturn
/*     */       //   1149: getstatic li/cil/oc/common/EventHandler$.MODULE$ : Lli/cil/oc/common/EventHandler$;
/*     */       //   1152: new li/cil/oc/server/agent/Player$$anonfun$clickBlock$1$$anonfun$apply$1
/*     */       //   1155: dup
/*     */       //   1156: aload_0
/*     */       //   1157: dload #16
/*     */       //   1159: invokespecial <init> : (Lli/cil/oc/server/agent/Player$$anonfun$clickBlock$1;D)V
/*     */       //   1162: invokevirtual scheduleServer : (Lscala/Function0;)V
/*     */       //   1165: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   1168: dup
/*     */       //   1169: aload_0
/*     */       //   1170: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   1173: dload #16
/*     */       //   1175: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   1178: athrow
/*     */       //   1179: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   1182: dup
/*     */       //   1183: aload_0
/*     */       //   1184: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   1187: dconst_0
/*     */       //   1188: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   1191: athrow
/*     */       //   1192: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   1195: dup
/*     */       //   1196: aload_0
/*     */       //   1197: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   1200: dconst_0
/*     */       //   1201: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   1204: athrow
/*     */       //   1205: new scala/runtime/NonLocalReturnControl$mcD$sp
/*     */       //   1208: dup
/*     */       //   1209: aload_0
/*     */       //   1210: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   1213: dconst_0
/*     */       //   1214: invokespecial <init> : (Ljava/lang/Object;D)V
/*     */       //   1217: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #319	-> 0
/*     */       //   #320	-> 18
/*     */       //   #323	-> 31
/*     */       //   #324	-> 63
/*     */       //   #327	-> 76
/*     */       //   #328	-> 99
/*     */       //   #329	-> 122
/*     */       //   #334	-> 133
/*     */       //   #335	-> 138
/*     */       //   #336	-> 164
/*     */       //   #335	-> 173
/*     */       //   #338	-> 180
/*     */       //   #342	-> 185
/*     */       //   #343	-> 219
/*     */       //   #344	-> 228
/*     */       //   #345	-> 236
/*     */       //   #348	-> 249
/*     */       //   #349	-> 276
/*     */       //   #351	-> 307
/*     */       //   #352	-> 332
/*     */       //   #353	-> 347
/*     */       //   #354	-> 359
/*     */       //   #358	-> 364
/*     */       //   #359	-> 405
/*     */       //   #362	-> 418
/*     */       //   #364	-> 464
/*     */       //   #368	-> 481
/*     */       //   #370	-> 505
/*     */       //   #371	-> 522
/*     */       //   #369	-> 533
/*     */       //   #373	-> 538
/*     */       //   #375	-> 565
/*     */       //   #376	-> 612
/*     */       //   #377	-> 621
/*     */       //   #378	-> 642
/*     */       //   #384	-> 658
/*     */       //   #385	-> 685
/*     */       //   #386	-> 690
/*     */       //   #387	-> 708
/*     */       //   #389	-> 722
/*     */       //   #390	-> 760
/*     */       //   #391	-> 770
/*     */       //   #392	-> 788
/*     */       //   #393	-> 802
/*     */       //   #395	-> 816
/*     */       //   #396	-> 821
/*     */       //   #399	-> 834
/*     */       //   #404	-> 841
/*     */       //   #406	-> 865
/*     */       //   #408	-> 903
/*     */       //   #409	-> 907
/*     */       //   #412	-> 935
/*     */       //   #413	-> 963
/*     */       //   #414	-> 1002
/*     */       //   #417	-> 1026
/*     */       //   #418	-> 1038
/*     */       //   #419	-> 1066
/*     */       //   #417	-> 1092
/*     */       //   #421	-> 1098
/*     */       //   #422	-> 1108
/*     */       //   #417	-> 1132
/*     */       //   #424	-> 1133
/*     */       //   #426	-> 1147
/*     */       //   #400	-> 1149
/*     */       //   #401	-> 1165
/*     */       //   #365	-> 1179
/*     */       //   #355	-> 1192
/*     */       //   #339	-> 1205
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	1218	0	this	Lli/cil/oc/server/agent/Player$$anonfun$clickBlock$1;
/*     */       //   0	1218	1	stack	Lnet/minecraft/item/ItemStack;
/*     */       //   99	1049	2	block	Lnet/minecraft/block/Block;
/*     */       //   122	1026	3	metadata	I
/*     */       //   133	1015	4	mayClickBlock	Z
/*     */       //   180	968	5	canClickBlock	Z
/*     */       //   219	929	6	breakEvent	Lnet/minecraftforge/event/world/BlockEvent$BreakEvent;
/*     */       //   332	816	7	hardness	F
/*     */       //   347	801	8	isBlockUnbreakable	Z
/*     */       //   359	789	9	canDestroyBlock	Z
/*     */       //   464	684	10	cobwebOverride	Z
/*     */       //   505	643	12	strength	F
/*     */       //   535	613	13	breakTime	D
/*     */       //   612	536	15	preEvent	Lli/cil/oc/api/event/RobotBreakBlockEvent$Pre;
/*     */       //   658	490	16	adjustedBreakTime	D
/*     */       //   685	463	18	needsSpecialPlacement	Z
/*     */       //   760	388	19	cancel	Z } public final class Player$$anonfun$clickBlock$1$$anonfun$apply$5 extends AbstractFunction0<PlayerInteractEvent> implements Serializable { public static final long serialVersionUID = 0L;
/* 319 */       public final PlayerInteractEvent apply() { return ForgeEventFactory.onPlayerInteract((EntityPlayer)this.$outer.li$cil$oc$server$agent$Player$$anonfun$$$outer(), PlayerInteractEvent.Action.LEFT_CLICK_BLOCK, this.$outer.x$8, this.$outer.y$3, this.$outer.z$3, this.$outer.side$3, this.$outer.li$cil$oc$server$agent$Player$$anonfun$$$outer().world()); }
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
/*     */       public Player$$anonfun$clickBlock$1$$anonfun$apply$5(Player$$anonfun$clickBlock$1 $outer) {} }
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
/*     */     public final class Player$$anonfun$clickBlock$1$$anonfun$apply$1
/*     */       extends AbstractFunction0.mcV.sp
/*     */       implements Serializable
/*     */     {
/*     */       public static final long serialVersionUID = 0L;
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
/*     */       private final double adjustedBreakTime$1;
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
/*     */       public final void apply()
/*     */       {
/* 400 */         apply$mcV$sp(); } public void apply$mcV$sp() { (new Player.DamageOverTime(this.$outer.li$cil$oc$server$agent$Player$$anonfun$$$outer(), this.$outer.li$cil$oc$server$agent$Player$$anonfun$$$outer(), this.$outer.x$8, this.$outer.y$3, this.$outer.z$3, this.$outer.side$3, (int)(this.adjustedBreakTime$1 * 20))).tick(); }
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
/*     */       public Player$$anonfun$clickBlock$1$$anonfun$apply$1(Player$$anonfun$clickBlock$1 $outer, double adjustedBreakTime$1) {}
/*     */     } }
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
/*     */   public boolean li$cil$oc$server$agent$Player$$isItemUseAllowed(ItemStack stack) {
/* 430 */     return (stack == null || ((
/* 431 */       Settings$.MODULE$.get().allowUseItemsWithDuration() || stack.func_77988_m() <= 0) && (
/* 432 */       !PortalGun$.MODULE$.isPortalGun(stack) || PortalGun$.MODULE$.isStandardPortalGun(stack)) && 
/* 433 */       !stack.func_77969_a(new ItemStack(Items.field_151058_ca))));
/*     */   }
/*     */   
/*     */   public EntityItem func_71019_a(ItemStack stack, boolean inPlace) {
/* 437 */     return InventoryUtils$.MODULE$.spawnStackInWorld(BlockPosition$.MODULE$.apply((EnvironmentHost)agent()), stack, inPlace ? (Option)None$.MODULE$ : Option$.MODULE$.apply(facing()), InventoryUtils$.MODULE$.spawnStackInWorld$default$4());
/*     */   }
/*     */   public boolean li$cil$oc$server$agent$Player$$shouldCancel(Function0 f) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface apply : ()Ljava/lang/Object;
/*     */     //   6: checkcast net/minecraftforge/event/entity/player/PlayerInteractEvent
/*     */     //   9: astore_3
/*     */     //   10: aload_3
/*     */     //   11: invokevirtual isCanceled : ()Z
/*     */     //   14: ifne -> 77
/*     */     //   17: aload_3
/*     */     //   18: getfield useBlock : Lcpw/mods/fml/common/eventhandler/Event$Result;
/*     */     //   21: getstatic cpw/mods/fml/common/eventhandler/Event$Result.DENY : Lcpw/mods/fml/common/eventhandler/Event$Result;
/*     */     //   24: astore #4
/*     */     //   26: dup
/*     */     //   27: ifnonnull -> 39
/*     */     //   30: pop
/*     */     //   31: aload #4
/*     */     //   33: ifnull -> 77
/*     */     //   36: goto -> 47
/*     */     //   39: aload #4
/*     */     //   41: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   44: ifne -> 77
/*     */     //   47: aload_3
/*     */     //   48: getfield useItem : Lcpw/mods/fml/common/eventhandler/Event$Result;
/*     */     //   51: getstatic cpw/mods/fml/common/eventhandler/Event$Result.DENY : Lcpw/mods/fml/common/eventhandler/Event$Result;
/*     */     //   54: astore #5
/*     */     //   56: dup
/*     */     //   57: ifnonnull -> 69
/*     */     //   60: pop
/*     */     //   61: aload #5
/*     */     //   63: ifnull -> 77
/*     */     //   66: goto -> 81
/*     */     //   69: aload #5
/*     */     //   71: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   74: ifeq -> 81
/*     */     //   77: iconst_1
/*     */     //   78: goto -> 131
/*     */     //   81: iconst_0
/*     */     //   82: goto -> 131
/*     */     //   85: astore_2
/*     */     //   86: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   89: aload_2
/*     */     //   90: invokevirtual getStackTrace : ()[Ljava/lang/StackTraceElement;
/*     */     //   93: checkcast [Ljava/lang/Object;
/*     */     //   96: invokevirtual refArrayOps : ([Ljava/lang/Object;)Lscala/collection/mutable/ArrayOps;
/*     */     //   99: new li/cil/oc/server/agent/Player$$anonfun$li$cil$oc$server$agent$Player$$shouldCancel$1
/*     */     //   102: dup
/*     */     //   103: aload_0
/*     */     //   104: invokespecial <init> : (Lli/cil/oc/server/agent/Player;)V
/*     */     //   107: invokeinterface exists : (Lscala/Function1;)Z
/*     */     //   112: ifne -> 130
/*     */     //   115: getstatic li/cil/oc/OpenComputers$.MODULE$ : Lli/cil/oc/OpenComputers$;
/*     */     //   118: invokevirtual log : ()Lorg/apache/logging/log4j/Logger;
/*     */     //   121: ldc_w 'Some event handler screwed up!'
/*     */     //   124: aload_2
/*     */     //   125: invokeinterface warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   130: iconst_0
/*     */     //   131: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #441	-> 0
/*     */     //   #442	-> 10
/*     */     //   #445	-> 85
/*     */     //   #440	-> 85
/*     */     //   #446	-> 86
/*     */     //   #447	-> 115
/*     */     //   #449	-> 130
/*     */     //   #440	-> 131
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	132	0	this	Lli/cil/oc/server/agent/Player;
/*     */     //   0	132	1	f	Lscala/Function0;
/*     */     //   10	122	3	event	Lnet/minecraftforge/event/entity/player/PlayerInteractEvent;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	85	85	finally
/*     */   }
/*     */   
/*     */   public final class Player$$anonfun$li$cil$oc$server$agent$Player$$shouldCancel$1 extends AbstractFunction1<StackTraceElement, Object> implements Serializable { public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(StackTraceElement x$5) {
/* 446 */       return x$5.getClassName().startsWith("mods.battlegear2.");
/*     */     }
/*     */     
/*     */     public Player$$anonfun$li$cil$oc$server$agent$Player$$shouldCancel$1(Player $outer) {} }
/*     */ 
/*     */   
/*     */   private <T> boolean callUsingItemInSlot$default$4() {
/* 453 */     return true;
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
/*     */   private <T> T callUsingItemInSlot(IInventory inventory, int slot, Function1 f, boolean repair) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial adjacentItems : ()Lscala/collection/mutable/Buffer;
/*     */     //   4: astore #5
/*     */     //   6: aload_1
/*     */     //   7: iload_2
/*     */     //   8: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   13: astore #6
/*     */     //   15: aload #6
/*     */     //   17: ifnonnull -> 24
/*     */     //   20: aconst_null
/*     */     //   21: goto -> 29
/*     */     //   24: aload #6
/*     */     //   26: invokevirtual func_77946_l : ()Lnet/minecraft/item/ItemStack;
/*     */     //   29: astore #7
/*     */     //   31: aload_0
/*     */     //   32: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   35: aload_1
/*     */     //   36: aload_0
/*     */     //   37: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   40: invokeinterface mainInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   45: astore #8
/*     */     //   47: dup
/*     */     //   48: ifnonnull -> 60
/*     */     //   51: pop
/*     */     //   52: aload #8
/*     */     //   54: ifnull -> 68
/*     */     //   57: goto -> 72
/*     */     //   60: aload #8
/*     */     //   62: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   65: ifeq -> 72
/*     */     //   68: iload_2
/*     */     //   69: goto -> 75
/*     */     //   72: iload_2
/*     */     //   73: iconst_m1
/*     */     //   74: ixor
/*     */     //   75: putfield field_70461_c : I
/*     */     //   78: aload_3
/*     */     //   79: aload #6
/*     */     //   81: invokeinterface apply : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   86: aload_0
/*     */     //   87: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   90: iconst_0
/*     */     //   91: putfield field_70461_c : I
/*     */     //   94: aload_1
/*     */     //   95: iload_2
/*     */     //   96: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   101: astore #10
/*     */     //   103: aload #7
/*     */     //   105: aload #10
/*     */     //   107: invokestatic func_77989_b : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z
/*     */     //   110: ifeq -> 132
/*     */     //   113: aload #7
/*     */     //   115: aload #6
/*     */     //   117: invokestatic func_77989_b : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z
/*     */     //   120: ifne -> 132
/*     */     //   123: aload_1
/*     */     //   124: iload_2
/*     */     //   125: aload #6
/*     */     //   127: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   132: aload #10
/*     */     //   134: ifnull -> 185
/*     */     //   137: aload #10
/*     */     //   139: getfield field_77994_a : I
/*     */     //   142: iconst_0
/*     */     //   143: if_icmpgt -> 154
/*     */     //   146: aload_1
/*     */     //   147: iload_2
/*     */     //   148: aconst_null
/*     */     //   149: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   154: iload #4
/*     */     //   156: ifeq -> 185
/*     */     //   159: aload #10
/*     */     //   161: getfield field_77994_a : I
/*     */     //   164: iconst_0
/*     */     //   165: if_icmple -> 179
/*     */     //   168: aload_0
/*     */     //   169: aload #10
/*     */     //   171: aload #7
/*     */     //   173: invokespecial tryRepair : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)V
/*     */     //   176: goto -> 185
/*     */     //   179: aload_0
/*     */     //   180: aload #10
/*     */     //   182: invokestatic onPlayerDestroyItem : (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
/*     */     //   185: aload_0
/*     */     //   186: aload #5
/*     */     //   188: invokespecial collectDroppedItems : (Lscala/collection/Iterable;)V
/*     */     //   191: areturn
/*     */     //   192: astore #9
/*     */     //   194: aload_0
/*     */     //   195: getfield field_71071_by : Lnet/minecraft/entity/player/InventoryPlayer;
/*     */     //   198: iconst_0
/*     */     //   199: putfield field_70461_c : I
/*     */     //   202: aload_1
/*     */     //   203: iload_2
/*     */     //   204: invokeinterface func_70301_a : (I)Lnet/minecraft/item/ItemStack;
/*     */     //   209: astore #10
/*     */     //   211: aload #7
/*     */     //   213: aload #10
/*     */     //   215: invokestatic func_77989_b : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z
/*     */     //   218: ifeq -> 240
/*     */     //   221: aload #7
/*     */     //   223: aload #6
/*     */     //   225: invokestatic func_77989_b : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z
/*     */     //   228: ifne -> 240
/*     */     //   231: aload_1
/*     */     //   232: iload_2
/*     */     //   233: aload #6
/*     */     //   235: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   240: aload #10
/*     */     //   242: ifnull -> 293
/*     */     //   245: aload #10
/*     */     //   247: getfield field_77994_a : I
/*     */     //   250: iconst_0
/*     */     //   251: if_icmpgt -> 262
/*     */     //   254: aload_1
/*     */     //   255: iload_2
/*     */     //   256: aconst_null
/*     */     //   257: invokeinterface func_70299_a : (ILnet/minecraft/item/ItemStack;)V
/*     */     //   262: iload #4
/*     */     //   264: ifeq -> 293
/*     */     //   267: aload #10
/*     */     //   269: getfield field_77994_a : I
/*     */     //   272: iconst_0
/*     */     //   273: if_icmple -> 287
/*     */     //   276: aload_0
/*     */     //   277: aload #10
/*     */     //   279: aload #7
/*     */     //   281: invokespecial tryRepair : (Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)V
/*     */     //   284: goto -> 293
/*     */     //   287: aload_0
/*     */     //   288: aload #10
/*     */     //   290: invokestatic onPlayerDestroyItem : (Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V
/*     */     //   293: aload_0
/*     */     //   294: aload #5
/*     */     //   296: invokespecial collectDroppedItems : (Lscala/collection/Iterable;)V
/*     */     //   299: aload #9
/*     */     //   301: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #454	-> 0
/*     */     //   #455	-> 6
/*     */     //   #456	-> 15
/*     */     //   #457	-> 31
/*     */     //   #459	-> 78
/*     */     //   #462	-> 86
/*     */     //   #463	-> 94
/*     */     //   #466	-> 103
/*     */     //   #467	-> 113
/*     */     //   #468	-> 123
/*     */     //   #470	-> 132
/*     */     //   #471	-> 137
/*     */     //   #472	-> 146
/*     */     //   #474	-> 154
/*     */     //   #475	-> 159
/*     */     //   #476	-> 179
/*     */     //   #479	-> 185
/*     */     //   #461	-> 192
/*     */     //   #462	-> 194
/*     */     //   #463	-> 202
/*     */     //   #466	-> 211
/*     */     //   #467	-> 221
/*     */     //   #468	-> 231
/*     */     //   #470	-> 240
/*     */     //   #471	-> 245
/*     */     //   #472	-> 254
/*     */     //   #474	-> 262
/*     */     //   #475	-> 267
/*     */     //   #476	-> 287
/*     */     //   #479	-> 293
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	302	0	this	Lli/cil/oc/server/agent/Player;
/*     */     //   0	302	1	inventory	Lnet/minecraft/inventory/IInventory;
/*     */     //   0	302	2	slot	I
/*     */     //   0	302	3	f	Lscala/Function1;
/*     */     //   0	302	4	repair	Z
/*     */     //   6	185	5	itemsBefore	Lscala/collection/mutable/Buffer;
/*     */     //   15	176	6	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   31	160	7	oldStack	Lnet/minecraft/item/ItemStack;
/*     */     //   103	88	10	newStack	Lnet/minecraft/item/ItemStack;
/*     */     //   211	88	10	newStack	Lnet/minecraft/item/ItemStack;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   78	86	192	finally
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
/*     */   private void tryRepair(ItemStack stack, ItemStack oldStack) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ifnull -> 105
/*     */     //   4: aload_2
/*     */     //   5: ifnull -> 105
/*     */     //   8: aload_1
/*     */     //   9: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   12: aload_2
/*     */     //   13: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
/*     */     //   16: astore_3
/*     */     //   17: dup
/*     */     //   18: ifnonnull -> 29
/*     */     //   21: pop
/*     */     //   22: aload_3
/*     */     //   23: ifnull -> 36
/*     */     //   26: goto -> 105
/*     */     //   29: aload_3
/*     */     //   30: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   33: ifeq -> 105
/*     */     //   36: new li/cil/oc/api/event/RobotUsedToolEvent$ComputeDamageRate
/*     */     //   39: dup
/*     */     //   40: aload_0
/*     */     //   41: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   44: aload_2
/*     */     //   45: aload_1
/*     */     //   46: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */     //   49: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */     //   52: invokevirtual itemDamageRate : ()D
/*     */     //   55: invokespecial <init> : (Lli/cil/oc/api/internal/Agent;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;D)V
/*     */     //   58: astore #4
/*     */     //   60: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   63: aload #4
/*     */     //   65: invokevirtual post : (Lcpw/mods/fml/common/eventhandler/Event;)Z
/*     */     //   68: pop
/*     */     //   69: aload #4
/*     */     //   71: invokevirtual getDamageRate : ()D
/*     */     //   74: iconst_1
/*     */     //   75: i2d
/*     */     //   76: dcmpg
/*     */     //   77: ifge -> 105
/*     */     //   80: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lcpw/mods/fml/common/eventhandler/EventBus;
/*     */     //   83: new li/cil/oc/api/event/RobotUsedToolEvent$ApplyDamageRate
/*     */     //   86: dup
/*     */     //   87: aload_0
/*     */     //   88: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */     //   91: aload_2
/*     */     //   92: aload_1
/*     */     //   93: aload #4
/*     */     //   95: invokevirtual getDamageRate : ()D
/*     */     //   98: invokespecial <init> : (Lli/cil/oc/api/internal/Agent;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;D)V
/*     */     //   101: invokevirtual post : (Lcpw/mods/fml/common/eventhandler/Event;)Z
/*     */     //   104: pop
/*     */     //   105: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #485	-> 0
/*     */     //   #486	-> 36
/*     */     //   #487	-> 60
/*     */     //   #488	-> 69
/*     */     //   #489	-> 80
/*     */     //   #485	-> 105
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	106	0	this	Lli/cil/oc/server/agent/Player;
/*     */     //   0	106	1	stack	Lnet/minecraft/item/ItemStack;
/*     */     //   0	106	2	oldStack	Lnet/minecraft/item/ItemStack;
/*     */     //   60	46	4	damageRate	Lli/cil/oc/api/event/RobotUsedToolEvent$ComputeDamageRate;
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
/*     */   public boolean li$cil$oc$server$agent$Player$$tryPlaceBlockWhileHandlingFunnySpecialCases(ItemStack stack, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
/* 495 */     if (stack != null && stack.field_77994_a > 0) {
/* 496 */       RobotPlaceBlockEvent.Pre event = new RobotPlaceBlockEvent.Pre(agent(), stack, world(), x, y, z);
/* 497 */       MinecraftForge.EVENT_BUS.post((Event)event);
/*     */ 
/*     */       
/* 500 */       double fakeEyeHeight = (this.field_70125_A < false && isSomeKindOfPiston(stack)) ? 1.82D : 0.0D;
/* 501 */       func_70107_b(this.field_70165_t, this.field_70163_u - fakeEyeHeight, this.field_70161_v);
/* 502 */       Player$.MODULE$.setInventoryPlayerItems(this);
/* 503 */       boolean didPlace = stack.func_77943_a((EntityPlayer)this, world(), x, y, z, side, hitX, hitY, hitZ);
/* 504 */       Player$.MODULE$.detectInventoryPlayerChanges(this);
/* 505 */       func_70107_b(this.field_70165_t, this.field_70163_u + fakeEyeHeight, this.field_70161_v);
/* 506 */       didPlace ? 
/* 507 */         BoxesRunTime.boxToBoolean(MinecraftForge.EVENT_BUS.post((Event)new RobotPlaceBlockEvent.Post(agent(), stack, world(), x, y, z))) : BoxedUnit.UNIT;
/*     */       
/* 509 */       if (event.isCanceled() ? false : didPlace);
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   private boolean isSomeKindOfPiston(ItemStack stack) {
/*     */     boolean bool;
/* 515 */     Item item = stack.func_77973_b();
/* 516 */     if (item instanceof ItemBlock) { ItemBlock itemBlock = (ItemBlock)item;
/* 517 */       Block block = itemBlock.field_150939_a;
/* 518 */       bool = (block != null && block instanceof net.minecraft.block.BlockPistonBase) ? true : false; }
/* 519 */     else { bool = false; }
/*     */     
/*     */     return bool;
/*     */   }
/*     */   
/*     */   public void func_71008_a(ItemStack stack, int useDuration) {
/* 525 */     super.func_71008_a(stack, useDuration);
/* 526 */     customItemInUseBecauseMinecraftIsBloodyStupidAndMakesRandomMethodsClientSided_$eq(stack);
/*     */   }
/*     */   
/*     */   public void func_71041_bz() {
/* 530 */     super.func_71041_bz();
/* 531 */     customItemInUseBecauseMinecraftIsBloodyStupidAndMakesRandomMethodsClientSided_$eq((ItemStack)null);
/*     */   }
/*     */   
/*     */   public void func_71020_j(float amount) {
/*     */     BoxedUnit boxedUnit;
/* 536 */     Node node = agent().machine().node();
/* 537 */     if (node instanceof Connector) { Connector connector = (Connector)node; Double double_ = BoxesRunTime.boxToDouble(connector.changeBuffer(-Settings$.MODULE$.get().robotExhaustionCost() * amount)); }
/* 538 */     else { boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     (Settings$.MODULE$.get().robotExhaustionCost() > false) ? boxedUnit : BoxedUnit.UNIT;
/* 541 */     MinecraftForge.EVENT_BUS.post((Event)new RobotExhaustionEvent(agent(), amount));
/*     */   }
/*     */   
/*     */   public void func_71030_a(IMerchant merchant, String name) {
/* 545 */     merchant.func_70932_a_(null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_71053_j() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void func_71038_i() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_70003_b(int level, String command) {
/*     */     // Byte code:
/*     */     //   0: ldc_w 'seed'
/*     */     //   3: aload_2
/*     */     //   4: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   7: ifeq -> 20
/*     */     //   10: aload_0
/*     */     //   11: getfield field_71133_b : Lnet/minecraft/server/MinecraftServer;
/*     */     //   14: invokevirtual func_71262_S : ()Z
/*     */     //   17: ifeq -> 147
/*     */     //   20: ldc_w 'tell'
/*     */     //   23: aload_2
/*     */     //   24: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   27: ifne -> 147
/*     */     //   30: ldc_w 'help'
/*     */     //   33: aload_2
/*     */     //   34: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   37: ifne -> 147
/*     */     //   40: ldc_w 'me'
/*     */     //   43: aload_2
/*     */     //   44: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   47: ifne -> 147
/*     */     //   50: aload_0
/*     */     //   51: getfield field_71133_b : Lnet/minecraft/server/MinecraftServer;
/*     */     //   54: invokevirtual func_71203_ab : ()Lnet/minecraft/server/management/ServerConfigurationManager;
/*     */     //   57: astore_3
/*     */     //   58: aload_3
/*     */     //   59: aload_0
/*     */     //   60: invokevirtual func_146103_bH : ()Lcom/mojang/authlib/GameProfile;
/*     */     //   63: invokevirtual func_152596_g : (Lcom/mojang/authlib/GameProfile;)Z
/*     */     //   66: ifeq -> 143
/*     */     //   69: aload_3
/*     */     //   70: invokevirtual func_152603_m : ()Lnet/minecraft/server/management/UserListOps;
/*     */     //   73: aload_0
/*     */     //   74: invokevirtual func_146103_bH : ()Lcom/mojang/authlib/GameProfile;
/*     */     //   77: invokevirtual func_152683_b : (Ljava/lang/Object;)Lnet/minecraft/server/management/UserListEntry;
/*     */     //   80: astore #4
/*     */     //   82: aload #4
/*     */     //   84: instanceof net/minecraft/server/management/UserListOpsEntry
/*     */     //   87: ifeq -> 116
/*     */     //   90: aload #4
/*     */     //   92: checkcast net/minecraft/server/management/UserListOpsEntry
/*     */     //   95: astore #5
/*     */     //   97: aload #5
/*     */     //   99: invokevirtual func_152644_a : ()I
/*     */     //   102: iload_1
/*     */     //   103: if_icmplt -> 110
/*     */     //   106: iconst_1
/*     */     //   107: goto -> 111
/*     */     //   110: iconst_0
/*     */     //   111: istore #6
/*     */     //   113: goto -> 134
/*     */     //   116: aload_0
/*     */     //   117: getfield field_71133_b : Lnet/minecraft/server/MinecraftServer;
/*     */     //   120: invokevirtual func_110455_j : ()I
/*     */     //   123: iload_1
/*     */     //   124: if_icmplt -> 131
/*     */     //   127: iconst_1
/*     */     //   128: goto -> 132
/*     */     //   131: iconst_0
/*     */     //   132: istore #6
/*     */     //   134: iload #6
/*     */     //   136: ifeq -> 143
/*     */     //   139: iconst_1
/*     */     //   140: goto -> 144
/*     */     //   143: iconst_0
/*     */     //   144: ifeq -> 151
/*     */     //   147: iconst_1
/*     */     //   148: goto -> 152
/*     */     //   151: iconst_0
/*     */     //   152: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #553	-> 0
/*     */     //   #554	-> 20
/*     */     //   #555	-> 30
/*     */     //   #556	-> 40
/*     */     //   #557	-> 50
/*     */     //   #558	-> 58
/*     */     //   #559	-> 69
/*     */     //   #560	-> 82
/*     */     //   #561	-> 116
/*     */     //   #559	-> 134
/*     */     //   #558	-> 139
/*     */     //   #556	-> 147
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	153	0	this	Lli/cil/oc/server/agent/Player;
/*     */     //   0	153	1	level	I
/*     */     //   0	153	2	command	Ljava/lang/String;
/*     */     //   58	95	3	config	Lnet/minecraft/server/management/ServerConfigurationManager;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean func_96122_a(EntityPlayer player) {
/* 567 */     return Settings$.MODULE$.get().canAttackPlayers();
/*     */   } public boolean func_71043_e(boolean value) {
/* 569 */     return false;
/*     */   } public boolean func_70687_e(PotionEffect effect) {
/* 571 */     return false;
/*     */   } public boolean func_70652_k(Entity entity) {
/* 573 */     return false;
/*     */   } public boolean func_70097_a(DamageSource source, float damage) {
/* 575 */     return false;
/*     */   }
/*     */   public void func_70691_i(float amount) {}
/*     */   public void func_70606_j(float value) {}
/*     */   
/*     */   public void func_70106_y() {
/* 581 */     ((Entity)this).field_70128_L = true;
/*     */   }
/*     */   public void func_70636_d() {}
/*     */   
/*     */   public void func_71001_a(Entity entity, int count) {}
/*     */   
/*     */   public void func_70062_b(int slot, ItemStack stack) {
/* 588 */     if (slot == 0 && agent().equipmentInventory().func_70302_i_() > 0) {
/* 589 */       agent().equipmentInventory().func_70299_a(slot, stack);
/*     */     }
/*     */   }
/*     */   
/*     */   public void func_70604_c(EntityLivingBase entity) {}
/*     */   
/*     */   public void func_130011_c(Entity entity) {}
/*     */   
/*     */   public void func_70078_a(Entity entity) {}
/*     */   
/*     */   public EntityPlayer.EnumStatus func_71018_a(int x, int y, int z) {
/* 600 */     return EntityPlayer.EnumStatus.OTHER_PROBLEM;
/*     */   } public void func_145747_a(IChatComponent message) {} public void func_71058_b(int x, int y, int z) {} public void func_71002_c(int x, int y, int z, String idk) {} public void func_82244_d(int x, int y, int z) {} public void func_71007_a(IInventory inventory) {}
/*     */   public void func_96125_a(EntityMinecartHopper cart) {}
/*     */   public void func_110298_a(EntityHorse horse, IInventory inventory) {}
/*     */   public void func_146104_a(TileEntityBeacon tileEntity) {}
/*     */   public void func_146098_a(TileEntityBrewingStand tileEntity) {}
/*     */   public void func_146102_a(TileEntityDispenser tileEntity) {}
/*     */   public void func_146101_a(TileEntityFurnace tileEntity) {}
/*     */   public void func_146093_a(TileEntityHopper tileEntity) {}
/*     */   public static Option<UUID> determineUUID$default$1() {
/*     */     return Player$.MODULE$.determineUUID$default$1();
/*     */   }
/*     */   public static void detectInventoryPlayerChanges(Player paramPlayer) {
/*     */     Player$.MODULE$.detectInventoryPlayerChanges(paramPlayer);
/*     */   }
/*     */   public static void setInventoryPlayerItems(Player paramPlayer) {
/*     */     Player$.MODULE$.setInventoryPlayerItems(paramPlayer);
/*     */   }
/*     */   public static void updatePositionAndRotation(Player paramPlayer, ForgeDirection paramForgeDirection1, ForgeDirection paramForgeDirection2) {
/*     */     Player$.MODULE$.updatePositionAndRotation(paramPlayer, paramForgeDirection1, paramForgeDirection2);
/*     */   }
/*     */   public static UUID determineUUID(Option<UUID> paramOption) {
/*     */     return Player$.MODULE$.determineUUID(paramOption);
/*     */   }
/*     */   public static GameProfile profileFor(Agent paramAgent) {
/*     */     return Player$.MODULE$.profileFor(paramAgent);
/*     */   }
/*     */   public class DamageOverTime { private final Player player; private final int x; private final int y; private final int z; private final int side; private final int ticksTotal; private final World world; private int ticks; private int lastDamageSent;
/* 628 */     public Player player() { return this.player; } public int x() { return this.x; } public int y() { return this.y; } public int z() { return this.z; } public int side() { return this.side; } public int ticksTotal() { return this.ticksTotal; }
/* 629 */     public DamageOverTime(Player $outer, Player player, int x, int y, int z, int side, int ticksTotal) { this.world = player.world();
/* 630 */       this.ticks = 0;
/* 631 */       this.lastDamageSent = 0; } public World world() { return this.world; } public int ticks() { return this.ticks; } public void ticks_$eq(int x$1) { this.ticks = x$1; } public int lastDamageSent() { return this.lastDamageSent; } public void lastDamageSent_$eq(int x$1) { this.lastDamageSent = x$1; }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void tick() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   4: aload_0
/*     */       //   5: invokevirtual player : ()Lli/cil/oc/server/agent/Player;
/*     */       //   8: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   11: astore_1
/*     */       //   12: dup
/*     */       //   13: ifnonnull -> 24
/*     */       //   16: pop
/*     */       //   17: aload_1
/*     */       //   18: ifnull -> 31
/*     */       //   21: goto -> 208
/*     */       //   24: aload_1
/*     */       //   25: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   28: ifeq -> 208
/*     */       //   31: aload_0
/*     */       //   32: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   35: aload_0
/*     */       //   36: invokevirtual x : ()I
/*     */       //   39: aload_0
/*     */       //   40: invokevirtual y : ()I
/*     */       //   43: aload_0
/*     */       //   44: invokevirtual z : ()I
/*     */       //   47: invokevirtual func_72899_e : (III)Z
/*     */       //   50: ifeq -> 208
/*     */       //   53: aload_0
/*     */       //   54: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   57: aload_0
/*     */       //   58: invokevirtual x : ()I
/*     */       //   61: aload_0
/*     */       //   62: invokevirtual y : ()I
/*     */       //   65: aload_0
/*     */       //   66: invokevirtual z : ()I
/*     */       //   69: invokevirtual func_147437_c : (III)Z
/*     */       //   72: ifne -> 208
/*     */       //   75: aload_0
/*     */       //   76: invokevirtual player : ()Lli/cil/oc/server/agent/Player;
/*     */       //   79: invokevirtual agent : ()Lli/cil/oc/api/internal/Agent;
/*     */       //   82: invokeinterface machine : ()Lli/cil/oc/api/machine/Machine;
/*     */       //   87: invokeinterface isRunning : ()Z
/*     */       //   92: ifeq -> 208
/*     */       //   95: bipush #10
/*     */       //   97: aload_0
/*     */       //   98: invokevirtual ticks : ()I
/*     */       //   101: imul
/*     */       //   102: getstatic scala/math/package$.MODULE$ : Lscala/math/package$;
/*     */       //   105: aload_0
/*     */       //   106: invokevirtual ticksTotal : ()I
/*     */       //   109: iconst_1
/*     */       //   110: invokevirtual max : (II)I
/*     */       //   113: idiv
/*     */       //   114: istore_2
/*     */       //   115: iload_2
/*     */       //   116: bipush #10
/*     */       //   118: if_icmplt -> 149
/*     */       //   121: aload_0
/*     */       //   122: invokevirtual player : ()Lli/cil/oc/server/agent/Player;
/*     */       //   125: aload_0
/*     */       //   126: invokevirtual x : ()I
/*     */       //   129: aload_0
/*     */       //   130: invokevirtual y : ()I
/*     */       //   133: aload_0
/*     */       //   134: invokevirtual z : ()I
/*     */       //   137: aload_0
/*     */       //   138: invokevirtual side : ()I
/*     */       //   141: iconst_1
/*     */       //   142: invokevirtual clickBlock : (IIIIZ)D
/*     */       //   145: pop2
/*     */       //   146: goto -> 207
/*     */       //   149: aload_0
/*     */       //   150: aload_0
/*     */       //   151: invokevirtual ticks : ()I
/*     */       //   154: iconst_1
/*     */       //   155: iadd
/*     */       //   156: invokevirtual ticks_$eq : (I)V
/*     */       //   159: iload_2
/*     */       //   160: aload_0
/*     */       //   161: invokevirtual lastDamageSent : ()I
/*     */       //   164: if_icmpeq -> 193
/*     */       //   167: aload_0
/*     */       //   168: iload_2
/*     */       //   169: invokevirtual lastDamageSent_$eq : (I)V
/*     */       //   172: aload_0
/*     */       //   173: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   176: iconst_m1
/*     */       //   177: aload_0
/*     */       //   178: invokevirtual x : ()I
/*     */       //   181: aload_0
/*     */       //   182: invokevirtual y : ()I
/*     */       //   185: aload_0
/*     */       //   186: invokevirtual z : ()I
/*     */       //   189: iload_2
/*     */       //   190: invokevirtual func_147443_d : (IIIII)V
/*     */       //   193: getstatic li/cil/oc/common/EventHandler$.MODULE$ : Lli/cil/oc/common/EventHandler$;
/*     */       //   196: new li/cil/oc/server/agent/Player$DamageOverTime$$anonfun$tick$1
/*     */       //   199: dup
/*     */       //   200: aload_0
/*     */       //   201: invokespecial <init> : (Lli/cil/oc/server/agent/Player$DamageOverTime;)V
/*     */       //   204: invokevirtual scheduleServer : (Lscala/Function0;)V
/*     */       //   207: return
/*     */       //   208: aload_0
/*     */       //   209: invokevirtual world : ()Lnet/minecraft/world/World;
/*     */       //   212: iconst_m1
/*     */       //   213: aload_0
/*     */       //   214: invokevirtual x : ()I
/*     */       //   217: aload_0
/*     */       //   218: invokevirtual y : ()I
/*     */       //   221: aload_0
/*     */       //   222: invokevirtual z : ()I
/*     */       //   225: iconst_m1
/*     */       //   226: invokevirtual func_147443_d : (IIIII)V
/*     */       //   229: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #635	-> 0
/*     */       //   #640	-> 95
/*     */       //   #641	-> 115
/*     */       //   #642	-> 121
/*     */       //   #645	-> 149
/*     */       //   #646	-> 159
/*     */       //   #647	-> 167
/*     */       //   #648	-> 172
/*     */       //   #650	-> 193
/*     */       //   #633	-> 207
/*     */       //   #636	-> 208
/*     */       //   #637	-> 229
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	230	0	this	Lli/cil/oc/server/agent/Player$DamageOverTime;
/*     */       //   115	115	2	damage	I
/*     */     }
/*     */ 
/*     */     
/*     */     public final class Player$DamageOverTime$$anonfun$tick$1
/*     */       extends AbstractFunction0.mcV.sp
/*     */       implements Serializable
/*     */     {
/*     */       public static final long serialVersionUID = 0L;
/*     */ 
/*     */       
/*     */       public final void apply()
/*     */       {
/* 650 */         apply$mcV$sp(); } public void apply$mcV$sp() { this.$outer.tick(); }
/*     */ 
/*     */       
/*     */       public Player$DamageOverTime$$anonfun$tick$1(Player.DamageOverTime $outer) {}
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\agent\Player.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */