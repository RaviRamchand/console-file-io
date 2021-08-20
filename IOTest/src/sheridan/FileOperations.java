package sheridan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileOperations {
	//Fields 
	ArrayList<Person> _pList = new ArrayList<Person>();
	
	//Methods 
	//Constructor
	public FileOperations() {
		this._pList.add(new Person("Zendaya", "Coleman", 24));
		this._pList.add(new Person("Emma", "Watson", 31));
		this._pList.add(new Person("Hailee", "Steinfeld", 24));		
	}
	
	public void writeFile() {
		PrintWriter writer = null;
		try {
			File fileDesc = new File("celebs.txt");
			writer = new PrintWriter(fileDesc);
			
			for(Person p : this._pList) {
				writer.println(p.getFirstName() +"," +p.getLastName() +"," +p.getAge());
			}
			System.out.println("File written");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			writer.close();
		}
		
		//End of writeFile()
	}
	
	//End of FileOperations class
}
