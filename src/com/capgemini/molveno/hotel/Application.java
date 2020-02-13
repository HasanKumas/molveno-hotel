package com.capgemini.molveno.hotel;

import com.capgemini.molveno.hotel.model.Guest;
import com.capgemini.molveno.hotel.model.Payment;
import com.capgemini.molveno.hotel.model.Reservation;
import com.capgemini.molveno.hotel.model.Room;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Application {

    public static Scanner inputS = new Scanner(System.in);
    public static Scanner inputB = new Scanner(System.in);
    private static Reservation reservation = new Reservation();
    public static Scanner input = new Scanner(System.in);
    private static List<Room> rooms = new ArrayList<>();
    private static List<Guest> guests = new ArrayList<>();
    private static List<Reservation> reservations = new ArrayList<>();
    private static List<Payment> payments = new ArrayList<>();

    public static void main(String[] args) {
        createAllRooms();

        showMainMenu();
    }


    private static void showMainMenu() {
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

    private static void showMenu() {
        System.out.println("press `m` to go to main menu or `enter` to leave the program");
        if (inputS.nextLine().equals("m")) {
            showMainMenu();
        }
    }

    private static void makePayment(){
        Payment payment=new Payment();
        System.out.println("1.Card name:");
        payment.setCardName(inputS.nextLine());

        System.out.println("2.Card No:");
        payment.setCardNo(inputS.nextLine());

        System.out.println("3.Bill Adress:");
        payment.setBillAddress(inputS.nextLine());

       // System.out.println("4.Payment:");
       // payment.setCardExipry(inputS.nextLine());

        System.out.println("5.Reservation Number:");
        int resNumber= input.nextInt();

        payments.add(payment);
        System.out.println("The total price is: "+ reservations.get(resNumber-1).totalPrice());

    }
    private static void showPayments() {
        for (int i=0;i<payments.size(); i++){
            System.out.println("The Card name:"+payments.get(i).getCardName());
            System.out.println("The Card No:"+payments.get(i).getCardNo());
            System.out.println("The bill Adress:"+payments.get(i).getBillAddress());
            //System.out.println("Payment:"+payments.get(i).getCardExpiry());
        }
    }


    private static void createRoom() {
        Room room = new Room();
        System.out.println("CREATE A ROOM");

        System.out.println("1. Enter the room number: ");
        int roomNumber = input.nextInt();
        room.setRoomNumber(roomNumber);

        System.out.println("2. Enter the room size type(single, double, family, bride suite): ");
        String roomType = inputS.nextLine();
        room.setRoomSizeType(roomType);

        System.out.println("3. Enter the room budget type(budget, standard, luxury): ");
        String roomBudgetType = inputS.nextLine();
        room.setRoomBudgetType(roomBudgetType);

        System.out.println("4. Enter the room scene type(lake side, mountain side): ");
        String roomSceneType = inputS.nextLine();
        room.setRoomSceneType(roomSceneType);

        System.out.println("5. Enter the room availability(true or false): ");
        boolean roomAvailable = inputB.nextBoolean();
        room.setAvailable(roomAvailable);

        System.out.println("6. Enter the room max beds: ");
        int bedNumber = input.nextInt();
        room.setMaxBeds(bedNumber);


        System.out.println("7. Enter the room price: ");
        int roomPrice = input.nextInt();
        room.setRoomPrice(roomPrice);

        rooms.add(room);

        System.out.println("Room number: " + room.getRoomNumber());
        System.out.println("Room size type: " + room.getRoomSizeType());
        System.out.println("Room budget type: " + room.getRoomBudgetType());
        System.out.println("Room scene type: " + room.getRoomSceneType());
        System.out.println("Room availability: " + room.getAvailable());
        System.out.println("Number of beds: " + room.getMaxBeds());
        System.out.println("Room price: " + room.getRoomPrice());
    }

    private static void showRoom() {
        for (Room r : rooms) {
            System.out.println("Room number: " + r.getRoomNumber());
            System.out.println("Room size type: " + r.getRoomSizeType());
            System.out.println("Room budget type: " + r.getRoomBudgetType());
            System.out.println("Room scene type: " + r.getRoomSceneType());
            System.out.println("Room availability: " + r.getAvailable());
            System.out.println("Number of beds: " + r.getMaxBeds());
            System.out.println("Room price: " + r.getRoomPrice());
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


        System.out.println("4. Enter the room type (single, double, family, bride suite): ");
        String roomSizeType = inputS.nextLine();

        System.out.println("5. Enter the room type (standard, budget, luxury): ");
        String roomBudgetType = inputS.nextLine();

        System.out.println("6. Enter the room type (lake side, mountain side): ");
        String roomSceneType = inputS.nextLine();

//decide available room
        for (Room room : rooms) {
            if (room.getRoomSizeType().equals(roomSizeType) && room.getRoomBudgetType().equals(roomBudgetType) && room.getRoomSceneType().equals(roomSceneType) && (room.getMaxBeds() == numOfGuests) && room.getAvailable()) {
                room.setAvailable(false);
                reservation.setRoomsReserved(room);
                //reservation.setReservationNumber(i);
                //
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
        }
    }

//    private static int calculatePrice(int i){
//        return reservations.get(i).getRoomsReserved().getRoomPrice()*reservations.;
//    }
    private static void createAllRooms() {
        int maxRooms = 130;
        for (int i = 0; i < maxRooms; i++) {
            rooms.add(new Room());
        }
        //single rooms
        for (int i = 0; i < 50; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("single");
            rooms.get(i).setRoomBudgetType("budget");
            rooms.get(i).setRoomSceneType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(1);
            rooms.get(i).setRoomPrice(50);
        }

        //double rooms
        for (int i = 50; i < 130; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("double");
            rooms.get(i).setRoomBudgetType("budget");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(80);
        }
//            //family rooms
//            for (int i = 130; i < 170; i++) {
//                rooms.get(i).setRoomNumber(i + 1);
//                rooms.get(i).setRoomType("family");
//                rooms.get(i).setAvailable(true);
//                rooms.get(i).setMaxBeds(3);
//                rooms.get(i).setRoomPrice(110);
//            }
//            //standard rooms
//            for (int i = 170; i < 200; i++) {
//                rooms.get(i).setRoomNumber(i + 1);
//                rooms.get(i).setRoomType("standard");
//                rooms.get(i).setAvailable(true);
//                rooms.get(i).setMaxBeds(2);
//                rooms.get(i).setRoomPrice(60);
//            }
//            //budget rooms
//            for (int i = 200; i < 250; i++) {
//                rooms.get(i).setRoomNumber(i + 1);
//                rooms.get(i).setRoomType("budget");
//                rooms.get(i).setAvailable(true);
//                rooms.get(i).setMaxBeds(2);
//                rooms.get(i).setRoomPrice(55);
//            }
//            //luxury rooms
//            for (int i = 250; i < 270; i++) {
//                rooms.get(i).setRoomNumber(i + 1);
//                rooms.get(i).setRoomType("luxury");
//                rooms.get(i).setAvailable(true);
//                rooms.get(i).setMaxBeds(4);
//                rooms.get(i).setRoomPrice(170);
//            }
//            //bride suite rooms
//            for (int i = 270; i < 275; i++) {
//                rooms.get(i).setRoomNumber(i + 1);
//                rooms.get(i).setRoomType("bride suite");
//                rooms.get(i).setAvailable(true);
//                rooms.get(i).setMaxBeds(2);
//                rooms.get(i).setRoomPrice(200);
//            }
//            //mountain side
//            for (int i = 275; i < 283; i++) {
//                rooms.get(i).setRoomNumber(i + 1);
//                rooms.get(i).setRoomType("mountain side");
//                rooms.get(i).setAvailable(true);
//                rooms.get(i).setMaxBeds(2);
//                rooms.get(i).setRoomPrice(190);
//            }
//            //lake side
//            for (int i = 283; i < 285; i++) {
//                rooms.get(i).setRoomNumber(i + 1);
//                rooms.get(i).setRoomType("lake side");
//                rooms.get(i).setAvailable(true);
//                rooms.get(i).setMaxBeds(2);
//                rooms.get(i).setRoomPrice(190);
//            }
//            //shows created rooms
//            for (int k = 0; k < 285; k++) {
//                System.out.println("The room number: " + rooms.get(k).getRoomNumber());
//                System.out.println("The room type: " + rooms.get(k).getRoomType());
//                System.out.println("The max beds: " + rooms.get(k).getMaxBeds());
//                System.out.println("Is the room available: " + rooms.get(k).getAvailable());
//                System.out.println("The room price: " + rooms.get(k).getRoomPrice());
//            }
//            System.out.println("285 rooms created..");
//        }

    }
}
