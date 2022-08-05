import java.util.Date;

public class Car {
	private String name;
	private int price;
	private String maker;
	private Date today;
	private final double PI;
//	private final double PI = 3.151596;
	
	public Car(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
//		this.PI = 3.141596;
		System.out.println("방금 객체가 생성되었습니다.");
	}

	{
		System.out.println(" Hello, Worldㅋ"); // 초기화 블록 Initialization Block
		this.today = new Date();
		this.PI = 3.141596;
		// 객체를 메모리에 로딩될 때 단 한번 실행이 된다. 멤버변수와 상관없는 것을 초기화 하는 것
	}
	
	@Override
	public String toString() {
		return "오늘은" + this.today + "입니다.ㅋ";
	}
}
