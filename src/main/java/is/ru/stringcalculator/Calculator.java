package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",")){
			return sum(splitNumbers(text));
		}
		else if (text.contains("\n"))
		{
			return sum(splitNewLine(text));
		}
		else if (text.startsWith("\\"))
		{
 
			if(text.contains("\n"))
			{
				return sum(splitNewLine(text));
			}
			else
			{
				return sum(splitNumbers(text));
			}
		}
		else if (text.contains("-"))
		{
			List neativeNum = new ArrayList();
			for (String number : text)
			{
				int num = toInt(number.trim());
				if (number < 0)
				{
					negativeNum.add(num);)
				}
			}
			if (negativeNum.size() >  0)
			{
				throw new RuntimeExeption("Negatives not allowed: " + negativeNum.toString());
			}
		[
		else
			return toInt(text);
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",");
	}

	private static String[] splitNewLine(String numbers)
	{
		return numbers.split("\n");
	}
 
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }
	
}
