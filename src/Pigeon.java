public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String featherColor, String species) {
        super(name, featherColor);
        this.species = species;
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Pigeon " + getName() + " is pecking breadcrumbs and " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Pigeon " + getName() + " coos: Coo-coo!");
    }

    public void deliverMail() {
        System.out.println("Pigeon " + getName() + " is delivering a letter.");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon{" + super.toString() + ", species='" + species + "'}";
    }
}