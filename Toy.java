// CSE-111 LAB - 4 TASK - 2     []
// T_2 A Toy object !

public class Toy {
   public String name;
   public int price;

   public Toy(String nk_0, int pk_0) {
      this.name = nk_0;
      this.price = pk_0;
      System.out.println("A new toy has been made!");
   }

   public void updatePrice(int pk_1) {
      this.price = pk_1;
   }

   public void showPrice() {
      System.out.println("price : " + this.price);
   }

   public void updateName(String nk_1) {
      System.out.println("Changing old name : " + this.name);
      this.name = nk_1;
      System.out.println("new name : " + this.name);
   }
}
  
  
  