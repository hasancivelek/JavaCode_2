package Week10_Lab;

import java.awt.image.ImagingOpException;
import java.io.IOException;


 
class X{
	public void printFileContent() throws IOException{
		throw new IOException();
	}
}
public class Q_1{
	
	public static void main(String[] args) throws Exception{
		
       X Xobj = new X();

       Xobj.printFileContent();

	}

}
