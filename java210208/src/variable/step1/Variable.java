package variable.step1;

public class Variable {
	// 선언부
	
	// 메소드 선언부
	void methodA(int x) {		
		System.out.println(x);
	}
	
	double methodB(int x) {
		
		return 3.14;
	}
	// 메인 메소드 - exe파일로 만들 수 있다.

	/********************************************
	 * 문제해결능력 키움
	 * @return void이다. - 비어있다. - 돌력 받을 수 있는 값이 없다.
	 * - 이것때문에 에러가 발생 할 수도 있다.
	 * @param args
	 *******************************************/
	public static void main(String[] args) {
		// System : 너의 컴터 out속성 : 출력장치(하드웨어 - 모니터, 프린터...)
		// System.out.print();		// 반환값이 없다. , 에러
		// System.out.print(); 		// 줄바꿈이 없다.
		System.out.print(5);	// 메소드 호출
		// 메소드 선언할 때는 좌중괄호 우중활고 를 사용하고....
		// 메소드 호출할 때는 ;
		// APIm XXX,jar, 이 안(클래스안에 객체 안에)에 있는 것을 꺼낸다.
		//print 메소드는 여러 개이다.
		// SELECT 이름 FROM 회원 집합
		// WHERE 아이디 = 'test'
		// AND 비번 = '123'
		System.out.println();	// 줄바꿈 추가된 메소드
		System.out.println(1+"   "+1);	// 줄바꿈 추가된 메소드
		System.out.println(10+"10");	// 줄바꿈 추가된 메소드
		
		Variable v = new Variable();
		System.out.println(v.methodB(1));
		v.methodA(1);

	}

}
