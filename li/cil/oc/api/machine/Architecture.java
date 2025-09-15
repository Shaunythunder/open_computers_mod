package li.cil.oc.api.machine;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public interface Architecture {
  boolean isInitialized();
  
  boolean recomputeMemory(Iterable<ItemStack> paramIterable);
  
  boolean initialize();
  
  void close();
  
  void runSynchronized();
  
  ExecutionResult runThreaded(boolean paramBoolean);
  
  void onSignal();
  
  void onConnect();
  
  void load(NBTTagCompound paramNBTTagCompound);
  
  void save(NBTTagCompound paramNBTTagCompound);
  
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.TYPE})
  @Inherited
  public static @interface NoMemoryRequirements {}
  
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.TYPE})
  public static @interface Name {
    String value();
  }
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\machine\Architecture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */