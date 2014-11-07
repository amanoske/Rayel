public class Rayel
{
	public Rayel(long l)
	{ 
		/**
		**Specifies the p(love) as 1 = / (love)
		**/
		love = nearestSigFigToString(l);
		
        }
        private static String nearestSigFigToString(long n)
	{
		int i;
		for(i = 10; i > 0 && n>= 1; i--)
		{
			n /= Math.pow(10,Math.abs(10 - i));
			
		}
		switch(i){
			case 10: return "Ten";
			case 9: return "Hundred";
			case 8: return "Thousand";
			case 7: return "Ten Thousand";
			case 6: return "Hundred Thousand";
			case 5: return "Million";
			case 4: return "Ten Million";
			case 3: return "Hundred Million";
			case 2: return "Billion";
			case 1: return "Ten Billion";
			case 0: return "Hundred Billion";
		}
		return "Out of Bounds";
	}
	public String getProbabilityOfLove(int n, char c)
	{
		if ( n <= 0) return c;
		return "One in a "+ love.substring(0,love.length()-1) + love+getProbability(n-1, love.charAt(love.length()-1));

	}

	public static void main(String[])
	{
		Rayel AndrewRayel = new Rayel(1000000);
		String[] 1stVerses = "This world can be," "such a lonely place to hide in", "that's all I see", "till you open my eyes for me","and now I see the light",
                "and now the future is so bright";
		for(s : 1stVerses)
			System.out.println(s);
		System.out.println("I hold on tight to you, never letting go");
		System.out.println("Your love's "+AndrewRayel.getProbabilityOfLove(1,'');
		System.out.println("I'd put on a fight for you, can't make it on my own");
		System.out.println("Your love's "+AndrewRayel.getProbabilityOfLove(1,'');
		System.out.println("If I looooosseee your hearttttt");
		System.out.println("I'm sure I'd fall apartttttt");
		System.out.println("Your love's "+AndrewRayel.getProbabilityOfLove(1,''));
		for(int i = 0; i < 5; i++)
			System.out.println(AndrewRayel.getProbabiltyOfLove(i, ''));
		System.out.println("INSERT FILTHY BEAT DROP");
	}

	String love;

}
