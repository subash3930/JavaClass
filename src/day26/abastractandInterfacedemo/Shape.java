package day26.abastractandInterfacedemo;
// we can not use final
public abstract class Shape {
public abstract void draw();// no private,final and static
public void paint() {
	System.out.println("shape is painted");
}
int a =5;// no abstract in variable
// no abstract here
public Shape () {
	
	System.out.println("shape's constructor");
	
}
}

