package basics;

public class OuterClass {
	
	public int sampleVar;
	
	public static int sampleStaticVar;
	
	
	public OuterClass()
	{
		
	}

	public class InnerClass
	{
		
		public int innerVar;
		
		public static final int innerStaticVar=100;
	}

	
	public static class  InnerStatic
	{
		
		public int var;
		
		public static int var2;
		
	}
	
	protected class protectredInnerClass
	{
			public int innerVar;
		
		public static final  int innerStaticVar=20;
	}
	
	protected static class protretecInnerStaticInnerclass
	{
		public int innerVar;
		
		public static  int innerStaticVar;
	}

}
