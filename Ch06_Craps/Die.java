public class Die {

	private int dots;

	public Die() {

	}

	public int getNumDots() {
		return dots;
	}

	public void roll() {
		//Randomizes the value of dots to a number from 1-6
		dots = (int)(Math.random()*6+1);

	}

	//TESTING METHOD
	/*public static void main (String []args) {

		Die die = new Die();
		for (int j = 0; j < 50; j++) {
			for (int i = 0; i < 50; i++) {
				die.roll();
				System.out.print(die.getNumDots()+" ");
			}
			System.out.println();
		}
	}*/
}
