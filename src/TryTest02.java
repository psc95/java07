/* try~catch문에서 복수개의 catch{}블록을 사용한 경우)
 * 
 * try{
 *   정상구문이 실행되다가 예외가 발생하면 실행순서가 해당 catch블록으로 옮겨진다.
 *  }catch(예외처리 자손클래스가 먼저 나온다 ){
 *    예외 처리문장;
 *  }catch(예외처리 부모클래스는 나중에 나온다){
 *    예외 처리문장;
 *  }   
 */
public class TryTest02 {
	public static void main(String[] args) {

		int a=10, b01=0, b02=2, result=0;
		
		try {
			result=a/b02;
			System.out.println(result);
			
			result=a/b01;//예외가 발생.자바는 정수 숫자를 0으로 나누면 ArithmeticException 예외 오류를 발생시킴
			System.out.println(result);//이 문장 실행 안함
		}catch(ArithmeticException ae) {//구체적인 예외처리 자손클래스가 먼저 기술된다.
			ae.printStackTrace();//예외 족적(발자취)을 남김
		}catch(Exception e) {//예외 처리 부모클래스가 나중에 기술
			e.printStackTrace();
		}
	}
}

