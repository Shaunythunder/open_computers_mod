/*    */ package li.cil.oc.common.tileentity;
/*    */ 
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import scala.Function1;
/*    */ import scala.Predef$;
/*    */ import scala.Predef$ArrowAssoc$;
/*    */ import scala.Serializable;
/*    */ import scala.collection.immutable.Map;
/*    */ import scala.collection.immutable.Set;
/*    */ import scala.runtime.AbstractFunction1;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ import scala.runtime.NonLocalReturnControl;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005Ma\001B\001\003\0015\021\021cQ1sa\026$X\rZ\"ba\006\034\027\016^8s\025\t\031A!\001\006uS2,WM\034;jifT!!\002\004\002\r\r|W.\\8o\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\003\0019\001\"a\004\t\016\003\tI!!\005\002\003\023\r\013\007/Y2ji>\024\b\"B\n\001\t\003!\022A\002\037j]&$h\bF\001\026!\ty\001\001\003\005\030\001!\025\r\021\"\004\031\003)!WM^5dK&sgm\\\013\0023A!!$I\022$\033\005Y\"B\001\017\036\003%IW.\\;uC\ndWM\003\002\037?\005Q1m\0347mK\016$\030n\0348\013\003\001\nQa]2bY\006L!AI\016\003\0075\013\007\017\005\002%S5\tQE\003\002'O\005!A.\0318h\025\005A\023\001\0026bm\006L!AK\023\003\rM#(/\0338h\021!a\003\001#A!B\033I\022a\0033fm&\034W-\0238g_\002BQA\f\001\005B=\nQbZ3u\t\0264\030nY3J]\032|G#\001\031\021\tE\"T'N\007\002e)\0211gJ\001\005kRLG.\003\002#eA\021aG\017\b\003oaj\021aH\005\003s}\ta\001\025:fI\0264\027B\001\026<\025\tIt\004C\003>\001\021\005c(A\005dC:,\006\017Z1uKR\tq\b\005\0028\001&\021\021i\b\002\b\005>|G.Z1o\021\035\031\005A1A\005\n\021\0131A\0358h+\005)eB\001$N\035\t9EJ\004\002I\0276\t\021J\003\002K\031\0051AH]8pizJ\021\001I\005\003g}I!AT(\002\rI\013g\016Z8n\025\t\031t\004\003\004R\001\001\006I!R\001\005e:<\007\005C\004T\001\t\007I\021\002+\002\r\rD\027M\\2f+\005)\006CA\034W\023\t9vD\001\004E_V\024G.\032\005\0073\002\001\013\021B+\002\017\rD\027M\\2fA!91\f\001a\001\n\023a\026A\0048fqR\034\005.\0318dKRKW.Z\013\002;B\021qGX\005\003?~\021A\001T8oO\"9\021\r\001a\001\n\023\021\027A\0058fqR\034\005.\0318dKRKW.Z0%KF$\"a\0314\021\005]\"\027BA3 \005\021)f.\033;\t\017\035\004\027\021!a\001;\006\031\001\020J\031\t\r%\004\001\025)\003^\003=qW\r\037;DQ\006t7-\032+j[\026\004\003\"B6\001\t\023a\027aD3oKJ<\027P\022:p[\036\023x.\0369\025\007UkG\020C\003oU\002\007q.\001\005f]RLG/[3t!\r1\004O]\005\003cn\0221aU3u!\t\031(0D\001u\025\t)h/\001\004f]RLG/\037\006\003ob\f\021\"\\5oK\016\024\030M\032;\013\003e\f1A\\3u\023\tYHO\001\tF]RLG/\037'jm&twMQ1tK\")QP\033a\001+\006)\001o\\<fe\"1q\020\001C!\003\003\tA\"\0369eCR,WI\034;jif$\022a\031\005\b\003\013\001A\021BA\004\003Q\031\027\r]1dSR|'\017U8xKJ\024u.\0368egV\021\021\021\002\t\005\003\027\ty!\004\002\002\016)\0211G^\005\005\003#\tiAA\007Bq&\034\030\t\\5h]\026$'I\021")
/*    */ public class CarpetedCapacitor extends Capacitor {
/*    */   private Map<String, String> deviceInfo;
/*    */   
/* 18 */   private Map deviceInfo$lzycompute() { synchronized (this) { if (!this.bitmap$0) { (new scala.Tuple2[5])[0] = Predef$ArrowAssoc$.MODULE$
/* 19 */           .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "power");
/* 20 */         (new scala.Tuple2[5])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Battery");
/* 21 */         (new scala.Tuple2[5])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/* 22 */         (new scala.Tuple2[5])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "CarpetedCapBank3x");
/* 23 */         (new scala.Tuple2[5])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), BoxesRunTime.boxToDouble(maxCapacity()).toString()); this.deviceInfo = (Map<String, String>)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[5])); this.bitmap$0 = true; }
/*    */        return this.deviceInfo; }
/*    */      } private final Map<String, String> deviceInfo() { return this.bitmap$0 ? this.deviceInfo : deviceInfo$lzycompute(); }
/* 26 */   public Map<String, String> getDeviceInfo() { return WrapAsJava$.MODULE$.mapAsJavaMap((Map)deviceInfo()); }
/*    */    public boolean canUpdate() {
/* 28 */     return true;
/*    */   }
/* 30 */   private final Random$ li$cil$oc$common$tileentity$CarpetedCapacitor$$rng = Random$.MODULE$; public Random$ li$cil$oc$common$tileentity$CarpetedCapacitor$$rng() { return this.li$cil$oc$common$tileentity$CarpetedCapacitor$$rng; }
/* 31 */    private final double li$cil$oc$common$tileentity$CarpetedCapacitor$$chance = Settings$.MODULE$.get().carpetDamageChance(); public double li$cil$oc$common$tileentity$CarpetedCapacitor$$chance() { return this.li$cil$oc$common$tileentity$CarpetedCapacitor$$chance; }
/* 32 */    private long li$cil$oc$common$tileentity$CarpetedCapacitor$$nextChanceTime = 0L; private volatile boolean bitmap$0; private long li$cil$oc$common$tileentity$CarpetedCapacitor$$nextChanceTime() { return this.li$cil$oc$common$tileentity$CarpetedCapacitor$$nextChanceTime; } public void li$cil$oc$common$tileentity$CarpetedCapacitor$$nextChanceTime_$eq(long x$1) { this.li$cil$oc$common$tileentity$CarpetedCapacitor$$nextChanceTime = x$1; }
/*    */   private final void tryDamageOne$1(Set entities$1) { Object object = new Object(); try { entities$1.foreach((Function1)new CarpetedCapacitor$$anonfun$tryDamageOne$1$1(this, object)); } catch (NonLocalReturnControl nonLocalReturnControl) { if (nonLocalReturnControl.key() == object) { nonLocalReturnControl.value$mcV$sp(); return; }
/*    */        }
/* 35 */      } private double energyFromGroup(Set entities, double power) { if (entities.size() < 2) return 0.0D;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 48 */     if (li$cil$oc$common$tileentity$CarpetedCapacitor$$chance() > false && li$cil$oc$common$tileentity$CarpetedCapacitor$$nextChanceTime() < world().func_82737_E()) {
/* 49 */       tryDamageOne$1(entities);
/*    */     }
/* 51 */     return power; }
/*    */   public final class CarpetedCapacitor$$anonfun$tryDamageOne$1$1 extends AbstractFunction1<EntityLivingBase, BoxedUnit> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; private final Object nonLocalReturnKey1$1; public CarpetedCapacitor$$anonfun$tryDamageOne$1$1(CarpetedCapacitor $outer, Object nonLocalReturnKey1$1) {} public final void apply(EntityLivingBase ent) { if (this.$outer.li$cil$oc$common$tileentity$CarpetedCapacitor$$rng().nextDouble() < this.$outer.li$cil$oc$common$tileentity$CarpetedCapacitor$$chance()) {
/*    */         ent.func_70097_a(DamageSource.field_76377_j, 1.0F); ent.func_70604_c(ent); ent.func_70653_a((Entity)ent, 0.0F, 0.25D, 0.0D); this.$outer.li$cil$oc$common$tileentity$CarpetedCapacitor$$nextChanceTime_$eq(this.$outer.world().func_82737_E() + 1200L); throw new NonLocalReturnControl.mcV.sp(this.nonLocalReturnKey1$1, BoxedUnit.UNIT);
/* 55 */       }  } } public void func_145845_h() { if (node() != null && (world().func_82737_E() + hashCode()) % 20L == 0L) {
/* 56 */       Set entities = ((TraversableOnce)((TraversableLike)WrapAsScala$.MODULE$.asScalaBuffer(world().func_72872_a(EntityLivingBase.class, capacitorPowerBounds()))
/* 57 */         .map((Function1)new CarpetedCapacitor$$anonfun$1(this), Buffer$.MODULE$.canBuildFrom()))
/* 58 */         .filter((Function1)new CarpetedCapacitor$$anonfun$2(this)))
/* 59 */         .toSet();
/* 60 */       double sheepPower = energyFromGroup((Set<EntityLivingBase>)entities.filter((Function1)new CarpetedCapacitor$$anonfun$3(this)), Settings$.MODULE$.get().sheepPower());
/* 61 */       double ocelotPower = energyFromGroup((Set<EntityLivingBase>)entities.filter((Function1)new CarpetedCapacitor$$anonfun$4(this)), Settings$.MODULE$.get().ocelotPower());
/* 62 */       double totalPower = sheepPower + ocelotPower;
/* 63 */       if (totalPower > false)
/* 64 */         node().changeBuffer(totalPower); 
/*    */     }  } public final class CarpetedCapacitor$$anonfun$1 extends AbstractFunction1<Object, EntityLivingBase> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final EntityLivingBase apply(Object x$1) { return (EntityLivingBase)x$1; } public CarpetedCapacitor$$anonfun$1(CarpetedCapacitor $outer) {} } public final class CarpetedCapacitor$$anonfun$2 extends AbstractFunction1<EntityLivingBase, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L; public final boolean apply(EntityLivingBase entity) { return entity.func_70089_S(); }
/*    */     public CarpetedCapacitor$$anonfun$2(CarpetedCapacitor $outer) {} }
/* 69 */   private AxisAlignedBB capacitorPowerBounds() { return position().offset(ForgeDirection.UP).bounds(); }
/*    */ 
/*    */   
/*    */   public final class CarpetedCapacitor$$anonfun$3 extends AbstractFunction1<EntityLivingBase, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(EntityLivingBase x$2) {
/*    */       return x$2 instanceof net.minecraft.entity.passive.EntitySheep;
/*    */     }
/*    */     
/*    */     public CarpetedCapacitor$$anonfun$3(CarpetedCapacitor $outer) {}
/*    */   }
/*    */   
/*    */   public final class CarpetedCapacitor$$anonfun$4 extends AbstractFunction1<EntityLivingBase, Object> implements Serializable {
/*    */     public static final long serialVersionUID = 0L;
/*    */     
/*    */     public final boolean apply(EntityLivingBase x$3) {
/*    */       return x$3 instanceof net.minecraft.entity.passive.EntityOcelot;
/*    */     }
/*    */     
/*    */     public CarpetedCapacitor$$anonfun$4(CarpetedCapacitor $outer) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\CarpetedCapacitor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */