package com.capgemini.molveno.hotel;


import com.capgemini.molveno.hotel.model.Guest;
import com.capgemini.molveno.hotel.model.Payment;
import com.capgemini.molveno.hotel.model.Reservation;
import com.capgemini.molveno.hotel.model.Room;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import static com.capgemini.molveno.hotel.model.Menu.showMenu;
import static com.capgemini.molveno.hotel.model.RoomFactory.*;

public class Application {

    public static Scanner inputS = new Scanner(System.in);
    //public static Scanner inputB = new Scanner(System.in);
    //private static Reservation reservation = new Reservation();
    public static Scanner input = new Scanner(System.in);
    private static List<Guest> guests = new ArrayList<>();
    private static List<Reservation> reservations = new ArrayList<>();
    private static List<Payment> payments = new ArrayList<>();

    public static void main(String[] args) {
        createAllRooms();

        showMainMenu();
    }
    public static void showMainMenu() {
        System.out.println("                   __          __    _                                 _______                              \n" +
                "                   \\ \\        / /   | |                               |__   __|                             \n" +
                "                    \\ \\  /\\  / /___ | |  ___  ___   _ __ ___    ___      | |  ___                           \n" +
                "                     \\ \\/  \\/ // _ \\| | / __|/ _ \\ | '_ ` _ \\  / _ \\     | | / _ \\                          \n" +
                "                      \\  /\\  /|  __/| || (__| (_) || | | | | ||  __/     | || (_) |                         \n" +
                "                       \\/  \\/  \\___||_| \\___|\\___/ |_| |_| |_| \\___|     |_| \\___/                          \n" +
                "  _    _         _         _    __  __         _                             _____                          \n" +
                " | |  | |       | |       | |  |  \\/  |       | |                           |  __ \\                         \n" +
                " | |__| |  ___  | |_  ___ | |  | \\  / |  ___  | |__   __ ___  _ __    ___   | |  | |  ___  _ __ ___    ___  \n" +
                " |  __  | / _ \\ | __|/ _ \\| |  | |\\/| | / _ \\ | |\\ \\ / // _ \\| '_ \\  / _ \\  | |  | | / _ \\| '_ ` _ \\  / _ \\ \n" +
                " | |  | || (_) || |_|  __/| |  | |  | || (_) || | \\ V /|  __/| | | || (_) | | |__| ||  __/| | | | | || (_) |\n" +
                " |_|  |_| \\___/  \\__|\\___||_|  |_|  |_| \\___/ |_|  \\_/  \\___||_| |_| \\___/  |_____/  \\___||_| |_| |_| \\___/ \n" +
                "                                                                                                            \n" +
                "                                                                                                            ");
        System.out.println("MAIN MENU FOR RESERVATION-HOTEL MOLVENO");
        System.out.println("1. Create a guest");
        System.out.println("2. Make a reservation for a room");
        System.out.println("3. Make a payment");
        System.out.println("4. Show guest list");
        System.out.println("5. Create a room");
        System.out.println("6. Show room list");
        System.out.println("7. Show reservations list");
        System.out.println("8. Show payment");

        System.out.println("Choose your option number and press enter");
        String mainOption = input.next();

        switch (mainOption) {
            case "1": //create a guest
                createGuest();
                showMenu();
                break;
            case "2"://make a reservation
                makeReservation();
                showMenu();
                break;
            case "3"://make a payment
                makePayment();
                showMenu();
                break;
            case "4"://show guest list
                showGuestList();
                showMenu();
                break;
            case "5"://create room
                createRoom();
                showMenu();
                break;
            case "6"://create room
                showRoom();
                showMenu();
                break;
            case "7"://show reservations list
                showReservationsList();
                showMenu();
                break;
            case "8"://show a payment
                showPayments();
                showMenu();
                break;
            default:
                System.out.println("you did not select right number. Please select right number");
                showMenu();

        }
    }

    private static void makePayment(){
        Payment payment=new Payment();
        System.out.println("PAYMENT INFORMATION");
        System.out.println("1.Reservation Number:");
        int resNumber= input.nextInt();

        System.out.println("The total price to be paid is: "+ reservations.get(resNumber-1).totalPrice());
        payment.setTotalPayment(reservations.get(resNumber-1).totalPrice());

        System.out.println("Please enter payment information");
        System.out.println("1.Card name:");
        payment.setCardName(inputS.nextLine());

        System.out.println("2.Card No:");
        payment.setCardNo(inputS.nextLine());

        System.out.println("3.Bill Adress:");
        payment.setBillAddress(inputS.nextLine());

        System.out.println("Your payment has been completed..");
        payments.add(payment);

    }
    private static void showPayments() {
        System.out.println("Payment List Information");
        for (int i=0;i<payments.size(); i++){
            System.out.println("The Card name:"+payments.get(i).getCardName());
            System.out.println("The Card No:"+payments.get(i).getCardNo());
            System.out.println("Total amount paid: "+payments.get(i).getTotalPayment());
            System.out.println("The bill Adress:"+payments.get(i).getBillAddress());
        }
    }

