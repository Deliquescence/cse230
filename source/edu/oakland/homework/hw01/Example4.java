package edu.oakland.homework.hw01;
public class Example4{
	public static void main(String args[]){
		int iresult,irem; //create two integer varibale called iresult and irem
		double dresult, drem; //create two double varibale called dresult and drem
		iresult=10/3; //10 divide by 3 then pass the varibel into iresult 
		irem=10%3; //10 modulus 3 then pass the varibale into irem
		dresult=10.0/3.0; //10 divide by 3 then pass the varibel into dresult 
		drem=10.0%3.0;//10 modulus 3 then pass the varibale into drem
		System.out.println("Result and remainder of 10 / 3: "+iresult+" "+irem);//print out the result and remainder of iresult and irem
		System.out.println("Result and remainder of 10.0 / 3.0: "+dresult+" "+drem);//print out the result and remainder of dresult and drem
	}
}