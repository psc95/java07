/* try~catch문의 실행 순서 1  
 */
public class TryTest09 {
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4);
		}catch(Exception e) {
			System.out.println(5);//예외가 발생하지 않으면 실행안함.
		}
		System.out.println(6);
		
		/*  실행순서를 작성해 보세요)
		 * 1->2->3->4->6
		 */
	}
}
