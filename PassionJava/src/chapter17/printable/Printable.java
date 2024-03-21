package chapter17.printable;

// 인터페이스의 본질적 의미
// - 인터페이스는 코드와 코드를 연결하는 다리 역할
// >> 코드의 덩어리 + 인터페이스 + 코드의 덩어리
// 일반적으로는 인터페이스가 라이브러리와 코드를 연결
// >> 라이브러리 + 인터페이스 + 작성한 코드

// 윈도우에서 프린트 기능을 하는 라이브러리 제공
// 프린터 제조 회사에서는 해당 라이브러리를 활용하여 프린트 소프터웨어를 작성

// 윈도우에서 제공하는 인터페이스
public interface Printable {
	public void print(String doc);
}