// CSE-111 LAB - 4 TASK - 5     []
// T_5 A Triangle object !

public class Triangle {
   public int side_1;
   public int side_2;
   public int side_3;

   

   public void updateSides(int s1k_0, int s2k_0, int s3k_0){
      side_1 = s1k_0;
      side_2 = s2k_0;
      side_3 = s3k_0;
   }

   public void triangleDetails(){
      System.out.println("Three sides of the triangle are : " + side_1 + " , " + side_2 + " , " + side_3);
      System.out.println("Perimeter : " + (side_1 + side_2 + side_3));
   }

   public String printTriangleType(){
      int temp = 0;

      if (side_1 == side_2) {
         if (side_2 == side_3) {
            return "This is an Equilateral Triangle.";
         }
         else{return "This is an Isosceles Triangle.";}
      }
      else if (side_1 != side_2) {
         if (side_2 != side_3) {
            return "This is an Scalene Triangle.";
         }
         else{return "This is an Isosceles Triangle.";}
      }
      else{return "This is an Scalene Triangle.";}
   }

   public void compareTrinagles(Triangle t2) {
      int s1k_1 = t2.side_1;
      int s2k_1 = t2.side_2;
      int s3k_1 = t2.side_3;

      int sum_0 = this.side_1 + this.side_2 + this.side_3;
      int sum_1 = s1k_1 + s2k_1 + s3k_1;
      
      boolean address = false;
      boolean sum = false;
      boolean side = false;
      
      if (this == t2) {
         address = true;
      }
      else{}

      if (sum_0 == sum_1) {
         sum = true;
      }
      else{}

      if (s1k_1 == side_1 && s2k_1 == side_2 && s3k_1 == side_3) {
         side = true;
      }
      else{}

      if (address == true && sum == true && side == true) {
         System.out.println("These two triangle objects have the same address.");
      }
      else if (address != true && sum != true && side != true) {
         System.out.println("Addresses, length of the sides and perimeter all are different.");
      }
      else if (side == true) {
         System.out.println("Addresses are different but the sides of the triangles are equal.");
      }
      else if (sum == true) {
         System.out.println("Only the perimeter of both triangles is equal.");
      }
      else{}

   }

}
  
  
  