package variable.step1;

public class Practice {
	
	static double kor = 90;
	static double math = 80;
	static double eng = 70;
	
	static double total(double kor, double math, double eng) {
		double total = 0;
		total = kor + math + eng;
		return total;
	}
	
	static double avg(double total, int num) {
		double avg = total / num;
		return avg;
	}

	public static void main(String[] args) {
		
		double total = 0;
		total = total(kor, math, eng);		// total 메소드 호출하여 return 값 반환 , 총 점수
		System.out.println("총 점수 : " + total);
		
		double avg = 0;
		avg = avg(total, 3);	// avg 메소드 호출하여 return 값 반환, 평균 값
		System.out.println("평균 점수 : " + avg);

	}

}
