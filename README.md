# 흐름제어

##  if else 표현식
> 코틀린에서 if esle 는 반환을 하기 때문 표현식이라고 한다. 
```kotlin
 fun main() {
    val age: Int = 10;

    val str = if (age > 10) {
        "성인"
    } else {
        "아이"
    }

    println(str) // 아이
}
```

<br>

> 삼항이 없다.
```kotlin
 fun main() {
    val a = 1
    val b = 2
    val c = if (b > a) b else a
    println(c) // 2
}
```


<br>


<br>



## when
```kotlin
 fun main(){
    val day = 2
    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        else -> "기타"
    }

    println(result); // 화요일

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
}

enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED;

fun getNumber() = 2
```

<br>


<br>


## for Loop
> 범위 연산자 ..를 사용해 for loop 돌리기
```kotlin
 fun main() {
    for (i in 0..3) {
        println(i);
    }
}
```

<br>


> until를 사용해 3 미만까지 반복
```kotlin
 fun main() {
    for (i in 0 until 3) {
        println(i)
    }
}
```

<br>


>  step 에 들어온 값 만큼 증가시킨다.
```kotlin
 fun main() {
    for (i in 0..6 step 2) {
        println(i);
    }
}
```

<br>


>   downTo 를 사용해 반복하면서 값을 감소시킨다.
```kotlin
 fun main() {
    for (i in 3 downTo 1) {
        println(i);
    }
}
```

<br>


>   전달받은 배열을 반복
```kotlin
 fun main() {
    val numbers = arrayOf(1, 2, 3);

    for (i in numbers) {
        println(i);
    }
}
```

<br>


<br>



## while
```kotlin
 fun main() {
    var x = 5

    while (x > 0) {
        println(x)
        x--
    }
}
```









