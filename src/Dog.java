public class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, int weight, String order, String breed) {
        super(name, age, weight, order);
        this.breed = breed;
    }

    public Dog(String name, String order, String breed) {
        super(name, order);
        this.breed = breed;
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Dog " + getName() + " is crunching " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Dog " + getName() + " barks: Woof! Woof!");
    }

    public void aport() {
        System.out.println("Dog " + getName() + " is fetching the stick.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", breed='" + breed + "'}";
    }
}