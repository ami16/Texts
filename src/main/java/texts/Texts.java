package texts;

import java.util.Arrays;
import java.util.Scanner;


public class Texts {
   public Texts() {}


   public void run(){

      Inventory inventory = new Inventory() ;
      String s = inventory.myString() ;
      System.out.println( "String length: " + s.split("\\w+").length  + " words." );

      Scanner scan = new Scanner(System.in) ;
      System.out.println("Input desired word or phrase, or exit (hit 'x'):\n");

      while (true) {

         String userReply = scan.nextLine();
         if( userReply.equalsIgnoreCase("x") ){
            System.out.println("See ya!");
            break;
         }

         if (!s.contains(userReply)) {
            System.out.println("Your phrase not found. Input one more phrase, or exit ('x')\n");
         } else {
            System.out.println("\nFound " + inventory.getCentensesCount(userReply) + " sentenses: \n");
            inventory.getCentenses( userReply ) ;
            System.out.println("\nOne more phrase, or exit ('x'): \n");
         }

      }
   }
}