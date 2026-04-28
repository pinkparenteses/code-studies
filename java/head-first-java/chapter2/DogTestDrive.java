public class DogTestDrive {

  public static void main(String[] args){

    Dog.bark();

    Dog d = new Dog();

    d.name = "Floquinho";
    d.size = 100;
    d.breed = "creed";
    
    d.collar();

  }
}