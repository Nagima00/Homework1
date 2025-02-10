public class Cat extends Animal{
    public Cat() {

    }

    public Cat(int id, String name, int age, int weight) {
        super(id, name, age, weight);
    }

    @Override
    public void run() {
        System.out.println("Cat: " + getName() + " is running");
    }
}
