package com.capgemini.molveno.hotel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoomFactory {
    public static List<Room> rooms = new ArrayList<>();
    public static Scanner inputS = new Scanner(System.in);
    public static Scanner inputB = new Scanner(System.in);
    public static Scanner input = new Scanner(System.in);

    public static void createRoom() {
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

    public static void showRoom() {
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
    public static void createAllRooms() {
        int maxRooms = 295;
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
            rooms.get(i).setRoomPrice(45);
        }
        for (int i = 50; i < 70; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("single");
            rooms.get(i).setRoomBudgetType("standard");
            rooms.get(i).setRoomSceneType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(1);
            rooms.get(i).setRoomPrice(55);
        }
        for (int i = 70; i < 90; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("single");
            rooms.get(i).setRoomBudgetType("standard");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(1);
            rooms.get(i).setRoomPrice(50);
        }
        for (int i = 90; i < 100; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("single");
            rooms.get(i).setRoomBudgetType("budget");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(1);
            rooms.get(i).setRoomPrice(40);
        }
        for (int i = 100; i < 110; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("single");
            rooms.get(i).setRoomBudgetType("luxury");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(1);
            rooms.get(i).setRoomPrice(70);
        }
        for (int i = 110; i < 120; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("single");
            rooms.get(i).setRoomBudgetType("luxury");
            rooms.get(i).setRoomSceneType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(1);
            rooms.get(i).setRoomPrice(80);
        }

        //double rooms
        for (int i = 120; i < 150; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("double");
            rooms.get(i).setRoomBudgetType("budget");
            rooms.get(i).setRoomSceneType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(90);
        }
        for (int i = 150; i < 170; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("double");
            rooms.get(i).setRoomBudgetType("standard");
            rooms.get(i).setRoomSceneType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(95);
        }
        for (int i = 170; i < 190; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("double");
            rooms.get(i).setRoomBudgetType("standard");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(100);
        }
        for (int i = 190; i < 200; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("double");
            rooms.get(i).setRoomBudgetType("budget");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(90);
        }
        for (int i = 200; i < 210; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("double");
            rooms.get(i).setRoomBudgetType("luxury");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(110);
        }
        for (int i = 210; i < 220; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("double");
            rooms.get(i).setRoomBudgetType("luxury");
            rooms.get(i).setRoomSceneType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(120);
        }
//            //family rooms
        for (int i = 220; i < 230; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("family");
            rooms.get(i).setRoomBudgetType("budget");
            rooms.get(i).setRoomSceneType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(3);
            rooms.get(i).setRoomPrice(130);
        }
        for (int i = 230; i < 240; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("family");
            rooms.get(i).setRoomBudgetType("standard");
            rooms.get(i).setRoomSceneType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(4);
            rooms.get(i).setRoomPrice(140);
        }
        for (int i = 240; i < 250; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("family");
            rooms.get(i).setRoomBudgetType("standard");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(4);
            rooms.get(i).setRoomPrice(150);
        }
        for (int i = 250; i < 260; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("family");
            rooms.get(i).setRoomBudgetType("budget");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(4);
            rooms.get(i).setRoomPrice(145);
        }
        for (int i = 260; i < 270; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("family");
            rooms.get(i).setRoomBudgetType("luxury");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(3);
            rooms.get(i).setRoomPrice(150);
        }
        for (int i = 270; i < 280; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("family");
            rooms.get(i).setRoomBudgetType("luxury");
            rooms.get(i).setRoomSceneType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(3);
            rooms.get(i).setRoomPrice(160);
        }
//            //bride suite rooms
        for (int i = 280; i < 282; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("bride suite");
            rooms.get(i).setRoomBudgetType("budget");
            rooms.get(i).setRoomSceneType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(145);
        }
        for (int i = 282; i < 285; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("bride suite");
            rooms.get(i).setRoomBudgetType("standard");
            rooms.get(i).setRoomSceneType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(155);
        }
        for (int i = 285; i < 288; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("bride suite");
            rooms.get(i).setRoomBudgetType("standard");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(155);
        }
        for (int i = 288; i < 290; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("bride suite");
            rooms.get(i).setRoomBudgetType("budget");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(150);
        }
        for (int i = 290; i < 292; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("bride suite");
            rooms.get(i).setRoomBudgetType("luxury");
            rooms.get(i).setRoomSceneType("mountain side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(170);
        }
        for (int i = 292; i < 295; i++) {
            rooms.get(i).setRoomNumber(i + 1);
            rooms.get(i).setRoomSizeType("bride suite");
            rooms.get(i).setRoomBudgetType("luxury");
            rooms.get(i).setRoomSceneType("lake side");
            rooms.get(i).setAvailable(true);
            rooms.get(i).setMaxBeds(2);
            rooms.get(i).setRoomPrice(180);
        }
//
//            //shows created rooms
//            for (int k = 0; k < 285; k++) {
//                System.out.println("The room number: " + rooms.get(k).getRoomNumber());
//                System.out.println("The room type: " + rooms.get(k).getRoomType());
//                System.out.println("The max beds: " + rooms.get(k).getMaxBeds());
//                System.out.println("Is the room available: " + rooms.get(k).getAvailable());
//                System.out.println("The room price: " + rooms.get(k).getRoomPrice());
//            }
//            System.out.println("285 rooms created..");
       }
}
