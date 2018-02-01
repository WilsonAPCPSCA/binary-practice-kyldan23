package BinaryConvertor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class BinaryConvertor {
	public static void main(String []args) {
	ArrayList<Integer>finalBinary=new ArrayList<Integer>();
	Scanner in=new Scanner(System.in);
	System.out.println("Please enter a number within integer boundaries.");
	int input=in.nextInt();
	int inputCurr=input;
	int temp=0;
	do {
		temp=inputCurr%2;
		finalBinary.add(0,temp);
		inputCurr=inputCurr/2;
	}
	while(inputCurr>0);
	System.out.print("The number "+input+" is equivalent to ");
	for(int i=0;i<finalBinary.size();i++) {
		System.out.print(finalBinary.get(i));
	}
	System.out.print(" in binary.");
	}
}
