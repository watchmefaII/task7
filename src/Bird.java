public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Bird " + getName() + " is pecking " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Bird chirps");
    }

    public void fly() {
        System.out.println("Bird " + getName() + " is flying.");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Bird{" + super.toString() + ", featherColor='" + featherColor + "'}";
    }
}