package variable.step1;

public class Quiz1 {
	// 메소드에는 2가지 종류가 있다.
	// JVM에서 제공되는 메소드와 사용자 정의 메소드
	// 메소드 선언 순서는 리턴타입 메소드 이름(){ 실행문; }
	// 메소드 선언할 때 리턴타입과 반환타입을 결정할 수 있다.
	// -> 기초가 아니다. 코딩을 해봐야 된다.
	int x = 3;

	
	public static void main(String[] args) {
		Quiz1 q = new Quiz1();
		q.methodA();	// 다음 문법 에러를 해결하시오.
		q.methodA(5);
		System.out.println(q.x);
	}
	// methodA의 호출이 선언 앞에 오더라도 에러가 아니다.
	// 왜냐하면 자바는 절차지향 프로그램 언어가 아니니까
	// 객체지향 언어이므로 호출 순서와는 상관이 없다.
	// 자바는 같은 이름의 메소드를 중복하여 선언할 수 있다.
	// 이 것을 가능하게 하는 규칙은 메소드 오버로딩이다.
	// 메소드 오버로딩은 반드시 파라미터의 타입이 다르거나(합집합 : 둘중에 하나만 만족해도 참)
	// 파라미터의 갯수가 달라야 한다.
	// 주의사항 : 리턴타입이 있고 없고는 영향을 주지 않는다.

	private void methodA() {	//private : 안에서만 접근 허용
		System.out.println("methodA 호출 성공");
	}
	
	private void methodA(int x) {	//private : 안에서만 접근 허용
		System.out.println("methodA(int x) 호출 성공 =====>  " +x);
		
	}
	
	private int methodA(double y) {	//private : 안에서만 접근 허용
		System.out.println("methodA 호출 성공");
		return 0;
	}
	
	/*
	private int methodA() {	//private : 안에서만 접근 허용
		System.out.println("methodA(int x) 호출 성공 =====>  " +x);
		
	}
	*/

}

// 컴파일이 되는 시점
// 소스코드를 실행시킬 때 말고 "ctrl + s" (저장) 할 때 컴파일 된다.
// 업체에 이행할 때는 .java는 배포하지 않는다.
// .class만 배포한다.
// 그 이유는 주석이 안보이고 소스도 보지 못하지 때문인다.

// non static 타입은 static 타입 안에서 사용할 수 없다.