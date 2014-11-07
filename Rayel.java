import java.util.*;
import java.io.*;

public class Rayel
{
	public class Rayel(long frequency)
	{
		/**
		** Creates a new Rayel object with probability derived from frequency of love
		**/
		probability = Long.toString(frequency);
		switch(probability.length())
		{
			case 1: probability = "ones"; break; 
			case 2: probability = "ten"; break;
			case 3: probability = "hundred" break;
			case 4: probability = "thousand"; break;
			case 5: probability = "ten thousand"; break;
			case 6: probability = "hundred thousand"; break;
			case 7: probability = "million"; break;
			case 8: probability = "ten million"; break;
			case 9: probability = "hundred million"; break;
			case 10: probability = "billion"; break;
			case 11: probability = "ten billion"; break;
			case 12: probability = "hundred billion"; break;
		}
		if (Character.isDigit(probability.charAt(0)))
			probability = "Forever Alone.";
		else
			probability = "One in a "+probability; 
	}
	
	public String getChoralProbability(int n)
	{
		if (n = 0)
			return "";
		return probability + probability.charAt(probability.length() - 1) + getChoralProbability(n-1);
	}
	
	public Static void main(String[] args)
	{
		Rayel AndrewRayel = new Rayel(1000000);
		String lead_in = "";
		try
		{
			Scanner s = new Scanner(new File("Rayel_LeadIn.txt"));
			while(s.hasNext)
				lead_in = lead_in + s.nextLine() + "\n";
		
		}
		catch (Exception e)
		{
			System.out.println("Turn down for "+e); 
		}
		if (lead_in.length() == 0)
			return; //The music died. 
		System.out.println(lead_in);
		/** begin chorus
		**/
		System.out.println("\n");
		System.out.println("I hold on tight, to you, never letting go...");
		System.out.println("Your love's "+AndrewRayel.getChoralProbability(1));
		System.out.println("I'd put up a fight for you, can't make it on my own.");
		System.out.println("Your love's "+AndrewRayel.getChoralProbability(1));
		System.out.println("\n If I lose your heart, I'm sure I'd fall apart" + "\n");
		System.out.println("You are the sun to me, you're my everything.");
		System.out.println("Your love's "+AndrewRayel.getChoralProbability(1));
		for(int i = 3; i > 0; i--)
			System.out.println(AndrewRayel.getChoralProbability(i));
		System.out.println("O BLARGH BEAT FUCKING DROP!!!! ");
		System.out.println(Thread.currentThread().getStackTrace());
	}
	
	String probability;
	
}
