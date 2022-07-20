
public class TestGarbage {

	public static void main(String[] args) 
	{
		TestGarbage t1=new TestGarbage();
		TestGarbage t2=new TestGarbage();
        t1=null;
        t2=null;
        System.gc();
	}
	public void finalize() 
	{
		System.out.println("Object collected by garbage collector:-");
	}

}
