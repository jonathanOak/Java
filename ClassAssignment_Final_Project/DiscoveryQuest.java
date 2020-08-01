package ClassAssignment_FinalProjectUpdated;
// run the program
public class DiscoveryQuest {

	public static void main(String[] args) {
					
		String chosenHeroName = Acts.prelude();		
		Hero statusActOne 	  = Acts.actOne(chosenHeroName);
		Hero statusActTwo 	  = Acts.actTwo(chosenHeroName, statusActOne);
		Hero statusActThree	  = Acts.actThree(chosenHeroName, statusActTwo);
		Acts.finalAct(chosenHeroName, statusActThree);
		
	}
}

