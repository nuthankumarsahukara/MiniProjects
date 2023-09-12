import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample{
	public static void main(String args[]) 
	throws IOException 
	{
		String filepath= ("g:/nuthan7949/filee.txt");
		File fobj=new File(filepath);
		FileWriter wobj=new FileWriter(fobj);
		wobj.write("File Concepts");
		wobj.close();
		System.out.println("File is Added");
		
	}
}