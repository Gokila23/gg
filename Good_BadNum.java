package GNBN;

public class Good_BadNum {
public static void main(String[] args) {
	String str="1213";
	System.out.println(str);
	boolean flag=true;
	int temp=0;
	for(int i=0;i<str.length();i++)
	{
		int a=Integer.parseInt(Character.toString(str.charAt(i)));
		if(((a<1)||(a>3)))
		{
			flag=false;
			break;
		}
	}
	for(int i=1;i<=str.length()/2&&flag;i++)
	{
		temp=Integer.parseInt(str.substring(0,i));
		for(int j=i;j<str.length();j+=i)
		{
			if(j+i>str.length())
			{
				break;
			}
			int a=Integer.parseInt(str.substring(j,j+i));
			if(temp==a)
			{
				flag=false;
				break;
			}
			temp=a;
		}
		
	}
	if(flag)
	{
		System.out.println("Good");
	}
	else
	{
		System.out.println("Bad");
	}
}
}
