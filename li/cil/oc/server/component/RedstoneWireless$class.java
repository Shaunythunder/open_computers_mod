/*     */ package li.cil.oc.server.component;
/*     */ 
/*     */ import codechicken.lib.vec.Vector3;
/*     */ import cpw.mods.fml.common.Optional.Method;
/*     */ import java.util.Map;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.machine.Arguments;
/*     */ import li.cil.oc.api.machine.Callback;
/*     */ import li.cil.oc.api.machine.Context;
/*     */ import li.cil.oc.api.network.Component;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.common.EventHandler$;
/*     */ import li.cil.oc.common.tileentity.traits.RedstoneChangedEventArgs;
/*     */ import li.cil.oc.common.tileentity.traits.RedstoneChangedEventArgs$;
/*     */ import li.cil.oc.integration.util.WirelessRedstone$;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$ArrowAssoc$;
/*     */ import scala.collection.Map;
/*     */ import scala.collection.Seq;
/*     */ import scala.collection.convert.WrapAsJava$;
/*     */ import scala.collection.immutable.Map;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ import scala.runtime.Null$;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class RedstoneWireless$class
/*     */ {
/*     */   public static void $init$(RedstoneWireless $this) {
/*  33 */     $this.wirelessFrequency_$eq(0);
/*     */     
/*  35 */     $this.wirelessInput_$eq(false);
/*     */     
/*  37 */     $this.wirelessOutput_$eq(false);
/*     */   }
/*     */   
/*     */   public static final Map li$cil$oc$server$component$RedstoneWireless$$deviceInfo(RedstoneWireless $this) {
/*  41 */     (new scala.Tuple2[6])[0] = Predef$ArrowAssoc$.MODULE$
/*  42 */       .$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("class"), "communication");
/*  43 */     (new scala.Tuple2[6])[1] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("description"), "Wireless redstone controller");
/*  44 */     (new scala.Tuple2[6])[2] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("vendor"), "MightyPirates GmbH & Co. KG");
/*  45 */     (new scala.Tuple2[6])[3] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("product"), "Rw400-M");
/*  46 */     (new scala.Tuple2[6])[4] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("capacity"), "1");
/*  47 */     (new scala.Tuple2[6])[5] = Predef$ArrowAssoc$.MODULE$.$minus$greater$extension(Predef$.MODULE$.ArrowAssoc("width"), "1");
/*     */     return (Map)Predef$.MODULE$.Map().apply((Seq)Predef$.MODULE$.wrapRefArray((Object[])new scala.Tuple2[6]));
/*     */   } public static Map getDeviceInfo(RedstoneWireless $this) {
/*  50 */     return WrapAsJava$.MODULE$.mapAsJavaMap((Map)$this.li$cil$oc$server$component$RedstoneWireless$$deviceInfo());
/*     */   }
/*     */ 
/*     */   
/*     */   @Callback(doc = "function():number -- Get the wireless redstone input.")
/*     */   public static Object[] getWirelessInput(RedstoneWireless $this, Context context, Arguments args) {
/*  56 */     $this.wirelessInput_$eq(WirelessRedstone$.MODULE$.getInput($this));
/*  57 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean($this.wirelessInput()) }));
/*     */   }
/*     */   @Callback(direct = true, doc = "function():boolean -- Get the wireless redstone output.")
/*     */   public static Object[] getWirelessOutput(RedstoneWireless $this, Context context, Arguments args) {
/*  61 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean($this.wirelessOutput()) }));
/*     */   }
/*     */   @Callback(doc = "function(value:boolean):boolean -- Set the wireless redstone output.")
/*     */   public static Object[] setWirelessOutput(RedstoneWireless $this, Context context, Arguments args) {
/*  65 */     boolean oldValue = $this.wirelessOutput();
/*  66 */     boolean newValue = args.checkBoolean(0);
/*     */ 
/*     */     
/*  69 */     $this.wirelessOutput_$eq(newValue);
/*     */     
/*  71 */     WirelessRedstone$.MODULE$.updateOutput($this);
/*     */     
/*  73 */     (oldValue != newValue) ? ((Settings$.MODULE$.get().redstoneDelay() > false) ? 
/*  74 */       BoxesRunTime.boxToBoolean(context.pause(Settings$.MODULE$.get().redstoneDelay())) : BoxedUnit.UNIT) : BoxedUnit.UNIT;
/*     */ 
/*     */     
/*  77 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToBoolean(oldValue) }));
/*     */   }
/*     */   @Callback(direct = true, doc = "function():number -- Get the currently set wireless redstone frequency.")
/*     */   public static Object[] getWirelessFrequency(RedstoneWireless $this, Context context, Arguments args) {
/*  81 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger($this.wirelessFrequency()) }));
/*     */   }
/*     */   @Callback(doc = "function(frequency:number):number -- Set the wireless redstone frequency to use.")
/*     */   public static Object[] setWirelessFrequency(RedstoneWireless $this, Context context, Arguments args) {
/*  85 */     int oldValue = $this.wirelessFrequency();
/*  86 */     int newValue = args.checkInteger(0);
/*     */ 
/*     */     
/*  89 */     WirelessRedstone$.MODULE$.removeReceiver($this);
/*  90 */     WirelessRedstone$.MODULE$.removeTransmitter($this);
/*     */     
/*  92 */     $this.wirelessFrequency_$eq(newValue);
/*  93 */     $this.wirelessInput_$eq(false);
/*  94 */     $this.wirelessOutput_$eq(false);
/*     */     
/*  96 */     WirelessRedstone$.MODULE$.addReceiver($this);
/*     */     
/*  98 */     (oldValue != newValue) ? BoxesRunTime.boxToBoolean(context.pause(0.5D)) : BoxedUnit.UNIT;
/*     */ 
/*     */     
/* 101 */     return package$.MODULE$.result((Seq<Object>)Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToInteger(oldValue) }));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Method(modid = "WR-CBE|Core")
/*     */   public static void updateDevice(RedstoneWireless $this, int frequency, boolean on) {
/* 108 */     if (frequency == $this.wirelessFrequency() && on != $this.wirelessInput()) {
/* 109 */       $this.wirelessInput_$eq(on);
/* 110 */       $this.onRedstoneChanged(new RedstoneChangedEventArgs(ForgeDirection.UNKNOWN, on ? 0 : 1, on ? 1 : 0, RedstoneChangedEventArgs$.MODULE$.apply$default$4()));
/*     */     } 
/*     */   }
/*     */   @Method(modid = "WR-CBE|Core")
/*     */   public static Vector3 getPosition(RedstoneWireless $this) {
/* 115 */     return new Vector3($this.redstone().xPosition(), $this.redstone().yPosition(), $this.redstone().zPosition());
/*     */   } @Method(modid = "WR-CBE|Core")
/*     */   public static int getDimension(RedstoneWireless $this) {
/* 118 */     return ($this.redstone().world()).field_73011_w.field_76574_g;
/*     */   } @Method(modid = "WR-CBE|Core")
/*     */   public static int getFreq(RedstoneWireless $this) {
/* 121 */     return $this.wirelessFrequency();
/*     */   } @Method(modid = "WR-CBE|Core")
/*     */   public static Null$ getAttachedEntity(RedstoneWireless $this) {
/* 124 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void onConnect(RedstoneWireless $this, Node node) {
/* 129 */     $this.li$cil$oc$server$component$RedstoneWireless$$super$onConnect(node);
/* 130 */     Component component = $this.node(); if (node == null) { if (component != null) return;  } else { if (node.equals(component))
/* 131 */       { EventHandler$.MODULE$.scheduleWirelessRedstone($this); return; }  return; }  EventHandler$.MODULE$.scheduleWirelessRedstone($this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void onDisconnect(RedstoneWireless $this, Node node) {
/* 136 */     $this.li$cil$oc$server$component$RedstoneWireless$$super$onDisconnect(node);
/* 137 */     Component component = $this.node(); if (node == null) { if (component != null) return;  } else { if (node.equals(component))
/* 138 */       { WirelessRedstone$.MODULE$.removeReceiver($this);
/* 139 */         WirelessRedstone$.MODULE$.removeTransmitter($this);
/* 140 */         $this.wirelessOutput_$eq(false);
/* 141 */         $this.wirelessFrequency_$eq(0); return; }  return; }  WirelessRedstone$.MODULE$.removeReceiver($this); WirelessRedstone$.MODULE$.removeTransmitter($this); $this.wirelessOutput_$eq(false); $this.wirelessFrequency_$eq(0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void load(RedstoneWireless $this, NBTTagCompound nbt) {
/* 148 */     $this.li$cil$oc$server$component$RedstoneWireless$$super$load(nbt);
/* 149 */     $this.wirelessFrequency_$eq(nbt.func_74762_e("wirelessFrequency"));
/* 150 */     $this.wirelessInput_$eq(nbt.func_74767_n("wirelessInput"));
/* 151 */     $this.wirelessOutput_$eq(nbt.func_74767_n("wirelessOutput"));
/*     */   }
/*     */   
/*     */   public static void save(RedstoneWireless $this, NBTTagCompound nbt) {
/* 155 */     $this.li$cil$oc$server$component$RedstoneWireless$$super$save(nbt);
/* 156 */     nbt.func_74768_a("wirelessFrequency", $this.wirelessFrequency());
/* 157 */     nbt.func_74757_a("wirelessInput", $this.wirelessInput());
/* 158 */     nbt.func_74757_a("wirelessOutput", $this.wirelessOutput());
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\component\RedstoneWireless$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */