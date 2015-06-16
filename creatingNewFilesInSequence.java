package CreatingNewFilesInSequence;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class writeToFile {
	public static void main(String[] args) {
		File counterFile = new File("C:\\Users\\Kishore\\eclipseWorkspace\\ExploringFiles\\counterFile");
		Scanner fileReader = null;
		try {
			fileReader = new Scanner(counterFile);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		int counter = fileReader.nextInt();
		fileReader.close();
		
		String filePrefix = "fileNumber";
		String fileName = filePrefix + counter + ".txt";
		System.out.println(fileName);
		
		try {
			File fileToWrite = new File("C:/Users/Kishore/Desktop/" + fileName);
			PrintWriter writingFile = new PrintWriter(fileToWrite);
			writingFile.println("This is the first line.");
			writingFile.println("This is the second line.");
			writingFile.println("This is the third line.");
			writingFile.close();
		} catch ( IOException e ) {
			e.printStackTrace();
		}
		
		int newCounter = counter + 1;
		PrintWriter fileToUpdate = null;
		try {
			fileToUpdate = new PrintWriter(counterFile);
			fileToUpdate.println(newCounter);
			fileToUpdate.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}

