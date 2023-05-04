package Extends;

public class FPT extends SinhVien{
    String phone;
   public void play(){
       System.out.println("Play Game");
       super.learn(); // doi tuong ngam dinh cua lop cha trong lop con
       this.learn();
   }
   @Override
   public void learn(){
       System.out.println("FPT learning");
   }
}
