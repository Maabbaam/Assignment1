import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TestSuite {

	
	public static ArrayList<String> deck1 = new ArrayList<String>();
	public TestSuite(){
	
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
	@Test
	//maab AceSpades TwoHearts ThreeClubs FourDiamonds FiveSpades
	// this tests for duplicate cards from 2 players 
	// when testing this ensure that players have a 
	public void testForDuplicateCards(){
		PokerGame game = new PokerGame();
		System.out.println("Enter the first player id and cards");
		String [] pl1 = game.CheckForCorrectCard(game.CheckIdAndCards(game.p1));
		
		System.out.println("Enter the second player id and cards");
		String [] pl2 = game.CheckForCorrectCard(game.CheckIdAndCards(game.p2));
		
		for (int i = 1; i < game.p1.length; i++){
			
			if (pl1[i] == pl2[i]) fail();
			
		}
		
		
		assertTrue(true);
		
		
	}
	
	@Test
	// this tests for correct number of players
	public void testForNumberOfPlayers(){
		
		
		PokerGame game = new PokerGame();
		int numPlayers = game.CheckForNumberOfPlayer();
		
		if (numPlayers < 2 || numPlayers > 4) fail();
		
		assertTrue(true);
		
		
	}
	//this test determines whether the cards are properly ordered, id then cards
	// p1 is used over
	@Test
	public void testForCorrectEntry(){
		PokerGame game = new PokerGame();
		
		String[] str = game.CheckIdAndCards(game.p1);
		
		if  (deck1.contains(str[0])) fail(); 
		
	}
	//this test determines whether the cards are properly named
	// test for valid cards
	@Test
	public void testCheckForCorrectCard(){
		PokerGame game = new PokerGame();
		
		String[] str = game.CheckIdAndCards(game.p1);
		String[] playerCards  = game.CheckForCorrectCard(str);
		
		
		
		for (int i = 1; i < playerCards.length ; i++)
		{
			// this means that the input wasnt named properly
			if (!deck1.contains(playerCards[i])) fail(); 
			
		}
		
		
		
		assertTrue(true);
		
	}
	//This test determines whether there are 6 strings in the string Array
	// this test ensures that the player has input 6 strings guaranteeing that 5 cards
	// be dealt to them.
	
	//this test also checks for valid id
	// an invalid id will be defined as an id that also a card name 
	// CheckIdAndCards () disallows id that are card name such as AceSpades TwoHearts etc.
	@Test
	public void testCheckIdAndCards() {
		
		PokerGame game = new PokerGame();
		
		String[] actual = game.CheckIdAndCards(game.p1);
		
		int iNonNullStrings = 0;
		int iExpectedValue = 6;
		
		for (int i = 0; i < 6; i++)
		{
		
			if (actual[i] != ""){
				
				iNonNullStrings ++;
				
			}
			
		
			
		}
	
	
	assertEquals(iExpectedValue,iNonNullStrings);
	
	}
	//

	

}
