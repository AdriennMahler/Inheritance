public class Dog extends Animal {
    //there is no default constructor available
    //we created an explicit two parameter constructor --> default constructor
    // was not created automatically

    private String earShape;
    private String tailShape;

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }
    public Dog(){
        super("Mutt","Big",50); //using animals constructor to crate dog attributes
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight<15? "small": (weight<35? "medium":"large "), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed); //call the parent class method
        //add extra code
       // System.out.println("Dogs walk, run and wag their tails");
        if (speed=="slow") {
            walk();
            wagtail();
        }else{
            run();
            bark();
        }
    }

    //this makeNoise method will be called not from the Animal class method
    //overrides the method
    public void makeNoise(){
        if(type=="Wolf"){ //type private-->protected
            System.out.print("Wo oooooow");
        }
        bark(); //Woof!
        System.out.println();
    }
    private void bark(){
        System.out.println("Woof! ");
    }
    private void run(){
        System.out.println("Dog running");
    }
    private void walk(){
        System.out.println("Dog walking");
    }
    private void wagtail(){
        System.out.println("Dog wags tail");
    }
    //error empty constructor super()
        // it is a way to call a constructor on a parent class or super class
        // super() calls the default constructor but the parent class have an explicit
        //constructor --> compiler error
        //it has to be the first statement of the constructor
        // this() and super() can never be called from the same constructor
        //if we do not make a call on super, then Java makes it for us using super's default constructor
        //if your class does not have a default constructor --> you must explicitly call super()
        // in all of your constructors, passing the right arguments to that constructor
    }

