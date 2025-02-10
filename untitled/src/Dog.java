public class Dog extends Animal{
    public Dog() {

    }

    public Dog(int id, String name, int age, int weight) {
        super(id, name, age, weight);
    }

    @Override
    public void run() {
        System.out.println("Dog: " + getName() + " is running");
    }
}
