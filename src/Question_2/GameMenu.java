package Question_2;

import java.util.Scanner;

public class GameMenu {
	
	public static void startGame(){
        System.out.println("Start");
    }
	
	public static void gameInstruction(){
        System.out.println("Game Info");
    }
	
	public static void exitGame(){
        System.out.println("Thank you ! bye");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
		 int choice=0;
		 
		 do {
	            
	            System.out.println(
	              "Enter Choice :" + 
	              "\n1. Start Game" +
	              "\n2. Game Instructions" +
	              "\n3. Exit Game"
	            );
	            choice = in.nextInt();
	            
	            switch(choice){
	                case 1:
	                    startGame();
	                    break;
	                
	                case 2:
	                    gameInstruction();
	                    break;
	                  
	                case 3:
	                    exitGame();
	                    break;
	                    
	                default:
	                    System.out.println("Invalid Choice");          
	                    
	            }
	            
	        } while (true);
	        
	    }
	}
