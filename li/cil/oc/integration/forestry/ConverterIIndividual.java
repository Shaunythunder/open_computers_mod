/*     */ package li.cil.oc.integration.forestry;
/*     */ 
/*     */ import com.google.common.base.Preconditions;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import forestry.api.apiculture.EnumBeeChromosome;
/*     */ import forestry.api.apiculture.IAlleleBeeEffect;
/*     */ import forestry.api.apiculture.IAlleleBeeSpecies;
/*     */ import forestry.api.apiculture.IBee;
/*     */ import forestry.api.apiculture.IBeeGenome;
/*     */ import forestry.api.arboriculture.EnumTreeChromosome;
/*     */ import forestry.api.arboriculture.IAlleleFruit;
/*     */ import forestry.api.arboriculture.IAlleleGrowth;
/*     */ import forestry.api.arboriculture.IAlleleLeafEffect;
/*     */ import forestry.api.arboriculture.IAlleleTreeSpecies;
/*     */ import forestry.api.arboriculture.ITree;
/*     */ import forestry.api.arboriculture.ITreeGenome;
/*     */ import forestry.api.genetics.IAllele;
/*     */ import forestry.api.genetics.IAlleleArea;
/*     */ import forestry.api.genetics.IAlleleBoolean;
/*     */ import forestry.api.genetics.IAlleleFloat;
/*     */ import forestry.api.genetics.IAlleleFlowers;
/*     */ import forestry.api.genetics.IAlleleInteger;
/*     */ import forestry.api.genetics.IAllelePlantType;
/*     */ import forestry.api.genetics.IAlleleSpecies;
/*     */ import forestry.api.genetics.IAlleleTolerance;
/*     */ import forestry.api.genetics.IChromosome;
/*     */ import forestry.api.genetics.IChromosomeType;
/*     */ import forestry.api.genetics.IGenome;
/*     */ import forestry.api.genetics.IIndividual;
/*     */ import forestry.api.genetics.IIndividualLiving;
/*     */ import forestry.api.lepidopterology.EnumButterflyChromosome;
/*     */ import forestry.api.lepidopterology.IAlleleButterflyEffect;
/*     */ import forestry.api.lepidopterology.IAlleleButterflySpecies;
/*     */ import forestry.api.lepidopterology.IButterfly;
/*     */ import forestry.api.lepidopterology.IButterflyGenome;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import li.cil.oc.api.driver.Converter;
/*     */ 
/*     */ public class ConverterIIndividual
/*     */   implements Converter {
/*     */   private static abstract class GenomeAccess {
/*     */     private GenomeAccess() {}
/*     */     
/*     */     public IAllele getAllele(IGenome genome, int chromosome) {
/*  47 */       IChromosome[] genotype = genome.getChromosomes();
/*  48 */       IChromosome ch = genotype[chromosome];
/*  49 */       if (ch == null) return null; 
/*  50 */       return getAllele(ch);
/*     */     }
/*     */     
/*     */     protected abstract IAllele getAllele(IChromosome param1IChromosome);
/*     */   }
/*     */   
/*  56 */   private static final GenomeAccess ACTIVE = new GenomeAccess()
/*     */     {
/*     */       protected IAllele getAllele(IChromosome chromosome) {
/*  59 */         return chromosome.getActiveAllele();
/*     */       }
/*     */     };
/*     */   
/*  63 */   private static final GenomeAccess INACTIVE = new GenomeAccess()
/*     */     {
/*     */       protected IAllele getAllele(IChromosome chromosome) {
/*  66 */         return chromosome.getInactiveAllele();
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Map<Class<? extends IAllele>, IAlleleConverter<?>> converters;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*  91 */     converters = (Map<Class<? extends IAllele>, IAlleleConverter<?>>)ImmutableMap.builder().put(IAlleleFloat.class, IAlleleFloat::getValue).put(IAlleleInteger.class, IAlleleInteger::getValue).put(IAlleleBoolean.class, IAlleleBoolean::getValue).put(IAlleleArea.class, IAlleleArea::getValue).put(IAlleleTolerance.class, allele -> allele.getValue().toString()).put(IAlleleFlowers.class, allele -> allele.getProvider().getFlowerType()).put(IAlleleBeeEffect.class, IAllele::getUnlocalizedName).put(IAllelePlantType.class, IAllelePlantType::getPlantTypes).put(IAlleleGrowth.class, allele -> allele.getProvider().getInfo()).put(IAlleleBeeSpecies.class, allele -> { Map<Object, Object> output = new HashMap<>(); ConverterIAlleles.convertAlleleSpecies((IAlleleSpecies)allele, output); return (IAlleleConverter)output; }).build();
/*     */   }
/*     */   
/*     */   private static abstract class GenomeReader<G extends IGenome, E extends Enum<E> & IChromosomeType> { private final G genome;
/*     */     
/*     */     public GenomeReader(G genome) {
/*  97 */       this.genome = genome;
/*     */     }
/*     */ 
/*     */     
/*     */     protected <A extends IAllele> A getAllele(ConverterIIndividual.GenomeAccess access, Class<A> cls, E chromosome) {
/* 102 */       Preconditions.checkArgument((((IChromosomeType)chromosome).getAlleleClass() == cls));
/* 103 */       IAllele allele = access.getAllele((IGenome)this.genome, chromosome.ordinal());
/* 104 */       return (A)allele;
/*     */     }
/*     */     
/*     */     protected <A extends IAllele> Object convertAllele(ConverterIIndividual.GenomeAccess access, Class<A> cls, E chromosome) {
/* 108 */       A allele = getAllele(access, cls, chromosome);
/* 109 */       if (allele == null) return "missing";
/*     */       
/* 111 */       ConverterIIndividual.IAlleleConverter<IAllele> converter = (ConverterIIndividual.IAlleleConverter<IAllele>)ConverterIIndividual.converters.get(cls);
/* 112 */       return (converter != null) ? converter.convert((IAllele)allele) : allele.getName();
/*     */     }
/*     */     
/*     */     protected abstract void addAlleleInfo(ConverterIIndividual.GenomeAccess param1GenomeAccess, Map<String, Object> param1Map);
/*     */     
/*     */     public Map<String, Object> getActiveInfo() {
/* 118 */       Map<String, Object> result = Maps.newHashMap();
/* 119 */       addAlleleInfo(ConverterIIndividual.ACTIVE, result);
/* 120 */       return result;
/*     */     }
/*     */     
/*     */     public Map<String, Object> getInactiveInfo() {
/* 124 */       Map<String, Object> result = Maps.newHashMap();
/* 125 */       addAlleleInfo(ConverterIIndividual.INACTIVE, result);
/* 126 */       return result;
/*     */     } }
/*     */ 
/*     */   
/*     */   private static class BeeGenomeReader
/*     */     extends GenomeReader<IBeeGenome, EnumBeeChromosome> {
/*     */     public BeeGenomeReader(IBeeGenome genome) {
/* 133 */       super(genome);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void addAlleleInfo(ConverterIIndividual.GenomeAccess access, Map<String, Object> result) {
/* 138 */       result.put("species", convertAllele(access, IAlleleBeeSpecies.class, EnumBeeChromosome.SPECIES));
/* 139 */       result.put("speed", convertAllele(access, IAlleleFloat.class, EnumBeeChromosome.SPEED));
/* 140 */       result.put("lifespan", convertAllele(access, IAlleleInteger.class, EnumBeeChromosome.LIFESPAN));
/* 141 */       result.put("fertility", convertAllele(access, IAlleleInteger.class, EnumBeeChromosome.FERTILITY));
/* 142 */       result.put("temperatureTolerance", 
/*     */           
/* 144 */           convertAllele(access, IAlleleTolerance.class, EnumBeeChromosome.TEMPERATURE_TOLERANCE));
/* 145 */       result.put("nocturnal", convertAllele(access, IAlleleBoolean.class, EnumBeeChromosome.NOCTURNAL));
/* 146 */       result.put("humidityTolerance", 
/*     */           
/* 148 */           convertAllele(access, IAlleleTolerance.class, EnumBeeChromosome.HUMIDITY_TOLERANCE));
/* 149 */       result.put("tolerantFlyer", convertAllele(access, IAlleleBoolean.class, EnumBeeChromosome.TOLERANT_FLYER));
/* 150 */       result.put("caveDwelling", convertAllele(access, IAlleleBoolean.class, EnumBeeChromosome.CAVE_DWELLING));
/* 151 */       result.put("flowerProvider", 
/* 152 */           convertAllele(access, IAlleleFlowers.class, EnumBeeChromosome.FLOWER_PROVIDER));
/* 153 */       result.put("flowering", convertAllele(access, IAlleleInteger.class, EnumBeeChromosome.FLOWERING));
/* 154 */       result.put("effect", convertAllele(access, IAlleleBeeEffect.class, EnumBeeChromosome.EFFECT));
/* 155 */       result.put("territory", convertAllele(access, IAlleleArea.class, EnumBeeChromosome.TERRITORY));
/*     */     }
/*     */   }
/*     */   
/*     */   private static class ButterflyGenomeReader
/*     */     extends GenomeReader<IButterflyGenome, EnumButterflyChromosome> {
/*     */     public ButterflyGenomeReader(IButterflyGenome genome) {
/* 162 */       super(genome);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void addAlleleInfo(ConverterIIndividual.GenomeAccess access, Map<String, Object> result) {
/* 167 */       result.put("species", 
/* 168 */           convertAllele(access, IAlleleButterflySpecies.class, EnumButterflyChromosome.SPECIES));
/* 169 */       result.put("size", convertAllele(access, IAlleleFloat.class, EnumButterflyChromosome.SIZE));
/* 170 */       result.put("speed", convertAllele(access, IAlleleFloat.class, EnumButterflyChromosome.SPEED));
/* 171 */       result.put("lifespan", convertAllele(access, IAlleleInteger.class, EnumButterflyChromosome.LIFESPAN));
/* 172 */       result.put("metabolism", convertAllele(access, IAlleleInteger.class, EnumButterflyChromosome.METABOLISM));
/* 173 */       result.put("fertility", convertAllele(access, IAlleleInteger.class, EnumButterflyChromosome.FERTILITY));
/* 174 */       result.put("temperatureTolerance", 
/*     */           
/* 176 */           convertAllele(access, IAlleleTolerance.class, EnumButterflyChromosome.TEMPERATURE_TOLERANCE));
/* 177 */       result.put("humidityTolerance", 
/*     */           
/* 179 */           convertAllele(access, IAlleleTolerance.class, EnumButterflyChromosome.HUMIDITY_TOLERANCE));
/* 180 */       result.put("nocturnal", convertAllele(access, IAlleleBoolean.class, EnumButterflyChromosome.NOCTURNAL));
/* 181 */       result.put("tolerantFlyer", 
/*     */           
/* 183 */           convertAllele(access, IAlleleBoolean.class, EnumButterflyChromosome.TOLERANT_FLYER));
/* 184 */       result.put("fireResist", convertAllele(access, IAlleleBoolean.class, EnumButterflyChromosome.FIRE_RESIST));
/* 185 */       result.put("flowerProvider", 
/*     */           
/* 187 */           convertAllele(access, IAlleleFlowers.class, EnumButterflyChromosome.FLOWER_PROVIDER));
/* 188 */       result.put("effect", convertAllele(access, IAlleleButterflyEffect.class, EnumButterflyChromosome.EFFECT));
/* 189 */       result.put("territory", convertAllele(access, IAlleleArea.class, EnumButterflyChromosome.TERRITORY));
/*     */     }
/*     */   }
/*     */   
/*     */   private static class TreeGenomeReader
/*     */     extends GenomeReader<ITreeGenome, EnumTreeChromosome> {
/*     */     public TreeGenomeReader(ITreeGenome genome) {
/* 196 */       super(genome);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void addAlleleInfo(ConverterIIndividual.GenomeAccess access, Map<String, Object> result) {
/* 201 */       result.put("species", convertAllele(access, IAlleleTreeSpecies.class, EnumTreeChromosome.SPECIES));
/* 202 */       result.put("growth", convertAllele(access, IAlleleGrowth.class, EnumTreeChromosome.GROWTH));
/* 203 */       result.put("height", convertAllele(access, IAlleleFloat.class, EnumTreeChromosome.HEIGHT));
/* 204 */       result.put("fertility", convertAllele(access, IAlleleFloat.class, EnumTreeChromosome.FERTILITY));
/* 205 */       result.put("fruits", convertAllele(access, IAlleleFruit.class, EnumTreeChromosome.FRUITS));
/* 206 */       result.put("yield", convertAllele(access, IAlleleFloat.class, EnumTreeChromosome.YIELD));
/* 207 */       result.put("plant", convertAllele(access, IAllelePlantType.class, EnumTreeChromosome.PLANT));
/* 208 */       result.put("sappiness", convertAllele(access, IAlleleFloat.class, EnumTreeChromosome.SAPPINESS));
/* 209 */       result.put("territory", convertAllele(access, IAlleleArea.class, EnumTreeChromosome.TERRITORY));
/* 210 */       result.put("effect", convertAllele(access, IAlleleLeafEffect.class, EnumTreeChromosome.EFFECT));
/* 211 */       result.put("maturation", convertAllele(access, IAlleleInteger.class, EnumTreeChromosome.MATURATION));
/* 212 */       result.put("girth", convertAllele(access, IAlleleInteger.class, EnumTreeChromosome.GIRTH));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void convert(Object value, Map<Object, Object> output) {
/* 218 */     if (value instanceof IIndividual) {
/* 219 */       IIndividual individual = (IIndividual)value;
/* 220 */       output.put("displayName", individual.getDisplayName());
/* 221 */       output.put("ident", individual.getIdent());
/*     */       
/* 223 */       boolean isAnalyzed = individual.isAnalyzed();
/* 224 */       output.put("isAnalyzed", Boolean.valueOf(isAnalyzed));
/* 225 */       output.put("isSecret", Boolean.valueOf(individual.isSecret()));
/* 226 */       GenomeReader<?, ?> genomeReader = null;
/*     */       
/* 228 */       if (individual instanceof IIndividualLiving) {
/* 229 */         IIndividualLiving living = (IIndividualLiving)individual;
/* 230 */         output.put("health", Integer.valueOf(living.getHealth()));
/* 231 */         output.put("maxHealth", Integer.valueOf(living.getMaxHealth()));
/*     */       } 
/*     */       
/* 234 */       if (individual instanceof IBee) {
/* 235 */         IBee bee = (IBee)individual;
/* 236 */         output.put("type", "bee");
/* 237 */         output.put("canSpawn", Boolean.valueOf(bee.canSpawn()));
/* 238 */         output.put("generation", Integer.valueOf(bee.getGeneration()));
/* 239 */         output.put("hasEffect", Boolean.valueOf(bee.hasEffect()));
/* 240 */         output.put("isAlive", Boolean.valueOf(bee.isAlive()));
/* 241 */         output.put("isNatural", Boolean.valueOf(bee.isNatural()));
/*     */         
/* 243 */         if (isAnalyzed) genomeReader = new BeeGenomeReader(bee.getGenome()); 
/* 244 */       } else if (individual instanceof IButterfly) {
/* 245 */         IButterfly butterfly = (IButterfly)individual;
/* 246 */         output.put("type", "butterfly");
/* 247 */         output.put("size", Float.valueOf(butterfly.getSize()));
/* 248 */         if (isAnalyzed) genomeReader = new ButterflyGenomeReader(butterfly.getGenome()); 
/* 249 */       } else if (individual instanceof ITree) {
/* 250 */         ITree tree = (ITree)individual;
/* 251 */         output.put("type", "tree");
/* 252 */         output.put("plantType", tree.getPlantTypes().toString());
/* 253 */         if (isAnalyzed) genomeReader = new TreeGenomeReader(tree.getGenome());
/*     */       
/*     */       } 
/* 256 */       if (genomeReader != null) {
/* 257 */         output.put("active", genomeReader.getActiveInfo());
/* 258 */         output.put("inactive", genomeReader.getInactiveInfo());
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static interface IAlleleConverter<A extends IAllele> {
/*     */     Object convert(A param1A);
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\forestry\ConverterIIndividual.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */