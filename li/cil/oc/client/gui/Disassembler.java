/*    */ package li.cil.oc.client.gui;
/*    */ 
/*    */ import li.cil.oc.client.gui.widget.ProgressBar;
/*    */ import li.cil.oc.common.container.Disassembler;
/*    */ import net.minecraft.entity.player.InventoryPlayer;
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001q3A!\001\002\001\033\taA)[:bgN,WN\0317fe*\0211\001B\001\004OVL'BA\003\007\003\031\031G.[3oi*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\005\001q\001cA\b\021%5\t!!\003\002\022\005\t\031B)\0378b[&\034w)^5D_:$\030-\0338feB\0211\003G\007\002))\021QCF\001\nG>tG/Y5oKJT!a\006\004\002\r\r|W.\\8o\023\t\tA\003\003\005\033\001\t\005\t\025!\003\034\003=\001H.Y=fe&sg/\0328u_JL\bC\001\017&\033\005i\"B\001\020 \003\031\001H.Y=fe*\021\001%I\001\007K:$\030\016^=\013\005\t\032\023!C7j]\026\034'/\0314u\025\005!\023a\0018fi&\021a%\b\002\020\023:4XM\034;pef\004F.Y=fe\"A\001\006\001BC\002\023\005\021&\001\007eSN\f7o]3nE2,'/F\001+!\tYc&D\001-\025\tic#\001\006uS2,WM\034;jifL!!\001\027\t\021A\002!\021!Q\001\n)\nQ\002Z5tCN\034X-\0342mKJ\004\003\"\002\032\001\t\003\031\024A\002\037j]&$h\bF\0025kY\002\"a\004\001\t\013i\t\004\031A\016\t\013!\n\004\031\001\026\t\017a\002!\031!C\001s\005A\001O]8he\026\0348/F\001;!\tYd(D\001=\025\ti$!\001\004xS\022<W\r^\005\003q\0221\002\025:pOJ,7o\035\"be\"1\021\t\001Q\001\ni\n\021\002\035:pOJ,7o\035\021\t\013\r\003A\021\t#\0029\021\024\030m^*fG>tG-\031:z\r>\024Xm\032:pk:$G*Y=feR\031Qi\023)\021\005\031KU\"A$\013\003!\013Qa]2bY\006L!AS$\003\tUs\027\016\036\005\006\031\n\003\r!T\001\007[>,8/\032-\021\005\031s\025BA(H\005\rIe\016\036\005\006#\n\003\r!T\001\007[>,8/Z-\t\013M\003A\021\t+\002?\021\024\030m^$vS\016{g\016^1j]\026\024()Y2lOJ|WO\0343MCf,'\017\006\003F+j[\006\"\002,S\001\0049\026A\0013u!\t1\005,\003\002Z\017\n)a\t\\8bi\")AJ\025a\001\033\")\021K\025a\001\033\002")
/*    */ public class Disassembler extends DynamicGuiContainer<Disassembler> {
/*    */   private final li.cil.oc.common.tileentity.Disassembler disassembler;
/*    */   
/* 11 */   public li.cil.oc.common.tileentity.Disassembler disassembler() { return this.disassembler; } private final ProgressBar progress; public Disassembler(InventoryPlayer playerInventory, li.cil.oc.common.tileentity.Disassembler disassembler) { super(new Disassembler(playerInventory, disassembler));
/* 12 */     this.progress = (ProgressBar)addWidget(new ProgressBar(18, 65)); } public ProgressBar progress() { return this.progress; }
/*    */   
/*    */   public void drawSecondaryForegroundLayer(int mouseX, int mouseY) {
/* 15 */     this.field_146289_q.func_78276_b(
/* 16 */         Localization$.MODULE$.localizeImmediately(disassembler().func_145825_b()), 
/* 17 */         8, 6, 4210752);
/*    */   }
/*    */   
/*    */   public void func_146976_a(float dt, int mouseX, int mouseY) {
/* 21 */     GL11.glColor3f(1.0F, 1.0F, 1.0F);
/* 22 */     this.field_146297_k.field_71446_o.func_110577_a(Textures$.MODULE$.guiDisassembler());
/* 23 */     func_73729_b(this.field_147003_i, this.field_147009_r, 0, 0, this.field_146999_f, this.field_147000_g);
/* 24 */     progress().level_$eq(inventoryContainer().disassemblyProgress() / 100.0D);
/* 25 */     drawWidgets();
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Disassembler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */