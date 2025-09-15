/*    */ package li.cil.oc.server.fs;
/*    */ import li.cil.oc.api.fs.Handle;
/*    */ import li.cil.oc.api.fs.Mode;
/*    */ import net.minecraft.nbt.NBTTagCompound;
/*    */ import net.minecraft.nbt.NBTTagList;
/*    */ import scala.Function0;
/*    */ import scala.Function1;
/*    */ import scala.Option;
/*    */ import scala.Predef$;
/*    */ import scala.Some;
/*    */ import scala.runtime.BoxesRunTime;
/*    */ 
/*    */ public abstract class OutputStreamFileSystem$class {
/*    */   public static void $init$(OutputStreamFileSystem $this) {
/* 15 */     $this.li$cil$oc$server$fs$OutputStreamFileSystem$_setter_$li$cil$oc$server$fs$OutputStreamFileSystem$$handles_$eq(Map$.MODULE$.empty());
/*    */   }
/*    */   
/*    */   public static boolean isReadOnly(OutputStreamFileSystem $this) {
/* 19 */     return false;
/*    */   }
/*    */   
/*    */   public static int open(OutputStreamFileSystem $this, String path, Mode mode) {
/* 23 */     synchronized ($this) { int i; Mode mode1 = mode;
/* 24 */       if (Mode.Read.equals(mode1)) { i = $this.li$cil$oc$server$fs$OutputStreamFileSystem$$super$open(path, mode); }
/*    */       else
/* 26 */       { FileSystem$.MODULE$.validatePath(path);
/* 27 */         if ($this.isDirectory(path))
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 35 */           throw new FileNotFoundException(path); }  int handle = BoxesRunTime.unboxToInt(package$.MODULE$.Iterator().continually((Function0)new OutputStreamFileSystem$$anonfun$1($this)).filterNot((Function1)new OutputStreamFileSystem$$anonfun$2($this)).next()); Option<OutputStreamFileSystem.OutputHandle> option = $this.openOutputHandle(handle, path, mode); if (option instanceof Some) { Some some = (Some)option; OutputStreamFileSystem.OutputHandle fileHandle = (OutputStreamFileSystem.OutputHandle)some.x(); $this.li$cil$oc$server$fs$OutputStreamFileSystem$$handles().$plus$eq(Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc(BoxesRunTime.boxToInteger(handle)), fileHandle)); int j = handle; }
/*    */          throw new FileNotFoundException(path); }
/*    */        Integer integer = BoxesRunTime.boxToInteger(i); return BoxesRunTime.unboxToInt(integer); }
/* 38 */      } public static Handle getHandle(OutputStreamFileSystem $this, int handle) { synchronized ($this) { Object object = Option$.MODULE$.apply($this.li$cil$oc$server$fs$OutputStreamFileSystem$$super$getHandle(handle)).orElse((Function0)new OutputStreamFileSystem$$anonfun$getHandle$1($this, handle)).orNull(Predef$.MODULE$.$conforms()); return (Handle)object; }
/*    */      } public static void close(OutputStreamFileSystem $this) {
/* 40 */     synchronized ($this) {
/* 41 */       $this.li$cil$oc$server$fs$OutputStreamFileSystem$$super$close();
/* 42 */       $this.li$cil$oc$server$fs$OutputStreamFileSystem$$handles().values().foreach((Function1)new OutputStreamFileSystem$$anonfun$close$1($this));
/*    */       
/* 44 */       $this.li$cil$oc$server$fs$OutputStreamFileSystem$$handles().clear();
/*    */       return;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void load(OutputStreamFileSystem $this, NBTTagCompound nbt) {
/* 50 */     $this.li$cil$oc$server$fs$OutputStreamFileSystem$$super$load(nbt);
/*    */     
/* 52 */     NBTTagList handlesNbt = nbt.func_150295_c("output", 10); ((IterableLike)RichInt$.MODULE$
/* 53 */       .until$extension0(Predef$.MODULE$.intWrapper(0), handlesNbt.func_74745_c()).map((Function1)new OutputStreamFileSystem$$anonfun$load$1($this, handlesNbt), IndexedSeq$.MODULE$.canBuildFrom())).foreach((Function1)new OutputStreamFileSystem$$anonfun$load$2($this));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void save(OutputStreamFileSystem $this, NBTTagCompound nbt) {
/* 63 */     synchronized ($this) {
/* 64 */       $this.li$cil$oc$server$fs$OutputStreamFileSystem$$super$save(nbt);
/*    */       
/* 66 */       NBTTagList handlesNbt = new NBTTagList();
/* 67 */       $this.li$cil$oc$server$fs$OutputStreamFileSystem$$handles().values().foreach((Function1)new OutputStreamFileSystem$$anonfun$save$1($this, handlesNbt));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 74 */       nbt.func_74782_a("output", (NBTBase)handlesNbt);
/*    */       return;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\fs\OutputStreamFileSystem$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */