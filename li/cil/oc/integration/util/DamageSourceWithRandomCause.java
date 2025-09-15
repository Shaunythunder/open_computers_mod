/*    */ package li.cil.oc.integration.util;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.util.ChatComponentTranslation;
/*    */ import net.minecraft.util.IChatComponent;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001u2A!\001\002\001\033\tYB)Y7bO\026\034v.\036:dK^KG\017\033*b]\022|WnQ1vg\026T!a\001\003\002\tU$\030\016\034\006\003\013\031\t1\"\0338uK\036\024\030\r^5p]*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\005\001q\001CA\b\026\033\005\001\"BA\002\022\025\t\0212#A\005nS:,7M]1gi*\tA#A\002oKRL!A\006\t\003\031\021\013W.Y4f'>,(oY3\t\021a\001!\021!Q\001\ne\tAA\\1nKB\021!\004\t\b\0037yi\021\001\b\006\002;\005)1oY1mC&\021q\004H\001\007!J,G-\0324\n\005\005\022#AB*ue&twM\003\002 9!AA\005\001B\001B\003%Q%A\005ok6\034\025-^:fgB\0211DJ\005\003Oq\0211!\0238u\021\025I\003\001\"\001+\003\031a\024N\\5u}Q\0311&\f\030\021\0051\002Q\"\001\002\t\013aA\003\031A\r\t\013\021B\003\031A\023\t\013A\002A\021I\031\002\033\031,hnY02kE*\024'O0c)\t\021T\007\005\002\020g%\021A\007\005\002\017\023\016C\027\r^\"p[B|g.\0328u\021\0251t\0061\0018\003\035!\027-\\1hK\026\004\"\001O\036\016\003eR!AO\t\002\r\025tG/\033;z\023\ta\024H\001\tF]RLG/\037'jm&twMQ1tK\002")
/*    */ public class DamageSourceWithRandomCause extends DamageSource {
/*    */   public DamageSourceWithRandomCause(String name, int numCauses) {
/*  9 */     super(name);
/*    */   } private final int numCauses; public IChatComponent func_151519_b(EntityLivingBase damagee) {
/* 11 */     EntityLivingBase damager = damagee.func_94060_bK();
/* 12 */     String format = (new StringBuilder()).append("death.attack.").append(this.field_76373_n).append(".").append(BoxesRunTime.boxToInteger(damagee.field_70170_p.field_73012_v.nextInt(this.numCauses) + 1)).toString();
/* 13 */     String withCauseFormat = (new StringBuilder()).append(format).append(".player").toString();
/* 14 */     return (damager != null && StatCollector.func_94522_b(withCauseFormat)) ? 
/* 15 */       (IChatComponent)new ChatComponentTranslation(withCauseFormat, new Object[] { damagee.func_145748_c_(), damager.func_145748_c_()
/*    */         
/* 17 */         }) : (IChatComponent)new ChatComponentTranslation(format, new Object[] { damagee.func_145748_c_() });
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integratio\\util\DamageSourceWithRandomCause.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */