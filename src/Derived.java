
public class Derived extends Base {
	String name = "박지민";
	void print() {
		System.out.println(" 나는 자식ㅋ");
	}
	void display() {
//		System.out.println("나이 이름 = " + this.name);
//		System.out.println("부모의 이름 = " +super.name);
		this.print();
		super.print();
	}
}
