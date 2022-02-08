package u7pp;
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Scanner;


public class War {
    private ArrayList<Card> userHand = new ArrayList<Card>(52);
    private ArrayList<Card> dealerHand = new ArrayList<Card>(52);
    private ArrayList<Card> pile1 = new ArrayList<Card>(52);
    private ArrayList<Card> pile2 = new ArrayList<Card>(52);
    

    Scanner input = new Scanner(System.in);
    Deck userDeck = new Deck();


    public void play(){
        String nameOne = "";
        String nameTwo = "";
        boolean winner = true;
        Card user;
        Card dealer;
        boolean wars = true;
        String victor = "";
        String lastResponse = "";
        boolean yesOrNO = true;
        //FIRST While loop that plays the whole game until it break when someone wins or gives up
        while(true){
            System.out.println("What is Player 1 name? ");
            nameOne = input.nextLine();

            System.out.println("What is Player 2 name? ");
            nameTwo = input.nextLine();

            System.out.println("Welcome " + nameOne + " and " +  nameTwo + " to war");
            
            // this splits the deck after being shuffled
            for(int i = 52; i > 0; i -=2){
                userDeck.shuffle();
                userHand.add(userDeck.deal());
                dealerHand.add(userDeck.deal());
            }
            System.out.print(nameOne + " are you ready to play?");
            // checks if playerOne is ready to play
            while(true){
                    if(lastResponse.equals("Y") || lastResponse.equals("y")){
                      break;
                    }
                      else if(lastResponse.equals("N") || lastResponse.equals("n")){
                        winner = false;
                        break;
                      }
                        else{
                          System.out.println("Invalid input, try again");
                          System.out.println(nameOne + " are you ready to play?(Y)es/(N)o:");
                          lastResponse = input.nextLine();
                        }
                  }
          System.out.print(nameOne + " are you ready to play?");
          // checks if playerTwo is ready to play
            while(true){
                    if(lastResponse.equals("Y") || lastResponse.equals("y")){
                      break;
                    }
                      else if(lastResponse.equals("N") || lastResponse.equals("n")){
                        winner = false;
                        break;
                      }
                        else{
                          System.out.println("Invalid input, try again");
                          System.out.println(nameTwo + " are you ready to play?(Y)es/(N)o:");
                          lastResponse = input.nextLine();
                        }
                  }
          
            // second while loop will continue if they say yes and one player does not own all 52 cards
            while(winner){

                if(userHand.size() > 0){
                    pile1.add(userHand.get(0));
                    userHand.remove(0);
                }
                else{
                    winner = false;
                }

                if(dealerHand.size() > 0){
                    pile2.add(dealerHand.get(0));
                    dealerHand.remove(0);
                }
                else{
                    winner = false;
                }
                user = pile1.get(0);
                dealer = pile2.get(0);

                // this continues to  play war until there is a winner
                while(wars){

                    if(user.compareTo(dealer) > 0){
                       // while loop that moves the pile to player 1
                        while(pile1.size() > 0){
                            userHand.add(pile1.remove(0));
                        }
                        victor = nameOne;
                        wars = false;
                    
                    }
                    else if(user.compareTo(dealer) < 0){
                        // while loop that moves the pile to player 2
                        while(pile2.size() > 0){
                            dealerHand.add(pile2.remove(0));
                           
                        }
                        victor = nameTwo;
                        wars = false;
                    }
                    else{
                        for(int i = 0; i < 4; i++){
                            pile1.add(userHand.get(0));
                            userHand.remove(0);
                            pile2.add(dealerHand.get(0));
                            dealerHand.remove(0);
                        }
                        user = pile1.get(pile1.size() -1);
                        dealer = pile2.get(pile2.size()-1);
                    }
                }
                System.out.println("The winner is " + victor);
                System.out.println("Would you like to play again? (Y)es/(N)o: ");

                // Yes and no while loop
                while(yesOrNO){
                    if(lastResponse.equals("Y") || lastResponse.equals("y")){
                      winner = true;
                      yesOrNO = false;
                    }
                      else if(lastResponse.equals("N") || lastResponse.equals("n")){
                        winner = false;
                        yesOrNO = false;
                      }
                        else{
                          System.out.println("Invalid input, try again");
                          System.out.println("Would you like to play again? (Y)es/(N)o: ");
                          lastResponse = input.nextLine();
                        }
                  }
            }


        }
        
    }
}