    private static void createGuest() {
        Guest guest = new Guest();

        System.out.println("CREATE A GUEST");

        System.out.println("1. Enter the name of the guest: ");
        String guestName = "guest";
        guestName = inputS.nextLine();
        guest.setName(guestName);
//        guests.get(guests.indexOf(guest)).setName(guestName);

        System.out.println("2. Enter the last name of the guest: ");
        String guestLastName = "guest";
        guestLastName = inputS.nextLine();
        guest.setLastName(guestLastName);
//        guests.get(guests.indexOf(guest)).setName(guestLastName);

        System.out.println("3. Enter the address of the guest: ");
        String guestAddress = "guest";
        guestAddress = inputS.nextLine();
        guest.setAddress(guestAddress);
//        guests.get(guests.indexOf(guest)).setName(guestAddress);

        System.out.println("4. Enter the phone number of the guest: ");
        String guestTel = "guest";
        guestTel = inputS.nextLine();
        guest.setTel(guestTel);
//        guests.get(guests.indexOf(guest)).setName(guestTel);

        System.out.println("5. Enter the email of the guest: ");
        String guestEmail = "guest";
        guestEmail = inputS.nextLine();
        guest.setEmail(guestEmail);
//        guests.get(guests.indexOf(guest)).setName(guestEmail);
        guests.add(guest);

        //Listing just created guest
        System.out.println("The guest " + guest.getName() + " is added to database");
        System.out.println("The last name of the guest: " + guest.getLastName());
        System.out.println("The address of the guest: " + guest.getAddress());
        System.out.println("The phone number of the guest: " + guest.getTel());
        System.out.println("The email of the guest: " + guest.getEmail());

    }

    private static void showGuestList() {
        //Listing all created guests
        if (guests.size() > 0) {
            for (int i = 0; i < guests.size(); i++) {
                System.out.println("The name of the guest: " + guests.get(i).getName());
                System.out.println("The last name of the guest: " + guests.get(i).getLastName());
                System.out.println("The address of the guest: " + guests.get(i).getAddress());
                System.out.println("The phone number of the guest: " + guests.get(i).getTel());
                System.out.println("The email of the guest: " + guests.get(i).getEmail());
            }
        } else {
            System.out.println("There is no guest...");
        }
    }

    private static void showReservationsList() {
        for (Reservation reservation : reservations) {
            System.out.println("LIST OF RESERVATIONS ");
            System.out.println("The last name is: "+ reservation.getGuest().getLastName());
            System.out.println("The name is: "+reservation.getGuest().getName());
            System.out.println("The check in date is: "+reservation.getCheckInDate());
            System.out.println("The check out date is: "+reservation.getCheckOutDate());
            System.out.println("The number of guest is/are: "+reservation.getNumOfGuests());
            System.out.println("The reserved room number is: "+reservation.getRoomsReserved().getRoomNumber());


        }
    }

    private static void makeReservation() {
        Reservation reservation = new Reservation();
        System.out.println("MAKE A RESERVATION");

        boolean success = false;

        do {
            System.out.println("1. Enter Check in date: ");
            String checkIDate = inputS.nextLine();
            DateTimeFormatter formattedCheckIn = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            try {
                LocalDateTime checkInDate = LocalDateTime.parse(checkIDate, formattedCheckIn);
                reservation.setCheckInDate(checkInDate);
                success = true;
            } catch (DateTimeParseException e) {
                System.out.println("Try Again");
            }
        } while (!success);

        success = false;

        do {

            System.out.println("2. Enter Check out date: ");
            String checkODate = inputS.nextLine();
            DateTimeFormatter formattedCheckOut = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            try {
                LocalDateTime checkOutDate = LocalDateTime.parse(checkODate, formattedCheckOut);
                reservation.setCheckOutDate(checkOutDate);
                success = true;
            } catch (DateTimeParseException e) {
                System.out.println("Try again");
            }
        }
        while (!success);


        System.out.println("3. Enter number of guests: ");
        int numOfGuests = input.nextInt();
        reservation.setNumOfGuests(numOfGuests);


        System.out.println("4. Enter the room size type (single, double, family, bride suite): ");
        String roomSizeType = inputS.nextLine();

        System.out.println("5. Enter the room budget type (standard, budget, luxury): ");
        String roomBudgetType = inputS.nextLine();

        System.out.println("6. Enter the room scene type (lake side, mountain side): ");
        String roomSceneType = inputS.nextLine();

//decide available room
        for (Room room : rooms) {
            if (room.getRoomSizeType().equals(roomSizeType) && room.getRoomBudgetType().equals(roomBudgetType) && room.getRoomSceneType().equals(roomSceneType) && (room.getMaxBeds() == numOfGuests) && room.getAvailable()) {
                room.setAvailable(false);
                reservation.setRoomsReserved(room);
                break;
            }

        }
        if (reservation.getRoomsReserved() == null) {
            System.out.println("There is no available room for your choice..");
        } else {
            int reservedRoomNumber = reservation.getRoomsReserved().getRoomNumber();
            System.out.println("The room " + reservedRoomNumber + " is available for reservation ");
            System.out.println("Check In Date: " + reservation.getCheckInDate());
            System.out.println("Check Out Date: " + reservation.getCheckOutDate());
            System.out.println("Number of Guests: " + reservation.getNumOfGuests());


            System.out.println("Guest information");
            Guest guest = new Guest();
            System.out.println("1. Enter the Last name of the guest: ");
            String guestLastName = inputS.nextLine();
            guest.setLastName(guestLastName);
            System.out.println("2. Enter the first name of the guest: ");

            String guestName = inputS.nextLine();
            guest.setName(guestName);

            reservation.setGuest(guest);
            //reservation.setReservationNumber(i);
            reservations.add(reservation);
            System.out.println("The room " + reservedRoomNumber + " is reserved for " +guest.getLastName() + " " +guest.getName());
            System.out.println("Your reservation number is: "+ reservation.getReservationNumber());
        }
    }

}
