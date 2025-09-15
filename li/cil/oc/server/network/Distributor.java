package li.cil.oc.server.network;

import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\001i2q!\001\002\021\002G\005QBA\006ESN$(/\0332vi>\024(BA\002\005\003\035qW\r^<pe.T!!\002\004\002\rM,'O^3s\025\t9\001\"\001\002pG*\021\021BC\001\004G&d'\"A\006\002\0051L7\001A\n\003\0019\001\"a\004\n\016\003AQ\021!E\001\006g\016\fG.Y\005\003'A\021a!\0218z%\0264\007\"B\013\001\r\0031\022\001D4m_\n\fGNQ;gM\026\024X#A\f\021\005=A\022BA\r\021\005\031!u.\0362mK\")1\004\001D\0019\005\001r\r\\8cC2\024UO\0324fe~#S-\035\013\003;\001\002\"a\004\020\n\005}\001\"\001B+oSRDQ!\t\016A\002]\tQA^1mk\026DQa\t\001\007\002Y\t\001c\0327pE\006d')\0364gKJ\034\026N_3\t\013\025\002a\021\001\024\002)\035dwNY1m\005V4g-\032:TSj,w\fJ3r)\tir\005C\003\"I\001\007q\003C\003*\001\031\005!&\001\007bI\022\034uN\0348fGR|'\017\006\002\036W!)A\006\013a\001[\005I1m\0348oK\016$xN\035\t\003]=j\021AA\005\003a\t\021\021bQ8o]\026\034Go\034:\t\013I\002a\021A\032\002\037I,Wn\034<f\007>tg.Z2u_J$\"!\b\033\t\0131\n\004\031A\027\t\013Y\002a\021A\034\002\031\rD\027M\\4f\005V4g-\032:\025\005]A\004\"B\0356\001\0049\022!\0023fYR\f\007")
public interface Distributor {
  double globalBuffer();
  
  void globalBuffer_$eq(double paramDouble);
  
  double globalBufferSize();
  
  void globalBufferSize_$eq(double paramDouble);
  
  void addConnector(Connector paramConnector);
  
  void removeConnector(Connector paramConnector);
  
  double changeBuffer(double paramDouble);
}


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\Distributor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */