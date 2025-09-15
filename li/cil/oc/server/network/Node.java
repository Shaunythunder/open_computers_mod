/*    */ package li.cil.oc.server.network;@ScalaSignature(bytes = "\006\001\005maaB\001\003!\003\r\t!\004\002\005\035>$WM\003\002\004\t\0059a.\032;x_J\\'BA\003\007\003\031\031XM\035<fe*\021q\001C\001\003_\016T!!\003\006\002\007\rLGNC\001\f\003\ta\027n\001\001\024\007\001qa\003\005\002\020)5\t\001C\003\002\022%\005!A.\0318h\025\005\031\022\001\0026bm\006L!!\006\t\003\r=\023'.Z2u!\t92$D\001\031\025\t\031\021D\003\002\033\r\005\031\021\r]5\n\005\005A\002\"B\017\001\t\003q\022A\002\023j]&$H\005F\001 !\t\0013%D\001\"\025\005\021\023!B:dC2\f\027B\001\023\"\005\021)f.\033;\t\013\031\002a\021A\024\002\t!|7\017\036\013\002QA\021q#K\005\003Ua\0211\"\0228wSJ|g.\\3oi\")A\006\001D\001[\005a!/Z1dQ\006\024\027\016\\5usR\ta\006\005\002\030_%\021\001\007\007\002\013-&\034\030NY5mSRL\bb\002\032\001\001\004%)aM\001\bC\022$'/Z:t+\005!\004CA\0339\035\t\001c'\003\0028C\0051\001K]3eK\032L!!\017\036\003\rM#(/\0338h\025\t9\024\005C\004=\001\001\007IQA\037\002\027\005$GM]3tg~#S-\035\013\003?yBqaP\036\002\002\003\007A'A\002yIEBa!\021\001!B\033!\024\001C1eIJ,7o\035\021\t\017\r\001\001\031!C\003\007V\tA\t\005\002\030\013&\021a\t\007\002\b\035\026$xo\034:l\021\035A\005\0011A\005\006%\0131B\\3uo>\0248n\030\023fcR\021qD\023\005\b\035\013\t\0211\001E\021\031a\005\001)Q\007\t\006Aa.\032;x_J\\\007\005C\003O\001\021\005q*\001\tdC:\024UMU3bG\",GM\022:p[R\021\001k\025\t\003AEK!AU\021\003\017\t{w\016\\3b]\")A+\024a\001-\005)q\016\0365fe\")a\013\001C\001/\006a\021n\035(fS\036D'm\034:PMR\021\001\013\027\005\006)V\003\rA\006\005\0065\002!\taW\001\017e\026\f7\r[1cY\026tu\016Z3t)\005a\006cA\b^-%\021a\f\005\002\t\023R,'/\0312mK\")\001\r\001C\0017\006Ia.Z5hQ\n|'o\035\005\006E\002!\taY\001\bG>tg.Z2u)\tyB\rC\003fC\002\007a#\001\003o_\022,\007\"B4\001\t\003A\027A\0033jg\016|gN\\3diR\021q$\033\005\006K\032\004\rA\006\005\006W\002!\tAH\001\007e\026lwN^3\t\0135\004A\021\0028\002\037%\034\030J\\*b[\026tU\r^<pe.$\"\001U8\t\013Qc\007\031\001\f\t\013E\004A\021\001:\002\023=t7i\0348oK\016$HCA\020t\021\025)\007\0171\001\027\021\025)\b\001\"\001w\0031yg\016R5tG>tg.Z2u)\tyr\017C\003fi\002\007a\003C\003z\001\021\005!0\001\003m_\006$GCA\020|\021\025a\b\0201\001~\003\rq'\r\036\t\004}\006%Q\"A@\013\007q\f\tA\003\003\002\004\005\025\021!C7j]\026\034'/\0314u\025\t\t9!A\002oKRL1!a\003\000\0059q%\t\026+bO\016{W\016]8v]\022Dq!a\004\001\t\003\t\t\"\001\003tCZ,GcA\020\002\024!1A0!\004A\002uDq!a\006\001\t\003\nI\"\001\005u_N#(/\0338h)\005!\004")
/*    */ public interface Node extends Node { Environment host();
/*    */   Visibility reachability();
/*    */   String address();
/*    */   @TraitSetter
/*    */   void address_$eq(String paramString);
/*    */   Network network();
/*    */   @TraitSetter
/*    */   void network_$eq(Network paramNetwork);
/*    */   boolean canBeReachedFrom(Node paramNode);
/*    */   boolean isNeighborOf(Node paramNode);
/*    */   Iterable<Node> reachableNodes();
/*    */   Iterable<Node> neighbors();
/*    */   void connect(Node paramNode);
/*    */   void disconnect(Node paramNode);
/*    */   void remove();
/*    */   
/*    */   void onConnect(Node paramNode);
/*    */   
/*    */   void onDisconnect(Node paramNode);
/*    */   
/*    */   void load(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   void save(NBTTagCompound paramNBTTagCompound);
/*    */   
/*    */   String toString();
/*    */   
/*    */   public final class Node$$anonfun$isNeighborOf$1 extends AbstractFunction1<Node, Object> implements Serializable { public final boolean apply(Node x$1) {
/* 29 */       Node node = this.other$1; if (x$1 == null) { if (node != null); } else if (x$1.equals(node))
/*    */       {  }
/*    */     
/*    */     }
/*    */     
/*    */     public static final long serialVersionUID = 0L;
/*    */     private final Node other$1;
/*    */     
/*    */     public Node$$anonfun$isNeighborOf$1(Node $outer, Node other$1) {} }
/*    */    }


/* Location:              C:\Users\shame\AppData\Roaming\PrismLauncher\instances\GT_New_Horizons_2.7.4_Java_17-21\.minecraft\mods\OpenComputers-1.10.30-GTNH.jar!\li\cil\oc\server\network\Node.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */