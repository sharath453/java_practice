package file_handling;

import java.io.File;
import java.io.IOException;

public class program1 {
public static void main(String[] args) {

	
	        try {
	            // Specify the file name and path
	            File file = new File("C:\\Users\\Sharath A L\\Downloads\\rakshith details\\handling.txt");
	            
	            // Create the file
	            if (file.createNewFile()) {
	                System.out.println("File created: " + file.getName());
	            } else {
	                System.out.println("File already exists.");
	            }
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
}
}