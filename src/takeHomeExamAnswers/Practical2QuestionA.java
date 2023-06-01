package takeHomeExamAnswers;

import java.io.File;

public class Practical2QuestionA {
	
	static String pathF = "data\\dictionary.xlsx";;
			
	public static void main(String[] args) {
		
		doesFileExist(pathF);
	}
	
	public static void doesFileExist(String path) {
		
		boolean fileExists = new File(pathF).exists();
		
		if (fileExists == true) {
			System.out.println("It is " + fileExists +", the file exists. This is the path: " + pathF);
		}
		else {
				System.out.println("The file does not exist");
	}
}

}
