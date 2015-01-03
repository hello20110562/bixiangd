package 流;

import java.io.FileWriter;
import java.io.IOException;

/*
 * IO异常处理
 * 
 */
public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter  fw=null;
		try {
			fw = new FileWriter("demo.txt");
			fw.write("abcdefghigk");
		} catch (IOException e) {
			// TODO Auto-generated catch block
		System.out.println(e.toString());
		}
		try {
			if(fw!=null);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}

}
