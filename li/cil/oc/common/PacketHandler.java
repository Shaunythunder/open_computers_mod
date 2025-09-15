/*     */ package li.cil.oc.common;
/*     */ import io.netty.buffer.ByteBuf;
/*     */ import io.netty.buffer.ByteBufInputStream;
/*     */ import java.io.InputStream;
/*     */ import java.util.zip.InflaterInputStream;
/*     */ import li.cil.oc.api.Items;
/*     */ import li.cil.oc.common.block.RobotAfterimage;
/*     */ import li.cil.oc.common.tileentity.Robot;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.player.EntityPlayerMP;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.tileentity.TileEntity;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.util.ForgeDirection;
/*     */ import scala.Enumeration;
/*     */ import scala.None$;
/*     */ import scala.Option;
/*     */ import scala.Option$;
/*     */ import scala.Some;
/*     */ import scala.reflect.ClassTag;
/*     */ import scala.reflect.package$;
/*     */ import scala.runtime.BoxedUnit;
/*     */ 
/*     */ @ScalaSignature(bytes = "\006\001\005]f!B\001\003\003\003Y!!\004)bG.,G\017S1oI2,'O\003\002\004\t\00511m\\7n_:T!!\002\004\002\005=\034'BA\004\t\003\r\031\027\016\034\006\002\023\005\021A.[\002\001'\t\001A\002\005\002\016!5\taBC\001\020\003\025\0318-\0317b\023\t\tbB\001\004B]f\024VM\032\005\006'\001!\t\001F\001\007y%t\027\016\036 \025\003U\001\"A\006\001\016\003\tAQ\001\007\001\005\022e\tAb\0348QC\016\\W\r\036#bi\006$2AG\017*!\ti1$\003\002\035\035\t!QK\\5u\021\025qr\0031\001 \003\021!\027\r^1\021\005\001:S\"A\021\013\005\t\032\023A\0022vM\032,'O\003\002%K\005)a.\032;us*\ta%\001\002j_&\021\001&\t\002\b\005f$XMQ;g\021\025Qs\0031\001,\003\031\001H.Y=feB\021A\006N\007\002[)\021!F\f\006\003_A\na!\0328uSRL(BA\0313\003%i\027N\\3de\0064GOC\0014\003\rqW\r^\005\003k5\022A\"\0228uSRL\b\013\\1zKJDQa\016\001\007\022a\nQa^8sY\022$2!O!C!\ri!\bP\005\003w9\021aa\0249uS>t\007CA\037@\033\005q$BA\0341\023\t\001eHA\003X_JdG\rC\003+m\001\0071\006C\003Dm\001\007A)A\005eS6,gn]5p]B\021Q\"R\005\003\r:\0211!\0238u\021\025A\005A\"\005J\003!!\027n\0359bi\016DGC\001\016K\021\025Yu\t1\001M\003\005\001\bCA'O\033\005\001a\001B(\001\021A\023A\002U1dW\026$\b+\031:tKJ\034\"AT)\021\005I3V\"A*\013\005\031\"&\"A+\002\t)\fg/Y\005\003/N\023q\002R1uC&s\007/\036;TiJ,\027-\034\005\t3:\023\t\021)A\0055\00611\017\036:fC6\004\"AU.\n\005q\033&aC%oaV$8\013\036:fC6D\001B\013(\003\006\004%\tAX\013\002W!A\001M\024B\001B\003%1&A\004qY\006LXM\035\021\t\013MqE\021\0012\025\0071\033G\rC\003ZC\002\007!\fC\003+C\002\0071\006C\004g\035\n\007I\021A4\002\025A\f7m[3u)f\004X-F\001i!\tIGN\004\002\027U&\0211NA\001\013!\006\0347.\032;UsB,\027BA7o\005\0251\026\r\\;f\023\tygBA\006F]VlWM]1uS>t\007BB9OA\003%\001.A\006qC\016\\W\r\036+za\026\004\003\"B:O\t\003!\030!D4fiRKG.Z#oi&$\0300\006\002vuRIa/a\006\002\032\005u\021\021\005\013\004o\006\035\001cA\007;qB\021\021P\037\007\001\t\025Y(O1\001}\005\005!\026cA?\002\002A\021QB`\005\003:\021qAT8uQ&tw\rE\002\016\003\007I1!!\002\017\005\r\te.\037\005\n\003\023\021\030\021!a\002\003\027\t!\"\032<jI\026t7-\032\0232!\025\ti!a\005y\033\t\tyAC\002\002\0229\tqA]3gY\026\034G/\003\003\002\026\005=!\001C\"mCN\034H+Y4\t\013\r\023\b\031\001#\t\r\005m!\0171\001E\003\005A\bBBA\020e\002\007A)A\001z\021\031\t\031C\035a\001\t\006\t!\020C\004\002(9#\t!!\013\002\023\035,G/\0228uSRLX\003BA\026\003g!b!!\f\002<\005uB\003BA\030\003k\001B!\004\036\0022A\031\0210a\r\005\rm\f)C1\001}\021)\t9$!\n\002\002\003\017\021\021H\001\013KZLG-\0328dK\022\022\004CBA\007\003'\t\t\004\003\004D\003K\001\r\001\022\005\b\003\t)\0031\001E\003\tIG\rC\004\002D9#\t!!\022\002\035I,\027\r\032+jY\026,e\016^5usV!\021qIA()\t\tI\005\006\003\002L\005E\003\003B\007;\003\033\0022!_A(\t\031Y\030\021\tb\001y\"Q\0211KA!\003\003\005\035!!\026\002\025\0254\030\016Z3oG\026$3\007\005\004\002\016\005M\021Q\n\005\b\0033rE\021AA.\003)\021X-\0313F]RLG/_\013\005\003;\n)\007\006\002\002`Q!\021\021MA4!\021i!(a\031\021\007e\f)\007\002\004|\003/\022\r\001 \005\013\003S\n9&!AA\004\005-\024AC3wS\022,gnY3%iA1\021QBA\n\003GBq!a\034O\t\003\t\t(A\007sK\006$G)\033:fGRLwN\034\013\003\003g\002B!\004\036\002vA!\021qOAB\033\t\tIH\003\003\002|\005u\024\001B;uS2T1aAA@\025\r\t\tIM\001\017[&tWm\031:bMR4wN]4f\023\021\t))!\037\003\035\031{'oZ3ESJ,7\r^5p]\"9\021\021\022(\005\002\005-\025!\004:fC\022LE/Z7Ti\006\0347\016\006\002\002\016B!\021qRAK\033\t\t\tJC\002\002\024B\nA!\033;f[&!\021qSAI\005%IE/Z7Ti\006\0347\016C\004\002\034:#\t!!(\002\017I,\027\r\032(C)R\021\021q\024\t\005\003C\0139+\004\002\002$*\031\021Q\025\031\002\0079\024G/\003\003\002*\006\r&A\004(C)R\013wmQ8na>,h\016\032\005\b\003[sE\021AAX\003)\021X-\0313NK\022LW/\034\013\002\t\"9\0211\027(\005\002\005U\026A\004:fC\022\004\026mY6fiRK\b/\032\013\002Q\002")
/*     */ public abstract class PacketHandler {
/*     */   public void onPacketData(ByteBuf data, EntityPlayer player) {
/*  29 */     InputStream inputStream = null; try {
/*     */       try {
/*  31 */         ByteBufInputStream byteBufInputStream = new ByteBufInputStream(data);
/*  32 */         if (byteBufInputStream.read() != 0) inputStream = new InflaterInputStream((InputStream)byteBufInputStream); 
/*  33 */         dispatch(new PacketParser(this, inputStream, player));
/*     */       } finally {
/*     */         Exception exception = null;
/*     */       } 
/*     */     } finally {
/*  38 */       if (inputStream != null) {
/*  39 */         inputStream.close();
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  45 */     EntityPlayer entityPlayer = player;
/*  46 */     if (entityPlayer instanceof EntityPlayerMP) { EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entityPlayer; entityPlayerMP.func_143004_u(); BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*  47 */     else { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */   
/*     */   }
/*     */   
/*     */   public abstract Option<World> world(EntityPlayer paramEntityPlayer, int paramInt);
/*     */   
/*     */   public abstract void dispatch(PacketParser paramPacketParser);
/*     */   
/*     */   public class PacketParser
/*     */     extends DataInputStream
/*     */   {
/*     */     private final EntityPlayer player;
/*     */     private final Enumeration.Value packetType;
/*     */     
/*     */     public EntityPlayer player() {
/*  62 */       return this.player; } public PacketParser(PacketHandler $outer, InputStream stream, EntityPlayer player) { super(stream);
/*  63 */       this.packetType = PacketType$.MODULE$.apply(readByte()); } public Enumeration.Value packetType() { return this.packetType; }
/*     */     
/*     */     public <T> Option<T> getTileEntity(int dimension, int x, int y, int z, ClassTag evidence$1) {
/*  66 */       Option<World> option = li$cil$oc$common$PacketHandler$PacketParser$$$outer().world(player(), dimension);
/*  67 */       if (option instanceof Some) { Some some = (Some)option; World world = (World)some.x(); if (world.func_72899_e(x, y, z))
/*  68 */         { TileEntity t = world.func_147438_o(x, y, z);
/*  69 */           if (t != null && package$.MODULE$.classTag(evidence$1).runtimeClass().isAssignableFrom(t.getClass())) {
/*  70 */             return (Option<T>)new Some(t);
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*  75 */           Block block = Items.get("robotAfterimage").block();
/*  76 */           if (block instanceof RobotAfterimage) { RobotAfterimage robotAfterimage = (RobotAfterimage)block; Option option1 = robotAfterimage.findMovingRobot((IBlockAccess)world, x, y, z);
/*  77 */             if (option1 instanceof Some) { Some some1 = (Some)option1; Robot robot = (Robot)some1.x(); if (package$.MODULE$.classTag(evidence$1).runtimeClass().isAssignableFrom(robot.proxy().getClass()))
/*  78 */                 return (Option<T>)new Some(robot.proxy());  }
/*  79 */              BoxedUnit boxedUnit3 = BoxedUnit.UNIT; BoxedUnit boxedUnit2 = BoxedUnit.UNIT; }
/*     */           else
/*  81 */           { BoxedUnit boxedUnit2 = BoxedUnit.UNIT; }
/*     */ 
/*     */           
/*     */           BoxedUnit boxedUnit1 = BoxedUnit.UNIT;
/*  85 */           return (Option<T>)None$.MODULE$; }  }  BoxedUnit boxedUnit = BoxedUnit.UNIT; return (Option<T>)None$.MODULE$;
/*     */     }
/*     */     
/*     */     public <T> Option<T> getEntity(int dimension, int id, ClassTag evidence$2) {
/*  89 */       Option<World> option = li$cil$oc$common$PacketHandler$PacketParser$$$outer().world(player(), dimension);
/*  90 */       if (option instanceof Some) { Some some = (Some)option; World world = (World)some.x();
/*  91 */         Entity e = world.func_73045_a(id);
/*  92 */         if (e != null && package$.MODULE$.classTag(evidence$2).runtimeClass().isAssignableFrom(e.getClass()))
/*  93 */           return (Option<T>)new Some(e);  BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       else
/*  95 */       { BoxedUnit boxedUnit = BoxedUnit.UNIT; }
/*     */       
/*  97 */       return (Option<T>)None$.MODULE$;
/*     */     }
/*     */     
/*     */     public <T> Option<T> readTileEntity(ClassTag<T> evidence$3) {
/* 101 */       int dimension = readInt();
/* 102 */       int x = readInt();
/* 103 */       int y = readInt();
/* 104 */       int z = readInt();
/* 105 */       return getTileEntity(dimension, x, y, z, evidence$3);
/*     */     }
/*     */     
/*     */     public <T> Option<T> readEntity(ClassTag<T> evidence$4) {
/* 109 */       int dimension = readInt();
/* 110 */       int id = readInt();
/* 111 */       return getEntity(dimension, id, evidence$4);
/*     */     }
/*     */     public Option<ForgeDirection> readDirection() {
/* 114 */       byte b = readByte(); switch (b) {  }  return 
/* 115 */         (b < 0) ? (Option<ForgeDirection>)None$.MODULE$ : 
/* 116 */         Option$.MODULE$.apply(ForgeDirection.getOrientation(b));
/*     */     }
/*     */     
/*     */     public ItemStack readItemStack() {
/* 120 */       boolean haveStack = readBoolean();
/* 121 */       return haveStack ? 
/* 122 */         ItemStack.func_77949_a(readNBT()) : 
/*     */         
/* 124 */         null;
/*     */     }
/*     */     
/*     */     public NBTTagCompound readNBT() {
/* 128 */       boolean haveNbt = readBoolean();
/* 129 */       return haveNbt ? 
/* 130 */         CompressedStreamTools.func_74794_a(this) : 
/*     */         
/* 132 */         null;
/*     */     }
/*     */     
/*     */     public int readMedium() {
/* 136 */       int c0 = readUnsignedByte();
/* 137 */       int c1 = readUnsignedByte();
/* 138 */       int c2 = readUnsignedByte();
/* 139 */       return c0 | c1 << 8 | c2 << 16;
/*     */     }
/*     */     public Enumeration.Value readPacketType() {
/* 142 */       return PacketType$.MODULE$.apply(readByte());
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\common\PacketHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */