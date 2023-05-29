fun main() {

    /**
     * if else 사용
     * */
    // 코틀린에서 if esle 는 표현식이라고 한다. 이유는 아래와 같이 if esle 가 반환을 하기 때문
    val age: Int = 10;

    val str = if (age > 10) {
        "성인"
    } else {
        "아이"
    }
    println(str)


    // 삼항이 없다.
    val a = 1
    val b = 2
    val c = if (b > a) b else a
    println(c) // 2

    /**
     * when식
     * */
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
        else -> println("0 또는 1이 아님")
    }

    /**
     * for Loop
     * */
    // 범위 연산자 ..를 사용해 for loop 돌리기
    for (i in 0..3) {
        println(i);
    }

    //until를 사용해 3 미만까지 반복
    for (i in 0 until 3) {
        println(i)
    }

    //step 에 들어온 값 만큼 증가시킨다.
    for (i in 0..6 step 2) {
        println(i);
    }

    // downTo 를 사용해 반복하면서 값을 감소시킨다.
    for (i in 3 downTo 1) {
        println(i);
    }

    // 전달받은 배열을 반복
    val numbers = arrayOf(1, 2, 3);

    for (i in numbers) {
        println(i);
    }

    /**
     * while
     * */
    var x = 5

    while (x > 0) {
        println(x)
        x--
    }


}

enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED;

fun getNumber() = 2