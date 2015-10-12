
public class VotingMachine {

	public static void main (String[]args) {
		
		PollDisplayPanel votingMachine = new PollDisplayPanel("Adam","Bob","Carl");
		votingMachine.vote1();
		votingMachine.vote2();
		votingMachine.vote2();
		System.out.println(votingMachine);
	}
}
