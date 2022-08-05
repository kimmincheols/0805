
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = new Employee();
//		System.out.println(m.salary);
//		System.out.println(e.name);
		System.out.println(e.salary);		//상속
		/*
		 * 상속시 주의 사항
		 * 1.  클래스가 final로 되어있으면 상속받을수 없다.
		 * 2. 
		 */
	}
}
class Manager{
	int salary = 1000000;;
}

class Employee extends Manager{
	String name = "한지민";
}