// CSE-111 LAB - 4 TASK - 1     []
// T_1 A Student object !

public class Student {
   public String name;
   public String prog;

   public Student(String nk_0, String ck_0) {
      this.name = nk_0;
      this.prog = ck_0;
   }

   public void updateName(String nk_1) {
      this.name = nk_1;
   }

   public void updateProgram(String ck_1) {
      this.prog = ck_1;
   }

   public String accessProgram() {
      return this.prog;
   }
}
  
  
  