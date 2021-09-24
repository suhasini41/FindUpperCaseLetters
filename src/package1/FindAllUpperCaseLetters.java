package package1;

import java.util.regex.Pattern;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindAllUpperCaseLetters 
{
	private String findUpperCase(String s) {
		String upper = "";
		for(int i=0;i<s.length();i++)
		{
			if(Pattern.matches("[A-Z]",String.valueOf(s.charAt(i))))
			{
				upper = upper + s.charAt(i);
			}

		}
		return upper;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(findUpperCase("AmaZoN"), "AZN");
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(findUpperCase("amazon"), "");
	}
	
	@Test
	public void testCase3()
	{
		Assert.assertEquals(findUpperCase("Amazon"), "A");
	}
	
	@Test
	public void testCase4()
	{
		Assert.assertEquals(findUpperCase("AMAZON"), "AMAZON");
	}
}
