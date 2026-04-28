
public class Dog {

  int size;
  String breed;
  String name;

  static void bark(){
   System.out.println("Ruff! Ruff!");
  }

  void collar(){
   System.out.println("--- Best friend's info ---");
   System.out.println("Name: " + name);
   System.out.println("Size: " + size);
  }

}