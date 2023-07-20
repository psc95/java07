/* try~catch 예외 처리문장 형식)
 *   try{
 *     정상구문 실행하다가 예외 오류가 발생하면 실행을 멈추고 실행순서가 해당 catch블록으로 옮겨진다.
 *   }catch(예외 처리클래스 매개변수){
 *     예외 처리코드;
 *   }  
 */
public class TryTest01 {
	public static void main(String[] args) {

		int a=10,b01=0,b02=2,result=0;
		
		try {
			result = a/b02;
			System.out.println(result);
			
			result = a/b01;//정수 숫자를 0으로 나누면 예외가 발생하고 아래문장을 수행 안함.
			System.out.println(result);//이 문장 수행안함.
		}catch(Exception e) {
			System.out.println("예외 오류 :"+e);
		}
	}
}
