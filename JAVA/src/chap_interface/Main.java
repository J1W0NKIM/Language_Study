package chap_interface;

public class Main implements TestInterface{

    //interface를 구현할 땐, 내부에 정의된 메소드를 반드시 Override 해줘야 함.
    @Override
    public void add(int x, int y){
        System.out.println(x + " + " + y + " = " + (x + y) + "입니다.");
    }

    public static void main(String[] args) {
        System.out.println(MIN_NUM + MAX_NUM);

        //main 메소드는 정적 메소드라 인스턴스 메소드를 직접 호출할 수 없음
        //따라서 Main 클래스의 객체를 생성하여 그 객체를 통해 add를 호출하는 것.
        Main myObject = new Main();
        myObject.add(4, 5);

        //위처럼 사용하지 않고, 인터페이스 변수에 객체를 대입하여 사용할 수 있음.
        TestInterface mTestInterface = new Main();
        mTestInterface.add(10, 10);
    }
}
