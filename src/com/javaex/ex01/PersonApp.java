// 작성자: 04_짝수_조윤주
//문제] 아래의 실행결과가 출력되도록 클래스 다이어그램을 보고 프로그램을 작성하세요

package com.javaex.ex01;

public class PersonApp {

	public static void main(String[] args) {

		Person p = new Person("정우성", "010-1111-2222");
		Customer s = new Customer("유재석", "010-2222-3333", 1, 1000);
		
		// 출력
		p.showInfo();
		s.showInfo();

	}

}
