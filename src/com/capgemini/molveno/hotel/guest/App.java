package com.capgemini.molveno.hotel.guest;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("For reserve a room put the number (1):");

        String userName = obj.nextLine();

       if (userName.equals("1")){
          Guest guest= new Guest();
           guest.getName();
           guest.getLastName();
           guest.getTel();

           guest.getAddress();
           guest.getEmail();
           guest.getIdType();
           guest.getIdValue();
           System.out.println("new guest saved.");

           System.out.println(guest.list);


       }
    }
}
