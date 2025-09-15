/*   */ package li.cil.oc.client.gui.widget;
/*   */ @ScalaSignature(bytes = "\006\001i2Q!\001\002\002\002=\021aaV5eO\026$(BA\002\005\003\0319\030\016Z4fi*\021QAB\001\004OVL'BA\004\t\003\031\031G.[3oi*\021\021BC\001\003_\016T!a\003\007\002\007\rLGNC\001\016\003\ta\027n\001\001\024\005\001\001\002CA\t\025\033\005\021\"\"A\n\002\013M\034\027\r\\1\n\005U\021\"AB!osJ+g\rC\003\030\001\021\005\001$\001\004=S:LGO\020\013\0023A\021!\004A\007\002\005!IA\004\001a\001\002\004%\t!H\001\006_^tWM]\013\002=A\021!dH\005\003A\t\021qbV5eO\026$8i\0348uC&tWM\035\005\nE\001\001\r\0211A\005\002\r\n\021b\\<oKJ|F%Z9\025\005\021:\003CA\t&\023\t1#C\001\003V]&$\bb\002\025\"\003\003\005\rAH\001\004q\022\n\004B\002\026\001A\003&a$\001\004po:,'\017\t\005\006Y\0011\t!L\001\002qV\ta\006\005\002\022_%\021\001G\005\002\004\023:$\b\"\002\032\001\r\003i\023!A=\t\013Q\002a\021A\027\002\013]LG\r\0365\t\013Y\002a\021A\027\002\r!,\027n\0325u\021\025A\004A\"\001:\003\021!'/Y<\025\003\021\002")
/*   */ public abstract class Widget {
/* 4 */   public WidgetContainer owner() { return this.owner; } private WidgetContainer owner; public void owner_$eq(WidgetContainer x$1) { this.owner = x$1; }
/*   */ 
/*   */   
/*   */   public abstract int x();
/*   */   
/*   */   public abstract int y();
/*   */   
/*   */   public abstract int width();
/*   */   
/*   */   public abstract int height();
/*   */   
/*   */   public abstract void draw();
/*   */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\widget\Widget.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */