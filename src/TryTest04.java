/* NullPointerException 예외 오류 발생 예제)
 *  이 예외 오류는 참조 즉 레퍼런스 타입 변수만 선언한 상태에서 null만 대입하고 객체를 생성하지 않은 상태에서 사용하면 발생한다.
 *  일반적으로 프로젝트 개발에서 가장 예외 오류를 잡기가 힘든 경우이다.
 */
class Member04{
	String id="abc56789";
	String name="홍길동";
	String addr="서울시 종로구 ";
}
public class TryTest04 {
	public static void main(String[] args) {

		Member04 m=null;
		try {
			System.out.println("아이디:"+m.id+",회원이름:"+m.name+",주소:"+m.addr);
		}catch(Exception e) {
			System.out.println("예외 발생:"+e);
			m=new Member04();//객체주소가 저장된 참조변수(레퍼런스 변수) =>m객체 생성
			System.out.println("아이디:"+m.id+",회원이름:"+m.name+",주소:"+m.addr);			
		}
	}
}
