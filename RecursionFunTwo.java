//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunTwo
{
	public static int countChickens(String word)
	{
	int index = word.indexOf("chicken");
    if(index==-1)
    {
      return 0;
    }
    word = word.substring(0,index)+word.substring(index+7);
		return 1 + countChickens(word);
	}
}
