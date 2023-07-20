import java.io.PrintWriter;
import java.util.ArrayList;

/* jdk 1.7(자바7)에서 추가된 AutoCloseable인터페이스를 구현 상속받은 자손클래스는 try()내에서 객체를 생성하면
 * finally문에서 명시적으로 close()하지 않아도 자동으로 닫힌다.
 */
public class TryAuto {
	public static void main(String[] args) throws Exception{

		ArrayList<String> nameList=new ArrayList<>();//문자열만 저장 가능함
		
		nameList.add("lee");
		nameList.add("park");
		nameList.add("hong");
		
		try(PrintWriter output=new PrintWriter("./src/out.txt")){
			/* java.io 입출력 패키지의 PrintWriter 출력스트림은 AutoCloseable 인터페이스를 구현 상속을 받아서
			 * try()내에서 객체를 생성하면 finally문에서 명시적으로 닫지 않아도 자동으로 닫힌다. 개발툴의 현재 경로는
			 * Java07프로젝트 경로이다. 이경로의 ./는 현재 경로를 의미한다. 이 경로 하위의 src폴더에 out.txt가
			 * 파일이 생성된다.
			 */
			for(String name:nameList) {
				output.println(name.toUpperCase());//out.txt파일에 영문대문자로 기록
			}
		}
	}
}
