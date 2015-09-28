//import java.io.IOException;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Scanner;
public class PokerGame {
	
	
	static int numberOfPlayers = 0;
	static Player player1,player2, player3, player4;
	static String p1[] = {"","","","","",""};
	static String p2[] = {"","","","","",""};
	static String p3[] = {"","","","","",""};
	static String p4[] = {"","","","","",""};
	public static ArrayList<String> deck1 = new ArrayList<String>();
	
	public static ArrayList<String> usedCards = new ArrayList<String>();
	
	
	
	
	
	
	
	static String deck [] =
			
			
	//*******Spades*********************
		{"AceSpades", //
		"TwoSpades",
		"ThreeSpades",
		"FourSpades",
		"FiveSpades",
		"SixSpades",
		"SevenSpades",
		"EightSpades",
		"NineSpades",
		"TenSpades",
		"JackSpades",
		"QueenSpades",
		"KingSpades",
		
		
//******Hearts ***********************
		"AceHearts",
		"TwoHearts",
		"ThreeHearts",
		"FourHearts",
		"FiveHearts",
		"SixHearts",
		"SevenHearts",
		"EightHearts",
		"NineHearts",
		"TenHearts",
		"JackHearts",
		"QueenHearts",
		"KingHearts",
//********Clubs***************		
		
		"AceClubs",
		"TwoClubs",
		"ThreeClubs",
		"FourClubs",
		"FiveClubs",
		"SixClubs",
		"SevenClubs",
		"EightClubs",
		"NineClubs",
		"TenClubs",
		"JackClubs",
		"QueenClubs",
		"KingClubs",
		
//********Diamonds*****************************************
		"AceDiamonds",
		"TwoDiamonds",
		"ThreeDiamonds",
		"FourDiamonds",
		"FiveDiamonds",
		"SixDiamonds",
		"SevenDiamonds",
		"EightDiamonds",
		"NineDiamonds",
		"TenDiamonds",
		"JackDiamonds",
		"QueenDiamonds",
		"KingDiamonds",
		};
	
	public PokerGame(){
		
		deck1.add("AceSpades");
		deck1.add("TwoSpades");
		deck1.add("ThreeSpades");
		deck1.add("FourSpades");
		deck1.add("FiveSpades");
		deck1.add("SixSpades");
		deck1.add("SevenSpades");
		deck1.add("EightSpades");
		deck1.add("NineSpades");
		deck1.add("TenSpades");
		deck1.add("JackSpades");
		deck1.add("QueenSpades");
		deck1.add("KingSpades");
		
		deck1.add("AceDiamonds");
		deck1.add("TwoDiamonds");
		deck1.add("ThreeDiamonds");
		deck1.add("FourDiamonds");
		deck1.add("FiveDiamonds");
		deck1.add("SixDiamonds");
		deck1.add("SevenDiamonds");
		deck1.add("EightDiamonds");
		deck1.add("NineDiamonds");
		deck1.add("TenDiamonds");
		deck1.add("JackDiamonds");
		deck1.add("QueenDiamonds");
		deck1.add("KingDiamonds");
		
		deck1.add("AceHearts");
		deck1.add("TwoHearts");
		deck1.add("ThreeHearts");
		deck1.add("FourHearts");
		deck1.add("FiveHearts");
		deck1.add("SixHearts");
		deck1.add("SevenHearts");
		deck1.add("EightHearts");
		deck1.add("NineHearts");
		deck1.add("TenHearts");
		deck1.add("JackHearts");
		deck1.add("QueenHearts");
		deck1.add("KingHearts");
		
		deck1.add("AceClubs");
		deck1.add("TwoClubs");
		deck1.add("ThreeClubs");
		deck1.add("FourClubs");
		deck1.add("FiveClubs");
		deck1.add("SixClubs");
		deck1.add("SevenClubs");
		deck1.add("EightClubs");
		deck1.add("NineClubs");
		deck1.add("TenClubs");
		deck1.add("JackClubs");
		deck1.add("QueenClubs");
		deck1.add("KingClubs");
		
		
	}
	
