/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		//Card (rank, suit, pointvalue)
		Card cardOne = new Card("Ace", "Spades", 1);
		
		System.out.println(cardOne.toString());
		/*System.out.println(cardOne.rank());
		System.out.println(cardOne.suit());
		System.out.println(cardOne.pointValue());*/
		
		Card cardTwo = new Card("Seven", "Clubs", 7);
		
		System.out.println(cardTwo.toString());
		
		System.out.println(cardOne.matches(cardTwo));

		Card cardThree = new Card("Ace","Spades", 1);
		System.out.println(cardThree.toString());
		
		System.out.println(cardOne.matches(cardThree));
		System.out.println(cardThree.matches(cardOne));
				
	}
	
}
