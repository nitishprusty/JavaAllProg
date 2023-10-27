package com.task.day7;


//Code that generates output synchronized from 2 threads
//First thread prints a number from 1-26 and the other prints alphabets against those numbers 

public class AlpahabetNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generator g = new Generator();
		
		NumGenerator ng = new NumGenerator(g);
		AlphaGenerator ag = new AlphaGenerator(g);
		
		Thread t1 = new Thread(ng);
		
		Thread t2 = new Thread(ag);
		
		t1.start();
		t2.start();

	}

}

class NumGenerator extends Thread
{
	
	public Generator obj;
	public NumGenerator(Generator obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		
			for(int i = 0;i<26;i++) {
				
				obj.printNumber(i);
				
			}
		
		//TODO 3 - Run a loop from 1-26 (say i is the variable) and
		//call printNumber method passing i as its parameter 
		
	}
	
}  

class AlphaGenerator extends Thread
{
	public Generator obj;
	public AlphaGenerator(Generator obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		
		//TODO 4 - Run a loop from A-Z (say c is the variable) and
		//call printAlbhabet method passing c as its parameter
		
		for(char c='A';c<='Z';c++)
		{
			obj.printAlphabet(c);
		}
		
	}
}

class Generator {
	boolean numPrinted = false;
	public synchronized void printNumber(int number)
	{
		//TODO 5 - Check if numPrinted is true, then call wait().
		//         It requires InterruptedException to be caught
		
		try {
			
			if(numPrinted) {
				wait();
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//TODO 6 - print the number here using System.out.print(number + ": ")
		System.out.print(number + ": ");
		
		
		//TODO 7 - numPrinted should be assigned true here
		numPrinted = true;
		
		
		//TODO 8 - Notify the waiting thread using notify()
		notify();
		
		
	}
	public synchronized void printAlphabet(char alphabet)
	{
		//TODO 9 - Check if numPrinted is false, then call wait().
		//         It requires InterruptedException to be caught
		
		try {
			
			if(!numPrinted) {
				wait();
			}
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//TODO 10 - print the alphabet here using System.out.println(alphabet)
		System.out.println(alphabet);
		
		
		//TODO 11 - numPrinted should be assigned false here
		numPrinted = false;
		

		//TODO 12 - Notify the waiting thread using notify()
		notify();
		
	}
} 
