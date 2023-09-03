# 변수 (variable)

## 탑레벨 변수 
> 코틀린은 함수나 클래스에 외에 변수를 선언해서 사용할 수 있는데 이것을 탑레벨 변수라고 한다.
```kotlin

var topLevel  = 5;

fun main() {
    topLevel++
    println(topLevel)  // 6
}
```


---


## 변수

### 변수선언1
> 코틀린은 var 변수명 : 데이터타입 = 값 으로 변수를 선언할 수 있다.
```kotlin
fun main() {
    var a : Int = 4
    var b = 1
}
```

### 변수선언2
> f는 이미 int로 데이터입이 정해져서 String으로 변경 할 수 없다.
```kotlin
    var f = 123
//    f = "hi" 
```

### 변수선언3
> 지역 할당 - 변수명과 데이터타입만 정해주고 이 후에 값을 지정한다.
```kotlin
    val c : Int
    c = 3
```

---

## 상수 선언
> val 로 상수를 만들 수 있다.
```kotlin
    val e : String = "Hello"
//    e = "world";  val 는 상수이기에 값을 변경할 수 없다.
```
