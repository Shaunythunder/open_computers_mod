/*     */ package li.cil.oc.common.tileentity.traits;
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.EnumSet;
/*     */ import li.cil.oc.Settings$;
/*     */ import li.cil.oc.api.machine.Machine;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.util.StateAware;
/*     */ import li.cil.oc.common.tileentity.RobotProxy;
/*     */ import li.cil.oc.server.agent.Player;
/*     */ import li.cil.oc.util.ExtendedNBT$;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import scala.Array$;
/*     */ import scala.Function1;
/*     */ import scala.Option;
/*     */ import scala.PartialFunction;
/*     */ import scala.Predef$;
/*     */ import scala.Predef$DummyImplicit$;
/*     */ import scala.collection.Iterable;
/*     */ import scala.collection.TraversableOnce;
/*     */ import scala.collection.mutable.StringBuilder;
/*     */ import scala.reflect.ClassTag$;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ public abstract class Computer$class {
/*     */   public static Machine li$cil$oc$common$tileentity$traits$Computer$$_machine(Computer $this) {
/*  29 */     return $this.isServer() ? Machine.create($this) : null;
/*     */   } public static Machine machine(Computer $this) {
/*  31 */     return $this.li$cil$oc$common$tileentity$traits$Computer$$_machine();
/*     */   } public static Node node(Computer $this) {
/*  33 */     return $this.isServer() ? $this.machine().node() : null;
/*     */   } public static void $init$(Computer $this) {
/*  35 */     $this.li$cil$oc$common$tileentity$traits$Computer$$_isRunning_$eq(false);
/*     */ 
/*     */     
/*  38 */     $this.hasErrored_$eq(false);
/*     */     
/*  40 */     $this.li$cil$oc$common$tileentity$traits$Computer$_setter_$li$cil$oc$common$tileentity$traits$Computer$$_users_$eq(Set$.MODULE$.empty());
/*     */   } public static Option runSound(Computer $this) {
/*  42 */     return Option$.MODULE$.apply("computer_running");
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean canInteract(Computer $this, String player) {
/*  47 */     return $this.isServer() ? $this.machine().canInteract(player) : (
/*  48 */       !(Settings$.MODULE$.get().canComputersBeOwned() && !$this.li$cil$oc$common$tileentity$traits$Computer$$_users().isEmpty() && !$this.li$cil$oc$common$tileentity$traits$Computer$$_users().contains(player)));
/*     */   } public static boolean isRunning(Computer $this) {
/*  50 */     return $this.li$cil$oc$common$tileentity$traits$Computer$$_isRunning();
/*     */   } public static void setRunning(Computer $this, boolean value) {
/*  52 */     if (value != $this.li$cil$oc$common$tileentity$traits$Computer$$_isRunning()) {
/*  53 */       $this.li$cil$oc$common$tileentity$traits$Computer$$_isRunning_$eq(value);
/*  54 */       if (value) {
/*  55 */         $this.hasErrored_$eq(false);
/*     */       }
/*  57 */       if ($this.world() != null) {
/*  58 */         $this.world().func_147471_g($this.x(), $this.y(), $this.z());
/*  59 */         if (($this.world()).field_72995_K) {
/*  60 */           $this.runSound().foreach((Function1)new Computer$$anonfun$setRunning$1($this));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public static void setUsers(Computer $this, Iterable list) {
/*  70 */     $this.li$cil$oc$common$tileentity$traits$Computer$$_users().clear();
/*  71 */     $this.li$cil$oc$common$tileentity$traits$Computer$$_users().$plus$plus$eq((TraversableOnce)list);
/*     */   }
/*     */   
/*     */   public static EnumSet getCurrentState(Computer $this) {
/*  75 */     return $this.isRunning() ? EnumSet.<StateAware.State>of(StateAware.State.IsWorking) : 
/*  76 */       EnumSet.<StateAware.State>noneOf(StateAware.State.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public static Iterable internalComponents(Computer $this) {
/*  81 */     return WrapAsJava$.MODULE$.seqAsJavaList((Seq)RichInt$.MODULE$.until$extension0(Predef$.MODULE$.intWrapper(0), $this.func_70302_i_()).collect((PartialFunction)new Computer$$anonfun$internalComponents$1($this), IndexedSeq$.MODULE$.canBuildFrom()));
/*     */   }
/*     */   
/*     */   public static Iterable installedComponents(Computer $this) {
/*  85 */     return (Iterable)Predef$.MODULE$.refArrayOps((Object[])$this.components()).collect((PartialFunction)new Computer$$anonfun$installedComponents$1($this), Array$.MODULE$.fallbackCanBuildFrom(Predef$DummyImplicit$.MODULE$.dummyImplicit()));
/*     */   }
/*     */   
/*     */   public static void onMachineConnect(Computer $this, Node node) {
/*  89 */     $this.onConnect(node);
/*     */   } public static void onMachineDisconnect(Computer $this, Node node) {
/*  91 */     $this.onDisconnect(node);
/*     */   } public static boolean hasAbstractBusCard(Computer $this) {
/*  93 */     return Predef$.MODULE$.refArrayOps((Object[])$this.items()).exists((Function1)new Computer$$anonfun$hasAbstractBusCard$1($this));
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean hasRedstoneCard(Computer $this) {
/*  98 */     return Predef$.MODULE$.refArrayOps((Object[])$this.items()).exists((Function1)new Computer$$anonfun$hasRedstoneCard$1($this));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void updateEntity(Computer $this) {
/* 111 */     if ($this.isServer() && $this.isConnected()) {
/* 112 */       $this.updateComputer();
/*     */       
/* 114 */       boolean running = $this.machine().isRunning();
/* 115 */       boolean errored = !($this.machine().lastError() == null);
/* 116 */       if ($this.li$cil$oc$common$tileentity$traits$Computer$$_isRunning() != running || $this.hasErrored() != errored) {
/* 117 */         $this.li$cil$oc$common$tileentity$traits$Computer$$_isRunning_$eq(running);
/* 118 */         $this.hasErrored_$eq(errored);
/* 119 */         $this.onRunningChanged();
/*     */       } 
/*     */       
/* 122 */       $this.updateComponents();
/*     */     } 
/*     */     
/* 125 */     $this.li$cil$oc$common$tileentity$traits$Computer$$super$updateEntity();
/*     */   }
/*     */   
/*     */   public static void updateComputer(Computer $this) {
/* 129 */     $this.machine().update();
/*     */   }
/*     */   
/*     */   public static void onRunningChanged(Computer $this) {
/* 133 */     $this.func_70296_d();
/* 134 */     PacketSender$.MODULE$.sendComputerState($this);
/*     */   }
/*     */   
/*     */   public static void dispose(Computer $this) {
/* 138 */     $this.li$cil$oc$common$tileentity$traits$Computer$$super$dispose();
/* 139 */     if ($this.machine() != null && !($this instanceof RobotProxy) && !$this.moving()) {
/* 140 */       $this.machine().stop();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void readFromNBTForServer(Computer $this, NBTTagCompound nbt) {
/* 147 */     $this.li$cil$oc$common$tileentity$traits$Computer$$super$readFromNBTForServer(nbt);
/*     */ 
/*     */ 
/*     */     
/* 151 */     Computer computer = $this;
/* 152 */     if (computer instanceof RobotProxy) { RobotProxy robotProxy = (RobotProxy)computer;
/* 153 */       ((TileEntity)robotProxy.robot()).field_145851_c = ((TileEntity)$this).field_145851_c;
/* 154 */       ((TileEntity)robotProxy.robot()).field_145848_d = ((TileEntity)$this).field_145848_d;
/* 155 */       ((TileEntity)robotProxy.robot()).field_145849_e = ((TileEntity)$this).field_145849_e; BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/* 156 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/* 158 */     $this.machine().load(nbt.func_74775_l((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("computer").toString()));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 163 */     $this.setRunning($this.machine().isRunning());
/* 164 */     $this._isOutputEnabled_$eq($this.hasRedstoneCard());
/* 165 */     $this._isAbstractBusAvailable_$eq($this.hasAbstractBusCard());
/*     */   }
/*     */   
/*     */   public static void writeToNBTForServer(Computer $this, NBTTagCompound nbt) {
/* 169 */     $this.li$cil$oc$common$tileentity$traits$Computer$$super$writeToNBTForServer(nbt);
/* 170 */     if ($this.machine() != null)
/* 171 */       if (Waila$.MODULE$.isSavingForTooltip()) {
/*     */         
/* 173 */         if ($this.machine().node().address() != null)
/* 174 */           nbt.func_74778_a((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("address").toString(), $this.machine().node().address()); 
/*     */       } else {
/*     */         Machine machine = $this.machine();
/*     */         ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewCompoundTag((new StringBuilder()).append(Settings$.MODULE$.namespace()).append("computer").toString(), (Function1)new Computer$$anonfun$writeToNBTForServer$1($this, machine));
/*     */       }   } @SideOnly(Side.CLIENT)
/*     */   public static void readFromNBTForClient(Computer $this, NBTTagCompound nbt) {
/* 180 */     $this.li$cil$oc$common$tileentity$traits$Computer$$super$readFromNBTForClient(nbt);
/* 181 */     $this.hasErrored_$eq(nbt.func_74767_n("hasErrored"));
/* 182 */     $this.setRunning(nbt.func_74767_n("isRunning"));
/* 183 */     $this.li$cil$oc$common$tileentity$traits$Computer$$_users().clear();
/* 184 */     $this.li$cil$oc$common$tileentity$traits$Computer$$_users().$plus$plus$eq((TraversableOnce)ExtendedNBT$.MODULE$.extendNBTTagList(nbt.func_150295_c("users", 8)).map((Function1)new Computer$$anonfun$readFromNBTForClient$1($this)));
/* 185 */     if ($this.li$cil$oc$common$tileentity$traits$Computer$$_isRunning()) $this.runSound().foreach((Function1)new Computer$$anonfun$readFromNBTForClient$2($this)); 
/*     */   }
/*     */   
/*     */   public static void writeToNBTForClient(Computer $this, NBTTagCompound nbt) {
/* 189 */     $this.li$cil$oc$common$tileentity$traits$Computer$$super$writeToNBTForClient(nbt);
/* 190 */     nbt.func_74757_a("hasErrored", !($this.machine() == null || $this.machine().lastError() == null));
/* 191 */     nbt.func_74757_a("isRunning", $this.isRunning());
/* 192 */     ExtendedNBT$.MODULE$.extendNBTTagCompound(nbt).setNewTagList("users", (Iterable)Predef$.MODULE$.wrapRefArray((Object[])Predef$.MODULE$.refArrayOps((Object[])$this.machine().users()).map((Function1)new Computer$$anonfun$writeToNBTForClient$1($this), Array$.MODULE$.canBuildFrom(ClassTag$.MODULE$.apply(NBTTagString.class)))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void markDirty(Computer $this) {
/* 198 */     $this.li$cil$oc$common$tileentity$traits$Computer$$super$markDirty();
/* 199 */     if ($this.isServer()) {
/* 200 */       $this.machine().onHostChanged();
/* 201 */       $this.setOutputEnabled($this.hasRedstoneCard());
/* 202 */       $this.isAbstractBusAvailable_$eq($this.hasAbstractBusCard());
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean isUseableByPlayer(Computer $this, EntityPlayer player) {
/* 207 */     if ($this.li$cil$oc$common$tileentity$traits$Computer$$super$isUseableByPlayer(player)) { boolean bool; EntityPlayer entityPlayer = player;
/* 208 */       if (entityPlayer instanceof Player) { Player player1 = (Player)entityPlayer; bool = $this.canInteract(player1.agent().ownerName()); }
/* 209 */       else { bool = $this.canInteract(player.func_70005_c_()); }
/*     */       
/*     */       if (bool); }
/*     */     
/* 213 */     return false; } public static void onRotationChanged(Computer $this) { $this.li$cil$oc$common$tileentity$traits$Computer$$super$onRotationChanged();
/* 214 */     $this.checkRedstoneInputChanged(); }
/*     */ 
/*     */   
/*     */   public static void onRedstoneInputChanged(Computer $this, RedstoneChangedEventArgs args) {
/* 218 */     $this.li$cil$oc$common$tileentity$traits$Computer$$super$onRedstoneInputChanged(args);
/* 219 */     RedstoneChangedEventArgs toLocalArgs = new RedstoneChangedEventArgs($this.toLocal(args.side()), args.oldValue(), args.newValue(), args.color());
/* 220 */     $this.machine().node().sendToNeighbors("redstone.changed", new Object[] { toLocalArgs });
/*     */   }
/*     */ 
/*     */   
/*     */   public static Node[] onAnalyze(Computer $this, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/* 225 */     (new Node[1])[0] = $this.machine().node(); return new Node[1];
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\tileentity\traits\Computer$class.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */