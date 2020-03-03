package util;

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Logging {
	private static final Logger LOGGER = Logger.getLogger(Logging.class.getName());
	public static void main(String[] args)throws SecurityException, IOException {
		Scanner sc=new Scanner(System.in);
		double sp=sc.nextDouble();
		double sr=sc.nextDouble();
		double st=sc.nextDouble();
		double cp=sc.nextDouble();
		double cr=sc.nextDouble();
		double ct=sc.nextDouble();
		double result1,result2;
		result1=(sp*st*sr)/100;
		result2=cp*Math.pow((1+cr/100), ct);
		LOGGER.log(Level.INFO,"simple interest is:"+result1);
		LOGGER.log(Level.INFO,"compound interest is:"+result2);
	}
}
