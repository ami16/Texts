package texts;

import java.util.Scanner;


public class Texts {
   public Texts() {}


   public void run(){

      Inventory inventory = new Inventory() ;
      String s = inventory.myString() ;
      System.out.println( "\nStrings DB length: " + s.split("\\w+").length  + " words." );

      Scanner scan = new Scanner(System.in) ;
      System.out.println("\nInput desired word or phrase, or exit (hit 'x'):\n");

      while (true) {

         String userReply = scan.nextLine();
         if( userReply.equalsIgnoreCase("x") ){
            System.out.println("See ya!");
            break;
         }
         if (userReply.length() == 0){
            System.out.println("Empty input");
            continue;
         }

         if (!s.contains(userReply)) {
            System.out.println("\nYour phrase not found. Input one more phrase, or exit ('x')");
         } else {
            System.out.println("\nFound " + inventory.getSentencesCount(userReply) + " sentenses:\n------------------------------------------------------------");
            inventory.getSentences( userReply ) ;
            System.out.println("\nOne more phrase, or exit ('x'):");
         }

      }
   }
}