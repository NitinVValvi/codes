
  package abstraction;
  
  public class Abstraction {
  
  public static void main(String[] args) {
  
  Audi a1 = new Audi(); a1.start(); } } class Audi extends Cars{
  
  @Override void start() { System.out.println("Audi starting");
  
  }
  
  }
  
  class BMW extends Cars{
  
  @Override void start() { System.out.println("BMW starting"); }
  
  }
  
  abstract class Cars{
  
  int price;
  
  abstract void start() ;
  
  void breaks() { System.out.println("car is breaking"); } }
 