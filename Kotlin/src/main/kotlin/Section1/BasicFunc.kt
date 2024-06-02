package Section1


fun main() {
    val num1: Int = 3
    //val num2: Long = num1
    //kt에서는 명시적 타입 캐스팅만 가능해서 아래처럼 써줘야 함
    val num2: Long = num1.toLong()
    println(num2)

    //kt에서 문자열 내 특정 문자 추출하는 방법
    val str: String = "ABCDE"
    val ch = str[1]
    println(ch)
}