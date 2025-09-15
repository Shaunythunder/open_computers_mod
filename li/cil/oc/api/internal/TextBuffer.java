/*     */ package li.cil.oc.api.internal;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import li.cil.oc.api.Persistable;
/*     */ import li.cil.oc.api.network.ManagedEnvironment;
/*     */ import net.minecraft.entity.player.EntityPlayer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface TextBuffer
/*     */   extends ManagedEnvironment, Persistable
/*     */ {
/*     */   void setEnergyCostPerTick(double paramDouble);
/*     */   
/*     */   double getEnergyCostPerTick();
/*     */   
/*     */   void setPowerState(boolean paramBoolean);
/*     */   
/*     */   boolean getPowerState();
/*     */   
/*     */   void setMaximumResolution(int paramInt1, int paramInt2);
/*     */   
/*     */   int getMaximumWidth();
/*     */   
/*     */   int getMaximumHeight();
/*     */   
/*     */   void setAspectRatio(double paramDouble1, double paramDouble2);
/*     */   
/*     */   double getAspectRatio();
/*     */   
/*     */   boolean setResolution(int paramInt1, int paramInt2);
/*     */   
/*     */   int getWidth();
/*     */   
/*     */   int getHeight();
/*     */   
/*     */   boolean setViewport(int paramInt1, int paramInt2);
/*     */   
/*     */   int getViewportWidth();
/*     */   
/*     */   int getViewportHeight();
/*     */   
/*     */   void setMaximumColorDepth(ColorDepth paramColorDepth);
/*     */   
/*     */   ColorDepth getMaximumColorDepth();
/*     */   
/*     */   boolean setColorDepth(ColorDepth paramColorDepth);
/*     */   
/*     */   ColorDepth getColorDepth();
/*     */   
/*     */   void setPaletteColor(int paramInt1, int paramInt2);
/*     */   
/*     */   int getPaletteColor(int paramInt);
/*     */   
/*     */   void setForegroundColor(int paramInt);
/*     */   
/*     */   void setForegroundColor(int paramInt, boolean paramBoolean);
/*     */   
/*     */   int getForegroundColor();
/*     */   
/*     */   boolean isForegroundFromPalette();
/*     */   
/*     */   void setBackgroundColor(int paramInt);
/*     */   
/*     */   void setBackgroundColor(int paramInt, boolean paramBoolean);
/*     */   
/*     */   int getBackgroundColor();
/*     */   
/*     */   boolean isBackgroundFromPalette();
/*     */   
/*     */   void copy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
/*     */   
/*     */   @Deprecated
/*     */   void fill(int paramInt1, int paramInt2, int paramInt3, int paramInt4, char paramChar);
/*     */   
/*     */   void fill(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
/*     */   
/*     */   void set(int paramInt1, int paramInt2, String paramString, boolean paramBoolean);
/*     */   
/*     */   @Deprecated
/*     */   char get(int paramInt1, int paramInt2);
/*     */   
/*     */   int getCodePoint(int paramInt1, int paramInt2);
/*     */   
/*     */   int getForegroundColor(int paramInt1, int paramInt2);
/*     */   
/*     */   boolean isForegroundFromPalette(int paramInt1, int paramInt2);
/*     */   
/*     */   int getBackgroundColor(int paramInt1, int paramInt2);
/*     */   
/*     */   boolean isBackgroundFromPalette(int paramInt1, int paramInt2);
/*     */   
/*     */   @Deprecated
/*     */   void rawSetText(int paramInt1, int paramInt2, char[][] paramArrayOfchar);
/*     */   
/*     */   void rawSetText(int paramInt1, int paramInt2, int[][] paramArrayOfint);
/*     */   
/*     */   void rawSetForeground(int paramInt1, int paramInt2, int[][] paramArrayOfint);
/*     */   
/*     */   void rawSetBackground(int paramInt1, int paramInt2, int[][] paramArrayOfint);
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   boolean renderText();
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   int renderWidth();
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   int renderHeight();
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   void setRenderingEnabled(boolean paramBoolean);
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   boolean isRenderingEnabled();
/*     */   
/*     */   void keyDown(char paramChar, int paramInt, EntityPlayer paramEntityPlayer);
/*     */   
/*     */   void keyUp(char paramChar, int paramInt, EntityPlayer paramEntityPlayer);
/*     */   
/*     */   void clipboard(String paramString, EntityPlayer paramEntityPlayer);
/*     */   
/*     */   void mouseDown(double paramDouble1, double paramDouble2, int paramInt, EntityPlayer paramEntityPlayer);
/*     */   
/*     */   void mouseDrag(double paramDouble1, double paramDouble2, int paramInt, EntityPlayer paramEntityPlayer);
/*     */   
/*     */   void mouseUp(double paramDouble1, double paramDouble2, int paramInt, EntityPlayer paramEntityPlayer);
/*     */   
/*     */   void mouseScroll(double paramDouble1, double paramDouble2, int paramInt, EntityPlayer paramEntityPlayer);
/*     */   
/*     */   public enum ColorDepth
/*     */   {
/* 645 */     OneBit,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 650 */     FourBit,
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 655 */     EightBit;
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\internal\TextBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */