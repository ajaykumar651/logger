package cons;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import util.Logging;

public class Cons {
	private static final Logger LOGGER = Logger.getLogger(Logging.class.getName());
	public static void main(String[] args)throws SecurityException, IOException {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int area=sc.nextInt();
		if(n.equals("standardmaterial"))
		{
			LOGGER.log(Level.INFO,"Constructioncost:"+area*1200);
		}
		else if(n.equals("abovehighstandard"))
		{
			LOGGER.log(Level.INFO,"Constructioncost:"+area*1500);
		}
		else if(n.contentEquals("highstandardmaterial"))
		{
			LOGGER.log(Level.INFO,"Constructioncost:"+area*1800);
		}
		else if(n.contentEquals("fullyautomated"))
		{
			LOGGER.log(Level.INFO,"Constructioncost:"+area*2500);
		}
    }
}