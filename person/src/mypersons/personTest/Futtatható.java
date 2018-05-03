package mypersons.personTest;

import java.util.Scanner;

import mypersons.Adults;
import mypersons.Child;
import mypersons.Person;

public class Futtatható {

	public static void main(String[] args) {
		Person person1;
		Person person2;

		String name;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("Name:");
		name = input.nextLine();
		age = input.nextInt(); input.nextLine();
		
		if (age < 18){
			
			System.out.println("School:");
			String school = input.nextLine();
			//person1 = new Child("Dessewffy Arisztotelész", 12, "Kupás");
			person1 = new Child(name, age, school);
			
		}else{
			
			System.out.println("Workplace:");
			String workplace = input.nextLine();
			//person2 = new Adults("Lakatos Jason Statham", 44, "Szállító");
			person1 = new Adults(name, age, workplace);
		}
		System.out.println(person1);
		System.out.println(person1.getClass());
		System.out.println("\nPerson: ");
		System.out.println(person1 instanceof Person);
		System.out.println("\nChild: ");
		System.out.println(person1 instanceof Child);
		System.out.println("\nAdult: ");
		System.out.println(person1 instanceof Adults);
		input.close();
		
		
	}

}
