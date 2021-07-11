import java.io.*;
import java.util.*;

class Main {
	static ArrayList<Madlib> madlibs = new ArrayList<>();

	public static void main(String[] args) {
		createMadlibs();

		System.out.println("Welcome to Comic Mad Libs!");

		for (int i = 0; i < madlibs.size(); i++) {
			System.out.println("---------------------------");
			System.out.println((i+1) + ". " + madlibs.get(i));
			
		}
		System.out.println("---------------------------");

		System.out.print("Enter the number next to the mad lib you would like to play: ");

		Scanner input = new Scanner(System.in);
		int user = input.nextInt();

		madlibs.get(user-1).run();
		
	}

	public static void createMadlibs() {
		Madlib hotAndCold = new Madlib("Hot & Cold", "A comic adventure feature The Flash, Captain Cold, and Heat Wave!", "Hot and Cold.txt");

		Madlib topsyTurvy = new Madlib("Topsy-Turvy", "See how the Avengers handle Loki's spinning magic!", "Topsy-Turvy.txt");

		Madlib talentAgent = new Madlib("My Car Has a Talent Agent", "Find out how Comic-Con gives a car its own talent agent!", "My Car Has a Talent Agent.txt");

		Madlib spiderMan = new Madlib("The Origin Story of Spider-Man", "Rewrite the details of how Spider-Man came to be!", "The Origin fo Spider-Man.txt");

		Madlib wonderWoman = new Madlib("I Am Wonder Woman", "Listen to Wonder Woman's speech!", "I Am Wonder Woman.txt");

		
		madlibs.add(hotAndCold);
		madlibs.add(topsyTurvy);
		madlibs.add(talentAgent);
		madlibs.add(spiderMan);
		madlibs.add(wonderWoman);

	}

  
}



// All Mad Libs owned by Mad Libs