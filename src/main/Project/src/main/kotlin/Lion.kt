/*
class Lion {
    //상태
    //객체가 가지고 있는 변수, 객체는 값을 지정해주거나 생성자에 넣어줘야 함.
    //조물주라고 생각하고 값을 안가지고 있으면 안됨! 값을 꼭 가지고 있어야 함!!
    var firCount: Int = 0 //firCount라는 별명에 담고
    var legCount: Int = 4
    var color: String = "brown"

    //행위
    //객체가 가지고 있는 메서드
    //fun 이름 (매개변수: 상대방한테 입력 받는 값) : 반환타입 {} 외워야함!!, 반환타입은 없을 수도 있음
    //class의 기본 형태
    fun name(): Int {}
    fun sleep() {} // 아무것도 입력 받지 않고 반환하지 않는 것 로직만 실행 되돌려주지 않음
    fun attack(): Int {
        return
    } // 아무것도 입력 받지 않고 Int 반환 반환타입이 있기 때문에 return으로 반환해야함

    fun eat(meat: String) {} // 입력 받고 반환하지 않는 것
    meat. // 입력받는 값을 사용할 수 있음
    fun test(something: String) {
        something.~~~
        return something
    } // 입력 받고 반환


}



fun main() {
    //인스턴스화 -> 메모리에 올라간다
    // Lion()도 class이기 때문에 변수에 담아줘야함!
    val lion = Lion() // class 사용하려면 <- 입력하면 됨!
    val lion2 = Lion() //Lion()이 두번 생성

    //10마리 사자1, 사자2, 사자3...
    //사자 2번이 밥을 안먹더라
    //사자 2번한테 밥을 먹여라
    lion2.eat() // 사자를 분리시키셔 사용할 수 있음.

    //사용하고 싶으면 별칭을 통해 사용
    lion.sleep()
    lion.attack()
    lion.eat("") // 붉은 줄이 생긴 이유는 () 안에 입력값을 넣어줘야 함!! 필수 ,입력 받는 타입이 중요!!

    //항수 별칭 별명
}// 코틀린에서는 ()는 입력이얏!!
//return을 만나면 해당지점에서 끝



//생성자
객체를 생성할 떄 인스턴스화 할 때) () ,로 나눔
        var lion = Lion(4,3,"brown",30)
var lion2 = Lion()

//객체를 만들 떄 생성자에 어떤 값을 넣어주는냐에 따라 다른 값이 나옴!
//객체로 이루어진 스타크래프트를 만들 것이다.
//종족 3종류
class Zealot{}
class Zergling{}
class Marin

상태
        체력
        방어력
        생명력
기타 등등 자유


        행위 - 4가지 형태 다 써보기 (해당되는 행위가 없다면 아이디어가 없다면 메서드명을 test로 해서 채워 넣기)
        걸어간다
        공격한다
        공격받는다
기타 등등 자유

        다음 단계---> 생성자를 통해서 공격력이나 체력 등 상태를 조절할 수 있죠?
        ex) 빨간 사자
        더욱 강한 유닛을 생성해보는 (영웅 유닛)

        main 자유롭게
        객체는 확실하게 3개로 !

        // 내일 오후 3시

*/
