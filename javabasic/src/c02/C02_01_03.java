package c02;

public class C02_01_03 {

	public static void main(String[] args) {
		//변수 사용 범위
		//로컬 변수(local variable)
		//메소드 블록 내에서 선언된 변수를 로컬 변수라고 합니다
		//로컬 변수는 메소드 블록 내부에서만 사용되고
		//메소드 실행이 끝나면 메모리에서 자동으로 없어집니다.
		int v1=15;
		if(v1>10) {
			int v2;
			v2=v1-10;
		}
		///v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
//		int v3=v1+v2+5;
		//변수를 선언할 때 주의사항
		//변수가 어떤 범위에서 사용될 것인지를 생각하고, 선언 위치를 결정
		//메소드 블록 전체에서 사용하고 싶다면 메소드 블록 첫머리에 선언
		//특정 블록 내부에서만 사용된다면 해당 블록 내에 선언합니다.
	}

}