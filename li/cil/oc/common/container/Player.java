/*     */ package li.cil.oc.common.container;
/*     */ 
/*     */ import li.cil.oc.common.InventorySlots;
/*     */ import net.minecraft.entity.player.InventoryPlayer;
/*     */ import net.minecraft.inventory.IInventory;
/*     */ import net.minecraft.inventory.Slot;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import scala.Function1;
/*     */ import scala.Serializable;
/*     */ import scala.collection.convert.WrapAsScala$;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t}f!B\001\003\003\003i!A\002)mCf,'O\003\002\004\t\005I1m\0348uC&tWM\035\006\003\013\031\taaY8n[>t'BA\004\t\003\ty7M\003\002\n\025\005\0311-\0337\013\003-\t!\001\\5\004\001M\021\001A\004\t\003\037Yi\021\001\005\006\003#I\t\021\"\0338wK:$xN]=\013\005M!\022!C7j]\026\034'/\0314u\025\005)\022a\0018fi&\021q\003\005\002\n\007>tG/Y5oKJD\001\"\007\001\003\006\004%\tAG\001\020a2\f\0270\032:J]Z,g\016^8ssV\t1\004\005\002\035C5\tQD\003\002\037?\0051\001\017\\1zKJT!\001\t\n\002\r\025tG/\033;z\023\t\021SDA\bJ]Z,g\016^8ssBc\027-_3s\021!!\003A!A!\002\023Y\022\001\0059mCf,'/\0238wK:$xN]=!\021!1\003A!b\001\n\0039\023AD8uQ\026\024\030J\034<f]R|'/_\013\002QA\021q\"K\005\003UA\021!\"S%om\026tGo\034:z\021!a\003A!A!\002\023A\023aD8uQ\026\024\030J\034<f]R|'/\037\021\t\0139\002A\021A\030\002\rqJg.\033;?)\r\001$g\r\t\003c\001i\021A\001\005\00635\002\ra\007\005\006M5\002\r\001\013\005\bk\001\021\r\021\"\0057\003Q\001H.Y=fe&sg/\0328u_JL8+\033>f1V\tq\007\005\0029w5\t\021HC\001;\003\025\0318-\0317b\023\ta\024HA\002J]RDaA\020\001!\002\0239\024!\0069mCf,'/\0238wK:$xN]=TSj,\007\f\t\005\b\001\002\021\r\021\"\0057\003Q\001H.Y=fe&sg/\0328u_JL8+\033>f3\"1!\t\001Q\001\n]\nQ\003\0357bs\026\024\030J\034<f]R|'/_*ju\026L\006\005C\004E\001\t\007I\021\003\034\002\021Mdw\016^*ju\026DaA\022\001!\002\0239\024!C:m_R\034\026N_3!\021\025A\005\001\"\021J\003=\031\027M\\%oi\026\024\030m\031;XSRDGC\001&N!\tA4*\003\002Ms\t9!i\\8mK\006t\007\"\002\020H\001\004q\005C\001\017P\023\t\001VD\001\007F]RLG/\037)mCf,'\017C\003S\001\021\0053+A\005tY>$8\t\\5dWR)AK\027/_AB\021Q\013W\007\002-*\021qKE\001\005SR,W.\003\002Z-\nI\021\n^3n'R\f7m\033\005\0067F\003\raN\001\005g2|G\017C\003^#\002\007q'\001\006n_V\034Xm\0217jG.DQaX)A\002]\nA\002[8mI&twm\0255jMRDQAH)A\0029CQA\031\001\005B\r\f1\003\036:b]N4WM]*uC\016\\\027J\\*m_R$2\001\0263f\021\025q\022\r1\001O\021\0251\027\r1\0018\003\025Ig\016Z3y\021\025A\007\001\"\005j\003Q!(/_'pm\026\fE\016\\*m_R$vn\0257piR\031!J[8\t\013-<\007\031\0017\002\t\031\024x.\034\t\003\0375L!A\034\t\003\tMcw\016\036\005\006a\036\004\r\001\\\001\003i>DQA\035\001\005\022M\f\021BZ5mY>\023H-\032:\025\007Q\f\t\001E\002v{^r!A^>\017\005]TX\"\001=\013\005ed\021A\002\037s_>$h(C\001;\023\ta\030(A\004qC\016\\\027mZ3\n\005y|(aA*fc*\021A0\017\005\007\003\007\t\b\031\001&\002\021\t\f7m\033$jY2Dq!a\002\001\t#\tI!\001\fuef$&/\0318tM\026\0248\013^1dW&s7\013\\8u)\031\tY!!\005\002\024A\031\001(!\004\n\007\005=\021H\001\003V]&$\bBB6\002\006\001\007A\016C\004\002\026\005\025\001\031\001&\002'%tGo\034)mCf,'/\0238wK:$xN]=\t\017\005e\001\001\"\001\002\034\005\021\022\r\0323TY>$Hk\\\"p]R\f\027N\\3s))\tY!!\b\002\"\005\025\022Q\007\005\b\003?\t9\0021\0018\003\005A\bbBA\022\003/\001\raN\001\002s\"I1,a\006\021\002\003\007\021q\005\t\005\003S\tyCD\0029\003WI1!!\f:\003\031\001&/\0323fM&!\021\021GA\032\005\031\031FO]5oO*\031\021QF\035\t\023\005]\022q\003I\001\002\0049\024\001\002;jKJDq!!\007\001\t\003\tY\004\006\006\002\f\005u\022qHA!\003WBq!a\b\002:\001\007q\007C\004\002$\005e\002\031A\034\t\021\005\r\023\021\ba\001\003\013\nA!\0338g_B)\001(a\022\002L%\031\021\021J\035\003\013\005\023(/Y=\021\013a\n9%!\024\021\t\005=\023Q\r\b\005\003#\n\tG\004\003\002T\005}c\002BA+\003;rA!a\026\002\\9\031q/!\027\n\003-I!!\003\006\n\005\035A\021BA\003\007\023\r\t\031\007B\001\017\023:4XM\034;pef\034Fn\034;t\023\021\t9'!\033\003\033%sg/\0328u_JL8\013\\8u\025\r\t\031\007\002\005\t\003[\nI\0041\001\002p\005\0312m\0348uC&tWM\035+jKJ<U\r\036;feB!\001(!\0358\023\r\t\031(\017\002\n\rVt7\r^5p]BBq!!\007\001\t\003\t9\b\006\005\002\f\005e\0241PA?\021\035\ty\"!\036A\002]Bq!a\t\002v\001\007q\007\003\005\002D\005U\004\031AA@!\035A\024\021QAC\003\033J1!a!:\005%1UO\\2uS>t\027\007E\0022\003\017K1!!#\003\005Q!\025P\\1nS\016\034u.\0349p]\026tGo\0257pi\"9\021Q\022\001\005\022\005=\025aF1eIBc\027-_3s\023:4XM\034;pef\034Fn\034;t)\031\tY!!%\002\026\"9\0211SAF\001\0049\024\001\0027fMRDq!a&\002\f\002\007q'A\002u_BDq!a'\001\t#\ti*A\013tK:$\007K]8he\026\0348OQ1s+B$\027\r^3\025\r\005-\021qTAR\021\035\t\t+!'A\002]\n!!\0333\t\017\005\025\026\021\024a\001o\005)a/\0317vK\"9\021\021\026\001\005B\005-\026\001\0063fi\026\034G/\0218e'\026tGm\0215b]\036,7\017\006\002\002\f!9\021q\026\001\005\022\005E\026a\0063fi\026\034GoQ;ti>lG)\031;b\007\"\fgnZ3t)\021\tY!a-\t\021\005U\026Q\026a\001\003o\0131A\0342u!\021\tI,!0\016\005\005m&bAA[%%!\021qXA^\0059q%\t\026+bO\016{W\016]8v]\022Dq!a1\001\t\003\t)-\001\tva\022\fG/Z\"vgR|W\016R1uCR!\0211BAd\021!\t),!1A\002\005]fABAf\001!\tiM\001\tTs:\034\007N]8oSj,G\rR1uCN!\021\021ZA\\\021\035q\023\021\032C\001\003#$\"!a5\021\t\005U\027\021Z\007\002\001!Q\021\021\\Ae\001\004%I!a7\002\013\021,G\016^1\026\005\005]\006BCAp\003\023\004\r\021\"\003\002b\006IA-\0327uC~#S-\035\013\005\003\027\t\031\017\003\006\002f\006u\027\021!a\001\003o\0131\001\037\0232\021%\tI/!3!B\023\t9,\001\004eK2$\030\r\t\005\t\003[\fI\r\"\001\002\\\006Aq-\032;EK2$\030\r\003\005\002r\006%G\021IAz\003\031\031X\r\036+bOR1\0211BA{\003sD\001\"a>\002p\002\007\021qE\001\004W\026L\b\002CAS\003_\004\r!a?\021\t\005e\026Q`\005\005\003\fYLA\004O\005R\023\025m]3\t\021\t\r\021\021\032C!\005\013\tqa]3u\005f$X\r\006\004\002\f\t\035!\021\002\005\t\003o\024\t\0011\001\002(!A\021Q\025B\001\001\004\021Y\001E\0029\005\033I1Aa\004:\005\021\021\025\020^3\t\021\tM\021\021\032C!\005+\t\001b]3u'\"|'\017\036\013\007\003\027\0219B!\007\t\021\005](\021\003a\001\003OA\001\"!*\003\022\001\007!1\004\t\004q\tu\021b\001B\020s\t)1\013[8si\"A!1EAe\t\003\022)#\001\006tKRLe\016^3hKJ$b!a\003\003(\t%\002\002CA|\005C\001\r!a\n\t\017\005\025&\021\005a\001o!A!QFAe\t\003\022y#A\004tKRduN\\4\025\r\005-!\021\007B\032\021!\t9Pa\013A\002\005\035\002\002CAS\005W\001\rA!\016\021\007a\0229$C\002\003:e\022A\001T8oO\"A!QHAe\t\003\022y$\001\005tKR4En\\1u)\031\tYA!\021\003D!A\021q\037B\036\001\004\t9\003\003\005\002&\nm\002\031\001B#!\rA$qI\005\004\005\023J$!\002$m_\006$\b\002\003B'\003\023$\tEa\024\002\023M,G\017R8vE2,GCBA\006\005#\022\031\006\003\005\002x\n-\003\031AA\024\021!\t)Ka\023A\002\tU\003c\001\035\003X%\031!\021L\035\003\r\021{WO\0317f\021!\021i&!3\005B\t}\023!C:fiN#(/\0338h)\031\tYA!\031\003d!A\021q\037B.\001\004\t9\003\003\005\002&\nm\003\031AA\024\021!\0219'!3\005B\t%\024\001D:fi\nKH/Z!se\006LHCBA\006\005W\022i\007\003\005\002x\n\025\004\031AA\024\021!\t)K!\032A\002\t=\004#\002\035\002H\t-\001\002\003B:\003\023$\tE!\036\002\027M,G/\0238u\003J\024\030-\037\013\007\003\027\0219H!\037\t\021\005](\021\017a\001\003OA\001\"!*\003r\001\007!1\020\t\005q\005\035s\007\003\005\003\000\005%G\021\tBA\003)\031X\r\036\"p_2,\027M\034\013\007\003\027\021\031I!\"\t\021\005](Q\020a\001\003OAq!!*\003~\001\007!\nC\005\003\n\002\021\r\021\"\005\003\f\006\0012/\0378dQJ|g.\033>fI\022\013G/Y\013\003\003'D\001Ba$\001A\003%\0211[\001\022gft7\r\033:p]&TX\r\032#bi\006\004\003\"\003BJ\001E\005I\021\001BK\003q\tG\rZ*m_R$vnQ8oi\006Lg.\032:%I\0264\027-\0367uIM*\"Aa&+\t\005\035\"\021T\026\003\0057\003BA!(\003(6\021!q\024\006\005\005C\023\031+A\005v]\016DWmY6fI*\031!QU\035\002\025\005tgn\034;bi&|g.\003\003\003*\n}%!E;oG\",7m[3e-\006\024\030.\0318dK\"I!Q\026\001\022\002\023\005!qV\001\035C\022$7\013\\8u)>\034uN\034;bS:,'\017\n3fM\006,H\016\036\0235+\t\021\tLK\0028\0053CAB!.\001!\003\005\t\021!C\001\005o\013A\004\035:pi\026\034G/\0323%C\022$7\013\\8u)>\034uN\034;bS:,'\017\006\003\003:\nuFc\0017\003<\"I\021Q\035BZ\003\003\005\r\001\034\005\n\003K\024\031,!AA\002A\002")
/*     */ public abstract class Player extends Container {
/*     */   private final InventoryPlayer playerInventory;
/*     */   private final IInventory otherInventory;
/*     */   private final int playerInventorySizeX;
/*     */   
/*  22 */   public InventoryPlayer playerInventory() { return this.playerInventory; } private final int playerInventorySizeY; private final int slotSize; private final SynchronizedData synchronizedData; public IInventory otherInventory() { return this.otherInventory; }
/*     */   
/*  24 */   public Player(InventoryPlayer playerInventory, IInventory otherInventory) { this.playerInventorySizeX = package$.MODULE$.min(9, InventoryPlayer.func_70451_h());
/*     */ 
/*     */     
/*  27 */     this.playerInventorySizeY = package$.MODULE$.min(4, (playerInventory.func_70302_i_() - 4) / playerInventorySizeX());
/*     */ 
/*     */     
/*  30 */     this.slotSize = 18;
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
/* 260 */     this.synchronizedData = new SynchronizedData(this); } public int playerInventorySizeX() { return this.playerInventorySizeX; } public int playerInventorySizeY() { return this.playerInventorySizeY; } public int slotSize() { return this.slotSize; } public SynchronizedData synchronizedData() { return this.synchronizedData; }
/*     */ 
/*     */   
/*     */   public boolean func_75145_c(EntityPlayer player) {
/*     */     return otherInventory().func_70300_a(player);
/*     */   }
/*     */   
/*     */   public ItemStack func_75144_a(int slot, int mouseClick, int holdingShift, EntityPlayer player) {
/*     */     ItemStack result = super.func_75144_a(slot, mouseClick, holdingShift, player);
/*     */     if (SideTracker.isServer())
/*     */       func_75142_b(); 
/*     */     return (result != null && result.field_77994_a > 0) ? result : null;
/*     */   }
/*     */   
/*     */   public ItemStack func_82846_b(EntityPlayer player, int index) {
/*     */     // Byte code:
/*     */     //   0: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */     //   3: aload_0
/*     */     //   4: getfield field_75151_b : Ljava/util/List;
/*     */     //   7: iload_2
/*     */     //   8: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   13: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */     //   16: new li/cil/oc/common/container/Player$$anonfun$1
/*     */     //   19: dup
/*     */     //   20: aload_0
/*     */     //   21: invokespecial <init> : (Lli/cil/oc/common/container/Player;)V
/*     */     //   24: invokevirtual map : (Lscala/Function1;)Lscala/Option;
/*     */     //   27: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */     //   30: invokevirtual $conforms : ()Lscala/Predef$$less$colon$less;
/*     */     //   33: invokevirtual orNull : (Lscala/Predef$$less$colon$less;)Ljava/lang/Object;
/*     */     //   36: checkcast net/minecraft/inventory/Slot
/*     */     //   39: astore_3
/*     */     //   40: aload_3
/*     */     //   41: ifnull -> 102
/*     */     //   44: aload_3
/*     */     //   45: invokevirtual func_75216_d : ()Z
/*     */     //   48: ifeq -> 102
/*     */     //   51: aload_0
/*     */     //   52: aload_3
/*     */     //   53: aload_3
/*     */     //   54: getfield field_75224_c : Lnet/minecraft/inventory/IInventory;
/*     */     //   57: aload_0
/*     */     //   58: invokevirtual otherInventory : ()Lnet/minecraft/inventory/IInventory;
/*     */     //   61: astore #4
/*     */     //   63: dup
/*     */     //   64: ifnonnull -> 76
/*     */     //   67: pop
/*     */     //   68: aload #4
/*     */     //   70: ifnull -> 84
/*     */     //   73: goto -> 88
/*     */     //   76: aload #4
/*     */     //   78: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   81: ifeq -> 88
/*     */     //   84: iconst_1
/*     */     //   85: goto -> 89
/*     */     //   88: iconst_0
/*     */     //   89: invokevirtual tryTransferStackInSlot : (Lnet/minecraft/inventory/Slot;Z)V
/*     */     //   92: invokestatic isServer : ()Z
/*     */     //   95: ifeq -> 102
/*     */     //   98: aload_0
/*     */     //   99: invokevirtual func_75142_b : ()V
/*     */     //   102: aconst_null
/*     */     //   103: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #46	-> 0
/*     */     //   #47	-> 40
/*     */     //   #48	-> 51
/*     */     //   #49	-> 92
/*     */     //   #50	-> 98
/*     */     //   #53	-> 102
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	104	0	this	Lli/cil/oc/common/container/Player;
/*     */     //   0	104	1	player	Lnet/minecraft/entity/player/EntityPlayer;
/*     */     //   0	104	2	index	I
/*     */     //   40	63	3	slot	Lnet/minecraft/inventory/Slot;
/*     */   }
/*     */   
/*     */   public final class Player$$anonfun$1 extends AbstractFunction1<Object, Slot> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final Slot apply(Object x$1) {
/*     */       return (Slot)x$1;
/*     */     }
/*     */     
/*     */     public Player$$anonfun$1(Player $outer) {}
/*     */   }
/*     */   
/*     */   public boolean tryMoveAllSlotToSlot(Slot from, Slot to) {
/*     */     if (to == null)
/*     */       return false; 
/*     */     if (from != null && from.func_75216_d() && from.func_75211_c() != null && (from.func_75211_c()).field_77994_a != 0) {
/*     */       IInventory iInventory = from.field_75224_c;
/*     */       if (to.field_75224_c == null) {
/*     */         if (iInventory != null)
/*     */           ItemStack fromStack = from.func_75211_c(); 
/*     */       } else {
/*     */         if (to.field_75224_c.equals(iInventory))
/*     */           return false; 
/*     */         ItemStack itemStack = from.func_75211_c();
/*     */       } 
/*     */       return false;
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public Seq<Object> fillOrder(boolean backFill) {
/*     */     return (Seq<Object>)(backFill ? WrapAsScala$.MODULE$.asScalaBuffer(this.field_75151_b).indices().reverse() : WrapAsScala$.MODULE$.asScalaBuffer(this.field_75151_b).indices()).sortBy((Function1)new Player$$anonfun$fillOrder$1(this), (Ordering)Ordering$Int$.MODULE$);
/*     */   }
/*     */   
/*     */   public final class Player$$anonfun$fillOrder$1 extends AbstractFunction1.mcII.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final int apply(int i) {
/*     */       return apply$mcII$sp(i);
/*     */     }
/*     */     
/*     */     public int apply$mcII$sp(int i) {
/*     */       byte b;
/*     */       Object object = WrapAsScala$.MODULE$.asScalaBuffer(this.$outer.field_75151_b).apply(i);
/*     */       if (object instanceof Slot) {
/*     */         Slot slot = (Slot)object;
/*     */         if (slot.func_75216_d())
/*     */           return -1; 
/*     */       } 
/*     */       if (object instanceof ComponentSlot) {
/*     */         Object object1 = object;
/*     */         b = ((ComponentSlot)object1).tier();
/*     */       } else {
/*     */         b = 99;
/*     */       } 
/*     */       return b;
/*     */     }
/*     */     
/*     */     public Player$$anonfun$fillOrder$1(Player $outer) {}
/*     */   }
/*     */   
/*     */   public void tryTransferStackInSlot(Slot from, boolean intoPlayerInventory) {
/*     */     Object object = new Object();
/*     */     try {
/*     */       fillOrder(intoPlayerInventory).foreach((Function1)new Player$$anonfun$tryTransferStackInSlot$1(this, from, object));
/*     */     } catch (NonLocalReturnControl nonLocalReturnControl) {
/*     */       if (nonLocalReturnControl.key() == object) {
/*     */         nonLocalReturnControl.value$mcV$sp();
/*     */         return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public final class Player$$anonfun$tryTransferStackInSlot$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final Slot from$1;
/*     */     private final Object nonLocalReturnKey1$1;
/*     */     
/*     */     public final void apply(int i) {
/*     */       apply$mcVI$sp(i);
/*     */     }
/*     */     
/*     */     public Player$$anonfun$tryTransferStackInSlot$1(Player $outer, Slot from$1, Object nonLocalReturnKey1$1) {}
/*     */     
/*     */     public void apply$mcVI$sp(int i) {
/*     */       boolean bool;
/*     */       Slot slot = (Slot)this.$outer.field_75151_b.get(i);
/*     */       if (slot instanceof Slot) {
/*     */         Slot slot1 = slot;
/*     */         bool = this.$outer.tryMoveAllSlotToSlot(this.from$1, slot1);
/*     */       } else {
/*     */         bool = false;
/*     */       } 
/*     */       if (bool)
/*     */         throw new NonLocalReturnControl.mcV.sp(this.nonLocalReturnKey1$1, BoxedUnit.UNIT); 
/*     */     }
/*     */   }
/*     */   
/*     */   public String addSlotToContainer$default$3() {
/*     */     return Slot$.MODULE$.Any();
/*     */   }
/*     */   
/*     */   public int addSlotToContainer$default$4() {
/*     */     return Integer.MAX_VALUE;
/*     */   }
/*     */   
/*     */   public void addSlotToContainer(int x, int y, String slot, int tier) {
/*     */     int index = this.field_75151_b.size();
/*     */     func_75146_a(new StaticComponentSlot(this, otherInventory(), index, x, y, slot, tier));
/*     */   }
/*     */   
/*     */   public void addSlotToContainer(int x, int y, InventorySlots.InventorySlot[][] info, Function0<Object> containerTierGetter) {
/*     */     int index = this.field_75151_b.size();
/*     */     func_75146_a(new DynamicComponentSlot(this, otherInventory(), index, x, y, (Function1<DynamicComponentSlot, InventorySlots.InventorySlot>)new Player$$anonfun$addSlotToContainer$2(this, info), containerTierGetter));
/*     */   }
/*     */   
/*     */   public final class Player$$anonfun$addSlotToContainer$2 extends AbstractFunction1<DynamicComponentSlot, InventorySlots.InventorySlot> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final InventorySlots.InventorySlot[][] info$1;
/*     */     
/*     */     public final InventorySlots.InventorySlot apply(DynamicComponentSlot slot) {
/*     */       return this.info$1[slot.containerTierGetter().apply$mcI$sp()][slot.getSlotIndex()];
/*     */     }
/*     */     
/*     */     public Player$$anonfun$addSlotToContainer$2(Player $outer, InventorySlots.InventorySlot[][] info$1) {}
/*     */   }
/*     */   
/*     */   public void addSlotToContainer(int x, int y, Function1<DynamicComponentSlot, InventorySlots.InventorySlot> info) {
/*     */     int index = this.field_75151_b.size();
/*     */     func_75146_a(new DynamicComponentSlot(this, otherInventory(), index, x, y, info, (Function0<Object>)new Player$$anonfun$addSlotToContainer$1(this)));
/*     */   }
/*     */   
/*     */   public final class Player$$anonfun$addSlotToContainer$1 extends AbstractFunction0.mcI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final int apply() {
/*     */       return apply$mcI$sp();
/*     */     }
/*     */     
/*     */     public int apply$mcI$sp() {
/*     */       return 0;
/*     */     }
/*     */     
/*     */     public Player$$anonfun$addSlotToContainer$1(Player $outer) {}
/*     */   }
/*     */   
/*     */   public void addPlayerInventorySlots(int left, int top) {
/*     */     RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(1), playerInventorySizeY()).foreach$mVc$sp((Function1)new Player$$anonfun$addPlayerInventorySlots$1(this, left, top));
/*     */     int quickBarSpacing = 4;
/*     */     RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), playerInventorySizeX()).foreach((Function1)new Player$$anonfun$addPlayerInventorySlots$2(this, left, top, quickBarSpacing));
/*     */   }
/*     */   
/*     */   public final class Player$$anonfun$addPlayerInventorySlots$1 extends AbstractFunction1.mcVI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final int left$1;
/*     */     public final int top$1;
/*     */     
/*     */     public final void apply(int slotY) {
/*     */       apply$mcVI$sp(slotY);
/*     */     }
/*     */     
/*     */     public Player$$anonfun$addPlayerInventorySlots$1(Player $outer, int left$1, int top$1) {}
/*     */     
/*     */     public void apply$mcVI$sp(int slotY) {
/*     */       RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), this.$outer.playerInventorySizeX()).foreach((Function1)new Player$$anonfun$addPlayerInventorySlots$1$$anonfun$apply$mcVI$sp$1(this, slotY));
/*     */     }
/*     */     
/*     */     public final class Player$$anonfun$addPlayerInventorySlots$1$$anonfun$apply$mcVI$sp$1 extends AbstractFunction1<Object, Slot> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       private final int slotY$1;
/*     */       
/*     */       public Player$$anonfun$addPlayerInventorySlots$1$$anonfun$apply$mcVI$sp$1(Player$$anonfun$addPlayerInventorySlots$1 $outer, int slotY$1) {}
/*     */       
/*     */       public final Slot apply(int slotX) {
/*     */         int index = slotX + this.slotY$1 * this.$outer.li$cil$oc$common$container$Player$$anonfun$$$outer().playerInventorySizeX();
/*     */         int x = this.$outer.left$1 + slotX * this.$outer.li$cil$oc$common$container$Player$$anonfun$$$outer().slotSize();
/*     */         int y = this.$outer.top$1 + (this.slotY$1 - 1) * this.$outer.li$cil$oc$common$container$Player$$anonfun$$$outer().slotSize();
/*     */         return this.$outer.li$cil$oc$common$container$Player$$anonfun$$$outer().protected$addSlotToContainer(this.$outer.li$cil$oc$common$container$Player$$anonfun$$$outer(), new Slot((IInventory)this.$outer.li$cil$oc$common$container$Player$$anonfun$$$outer().playerInventory(), index, x, y));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public final class Player$$anonfun$addPlayerInventorySlots$2 extends AbstractFunction1<Object, Slot> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final int left$1;
/*     */     private final int top$1;
/*     */     private final int quickBarSpacing$1;
/*     */     
/*     */     public Player$$anonfun$addPlayerInventorySlots$2(Player $outer, int left$1, int top$1, int quickBarSpacing$1) {}
/*     */     
/*     */     public final Slot apply(int index) {
/*     */       int x = this.left$1 + index * this.$outer.slotSize();
/*     */       int y = this.top$1 + this.$outer.slotSize() * (this.$outer.playerInventorySizeY() - 1) + this.quickBarSpacing$1;
/*     */       return this.$outer.protected$addSlotToContainer(this.$outer, new Slot((IInventory)this.$outer.playerInventory(), index, x, y));
/*     */     }
/*     */   }
/*     */   
/*     */   public void sendProgressBarUpdate(int id, int value) {
/*     */     WrapAsScala$.MODULE$.asScalaBuffer(this.field_75149_d).foreach((Function1)new Player$$anonfun$sendProgressBarUpdate$1(this, id, value));
/*     */   }
/*     */   
/*     */   public final class Player$$anonfun$sendProgressBarUpdate$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final int id$1;
/*     */     private final int value$1;
/*     */     
/*     */     public final void apply(Object entry) {
/*     */       Object object = entry;
/*     */       if (object instanceof ICrafting) {
/*     */         Object object1 = object;
/*     */         ((ICrafting)object1).func_71112_a(this.$outer, this.id$1, this.value$1);
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } else {
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } 
/*     */     }
/*     */     
/*     */     public Player$$anonfun$sendProgressBarUpdate$1(Player $outer, int id$1, int value$1) {}
/*     */   }
/*     */   
/*     */   public void func_75142_b() {
/*     */     super.func_75142_b();
/*     */     if (SideTracker.isServer()) {
/*     */       NBTTagCompound nbt = new NBTTagCompound();
/*     */       detectCustomDataChanges(nbt);
/*     */       WrapAsScala$.MODULE$.asScalaBuffer(this.field_75149_d).foreach((Function1)new Player$$anonfun$detectAndSendChanges$1(this, nbt));
/*     */     } 
/*     */   }
/*     */   
/*     */   public final class Player$$anonfun$detectAndSendChanges$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final NBTTagCompound nbt$1;
/*     */     
/*     */     public final void apply(Object entry) {
/*     */       Object object = entry;
/*     */       if (object instanceof net.minecraftforge.common.util.FakePlayer) {
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } else if (object instanceof EntityPlayerMP) {
/*     */         EntityPlayerMP entityPlayerMP = (EntityPlayerMP)object;
/*     */         PacketSender$.MODULE$.sendContainerUpdate(this.$outer, this.nbt$1, entityPlayerMP);
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } else {
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */       } 
/*     */     }
/*     */     
/*     */     public Player$$anonfun$detectAndSendChanges$1(Player $outer, NBTTagCompound nbt$1) {}
/*     */   }
/*     */   
/*     */   public void detectCustomDataChanges(NBTTagCompound nbt) {
/*     */     NBTTagCompound delta = synchronizedData().getDelta();
/*     */     if (delta != null && !delta.func_82582_d())
/*     */       nbt.func_74782_a("delta", (NBTBase)delta); 
/*     */   }
/*     */   
/*     */   public void updateCustomData(NBTTagCompound nbt) {
/*     */     if (nbt.func_74764_b("delta")) {
/*     */       NBTTagCompound delta = nbt.func_74775_l("delta");
/*     */       WrapAsScala$.MODULE$.asScalaSet(delta.func_150296_c()).foreach((Function1)new Player$$anonfun$updateCustomData$1(this, delta));
/*     */     } 
/*     */   }
/*     */   
/*     */   public final class Player$$anonfun$updateCustomData$1 extends AbstractFunction1<Object, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final NBTTagCompound delta$1;
/*     */     
/*     */     public final void apply(Object x0$1) {
/*     */       Object object = x0$1;
/*     */       if (object instanceof String) {
/*     */         String str = (String)object;
/*     */         this.$outer.synchronizedData().func_74782_a(str, this.delta$1.func_74781_a(str));
/*     */         BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*     */         return;
/*     */       } 
/*     */       throw new MatchError(object);
/*     */     }
/*     */     
/*     */     public Player$$anonfun$updateCustomData$1(Player $outer, NBTTagCompound delta$1) {}
/*     */   }
/*     */   
/*     */   public class SynchronizedData extends NBTTagCompound {
/*     */     private NBTTagCompound delta = new NBTTagCompound();
/*     */     
/*     */     private NBTTagCompound delta() {
/*     */       return this.delta;
/*     */     }
/*     */     
/*     */     private void delta_$eq(NBTTagCompound x$1) {
/*     */       this.delta = x$1;
/*     */     }
/*     */     
/*     */     public synchronized NBTTagCompound getDelta() {
/*     */       NBTTagCompound result = delta();
/*     */       delta_$eq(new NBTTagCompound());
/*     */       return delta().func_82582_d() ? null : result;
/*     */     }
/*     */     
/*     */     public synchronized void func_74782_a(String key, NBTBase value) {
/*     */       if (!value.equals(func_74781_a(key)))
/*     */         delta().func_74782_a(key, value); 
/*     */       super.func_74782_a(key, value);
/*     */     }
/*     */     
/*     */     public synchronized void func_74774_a(String key, byte value) {
/*     */       if (value != func_74771_c(key))
/*     */         delta().func_74774_a(key, value); 
/*     */       super.func_74774_a(key, value);
/*     */     }
/*     */     
/*     */     public synchronized void func_74777_a(String key, short value) {
/*     */       if (value != func_74765_d(key))
/*     */         delta().func_74777_a(key, value); 
/*     */       super.func_74777_a(key, value);
/*     */     }
/*     */     
/*     */     public synchronized void func_74768_a(String key, int value) {
/*     */       if (value != func_74762_e(key))
/*     */         delta().func_74768_a(key, value); 
/*     */       super.func_74768_a(key, value);
/*     */     }
/*     */     
/*     */     public synchronized void func_74772_a(String key, long value) {
/*     */       if (value != func_74763_f(key))
/*     */         delta().func_74772_a(key, value); 
/*     */       super.func_74772_a(key, value);
/*     */     }
/*     */     
/*     */     public synchronized void func_74776_a(String key, float value) {
/*     */       if (value != func_74760_g(key))
/*     */         delta().func_74776_a(key, value); 
/*     */       super.func_74776_a(key, value);
/*     */     }
/*     */     
/*     */     public synchronized void func_74780_a(String key, double value) {
/*     */       if (value != func_74769_h(key))
/*     */         delta().func_74780_a(key, value); 
/*     */       super.func_74780_a(key, value);
/*     */     }
/*     */     
/*     */     public synchronized void func_74778_a(String key, String value) {
/*     */       // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: aload_0
/*     */       //   2: aload_1
/*     */       //   3: invokevirtual func_74779_i : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   6: astore_3
/*     */       //   7: dup
/*     */       //   8: ifnonnull -> 19
/*     */       //   11: pop
/*     */       //   12: aload_3
/*     */       //   13: ifnull -> 35
/*     */       //   16: goto -> 26
/*     */       //   19: aload_3
/*     */       //   20: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   23: ifne -> 35
/*     */       //   26: aload_0
/*     */       //   27: invokespecial delta : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   30: aload_1
/*     */       //   31: aload_2
/*     */       //   32: invokevirtual func_74778_a : (Ljava/lang/String;Ljava/lang/String;)V
/*     */       //   35: aload_0
/*     */       //   36: aload_1
/*     */       //   37: aload_2
/*     */       //   38: invokespecial func_74778_a : (Ljava/lang/String;Ljava/lang/String;)V
/*     */       //   41: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #240	-> 0
/*     */       //   #241	-> 35
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	42	0	this	Lli/cil/oc/common/container/Player$SynchronizedData;
/*     */       //   0	42	1	key	Ljava/lang/String;
/*     */       //   0	42	2	value	Ljava/lang/String;
/*     */     }
/*     */     
/*     */     public synchronized void func_74773_a(String key, byte[] value) {
/*     */       // Byte code:
/*     */       //   0: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   3: aload_2
/*     */       //   4: invokevirtual byteArrayOps : ([B)Lscala/collection/mutable/ArrayOps;
/*     */       //   7: invokeinterface deep : ()Lscala/collection/IndexedSeq;
/*     */       //   12: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   15: aload_0
/*     */       //   16: aload_1
/*     */       //   17: invokevirtual func_74770_j : (Ljava/lang/String;)[B
/*     */       //   20: invokevirtual byteArrayOps : ([B)Lscala/collection/mutable/ArrayOps;
/*     */       //   23: invokeinterface deep : ()Lscala/collection/IndexedSeq;
/*     */       //   28: astore_3
/*     */       //   29: dup
/*     */       //   30: ifnonnull -> 41
/*     */       //   33: pop
/*     */       //   34: aload_3
/*     */       //   35: ifnull -> 57
/*     */       //   38: goto -> 48
/*     */       //   41: aload_3
/*     */       //   42: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   45: ifne -> 57
/*     */       //   48: aload_0
/*     */       //   49: invokespecial delta : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   52: aload_1
/*     */       //   53: aload_2
/*     */       //   54: invokevirtual func_74773_a : (Ljava/lang/String;[B)V
/*     */       //   57: aload_0
/*     */       //   58: aload_1
/*     */       //   59: aload_2
/*     */       //   60: invokespecial func_74773_a : (Ljava/lang/String;[B)V
/*     */       //   63: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #245	-> 0
/*     */       //   #246	-> 57
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	64	0	this	Lli/cil/oc/common/container/Player$SynchronizedData;
/*     */       //   0	64	1	key	Ljava/lang/String;
/*     */       //   0	64	2	value	[B
/*     */     }
/*     */     
/*     */     public synchronized void func_74783_a(String key, int[] value) {
/*     */       // Byte code:
/*     */       //   0: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   3: aload_2
/*     */       //   4: invokevirtual intArrayOps : ([I)Lscala/collection/mutable/ArrayOps;
/*     */       //   7: invokeinterface deep : ()Lscala/collection/IndexedSeq;
/*     */       //   12: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   15: aload_0
/*     */       //   16: aload_1
/*     */       //   17: invokevirtual func_74759_k : (Ljava/lang/String;)[I
/*     */       //   20: invokevirtual intArrayOps : ([I)Lscala/collection/mutable/ArrayOps;
/*     */       //   23: invokeinterface deep : ()Lscala/collection/IndexedSeq;
/*     */       //   28: astore_3
/*     */       //   29: dup
/*     */       //   30: ifnonnull -> 41
/*     */       //   33: pop
/*     */       //   34: aload_3
/*     */       //   35: ifnull -> 57
/*     */       //   38: goto -> 48
/*     */       //   41: aload_3
/*     */       //   42: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   45: ifne -> 57
/*     */       //   48: aload_0
/*     */       //   49: invokespecial delta : ()Lnet/minecraft/nbt/NBTTagCompound;
/*     */       //   52: aload_1
/*     */       //   53: aload_2
/*     */       //   54: invokevirtual func_74783_a : (Ljava/lang/String;[I)V
/*     */       //   57: aload_0
/*     */       //   58: aload_1
/*     */       //   59: aload_2
/*     */       //   60: invokespecial func_74783_a : (Ljava/lang/String;[I)V
/*     */       //   63: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #250	-> 0
/*     */       //   #251	-> 57
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	64	0	this	Lli/cil/oc/common/container/Player$SynchronizedData;
/*     */       //   0	64	1	key	Ljava/lang/String;
/*     */       //   0	64	2	value	[I
/*     */     }
/*     */     
/*     */     public synchronized void func_74757_a(String key, boolean value) {
/*     */       if (value != func_74767_n(key))
/*     */         delta().func_74757_a(key, value); 
/*     */       super.func_74757_a(key, value);
/*     */     }
/*     */     
/*     */     public SynchronizedData(Player $outer) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\container\Player.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */