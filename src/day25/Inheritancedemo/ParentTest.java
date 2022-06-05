package day25.Inheritancedemo;

public class ParentTest {

	public static void main(String[] args) {
		Parent p= new Parent();
		System.out.println(p.name);
		p.greet();
		
		Child c=new Child();
		System.out.println(c.name);
		c.greet();
		
//		GrandChild g = new GrandChild();// multilevel inheritance
//		System.out.println(g.name);
//		g.greet();
//		

	}

}
