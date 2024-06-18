import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class SPR {

public static void main(String[] args) {
    


    int scissor=0, paper=1, rock=2, userChoice, computerChoice;

    Scanner scn = new Scanner(System.in);
    Random ran = new Random();
 
    System.out.println("Scissor paper Rock game");
 

    //User Selection
    System.out.println("Enter your choice (0=scissor, 1=paper, 2 = Rock)");

     userChoice  = scn.nextInt();
       
     if(userChoice == scissor){
        System.out.println("You choose scissor");
     }
     
      
     if (userChoice == paper) {
        
        System.out.println("You choose paper");
     }

     if(userChoice == rock){
        System.out.println("You choose rock");
     }



          //Computer Selection

           
          computerChoice  =  ran.nextInt(2);

          if(computerChoice == scissor){

            System.out.println("Computer choose scissor");
          }
             if (computerChoice == paper) {
                System.out.println("Computer choose paper");
             }

             if (computerChoice == rock) {
                System.out.println("Computer choose Rock");
             }
          

             //Result

             if(userChoice == scissor ){
                 if(computerChoice == rock){
                    System.out.println("computer wins");
                 }

             }

             if(userChoice == rock){
                if (computerChoice == scissor) {
                    System.out.println("User wins");
                }
             }


              if (userChoice == paper) {
                if (computerChoice == scissor) {
                    System.out.println("computer wins");
                    
                }
              }
              else{
                System.out.println("user wins");
              }


              if (userChoice == computerChoice){

                System.out.println("Draw");
                 

              }

}
     
    }