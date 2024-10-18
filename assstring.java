public class assstring{
	public static void main(String[] args){
		int count=0;
		String s="  object oriended programming using JAVA";
		String s1="B.TECH IT Students";
		System.out.println(s.substring(39,43));
		System.out.println("                                      ");
		for(int j=0;j<s.length();j++){
			if(s.charAt(j)=='g'){
				
				System.out.println(s.charAt(j));
			}
			
		}
		
		System.out.println(s.trim());
		System.out.println("                                      ");
		System.out.println(s.replace("object","oops"));
		System.out.println("                                      ");
		System.out.println(s.toUpperCase());
		System.out.println("                                      ");
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
				
				count++;
		}
		
		}
		
		System.out.println("no.of vowels in the given string s:"+count);
		System.out.println("                                      ");
		String s2=s.concat(s1);
		System.out.println("concatination of the stirng is :"+s2);
		System.out.println("                                      ");
		System.out.println("length of the s string:"+s.length());
		System.out.println("                                      ");
		System.out.println("length of the s1 string:"+s1.length());
		
	}
	
}