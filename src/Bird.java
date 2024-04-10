public class Bird {
    private String species;
    private int age;
    private float wingspan;
    private boolean canFly;
    private String favoriteFood;

    public Bird(String species, int age, float wingspan, boolean canFly, String favoriteFood) {
        this.species = species;
        this.age = age;
        this.wingspan = wingspan;
        this.canFly = canFly;
        this.favoriteFood = favoriteFood;
    }

    public void sing() {
        System.out.println("Chirp-chirp");
    }

    public String attemptFlight() {
        return canFly == true ? "The bird flies!" : "This bird can't fly!";
    }

    public void displayInfo() {
        System.out.println("Species: " + this.species);
        System.out.println("Age: " + this.age);
        System.out.println("Wingspan: " + this.wingspan);
        System.out.println("Can fly: " + this.canFly);
        System.out.println("Favorite food: " + this.favoriteFood);
    }
}
