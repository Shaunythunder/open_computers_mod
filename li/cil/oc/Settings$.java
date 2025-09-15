/*     */ package li.cil.oc;
/*     */ 
/*     */ import com.typesafe.config.Config;
/*     */ import com.typesafe.config.ConfigFactory;
/*     */ import com.typesafe.config.ConfigList;
/*     */ import com.typesafe.config.ConfigMergeable;
/*     */ import com.typesafe.config.ConfigRenderOptions;
/*     */ import com.typesafe.config.ConfigValue;
/*     */ import com.typesafe.config.ConfigValueFactory;
/*     */ import com.typesafe.config.impl.OpenComputersConfigCommentManipulationHook;
/*     */ import cpw.mods.fml.common.Loader;
/*     */ import cpw.mods.fml.common.ModContainer;
/*     */ import cpw.mods.fml.common.versioning.ArtifactVersion;
/*     */ import cpw.mods.fml.common.versioning.DefaultArtifactVersion;
/*     */ import cpw.mods.fml.common.versioning.VersionRange;
/*     */ import java.io.File;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintWriter;
/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import li.cil.oc.api.internal.TextBuffer;
/*     */ import org.apache.commons.lang3.StringEscapeUtils;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.MatchError;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.StringContext;
/*     */ import scala.Tuple2;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.immutable.List;
/*     */ import scala.collection.immutable.StringOps;
/*     */ import scala.collection.mutable.MutableList;
/*     */ import scala.collection.mutable.Seq;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.ObjectRef;
/*     */ import scala.util.matching.Regex;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Settings$
/*     */ {
/*     */   public static final Settings$ MODULE$;
/*     */   private final String resourceDomain;
/*     */   private final String namespace;
/*     */   private final String savePath;
/*     */   private final String scriptPath;
/*     */   private final Tuple2<Object, Object>[] screenResolutionsByTier;
/*     */   private final TextBuffer.ColorDepth[] screenDepthsByTier;
/*     */   private final int[] deviceComplexityByTier;
/*     */   private boolean rTreeDebugRenderer;
/*     */   private int blockRenderId;
/*     */   private final List<String> forbiddenConfigLists;
/*     */   private final String li$cil$oc$Settings$$prefix;
/*     */   private Settings settings;
/*     */   private final Tuple2<VersionRange, String[]>[] configPatches;
/*     */   private final VersionRange fileringRulesPatchVersion;
/*     */   
/*     */   public String resourceDomain() {
/* 506 */     return this.resourceDomain;
/* 507 */   } public String namespace() { return this.namespace; }
/* 508 */   public String savePath() { return this.savePath; }
/* 509 */   public String scriptPath() { return this.scriptPath; }
/* 510 */   public Tuple2<Object, Object>[] screenResolutionsByTier() { return this.screenResolutionsByTier; }
/* 511 */   public TextBuffer.ColorDepth[] screenDepthsByTier() { return this.screenDepthsByTier; }
/* 512 */   public int[] deviceComplexityByTier() { return this.deviceComplexityByTier; }
/* 513 */   public boolean rTreeDebugRenderer() { return this.rTreeDebugRenderer; } public void rTreeDebugRenderer_$eq(boolean x$1) { this.rTreeDebugRenderer = x$1; }
/* 514 */   public int blockRenderId() { return this.blockRenderId; } public void blockRenderId_$eq(int x$1) { this.blockRenderId = x$1; } private List<String> forbiddenConfigLists() {
/* 515 */     return this.forbiddenConfigLists;
/*     */   }
/*     */   
/*     */   public String li$cil$oc$Settings$$prefix() {
/* 519 */     return this.li$cil$oc$Settings$$prefix;
/*     */   } public int basicScreenPixels() {
/* 521 */     return screenResolutionsByTier()[0]._1$mcI$sp() * screenResolutionsByTier()[0]._2$mcI$sp();
/*     */   }
/* 523 */   private Settings settings() { return this.settings; } private void settings_$eq(Settings x$1) { this.settings = x$1; }
/*     */    public Settings get() {
/* 525 */     return settings();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void load(File file) {
/*     */     Config config1;
/* 535 */     InputStream in = Settings.class.getResourceAsStream("/application.conf");
/* 536 */     String config = scala.io.Source$.MODULE$.fromInputStream(in, scala.io.Codec$.MODULE$.UTF8()).getLines().mkString("", scala.compat.Platform$.MODULE$.EOL(), scala.compat.Platform$.MODULE$.EOL());
/* 537 */     in.close();
/* 538 */     Config defaults = ConfigFactory.parseString(config);
/*     */ 
/*     */     
/*     */     try {
/* 542 */       String plain = scala.io.Source$.MODULE$.fromFile(file, scala.io.Codec$.MODULE$.UTF8()).getLines().mkString("", scala.compat.Platform$.MODULE$.EOL(), scala.compat.Platform$.MODULE$.EOL());
/* 543 */       Config config2 = patchConfig(ConfigFactory.parseString(plain), defaults).withFallback((ConfigMergeable)defaults);
/* 544 */       settings_$eq(new Settings(config2.getConfig("opencomputers")));
/*     */     } finally {
/*     */       Exception exception = null;
/*     */ 
/*     */       
/* 549 */       if (file.exists()) {
/* 550 */         throw new RuntimeException((new StringBuilder()).append("Error parsing configuration file. To restore defaults, delete '").append(file.getName()).append("' and restart the game.").toString(), exception);
/*     */       }
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
/*     */     try {
/* 563 */       ConfigRenderOptions renderSettings = ConfigRenderOptions.defaults().setJson(false).setOriginComments(false);
/* 564 */       String nl = (String)scala.sys.package$.MODULE$.props().apply("line.separator");
/* 565 */       String nle = StringEscapeUtils.escapeJava(nl);
/* 566 */       PrintWriter out = new PrintWriter(file);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 573 */       (new String[3])[0] = "((?:\\\\s*#.*"; (new String[3])[1] = ")(?:\\\\s*[^#\\\\s].*"; (new String[3])[2] = ")+)"; out.write((new StringOps(scala.Predef$.MODULE$.augmentString(config1.root().render(renderSettings)))).lines().map((Function1)new Settings$$anonfun$load$2()).filter((Function1)new Settings$$anonfun$load$3()).mkString(nl).replaceAll((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { nle, nle }, )), (new StringBuilder()).append("$1").append(nl).toString()));
/* 574 */       out.close();
/*     */     } finally {
/*     */       Exception exception = null;
/*     */     } 
/*     */   } public final class Settings$$anonfun$load$1 extends AbstractFunction1<String, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final Config config$1; public Settings$$anonfun$load$1(Config config$1) {} public final void apply(String key) {
/*     */       if (this.config$1.hasPath((new StringBuilder()).append(Settings$.MODULE$.li$cil$oc$Settings$$prefix()).append(key).toString()) && !this.config$1.getStringList((new StringBuilder()).append(Settings$.MODULE$.li$cil$oc$Settings$$prefix()).append(key).toString()).isEmpty())
/*     */         throw new RuntimeException((new StringBuilder()).append("Error parsing configuration file: removed configuration option '").append(key).append("' is not empty. This option should no longer be used.").toString()); 
/*     */     } } private Tuple2<VersionRange, String[]>[] configPatches() {
/* 582 */     return this.configPatches;
/*     */   }
/*     */   
/*     */   public final class Settings$$anonfun$load$2 extends AbstractFunction1<String, String> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     public final String apply(String line) {
/*     */       return (new StringOps(scala.Predef$.MODULE$.augmentString("^(\\s*)"))).r().replaceAllIn(line, (Function1)new Settings$$anonfun$load$2$$anonfun$apply$1(this));
/*     */     }
/*     */     
/*     */     public final class Settings$$anonfun$load$2$$anonfun$apply$1 extends AbstractFunction1<Regex.Match, String> implements Serializable {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       public final String apply(Regex.Match m) {
/*     */         return scala.util.matching.Regex$.MODULE$.quoteReplacement(m.group(1).replace("  ", " "));
/*     */       }
/*     */       
/*     */       public Settings$$anonfun$load$2$$anonfun$apply$1(Settings$$anonfun$load$2 $outer) {} } }
/*     */   
/*     */   public final class Settings$$anonfun$load$3 extends AbstractFunction1<String, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     public final boolean apply(String x$2) {
/*     */       String str = "";
/*     */       if (x$2 == null) {
/*     */         if (str != null);
/*     */       } else if (x$2.equals(str)) {
/*     */       
/*     */       } 
/*     */     } }
/*     */   
/* 612 */   private VersionRange fileringRulesPatchVersion() { return this.fileringRulesPatchVersion; }
/*     */   public final class Settings$$anonfun$patchConfig$1 extends AbstractFunction1<Tuple2<VersionRange, String[]>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final boolean apply(Tuple2 check$ifrefutable$1) { boolean bool; Tuple2 tuple2 = check$ifrefutable$1; if (tuple2 != null) { bool = true; } else { bool = false; }  return bool; } } public final class Settings$$anonfun$patchConfig$2 extends AbstractFunction1<Tuple2<VersionRange, String[]>, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final DefaultArtifactVersion configVersion$1; public final boolean apply(Tuple2 x$3) { Tuple2 tuple2 = x$3; if (tuple2 != null) { VersionRange version = (VersionRange)tuple2._1(); return version.containsVersion((ArtifactVersion)this.configVersion$1); }  throw new MatchError(tuple2); } public Settings$$anonfun$patchConfig$2(DefaultArtifactVersion configVersion$1) {} } public final class Settings$$anonfun$patchConfig$3 extends AbstractFunction1<Tuple2<VersionRange, String[]>, BoxedUnit> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; public final Config defaults$1; public final ObjectRef patched$1; public final void apply(Tuple2 x$4) { Tuple2 tuple2 = x$4; if (tuple2 != null) { String[] paths = (String[])tuple2._2(); scala.Predef$.MODULE$.refArrayOps((Object[])paths).foreach((Function1)new Settings$$anonfun$patchConfig$3$$anonfun$apply$2(this)); BoxedUnit boxedUnit = BoxedUnit.UNIT; return; }  throw new MatchError(tuple2); } public Settings$$anonfun$patchConfig$3(Config defaults$1, ObjectRef patched$1) {} public final class Settings$$anonfun$patchConfig$3$$anonfun$apply$2 extends AbstractFunction1<String, BoxedUnit> implements Serializable {
/*     */       public static final long serialVersionUID = 0L; public Settings$$anonfun$patchConfig$3$$anonfun$apply$2(Settings$$anonfun$patchConfig$3 $outer) {} public final void apply(String path) { String fullPath = (new StringBuilder()).append(Settings$.MODULE$.li$cil$oc$Settings$$prefix()).append(path).toString(); (new String[2])[0] = "=> Updating setting '"; (new String[2])[1] = "'. "; OpenComputers$.MODULE$.log().info((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { fullPath }))); if (this.$outer.defaults$1.hasPath(fullPath)) { this.$outer.patched$1.elem = ((Config)this.$outer.patched$1.elem).withValue(fullPath, this.$outer.defaults$1.getValue(fullPath)); } else { this.$outer.patched$1.elem = ((Config)this.$outer.patched$1.elem).withoutPath(fullPath); }  } } } public final class Settings$$anonfun$patchConfig$4 extends AbstractFunction1<String, MutableList<String>> implements Serializable {
/* 618 */     public static final long serialVersionUID = 0L; private final Regex cidrPattern$1; private final MutableList internetFilteringRules$1; public Settings$$anonfun$patchConfig$4(Regex cidrPattern$1, MutableList internetFilteringRules$1) {} public final MutableList<String> apply(String blockedAddress) { return this.cidrPattern$1.findFirstIn(blockedAddress).isDefined() ? this.internetFilteringRules$1.$plus$eq((new StringBuilder()).append("deny ip:").append(blockedAddress).toString()) : this.internetFilteringRules$1.$plus$eq((new StringBuilder()).append("deny domain:").append(blockedAddress).toString()); } } private Config patchConfig(Config config, Config defaults) { ModContainer mod = Loader.instance().activeModContainer();
/* 619 */     DefaultArtifactVersion configVersion = new DefaultArtifactVersion(config.hasPath((new StringBuilder()).append(li$cil$oc$Settings$$prefix()).append("version").toString()) ? config.getString((new StringBuilder()).append(li$cil$oc$Settings$$prefix()).append("version").toString()) : "0.0.0");
/* 620 */     ObjectRef patched = ObjectRef.create(config);
/* 621 */     if (configVersion.compareTo(mod.getProcessedVersion()) != 0) {
/* 622 */       (new String[3])[0] = "Updating config from version '"; (new String[3])[1] = "' to '"; (new String[3])[2] = "'."; OpenComputers$.MODULE$.log().info((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { configVersion.getVersionString(), defaults.getString((new StringBuilder()).append(li$cil$oc$Settings$$prefix()).append("version").toString()) })));
/* 623 */       patched.elem = ((Config)patched.elem).withValue((new StringBuilder()).append(li$cil$oc$Settings$$prefix()).append("version").toString(), defaults.getValue((new StringBuilder()).append(li$cil$oc$Settings$$prefix()).append("version").toString()));
/* 624 */       scala.Predef$.MODULE$.refArrayOps((Object[])configPatches()).withFilter((Function1)new Settings$$anonfun$patchConfig$1()).withFilter((Function1)new Settings$$anonfun$patchConfig$2(configVersion)).foreach((Function1)new Settings$$anonfun$patchConfig$3(defaults, patched));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 638 */       if (fileringRulesPatchVersion().containsVersion((ArtifactVersion)configVersion)) {
/* 639 */         ConfigValue configValue; (new String[1])[0] = "=> Migrating Internet Card filtering rules. "; OpenComputers$.MODULE$.log().info((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[1]))).s((Seq)scala.collection.immutable.Nil$.MODULE$));
/* 640 */         Regex cidrPattern = (new StringOps(scala.Predef$.MODULE$.augmentString("(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})(?:/(\\d{1,2}))"))).r();
/* 641 */         List httpHostWhitelist = ((Config)patched.elem).getStringList((new StringBuilder()).append(li$cil$oc$Settings$$prefix()).append("internet.whitelist").toString());
/* 642 */         List httpHostBlacklist = ((Config)patched.elem).getStringList((new StringBuilder()).append(li$cil$oc$Settings$$prefix()).append("internet.blacklist").toString());
/* 643 */         MutableList internetFilteringRules = (MutableList)scala.collection.mutable.MutableList$.MODULE$.apply((Seq)scala.collection.immutable.Nil$.MODULE$);
/* 644 */         scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(httpHostBlacklist).foreach((Function1)new Settings$$anonfun$patchConfig$4(cidrPattern, internetFilteringRules));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 651 */         scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(httpHostWhitelist).foreach((Function1)new Settings$$anonfun$patchConfig$5(cidrPattern, internetFilteringRules));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 658 */         httpHostWhitelist.isEmpty() ? BoxedUnit.UNIT : 
/* 659 */           internetFilteringRules.$plus$eq("deny all");
/*     */         
/* 661 */         scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(defaults.getStringList((new StringBuilder()).append(li$cil$oc$Settings$$prefix()).append("internet.filteringRules").toString())).foreach((Function1)new Settings$$anonfun$patchConfig$6(internetFilteringRules));
/*     */ 
/*     */         
/* 664 */         ConfigList configList = ConfigValueFactory.fromIterable((Iterable)scala.collection.JavaConverters$.MODULE$.mutableSeqAsJavaListConverter((Seq)internetFilteringRules).asJava());
/*     */         
/*     */         try {
/* 667 */           (new String[2])[0] = "internet.whitelist"; (new String[2])[1] = "internet.blacklist"; scala.collection.immutable.List$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2])).foreach((Function1)new Settings$$anonfun$patchConfig$7(patched));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 679 */           configValue = OpenComputersConfigCommentManipulationHook.setComments(
/* 680 */               (ConfigValue)configList, defaults.getValue((new StringBuilder()).append(li$cil$oc$Settings$$prefix()).append("internet.filteringRules").toString()).origin().comments());
/*     */         } finally {}
/*     */ 
/*     */ 
/*     */         
/* 685 */         patched.elem = ((Config)patched.elem).withValue((new StringBuilder()).append(li$cil$oc$Settings$$prefix()).append("internet.filteringRules").toString(), configValue);
/*     */       } 
/*     */     } 
/* 688 */     return (Config)patched.elem; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Settings$$anonfun$patchConfig$5
/*     */     extends AbstractFunction1<String, MutableList<String>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */ 
/*     */     
/*     */     private final Regex cidrPattern$1;
/*     */ 
/*     */     
/*     */     private final MutableList internetFilteringRules$1;
/*     */ 
/*     */ 
/*     */     
/*     */     public Settings$$anonfun$patchConfig$5(Regex cidrPattern$1, MutableList internetFilteringRules$1) {}
/*     */ 
/*     */ 
/*     */     
/*     */     public final MutableList<String> apply(String allowedAddress) {
/*     */       return this.cidrPattern$1.findFirstIn(allowedAddress).isDefined() ? this.internetFilteringRules$1.$plus$eq((new StringBuilder()).append("allow ip:").append(allowedAddress).toString()) : this.internetFilteringRules$1.$plus$eq((new StringBuilder()).append("allow domain:").append(allowedAddress).toString());
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final class Settings$$anonfun$patchConfig$6
/*     */     extends AbstractFunction1<String, MutableList<String>>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final MutableList internetFilteringRules$1;
/*     */ 
/*     */     
/*     */     public Settings$$anonfun$patchConfig$6(MutableList internetFilteringRules$1) {}
/*     */ 
/*     */     
/*     */     public final MutableList<String> apply(String defaultRule) {
/*     */       return this.internetFilteringRules$1.$plus$eq(defaultRule);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public final class Settings$$anonfun$patchConfig$7
/*     */     extends AbstractFunction1<String, BoxedUnit>
/*     */     implements Serializable
/*     */   {
/*     */     public static final long serialVersionUID = 0L;
/*     */     
/*     */     private final ObjectRef patched$1;
/*     */ 
/*     */     
/*     */     public Settings$$anonfun$patchConfig$7(ObjectRef patched$1) {}
/*     */ 
/*     */     
/*     */     public final void apply(String key) {
/*     */       if (((Config)this.patched$1.elem).hasPath((new StringBuilder()).append(Settings$.MODULE$.li$cil$oc$Settings$$prefix()).append(key).toString())) {
/*     */         ConfigValue originalValue = ((Config)this.patched$1.elem).getValue((new StringBuilder()).append(Settings$.MODULE$.li$cil$oc$Settings$$prefix()).append(key).toString());
/*     */         ConfigList configList = ConfigValueFactory.fromIterable(new ArrayList(), originalValue.origin().description());
/*     */         (new String[3])[0] = "No longer used! See internet.filteringRules.";
/*     */         (new String[3])[1] = "";
/*     */         (new String[3])[2] = "Previous contents:";
/*     */         MutableList comments = (MutableList)scala.collection.mutable.MutableList$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]));
/*     */         scala.collection.convert.WrapAsScala$.MODULE$.asScalaBuffer(((Config)this.patched$1.elem).getStringList((new StringBuilder()).append(Settings$.MODULE$.li$cil$oc$Settings$$prefix()).append(key).toString())).foreach((Function1)new Settings$$anonfun$patchConfig$7$$anonfun$apply$3(this, comments));
/*     */         ConfigValue configValue1 = OpenComputersConfigCommentManipulationHook.setComments((ConfigValue)configList, (List)scala.collection.JavaConverters$.MODULE$.mutableSeqAsJavaListConverter((Seq)comments).asJava());
/*     */         this.patched$1.elem = ((Config)this.patched$1.elem).withValue((new StringBuilder()).append(Settings$.MODULE$.li$cil$oc$Settings$$prefix()).append(key).toString(), configValue1);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public final class Settings$$anonfun$patchConfig$7$$anonfun$apply$3
/*     */       extends AbstractFunction1<String, MutableList<String>>
/*     */       implements Serializable
/*     */     {
/*     */       public static final long serialVersionUID = 0L;
/*     */       
/*     */       private final MutableList comments$1;
/*     */ 
/*     */       
/*     */       public Settings$$anonfun$patchConfig$7$$anonfun$apply$3(Settings$$anonfun$patchConfig$7 $outer, MutableList comments$1) {}
/*     */ 
/*     */       
/*     */       public final MutableList<String> apply(String value) {
/*     */         return this.comments$1.$plus$eq((new StringBuilder()).append("\"").append(value).append("\"").toString());
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public Option<List<Integer>> getIntList$default$3() {
/* 783 */     return (Option<List<Integer>>)scala.None$.MODULE$; }
/* 784 */   public List<Integer> getIntList(Config config, String path, Option default) { return config.hasPath(path) ? 
/* 785 */       config.getIntList(path) : 
/*     */       
/* 787 */       (List<Integer>)default.getOrElse((Function0)new Settings$$anonfun$getIntList$1()); } public final class Settings$$anonfun$getIntList$1 extends AbstractFunction0<LinkedList<Integer>> implements Serializable { public static final long serialVersionUID = 0L; public final LinkedList<Integer> apply() { return new LinkedList<>(); }
/*     */      }
/*     */   private Settings$() {
/* 790 */     MODULE$ = this;
/*     */     this.resourceDomain = "opencomputers";
/*     */     this.namespace = "oc:";
/*     */     this.savePath = "opencomputers/";
/*     */     this.scriptPath = (new StringBuilder()).append("/assets/").append(resourceDomain()).append("/lua/").toString();
/*     */     (new Tuple2[3])[0] = (Tuple2)new Tuple2.mcII.sp(50, 16);
/*     */     (new Tuple2[3])[1] = (Tuple2)new Tuple2.mcII.sp(80, 25);
/*     */     (new Tuple2[3])[2] = (Tuple2)new Tuple2.mcII.sp(160, 50);
/*     */     this.screenResolutionsByTier = (Tuple2<Object, Object>[])new Tuple2[3];
/*     */     (new TextBuffer.ColorDepth[3])[0] = TextBuffer.ColorDepth.OneBit;
/*     */     (new TextBuffer.ColorDepth[3])[1] = TextBuffer.ColorDepth.FourBit;
/*     */     (new TextBuffer.ColorDepth[3])[2] = TextBuffer.ColorDepth.EightBit;
/*     */     this.screenDepthsByTier = new TextBuffer.ColorDepth[3];
/*     */     this.deviceComplexityByTier = new int[] { 12, 24, 32, 9001 };
/*     */     this.rTreeDebugRenderer = false;
/*     */     this.blockRenderId = -1;
/*     */     (new String[2])[0] = "internet.blacklist";
/*     */     (new String[2])[1] = "internet.whitelist";
/*     */     this.forbiddenConfigLists = scala.collection.immutable.List$.MODULE$.apply((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]));
/*     */     this.li$cil$oc$Settings$$prefix = "opencomputers.";
/*     */     (new String[1])[0] = "misc.geolyzerNoise";
/*     */     (new Tuple2[5])[0] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(VersionRange.createFromVersionSpec("[0.0, 1.4.7)")), new String[1]);
/*     */     (new String[6])[0] = "power.value.AppliedEnergistics2";
/*     */     (new String[6])[1] = "power.value.Factorization";
/*     */     (new String[6])[2] = "power.value.Galacticraft";
/*     */     (new String[6])[3] = "power.value.IndustrialCraft2";
/*     */     (new String[6])[4] = "power.value.Mekanism";
/*     */     (new String[6])[5] = "power.value.RedstoneFlux";
/*     */     (new Tuple2[5])[1] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(VersionRange.createFromVersionSpec("[0.0, 1.4.8)")), new String[6]);
/*     */     (new String[1])[0] = "switch.relayDelayUpgrade";
/*     */     (new Tuple2[5])[2] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(VersionRange.createFromVersionSpec("[0.0, 1.5.20)")), new String[1]);
/*     */     (new String[4])[0] = "power.cost.wirelessCostPerRange";
/*     */     (new String[4])[1] = "misc.maxWirelessRange";
/*     */     (new String[4])[2] = "misc.maxOpenPorts";
/*     */     (new String[4])[3] = "computer.cpuComponentCount";
/*     */     (new Tuple2[5])[3] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(VersionRange.createFromVersionSpec("[0.0, 1.7.2)")), new String[4]);
/*     */     (new String[1])[0] = "computer.robot.limitFlightHeight";
/*     */     (new Tuple2[5])[4] = scala.Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(scala.Predef$.MODULE$.ArrowAssoc(VersionRange.createFromVersionSpec("[0.0, 1.8.0)")), new String[1]);
/*     */     this.configPatches = (Tuple2<VersionRange, String[]>[])new Tuple2[5];
/*     */     this.fileringRulesPatchVersion = VersionRange.createFromVersionSpec("[0.0, 1.8.3)");
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\Settings$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */