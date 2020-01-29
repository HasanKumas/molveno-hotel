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
    private static Reservation reservation = new Reservation();
    public static Scanner input = new Scanner(System.in);
    private static List<Room> rooms = new ArrayList<>();
    private static List<Guest> guests = new ArrayList<>();

    public static void main(String[] args)  {
        createAllRooms();

        showMainMenu();
    }


    private  static  void showMainMenu() {
            System.out.println("MAIN MENU FOR RESERVATION-HOTEL MOLVENO");
            System.out.println("1. Create a guest");
            System.out.println("2. Make a reservation for a room");
            System.out.println("3. Make a payment");

            System.out.println("Choose your option number and press enter");
            int mainOption = input.nextInt();

            switch (mainOption) {
                case 1: //create a guest
                    createGuest();
                    System.out.println("press `m` to go to main menu or `enter` to leave the program");
                    if(inputS.nextLine().equals("m"))
                        showMainMenu();
                    break;
                case 2://make a reservation
                    makeReservation();
                    System.out.println("press `m` to go to main menu or `enter` to leave the program");
                    if(inputS.nextLine().equals("m"))
                        showMainMenu();
                    break;
                case 3://make a payment
                    //put here payment method
                    System.out.println("press `m` to go to main menu or `enter` to leave the program");
                    if(inputS.nextLine().equals("m"))
                        showMainMenu();
                    break;
                default:
                    System.out.println("please select a valid option");
                    showMainMenu();

            }
    }

    private static void createGuest(){
        System.out.println("MAKE A RESERVATION");

        System.out.println("1. Enter the name of the guest: ");
        String guestName="guest";
        guestName = inputS.nextLine();
        reservation.setGuest(new Guest(guestName));


        System.out.println("2. Enter Check in date: ");
        String checkIDate = inputS.nextLine();
        DateTimeFormatter formattedCheckIn = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime checkInDate = LocalDateTime.parse(checkIDate, formattedCheckIn);
        reservation.setCheckInDate(checkInDate);

        System.out.println("3. Enter Check out date: ");
        String checkODate = inputS.nextLine();
        DateTimeFormatter formattedCheckOut = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime checkOutDate = LocalDateTime.parse(checkODate, formattedCheckOut);
        reservation.setCheckOutDate(checkOutDate);


        System.out.println("4. Enter number of guests: ");
        int numOfGuests = input.nextInt();
        reservation.setNumOfGuests(numOfGuests);
    }
    private static void makeReservation() {

            System.out.println("MAKE A RESERVATION");

            System.out.println("1. Enter the name of the guest: ");
            String guestName="guest";
            guestName = inputS.nextLine();
            reservation.setGuest(new Guest(guestName));


            System.out.println("2. Enter Check in date: ");
            String checkIDate = inputS.nextLine();
            DateTimeFormatter formattedCheckIn = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            LocalDateTime checkInDate = LocalDateTime.parse(checkIDate, formattedCheckIn);
            reservation.setCheckInDate(checkInDate);

            System.out.println("3. Enter Check out date: ");
            String checkODate = inputS.nextLine();
            DateTimeFormatter formattedCheckOut = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            LocalDateTime checkOutDate = LocalDateTime.parse(checkODate, formattedCheckOut);
            reservation.setCheckOutDate(checkOutDate);


            System.out.println("4. Enter number of guests: ");
            int numOfGuests = input.nextInt();
            reservation.setNumOfGuests(numOfGuests);


            System.out.println("5. Enter the room type (single, double, family, bride suite, standard, budget, luxury, lake side, mountain side): ");
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
                System.out.println("The room " + reservedRoomNumber + " is reserved for " + reservation.getGuest().getName());
                System.out.println(reservation.getCheckInDate());
                System.out.println(reservation.getCheckOutDate());
                System.out.println(reservation.getNumOfGuests());
                System.out.println(reservation.getRoomsReserved().getRoomNumber());
                System.out.println(reservation.getGuest().getName());
            }
//                rooms.get(i).setCheckInTime(LocalDateTime.of(2020, 1,31, 14, 30));
//                rooms.get(i).setCheckOutTime(LocalDateTime.of(2020, 2,4, 14, 30));
//                rooms.get(i).setAvailable(false);

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

            System.out.println("285 rooms created..");
        }

    }

}
