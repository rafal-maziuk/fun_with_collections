package excercise;

import java.util.*;

public class Party {

    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneToGuest = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    public void addGuest(){
        System.out.println("enter guest name: ");
        String name = scanner.nextLine();

        System.out.println("add preferred meal: ");
        String meal = scanner.nextLine();

        System.out.println("add phone number: ");
        // need int, reading String [next.Line()], so using Integer.valueOf
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("vegan? (Y/N)");
        String isVeganString = scanner.nextLine();

        boolean isVegan;
        if (isVeganString.equalsIgnoreCase("Y")){
            isVegan = true;
        } else {
            isVegan = false;
        }

        Guest guest = new Guest(name, meal, phoneNumber, isVegan);

        meals.add(meal);
        phoneToGuest.put(phoneNumber, guest);
        guests.add(guest);
    }

    public void displayMeals(){
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumber(){
        System.out.println("add phone number: ");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneToGuest.get(phoneNumber);

        guest.displayGuestinformation();
        System.out.println();
    }

    public void displayGuests(){
        for (Guest guest : guests) {
            guest.displayGuestinformation();
        }
    }
}
