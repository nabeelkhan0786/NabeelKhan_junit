package junit.demo;

public class RemoveFirst2a {
	public String remove(String string) {
		int len=string.length();
		char a='A';
		
		//for strings greater than or equal to 2
		if(len>=2)
		{
			char first=string.charAt(0);
			char second=string.charAt(1);
			String remaining=string.substring(2, string.length());
			if(Character.compare(first, a)==0 && Character.compare(second, a)==0)
			{
					return remaining;
				
			}
			else if(Character.compare(first, a)==0 && Character.compare(second, a)!=0)
			{
				return string.substring(1);
			}
			else if(Character.compare(first, a)!=0 && Character.compare(second, a)==0)
			{
				return string.charAt(0)+string.substring(2);
			}
			else
			{
				return string;
			}
		}
		//for strings of length 1
		else if(len==1)
		{
			char first=string.charAt(0);
			if(Character.compare(first, a)==0)
			{
				return "";
			}
			else
			{
				return string;
			}
		}
		//for string of length 0
		else
		{
			return "";
		}
		
			
		}
}
