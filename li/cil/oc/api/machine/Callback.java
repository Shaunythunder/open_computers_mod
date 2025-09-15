package li.cil.oc.api.machine;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Callback {
  String value() default "";
  
  boolean direct() default false;
  
  int limit() default 2147483647;
  
  String doc() default "";
  
  boolean getter() default false;
  
  boolean setter() default false;
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\machine\Callback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */