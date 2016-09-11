package texts;

import java.util.ArrayList;
import java.util.Scanner;


public class Texts {

   private static ArrayList<String> searchResult = null ;

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

            searchResult = inventory.getSentences( userReply ) ;
            System.out.print("Found " + inventory.getSentencesCount(userReply) + " sentences. Show them? (y/n). \n" +
                "----------------------------------------------\n");

            String userChoice ;
            boolean correctChoice ;
            do{
               userChoice = scan.nextLine() ;
               if(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("n")){
                  correctChoice = true ;
               } else {
                  System.out.println("Incorrect input. Y or N");
                  correctChoice = false ;
               }
            } while ( !correctChoice ) ;

            if(userChoice.equalsIgnoreCase("y")){
//               System.out.println(searchResult);
               inventory.displayArrayList(searchResult);
            }

            System.out.println("\nOne more phrase, or exit ('x'):");

         }

      }
   }
}