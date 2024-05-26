package Chap05.RefType;

import java.util.Calendar;

public class TestEnum {
    public static void main(String[] args) {
        Week today = null; //Enum은 참조 타입이라 null 대입 가능

        Calendar calendar = Calendar.getInstance(); //컴퓨터 날짜 및 시간 정보를 제공하는 Calendar 클래스

        int week = calendar.get(Calendar.DAY_OF_WEEK);//일(1)~토(7)까지의 숫자를 얻어 week에 대입

        switch (week){
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }

        System.out.println("Today is "+ today + ".");


    }

}