	public static int CheckForNumberOfPlayer(){
		
		
		System.out.println("How many players are there:");
		
		Scanner in = new Scanner(System.in);
				
				
		//function that will determine the input was 2 3 or 4
		numberOfPlayers = in.nextInt();
		
		while (numberOfPlayers < 2 || numberOfPlayers > 4) {
			
			System.out.println("Please reenter either 2, 3 or 4");
			Scanner im = new Scanner(System.in);
			
			numberOfPlayers = im.nextInt();
			
			
		}
		
		
		return numberOfPlayers;
	}
	
	
	//
	public static String[] CheckForCorrectCard(String player[]){
		
				
		
		for (int i = 1; i < player.length ; i++)
		{
			
			while (!deck1.contains(player[i])) {
			System.out.println("The following card: " + player[i] + " was incorrect please reinput it");
			System.out.print("Choose another card: ");
			Scanner inp = new Scanner(System.in);
			
			String  strInput= inp.nextLine();
			player[i] = strInput;
			
				
				
			}
			
			while (usedCards.contains(player[i])){
				System.out.println("The following card: " + player[i] + " is already in play");
				System.out.print("Choose another card: ");
				
				Scanner op = new Scanner(System.in);
				
				String  strInput= op.nextLine();
				
				
				while (!deck1.contains(strInput)) {
					System.out.println("The following card: " + strInput + " is invalid please reinput it");
					System.out.print("Choose another card: ");
					Scanner omi = new Scanner(System.in);
					
					String  Input= omi.nextLine();
					
					strInput = Input;
					
						
						
					}
				
				
				player[i] = strInput;
				
				
				
			}
			
						
		}
		
		usedCards.add(player[1]);
		usedCards.add(player[2]);
		usedCards.add(player[3]);
		usedCards.add(player[4]);
		usedCards.add(player[5]);
		
		
		return player;
		
	}
	// This function checks that they're are 6 strings and that they are properly ordered
	public static String[] CheckIdAndCards(String player[]){
	
		Scanner in3 = new Scanner(System.in);
	
		String  strInput= in3.nextLine();
		
		//maab AceSpades TwoHearts ThreeClubs FourDiamonds FiveSpades
		int j = 0;
		int  e = 0;

		for (int i = 0 ; i < strInput.length(); i++ ){
			
			if (strInput.charAt(i) == ' ' || i == strInput.length() -1 )
			{
				if (i == strInput.length() -1) player[e] = strInput.substring(j, i+1);
				
				
				else 	player[e] = strInput.substring(j, i);
					
				
				
				System.out.println(player[e]);
				
				e++;
				j = i+1;
				
			}
			
		}
		 
		while (deck1.contains(player[0])){
			System.out.println("Please reenter your id");
			Scanner in = new Scanner(System.in);
			
			player[0]= in.nextLine();
			
		}
		
		return  player;
	}
	
	

	public static void main(String[] args) {
		
	PokerGame p = new PokerGame();
		
	
	
	System.out.println("Enter the first player id and cards");

	CheckForNumberOfPlayer();
	
	if (numberOfPlayers == 2){
		
		
		System.out.println("Enter the first player id and cards");
		p1 = CheckIdAndCards(p1);
		p1 = CheckForCorrectCard(p1);
		System.out.println("Enter the second players id and cards");
		p2 = CheckIdAndCards(p2);
		p2 =CheckForCorrectCard(p2);
		//
		
	}
	
	else if (numberOfPlayers == 3){
		
		System.out.println("Enter the first player id and cards");
		p1 = CheckIdAndCards(p1);
		p1 = CheckForCorrectCard(p1);
		System.out.println("Enter the second players id and cards");
		p2 = CheckIdAndCards(p2);
		p2 =CheckForCorrectCard(p2);
		
		System.out.println("Enter the third players id and cards");
		p3 = CheckIdAndCards(p3);
		p3 = CheckForCorrectCard(p3);
		
		
	}
	
	else if (numberOfPlayers == 4){
		
		System.out.println("Enter the first player id and cards");
		p1 = CheckIdAndCards(p1);
		p1 = CheckForCorrectCard(p1);
		System.out.println("Enter the second players id and cards");
		p2 = CheckIdAndCards(p2);
		p2 =CheckForCorrectCard(p2);
		
		System.out.println("Enter the third players id and cards");
		p3 = CheckIdAndCards(p3);
		p3 = CheckForCorrectCard(p3);
		
		System.out.println("Enter the fourth players id and cards");
		p4 = CheckIdAndCards(p4);
		p4 = CheckForCorrectCard(p4);

		
	
	}
	// should never reach this part of the code
	else{}


}}
