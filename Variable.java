package a_variable;

import java.util.Scanner;

//import java.util.Scanner;
//ctrl + shift + o

public class Variable {

	public static void main(String[] args) {
		/*
		 * 변수
		 * -하나의 데이터를 저장할 수 있는 메모리상의 공간
		 * -타입(데이터의 종류)과 변수명(변수의 이름)으로 변수를 만들 수 있다.
		 * 
		 * 사용 가능한 기본형 데이터의 종류
		 * -정수 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * -실수 : float(4byte), double(8byte)
		 * -문자 : char(2byte)
		 * -논리 : boolean(1byte)
		 * 
		 * 명명 규칙
		 * -블럭안에서 변수명은 중복될 수 없다.
		 * -영문자 대소문자, 한글, 숫자, 특수문자('_'. '$')를 사용할 수 있다.(한글 사용은 자제하자)
		 * -대소문자가 구분되며 길이에 제한이 없다.
		 * -숫자로 시작할 수 없다.
		 * -예약어는 사용할 수 없다.
		 * -[기본적으로 변수는 소문자를 사용하고, 상수는 대문자를 사용한다.]
		 * -[여러 단어로 이루어진 경우 단어의 첫 글자를 대문자로 한다.(상수는 언더바로 구분)]
		 * -[클래명의 첫글자는 대문자로 한다.]
		 * -[패키지명은 모두 소문자로 한다.]
		 *
		 */

		
		//변수 선언 방법 : 데이터 타입 + 변수 이름
		byte _byte;
		char _char;
		//변수의 공간만 생성
		
		//모든 기본형 타입을 사용해서 8개의 변수를 선언해주세요.
		short _short;
		int _int;
		long _long;
		float _float;
		double _double;
		boolean _boolean;
		
		//선언한 이후 변수를 사용할 떄는 변수의 이름으로 사용한다.
//		System.out.println(_byte); //컴파일 에러 발생 (문법이 틀렸다.)
		//변수에 값을 저장하지 않으면 변수의 값을 참조할 수 없다.
		
		//=(대입연산자) : 대입 연산자의 오른쪽의 값을 왼쪽(변수)에 저장한다. (오른쪽먼저 연산)
		_byte = 10; // 타입에 맞는 값을 저장해야 한다.
		_short = 20;
		_int = 30;
		_long = 40L; //long 접미사 : L
		_float = 3.14f; //float 접미사 : f
		_double = 3.14; //double 접미사 : d(생략가능)
		_char = '가';
		_boolean = true;
		//초기화 : 변수에 처음으로 값을 저장하는 것
		
		System.out.println(_int);
		//ctrl + F11 : 프로그램 실행
		//F11 : 디버그 실행
		
		_int = 50;
		System.out.println(_int);
		_int = 50 + 60;
		System.out.println(_int);
		_int = _byte + _short;
		System.out.println(_int);
		
		//위에서 초기화한 변수에 새로운 값을 저장하고 출력해주세요.
		
		_short = 11;
		_byte = 2;
		_int = 632;
		_long = 10213L;
		_float = 2.001f;
		_double = 6.992;
		_char = '니';
		_boolean = false;
		
		System.out.println(_long);
		
		System.out.println(_char);
		
		System.out.println(_boolean);
		
		System.out.println(_float);
		
		//String : 여러개의 문자를 편리하게 사용하기 위한 클래스
		//문자열 : "(큰따옴표)로 감싸진 글자
		String _String = new String("abcd");
		
		System.out.println(_String);
		
		_String = "1234";
		System.out.println(_String);
		
		/*
		 * 리터럴의 종류
		 * -숫자 : 0, 10, -5, 3,14
		 * -문자 : '가', 'a', '0', ' '
		 * -문자열 : "가나다", "abc", "123", "    ", ""
		 * -그외 : true, false, null
		 * 
		 * 참조형 타입
		 * -기본형 타입을 제외한 모든 데이터 타입(배열, 클래스)
		 * -ex) String, Variable, int[] - 기본형에 대괄호[]가 붙은 경우
		 * -값이 변수에 직접 저장되지 않고 따로 저장이 되며, 그 주소가 변수에 저장된다.
		 * -변수의 크기는 4byte이다.
		 */
		
		//기본 값 : 전역변수에 아무것도 저장하지 않았을 때 저장되어 있는 값
		//메서드 밖에서 선언한 변수를 전역변수라 한다.
		
		_byte = 0;
		_short = 0;
		_int = 0;
		_long = 0L;
		_float = 0.0f;
		_double = 0.0;
		_char = '\u0000'; //' '
		_boolean = false;
		_String = null;
		
		//경우에 따라 변수에 타입이 다른 값을 저장하기도 한다.
		_byte = 127;
		_int = 128;
		_byte = (byte)_int; //형변환 : 데이터 타입을 변환하는 것 ()안에 변환하고자 하는 타입을 적는다.
		System.out.println(_byte); //byte는 -128에서 127까지 표현이 가능하므로 값이 손실되어 값이 가장 작은 수부터 다시 센다 - 오버플로우
		
		_byte = -128;
		_int = -129;
		_byte = (byte)_int;
		System.out.println(_byte);// 언더플로우 - 오버플로우의 반대로 가장 큰 수부터 다시 센다
		//큰 쪽에서 작은 쪽으로 형변환을 할때 오버플로우,언더플로우가 발생될 수 있다.
		
		_double = 3.14;
		_int = (int)_double;
		System.out.println(_int);
		
		_int = _byte;
		_long = _int;
		_double = _int;
		_double = _float;
		//표현범위가 작은 쪽에서 큰 쪽으로 형변환할 때에 값의 손실이 없으므로 형변환 생략이 가능하다. -> 값의 크기가 아닌 표현 범위.
		
		
		//위에서 만든 변수들을 표현범위가 작은 타입으로 형변환 해주세요.
		
		_short = (short)_long;
		_int = (int)_long;
		_byte = (byte)_short;
		_float = (float)_double;
		
		System.out.println(_short);

		//표현 범위가 큰 타입으로 형변환
		
		_double = _float;
		_int = _short;
		_long = _byte;
		_short = _byte;
		
		System.out.println(_double);
		
		_int = (int)_long;
		_int = _short;
		
		_byte = 33;
		_int = 333;
		_byte = (byte)_int;
		System.out.println(_byte);
		
		_char = '토';
		_int = 100;
		_char = (char)_int;
		
		System.out.println(_char);
		
		_char = '가';
		_byte = 2;
		_char = (char)_byte;
		
		System.out.println(_char);
		
		/*
		 * 상수
		 * - 값을 한번 저장하면 변경할 수 없는 저장공간
		 * - final int MAX_NUMBER;
		 * - 리터럴에 의미를 부여하기 위해 사용한다.
		 * 
		 */
		
		final int MAX_NUMBER;
		MAX_NUMBER = 10;
//		MAX_NUMBER = 100; // 컴파일 에러가 발생
		
//		//콘솔창에서 입력받는 방법
		Scanner s= new Scanner(System.in);
//		//ctrl+shift+o
//		System.out.print("문자열을 입력해주세요>");
//		String input1 = s.nextLine(); // 해당 줄에서 멈추고 사용자의 입력 후에 다시 진행된다.
//		//s.nextLine : 문자열을 받을 때 사용**
//		System.out.println("입력받은 문자열 : " +input1);
//		
//		System.out.println("숫자를 입력해주세요>");
//		int input2 = Integer.parseInt(s.nextLine());
//		//Integer.parseInt : 숫자를 받을 때 사용**
//		System.out.println("입력받은 숫자 : " + input2);
		
		
		//자신의 이름을 저장할 변수를 선언해주세요.
		
		String name;
		
		//위에서 선언한 변수를 초기화 하기 위해 이름을 입력받아주세요.
		
		System.out.print("이름을 입력해주세요>");
		name = s.nextLine();
//		System.out.println("이름 :" + name);
		
		//자신의 나이를 저장할 변수를 선언해주세요.
		
		int age;
		
		System.out.print("당신의 나이를 입력해주세요>");
		age = Integer.parseInt(s.nextLine());
//		System.out.println("나이 :" + age);
	
		//이름과 나이를 출력
		
		System.out.println("이름 :" + name + " / 나이 :" + age);
	}

}
