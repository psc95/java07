public class TryTest08 {
	public static void main(String[] args) {

		int number = 100;
		int result = 0;
		
		for(int i=0;i<10;i++) {
			try {
				result=number/(int)(Math.random()*10);
				/* random() 내장 정적메서드 기능은 0.0이상 1.0미만 사이의 실수 숫자 난수를 발생=>*10하면 0.0이상
				 * 10.0미만 -> (int)로 형변환하면 반올림 안하고 소수점 이하는 버린다. 즉 0이상 10미만 0~9사이의
				 * 임의의 정수 숫자 난수를 발생. 결국은 100을 0으로 나누면 예외가 발생해서 catch블록문의 0이 출력된다.
				 */
				System.out.println(result);//정수 숫자 난수가 0이 아닐 때 나눈 정수몫이 출력
			}catch(ArithmeticException ae) {
				System.out.println("0");
			}
		}//for
	}
}
