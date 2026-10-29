public class Fish extends Animal {
    private String scaleColor;

    public Fish() {
        super();
        this.scaleColor = "Unknown";
    }

    public Fish(String name, int age, int weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(String name, String scaleColor) {
        super(name);
        this.scaleColor = scaleColor;
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Fish " + getName() + " is swallowing " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Fish makes bubbling sounds (blub blub)");
    }

    public void swim() {
        System.out.println("Fish " + getName() + " is swimming.");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    @Override
    public String toString() {
        return "Fish{" + super.toString() + ", scaleColor='" + scaleColor + "'}";
    }
}