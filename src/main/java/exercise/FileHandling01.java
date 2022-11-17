package exercise;
import java.io.File;
import java.io.IOException;
public class FileHandling01 {
	


		public static void main(String[] args) throws IOException {
			
			/**
			 * @author Theshami
			 * below is created object of file
			 * then f.createNewFile method for creating new file
			 */
			
		File f = new File("C:\\Users\\Theshami\\OneDrive\\Desktop\\home.txt");
		
		/**
		
		if(f.createNewFile()) {
			System.out.println("File Is Created Successfully At Requested Directry by Java Program");
				
		}
		else {
			System.out.println("File Is Already Present in Requested directry\n Try An Other file");
		}
		
		*/
		
		/**
		 * @author Theshami
		 
		 */
			if(f.exists()) {
				System.out.println("File Name:-"+f.getName());
				System.out.println("File Location:-"+f.getAbsolutePath());
				System.out.println("File Size->:"+f.length());
//				System.out.println("file "+f.getDupli);
//				System.out.println("file"+f.);
				
				
			}
			else {
				System.out.println(" this file not exit");
				
			}
		}
	}



