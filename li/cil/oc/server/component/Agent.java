/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.server.agent.Player;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.item.EntityItem;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Serializable;
/*     */ import scala.Some;
/*     */ import scala.Tuple2;
/*     */ import scala.Tuple6;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.ObjectRef;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\t\025baB\001\003!\003\r\t!\004\002\006\003\036,g\016\036\006\003\007\021\t\021bY8na>tWM\034;\013\005\0251\021AB:feZ,'O\003\002\b\021\005\021qn\031\006\003\023)\t1aY5m\025\005Y\021A\0017j\007\001\031\002\002\001\b\0255u\0013E\n\t\003\037Ii\021\001\005\006\002#\005)1oY1mC&\0211\003\005\002\007\003:L(+\0324\021\005UAR\"\001\f\013\005]\021\021A\002;sC&$8/\003\002\032-\taqk\034:mI\016{g\016\036:pYB\021QcG\005\0039Y\021\001#\0238wK:$xN]=D_:$(o\0347\021\005Uq\022BA\020\027\005UIeN^3oi>\024\030pV8sY\022\034uN\034;s_2\004\"!F\021\n\005\t2\"!\003+b].\fu/\031:f!\t)B%\003\002&-\tYA+\0318l\007>tGO]8m!\t)r%\003\002)-\t\001B+\0318l/>\024H\016Z\"p]R\024x\016\034\005\006U\001!\taK\001\007I%t\027\016\036\023\025\0031\002\"aD\027\n\0059\002\"\001B+oSRDQ\001\r\001\007\002E\nQ!Y4f]R,\022A\r\t\003gaj\021\001\016\006\003kY\n\001\"\0338uKJt\027\r\034\006\003o\031\t1!\0319j\023\t\tA\007C\003;\001\021\0053(\001\005q_NLG/[8o+\005a\004CA\037A\033\005q$BA \007\003\021)H/\0337\n\005\005s$!\004\"m_\016\\\007k\\:ji&|g\016C\003D\001\021\005C)\001\006gC.,\007\013\\1zKJ,\022!\022\t\003\r>k\021a\022\006\003\021&\013a\001\0357bs\026\024(B\001&L\003\031)g\016^5us*\021A*T\001\n[&tWm\031:bMRT\021AT\001\004]\026$\030B\001)H\0051)e\016^5usBc\027-_3s\021\025\021\006\001\"\005T\0035\021x\016^1uK\022\004F.Y=feR\031A+\0273\021\005U;V\"\001,\013\005A\"\021B\001-W\005\031\001F.Y=fe\"9!,\025I\001\002\004Y\026A\0024bG&tw\r\005\002]E6\tQL\003\002@=*\021q\fY\001\007G>lWn\0348\013\005\005l\025AD7j]\026\034'/\0314uM>\024x-Z\005\003Gv\023aBR8sO\026$\025N]3di&|g\016C\004f#B\005\t\031A.\002\tMLG-\032\005\006O\002!\t\005[\001\nS:4XM\034;pef,\022!\033\t\003U2l\021a\033\006\003O.K!!\\6\003\025%KeN^3oi>\024\030\020C\003p\001\021\005\003/\001\007tK2,7\r^3e'2|G/F\001r!\ty!/\003\002t!\t\031\021J\034;\t\013U\004A\021\t<\002!M,G.Z2uK\022\034Fn\034;`I\025\fHC\001\027x\021\025AH\0171\001r\003\0251\030\r\\;f\021\025Q\b\001\"\021|\003\021!\030M\\6\026\003q\004\"aM?\n\005y$$!C'vYRLG+\0318l\021\031\t\t\001\001C\001a\006a1/\0327fGR,G\rV1oW\"9\021Q\001\001\005B\005\035\021\001E:fY\026\034G/\0323UC:\\w\fJ3r)\ra\023\021\002\005\007q\006\r\001\031A9\t\017\0055\001\001\"\001\002\020\005i1-\0318QY\006\034W-\0238BSJ,\"!!\005\021\007=\t\031\"C\002\002\026A\021qAQ8pY\026\fg\016C\004\002\032\001!\t!a\007\002%=twk\034:mI&sG/\032:bGRLwN\034\013\006Y\005u\021Q\006\005\t\003?\t9\0021\001\002\"\00591m\0348uKb$\b\003BA\022\003Si!!!\n\013\007\005\035b'A\004nC\016D\027N\\3\n\t\005-\022Q\005\002\b\007>tG/\032=u\021!\ty#a\006A\002\005E\022\001\0033ve\006$\030n\0348\021\007=\t\031$C\002\0026A\021a\001R8vE2,\007bBA\035\001\021\005\0211H\001\005]\006lW\r\006\004\002>\005\r\023Q\t\t\005\037\005}b\"C\002\002BA\021Q!\021:sCfD\001\"a\b\0028\001\007\021\021\005\005\t\003\017\n9\0041\001\002J\005!\021M]4t!\021\t\031#a\023\n\t\0055\023Q\005\002\n\003J<W/\\3oiND\003\"a\016\002R\005]\023\021\f\t\005\003G\t\031&\003\003\002V\005\025\"\001C\"bY2\024\027mY6\002\007\021|7-\t\002\002\\\005yc-\0368di&|g\016K\025;gR\024\030N\\4![5\002s)\032;!i\",\007E\\1nK\002zg\r\t;iK\002\nw-\0328u]!9\021q\f\001\005\002\005\005\024!B:xS:<GCBA\037\003G\n)\007\003\005\002 \005u\003\031AA\021\021!\t9%!\030A\002\005%\003\006CA/\003#\n9&!\033\"\005\005-\024!a4gk:\034G/[8oQMLG-\032\036ok6\024WM].-A\031\f7-\032\036ok6\024WM]\037tS\022,7\f\f\021t]\026\f7.\037\036c_>dW-\0318>M\006d7/Z/^Si\022wn\0347fC:d\003e\035;sS:<\007%L\027!!\026\024hm\034:nA\005\004s\005\\3gi\002\032G.[2lO\001\"xn^1sIN\004C\017[3!gB,7-\0334jK\022\0043/\0333f]\001\"\006.\032\021aM\006\034Wm\n\021bY2|wo\035\021bA5|'/\032\021qe\026\034\027n]3!G2L7m\033\021dC2L'M]1uS>tG\006I1oI\002J7\017\t:fY\006$\030N^3!i>\004C\017[3!i\006\024x-\032;fI\002\022Gn\\2lgB\f7-\032\030\t\017\005=\004\001\"\001\002r\005\031Qo]3\025\r\005u\0221OA;\021!\ty\"!\034A\002\005\005\002\002CA$\003[\002\r!!\023)\021\0055\024\021KA,\003s\n#!a\037\002\003w4WO\\2uS>t\007f]5eKjrW/\0342fenc\003EZ1dKjrW/\0342fev\032\030\016Z3\\Y\001\032h.Z1lsj\022wn\0347fC:ld-\0317tKnc\003\005Z;sCRLwN\034\036ok6\024WM]\0371;vk\026F\0172p_2,\027M\034\027!gR\024\030N\\4![5\002\003+\032:g_Jl\007%\031\021(e&<\007\016\036\021dY&\0347n\n\021u_^\f'\017Z:!i\",\007e\0359fG&4\027.\0323!g&$WM\f\021UQ\026\004\003MZ1dK\036\002\023\r\0347poN\004\023\rI7pe\026\004\003O]3dSN,\007e\0317jG.\0043-\0317jEJ\fG/[8oY\001\ng\016\032\021jg\002\022X\r\\1uSZ,\007\005^8!i\",\007\005^1sO\026$X\r\032\021cY>\0347n\0359bG\026t\003bBA@\001\021\005\021\021Q\001\006a2\f7-\032\013\007\003{\t\031)!\"\t\021\005}\021Q\020a\001\003CA\001\"a\022\002~\001\007\021\021\n\025\t\003{\n\t&a\026\002\n\006\022\0211R\001\002.\032,hn\031;j_:D3/\0333fu9,XNY3s72\002c-Y2fu9,XNY3s{MLG-Z.-AMtW-Y6zu\t|w\016\\3b]v2\027\r\\:f;vK#HY8pY\026\fg\016I\027.AAc\027mY3!C\002\022Gn\\2lAQ|w/\031:eg\002\"\b.\032\021ta\026\034\027NZ5fI\002\032\030\016Z3/AQCW\r\t1gC\016,w\005I1mY><8\017I1![>\024X\r\t9sK\016L7/\032\021dY&\0347\016I2bY&\024'/\031;j_:d\003%\0318eA%\034\bE]3mCRLg/\032\021u_\002\"\b.\032\021uCJ<W\r^3eA\tdwnY6ta\006\034WM\f\005\b\003\037\003A\021CAI\003E\021WmZ5o\007>t7/^7f\tJ|\007o\035\013\004Y\005M\005b\002&\002\016\002\007\021Q\023\t\005\003/\013I*D\001J\023\r\tY*\023\002\007\013:$\030\016^=\t\017\005}\005\001\"\005\002\"\006yQM\0343D_:\034X/\\3Ee>\0048\017F\003-\003G\013)\013\003\004I\003;\003\r\001\026\005\b\025\006u\005\031AAK\021\035\tI\013\001C\t\003W\013\001c\0315fG.\034\026\016Z3G_J4\025mY3\025\017m\013i+a,\0024\"A\021qIAT\001\004\tI\005C\004\0022\006\035\006\031A9\002\0039DaAWAT\001\004Y\006bBA\\\001\021E\021\021X\001\020G\",7m[*jI\0264uN]+tKR)1,a/\002>\"A\021qIA[\001\004\tI\005C\004\0022\006U\006\031A9\t\017\005\005\007\001\"\005\002D\006!\001/[2l)\031\t)-a4\002RB!\021qYAf\033\t\tIM\003\002@\027&!\021QZAe\005QiuN^5oO>\023'.Z2u!>\034\030\016^5p]\"1\001*a0A\002QC\001\"a5\002@\002\007\021\021G\001\006e\006tw-\032\005\b\003/\004A\021CAm\003I\031G.[2l!\006\024\030-\\:Ge>l\007*\033;\025\t\005m\027q\035\t\r\037\005u\027/]9\002b\006\005\030\021]\005\004\003?\004\"A\002+va2,g\007E\002\020\003GL1!!:\021\005\0251En\\1u\021!\tI/!6A\002\005\025\027a\0015ji\"9\021Q\036\001\005\022\005=\030AG2mS\016\\\007+\031:b[N4uN]%uK6\f5\r^5wCR,GCBAn\003c\f\031\020\003\004[\003W\004\ra\027\005\007K\006-\b\031A.\t\017\005]\b\001\"\005\002z\006)2\r\\5dWB\013'/Y7t\r>\024\030\n^3n+N,GCBAn\003w\fi\020\003\004[\003k\004\ra\027\005\007K\006U\b\031A.\t\017\t\005\001\001\"\005\003\004\005\0312\r\\5dWB\013'/Y7t\r>\024\b\013\\1dKR!\0211\034B\003\021\031Q\026q a\0017\"I!\021\002\001\022\002\023E!1B\001\030e>$\030\r^3e!2\f\0270\032:%I\0264\027-\0367uIE*\"A!\004+\007m\023ya\013\002\003\022A!!1\003B\017\033\t\021)B\003\003\003\030\te\021!C;oG\",7m[3e\025\r\021Y\002E\001\013C:tw\016^1uS>t\027\002\002B\020\005+\021\021#\0368dQ\026\0347.\0323WCJL\027M\\2f\021%\021\031\003AI\001\n#\021Y!A\fs_R\fG/\0323QY\006LXM\035\023eK\032\fW\017\034;%e\001")
/*     */ public interface Agent extends WorldControl, InventoryControl, InventoryWorldControl, TankControl, TankWorldControl {
/*     */   li.cil.oc.api.internal.Agent agent();
/*     */   
/*     */   BlockPosition position();
/*     */   
/*     */   EntityPlayer fakePlayer();
/*     */   
/*     */   Player rotatedPlayer(ForgeDirection paramForgeDirection1, ForgeDirection paramForgeDirection2);
/*     */   
/*     */   ForgeDirection rotatedPlayer$default$1();
/*     */   
/*     */   ForgeDirection rotatedPlayer$default$2();
/*     */   
/*     */   IInventory inventory();
/*     */   
/*     */   int selectedSlot();
/*     */   
/*     */   void selectedSlot_$eq(int paramInt);
/*     */   
/*     */   MultiTank tank();
/*     */   
/*     */   int selectedTank();
/*     */   
/*     */   void selectedTank_$eq(int paramInt);
/*     */   
/*     */   boolean canPlaceInAir();
/*     */   
/*     */   void onWorldInteraction(Context paramContext, double paramDouble);
/*     */   
/*     */   @Callback(doc = "function():string -- Get the name of the agent.")
/*     */   Object[] name(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function(side:number[, face:number=side[, sneaky:boolean=false]]):boolean, string -- Perform a 'left click' towards the specified side. The `face' allows a more precise click calibration, and is relative to the targeted blockspace.")
/*     */   Object[] swing(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function(side:number[, face:number=side[, sneaky:boolean=false[, duration:number=0]]]):boolean, string -- Perform a 'right click' towards the specified side. The `face' allows a more precise click calibration, and is relative to the targeted blockspace.")
/*     */   Object[] use(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   @Callback(doc = "function(side:number[, face:number=side[, sneaky:boolean=false]]):boolean -- Place a block towards the specified side. The `face' allows a more precise click calibration, and is relative to the targeted blockspace.")
/*     */   Object[] place(Context paramContext, Arguments paramArguments);
/*     */   
/*     */   void beginConsumeDrops(Entity paramEntity);
/*     */   
/*     */   void endConsumeDrops(Player paramPlayer, Entity paramEntity);
/*     */   
/*     */   ForgeDirection checkSideForFace(Arguments paramArguments, int paramInt, ForgeDirection paramForgeDirection);
/*     */   
/*     */   ForgeDirection checkSideForUse(Arguments paramArguments, int paramInt);
/*     */   
/*     */   MovingObjectPosition pick(Player paramPlayer, double paramDouble);
/*     */   
/*     */   Tuple6<Object, Object, Object, Object, Object, Object> clickParamsFromHit(MovingObjectPosition paramMovingObjectPosition);
/*     */   
/*     */   Tuple6<Object, Object, Object, Object, Object, Object> clickParamsForItemActivate(ForgeDirection paramForgeDirection1, ForgeDirection paramForgeDirection2);
/*     */   
/*     */   Tuple6<Object, Object, Object, Object, Object, Object> clickParamsForItemUse(ForgeDirection paramForgeDirection1, ForgeDirection paramForgeDirection2);
/*     */   
/*     */   Tuple6<Object, Object, Object, Object, Object, Object> clickParamsForPlace(ForgeDirection paramForgeDirection);
/*     */   
/*     */   public final class Agent$$anonfun$1 extends AbstractFunction1<ForgeDirection, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ForgeDirection facing$1;
/*     */     
/*     */     public final boolean apply(ForgeDirection side) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: aload_0
/*     */       //   2: getfield facing$1 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   5: astore_2
/*     */       //   6: dup
/*     */       //   7: ifnonnull -> 18
/*     */       //   10: pop
/*     */       //   11: aload_2
/*     */       //   12: ifnull -> 53
/*     */       //   15: goto -> 25
/*     */       //   18: aload_2
/*     */       //   19: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   22: ifne -> 53
/*     */       //   25: aload_1
/*     */       //   26: aload_0
/*     */       //   27: getfield facing$1 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   30: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   33: astore_3
/*     */       //   34: dup
/*     */       //   35: ifnonnull -> 46
/*     */       //   38: pop
/*     */       //   39: aload_3
/*     */       //   40: ifnull -> 53
/*     */       //   43: goto -> 57
/*     */       //   46: aload_3
/*     */       //   47: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   50: ifeq -> 57
/*     */       //   53: iconst_0
/*     */       //   54: goto -> 58
/*     */       //   57: iconst_1
/*     */       //   58: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #85	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	59	0	this	Lli/cil/oc/server/component/Agent$$anonfun$1;
/*     */       //   0	59	1	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     }
/*     */     
/*     */     public Agent$$anonfun$1(Agent $outer, ForgeDirection facing$1) {}
/*     */   }
/*     */   
/*     */   public final class Agent$$anonfun$attack$1$1 extends AbstractFunction1.mcZI.sp implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*  98 */     public final boolean apply(int _) { return apply$mcZI$sp(_); } private final Entity entity$1; public boolean apply$mcZI$sp(int _) { return !this.entity$1.field_70128_L; } public Agent$$anonfun$attack$1$1(Agent $outer, Entity entity$1) {} } public final class Agent$$anonfun$attack$1$2 extends AbstractFunction1.mcVI.sp implements Serializable { public static final long serialVersionUID = 0L; private final Player player$1; private final Entity entity$1; public final void apply(int _) { apply$mcVI$sp(_); } public Agent$$anonfun$attack$1$2(Agent $outer, Player player$1, Entity entity$1) {} public void apply$mcVI$sp(int _) {
/*  99 */       this.player$1.func_71059_n(this.entity$1);
/*     */     } }
/*     */ 
/*     */   
/*     */   public final class Agent$$anonfun$swing$1
/*     */     extends AbstractFunction1<ForgeDirection, BoxedUnit>
/*     */     implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     private final ForgeDirection facing$1;
/*     */     private final boolean sneaky$1;
/*     */     private final ObjectRef reason$1;
/*     */     private final Object nonLocalReturnKey1$1;
/*     */     private final Context context$1;
/*     */     
/*     */     public Agent$$anonfun$swing$1(Agent $outer, ForgeDirection facing$1, boolean sneaky$1, ObjectRef reason$1, Object nonLocalReturnKey1$1, Context context$1) {}
/*     */     
/*     */     public final void apply(ForgeDirection side) {
/*     */       MovingObjectPosition.MovingObjectType movingObjectType2;
/*     */       Tuple2 tuple22;
/* 118 */       Player player = this.$outer.rotatedPlayer(this.facing$1, side);
/* 119 */       player.func_70095_a(this.sneaky$1);
/*     */ 
/*     */       
/* 122 */       MovingObjectPosition hit = this.$outer.pick(player, Settings$.MODULE$.get().swingRange());
/* 123 */       Option option = Option$.MODULE$.apply(hit);
/* 124 */       if (option instanceof Some) { Some some = (Some)option; MovingObjectPosition info = (MovingObjectPosition)some.x(); movingObjectType2 = info.field_72313_a; }
/* 125 */       else { movingObjectType2 = MovingObjectPosition.MovingObjectType.MISS; }
/*     */        MovingObjectPosition.MovingObjectType movingObjectType1 = movingObjectType2;
/* 127 */       if (MovingObjectPosition.MovingObjectType.ENTITY.equals(movingObjectType1)) {
/* 128 */         tuple22 = Agent$class.attack$1(this.$outer, player, hit.field_72308_g, this.context$1);
/* 129 */       } else if (MovingObjectPosition.MovingObjectType.BLOCK.equals(movingObjectType1)) {
/* 130 */         tuple22 = Agent$class.click$1(this.$outer, player, hit.field_72311_b, hit.field_72312_c, hit.field_72309_d, hit.field_72310_e, this.context$1);
/*     */       } else {
/*     */         Tuple2 tuple2;
/* 133 */         Option option1 = player.closestEntity(player.closestEntity$default$1(), ClassTag$.MODULE$.apply(EntityLivingBase.class));
/* 134 */         if (option1 instanceof Some) { Some some = (Some)option1; EntityLivingBase entity = (EntityLivingBase)some.x();
/* 135 */           tuple2 = Agent$class.attack$1(this.$outer, player, (Entity)entity, this.context$1); }
/*     */         else
/*     */         
/* 138 */         { Agent$class.triggerDelay$1(this.$outer, Agent$class.triggerDelay$default$1$1(this.$outer), this.context$1);
/* 139 */           tuple2 = ExtendedWorld$.MODULE$.extendedWorld(this.$outer.world()).extinguishFire((EntityPlayer)player, this.$outer.position(), this.facing$1) ? new Tuple2(BoxesRunTime.boxToBoolean(true), "fire") : 
/*     */             
/* 141 */             new Tuple2(BoxesRunTime.boxToBoolean(false), "air"); }
/*     */          tuple22 = tuple2;
/*     */       }  Tuple2 tuple21 = tuple22; if (tuple21 != null)
/*     */       { boolean success = tuple21._1$mcZ$sp(); String what = (String)tuple21._2(); Tuple2 tuple24 = new Tuple2(BoxesRunTime.boxToBoolean(success), what), tuple23 = tuple24; boolean bool1 = tuple23._1$mcZ$sp();
/*     */         String str1 = (String)tuple23._2();
/* 146 */         player.func_70095_a(false);
/* 147 */         if (bool1) {
/* 148 */           throw new NonLocalReturnControl(this.nonLocalReturnKey1$1, package$.MODULE$.result(Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(true), str1 })));
/*     */         }
/* 150 */         this.reason$1.elem = ((Option)this.reason$1.elem).orElse((Function0)new Agent$$anonfun$swing$1$$anonfun$apply$1(this, str1)); return; }  throw new MatchError(tuple21); } public final class Agent$$anonfun$swing$1$$anonfun$apply$1 extends AbstractFunction0<Option<String>> implements Serializable { public static final long serialVersionUID = 0L; private final String what$1; public final Option<String> apply() { return Option$.MODULE$.apply(this.what$1); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Agent$$anonfun$swing$1$$anonfun$apply$1(Agent$$anonfun$swing$1 $outer, String what$1) {} }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Agent$$anonfun$2
/*     */     extends AbstractFunction1<ForgeDirection, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     private final ForgeDirection facing$2;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(ForgeDirection side) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: aload_0
/*     */       //   2: getfield facing$2 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   5: astore_2
/*     */       //   6: dup
/*     */       //   7: ifnonnull -> 18
/*     */       //   10: pop
/*     */       //   11: aload_2
/*     */       //   12: ifnull -> 53
/*     */       //   15: goto -> 25
/*     */       //   18: aload_2
/*     */       //   19: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   22: ifne -> 53
/*     */       //   25: aload_1
/*     */       //   26: aload_0
/*     */       //   27: getfield facing$2 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   30: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   33: astore_3
/*     */       //   34: dup
/*     */       //   35: ifnonnull -> 46
/*     */       //   38: pop
/*     */       //   39: aload_3
/*     */       //   40: ifnull -> 53
/*     */       //   43: goto -> 57
/*     */       //   46: aload_3
/*     */       //   47: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   50: ifeq -> 57
/*     */       //   53: iconst_0
/*     */       //   54: goto -> 58
/*     */       //   57: iconst_1
/*     */       //   58: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #176	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	59	0	this	Lli/cil/oc/server/component/Agent$$anonfun$2;
/*     */       //   0	59	1	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Agent$$anonfun$2(Agent $outer, ForgeDirection facing$2) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Agent$$anonfun$use$1
/*     */     extends AbstractFunction1<ForgeDirection, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */ 
/*     */     
/*     */     private final ForgeDirection facing$2;
/*     */ 
/*     */ 
/*     */     
/*     */     private final boolean sneaky$2;
/*     */ 
/*     */ 
/*     */     
/*     */     private final double duration$1;
/*     */ 
/*     */ 
/*     */     
/*     */     private final Object nonLocalReturnKey2$1;
/*     */ 
/*     */ 
/*     */     
/*     */     private final Context context$2;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Agent$$anonfun$use$1(Agent $outer, ForgeDirection facing$2, boolean sneaky$2, double duration$1, Object nonLocalReturnKey2$1, Context context$2) {}
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(ForgeDirection side) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   4: aload_0
/*     */       //   5: getfield facing$2 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   8: aload_0
/*     */       //   9: getfield facing$2 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   12: invokeinterface rotatedPlayer : (Lnet/minecraftforge/common/util/ForgeDirection;Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/server/agent/Player;
/*     */       //   17: astore_2
/*     */       //   18: aload_2
/*     */       //   19: aload_0
/*     */       //   20: getfield sneaky$2 : Z
/*     */       //   23: invokevirtual func_70095_a : (Z)V
/*     */       //   26: iconst_0
/*     */       //   27: istore #5
/*     */       //   29: aconst_null
/*     */       //   30: astore #6
/*     */       //   32: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   35: aload_0
/*     */       //   36: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   39: aload_2
/*     */       //   40: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */       //   43: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */       //   46: invokevirtual useAndPlaceRange : ()D
/*     */       //   49: invokeinterface pick : (Lli/cil/oc/server/agent/Player;D)Lnet/minecraft/util/MovingObjectPosition;
/*     */       //   54: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   57: astore #7
/*     */       //   59: aload #7
/*     */       //   61: instanceof scala/Some
/*     */       //   64: ifeq -> 163
/*     */       //   67: iconst_1
/*     */       //   68: istore #5
/*     */       //   70: aload #7
/*     */       //   72: checkcast scala/Some
/*     */       //   75: astore #6
/*     */       //   77: aload #6
/*     */       //   79: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   82: checkcast net/minecraft/util/MovingObjectPosition
/*     */       //   85: astore #8
/*     */       //   87: aload #8
/*     */       //   89: getfield field_72313_a : Lnet/minecraft/util/MovingObjectPosition$MovingObjectType;
/*     */       //   92: getstatic net/minecraft/util/MovingObjectPosition$MovingObjectType.ENTITY : Lnet/minecraft/util/MovingObjectPosition$MovingObjectType;
/*     */       //   95: astore #9
/*     */       //   97: dup
/*     */       //   98: ifnonnull -> 110
/*     */       //   101: pop
/*     */       //   102: aload #9
/*     */       //   104: ifnull -> 118
/*     */       //   107: goto -> 163
/*     */       //   110: aload #9
/*     */       //   112: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   115: ifeq -> 163
/*     */       //   118: aload_0
/*     */       //   119: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   122: aload_2
/*     */       //   123: aload #8
/*     */       //   125: getfield field_72308_g : Lnet/minecraft/entity/Entity;
/*     */       //   128: invokestatic interact$1 : (Lli/cil/oc/server/component/Agent;Lli/cil/oc/server/agent/Player;Lnet/minecraft/entity/Entity;)Z
/*     */       //   131: ifeq -> 163
/*     */       //   134: aload_0
/*     */       //   135: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   138: aload_0
/*     */       //   139: getfield context$2 : Lli/cil/oc/api/machine/Context;
/*     */       //   142: invokestatic triggerDelay$2 : (Lli/cil/oc/server/component/Agent;Lli/cil/oc/api/machine/Context;)V
/*     */       //   145: new scala/Tuple2
/*     */       //   148: dup
/*     */       //   149: iconst_1
/*     */       //   150: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   153: ldc 'item_interacted'
/*     */       //   155: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   158: astore #10
/*     */       //   160: goto -> 1022
/*     */       //   163: iload #5
/*     */       //   165: ifeq -> 443
/*     */       //   168: aload #6
/*     */       //   170: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   173: checkcast net/minecraft/util/MovingObjectPosition
/*     */       //   176: astore #11
/*     */       //   178: aload #11
/*     */       //   180: getfield field_72313_a : Lnet/minecraft/util/MovingObjectPosition$MovingObjectType;
/*     */       //   183: getstatic net/minecraft/util/MovingObjectPosition$MovingObjectType.BLOCK : Lnet/minecraft/util/MovingObjectPosition$MovingObjectType;
/*     */       //   186: astore #12
/*     */       //   188: dup
/*     */       //   189: ifnonnull -> 201
/*     */       //   192: pop
/*     */       //   193: aload #12
/*     */       //   195: ifnull -> 209
/*     */       //   198: goto -> 443
/*     */       //   201: aload #12
/*     */       //   203: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   206: ifeq -> 443
/*     */       //   209: aload_0
/*     */       //   210: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   213: aload_0
/*     */       //   214: getfield facing$2 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   217: aload_1
/*     */       //   218: invokeinterface clickParamsForItemActivate : (Lnet/minecraftforge/common/util/ForgeDirection;Lnet/minecraftforge/common/util/ForgeDirection;)Lscala/Tuple6;
/*     */       //   223: astore #14
/*     */       //   225: aload #14
/*     */       //   227: ifnull -> 433
/*     */       //   230: aload #14
/*     */       //   232: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   235: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   238: istore #15
/*     */       //   240: aload #14
/*     */       //   242: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   245: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   248: istore #16
/*     */       //   250: aload #14
/*     */       //   252: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   255: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   258: istore #17
/*     */       //   260: aload #14
/*     */       //   262: invokevirtual _4 : ()Ljava/lang/Object;
/*     */       //   265: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   268: fstore #18
/*     */       //   270: aload #14
/*     */       //   272: invokevirtual _5 : ()Ljava/lang/Object;
/*     */       //   275: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   278: fstore #19
/*     */       //   280: aload #14
/*     */       //   282: invokevirtual _6 : ()Ljava/lang/Object;
/*     */       //   285: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   288: fstore #20
/*     */       //   290: new scala/Tuple6
/*     */       //   293: dup
/*     */       //   294: iload #15
/*     */       //   296: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   299: iload #16
/*     */       //   301: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   304: iload #17
/*     */       //   306: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   309: fload #18
/*     */       //   311: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   314: fload #19
/*     */       //   316: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   319: fload #20
/*     */       //   321: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   324: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   327: astore #21
/*     */       //   329: aload #21
/*     */       //   331: astore #13
/*     */       //   333: aload #13
/*     */       //   335: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   338: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   341: istore #22
/*     */       //   343: aload #13
/*     */       //   345: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   348: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   351: istore #23
/*     */       //   353: aload #13
/*     */       //   355: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   358: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   361: istore #24
/*     */       //   363: aload #13
/*     */       //   365: invokevirtual _4 : ()Ljava/lang/Object;
/*     */       //   368: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   371: fstore #25
/*     */       //   373: aload #13
/*     */       //   375: invokevirtual _5 : ()Ljava/lang/Object;
/*     */       //   378: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   381: fstore #26
/*     */       //   383: aload #13
/*     */       //   385: invokevirtual _6 : ()Ljava/lang/Object;
/*     */       //   388: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   391: fstore #27
/*     */       //   393: aload_0
/*     */       //   394: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   397: aload_2
/*     */       //   398: iload #22
/*     */       //   400: iload #23
/*     */       //   402: iload #24
/*     */       //   404: aload_1
/*     */       //   405: invokevirtual ordinal : ()I
/*     */       //   408: fload #25
/*     */       //   410: fload #26
/*     */       //   412: fload #27
/*     */       //   414: aload_0
/*     */       //   415: getfield duration$1 : D
/*     */       //   418: invokevirtual activateBlockOrUseItem : (IIIIFFFD)Lscala/Enumeration$Value;
/*     */       //   421: aload_0
/*     */       //   422: getfield context$2 : Lli/cil/oc/api/machine/Context;
/*     */       //   425: invokestatic activationResult$1 : (Lli/cil/oc/server/component/Agent;Lscala/Enumeration$Value;Lli/cil/oc/api/machine/Context;)Lscala/Tuple2;
/*     */       //   428: astore #10
/*     */       //   430: goto -> 1022
/*     */       //   433: new scala/MatchError
/*     */       //   436: dup
/*     */       //   437: aload #14
/*     */       //   439: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   442: athrow
/*     */       //   443: aload_0
/*     */       //   444: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   447: invokeinterface canPlaceInAir : ()Z
/*     */       //   452: ifeq -> 908
/*     */       //   455: aload_0
/*     */       //   456: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   459: aload_0
/*     */       //   460: getfield facing$2 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   463: invokeinterface clickParamsForPlace : (Lnet/minecraftforge/common/util/ForgeDirection;)Lscala/Tuple6;
/*     */       //   468: astore #30
/*     */       //   470: aload #30
/*     */       //   472: ifnull -> 898
/*     */       //   475: aload #30
/*     */       //   477: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   480: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   483: istore #31
/*     */       //   485: aload #30
/*     */       //   487: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   490: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   493: istore #32
/*     */       //   495: aload #30
/*     */       //   497: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   500: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   503: istore #33
/*     */       //   505: aload #30
/*     */       //   507: invokevirtual _4 : ()Ljava/lang/Object;
/*     */       //   510: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   513: fstore #34
/*     */       //   515: aload #30
/*     */       //   517: invokevirtual _5 : ()Ljava/lang/Object;
/*     */       //   520: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   523: fstore #35
/*     */       //   525: aload #30
/*     */       //   527: invokevirtual _6 : ()Ljava/lang/Object;
/*     */       //   530: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   533: fstore #36
/*     */       //   535: new scala/Tuple6
/*     */       //   538: dup
/*     */       //   539: iload #31
/*     */       //   541: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   544: iload #32
/*     */       //   546: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   549: iload #33
/*     */       //   551: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   554: fload #34
/*     */       //   556: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   559: fload #35
/*     */       //   561: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   564: fload #36
/*     */       //   566: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   569: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   572: astore #37
/*     */       //   574: aload #37
/*     */       //   576: astore #29
/*     */       //   578: aload #29
/*     */       //   580: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   583: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   586: istore #38
/*     */       //   588: aload #29
/*     */       //   590: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   593: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   596: istore #39
/*     */       //   598: aload #29
/*     */       //   600: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   603: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   606: istore #40
/*     */       //   608: aload #29
/*     */       //   610: invokevirtual _4 : ()Ljava/lang/Object;
/*     */       //   613: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   616: fstore #41
/*     */       //   618: aload #29
/*     */       //   620: invokevirtual _5 : ()Ljava/lang/Object;
/*     */       //   623: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   626: fstore #42
/*     */       //   628: aload #29
/*     */       //   630: invokevirtual _6 : ()Ljava/lang/Object;
/*     */       //   633: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   636: fstore #43
/*     */       //   638: aload_2
/*     */       //   639: iconst_0
/*     */       //   640: iload #38
/*     */       //   642: iload #39
/*     */       //   644: iload #40
/*     */       //   646: aload_0
/*     */       //   647: getfield facing$2 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   650: invokevirtual ordinal : ()I
/*     */       //   653: fload #41
/*     */       //   655: fload #42
/*     */       //   657: fload #43
/*     */       //   659: invokevirtual placeBlock : (IIIIIFFF)Z
/*     */       //   662: ifeq -> 674
/*     */       //   665: getstatic li/cil/oc/server/agent/ActivationType$.MODULE$ : Lli/cil/oc/server/agent/ActivationType$;
/*     */       //   668: invokevirtual ItemPlaced : ()Lscala/Enumeration$Value;
/*     */       //   671: goto -> 914
/*     */       //   674: aload_0
/*     */       //   675: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   678: aload_0
/*     */       //   679: getfield facing$2 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   682: aload_1
/*     */       //   683: invokeinterface clickParamsForItemUse : (Lnet/minecraftforge/common/util/ForgeDirection;Lnet/minecraftforge/common/util/ForgeDirection;)Lscala/Tuple6;
/*     */       //   688: astore #45
/*     */       //   690: aload #45
/*     */       //   692: ifnull -> 888
/*     */       //   695: aload #45
/*     */       //   697: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   700: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   703: istore #46
/*     */       //   705: aload #45
/*     */       //   707: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   710: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   713: istore #47
/*     */       //   715: aload #45
/*     */       //   717: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   720: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   723: istore #48
/*     */       //   725: aload #45
/*     */       //   727: invokevirtual _4 : ()Ljava/lang/Object;
/*     */       //   730: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   733: fstore #49
/*     */       //   735: aload #45
/*     */       //   737: invokevirtual _5 : ()Ljava/lang/Object;
/*     */       //   740: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   743: fstore #50
/*     */       //   745: aload #45
/*     */       //   747: invokevirtual _6 : ()Ljava/lang/Object;
/*     */       //   750: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   753: fstore #51
/*     */       //   755: new scala/Tuple6
/*     */       //   758: dup
/*     */       //   759: iload #46
/*     */       //   761: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   764: iload #47
/*     */       //   766: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   769: iload #48
/*     */       //   771: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   774: fload #49
/*     */       //   776: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   779: fload #50
/*     */       //   781: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   784: fload #51
/*     */       //   786: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   789: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   792: astore #52
/*     */       //   794: aload #52
/*     */       //   796: astore #44
/*     */       //   798: aload #44
/*     */       //   800: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   803: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   806: istore #53
/*     */       //   808: aload #44
/*     */       //   810: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   813: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   816: istore #54
/*     */       //   818: aload #44
/*     */       //   820: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   823: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   826: istore #55
/*     */       //   828: aload #44
/*     */       //   830: invokevirtual _4 : ()Ljava/lang/Object;
/*     */       //   833: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   836: fstore #56
/*     */       //   838: aload #44
/*     */       //   840: invokevirtual _5 : ()Ljava/lang/Object;
/*     */       //   843: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   846: fstore #57
/*     */       //   848: aload #44
/*     */       //   850: invokevirtual _6 : ()Ljava/lang/Object;
/*     */       //   853: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   856: fstore #58
/*     */       //   858: aload_2
/*     */       //   859: iload #53
/*     */       //   861: iload #54
/*     */       //   863: iload #55
/*     */       //   865: aload_1
/*     */       //   866: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   869: invokevirtual ordinal : ()I
/*     */       //   872: fload #56
/*     */       //   874: fload #57
/*     */       //   876: fload #58
/*     */       //   878: aload_0
/*     */       //   879: getfield duration$1 : D
/*     */       //   882: invokevirtual activateBlockOrUseItem : (IIIIFFFD)Lscala/Enumeration$Value;
/*     */       //   885: goto -> 914
/*     */       //   888: new scala/MatchError
/*     */       //   891: dup
/*     */       //   892: aload #45
/*     */       //   894: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   897: athrow
/*     */       //   898: new scala/MatchError
/*     */       //   901: dup
/*     */       //   902: aload #30
/*     */       //   904: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   907: athrow
/*     */       //   908: getstatic li/cil/oc/server/agent/ActivationType$.MODULE$ : Lli/cil/oc/server/agent/ActivationType$;
/*     */       //   911: invokevirtual None : ()Lscala/Enumeration$Value;
/*     */       //   914: astore #28
/*     */       //   916: getstatic li/cil/oc/server/agent/ActivationType$.MODULE$ : Lli/cil/oc/server/agent/ActivationType$;
/*     */       //   919: invokevirtual None : ()Lscala/Enumeration$Value;
/*     */       //   922: aload #28
/*     */       //   924: astore #59
/*     */       //   926: dup
/*     */       //   927: ifnonnull -> 939
/*     */       //   930: pop
/*     */       //   931: aload #59
/*     */       //   933: ifnull -> 947
/*     */       //   936: goto -> 1003
/*     */       //   939: aload #59
/*     */       //   941: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   944: ifeq -> 1003
/*     */       //   947: aload_2
/*     */       //   948: aload_0
/*     */       //   949: getfield duration$1 : D
/*     */       //   952: invokevirtual useEquippedItem : (D)Z
/*     */       //   955: ifeq -> 985
/*     */       //   958: aload_0
/*     */       //   959: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   962: aload_0
/*     */       //   963: getfield context$2 : Lli/cil/oc/api/machine/Context;
/*     */       //   966: invokestatic triggerDelay$2 : (Lli/cil/oc/server/component/Agent;Lli/cil/oc/api/machine/Context;)V
/*     */       //   969: new scala/Tuple2
/*     */       //   972: dup
/*     */       //   973: iconst_1
/*     */       //   974: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   977: ldc 'item_used'
/*     */       //   979: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   982: goto -> 998
/*     */       //   985: new scala/Tuple2
/*     */       //   988: dup
/*     */       //   989: iconst_0
/*     */       //   990: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   993: ldc 'air'
/*     */       //   995: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   998: astore #60
/*     */       //   1000: goto -> 1018
/*     */       //   1003: aload_0
/*     */       //   1004: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   1007: aload #28
/*     */       //   1009: aload_0
/*     */       //   1010: getfield context$2 : Lli/cil/oc/api/machine/Context;
/*     */       //   1013: invokestatic activationResult$1 : (Lli/cil/oc/server/component/Agent;Lscala/Enumeration$Value;Lli/cil/oc/api/machine/Context;)Lscala/Tuple2;
/*     */       //   1016: astore #60
/*     */       //   1018: aload #60
/*     */       //   1020: astore #10
/*     */       //   1022: aload #10
/*     */       //   1024: astore #4
/*     */       //   1026: aload #4
/*     */       //   1028: ifnull -> 1133
/*     */       //   1031: aload #4
/*     */       //   1033: invokevirtual _1$mcZ$sp : ()Z
/*     */       //   1036: istore #61
/*     */       //   1038: aload #4
/*     */       //   1040: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   1043: checkcast java/lang/String
/*     */       //   1046: astore #62
/*     */       //   1048: new scala/Tuple2
/*     */       //   1051: dup
/*     */       //   1052: iload #61
/*     */       //   1054: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   1057: aload #62
/*     */       //   1059: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   1062: astore #63
/*     */       //   1064: aload #63
/*     */       //   1066: astore_3
/*     */       //   1067: aload_3
/*     */       //   1068: invokevirtual _1$mcZ$sp : ()Z
/*     */       //   1071: istore #64
/*     */       //   1073: aload_3
/*     */       //   1074: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   1077: checkcast java/lang/String
/*     */       //   1080: astore #65
/*     */       //   1082: aload_2
/*     */       //   1083: iconst_0
/*     */       //   1084: invokevirtual func_70095_a : (Z)V
/*     */       //   1087: iload #64
/*     */       //   1089: ifeq -> 1132
/*     */       //   1092: new scala/runtime/NonLocalReturnControl
/*     */       //   1095: dup
/*     */       //   1096: aload_0
/*     */       //   1097: getfield nonLocalReturnKey2$1 : Ljava/lang/Object;
/*     */       //   1100: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */       //   1103: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   1106: iconst_2
/*     */       //   1107: anewarray java/lang/Object
/*     */       //   1110: dup
/*     */       //   1111: iconst_0
/*     */       //   1112: iconst_1
/*     */       //   1113: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   1116: aastore
/*     */       //   1117: dup
/*     */       //   1118: iconst_1
/*     */       //   1119: aload #65
/*     */       //   1121: aastore
/*     */       //   1122: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   1125: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */       //   1128: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   1131: athrow
/*     */       //   1132: return
/*     */       //   1133: new scala/MatchError
/*     */       //   1136: dup
/*     */       //   1137: aload #4
/*     */       //   1139: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   1142: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #207	-> 0
/*     */       //   #208	-> 18
/*     */       //   #211	-> 26
/*     */       //   #210	-> 32
/*     */       //   #211	-> 59
/*     */       //   #212	-> 134
/*     */       //   #213	-> 145
/*     */       //   #211	-> 158
/*     */       //   #210	-> 163
/*     */       //   #214	-> 168
/*     */       //   #215	-> 209
/*     */       //   #216	-> 393
/*     */       //   #214	-> 428
/*     */       //   #215	-> 433
/*     */       //   #218	-> 443
/*     */       //   #219	-> 455
/*     */       //   #220	-> 638
/*     */       //   #221	-> 665
/*     */       //   #223	-> 674
/*     */       //   #224	-> 858
/*     */       //   #223	-> 888
/*     */       //   #219	-> 898
/*     */       //   #226	-> 908
/*     */       //   #218	-> 914
/*     */       //   #227	-> 916
/*     */       //   #228	-> 947
/*     */       //   #229	-> 958
/*     */       //   #230	-> 969
/*     */       //   #232	-> 985
/*     */       //   #228	-> 998
/*     */       //   #233	-> 1003
/*     */       //   #218	-> 1018
/*     */       //   #210	-> 1022
/*     */       //   #237	-> 1082
/*     */       //   #238	-> 1087
/*     */       //   #239	-> 1092
/*     */       //   #206	-> 1132
/*     */       //   #210	-> 1133
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	1143	0	this	Lli/cil/oc/server/component/Agent$$anonfun$use$1;
/*     */       //   0	1143	1	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   18	1125	2	player	Lli/cil/oc/server/agent/Player;
/*     */       //   87	1056	8	hit	Lnet/minecraft/util/MovingObjectPosition;
/*     */       //   178	965	11	hit	Lnet/minecraft/util/MovingObjectPosition;
/*     */       //   240	903	15	bx	I
/*     */       //   250	893	16	by	I
/*     */       //   260	883	17	bz	I
/*     */       //   270	873	18	hx	F
/*     */       //   280	863	19	hy	F
/*     */       //   290	853	20	hz	F
/*     */       //   343	85	22	bx	I
/*     */       //   353	75	23	by	I
/*     */       //   363	65	24	bz	I
/*     */       //   373	55	25	hx	F
/*     */       //   383	45	26	hy	F
/*     */       //   393	35	27	hz	F
/*     */       //   485	658	31	bx	I
/*     */       //   495	648	32	by	I
/*     */       //   505	638	33	bz	I
/*     */       //   515	628	34	hx	F
/*     */       //   525	618	35	hy	F
/*     */       //   535	608	36	hz	F
/*     */       //   588	555	38	bx	I
/*     */       //   598	545	39	by	I
/*     */       //   608	535	40	bz	I
/*     */       //   618	525	41	hx	F
/*     */       //   628	515	42	hy	F
/*     */       //   638	505	43	hz	F
/*     */       //   705	438	46	bx	I
/*     */       //   715	428	47	by	I
/*     */       //   725	418	48	bz	I
/*     */       //   735	408	49	hx	F
/*     */       //   745	398	50	hy	F
/*     */       //   755	388	51	hz	F
/*     */       //   808	77	53	bx	I
/*     */       //   818	67	54	by	I
/*     */       //   828	57	55	bz	I
/*     */       //   838	47	56	hx	F
/*     */       //   848	37	57	hy	F
/*     */       //   858	27	58	hz	F
/*     */       //   1038	105	61	success	Z
/*     */       //   1048	95	62	what	Ljava/lang/String;
/*     */       //   1073	70	64	success	Z
/*     */       //   1082	61	65	what	Ljava/lang/String;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Agent$$anonfun$3
/*     */     extends AbstractFunction1<ForgeDirection, Object>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final ForgeDirection facing$3;
/*     */ 
/*     */ 
/*     */     
/*     */     public final boolean apply(ForgeDirection side) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: aload_0
/*     */       //   2: getfield facing$3 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   5: astore_2
/*     */       //   6: dup
/*     */       //   7: ifnonnull -> 18
/*     */       //   10: pop
/*     */       //   11: aload_2
/*     */       //   12: ifnull -> 53
/*     */       //   15: goto -> 25
/*     */       //   18: aload_2
/*     */       //   19: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   22: ifne -> 53
/*     */       //   25: aload_1
/*     */       //   26: aload_0
/*     */       //   27: getfield facing$3 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   30: invokevirtual getOpposite : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   33: astore_3
/*     */       //   34: dup
/*     */       //   35: ifnonnull -> 46
/*     */       //   38: pop
/*     */       //   39: aload_3
/*     */       //   40: ifnull -> 53
/*     */       //   43: goto -> 57
/*     */       //   46: aload_3
/*     */       //   47: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   50: ifeq -> 57
/*     */       //   53: iconst_0
/*     */       //   54: goto -> 58
/*     */       //   57: iconst_1
/*     */       //   58: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #255	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	59	0	this	Lli/cil/oc/server/component/Agent$$anonfun$3;
/*     */       //   0	59	1	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public Agent$$anonfun$3(Agent $outer, ForgeDirection facing$3) {}
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Agent$$anonfun$place$1
/*     */     extends AbstractFunction1<ForgeDirection, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final ForgeDirection facing$3;
/*     */ 
/*     */     
/*     */     private final boolean sneaky$3;
/*     */ 
/*     */     
/*     */     private final Object nonLocalReturnKey3$1;
/*     */ 
/*     */     
/*     */     private final Context context$3;
/*     */ 
/*     */ 
/*     */     
/*     */     public Agent$$anonfun$place$1(Agent $outer, ForgeDirection facing$3, boolean sneaky$3, Object nonLocalReturnKey3$1, Context context$3) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(ForgeDirection side) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   4: aload_0
/*     */       //   5: getfield facing$3 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   8: aload_1
/*     */       //   9: invokeinterface rotatedPlayer : (Lnet/minecraftforge/common/util/ForgeDirection;Lnet/minecraftforge/common/util/ForgeDirection;)Lli/cil/oc/server/agent/Player;
/*     */       //   14: astore_2
/*     */       //   15: aload_2
/*     */       //   16: aload_0
/*     */       //   17: getfield sneaky$3 : Z
/*     */       //   20: invokevirtual func_70095_a : (Z)V
/*     */       //   23: getstatic scala/Option$.MODULE$ : Lscala/Option$;
/*     */       //   26: aload_0
/*     */       //   27: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   30: aload_2
/*     */       //   31: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */       //   34: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */       //   37: invokevirtual useAndPlaceRange : ()D
/*     */       //   40: invokeinterface pick : (Lli/cil/oc/server/agent/Player;D)Lnet/minecraft/util/MovingObjectPosition;
/*     */       //   45: invokevirtual apply : (Ljava/lang/Object;)Lscala/Option;
/*     */       //   48: astore #4
/*     */       //   50: aload #4
/*     */       //   52: instanceof scala/Some
/*     */       //   55: ifeq -> 337
/*     */       //   58: aload #4
/*     */       //   60: checkcast scala/Some
/*     */       //   63: astore #5
/*     */       //   65: aload #5
/*     */       //   67: invokevirtual x : ()Ljava/lang/Object;
/*     */       //   70: checkcast net/minecraft/util/MovingObjectPosition
/*     */       //   73: astore #6
/*     */       //   75: aload #6
/*     */       //   77: getfield field_72313_a : Lnet/minecraft/util/MovingObjectPosition$MovingObjectType;
/*     */       //   80: getstatic net/minecraft/util/MovingObjectPosition$MovingObjectType.BLOCK : Lnet/minecraft/util/MovingObjectPosition$MovingObjectType;
/*     */       //   83: astore #7
/*     */       //   85: dup
/*     */       //   86: ifnonnull -> 98
/*     */       //   89: pop
/*     */       //   90: aload #7
/*     */       //   92: ifnull -> 106
/*     */       //   95: goto -> 337
/*     */       //   98: aload #7
/*     */       //   100: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   103: ifeq -> 337
/*     */       //   106: aload_0
/*     */       //   107: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   110: aload #6
/*     */       //   112: invokeinterface clickParamsFromHit : (Lnet/minecraft/util/MovingObjectPosition;)Lscala/Tuple6;
/*     */       //   117: astore #10
/*     */       //   119: aload #10
/*     */       //   121: ifnull -> 327
/*     */       //   124: aload #10
/*     */       //   126: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   129: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   132: istore #11
/*     */       //   134: aload #10
/*     */       //   136: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   139: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   142: istore #12
/*     */       //   144: aload #10
/*     */       //   146: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   149: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   152: istore #13
/*     */       //   154: aload #10
/*     */       //   156: invokevirtual _4 : ()Ljava/lang/Object;
/*     */       //   159: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   162: fstore #14
/*     */       //   164: aload #10
/*     */       //   166: invokevirtual _5 : ()Ljava/lang/Object;
/*     */       //   169: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   172: fstore #15
/*     */       //   174: aload #10
/*     */       //   176: invokevirtual _6 : ()Ljava/lang/Object;
/*     */       //   179: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   182: fstore #16
/*     */       //   184: new scala/Tuple6
/*     */       //   187: dup
/*     */       //   188: iload #11
/*     */       //   190: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   193: iload #12
/*     */       //   195: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   198: iload #13
/*     */       //   200: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   203: fload #14
/*     */       //   205: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   208: fload #15
/*     */       //   210: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   213: fload #16
/*     */       //   215: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   218: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   221: astore #17
/*     */       //   223: aload #17
/*     */       //   225: astore #9
/*     */       //   227: aload #9
/*     */       //   229: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   232: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   235: istore #18
/*     */       //   237: aload #9
/*     */       //   239: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   242: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   245: istore #19
/*     */       //   247: aload #9
/*     */       //   249: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   252: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   255: istore #20
/*     */       //   257: aload #9
/*     */       //   259: invokevirtual _4 : ()Ljava/lang/Object;
/*     */       //   262: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   265: fstore #21
/*     */       //   267: aload #9
/*     */       //   269: invokevirtual _5 : ()Ljava/lang/Object;
/*     */       //   272: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   275: fstore #22
/*     */       //   277: aload #9
/*     */       //   279: invokevirtual _6 : ()Ljava/lang/Object;
/*     */       //   282: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   285: fstore #23
/*     */       //   287: aload_2
/*     */       //   288: aload_0
/*     */       //   289: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   292: invokeinterface agent : ()Lli/cil/oc/api/internal/Agent;
/*     */       //   297: invokeinterface selectedSlot : ()I
/*     */       //   302: iload #18
/*     */       //   304: iload #19
/*     */       //   306: iload #20
/*     */       //   308: aload #6
/*     */       //   310: getfield field_72310_e : I
/*     */       //   313: fload #21
/*     */       //   315: fload #22
/*     */       //   317: fload #23
/*     */       //   319: invokevirtual placeBlock : (IIIIIFFF)Z
/*     */       //   322: istore #8
/*     */       //   324: goto -> 620
/*     */       //   327: new scala/MatchError
/*     */       //   330: dup
/*     */       //   331: aload #10
/*     */       //   333: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   336: athrow
/*     */       //   337: getstatic scala/None$.MODULE$ : Lscala/None$;
/*     */       //   340: aload #4
/*     */       //   342: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */       //   345: ifeq -> 617
/*     */       //   348: aload_0
/*     */       //   349: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   352: invokeinterface canPlaceInAir : ()Z
/*     */       //   357: ifeq -> 617
/*     */       //   360: aload_2
/*     */       //   361: aload_2
/*     */       //   362: invokevirtual closestEntity$default$1 : ()Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   365: getstatic scala/reflect/ClassTag$.MODULE$ : Lscala/reflect/ClassTag$;
/*     */       //   368: ldc net/minecraft/entity/Entity
/*     */       //   370: invokevirtual apply : (Ljava/lang/Class;)Lscala/reflect/ClassTag;
/*     */       //   373: invokevirtual closestEntity : (Lnet/minecraftforge/common/util/ForgeDirection;Lscala/reflect/ClassTag;)Lscala/Option;
/*     */       //   376: invokevirtual isEmpty : ()Z
/*     */       //   379: ifeq -> 617
/*     */       //   382: aload_0
/*     */       //   383: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   386: aload_0
/*     */       //   387: getfield facing$3 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   390: invokeinterface clickParamsForPlace : (Lnet/minecraftforge/common/util/ForgeDirection;)Lscala/Tuple6;
/*     */       //   395: astore #25
/*     */       //   397: aload #25
/*     */       //   399: ifnull -> 607
/*     */       //   402: aload #25
/*     */       //   404: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   407: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   410: istore #26
/*     */       //   412: aload #25
/*     */       //   414: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   417: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   420: istore #27
/*     */       //   422: aload #25
/*     */       //   424: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   427: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   430: istore #28
/*     */       //   432: aload #25
/*     */       //   434: invokevirtual _4 : ()Ljava/lang/Object;
/*     */       //   437: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   440: fstore #29
/*     */       //   442: aload #25
/*     */       //   444: invokevirtual _5 : ()Ljava/lang/Object;
/*     */       //   447: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   450: fstore #30
/*     */       //   452: aload #25
/*     */       //   454: invokevirtual _6 : ()Ljava/lang/Object;
/*     */       //   457: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   460: fstore #31
/*     */       //   462: new scala/Tuple6
/*     */       //   465: dup
/*     */       //   466: iload #26
/*     */       //   468: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   471: iload #27
/*     */       //   473: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   476: iload #28
/*     */       //   478: invokestatic boxToInteger : (I)Ljava/lang/Integer;
/*     */       //   481: fload #29
/*     */       //   483: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   486: fload #30
/*     */       //   488: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   491: fload #31
/*     */       //   493: invokestatic boxToFloat : (F)Ljava/lang/Float;
/*     */       //   496: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   499: astore #32
/*     */       //   501: aload #32
/*     */       //   503: astore #24
/*     */       //   505: aload #24
/*     */       //   507: invokevirtual _1 : ()Ljava/lang/Object;
/*     */       //   510: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   513: istore #33
/*     */       //   515: aload #24
/*     */       //   517: invokevirtual _2 : ()Ljava/lang/Object;
/*     */       //   520: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   523: istore #34
/*     */       //   525: aload #24
/*     */       //   527: invokevirtual _3 : ()Ljava/lang/Object;
/*     */       //   530: invokestatic unboxToInt : (Ljava/lang/Object;)I
/*     */       //   533: istore #35
/*     */       //   535: aload #24
/*     */       //   537: invokevirtual _4 : ()Ljava/lang/Object;
/*     */       //   540: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   543: fstore #36
/*     */       //   545: aload #24
/*     */       //   547: invokevirtual _5 : ()Ljava/lang/Object;
/*     */       //   550: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   553: fstore #37
/*     */       //   555: aload #24
/*     */       //   557: invokevirtual _6 : ()Ljava/lang/Object;
/*     */       //   560: invokestatic unboxToFloat : (Ljava/lang/Object;)F
/*     */       //   563: fstore #38
/*     */       //   565: aload_2
/*     */       //   566: aload_0
/*     */       //   567: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   570: invokeinterface agent : ()Lli/cil/oc/api/internal/Agent;
/*     */       //   575: invokeinterface selectedSlot : ()I
/*     */       //   580: iload #33
/*     */       //   582: iload #34
/*     */       //   584: iload #35
/*     */       //   586: aload_0
/*     */       //   587: getfield facing$3 : Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   590: invokevirtual ordinal : ()I
/*     */       //   593: fload #36
/*     */       //   595: fload #37
/*     */       //   597: fload #38
/*     */       //   599: invokevirtual placeBlock : (IIIIIFFF)Z
/*     */       //   602: istore #8
/*     */       //   604: goto -> 620
/*     */       //   607: new scala/MatchError
/*     */       //   610: dup
/*     */       //   611: aload #25
/*     */       //   613: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   616: athrow
/*     */       //   617: iconst_0
/*     */       //   618: istore #8
/*     */       //   620: iload #8
/*     */       //   622: istore_3
/*     */       //   623: aload_2
/*     */       //   624: iconst_0
/*     */       //   625: invokevirtual func_70095_a : (Z)V
/*     */       //   628: iload_3
/*     */       //   629: ifeq -> 689
/*     */       //   632: aload_0
/*     */       //   633: getfield $outer : Lli/cil/oc/server/component/Agent;
/*     */       //   636: aload_0
/*     */       //   637: getfield context$3 : Lli/cil/oc/api/machine/Context;
/*     */       //   640: getstatic li/cil/oc/Settings$.MODULE$ : Lli/cil/oc/Settings$;
/*     */       //   643: invokevirtual get : ()Lli/cil/oc/Settings;
/*     */       //   646: invokevirtual placeDelay : ()D
/*     */       //   649: invokeinterface onWorldInteraction : (Lli/cil/oc/api/machine/Context;D)V
/*     */       //   654: new scala/runtime/NonLocalReturnControl
/*     */       //   657: dup
/*     */       //   658: aload_0
/*     */       //   659: getfield nonLocalReturnKey3$1 : Ljava/lang/Object;
/*     */       //   662: getstatic li/cil/oc/server/component/package$.MODULE$ : Lli/cil/oc/server/component/package$;
/*     */       //   665: getstatic scala/Predef$.MODULE$ : Lscala/Predef$;
/*     */       //   668: iconst_1
/*     */       //   669: anewarray java/lang/Object
/*     */       //   672: dup
/*     */       //   673: iconst_0
/*     */       //   674: iconst_1
/*     */       //   675: invokestatic boxToBoolean : (Z)Ljava/lang/Boolean;
/*     */       //   678: aastore
/*     */       //   679: invokevirtual genericWrapArray : (Ljava/lang/Object;)Lscala/collection/mutable/WrappedArray;
/*     */       //   682: invokevirtual result : (Lscala/collection/Seq;)[Ljava/lang/Object;
/*     */       //   685: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */       //   688: athrow
/*     */       //   689: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #264	-> 0
/*     */       //   #265	-> 15
/*     */       //   #266	-> 23
/*     */       //   #267	-> 50
/*     */       //   #268	-> 106
/*     */       //   #269	-> 287
/*     */       //   #267	-> 322
/*     */       //   #268	-> 327
/*     */       //   #270	-> 337
/*     */       //   #271	-> 382
/*     */       //   #272	-> 565
/*     */       //   #270	-> 602
/*     */       //   #271	-> 607
/*     */       //   #273	-> 617
/*     */       //   #266	-> 620
/*     */       //   #275	-> 623
/*     */       //   #276	-> 628
/*     */       //   #277	-> 632
/*     */       //   #278	-> 654
/*     */       //   #263	-> 689
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	690	0	this	Lli/cil/oc/server/component/Agent$$anonfun$place$1;
/*     */       //   0	690	1	side	Lnet/minecraftforge/common/util/ForgeDirection;
/*     */       //   15	675	2	player	Lli/cil/oc/server/agent/Player;
/*     */       //   75	615	6	hit	Lnet/minecraft/util/MovingObjectPosition;
/*     */       //   134	556	11	bx	I
/*     */       //   144	546	12	by	I
/*     */       //   154	536	13	bz	I
/*     */       //   164	526	14	hx	F
/*     */       //   174	516	15	hy	F
/*     */       //   184	506	16	hz	F
/*     */       //   237	85	18	bx	I
/*     */       //   247	75	19	by	I
/*     */       //   257	65	20	bz	I
/*     */       //   267	55	21	hx	F
/*     */       //   277	45	22	hy	F
/*     */       //   287	35	23	hz	F
/*     */       //   412	278	26	bx	I
/*     */       //   422	268	27	by	I
/*     */       //   432	258	28	bz	I
/*     */       //   442	248	29	hx	F
/*     */       //   452	238	30	hy	F
/*     */       //   462	228	31	hz	F
/*     */       //   515	87	33	bx	I
/*     */       //   525	77	34	by	I
/*     */       //   535	67	35	bz	I
/*     */       //   545	57	36	hx	F
/*     */       //   555	47	37	hy	F
/*     */       //   565	37	38	hz	F
/*     */       //   623	67	3	success	Z
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Agent$$anonfun$endConsumeDrops$1
/*     */     extends AbstractFunction1<EntityItem, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final Player player$2;
/*     */ 
/*     */ 
/*     */     
/*     */     public Agent$$anonfun$endConsumeDrops$1(Agent $outer, Player player$2) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public final void apply(EntityItem drop) {
/* 300 */       if (!drop.field_70128_L) {
/* 301 */         ItemStack stack = drop.func_92059_d();
/* 302 */         InventoryUtils$.MODULE$.addToPlayerInventory(stack, (EntityPlayer)this.player$2, false);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\Agent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */