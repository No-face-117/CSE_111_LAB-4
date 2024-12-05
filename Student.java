// CSE-111 LAB - 4 TASK - 4     []
// T_4 A Student CG object !

public class Student {
   public int ID;
   public int count;
   public double CG = 0.0;
   public String course[] = new String[4];
   
   public Student(int ik_0){
      ID = ik_0;
      System.out.println("A student with ID " + ik_0 + " has been created.");
   }

   public Student(int ik_1, double ck_0){
      ID = ik_1;
      CG = ck_0;
      System.out.println("A student with ID " + ik_1 + " and cgpa " + CG + " has been created.");
   }

   public void storeID(int ik_0){
      ID = ik_0;
   }

   public void storeCG(double ck_0){
      CG = ck_0;
   }

   public void removeAllCourse(){
      count = 0;
   }

   public void addCourse(String sk_0){
      if (CG == 0.0) {
         System.out.println("Failed to add " + sk_0 + ".");
         System.out.println("Set CG first.");
      }
      else if (CG > 0.0 && CG < 3.0) {
         if (count < 3) {
            if (count < course.length) {
               course[count] = sk_0;
               count ++;
            }
            else{System.out.println("Maximum 3 courses allowed.");}      
         }
         else{
            System.out.println("Failed to add " + sk_0 + ".");
            System.out.println("CG is low. Can't add more than 3 courses.");}
      }
      else if (CG >= 3) {
         if (count < 4) {
            if (count < course.length) {
               course[count] = sk_0;
               count ++;
            }
            else{System.out.println("Maximum 4 courses allowed.");}      
         }
         else{
            System.out.println("Failed to add " + sk_0 + ".");
            System.out.println("CG is low. Can't add more than 4 courses.");}
      }
      else{}
   }

   public void addCourse(String[] sk_0){
      String sk_1;
      for (int i = 0; i < sk_0.length; i++) {
         sk_1 = sk_0[i];
         addCourse(sk_1);
      }
   }

   public void showAdvisee(){
      System.out.println("Student ID : " + ID + ", CGPA : " + CG);
      if (count == 0 ) {
         System.out.println("No courses !");
      }
      else if (count != 0) {
         System.out.println("Added courses are : ");
         for (int i = 0; i < count; i++) {
            System.out.print(course[i] + " ");
         }
         System.out.println();
      }
   }


}
  
  
  