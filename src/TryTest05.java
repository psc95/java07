/*ArrayIndexOutOfBoundsException 예외 오류 특징)
 * 배열주소 범위를 벗어나서 발생된 예외 오류이다.
 */
public class TryTest05 {
	public static void main(String[] args) {

		int arr[] = {10,20,30};//배열 크기가 3인 arr배열
		
		try {
			System.out.println("Test - 01");
			arr[3]=40;//배열주소 범위를 벗어나서 예외 오류 발생해서 아래문장 실행안하고 해당 catch블록으로 옮겨진다.
			System.out.println("Test - 02");//이 문장 실행 안함
		}catch(Exception e) {
			e.printStackTrace();//예외 족적을 남김
		}
	}
}
