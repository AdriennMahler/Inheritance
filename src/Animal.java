 public class Animal{
    protected String type; //limited encapsulation
    private String size;
    private double weight;

    public Animal(){

    }
     public Animal(String type, String size, double weight){
        this.type=type;
        this.size=size;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }
    public void makeNoise(){
        System.out.println(type + " makes some kind of noise");
    }
}
//Dog inherits from Animal, dog IS-A type of Animal
// extends specify the superclass or parent class of the class we are declaring
//Dog is a subclass or child class of Animal
//Animal is a parent or superclass of Dog
//A class can specify one and only one class in its extends clause



