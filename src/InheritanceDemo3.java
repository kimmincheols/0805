/*
 * 상속시 주의할 점
 * 2. private는 상속되지 아니하다.
 */
public class InheritanceDemo3 {
	public static void main(String[] args) {
		Sparrow sp = new Sparrow(10);
		System.out.println(sp.name); //private는 상속되지 않는다.
	}
}
