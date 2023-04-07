package practicecode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.FileReader;
import java.io.Reader;

import java.io.Writer;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;


public class MyPhoneBook {
	
	private static String filePath = "";
	private static File newFile; 

	
///////////////CREATING A NEW FILE////////////////////(line28)
///not Souts not really needed just to see files are essential
	//.getPath would have sufficed here (SAME output)line33
		////.getAbsolutePath will give exact file path to write to 
///////////////WRITING TO SAID FILE//////////////////line45
//Fix code below to append instead of replacing it every time **note make sure I can read txt file
//				public static Person[] addPerson(Person[] array, Person person) {
//					Person[] newPeeps;;
//					newPeeps = new Person[array.length +1]; //<-- Declaring and initializing a new array with the length 1 more greater than the original array.
//					for(int i = 0; i < array.length; i++) 
//						newPeeps[i] = array[i];//new array is copied into old array
//					
//					newPeeps[array.length] = person; //putting new person into the last index of the array with array.length
//					return newPeeps;
//				}
	
	public static void createFile() {
	
		try {
			File newFile = new File("files/addressbookfile.txt");
			if(newFile.createNewFile()) {
				System.out.println("File created: " + newFile.getName()); 
				filePath = newFile.getAbsolutePath();
			} else {
				System.out.println("File already exists at: " + newFile.getAbsolutePath());
				filePath = newFile.getAbsolutePath(); 
			}
		} catch (IOException e) { //.createNewFile throws IOExceptions try/catch is needed
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	
		try (Reader reader = new FileReader("files/addressbookfile.txt")) {
			char [] buf = new char[16];
			int read = reader.read(buf);
			StringBuilder sb = new StringBuilder();
			while(read > 0) {
				sb.append(buf, 0, read);
				read = reader.read(buf);
			}
			System.out.println("Below is what is in the file: = \n" + sb);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeNewPeep(ArrayList<Person> peeps) {
		try {
			FileWriter fw = new FileWriter(filePath);
			PrintWriter pw = new PrintWriter(fw);
		for (Person peep: peeps) {
			pw.write("\n" + peep);
		}
		pw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}


		

	
	public static void main(String[] args) throws Exception {
		createFile();
		Person oneCon = new Person("Jaz", "1234567");
		Person conTwo = new Person("Giz", "7654321");
		Person conThree = new Person("Sassy", "1122334");
		Person conFour = new Person("Bob", "4332211");
		
		Person[] peoples = new Person[4];
		peoples[0] = oneCon;
		peoples[1] = conTwo;
		peoples[2] = conThree;
		peoples[3] = conFour;
		
		Person conFive = new Person("Jessie", "3331111");
		
		ArrayList<Person> peeps = new ArrayList<>();
		peeps.add(oneCon);
		peeps.add(conTwo);
		peeps.add(conThree);
		peeps.add(conFour);
		
		writeNewPeep(peeps);
		
		System.out.println("My arrayList: " + peeps);
		
		for(int i = 0; i < peeps.size(); i++) {
			System.out.println(peeps.get(i));
		}
		
//		System.out.println(Arrays.toString(addPerson(peeps, conFive)));
		
	
		
	}		
}
