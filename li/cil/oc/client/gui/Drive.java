/*    */ package li.cil.oc.client.gui;
/*    */ 
/*    */ 
/*    */ @ScalaSignature(bytes = "\006\001\005ea\001B\001\003\0015\021Q\001\022:jm\026T!a\001\003\002\007\035,\030N\003\002\006\r\00511\r\\5f]RT!a\002\005\002\005=\034'BA\005\013\003\r\031\027\016\034\006\002\027\005\021A.[\002\001'\r\001a\002\007\t\003\037Yi\021\001\005\006\003\007EQ!!\002\n\013\005M!\022!C7j]\026\034'/\0314u\025\005)\022a\0018fi&\021q\003\005\002\n\017VL7k\031:fK:\004\"!\007\017\016\003iQ!a\007\002\002\rQ\024\030-\033;t\023\ti\"D\001\004XS:$wn\036\005\t?\001\021\t\021)A\005A\005y\001\017\\1zKJLeN^3oi>\024\030\020\005\002\"M5\t!E\003\002$I\0051\001\017\\1zKJT!!\n\n\002\r\025tG/\033;z\023\t9#EA\bJ]Z,g\016^8ssBc\027-_3s\021!I\003A!b\001\n\003Q\023A\0033sSZ,7\013^1dWV\t1\006E\002-_Ej\021!\f\006\002]\005)1oY1mC&\021\001'\f\002\n\rVt7\r^5p]B\002\"AM\033\016\003MR!\001\016\n\002\t%$X-\\\005\003mM\022\021\"\023;f[N#\030mY6\t\021a\002!\021!Q\001\n-\n1\002\032:jm\026\034F/Y2lA!)!\b\001C\001w\0051A(\0338jiz\"2\001\020 @!\ti\004!D\001\003\021\025y\022\b1\001!\021\025I\023\b1\001,\021\035\t\005A1A\005B\t\013Ab^5oI><\b*Z5hQR,\022a\021\t\003Y\021K!!R\027\003\007%sG\017\003\004H\001\001\006IaQ\001\016o&tGm\\<IK&<\007\016\036\021\t\013%\003A\021\t&\002\037\t\f7m[4s_VtG-S7bO\026,\022a\023\t\003\031>k\021!\024\006\003\035J\tA!\036;jY&\021\001+\024\002\021%\026\034x.\036:dK2{7-\031;j_:D\021B\025\001A\002\003\007I\021C*\002\0335\fg.Y4fI\n+H\017^8o+\005!\006CA\037V\023\t1&AA\006J[\006<WMQ;ui>t\007\"\003-\001\001\004\005\r\021\"\005Z\003Ei\027M\\1hK\022\024U\017\036;p]~#S-\035\013\0035v\003\"\001L.\n\005qk#\001B+oSRDqAX,\002\002\003\007A+A\002yIEBa\001\031\001!B\023!\026AD7b]\006<W\r\032\"viR|g\016\t\005\nE\002\001\r\0211A\005\022M\013q\"\0368nC:\fw-\0323CkR$xN\034\005\nI\002\001\r\0211A\005\022\025\f1#\0368nC:\fw-\0323CkR$xN\\0%KF$\"A\0274\t\017y\033\027\021!a\001)\"1\001\016\001Q!\nQ\013\001#\0368nC:\fw-\0323CkR$xN\034\021\t\023)\004\001\031!a\001\n#\031\026\001\0047pG.,GMQ;ui>t\007\"\0037\001\001\004\005\r\021\"\005n\003AawnY6fI\n+H\017^8o?\022*\027\017\006\002[]\"9al[A\001\002\004!\006B\0029\001A\003&A+A\007m_\016\\W\r\032\"viR|g\016\t\005\006e\002!\tf]\001\020C\016$\030n\0348QKJ4wN]7fIR\021!\f\036\005\006kF\004\rA^\001\007EV$Ho\0348\021\005=9\030B\001=\021\005%9U/\033\"viR|g\016C\003{\001\021\00510\001\nva\022\fG/\032\"viR|gn\025;bi\026\034H#\001.\t\013u\004A\021I>\002\017%t\027\016^$vS\")q\020\001C!w\006aQ\017\0353bi\026\0346M]3f]\"9\0211\001\001\005B\005\025\021A\0033sC^\0346M]3f]R9!,a\002\002\f\005=\001bBA\005\003\003\001\raQ\001\007[>,8/\032-\t\017\0055\021\021\001a\001\007\0061Qn\\;tKfC\001\"!\005\002\002\001\007\0211C\001\003IR\0042\001LA\013\023\r\t9\"\f\002\006\r2|\027\r\036")
/*    */ public class Drive extends GuiScreen implements Window {
/*    */   private final InventoryPlayer playerInventory;
/*    */   private final Function0<ItemStack> driveStack;
/*    */   private final int windowHeight;
/*    */   private ImageButton managedButton;
/*    */   private ImageButton unmanagedButton;
/*    */   
/* 12 */   public int guiLeft() { return this.guiLeft; } private ImageButton lockedButton; private int guiLeft; private int guiTop; private int xSize; private int ySize; private final int windowWidth; public void guiLeft_$eq(int x$1) { this.guiLeft = x$1; } public int guiTop() { return this.guiTop; } public void guiTop_$eq(int x$1) { this.guiTop = x$1; } public int xSize() { return this.xSize; } public void xSize_$eq(int x$1) { this.xSize = x$1; } public int ySize() { return this.ySize; } public void ySize_$eq(int x$1) { this.ySize = x$1; } public int windowWidth() { return this.windowWidth; } public void li$cil$oc$client$gui$traits$Window$_setter_$windowWidth_$eq(int x$1) { this.windowWidth = x$1; } public void li$cil$oc$client$gui$traits$Window$_setter_$windowHeight_$eq(int x$1) {} public <T> boolean add(List list, Object value) { return Window.class.add(this, list, value); } public boolean func_73868_f() { return Window.class.doesGuiPauseGame(this); } public Function0<ItemStack> driveStack() { return this.driveStack; } public Drive(InventoryPlayer playerInventory, Function0<ItemStack> driveStack) { Window.class.$init$(this);
/* 13 */     this.windowHeight = 120; } public int windowHeight() { return this.windowHeight; }
/*    */    public ResourceLocation backgroundImage() {
/* 15 */     return Textures$.MODULE$.guiDrive();
/*    */   }
/* 17 */   public ImageButton managedButton() { return this.managedButton; } public void managedButton_$eq(ImageButton x$1) { this.managedButton = x$1; }
/* 18 */   public ImageButton unmanagedButton() { return this.unmanagedButton; } public void unmanagedButton_$eq(ImageButton x$1) { this.unmanagedButton = x$1; }
/* 19 */   public ImageButton lockedButton() { return this.lockedButton; } public void lockedButton_$eq(ImageButton x$1) { this.lockedButton = x$1; }
/*    */   
/*    */   public void func_146284_a(GuiButton button) {
/* 22 */     if (button.field_146127_k == 0) {
/* 23 */       PacketSender$.MODULE$.sendDriveMode(false);
/* 24 */       DriveData$.MODULE$.setUnmanaged((ItemStack)driveStack().apply(), false);
/* 25 */     } else if (button.field_146127_k == 1) {
/* 26 */       PacketSender$.MODULE$.sendDriveMode(true);
/* 27 */       DriveData$.MODULE$.setUnmanaged((ItemStack)driveStack().apply(), true);
/* 28 */     } else if (button.field_146127_k == 2) {
/* 29 */       PacketSender$.MODULE$.sendDriveLock();
/* 30 */       DriveData$.MODULE$.lock((ItemStack)driveStack().apply(), this.playerInventory.field_70458_d);
/*    */     } 
/* 32 */     updateButtonStates();
/*    */   }
/*    */   
/*    */   public void updateButtonStates() {
/* 36 */     DriveData data = new DriveData((ItemStack)driveStack().apply());
/* 37 */     unmanagedButton().toggled_$eq(data.isUnmanaged());
/* 38 */     managedButton().toggled_$eq(!unmanagedButton().toggled());
/* 39 */     lockedButton().toggled_$eq(data.isLocked());
/* 40 */     (lockedButton()).field_146124_l = !data.isLocked();
/*    */   }
/*    */   
/*    */   public void func_73866_w_() {
/* 44 */     Window.class.initGui(this);
/* 45 */     int x$1 = 0, x$2 = guiLeft() + 11, x$3 = guiTop() + 11, x$4 = 74, x$5 = 18; ResourceLocation x$6 = Textures$.MODULE$.guiButtonDriveMode(); String x$7 = Localization$Drive$.MODULE$.Managed(); int x$8 = 6324320; boolean x$9 = true; int x$10 = ImageButton$.MODULE$.$lessinit$greater$default$10(), x$11 = ImageButton$.MODULE$.$lessinit$greater$default$11(), x$12 = ImageButton$.MODULE$.$lessinit$greater$default$12(); managedButton_$eq(new ImageButton(x$1, x$2, x$3, x$4, x$5, x$6, x$7, x$9, x$8, x$10, x$11, x$12));
/* 46 */     int x$13 = 1, x$14 = guiLeft() + 91, x$15 = guiTop() + 11, x$16 = 74, x$17 = 18; ResourceLocation x$18 = Textures$.MODULE$.guiButtonDriveMode(); String x$19 = Localization$Drive$.MODULE$.Unmanaged(); int x$20 = 6324320; boolean x$21 = true; int x$22 = ImageButton$.MODULE$.$lessinit$greater$default$10(), x$23 = ImageButton$.MODULE$.$lessinit$greater$default$11(), x$24 = ImageButton$.MODULE$.$lessinit$greater$default$12(); unmanagedButton_$eq(new ImageButton(x$13, x$14, x$15, x$16, x$17, x$18, x$19, x$21, x$20, x$22, x$23, x$24));
/* 47 */     int x$25 = 2, x$26 = guiLeft() + 11, x$27 = guiTop() + windowHeight() - 42, x$28 = 44, x$29 = 18; ResourceLocation x$30 = Textures$.MODULE$.guiButtonDriveMode(); String x$31 = Localization$Drive$.MODULE$.ReadOnlyLock(); int x$32 = 6324320; boolean x$33 = true; int x$34 = ImageButton$.MODULE$.$lessinit$greater$default$10(), x$35 = ImageButton$.MODULE$.$lessinit$greater$default$11(), x$36 = ImageButton$.MODULE$.$lessinit$greater$default$12(); lockedButton_$eq(new ImageButton(x$25, x$26, x$27, x$28, x$29, x$30, x$31, x$33, x$32, x$34, x$35, x$36));
/* 48 */     add(this.field_146292_n, managedButton());
/* 49 */     add(this.field_146292_n, unmanagedButton());
/* 50 */     add(this.field_146292_n, lockedButton());
/* 51 */     updateButtonStates();
/*    */   }
/*    */   
/*    */   public void func_73876_c() {
/* 55 */     super.func_73876_c();
/*    */   }
/*    */   
/*    */   public void func_73863_a(int mouseX, int mouseY, float dt) {
/* 59 */     Window.class.drawScreen(this, mouseX, mouseY, dt);
/* 60 */     this.field_146289_q.func_78279_b(Localization$Drive$.MODULE$.Warning(), guiLeft() + 11, guiTop() + 37, xSize() - 20, 4210752);
/* 61 */     this.field_146289_q.func_78279_b(Localization$Drive$.MODULE$.LockWarning(), guiLeft() + 61, guiTop() + windowHeight() - 48, xSize() - 68, 4210752);
/*    */   }
/*    */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\client\gui\Drive.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */