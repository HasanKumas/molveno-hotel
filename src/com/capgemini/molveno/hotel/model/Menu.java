package com.capgemini.molveno.hotel.model;

import java.util.Scanner;

import static com.capgemini.molveno.hotel.Application.showMainMenu;
import static com.capgemini.molveno.hotel.model.RoomFactory.createRoom;
import static com.capgemini.molveno.hotel.model.RoomFactory.showRoom;

public class Menu {
    public static Scanner inputS = new Scanner(System.in);
    public static void showMenu() {
        System.out.println("press `m` to go to main menu or `enter` to leave the program");
        if (inputS.nextLine().equals("m")) {
            showMainMenu();
        }
    }
}
