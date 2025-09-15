/*     */ package li.cil.oc.common.item;
/*     */ 
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.api.detail.ItemInfo;
/*     */ import li.cil.oc.api.machine.Machine;
/*     */ import li.cil.oc.api.network.Analyzable;
/*     */ import li.cil.oc.api.network.Component;
/*     */ import li.cil.oc.api.network.Connector;
/*     */ import li.cil.oc.api.network.Environment;
/*     */ import li.cil.oc.api.network.Node;
/*     */ import li.cil.oc.api.network.SidedEnvironment;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.IChatComponent;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.event.entity.player.EntityInteractEvent;
/*     */ import scala.runtime.BoxedUnit;
/*     */ import scala.runtime.BoxesRunTime;
/*     */ 
/*     */ public final class Analyzer$ {
/*     */   public static final Analyzer$ MODULE$;
/*     */   
/*  24 */   private ItemInfo analyzer$lzycompute() { synchronized (this) { if (!this.bitmap$0) { this.analyzer = Items.get("analyzer"); this.bitmap$0 = true; }  return this.analyzer; }  } private ItemInfo analyzer; private volatile boolean bitmap$0; private ItemInfo analyzer() { return this.bitmap$0 ? this.analyzer : analyzer$lzycompute(); }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void onInteract(EntityInteractEvent e) {
/*  28 */     EntityPlayer player = e.entityPlayer;
/*  29 */     ItemStack held = player.func_70694_bm();
/*  30 */     ItemInfo itemInfo = analyzer(); if (Items.get(held) == null) { Items.get(held); if (itemInfo != null) return;  } else { if (Items.get(held).equals(itemInfo))
/*  31 */       { if (analyze(e.target, player, 0, 0.0F, 0.0F, 0.0F))
/*  32 */         { player.func_71038_i();
/*  33 */           e.setCanceled(true); }  return; }  return; }  if (analyze(e.target, player, 0, 0.0F, 0.0F, 0.0F)) { player.func_71038_i(); e.setCanceled(true); }
/*     */   
/*     */   }
/*     */   
/*     */   public boolean analyze(Object thing, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
/*     */     boolean bool;
/*  39 */     World world = player.field_70170_p;
/*  40 */     Object object = thing;
/*  41 */     if (object instanceof Analyzable) { Analyzable analyzable = (Analyzable)object;
/*  42 */       if (!world.field_72995_K) {
/*  43 */         analyzeNodes(analyzable.onAnalyze(player, side, hitX, hitY, hitZ), player);
/*     */       }
/*  45 */       bool = true; }
/*  46 */     else if (object instanceof SidedEnvironment) { SidedEnvironment sidedEnvironment = (SidedEnvironment)object;
/*  47 */       if (!world.field_72995_K) {
/*  48 */         (new Node[1])[0] = sidedEnvironment.sidedNode(ForgeDirection.getOrientation(side)); analyzeNodes(new Node[1], player);
/*     */       } 
/*  50 */       bool = true; }
/*  51 */     else if (object instanceof Environment) { Environment environment = (Environment)object;
/*  52 */       if (!world.field_72995_K) {
/*  53 */         (new Node[1])[0] = environment.node(); analyzeNodes(new Node[1], player);
/*     */       } 
/*  55 */       bool = true; }
/*     */     else
/*  57 */     { bool = false; }
/*     */     
/*     */     return bool;
/*     */   }
/*  61 */   private void analyzeNodes(Node[] nodes, EntityPlayer player) { if (nodes != null) scala.Predef$.MODULE$.refArrayOps((Object[])nodes).withFilter((Function1)new Analyzer$$anonfun$analyzeNodes$1()).foreach((Function1)new Analyzer$$anonfun$analyzeNodes$2(player));  } public final class Analyzer$$anonfun$analyzeNodes$1 extends AbstractFunction1<Node, Object> implements Serializable { public static final long serialVersionUID = 0L; public final boolean apply(Node node) { return !(node == null); } } public final class Analyzer$$anonfun$analyzeNodes$2 extends AbstractFunction1<Node, BoxedUnit> implements Serializable { public static final long serialVersionUID = 0L; private final EntityPlayer player$1; public Analyzer$$anonfun$analyzeNodes$2(EntityPlayer player$1) {} public final void apply(Node node) {
/*  62 */       EntityPlayer entityPlayer = this.player$1;
/*  63 */       if (entityPlayer instanceof net.minecraftforge.common.util.FakePlayer) { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  64 */       else if (entityPlayer instanceof EntityPlayerMP) { EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityPlayer;
/*  65 */         if (node != null) { Environment environment = node.host();
/*  66 */           if (environment instanceof Machine) { Machine machine = (Machine)environment;
/*     */             
/*  68 */             if (machine.lastError() != null) {
/*  69 */               entityPlayerMP.func_145747_a((IChatComponent)li.cil.oc.Localization$Analyzer$.MODULE$.LastError(machine.lastError()));
/*     */             }
/*  71 */             entityPlayerMP.func_145747_a((IChatComponent)li.cil.oc.Localization$Analyzer$.MODULE$.Components(machine.componentCount(), machine.maxComponents()));
/*  72 */             String[] list = machine.users();
/*     */             
/*  74 */             entityPlayerMP.func_145747_a((IChatComponent)li.cil.oc.Localization$Analyzer$.MODULE$.Users((Iterable)scala.Predef$.MODULE$.wrapRefArray((Object[])list))); BoxedUnit boxedUnit1 = (machine == null) ? BoxedUnit.UNIT : (scala.Predef$.MODULE$.refArrayOps((Object[])list).nonEmpty() ? BoxedUnit.UNIT : BoxedUnit.UNIT); }
/*     */           else
/*     */           
/*  77 */           { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */            }
/*  79 */          Node node1 = node;
/*  80 */         if (node1 instanceof Connector) { Connector connector = (Connector)node1;
/*  81 */           if (connector.localBufferSize() > false) {
/*  82 */             double arg$macro$6 = connector.localBuffer(), arg$macro$7 = connector.localBufferSize(); entityPlayerMP.func_145747_a((IChatComponent)li.cil.oc.Localization$Analyzer$.MODULE$.StoredEnergy((new StringOps("%.2f/%.2f")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(arg$macro$6), BoxesRunTime.boxToDouble(arg$macro$7) }))));
/*     */           } 
/*  84 */           double arg$macro$8 = connector.globalBuffer(), arg$macro$9 = connector.globalBufferSize(); entityPlayerMP.func_145747_a((IChatComponent)li.cil.oc.Localization$Analyzer$.MODULE$.TotalEnergy((new StringOps("%.2f/%.2f")).format((Seq)scala.Predef$.MODULE$.genericWrapArray(new Object[] { BoxesRunTime.boxToDouble(arg$macro$8), BoxesRunTime.boxToDouble(arg$macro$9) })))); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  85 */         else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */         
/*  87 */         Node node2 = node;
/*  88 */         if (node2 instanceof Component) { Component component = (Component)node2;
/*  89 */           entityPlayerMP.func_145747_a((IChatComponent)li.cil.oc.Localization$Analyzer$.MODULE$.ComponentName(component.name())); BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*  90 */         else { BoxedUnit boxedUnit1 = BoxedUnit.UNIT; }
/*     */         
/*  92 */         String address = node.address();
/*     */         
/*  94 */         entityPlayerMP.func_145747_a((IChatComponent)li.cil.oc.Localization$Analyzer$.MODULE$.Address(address));
/*  95 */         li.cil.oc.server.PacketSender$.MODULE$.sendAnalyze(address, entityPlayerMP); BoxedUnit boxedUnit = (address == null || address.isEmpty()) ? BoxedUnit.UNIT : BoxedUnit.UNIT; }
/*     */       else
/*  97 */       { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */     
/*     */     } }
/*     */   
/*     */   private Analyzer$() {
/* 102 */     MODULE$ = this;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\item\Analyzer$.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */