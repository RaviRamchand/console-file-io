package sheridan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperations {
	//Fields 
	ArrayList<Person> _pList = new ArrayList<Person>();
	
	//Methods 
	//Constructor
	public FileOperations() {
		//Add elements into the ArrayList
		this._pList.add(new Person("Zendaya", "Coleman", 24));
		this._pList.add(new Person("Emma", "Watson", 31));
		this._pList.add(new Person("Hailee", "Steinfeld", 24));		
	}
	
	//writeFile() creates a celebs.txt file and populates it with the elements of the ArrayList
	public void writeFile() {
		//Create a writer object
		PrintWriter writer = null;
		try {
			//Create a file object and a text file
			File fileDesc = new File("celebs.txt");		
			
			//Put the file object in the writer objects constructor
			writer = new PrintWriter(fileDesc);
			
			//Write the elements into the text file
			for(Person p : this._pList) {
				writer.println(p.getFirstName() +"," +p.getLastName() +"," +p.getAge());
			}
			System.out.println("File written \n");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			//Close writer object
			if(writer != null) {
				writer.close();
			}
		}
		
		//End of writeFile()
	}
	
	//readFile() reads the contents in the celebs.txt file
	public void readFile() {
		//Create a reader object
		Scanner reader = null;		
		try {
			//Clear ArrayList to avoid duplications
			this._pList.clear();
			//Create a file object
			File fileDesc = new File("celebs.txt");
			//Put file object in the scanner constructor
			reader = new Scanner(fileDesc);
			
			//While the file has a next line 
			while(reader.hasNext()) {
				String record = reader.nextLine();
				//Split the record whenever there's a ","
				String[] fields = record.split(",");
				//Add the splited records into the ArrayList
				_pList.add(new Person(fields[0], fields[1], Integer.parseInt(fields[2])));
			}
			
			//Print out the elements in the ArrayList
			for(Person p : _pList) {
				System.out.println(p);
			}
			
			System.out.println("");
			System.out.println("File Read");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			//Close the reader object
			if(reader!=null) {
				reader.close();
			}
		}
		
		//End of readFile()
	}
	
	//End of FileOperations class
}
