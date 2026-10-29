public abstract class Animal {
    private String name;
    private int age;
    private int weight;

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0;
    }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1;
    }

    public abstract void eat(String foodName);

    public abstract void getVoice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name='" + name + "', age=" + age + ", weight=" + weight;
    }
}