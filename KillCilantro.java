public class KillCilantro {
   public static void main(String[] args) {
      System.out.println(killCilantro("I love cilantro and pizza and cilantro"));
   }
   public static String killCilantro(String cilantro) {
      String noCilantro = "";
      int y = -1; 
      int z = cilantro.indexOf("cilantro");
      if (y != z) {
         noCilantro += cilantro.substring(0, z);
         noCilantro += "parsley";
         noCilantro += cilantro.substring(z + 8, cilantro.length());
      }
         
      return noCilantro;
   }
   /*public static string killCilantro(String cilantro) {
      String parsleyBetter = "";
      String noCilantro = cilantro;
      while (noCilantro.indexOf("cilantro") != -1) {
         
   
      }
   } */  
}