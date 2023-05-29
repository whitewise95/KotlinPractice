fun main() {

    //if else 사용
    val job = "Software Developer"

    if (job == "Software Developer") {
        println("개발자")
    } else {
        println("개발자아님")
    }


    // 코틀린에서 if esle 는 표현식이라고 한다. 이유는 아래와 같이 if esle 가 반환을 하기 때문
    val age: Int = 10;

    val str = if (age > 10) {
        "성인"
    } else {
        "아이"
    }


    // 삼항이 없다.
    val a = 1
    val b = 2
    val c = if (b > a) b else a


    // when식
    val day = 2
    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        else -> "기타"
    }

    println(result);

    // 값이 전부 온다면 else를 생략할 수 있다.
    when (getColor()) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
    }

    //여러개의 조건을 콤마로 구분해 한줄에서 정의할 수 있다.
    when (getNumber()) {
        0, 1 -> println("0 또는 1")
    }
}

enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED;

fun getNumber() = 2