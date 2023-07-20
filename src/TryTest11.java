/*  try~catch~finally문 실행순서 */
public class TryTest11 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(10/0);//예외 오류 발생 =>자바는 정수 숫자를 0으로 나누면 예외가 발생한다.
			System.out.println(4);//이 문장 실행 안함.
		}/* 문제)첫번째 catch블록에서는 ArithmeticException 예외로 처리하고 해당 블록문에서 instanceof연산자를
		사용해서 ae매개변수가  해당 ArithmeticException타입으로 형변환이 가능한가? true가 나오게 해보자.
		둘째, finally{} 으로 처리해서 6을 출력해보자.
		*/
		catch(ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println(true);
			}
		}finally {
			System.out.println(6);
		}
	}
}
