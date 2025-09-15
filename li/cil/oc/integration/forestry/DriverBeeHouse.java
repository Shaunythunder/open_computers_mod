/*     */ package li.cil.oc.integration.forestry;
/*     */ 
/*     */ import com.google.common.collect.Sets;
/*     */ import forestry.api.apiculture.IBeeHousing;
/*     */ import forestry.api.genetics.AlleleManager;
/*     */ import forestry.api.genetics.IAllele;
/*     */ import forestry.api.genetics.IAlleleSpecies;
/*     */ import forestry.api.genetics.IMutation;
/*     */ import forestry.api.genetics.ISpeciesRoot;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import li.cil.oc.api.prefab.DriverSidedTileEntity;
/*     */ import li.cil.oc.integration.ManagedTileEntityEnvironment;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ public class DriverBeeHouse
/*     */   extends DriverSidedTileEntity {
/*     */   public Class<?> getTileEntityClass() {
/*  26 */     return IBeeHousing.class;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ManagedEnvironment createEnvironment(World world, int x, int y, int z, ForgeDirection side) {
/*  32 */     return (ManagedEnvironment)new Environment((IBeeHousing)world.func_147438_o(x, y, z));
/*     */   }
/*     */   
/*     */   public static final class Environment extends ManagedTileEntityEnvironment<IBeeHousing> {
/*     */     public Environment(IBeeHousing tileEntity) {
/*  37 */       super(tileEntity, "bee_housing");
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():boolean -- Can the bees breed?")
/*     */     public Object[] canBreed(Context context, Arguments args) {
/*  42 */       return new Object[] { Boolean.valueOf(((IBeeHousing)this.tileEntity).getBeekeepingLogic().canWork()) };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():table -- Get the drone")
/*     */     public Object[] getDrone(Context context, Arguments args) {
/*  47 */       ItemStack drone = ((IBeeHousing)this.tileEntity).getBeeInventory().getDrone();
/*  48 */       if (drone != null) {
/*  49 */         return new Object[] { AlleleManager.alleleRegistry.getIndividual(drone) };
/*     */       }
/*  51 */       return null;
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():table -- Get the queen")
/*     */     public Object[] getQueen(Context context, Arguments args) {
/*  56 */       ItemStack queen = ((IBeeHousing)this.tileEntity).getBeeInventory().getQueen();
/*  57 */       if (queen != null) {
/*  58 */         return new Object[] { AlleleManager.alleleRegistry.getIndividual(queen) };
/*     */       }
/*  60 */       return null;
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():table -- Get the full breeding list thingy.")
/*     */     public Object[] getBeeBreedingData(Context context, Arguments args) {
/*  65 */       ISpeciesRoot beeRoot = AlleleManager.alleleRegistry.getSpeciesRoot("rootBees");
/*  66 */       if (beeRoot == null) {
/*  67 */         return null;
/*     */       }
/*     */       
/*  70 */       Set<Map<String, Object>> result = Sets.newHashSet();
/*  71 */       for (IMutation mutation : beeRoot.getMutations(false)) {
/*  72 */         HashMap<String, Object> mutationMap = new HashMap<>();
/*     */         
/*  74 */         IAlleleSpecies iAlleleSpecies1 = mutation.getAllele0();
/*  75 */         if (iAlleleSpecies1 != null) {
/*  76 */           mutationMap.put("allele1", iAlleleSpecies1.getName());
/*     */         }
/*     */         
/*  79 */         IAlleleSpecies iAlleleSpecies2 = mutation.getAllele1();
/*  80 */         if (iAlleleSpecies2 != null) {
/*  81 */           mutationMap.put("allele2", iAlleleSpecies2.getName());
/*     */         }
/*     */         
/*  84 */         mutationMap.put("chance", Float.valueOf(mutation.getBaseChance()));
/*  85 */         mutationMap.put("specialConditions", mutation
/*  86 */             .getSpecialConditions().toArray());
/*     */         
/*  88 */         IAllele[] template = mutation.getTemplate();
/*  89 */         if (template != null && template.length > 0) {
/*  90 */           mutationMap.put("result", template[0].getName());
/*     */         }
/*  92 */         result.add(mutationMap);
/*     */       } 
/*  94 */       return new Object[] { result };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function():table -- Get all known bees mutations")
/*     */     public Object[] listAllSpecies(Context context, Arguments args) {
/*  99 */       ISpeciesRoot beeRoot = AlleleManager.alleleRegistry.getSpeciesRoot("rootBees");
/* 100 */       if (beeRoot == null) {
/* 101 */         return null;
/*     */       }
/*     */       
/* 104 */       Set<IAlleleSpecies> result = Sets.newHashSet();
/* 105 */       for (IMutation mutation : beeRoot.getMutations(false)) {
/* 106 */         IAllele[] template = mutation.getTemplate();
/* 107 */         if (template == null || template.length <= 0) {
/*     */           continue;
/*     */         }
/*     */         
/* 111 */         IAllele allele = template[0];
/* 112 */         if (!(allele instanceof IAlleleSpecies)) {
/*     */           continue;
/*     */         }
/*     */         
/* 116 */         result.add((IAlleleSpecies)allele);
/*     */       } 
/* 118 */       return new Object[] { result };
/*     */     }
/*     */     
/*     */     @Callback(doc = "function(beeName:string):table -- Get the parents for a particular mutation")
/*     */     public Object[] getBeeParents(Context context, Arguments args) {
/* 123 */       ISpeciesRoot beeRoot = AlleleManager.alleleRegistry.getSpeciesRoot("rootBees");
/* 124 */       if (beeRoot == null) {
/* 125 */         return null;
/*     */       }
/*     */       
/* 128 */       Set<IMutation> result = Sets.newHashSet();
/* 129 */       String childType = args.checkString(0).toLowerCase();
/* 130 */       for (IMutation mutation : beeRoot.getMutations(false)) {
/* 131 */         IAllele[] template = mutation.getTemplate();
/* 132 */         if (template == null || template.length < 1) {
/*     */           continue;
/*     */         }
/*     */         
/* 136 */         IAllele allele = template[0];
/* 137 */         if (!(allele instanceof IAlleleSpecies)) {
/*     */           continue;
/*     */         }
/*     */         
/* 141 */         IAlleleSpecies species = (IAlleleSpecies)allele;
/* 142 */         String uid = species.getUID().toLowerCase();
/* 143 */         String localizedName = species.getName().toLowerCase();
/* 144 */         if (localizedName.equals(childType) || uid.equals(childType)) {
/* 145 */           result.add(mutation);
/*     */         }
/*     */       } 
/* 148 */       return new Object[] { result };
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\forestry\DriverBeeHouse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */