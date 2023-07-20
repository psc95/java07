/* try~catch~finally 문)
 *   try{
 *    정상구문이 실행되다가 예외가 발생하면 실행을 멈추고 해당 catch블록으로 옮겨진다.
 *   }catch(예외처리클래스){
 *    예외 처리한다
 *   }finally{
 *    예외와 상관없이 무조건 마지막에 실행;
 *   } 
 */
public class TryTest03 {
	public static void main(String[] args) {

		int a=10, b01=0, b02=2, re=0;
		
		try {
			re = a/b02;
			System.out.println(re);
			
			re = a/b01;//예외가 발생하고 아래문장 실행 안하고 해당 catch블록({})으로 옮겨진다.
			System.out.println(re);//이 문장 실행 안함.
			re = a/b02;
			System.out.println(re);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("예외와 상관없이 무조건 마지막에 실행됨.");
		}
	}
}
