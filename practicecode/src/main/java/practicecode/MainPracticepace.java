package practicecode;



import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MainPracticepace {

	
	public static void main(String[] args) {
		//Declaring an object
		Person pOne = new Person();
		//setting the name and phone number value of said object
		pOne.setName("Jazmine");
		pOne.setPhoneNumber("9035501");
		
		//Declaring and initializing object with values (name and phone Number) 
		Person pTwo = new Person("Gary", "9035502");
		Person pThree = new Person("Jonathan", "9035503");
		Person pFour = new Person("Nichole", "9035504");
		
		//toString method was created in Person class to read real values not just their reference location
		System.out.println(pOne.toString());
		System.out.println(pTwo.toString());
		System.out.println(pThree.toString());
		System.out.println(pFour.toString());
		
		//creating an array of objects
		Person[] peeps = new Person[4];
		peeps[0] = pOne;
		peeps[1] = pTwo;
		peeps[2] = pThree;
		peeps[3] = pFour;
		
		
		Person pFive = new Person("Jessie", "3331111");
		
		
		
		
		//Arrays.toString() has to be use to see all values within the array
		System.out.println(Arrays.toString(peeps));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter a name: ");
//		String name = sc.next();
//		System.out.println("Please enter thier phone number: ");
//		String phoneNum = sc.next();
//		Person addedOne = new Person(name, phoneNum);
//		System.out.println(name + " is added to your Phone Book");
//
////		//copying an array to a new array (very wasteful of memory NOT RECCOMENDED)
////		peeps = Arrays.copyOf(peeps, peeps.length + 1);
////		peeps[peeps.length - 1] = addedOne; 
////		System.out.println(Arrays.toString(peeps));
//		
//		//ArrayList is best when list size fluctuates; 
//		//Converting an Array to a ArrayList
		List<Person> phoneBook = new ArrayList<Person>(Arrays.asList(peeps));
//		System.out.println(phoneBook);
//		//Adding to the converted ArrayList
//		phoneBook.add(addedOne);
//		System.out.println(phoneBook);
			
		Path p = Paths.get("/practicecode/addressbookfile.txt");
		System.out.println(p.isAbsolute()); //<-- is true when c:/ or // is added above
		System.out.println(p.getRoot());//<-- above can be checked with getRoot method 
		
	}

}
