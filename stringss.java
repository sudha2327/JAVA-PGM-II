public class stringss{
	public static void main(String[] args){
		int count=0;
		
		String s="hello";
		System.out.println(s.substring(0,2));
		String s1=" sudhAgar";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.trim());
		String s3="sachine";
		System.out.println(s3.endsWith("e"));
		System.out.println(s3.startsWith("u"));
		System.out.println(s3.charAt(3));
		System.out.println(s3.length());
		System.out.println(s1.replace("dh","va"));
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				
				count++;
			}
			
		}
		System.out.println("values of vowels is"+ count);
	  }
	
}