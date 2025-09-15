/*    */ package li.cil.oc.common.tileentity.traits;
/*    */ 
/*    */ import net.minecraftforge.common.util.ForgeDirection;
/*    */ import scala.runtime.BoxedUnit;
/*    */ 
/*    */ @Interface(value = "appeng.api.movable.IMovableTile", modid = "appliedenergistics2")
/*    */ @ScalaSignature(bytes = "\006\001\005-eaB\001\003!\003\r\ta\004\002\f\013:4\030N]8o[\026tGO\003\002\004\t\0051AO]1jiNT!!\002\004\002\025QLG.Z3oi&$\030P\003\002\b\021\00511m\\7n_:T!!\003\006\002\005=\034'BA\006\r\003\r\031\027\016\034\006\002\033\005\021A.[\002\001'\025\001\001#\007\017$!\t\tr#D\001\023\025\t)1C\003\002\025+\005IQ.\0338fGJ\fg\r\036\006\002-\005\031a.\032;\n\005a\021\"A\003+jY\026,e\016^5usB\021!dG\007\002\005%\021\001D\001\t\003;\tj\021A\b\006\003?\001\nqA\\3uo>\0248N\003\002\"\021\005\031\021\r]5\n\005\005q\002CA\017%\023\t)cDA\bF]ZL'o\0348nK:$\bj\\:u\021\0259\003\001\"\001)\003\031!\023N\\5uIQ\t\021\006\005\002+[5\t1FC\001-\003\025\0318-\0317b\023\tq3F\001\003V]&$\bb\002\031\001\001\004%\t\"M\001\022SN\034\005.\0318hKN\033\007.\0323vY\026$W#\001\032\021\005)\032\024B\001\033,\005\035\021un\0347fC:DqA\016\001A\002\023Eq'A\013jg\016C\027M\\4f'\016DW\rZ;mK\022|F%Z9\025\005%B\004bB\0356\003\003\005\rAM\001\004q\022\n\004BB\036\001A\003&!'\001\njg\016C\027M\\4f'\016DW\rZ;mK\022\004\003\"B\037\001\t\003r\024!\003=Q_NLG/[8o)\005y\004C\001\026A\023\t\t5F\001\004E_V\024G.\032\005\006\007\002!\tEP\001\nsB{7/\033;j_:DQ!\022\001\005By\n\021B\037)pg&$\030n\0348\t\013\035\003A\021\t\025\002\0275\f'o[\"iC:<W\r\032\005\006\023\002!\t\"M\001\fSN\034uN\0348fGR,G\rC\003L\001\021E\003&\001\006j]&$\030.\0317ju\026DQ!\024\001\005B!\nA\"\0369eCR,WI\034;jifDQa\024\001\005B!\nq\001Z5ta>\034X\rC\003R\001\021\005#+\001\013sK\006$gI]8n\035\n#fi\034:TKJ4XM\035\013\003SMCQ\001\026)A\002U\0131A\0342u!\t1\006,D\001X\025\t!6#\003\002Z/\nqaJ\021+UC\036\034u.\0349pk:$\007\"B.\001\t\003b\026aE<sSR,Gk\034(C)\032{'oU3sm\026\024HCA\025^\021\025!&\f1\001V\021\025y\006\001\"\021a\003%yg.T3tg\006<W\r\006\002*C\")!M\030a\001G\0069Q.Z:tC\036,\007CA\017e\023\t)gDA\004NKN\034\030mZ3\t\013\035\004A\021\t5\002\023=t7i\0348oK\016$HCA\025j\021\025Qg\r1\001l\003\021qw\016Z3\021\005ua\027BA7\037\005\021qu\016Z3\t\013=\004A\021\t9\002\031=tG)[:d_:tWm\031;\025\005%\n\b\"\0026o\001\004Y\007bB:\001\001\004%\t\"M\001\007[>4\030N\\4\t\017U\004\001\031!C\tm\006QQn\034<j]\036|F%Z9\025\005%:\bbB\035u\003\003\005\rA\r\005\007s\002\001\013\025\002\032\002\0175|g/\0338hA!)1\020\001C\001y\006i\001O]3qCJ,Gk\\'pm\026$\022A\r\025\007uz\fY\"!\b\021\007}\f)B\004\003\002\002\005EQBAA\002\025\r9\021Q\001\006\005\003\017\tI!A\002g[2TA!a\003\002\016\005!Qn\0343t\025\t\ty!A\002da^LA!a\005\002\004\005Aq\n\035;j_:\fG.\003\003\002\030\005e!AB'fi\"|GM\003\003\002\024\005\r\021!B7pI&$\027EAA\020\003M\t\007\017\0357jK\022,g.\032:hSN$\030nY:3\021\031\t\031\003\001C\001Q\005QAm\0348f\033>4\030N\\4)\017\005\005b0a\007\002\036!9\021\021\006\001\005\022\005-\022A\002:fgVdG\017\006\003\002.\005e\002#\002\026\0020\005M\022bAA\031W\t)\021I\035:bsB\031!&!\016\n\007\005]2F\001\004B]f\024VM\032\005\t\003w\t9\0031\001\002>\005!\021M]4t!\025Q\023qHA\"\023\r\t\te\013\002\013yI,\007/Z1uK\022t\004c\001\026\002F%\031\021qI\026\003\007\005s\027\020C\007\002L\001\001\n1!A\001\n\023A\023QJ\001\021gV\004XM\035\023j]&$\030.\0317ju\026L!aS\016\t\033\005E\003\001%A\002\002\003%I\001KA*\003I\031X\017]3sIU\004H-\031;f\013:$\030\016^=\n\0055[\002\"DA,\001A\005\031\021!A\005\n!\nI&A\007tkB,'\017\n3jgB|7/Z\005\003\037nAa\"!\030\001!\003\r\t\021!C\005\003?\n\031'\001\016tkB,'\017\n:fC\0224%o\\7O\005R3uN]*feZ,'\017F\002*\003CBa\001VA.\001\004)\026BA)\034\0219\t9\007\001I\001\004\003\005I\021BA5\003[\n\021d];qKJ$sO]5uKR{gJ\021+G_J\034VM\035<feR\031\021&a\033\t\rQ\013)\0071\001V\023\tY6\004K\006\001\003c\n))a\"\002\034\005u\001\003BA:\003rA!!\036\002|5\021\021q\017\006\004\003s2\021aA1t[&!\021QPA<\003)IeN[3di\006\024G.Z\005\005\003\003\013\031IA\005J]R,'OZ1dK*!\021QPA<\003\0251\030\r\\;fC\t\tI)A\020baB,gn\032\030ba&tSn\034<bE2,g&S'pm\006\024G.\032+jY\026\004")
/*    */ public interface Environment extends TileEntity, Environment, EnvironmentHost {
/*    */   boolean isChangeScheduled();
/*    */   
/*    */   @TraitSetter
/*    */   void isChangeScheduled_$eq(boolean paramBoolean);
/*    */   
/*    */   double xPosition();
/*    */   
/*    */   double yPosition();
/*    */   
/*    */   double zPosition();
/*    */   
/*    */   void markChanged();
/*    */   
/*    */   boolean isConnected();
/*    */   
/*    */   void initialize();
/*    */   
/*    */   void updateEntity();
/*    */   
/*    */   void dispose();
/*    */   
/*    */   void readFromNBTForServer(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   void writeToNBTForServer(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   void onMessage(Message paramMessage);
/*    */   
/*    */   void onConnect(Node paramNode);
/*    */   
/*    */   void onDisconnect(Node paramNode);
/*    */   
/*    */   boolean moving();
/*    */   
/*    */   @TraitSetter
/*    */   void moving_$eq(boolean paramBoolean);
/*    */   
/*    */   @Method(modid = "appliedenergistics2")
/*    */   boolean prepareToMove();
/*    */   
/*    */   @Method(modid = "appliedenergistics2")
/*    */   void doneMoving();
/*    */   
/*    */   Object[] result(Seq<Object> paramSeq);
/*    */   
/*    */   public final class Environment$$anonfun$dispose$1 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(ForgeDirection side) {
/* 56 */       BlockPosition npos = this.$outer.position().offset(side);
/* 57 */       Option option = Network$.MODULE$.getNetworkNode(ExtendedWorld$.MODULE$.extendedWorld(this.$outer.world()).getTileEntity(npos), side.getOpposite());
/* 58 */       if (option instanceof Node) { Option option1 = option; if (((SidedEnvironment)this.x2$1).sidedNode(side) != null) { ((SidedEnvironment)this.x2$1).sidedNode(side).disconnect((Node)option1); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 59 */        BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */     } private final Environment x2$1; public Environment$$anonfun$dispose$1(Environment $outer, Environment x2$1) {} }
/*    */   public final class Environment$$anonfun$dispose$2 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Environment x1$1;
/*    */     public Environment$$anonfun$dispose$2(Environment $outer, Environment x1$1) {}
/*    */     public final void apply(ForgeDirection side) {
/* 64 */       BlockPosition npos = this.$outer.position().offset(side);
/* 65 */       Option option = Network$.MODULE$.getNetworkNode(ExtendedWorld$.MODULE$.extendedWorld(this.$outer.world()).getTileEntity(npos), side.getOpposite());
/* 66 */       if (option instanceof Node) { Option option1 = option; if (this.x1$1.node() != null) { this.x1$1.node().disconnect((Node)option1); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; return; }  }
/* 67 */        BoxedUnit boxedUnit = BoxedUnit.UNIT;
/*    */     } }
/*    */   
/*    */   public final class Environment$$anonfun$dispose$3 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final void apply(Node x$1) {
/* 73 */       x$1.remove();
/*    */     } public Environment$$anonfun$dispose$3(Environment $outer) {} } public final class Environment$$anonfun$dispose$4 extends AbstractFunction1<ForgeDirection, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Environment x2$2;
/*    */     public Environment$$anonfun$dispose$4(Environment $outer, Environment x2$2) {}
/* 76 */     public final void apply(ForgeDirection side) { Option$.MODULE$.apply(((SidedEnvironment)this.x2$2).sidedNode(side)).foreach((Function1)new Environment$$anonfun$dispose$4$$anonfun$apply$1(this)); } public final class Environment$$anonfun$dispose$4$$anonfun$apply$1 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; public final void apply(Node x$2) { x$2.remove(); }
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       public Environment$$anonfun$dispose$4$$anonfun$apply$1(Environment$$anonfun$dispose$4 $outer) {} }
/*    */      }
/*    */ 
/*    */ 
/*    */   
/*    */   public final class Environment$$anonfun$writeToNBTForServer$1
/*    */     extends AbstractFunction1<NBTTagCompound, BoxedUnit>
/*    */     implements Serializable
/*    */   {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     private final Node eta$0$1$1;
/*    */ 
/*    */     
/*    */     public final void apply(NBTTagCompound x$1) {
/* 96 */       this.eta$0$1$1.save(x$1);
/*    */     }
/*    */     
/*    */     public Environment$$anonfun$writeToNBTForServer$1(Environment $outer, Node eta$0$1$1) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\Environment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */