package DeepakPackage;

public class Class2 {
	
	int a=10;
	int b=2;
	int c;
	int d;
	int e;
	
	public int sum()
	{
		c=a+b;
		return c;
	}
	public int sub()
	{
		d=a-b;
		return d;
	}
	public int mul()
	{
		e=c*d;
		return e;
	}

	public static void main(String[] args) {
		
		Class2 ob = new Class2();
		System.out.println(ob.sum());
		System.out.println(ob.sub());
		System.out.println(ob.mul());

	}

}
