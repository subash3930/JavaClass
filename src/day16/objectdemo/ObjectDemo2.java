package day16.objectdemo;

public class ObjectDemo2 {

	public static void main(String[] args) {
		System.out.println(new ObjectDemo1());
// Object ID =day13.objectdemo.ObjectDemo1@5e91993f
		//*** reference variable
		ObjectDemo2 obj1= new ObjectDemo2();
		 System.out.println(obj1);
		ObjectDemo2 obj2;
		 obj2= new ObjectDemo2();
		 System.out.println(obj2);
		 System.out.println(obj2.hashCode());
		 System.out.println("day13.objectdemo.ObjectDemo2@" +Integer.toHexString(obj2.hashCode()));
		 
	}

}
