/* Exception 예외 처리 부모클래스를 상속받아서 사용자 정의 예외 클래스 생성 */
class  UserException extends Exception{
	
	public UserException() {}
	
	public UserException(String message) {
		super(message);//부모클래스 오버로딩 된 생성자를 호출하면서 예외 오류 메시지를 생성
	}
}
public class TryTest07 {
	public static void main(String[] args) {
     try {
    	 int a = -11;
    	 if(a<=0){
    		 throw new UserException("양수가 아닙니다!");
    	 }
     }catch(UserException ue) {
    	 System.out.println(ue.getMessage());//예외 오류 메시지가 출력
     }
	}
}
