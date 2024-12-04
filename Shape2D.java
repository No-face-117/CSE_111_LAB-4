// CSE-111 LAB - 4 TASK - 3     []
// T_3 A Shape object !

public class Shape2D {
   public String type = "Square";
   public int s_1 = 5;
   public int s_2 = 0;
   public int s_3 = 0;

   public Shape2D(){
      System.out.println("A " + type + "has been created with " +
                        "\n" + "length : " + s_1);
   }

   public Shape2D(int sk_01, int sk_02){
      s_1 = sk_01;
      s_2 = sk_02;
      type = "Rectangle";
      System.out.println("A " + type + "has been created with " +
                        "\n" + "length : " + s_1 + " and breadth : " + s_2);
   }

   public Shape2D(int sk_011, int sk_022, int sk_033){
      s_1 = sk_011;
      s_2 = sk_022;
      s_3 = sk_033;
      type = "Triangle";
      System.out.println("A " + type + "has been created with " +
                        "\n" + " the following sides : " + s_1 + " , " + s_2 + " , " + s_3);
   }

   public Shape2D(int sk_0111, int sk_0222, String pk_0){
      s_1 = sk_0111;
      s_2 = sk_0222;
      type = pk_0;
      System.out.println("A " + type + "has been created with " +
                        "\n" + "hight : " + s_1 + " and base : " + s_2);
   }

   public void area(){
      double area = 0.00;
      if (type.equals("Square")) {
         area = Math.pow(s_1, 2);
      }
      else if (type.equals("Rectangle")) {
         area = s_1 * s_2;
      }
      else if (type.equals("Triangle")) {
         if (s_3 == 0) {
            area = 0.5 * s_1 * s_2;
         }
         else if (s_3 != 0) {
            area = 0.5 * s_1 * s_2;
         }
         else{}
      }
      else{}

      System.out.println("The area of the "+ type + " is : " + area);
   }

   
}
  
  
  