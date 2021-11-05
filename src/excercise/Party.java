package excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party {

    private List<Guest> guests = new ArrayList<>();
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

        guests.add(guest);
    }

    public void displayGuests(){
        for (Guest guest : guests) {
            guest.displayGuestinformation();
        }
    }
}
