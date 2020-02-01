package com.capgemini.molveno.hotel;

import com.capgemini.molveno.hotel.model.Guest;
import com.capgemini.molveno.hotel.model.Reservation;
import com.capgemini.molveno.hotel.model.Room;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Application {

    public static Scanner inputS = new Scanner(System.in);
    public static Scanner inputB = new Scanner(System.in);
    private static Reservation reservation = new Reservation();
    public static Scanner input = new Scanner(System.in);
    private static List<Room> rooms = new ArrayList<>();
    private static List<Guest> guests = new ArrayList<>();

    public static void main(String[] args)  {
//        createAllRooms();

        showMainMenu();
    }


    private  static  void showMainMenu() {
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

            System.out.println("Choose your option number and press enter");
            int mainOption = input.nextInt();

            switch (mainOption) {
                case 1: //create a guest
                    createGuest();
                    showMenu();
                    break;
                case 2://make a reservation
                    makeReservation();
                    showMenu();
                    break;
                case 3://make a payment
                    makePayment();
                    showMenu();
                    break;
                case 4://show guest list
                    showGuestList();
                    showMenu();
                    break;
                case 5://create room
                    createRoom();
                    showMenu();
                    break;
                case 6://create room
                    showRoom();
                    showMenu();
                    break;
                default:
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
        System.out.println("under construction...");
    }
    private static void createRoom() {
        Room room=new Room();
        System.out.println("CREATE A ROOM");

        System.out.println("1. Enter the room number: ");
        int roomNumber= input.nextInt();
        room.setRoomNumber(roomNumber);

        System.out.println("2. Enter the room type: ");
        String roomType= inputS.nextLine();
        room.setRoomType(roomType);

        System.out.println("3. Enter the room availability: ");
        boolean roomAvailable= inputB.nextBoolean();
        room.setAvailable(roomAvailable);

        System.out.println("4. Enter the room max beds: ");
        int bedNumber= input.nextInt();
        room.setMaxBeds(bedNumber);


        System.out.println("5. Enter the room price: ");
        int roomPrice= input.nextInt();
        room.setRoomPrice(roomPrice);

        rooms.add(room);

        System.out.println("Room number: "+ room.getRoomNumber());
        System.out.println("Room type: "+ room.getRoomType());
        System.out.println("Room availability: " + room.getAvailable());
        System.out.println("Number of beds: "+ room.getMaxBeds());
        System.out.println("Room price: "+  room.getRoomPrice());
    }
    private  static void showRoom(){
        for (Room r: rooms) {
            System.out.println("Room number: "+ r.getRoomNumber());
            System.out.println("Room type: "+ r.getRoomType());
            System.out.println("Room availability: " + r.getAvailable());
            System.out.println("Number of beds: "+ r.getMaxBeds());
            System.out.println("Room price: "+ r.getRoomPrice());
        }
    }

    private static void createGuest(){
        Guest guest=new Guest();

        System.out.println("CREATE A GUEST");

        System.out.println("1. Enter the name of the guest: ");
        String guestName="guest";
        guestName = inputS.nextLine();
        guest.setName(guestName);
//        guests.get(guests.indexOf(guest)).setName(guestName);

        System.out.println("2. Enter the last name of the guest: ");
        String guestLastName="guest";
        guestLastName = inputS.nextLine();
        guest.setLastName(guestLastName);
//        guests.get(guests.indexOf(guest)).setName(guestLastName);

        System.out.println("3. Enter the address of the guest: ");
        String guestAddress="guest";
        guestAddress = inputS.nextLine();
        guest.setAddress(guestAddress);
//        guests.get(guests.indexOf(guest)).setName(guestAddress);

        System.out.println("4. Enter the phone number of the guest: ");
        String guestTel="guest";
        guestTel = inputS.nextLine();
        guest.setTel(guestTel);
//        guests.get(guests.indexOf(guest)).setName(guestTel);

        System.out.println("5. Enter the email of the guest: ");
        String guestEmail="guest";
        guestEmail = inputS.nextLine();
        guest.setEmail(guestEmail);
//        guests.get(guests.indexOf(guest)).setName(guestEmail);
        guests.add(guest);

        //Listing just created guest
        System.out.println("The guest " + guest.getName() + " is added to database" );
        System.out.println("The last name of the guest: "+ guest.getLastName());
        System.out.println("The address of the guest: "+ guest.getAddress());
        System.out.println("The phone number of the guest: "+ guest.getTel());
        System.out.println("The email of the guest: "+ guest.getEmail());

    }

    private static void showGuestList() {
        //Listing all created guests
        if (guests.size()>0) {
            for (int i = 0; i < guests.size(); i++) {
                System.out.println("The name of the guest: "+ guests.get(i).getName());
                System.out.println("The last name of the guest: "+ guests.get(i).getLastName());
                System.out.println("The address of the guest: "+ guests.get(i).getAddress());
                System.out.println("The phone number of the guest: "+ guests.get(i).getTel());
                System.out.println("The email of the guest: "+ guests.get(i).getEmail());
            }
        }
        else {
            System.out.println("There is no guest...");
        }
    }
    private static void makeReservation() {

            System.out.println("MAKE A RESERVATION");
            Guest guest=new Guest();
            System.out.println("1. Enter the name of the guest: ");
            String guestName = inputS.nextLine();
            guest.setName(guestName);

            System.out.println("2. Enter the last name of the guest: ");
            String guestLastName = inputS.nextLine();
            guest.setLastName(guestLastName);
            reservation.setGuest(guest);


            System.out.println("3. Enter Check in date: ");
            String checkIDate = inputS.nextLine();
            DateTimeFormatter formattedCheckIn = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            LocalDateTime checkInDate = LocalDateTime.parse(checkIDate, formattedCheckIn);
            reservation.setCheckInDate(checkInDate);

            System.out.println("4. Enter Check out date: ");
            String checkODate = inputS.nextLine();
            DateTimeFormatter formattedCheckOut = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            LocalDateTime checkOutDate = LocalDateTime.parse(checkODate, formattedCheckOut);
            reservation.setCheckOutDate(checkOutDate);


            System.out.println("5. Enter number of guests: ");
            int numOfGuests = input.nextInt();
            reservation.setNumOfGuests(numOfGuests);


            System.out.println("6. Enter the room type (single, double, family, bride suite, standard, budget, luxury, lake side, mountain side): ");
            String roomType = inputS.nextLine();


            for (Room room : rooms) {
                if (room.getRoomType().equals(roomType)  && (room.getMaxBeds()== numOfGuests) && room.getAvailable()) {
                    room.setAvailable(false);
                    reservation.setRoomsReserved(room);
                    break;
                }

            }
            if (reservation.getRoomsReserved() == null) {
                System.out.println("There is no available room for your choice..");
            } else {
                int reservedRoomNumber = reservation.getRoomsReserved().getRoomNumber();
                System.out.println("The room " + reservedRoomNumber + " is reserved for " + reservation.getGuest().getName()+ " "+ reservation.getGuest().getLastName());
                System.out.println("Check In Date: "+ reservation.getCheckInDate());
                System.out.println("Check Out Date: "+reservation.getCheckOutDate());
                System.out.println("Number of Guests: "+ reservation.getNumOfGuests());
            }

    }
    private static void createAllRooms(){
        int maxRooms = 285;
        for (int i = 0; i < maxRooms; i++) {
            rooms.add(new Room());
        }
        //single rooms
        for (int i = 0; i < 50; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomType("single");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(1);
            rooms.get(i).setRoomPrice(50);
        }

        //double rooms
        for (int i = 50; i < 130; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomType("double");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(80);
        }
        //family rooms
        for (int i = 130; i < 170; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomType("family");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(3);
            rooms.get(i).setRoomPrice(110);
        }
        //standard rooms
        for (int i = 170; i < 200; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomType("standard");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(60);
        }
        //budget rooms
        for (int i = 200; i < 250; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomType("budget");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(55);
        }
        //luxury rooms
        for (int i = 250; i < 270; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomType("luxury");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(4);
            rooms.get(i).setRoomPrice(170);
        }
        //bride suite rooms
        for (int i = 270; i < 275; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomType("bride suite");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(200);
        }
        //mountain side
        for (int i = 275; i < 283; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(190);
        }
        //lake side
        for (int i = 283; i < 285; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(190);
        }
        //shows created rooms
        for (int k = 0; k < 285; k++) {
            System.out.println("The room number: " + rooms.get(k).getRoomNumber());
            System.out.println("The room type: " + rooms.get(k).getRoomType());
            System.out.println("The max beds: " + rooms.get(k).getMaxBeds());
            System.out.println("Is the room available: " + rooms.get(k).getAvailable());
            System.out.println("The room price: " + rooms.get(k).getRoomPrice());
        }
        System.out.println("285 rooms created..");
    }

}
