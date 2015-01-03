package 流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class PictureCopy {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos;
		try {
			fis = new FileInputStream("C:\\1.jpg");
			fos = new FileOutputStream("C:\\2.jpg");
			byte [] buf=new byte[1024];
		    int num=0;
			while ((num=fis.read(buf))!=-1)
				fos.write(buf,0,num);
		}
			catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("图片读取异常");
		}

}
}