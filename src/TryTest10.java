/* 문제)try{}블록내에서 정수 숫자 5를 0으로 나눠서 예외를 발생시켜서 실행순서를 1->2->3->4는 실행안하고->5->finally
 * 문에서 6이 무조건 실행되게 만들어 보자. 
 */
public class TryTest10 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(5/0);//예외 오류 발생
			System.out.println(4);//실행 안함
		}catch(Exception e) {
			System.out.println(5);
		}finally {//finally문은 실행 예외와 상관없이 무조건 마지막에 실행되는 문장
			System.out.println(6);
		}
	}
}
