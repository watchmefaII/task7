public class Mammal extends Animal {
    private String order;

    public Mammal() {
        super();
        this.order = "Unknown";
    }

    public Mammal(String name, int age, int weight, String order) {
        super(name, age, weight);
        this.order = order;
    }

    public Mammal(String name, String order) {
        super(name);
        this.order = order;
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Mammal " + getName() + " is eating " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal makes a sound");
    }

    public void drinkMilk() {
        System.out.println("Mammal " + getName() + " is drinking milk.");
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + ", order='" + order + "'}";
    }
}