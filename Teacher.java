// CSE-111 LAB - 4 TASK - 6     []
// T_6 A Teacher object !

public class Teacher {
   public String name;
   public String sname;

   public int count = 0;

   Course[] courses = new Course[3];

   public Teacher(String nk_0, String snk_0){
      name = nk_0;
      sname = snk_0;

      System.out.println("A new teacher has been created.");
   }

   public void addCourse(Course c_1){
      courses[count] = c_1;
      count ++;
   }

   public void printDetail(){
      System.out.println(
         "Name : " + name + "." + "\n" +
         "Initial : " + sname + "\n" +
         "List of courses : "
      );

      for (int i = 0; i < count; i++) {
         System.out.println(courses[i].cn_0);
      }
   }
   
}

class Course {
   public String cn_0;
   
   public Course(String cn_1){
      cn_0 = cn_1;
   }
   
}
  
  
  