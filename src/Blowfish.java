public class Blowfish extends Fish {
    private int diameter;

    public Blowfish() {
        super();
        this.diameter = 0;
    }

    public Blowfish(String name, int age, int weight, String scaleColor, int diameter) {
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }

    public Blowfish(String name, String scaleColor, int diameter) {
        super(name, scaleColor);
        this.diameter = diameter;
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Blowfish " + getName() + " is eating " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Blowfish " + getName() + " makes silent water puffs");
    }

    public void inflate() {
        System.out.println("Blowfish " + getName() + " inflated to " + diameter + " cm!");
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Blowfish{" + super.toString() + ", diameter=" + diameter + "}";
    }
}