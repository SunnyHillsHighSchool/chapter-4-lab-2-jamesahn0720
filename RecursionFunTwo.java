//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunTwo
{
	public static int countChickens(String word)
	{
	  if (word.isEmpty()) {
            return 0;
        } else {
            int count = countChickens(word.substring(1));
            if (word.startsWith("chicken")) {
                ++count;
            }
            return count;
        }
	}
}
