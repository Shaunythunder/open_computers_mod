/*     */ package li.cil.oc.api.event;
/*     */ 
/*     */ import cpw.mods.fml.common.eventhandler.Cancelable;
/*     */ import cpw.mods.fml.common.eventhandler.Event;
/*     */ import li.cil.oc.api.internal.Rack;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.renderer.RenderBlocks;
/*     */ import net.minecraft.client.renderer.Tessellator;
/*     */ import net.minecraft.nbt.NBTTagCompound;
/*     */ import net.minecraft.util.IIcon;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class RackMountableRenderEvent
/*     */   extends Event
/*     */ {
/*     */   public final Rack rack;
/*     */   public final int mountable;
/*     */   public final NBTTagCompound data;
/*     */   
/*     */   public RackMountableRenderEvent(Rack rack, int mountable, NBTTagCompound data) {
/*  42 */     this.rack = rack;
/*  43 */     this.mountable = mountable;
/*  44 */     this.data = data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Cancelable
/*     */   public static class Block
/*     */     extends RackMountableRenderEvent
/*     */   {
/*     */     public final ForgeDirection side;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final RenderBlocks renderer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private IIcon frontTextureOverride;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Block(Rack rack, int mountable, NBTTagCompound data, ForgeDirection side, RenderBlocks renderer) {
/*  80 */       super(rack, mountable, data);
/*  81 */       this.side = side;
/*  82 */       this.renderer = renderer;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public IIcon getFrontTextureOverride() {
/*  89 */       return this.frontTextureOverride;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void setFrontTextureOverride(IIcon texture) {
/*  98 */       this.frontTextureOverride = texture;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class TileEntity
/*     */     extends RackMountableRenderEvent
/*     */   {
/*     */     public final float v0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final float v1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public TileEntity(Rack rack, int mountable, NBTTagCompound data, float v0, float v1) {
/* 127 */       super(rack, mountable, data);
/* 128 */       this.v0 = v0;
/* 129 */       this.v1 = v1;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void renderOverlay(ResourceLocation texture) {
/* 138 */       renderOverlay(texture, 0.0F, 1.0F);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void renderOverlay(ResourceLocation texture, float u0, float u1) {
/* 150 */       Minecraft.func_71410_x().func_110434_K().func_110577_a(texture);
/* 151 */       Tessellator t = Tessellator.field_78398_a;
/* 152 */       t.func_78382_b();
/* 153 */       t.func_78374_a(u0, this.v1, 0.0D, u0, this.v1);
/* 154 */       t.func_78374_a(u1, this.v1, 0.0D, u1, this.v1);
/* 155 */       t.func_78374_a(u1, this.v0, 0.0D, u1, this.v0);
/* 156 */       t.func_78374_a(u0, this.v0, 0.0D, u0, this.v0);
/* 157 */       t.func_78381_a();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\api\event\RackMountableRenderEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */