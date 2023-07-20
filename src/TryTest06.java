/* throw 와 throws 키워드의 차이점)
 *  1. throw : 예외를 일부러 발생시킬 때 사용하는 키워드(예약어)이다.
 *    형식) throw new 예외 클래스 생성자;
 *    
 *  2. throws : 발생된 예외를 자신이 직접 처리하는 것이 아니라 메서드를 호출한 곳으로 떠넘기면서 예외를 처리한다.
 *    형식) public void 메서드명(매개변수) throws Exception{
 *           try{}catch{}문은 들어갈 필요가 없다.
 *         }
 */
public class TryTest06 {
	public static void exp(int ptr) throws NullPointerException{
		if(ptr == 0) {
			throw new NullPointerException();//인위적 예외 발생
		}
	}
	public static void main(String[] args) {
       try {
    	   System.out.println("예외 발생전");
    	   exp(0);
    	   System.out.println("예외 발생후 : 이 문장 실행 안함.");
       }catch(NullPointerException ne) {
    	   System.out.println("예외 오류 : "+ne);
       }
	}
}
