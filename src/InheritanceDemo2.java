/*
 * 상속시 주의할점 4가지
 *  1. 생성자는 상속이 되지 않는다.		//부모의 기본성성자를 만들면 해결가능 or 
 *  	-자식 생성자는 항상 부모의 기본생성자만 호출하기 때문이다.
 *  	-만일 부모의 기본생성자가 없다면 에러를 발생하고
 *  	- 에러를 해결하기위해 1) 부모의 기본생성자를 명시적으로 표현하거나 2)super()를 사용한다
 *  	-super() 주의할점
 *  		--생성자 안에서만 사용하고, 반드시 생성자안에서 첫줄에 와야 한다.
 *  2. 
 */
public class InheritanceDemo2 {
	public static void main(String[] args) {
		Lion lion = new Lion("Lion King", 26)
	}

}
class mammal{
	private String name;
	public mammal( String name ) {
		this.name = name;
	}
	
}