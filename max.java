class max{
	public static void main(String[] args)
	{
		int res=sos(5,7);
		System.out.println(res);
	}
	static int sos(int a, int b){
		if(a>b)
		{
			return a*a;
		}
		else{
		     return b*b;
		}
	}
}