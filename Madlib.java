import java.io.*;
import java.util.*;

class Madlib {
	private String name;
	private String desc;
	private String file;

	private String story;

	public Madlib(String name, String desc, String file){
		this.name = name;
		this.desc = desc;
		this.file = file;
		this.story = "";
	}

	public String toString() {
		return name + "\n" + desc;
	}

	public void run() {
		Scanner input = null;
		try {
			input = new Scanner(new File(this.file));
		} catch (IOException e) {
			System.out.println("File not found");
		}
		// System.out.println("Method run");

		// System.out.println(input.nextLine());

		String[] storyInput = input.nextLine().split("", 0);
		// System.out.println(Arrays.toString(storyInput));

		boolean needUserInput = false;
		String user = "";
		for (String c : storyInput) {

			if (needUserInput) {
				user += c + "";
			}

			if (c.charAt(0) == '[') {
				needUserInput = true;
			} else if (c.charAt(0) == ']') {
				user = user.substring(0, user.length()-1);
				System.out.print("Enter a word for " + user + ": ");
				input = new Scanner(System.in);
				String answer = input.nextLine();
				this.story += answer;

				needUserInput = false;
				user = "";
			} else {
				if (!needUserInput) {
					this.story += c;
				}
				
			}
		}

		System.out.println(this.story);
		// while (input.hasNext()) {
		// 	String next = input.next();
		// 	if (next.charAt(0) == '[') {
		// 		next = next.substring(1, next.length()-1);
		// 		System.out.println(next);
		// 	} else {
		// 		this.story += next;
		// 	}
		// }
	}


}