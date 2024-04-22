package chapter08.classPart;

class Car{
	String name;
	boolean gasoline;
	
	void run() {
		if(gasoline) {
			System.out.println("부릉 부릉");
		}
		else {
			System.out.println("덜컹 덜컹");
		}
	}
	
	void stop(){
		System.out.println("끼이익!");
	}
}

public class Class_basic1 {

	public static void main(String[] args) {
		Car korando = new Car();
		korando.name = "코란도C";
		korando.gasoline = false;
		System.out.print(korando.name + " : ");
		korando.run();
		
		Car equus = new Car();
		equus.name = "에쿠스";
		equus.gasoline = true;
		System.out.print(equus.name + " : ");
		equus.run();
	}
}
