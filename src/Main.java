public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Mammal("Bear", 5, 250, "Carnivora");
        animals[1] = new Dog("Rex", 3, 30, "Carnivora", "German Shepherd");
        animals[2] = new Bird("Eagle", "Brown");
        animals[3] = new Pigeon("Sky", 2, 1, "Grey", "Rock Pigeon");
        animals[4] = new Fish();
        animals[5] = new Blowfish("Puffy", "Yellow", 25);

        animals[4].setName("Goldie");

        for (int i = 0; i < animals.length; i++) {
            System.out.println("--- Index " + i + " ---");
            System.out.println(animals[i].toString());
            animals[i].getVoice();
            animals[i].eat("food");
        }

        System.out.println("\n--- Calling specific methods ---");
        ((Mammal) animals[0]).drinkMilk();
        ((Dog) animals[1]).aport();
        ((Bird) animals[2]).fly();
        ((Pigeon) animals[3]).deliverMail();
        ((Fish) animals[4]).swim();
        ((Blowfish) animals[5]).inflate();
    }
}