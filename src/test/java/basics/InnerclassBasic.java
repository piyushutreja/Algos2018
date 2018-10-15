package basics;

public class InnerclassBasic {
	
	public static void main(String args [])
	{
		
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner	= outer.new InnerClass();
		
		OuterClass.protectredInnerClass innerProtected = 
				outer.new protectredInnerClass();
		
		
	}

}
