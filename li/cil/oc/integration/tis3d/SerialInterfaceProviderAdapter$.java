/*    */ package li.cil.oc.integration.tis3d;
/*    */ 
/*    */ import li.cil.oc.api.internal.Adapter;
/*    */ import li.cil.tis3d.api.ManualAPI;
/*    */ import li.cil.tis3d.api.SerialAPI;
/*    */ import li.cil.tis3d.api.manual.ContentProvider;
/*    */ import li.cil.tis3d.api.prefab.manual.ResourceContentProvider;
/*    */ import li.cil.tis3d.api.serial.SerialInterface;
/*    */ import li.cil.tis3d.api.serial.SerialInterfaceProvider;
/*    */ import li.cil.tis3d.api.serial.SerialProtocolDocumentationReference;
/*    */ import net.minecraft.util.EnumFacing;
/*    */ import net.minecraft.world.World;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class SerialInterfaceProviderAdapter$
/*    */   implements SerialInterfaceProvider
/*    */ {
/*    */   public static final SerialInterfaceProviderAdapter$ MODULE$;
/*    */   
/*    */   private SerialInterfaceProviderAdapter$() {
/* 27 */     MODULE$ = this;
/*    */   } public void init() {
/* 29 */     ManualAPI.addProvider((ContentProvider)new ResourceContentProvider(li.cil.oc.Settings$.MODULE$.resourceDomain(), "doc/tis3d/"));
/* 30 */     SerialAPI.addProvider(this);
/*    */   }
/*    */   public SerialProtocolDocumentationReference getDocumentationReference() {
/* 33 */     return new SerialProtocolDocumentationReference("OpenComputers Adapter", "protocols/opencomputersAdapter.md");
/*    */   } public boolean worksWith(World world, int x, int y, int z, EnumFacing side) {
/* 35 */     return world.func_147438_o(x, y, z) instanceof Adapter;
/*    */   } public SerialInterface interfaceFor(World world, int x, int y, int z, EnumFacing side) {
/* 37 */     return new SerialInterfaceProviderAdapter.SerialInterfaceAdapter((Adapter)world.func_147438_o(x, y, z));
/*    */   }
/*    */   
/*    */   public boolean isValid(World world, int x, int y, int z, EnumFacing side, SerialInterface serialInterface) {
/*    */     // Byte code:
/*    */     //   0: aload #6
/*    */     //   2: astore #7
/*    */     //   4: aload #7
/*    */     //   6: instanceof li/cil/oc/integration/tis3d/SerialInterfaceProviderAdapter$SerialInterfaceAdapter
/*    */     //   9: ifeq -> 68
/*    */     //   12: aload #7
/*    */     //   14: checkcast li/cil/oc/integration/tis3d/SerialInterfaceProviderAdapter$SerialInterfaceAdapter
/*    */     //   17: astore #8
/*    */     //   19: aload #8
/*    */     //   21: invokevirtual tileEntity : ()Lli/cil/oc/api/internal/Adapter;
/*    */     //   24: checkcast net/minecraft/tileentity/TileEntity
/*    */     //   27: aload_1
/*    */     //   28: iload_2
/*    */     //   29: iload_3
/*    */     //   30: iload #4
/*    */     //   32: invokevirtual func_147438_o : (III)Lnet/minecraft/tileentity/TileEntity;
/*    */     //   35: astore #10
/*    */     //   37: dup
/*    */     //   38: ifnonnull -> 50
/*    */     //   41: pop
/*    */     //   42: aload #10
/*    */     //   44: ifnull -> 58
/*    */     //   47: goto -> 62
/*    */     //   50: aload #10
/*    */     //   52: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   55: ifeq -> 62
/*    */     //   58: iconst_1
/*    */     //   59: goto -> 63
/*    */     //   62: iconst_0
/*    */     //   63: istore #9
/*    */     //   65: goto -> 71
/*    */     //   68: iconst_0
/*    */     //   69: istore #9
/*    */     //   71: iload #9
/*    */     //   73: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #39	-> 0
/*    */     //   #40	-> 4
/*    */     //   #41	-> 68
/*    */     //   #39	-> 71
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	74	0	this	Lli/cil/oc/integration/tis3d/SerialInterfaceProviderAdapter$;
/*    */     //   0	74	1	world	Lnet/minecraft/world/World;
/*    */     //   0	74	2	x	I
/*    */     //   0	74	3	y	I
/*    */     //   0	74	4	z	I
/*    */     //   0	74	5	side	Lnet/minecraft/util/EnumFacing;
/*    */     //   0	74	6	serialInterface	Lli/cil/tis3d/api/serial/SerialInterface;
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\integration\tis3d\SerialInterfaceProviderAdapter$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */