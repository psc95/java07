/* try~catch문 실행순서 */
public class TryTest12 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(7/0);//예외 오류 발생
			System.out.println(4);//이 문장 실행 안함.
		}catch(NullPointerException ne) {//이 블록문은 실행 안함.
			System.out.println("예외 메시지:"+ne.getMessage());
			ne.printStackTrace();
		}catch(Exception e) {//이 블록문이 실행됨.
			System.out.println("예외 메시지2:"+e.getMessage());
			e.printStackTrace();
		}
	}
}
