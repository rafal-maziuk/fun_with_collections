package excercise;

public class Guest {

    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void displayGuestinformation(){
        System.out.println("Name: " + name);
        System.out.println("Meal: " + meal);
        System.out.println("Phone numbcer: " + phoneNumber);
        String isVeganString = isVegan ? "yes" : "no";
        System.out.println("Vegan? " + isVeganString);
    }
}
