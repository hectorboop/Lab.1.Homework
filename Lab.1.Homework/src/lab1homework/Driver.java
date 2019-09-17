package lab1homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
	//https://gist.github.com/ggordonutech/590303b195cfdb512feb69896e275006 
	//to be finished
	
	public static void main(String[] args) {
		House[] house = new House[3];
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter the house ID: ");
			int id = input.nextInt();
			
			System.out.println("Enter the house Price: ");
			float price = input.nextFloat();
			
			System.out.println("Enter the house Location: ");
			String location = input.next();
			
			System.out.println("Enter the house Advertiser: ");
			String advertiser = input.next();
			
			System.out.println("Enter the house image [quality]: ");
			String imageQuality = input.next();
			
			System.out.println("Enter the house image [type]: ");
			String imageType = input.next();
			
			Photo photo = new Photo(imageQuality, imageType);
			
			house[i] = new House(id, price, location, advertiser, photo);	
		}
		
		for (House home: house) {
			try {
				FileWriter fileObject = new FileWriter("Homework.txt", true);
				
				fileObject.write(home.toString());
				
				fileObject.close();
			} catch (IOException e) {
				System.err.println("Could not open file!");
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			
		}
		
		input.close();
	}
}
