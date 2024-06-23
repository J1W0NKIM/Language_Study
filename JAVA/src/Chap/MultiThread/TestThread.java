package Chap.MultiThread;

public class TestThread {

    public static void main(String[] args) {
        System.out.println("실행");

        Thread currThread = Thread.currentThread();//Instance 생성 없이 사용 가능한 정적 메소드

        System.out.println(currThread.getName());//Thread는 이름이 있음.

        Thread1 thread1 = new Thread1();
        Thread thread2 = new Thread(new Thread2());

        System.out.println("종료");
    }
}


//아래 두 방법 다 결국 run이라는 함수를 채워주는 것은 동일하다.
class Thread1 extends Thread{ //Thread 클래스를 상속 받아 구현하는 방법
    @Override
    public void run(){


   }
}
//Runnable 인터페이스를 구현 받아 구현하는 방법
class Thread2 implements Runnable{
    @Override
    public void run() {

    }
}