/*     */ package li.cil.oc.server.machine.luac;
/*     */ 
/*     */ import com.google.common.base.Strings;
/*     */ import com.google.common.io.PatternFilenameFilter;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FilenameFilter;
/*     */ import java.net.URL;
/*     */ import java.util.regex.Pattern;
/*     */ import li.cil.oc.server.machine.Machine;
/*     */ import li.cil.repack.com.naef.jnlua.LuaState;
/*     */ import li.cil.repack.com.naef.jnlua.LuaStateFiveFour;
/*     */ import li.cil.repack.com.naef.jnlua.LuaStateFiveThree;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import org.apache.commons.lang3.SystemUtils;
/*     */ import scala.Function0;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.Serializable;
/*     */ import scala.StringContext;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ScalaSignature;
/*     */ import scala.runtime.AbstractFunction0;
/*     */ import scala.runtime.AbstractFunction1;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.ObjectRef;
/*     */ import scala.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005%x!B\001\003\021\003y\021a\004'vCN#\030\r^3GC\016$xN]=\013\005\r!\021\001\0027vC\016T!!\002\004\002\0175\f7\r[5oK*\021q\001C\001\007g\026\024h/\032:\013\005%Q\021AA8d\025\tYA\"A\002dS2T\021!D\001\003Y&\034\001\001\005\002\021#5\t!AB\003\023\005!\0051CA\bMk\006\034F/\031;f\r\006\034Go\034:z'\t\tB\003\005\002\02615\taCC\001\030\003\025\0318-\0317b\023\tIbC\001\004B]f\024VM\032\005\0067E!\t\001H\001\007y%t\027\016\036 \025\003=AQAH\t\005\002}\t1\"[:Bm\006LG.\0312mKV\t\001\005\005\002\026C%\021!E\006\002\b\005>|G.Z1o\021\025!\023\003\"\001 \0035aW/\0316SKF,Xm\035;fI\")a%\005C\001?\005Y\021N\\2mk\022,G*^1K\021\025A\023\003\"\001 \003%Ign\0317vI\026,$\007C\003+#\021\005q$A\005j]\016dW\017Z36g!)A&\005C\001?\005I\021N\\2mk\022,W\007\016\005\006]E!\taH\001\nI\0264\027-\0367ukMBQ\001M\t\005\002E\nab]3u\t\0264\027-\0367u\003J\034\007\016\006\0023yA\0211GO\007\002i)\021QGN\001\005SR,WN\003\0028q\005IQ.\0338fGJ\fg\r\036\006\002s\005\031a.\032;\n\005m\"$!C%uK6\034F/Y2l\021\025it\0061\0013\003\025\031H/Y2l\017\025y\024\003#\001A\003\025aU/Y\0333!\t\t%)D\001\022\r\025\031\025\003#\001E\005\025aU/Y\0333'\t\021U\t\005\002\021\r\032)!CAA\001\017N\021a\t\006\005\0067\031#\t!\023\013\002\013\")1J\022D\001\031\0069a/\032:tS>tW#A'\021\0059\013fBA\013P\023\t\001f#\001\004Qe\026$WMZ\005\003%N\023aa\025;sS:<'B\001)\027\021\035)f\t1A\005\n}\t\021\003[1wK:\013G/\033<f\031&\024'/\031:z\021\0359f\t1A\005\na\013Q\003[1wK:\013G/\033<f\031&\024'/\031:z?\022*\027\017\006\002Z9B\021QCW\005\0037Z\021A!\0268ji\"9QLVA\001\002\004\001\023a\001=%c!1qL\022Q!\n\001\n!\003[1wK:\013G/\033<f\031&\024'/\031:zA!9\021M\022a\001\n\023\021\027AC2veJ,g\016\036'jEV\t1\r\005\002eS6\tQM\003\002gO\006!A.\0318h\025\005A\027\001\0026bm\006L!AU3\t\017-4\005\031!C\005Y\006q1-\036:sK:$H*\0332`I\025\fHCA-n\021\035i&.!AA\002\rDaa\034$!B\023\031\027aC2veJ,g\016\036'jE\002Bq!\035$C\002\023%!-A\006mS\n\024\030M]=OC6,\007BB:GA\003%1-\001\007mS\n\024\030M]=OC6,\007\005C\003v\r\032Ea/\001\004de\026\fG/\032\013\004o\006\035\001c\001=\002\0045\t\021P\003\002{w\006)!N\0347vC*\021A0`\001\005]\006,gM\003\002\006\0311m\\7\013\007\005\005!\"\001\004sKB\f7m[\005\004\003\013I(\001\003'vCN#\030\r^3\t\023\005%A\017%AA\002\005-\021!C7bq6+Wn\034:z!\025)\022QBA\t\023\r\tyA\006\002\007\037B$\030n\0348\021\007U\t\031\"C\002\002\026Y\0211!\0238u\021\035\tIB\022D\t\0037\t\001b\0349f]2K'm\035\013\0043\006u\001bBA\020\003/\001\ra^\001\006gR\fG/\032\005\006=\031#\ta\b\005\b\003K1E\021AA\024\003\021Ig.\033;\025\003eCq!a\013G\t\003\ti#A\006de\026\fG/Z*uCR,GCAA\030!\021)\022QB<\b\017\005Mb\t#\001\0026\005a\021I]2iSR,7\r^;sKB!\021qGA\035\033\0051eaBA\036\r\"\005\021Q\b\002\r\003J\034\007.\033;fGR,(/Z\n\004\003s!\002bB\016\002:\021\005\021\021\t\013\003\003kA\021\"!\022\002:\t\007I\021\0012\002\017=\033v,\021*D\021\"A\021\021JA\035A\003%1-\001\005P'~\013%k\021%!\021%\ti%!\017C\002\023\005q$A\005J'~{5kX!S\033\"A\021\021KA\035A\003%\001%\001\006J'~{5kX!S\033\002B\021\"!\026\002:\t\007I\021A\020\002\027%\033vlT*`\003Jke\007\016\005\t\0033\nI\004)A\005A\005a\021jU0P'~\013%+\024\0345A!I\021QLA\035\005\004%\taH\001\n\023N{vjU0YqYB\001\"!\031\002:\001\006I\001I\001\013\023N{vjU0YqY\002\003\"CA3\003s\021\r\021\"\001 \003%I5kX(T?b3D\007\003\005\002j\005e\002\025!\003!\003)I5kX(T?b3D\007\t\005\t\003[\nI\004\"\003\002p\005i\021n](T\003J\034\007.T1uG\"$2\001IA9\021\035\t\031(a\033A\0025\013!\"\031:dQB\023XMZ5y\021%\t9HRI\001\n#\tI(\001\tde\026\fG/\032\023eK\032\fW\017\034;%cU\021\0211\020\026\005\003\027\tih\013\002\002\000A!\021\021QAF\033\t\t\031I\003\003\002\006\006\035\025!C;oG\",7m[3e\025\r\tIIF\001\013C:tw\016^1uS>t\027\002BAG\003\007\023\021#\0368dQ\026\0347.\0323WCJL\027M\\2f\021\031Y\"\t\"\001\002\022R\t\001\tC\003L\005\022\005C\n\003\004v\005\022E\023q\023\013\004o\006e\005BCA\005\003+\003\n\0211\001\002\f!9\021\021\004\"\005R\005uEcA-\002 \"9\021qDAN\001\0049xaBAR#!\005\021QU\001\006\031V\fWg\r\t\004\003\006\035faBAU#!\005\0211\026\002\006\031V\fWgM\n\004\003O+\005bB\016\002(\022\005\021q\026\013\003\003KCaaSAT\t\003b\005bB;\002(\022E\023Q\027\013\005\003o\013i\fE\002y\003sK1!a/z\005EaU/Y*uCR,g)\033<f)\"\024X-\032\005\013\003\023\t\031\f%AA\002\005-\001\002CA\r\003O#\t&!1\025\007e\013\031\rC\004\002 \005}\006\031A<\b\017\005\035\027\003#\001\002J\006)A*^16iA\031\021)a3\007\017\0055\027\003#\001\002P\n)A*^16iM\031\0211Z#\t\017m\tY\r\"\001\002TR\021\021\021\032\005\007\027\006-G\021\t'\t\017U\fY\r\"\025\002ZR!\0211\\Aq!\rA\030Q\\\005\004\003?L(\001\005'vCN#\030\r^3GSZ,gi\\;s\021)\tI!a6\021\002\003\007\0211\002\005\t\0033\tY\r\"\025\002fR\031\021,a:\t\017\005}\0211\035a\001o\002")
/*     */ public abstract class LuaStateFactory
/*     */ {
/*     */   public static class Lua52$
/*     */     extends LuaStateFactory
/*     */   {
/*     */     public static final Lua52$ MODULE$;
/*     */     
/*     */     public Lua52$() {
/*  58 */       MODULE$ = this; } public String version() {
/*  59 */       return "52";
/*     */     }
/*  61 */     public LuaState create(Option maxMemory) { return (LuaState)maxMemory.fold((Function0)new LuaStateFactory$Lua52$$anonfun$create$1(), (Function1)new LuaStateFactory$Lua52$$anonfun$create$2()); } public final class LuaStateFactory$Lua52$$anonfun$create$1 extends AbstractFunction0<LuaState> implements Serializable { public static final long serialVersionUID = 0L; public final LuaState apply() { return new LuaState(); } } public final class LuaStateFactory$Lua52$$anonfun$create$2 extends AbstractFunction1<Object, LuaState> implements Serializable { public static final long serialVersionUID = 0L; public final LuaState apply(int x$1) { return new LuaState(x$1); }
/*     */        }
/*     */     public void openLibs(LuaState state) {
/*  64 */       state.openLib(LuaState.Library.BASE);
/*  65 */       state.openLib(LuaState.Library.BIT32);
/*  66 */       state.openLib(LuaState.Library.COROUTINE);
/*  67 */       state.openLib(LuaState.Library.DEBUG);
/*  68 */       state.openLib(LuaState.Library.ERIS);
/*  69 */       state.openLib(LuaState.Library.MATH);
/*  70 */       state.openLib(LuaState.Library.STRING);
/*  71 */       state.openLib(LuaState.Library.TABLE);
/*  72 */       state.pop(8);
/*     */     } }
/*     */   public static class Lua53$ extends LuaStateFactory { public static final Lua53$ MODULE$;
/*     */     
/*  76 */     public Lua53$() { MODULE$ = this; } public String version() {
/*  77 */       return "53";
/*     */     }
/*  79 */     public LuaStateFiveThree create(Option maxMemory) { return (LuaStateFiveThree)maxMemory.fold((Function0)new LuaStateFactory$Lua53$$anonfun$create$3(), (Function1)new LuaStateFactory$Lua53$$anonfun$create$4()); } public final class LuaStateFactory$Lua53$$anonfun$create$3 extends AbstractFunction0<LuaStateFiveThree> implements Serializable { public static final long serialVersionUID = 0L; public final LuaStateFiveThree apply() { return new LuaStateFiveThree(); } } public final class LuaStateFactory$Lua53$$anonfun$create$4 extends AbstractFunction1<Object, LuaStateFiveThree> implements Serializable { public static final long serialVersionUID = 0L; public final LuaStateFiveThree apply(int x$2) { return new LuaStateFiveThree(x$2); }
/*     */        }
/*     */     public void openLibs(LuaState state) {
/*  82 */       state.openLib(LuaState.Library.BASE);
/*  83 */       state.openLib(LuaState.Library.COROUTINE);
/*  84 */       state.openLib(LuaState.Library.DEBUG);
/*  85 */       state.openLib(LuaState.Library.ERIS);
/*  86 */       state.openLib(LuaState.Library.MATH);
/*  87 */       state.openLib(LuaState.Library.STRING);
/*  88 */       state.openLib(LuaState.Library.TABLE);
/*  89 */       state.openLib(LuaState.Library.UTF8);
/*  90 */       state.pop(8);
/*     */     } }
/*     */   public static class Lua54$ extends LuaStateFactory { public static final Lua54$ MODULE$;
/*     */     
/*  94 */     public Lua54$() { MODULE$ = this; } public String version() {
/*  95 */       return "54";
/*     */     }
/*  97 */     public LuaStateFiveFour create(Option maxMemory) { return (LuaStateFiveFour)maxMemory.fold((Function0)new LuaStateFactory$Lua54$$anonfun$create$5(), (Function1)new LuaStateFactory$Lua54$$anonfun$create$6()); } public final class LuaStateFactory$Lua54$$anonfun$create$5 extends AbstractFunction0<LuaStateFiveFour> implements Serializable { public static final long serialVersionUID = 0L; public final LuaStateFiveFour apply() { return new LuaStateFiveFour(); } } public final class LuaStateFactory$Lua54$$anonfun$create$6 extends AbstractFunction1<Object, LuaStateFiveFour> implements Serializable { public static final long serialVersionUID = 0L; public final LuaStateFiveFour apply(int x$3) { return new LuaStateFiveFour(x$3); }
/*     */        }
/*     */     public void openLibs(LuaState state) {
/* 100 */       state.openLib(LuaState.Library.BASE);
/* 101 */       state.openLib(LuaState.Library.COROUTINE);
/* 102 */       state.openLib(LuaState.Library.DEBUG);
/* 103 */       state.openLib(LuaState.Library.ERIS);
/* 104 */       state.openLib(LuaState.Library.MATH);
/* 105 */       state.openLib(LuaState.Library.STRING);
/* 106 */       state.openLib(LuaState.Library.TABLE);
/* 107 */       state.openLib(LuaState.Library.UTF8);
/* 108 */       state.pop(8);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean haveNativeLibrary = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean haveNativeLibrary()
/*     */   {
/* 129 */     return this.haveNativeLibrary; } private void haveNativeLibrary_$eq(boolean x$1) { this.haveNativeLibrary = x$1; }
/*     */   
/* 131 */   private String currentLib = ""; private final String libraryName; private volatile Architecture$ Architecture$module; private String currentLib() { return this.currentLib; } private void currentLib_$eq(String x$1) { this.currentLib = x$1; }
/*     */   
/* 133 */   private String libraryName() { return this.libraryName; }
/* 134 */   public Option<Object> create$default$1() { return (Option<Object>)scala.None$.MODULE$; } public boolean isAvailable() { return haveNativeLibrary(); } public LuaStateFactory() { String libExtension = 
/* 135 */       SystemUtils.IS_OS_MAC ? ".dylib" : (
/* 136 */       SystemUtils.IS_OS_WINDOWS ? ".dll" : 
/* 137 */       ".so");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     String systemName = 
/* 144 */       SystemUtils.IS_OS_FREE_BSD ? "freebsd" : (
/* 145 */       SystemUtils.IS_OS_NET_BSD ? "netbsd" : (
/* 146 */       SystemUtils.IS_OS_OPEN_BSD ? "openbsd" : (
/* 147 */       SystemUtils.IS_OS_SOLARIS ? "solaris" : (
/* 148 */       SystemUtils.IS_OS_LINUX ? "linux" : (
/* 149 */       SystemUtils.IS_OS_MAC ? "darwin" : (
/* 150 */       SystemUtils.IS_OS_WINDOWS ? "windows" : 
/* 151 */       "unknown"))))));
/*     */ 
/*     */     
/* 154 */     String archName = 
/* 155 */       Architecture().IS_OS_ARM64() ? "aarch64" : (
/* 156 */       Architecture().IS_OS_ARM() ? "arm" : (
/* 157 */       Architecture().IS_OS_X64() ? "x86_64" : (
/* 158 */       Architecture().IS_OS_X86() ? "x86" : 
/* 159 */       "unknown")));
/*     */ 
/*     */     
/* 162 */     String platformName = Strings.isNullOrEmpty(li.cil.oc.Settings$.MODULE$.get().forceNativeLibPlatform()) ? (new StringBuilder()).append(systemName).append("-").append(archName).toString() : li.cil.oc.Settings$.MODULE$.get().forceNativeLibPlatform();
/*     */ 
/*     */ 
/*     */     
/* 166 */     this.libraryName = (new StringBuilder()).append("libjnlua").append(version()).append("-").append(platformName).append(libExtension).toString();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 337 */     init();
/*     */     
/* 339 */     if (!haveNativeLibrary())
/* 340 */       li.cil.oc.OpenComputers$.MODULE$.log().warn("Unsupported platform, you won't be able to host games with persistent computers.");  }
/*     */   public void init() { if (libraryName() == null)
/*     */       return;  if (SystemUtils.IS_OS_WINDOWS && !li.cil.oc.Settings$.MODULE$.get().alwaysTryNative()) { if (SystemUtils.IS_OS_WINDOWS_XP) { li.cil.oc.OpenComputers$.MODULE$.log().warn("Sorry, but Windows XP isn't supported. I'm afraid you'll have to use a newer Windows. I very much recommend upgrading your Windows, anyway, since Microsoft has stopped supporting Windows XP in April 2014."); return; }  if (SystemUtils.IS_OS_WINDOWS_2003) { li.cil.oc.OpenComputers$.MODULE$.log().warn("Sorry, but Windows Server 2003 isn't supported. I'm afraid you'll have to use a newer Windows."); return; }  }  ObjectRef tmpLibFile = ObjectRef.create(null); if (!Strings.isNullOrEmpty(li.cil.oc.Settings$.MODULE$.get().forceNativeLibPathFirst())) { File libraryTest = new File(li.cil.oc.Settings$.MODULE$.get().forceNativeLibPathFirst(), libraryName()); if (libraryTest.canRead()) { tmpLibFile.elem = libraryTest; currentLib_$eq(libraryTest.getAbsolutePath()); (new String[2])[0] = "Found forced-path filesystem library "; (new String[2])[1] = "."; li.cil.oc.OpenComputers$.MODULE$.log().info((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { currentLib() }))); } else { (new String[2])[0] = "forceNativeLibPathFirst is set, but "; (new String[2])[1] = " was not found there. Falling back to checking the built-in libraries."; li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { currentLib() }))); }  }  if (currentLib().isEmpty()) { (new String[3])[0] = "/assets/"; (new String[3])[1] = "/lib/"; (new String[3])[2] = ""; URL libraryUrl = Machine.class.getResource((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[3]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { li.cil.oc.Settings$.MODULE$.resourceDomain(), libraryName() }))); if (libraryUrl == null) { (new String[2])[0] = "Native library with name '"; (new String[2])[1] = "' not found."; li.cil.oc.OpenComputers$.MODULE$.log().warn((new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[2]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { libraryName() }))); return; }  (new String[4])[0] = "OpenComputersMod-"; (new String[4])[1] = "-"; (new String[4])[2] = "-"; (new String[4])[3] = ""; String tmpLibName = (new StringContext((Seq)scala.Predef$.MODULE$.wrapRefArray((Object[])new String[4]))).s((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { "1.10.30-GTNH", version(), libraryName() })); String path = System.getProperty("java.io.tmpdir"); String tmpBasePath = li.cil.oc.Settings$.MODULE$.get().nativeInTmpDir() ? ((path == null) ? "" : ((path.endsWith("/") || path.endsWith("\\")) ? path : (new StringBuilder()).append(path).append("/").toString())) : "./"; tmpLibFile.elem = new File((new StringBuilder()).append(tmpBasePath).append(tmpLibName).toString()); if (!li.cil.oc.Settings$.MODULE$.get().nativeInTmpDir()) { File libDir = new File(tmpBasePath); if (libDir.isDirectory())
/*     */           scala.Predef$.MODULE$.refArrayOps((Object[])libDir.listFiles((FilenameFilter)new PatternFilenameFilter((new StringBuilder()).append("^").append(Pattern.quote("OpenComputersMod-")).append(".*").append(Pattern.quote((new StringBuilder()).append("-").append(libraryName()).toString())).append("$").toString()))).foreach((Function1)new LuaStateFactory$$anonfun$init$1(this, tmpLibFile));  }  if (((File)tmpLibFile.elem).exists()) { boolean matching = true; try { BufferedInputStream inCurrent = new BufferedInputStream(libraryUrl.openStream()); BufferedInputStream inExisting = new BufferedInputStream(new FileInputStream((File)tmpLibFile.elem)); int inCurrentByte = 0; int inExistingByte = 0; do { inCurrentByte = inCurrent.read(); inExistingByte = inExisting.read(); if (inCurrentByte == inExistingByte)
/*     */               continue;  matching = false; inCurrentByte = -1; inExistingByte = -1; } while (inCurrentByte != -1 && inExistingByte != -1); inCurrent.close(); inExisting.close(); } finally { null; }  }
/*     */        }
/*     */      }
/*     */   public final class LuaStateFactory$$anonfun$init$1 extends AbstractFunction1<File, Object> implements Serializable {
/* 348 */     public static final long serialVersionUID = 0L; private final ObjectRef tmpLibFile$1; public LuaStateFactory$$anonfun$init$1(LuaStateFactory $outer, ObjectRef tmpLibFile$1) {} public final Object apply(File file) { return (file.compareTo((File)this.tmpLibFile$1.elem) != 0) ? BoxesRunTime.boxToBoolean(file.delete()) : BoxedUnit.UNIT; } } public Option<LuaState> createState() { if (haveNativeLibrary()) { 
/*     */       try {  }
/* 350 */       catch (UnsatisfiedLinkError unsatisfiedLinkError) {  } finally { Exception exception = null; }
/*     */        }
/*     */     else
/*     */     { return (Option<LuaState>)scala.None$.MODULE$; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 440 */     return (Option<LuaState>)scala.None$.MODULE$; } public final class LuaStateFactory$$anonfun$createState$1 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Random random$1; public LuaStateFactory$$anonfun$createState$1(LuaStateFactory $outer, Random random$1) {} public final int apply(LuaState lua) { double u, l, d1, r = this.random$1.nextDouble(); int i = lua.getTop(); switch (i) { default: throw new IllegalArgumentException("wrong number of arguments");case 2: l = lua.checkNumber(1); d1 = lua.checkNumber(2); lua.checkArg(2, (l <= d1), "interval is empty"); lua.pushNumber(scala.math.package$.MODULE$.floor(r * (d1 - l + true)) + l); return 1;case 1: u = lua.checkNumber(1); lua.checkArg(1, (true <= u), "interval is empty"); lua.pushNumber(scala.math.package$.MODULE$.floor(r * u) + true); return 1;case 0: break; }  lua.pushNumber(r); return 1; } } public final class LuaStateFactory$$anonfun$createState$2 extends AbstractFunction1<LuaState, Object> implements Serializable {
/*     */     public static final long serialVersionUID = 0L; private final Random random$1; public LuaStateFactory$$anonfun$createState$2(LuaStateFactory $outer, Random random$1) {}
/*     */     public final int apply(LuaState lua) { this.random$1.setSeed(lua.checkInteger(1)); return 0; } }
/* 444 */   private Architecture$ Architecture$lzycompute() { synchronized (this) { if (this.Architecture$module == null) this.Architecture$module = new Architecture$(this);  null; return this.Architecture$module; }  } public Architecture$ Architecture() { return (this.Architecture$module == null) ? Architecture$lzycompute() : this.Architecture$module; } public static ItemStack setDefaultArch(ItemStack paramItemStack) { return LuaStateFactory$.MODULE$.setDefaultArch(paramItemStack); } public static boolean default53() { return LuaStateFactory$.MODULE$.default53(); } public static boolean include54() { return LuaStateFactory$.MODULE$.include54(); } public static boolean include53() { return LuaStateFactory$.MODULE$.include53(); } public static boolean include52() { return LuaStateFactory$.MODULE$.include52(); } public static boolean includeLuaJ() { return LuaStateFactory$.MODULE$.includeLuaJ(); } public static boolean luajRequested() { return LuaStateFactory$.MODULE$.luajRequested(); } public abstract String version(); public abstract LuaState create(Option<Object> paramOption); public abstract void openLibs(LuaState paramLuaState);
/* 445 */   public class Architecture$ { private final String OS_ARCH = liftedTree1$1(); public String OS_ARCH() { return this.OS_ARCH; } private final String liftedTree1$1() { try {  }
/* 446 */       catch (SecurityException securityException) {} return null; }
/*     */ 
/*     */     
/* 449 */     private final boolean IS_OS_ARM = isOSArchMatch("arm"); public boolean IS_OS_ARM() { return this.IS_OS_ARM; }
/*     */     
/* 451 */     private final boolean IS_OS_ARM64 = isOSArchMatch("aarch64"); public boolean IS_OS_ARM64() { return this.IS_OS_ARM64; }
/*     */     
/* 453 */     private final boolean IS_OS_X86 = (isOSArchMatch("x86") || isOSArchMatch("i386")); public boolean IS_OS_X86() { return this.IS_OS_X86; }
/*     */     
/* 455 */     private final boolean IS_OS_X64 = (isOSArchMatch("x86_64") || isOSArchMatch("amd64")); public boolean IS_OS_X64() { return this.IS_OS_X64; }
/*     */      private boolean isOSArchMatch(String archPrefix) {
/* 457 */       return (OS_ARCH() != null && OS_ARCH().startsWith(archPrefix));
/*     */     }
/*     */     
/*     */     public Architecture$(LuaStateFactory $outer) {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\machine\luac\LuaStateFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */