package chap_interface;


/**NOTE
ㆍInterface도 컴파일러(javac)를 통해 컴파일 하면 '~.class' 형태가 되기 때문에 물리적인 형태는 Class와 동일하다.
ㆍInterface를 사용하는 이유는 개발 코드를 수정하지 않고, 사용하는 객체를 변경할 수 있도록 하기 위함이다.
ㆍInterface는 상수 필드와 추상 메서드만을 구성 멤버로 갖는다.(Class는 필드, 생성자, 메서드를 갖는다.)




*/

public interface TestInterface {

    //interface 내부에 선언된 필드는 'public static final' 키워드를 생략해도, 기본값으로 붙은 것으로 인식된다.
    public static final int MIN_NUM = 0;
    public static final int MAX_NUM = 10;

    //interface로 호출된 메소드는 객체에서 실행되므로 추상 메소드로 선언해야 함.
    //추상 메소드 : 메소드명, 매개변수, 리턴타입만 갖는 메소드 (즉, 본문이 있으면 안 됨)
    //interface에 선언된 메소드 역시 'public abstract' 키워드를 생략해도 자동으로 기본값으로 붙음.

    public abstract void add(int x, int y);
}
