package Class24;

public class Dog {
   private String name;
    private String breed;
    private int age;
    private double weight;

   public Dog(String name, String breed, int age, double weight) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
   }

       void setName(String name) {
           if (name.length() > 30) {
               System.out.println("Name can not be more than 30 letters.Please try again.");
           } else if (name.isEmpty()) {
               System.out.println("Name can not be empty. Please try again.");
           } else {
               this.name = name;
           }
       }

       void setWeight(double weight){
       if(weight<0){
           System.out.println("Negative weight is not allowed. Please try again");
       }else if(weight>300){
           System.out.println("Please try less than 300, it looks more of an elephant");
       }else{
           this.weight = weight;
       }
       }

void setAge(int age){
       if(age>20){
           System.out.println("Please use less age something seems wrong here are you sure it's a dog");
       }else if(age<0){
           System.out.println("age can not be negative");
       }else{
           this.age = age;
       }
}

       void setBreed(String breed){
if(breed.length()>20){
    System.out.println("Breed can not be more than 20 letters.Please try again.");
} else if(breed.isEmpty()){
    System.out.println("Breed can not be empty. Please try again.");
}else{
    this.breed = breed;
}
   }

   String getName(){
       return name;
   }
    void printInfo(){
        System.out.println("Name "+ name + " Breed "+ breed+ " Age "+age+" Weight " + weight);
    }
}



class Test{
    public static void main(String[] args) {
        Dog dog=new Dog("Tommy", "German", 2, 15);
        dog.printInfo();
        System.out.println(dog.getName());
    }
}