// CSE-111 LAB - 4 TASK - 7     []
// T_7 A Bus object !

public class BracuBus {
   public String route;
   public String sname;

   public int count;
   public int maxp;

   public String[] passengers;
  
   public BracuBus(String bnk_0){
      route = bnk_0;
      maxp = 2;
      passengers = new String[2];
   }

   public BracuBus(String bnk_1, int sk_0){
      route = bnk_1;
      maxp = sk_0;
      passengers = new String[sk_0];
   }

   public void board(){
      System.out.println("No passengers!");
   }

   public void board(BracuStudent st1) {
      boolean pass = st1.hp_0;
      String dest = st1.lives;
      String nam = st1.s_0;

      if (!pass) {
         System.out.println("You don't have a bus pass!");
      }
      else if (route != dest) {
         System.out.println("You got on the wrong bus!");
      }
      else if (pass || route != dest){
         if(count < passengers.length){
            System.out.println(nam + " boarded the bus.");
            passengers[count] = nam;
            count ++;
         }
         else{System.out.println("Bus is full!");}
      }
      else{System.out.println("! MP5 !");}

      
   }

   public void board(BracuStudent st2, BracuStudent st3){
      board(st2);
      board(st3);
   }

   public void showDetails(){
      System.out.println("Bus Route : " + route);
      System.out.println("Passenger Count : " + count + "(max" + maxp + ")");
      System.out.println("Passengers on Board : ");

      for (int i = 0; i < count; i++) {
         System.out.print(passengers[i] + " ");
      }
   }

   
}
   
class BracuStudent {
   public String s_0;
   public boolean hp_0;
   public String lives;

   public BracuStudent(String sn_0, String lk_0){
      s_0 = sn_0;
      lives = lk_0;
      hp_0 = false;
   }

   public BracuStudent() {
      s_0 = "IDK";
      lives = "Some_Where";
      hp_0 = false;
   }

   public void updateHome(String lk_1){
      lives = lk_1;
   }

   public boolean getPass(){
      hp_0 = true;

      return hp_0;
   }

   public String get_name() {
      return s_0;
   }

   public String get_home() {
      return lives;
   }

   public boolean has_pass() {
      return hp_0;
   }

   public void showDetails(){
      System.out.println(
         "Student Name : " + s_0 + "." + "\n" +
         "Lives in : " + lives + "." + "\n" +
         "Have Bus Pass? " + hp_0
      );
   }
 
}

  