
/**
 * 클래스나 메소드에 속하지 않고 변수가 선언되면 탑레벨의 변수라고 한다.
 * */

var topLevel  = 5;

fun main() {
    topLevel++
    println(topLevel)


    /**
     * 변수 선언
     * */
    val a : Int = 4

    val b = 1

    /**
     * 지역 할당 - 지역할당은 데이터 타입을 지정해야한다.
     * */
    val c : Int
    c = 3

    /**
     * val(value)
     * */
    val e : String = "Hello"
//    e = "world";  val 는 상수이기에 값을 변경할 수 없다.

    var f = 123
//    f = "hi"  21라인에서 이미 int로 데이터입이 정해져서 String으로 변경 할 수 없다.
}

