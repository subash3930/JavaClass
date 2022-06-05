package day27.polymorphismdemo;

import java.util.Scanner;
// run time polymorphism(dynamic binding)
//which can be achieved by method overriding
public class AnimalTest {

	public static void main(String[] args) {
		Animal animal=null;
//		animal = new Dog();
//		animal.makeSound();
//		
//		animal=new Tiger();
//		animal.makeSound();
Scanner input = new Scanner(System.in);
System.out.println(" Choose animal");
String animalType=input.next();
switch(animalType) {
case"dog":
	animal=new Dog();
	break;
case "tiger":
	animal=new Tiger();
	break;
	default:
		System.out.println("Wrong Slection....");
		break;
}

	
	
	if(animal!=null) {
		animal.makeSound();
		
	}
input.close();
}
 
	
	}

