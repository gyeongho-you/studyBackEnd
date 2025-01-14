package c06;

import c06.com.example.PakageEx1;

//패키지
//프로젝트를 개발하다 보면 적게는 수십개, 많게는 수백 개의 클래스를
//작성해야 합니다.
//클래스를 체계적으로 관리하지 않으면 클래스 간의 관계가 뒤엉켜서
//복잡하고 난해한 프로그램이 되어 결국 유지 보수가 어렵습니다.
//자바에서는 클래스를 체계적으로 관리하기 위해 패키지(package)를 사용합니다.

//패키지의 물리적인 형태는 파일 시스템의 폴더입니다.
//패키지는 단순히 파일 시스템의 폴더 기능만 하는 것이 아니라
//클래스의 일부분으로, 클래스를 유일하게 만들어 주는 식별자 역활을 합니다.
//클래스 이름이 동일하더라도 패키지가 다르면 다른 클래스로 인식합니다.
//클래스의 전체 이름은 '패키지 이름+클래스 이름'인데
//패키지가 상하위로 구분되어 있다면 도트(.)사용해서 표현합니다
//상위패키지.하위패키지.클래스
public class PakageDefine {
	PakageEx1 pakageEx1=new PakageEx1();
	//패키지 이름의 중복 방지 방법
	//여러 개발 회사가 함께 참여하는 대규모 프로젝트나 다른 회사의 패키지를 이용해서
	//개발할 경우 패키지 이름이 중복될 가능성이 있습니다.
	//그래서 회사들 간에 패키지가 서로 중복되지 않도록 흔히 회사의 도메인 이름으로
	//패키지를 만듭니다.
	//도메인은 등록 기관에서 유일한 이름이 되도록 검증되었기 때문에 도메인 이름으로
	//패키지를 만들면 다른 회사의 패키지와 중복되는 경우가 발생하지 않습니다.
	//도메인 이름 역순으로 패키지 이름을 지어 주는데,
	//그 이유는 포괄적인 이름이 상위 패키지가 되도록 하귀 위해서입니다.
	//그리고 마지막에는 프로젝트 이름이나 부서 이름을 붙여 주는 것이 관례입니다.
	//com.samsung.projectname
	//com.hyundai.partname
	//com.lg.projectname
	//org.apache.cellname
	
	//패키지 이름은 개발자가 임의대로 지어주면 되지만, 지켜야 할 몇가지 규칙이 있다
	// - 숫자로 시작해서는 안 되고 _,$을 제외한 특수 문자를 사용해서는 안됩니다.
	// 관례적으로 특수 문자도 사용하지 않습니다.
	// - java로 시작하는 패키지는 자바 표준 API(라이브러리)에서만 사용하므로
	// 사용해서는 안 됩니다.
	// - 모두 소문자로 작성하는 것이 관례입니다.

}








