# 2022-05-09 ~ 2022-05-13 주간 Study 정리

## 1. 프로그램이란?    
- 컴퓨터가 실행될 때 특정 작업을 수행하는 명령어들의 집합입니다.

## 2. Java 언어의 장점은?
- (1) 기존 언어는 한 운영체제에 맞게 개발된 프로그램을 다른 종류의 운영체제에 적용하기 위해서는 많은 노력이 필요했지만, 자바는 JVM을 통해 운영체제나 하드웨어가 아닌 JVM하고만 통신하고 JVM이 자바 응용 프로그램으로부터 전달 받은 명령을 해당 운영체제가 이해할 수 있도록 변환하여 전달하기 때문에 운영체제와 하드웨어에 관계없이 실행 가능합니다.(플랫폼 독립성)

- (2) 객체 지향의 특징인 클래스 계층 구조, 상속성, 다형성, 캡슐화 등을 지원합니다.

- (3) 자바로 작성된 프로그램이 실행되면 가비지 컬렉터가 자동적으로 메모리 관리를 해주기 때문에 C언어처럼 메모리 관리를 따로 하지 않아도 됩니다.

- (4) 다양한 JavaAPI를 통해 비교적 짧은 시간에 네트워크 관련 프로그램을 쉽게 개발할 수 있도록 지원합니다.

- (5) 일반적으로 멀티스레드의 지원은 사용되는 운영체제에 따라 구현방법도 처리방법도 다르지만 자바에서 개발되는 멀티스레드 프로그램은 시스템과는 관계없이 구현 가능하며, 관련된 라이브러리(JavaAPI)가 제공되어 구현하기가 쉽습니다.

- (6) 동적 로딩(Dynamic Loading)을 지원합니다.
보통 자바로 작성된 애플리케이션은 여러 개의 클래스로 구성되어 있습니다. 자바는 동적 로딩을 지원하기 때문에 실행 시에 모든 클래스가 로딩되지 않고 필요한 시점에 클래스를 로딩하여 사용할 수 있다는 장점이 있습니다.

## 2-1 자바의 동적 로딩의 장점과 단점
- 일부 클래스가 변경되어도 전체 애플리케이션을 다시 컴파일 하지 않아도 됩니다.  
변경 사항이 발생해도 비교적 적은 작업으로 처리할 수 있습니다.  
C언어와 다르게 코드 블럭이 이곳 저곳에 위치해도 됩니다.  
다형성과 같은 객체 지향 개념이 적용될 수 있게 해줍니다.  
실행 시 연결된 부분에 대한 판단을 해야 하므로 속도 측면에서는 C언어보다 불리합니다.  

## 3. 객체지향 언어의 등장 이유
- 절차지향언어는 코드를 위에서부터 내려오면서 실행되는 방식이기 때문에 동일한 로직의 코드가 문서 내에 넘쳐나고, 코드의 양이 길어지며 추후 유지보수가 어려졌습니다.  
절차 지향 언어의 문제점을 해결하기 위해 등장한 방식이 함수 또는 메소드의 사용입니다.  
메소드를 사용하면 로직의 재사용이 가능하여 개발을 효율적으로 할 수 있지만, 한 문서 내에 데이터가 많아지고, 메소드의 수가 많아지면서 유지보수에 어려움이 발생하게 되었습니다. 그래서 등장한 것이 객체 지향 프로그래밍입니다. 

## 4. 객체지향 언어의 장점
- 객체 지향 언어의 장점은 프로그램 수정 시 추가하거나 수정하더라도 메서드를 사용하기 때문에 다른 코드의 미치는 영향이 적어 유지보수가 쉽고 코드를 재사용하기 좋습니다.  
또한 메서드의 특징은 캡슐화입니다. 그래서 다른 객체에게 자신의 정보를 숨길 수 있습니다.

## 5. 자바의 Primitive Type과 Reference Type
- 기본형 타입은 boolean, byte, char, short, int, long, float, double 8가지로 미리 정의하여 제공하는 타입으로 변수에 값 자체를 stack 메모리에 저장합니다.  
- 참조형 타입은 기본형 타입을 제외한 타입은 모두 참조형 타입으로 문자열, 배열, 열거, 클래스, 인터페이스등을 말합니다. 빈객체를 의미하는 Null이 존재합니다. 값이 저장되는 곳의 주소값을 저장하는 공간으로 Heap 메모리에 저장됩니다.

## 6. 배열과 컬렉션의 차이점
- 배열은 동일한 타입만 사용할 수 있고, 정적 메모리 할당을 하기 때문에 크기가 고정되어 있습니다. 중간에 객체가 삭제되면 다음 항목들의 모든 요소를 이동시켜야 합니다.   
반면 컬렉션은 여러 타입의 객체를 저장할 수 있고 동적으로 메모리를 할당합니다.

## 7. 다형성
- 다형성(polymorphism)이란 하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미합니다.  
하나의 타입으로 다양한 실행 결과를 얻을 수 있으며 객체를 부품화하여 유지보수를 용이하게 합니다.  
자바에서 다형성을 구현하는 방법은   
클래스의 상속이나 인터페이스를 구현하는 자식클래스에서 메서드를 오버라이딩하고 자식 클래스를 부모 타입으로 업캐스팅합니다.   
그리고 부모 타입의 객체에서 자식 멤버를 참조하여 다형성을 구현합니다.

## 8. 멀티 쓰레드의 장점과 단점
- 장점으로는 응답성이 좋고, 자원공유를 효율적으로 할 수 있고, 작업이 분리되어 코드가 간결해집니다. 
- 단점은 테스트, 디버깅하기 어렵고, 전체 프로세스에 영향을 주기 때문에 성능 저하가 동반됩니다.   
또한 동기화에 주의해야하고 교착상태가 발생하지 않도록 주의해야 합니다.

## 9. 자바에서 멀티스레드를 구현하는 방법
- java에서 스레드를 구현하는 방법은 Thread 클래스를 이용하는 것과 Runnable 인터페이스를 이용하는 방법 2가지가 있습니다.  
Thread 클래스를 상속 받으면 다른 클래스를 상속 받을 수 없기 때문에 Runnable 인터페이스를 구현하는 방법이 재사용성이 높고 코드의 일관성을 유지할 수 있습니다.

## 10. 자바 컬렉션의 대표 인터페이스
- List는 배열처럼 순서가 있는 데이터를 관리할 때 사용하고 데이터의 중복을 허용합니다. 종류는 ArrayList, LinkedList, Stack, Vector가 있습니다.  
Set은 순서를 유지하지 않는 데이터의 집합으로 중복을 허용하지 않습니다. 종류로는 HashSet, TreeSet이 있습니다.  
Map은 키와 값 쌍으로 이루어진 데이터의 집합으로 중복을 허용하지 않습니다. HashTable, HashMap, TreeMap이 있습니다.  

## 11. 컬렉션에서 제네릭이 추가된 이유
- 만약 어떤 자료구조를 만들어 배포하려고 할 때 여러 타입을 지원하고 싶다면 하나하나 타입에 따라 만들어야 하는데 이러한 문제점을 해결하기 위해 나온 것이 제네릭입니다.  
데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법입니다.  
제네릭은 컴파일시 타입체크를 해주는 기능입니다.  
다양한 객체를 담을 수 있는 컬렉션의 경우, 제네릭을 사용하면 컴파일시 객체의 타입을 체크해주기 떄문에 객체의 타입안전성을 높이고 개발자가 매번 형변환을 해야하는 번거로움을 줄여줍니다.

## 12. 컬렉션 List 인터페이스를 구현한 ArrayList 컬렉션 클래스
- List 인터페이스에서 상속받아 사용하는 ArrayList는 일반 배열과 동일하게 연속된 메모리 공간을 사용하고 인덱스를 이용하여 특정 위치의 데이터에 바로 접근할 수 있습니다.  
또한 배열과는 다르게 용량을 초과하면 자동으로 부족한 크기만큼 용량이 늘어납니다.

## 13. 접근제어자의 종류와 특성
- public은 접근 제한이 없습니다.  
protected는 같은 패키지 내에서 그리고 다른 패키지의 자손 클래스에서 접근이 가능합니다.  
default는 같은 패키지 내에서만 접근이 가능합니다.  
private는 같은 클래스 내에서만 접근 가능합니다.  

## 14. Wrapper 클래스
- primitive data type에 대응하여 만든 클래스를 primitive data를 포장하는 객체라고 해서 wrapper 클래스라 부릅니다.  
주요 용도는 primitive data type의 값을 객체로 주고받을 때 사용합니다.  
(byte -> Byte, short -> Short, int -> Integer, long -> Long, char -> Character, float -> Float, double -> Double, boolean -> Boolean)

## 14-1 오토박싱과 오토언박싱
- primitive type의 값을 인스턴스에 담는 것은 박싱, 인스턴스에 담긴 primitive 값을 다시 꺼내는 일을 unboxing이라 부릅니다.  
오토박싱은 java1.5부터 지원되는 문법으로 코드의 문맥에 따라 자동으로 박싱과 언박싱을 수행합니다.  
즉 primitivie data type 값을 Wrapper 클래스의 인스턴스에 바로 할당할 수 있습니다.

  ``` java
    // 박싱과 언박싱
    // int ==> Integer
    int i1 = 100;
    Integer obj1 = Integer.valueOf(i1);

    // Integer ==> int
    Integer obj2 = Integer.valueOf(200);
    int i2 = obj2.intValue();

    //오토박싱   
    Integer obj = 100;
  ```

## 15. 추상 클래스
- 클래스 앞에 abstract를 붙이면 추상 클래스가 되는데, 추상 클래스는 서브 클래스들이 가져야하는 공통 변수나 메서드를 제공하기 위해 사용합니다.  
또한 서브 클래스에게 메서드 구현을 강제할 수 있습니다.  
구현하지 않으면 그 서브 클래스 또한 추상 클래스가 되어야 합니다.

## 16. 인터페이스
- 유사한 일을 하는 객체가 있을 때 그 객체의 사용 규칙을 정의 하는 문법이 인터페이스입니다.  
인터페이스를 정의한 후 클래스를 작성할 때는 미리 만들어 준 그 규칙에 따라 만들어야 합니다.  
규칙에 따라 만든 클래스를 사용할 떄는 일관된 방법으로 메서드를 호출할 수 있어 코딩하기 편해지고 유지보수가 쉬워집니다.  

## 16-1 인터페이스 사용 이유
- 예를 들어 개발자들이 협업하여 프로젝트를 만들고 있을 때 공통적으로 implements할 인터페이스를 만들어 메서드명과 클래스명을 통일 할 수 있게 할 수 있고,   
사용할 때 인터페이스를 이용해서 객체를 생성해서 바로 사용할 수 있습니다.   
또한 교체할 때 객체를 생성하는 클래스만 변경해주면 되기 때문에 유지보수에 유리합니다.  

## 16-2 추상 클래스와 인터페이스의 차이
- 추상 클래스는 추상메소드뿐만 아니라 생성자, 필드, 일반메서드까지 포함할 수 있으나 인터페이스는 오로지 추상 메서드와 상수만을 포함할 수 있습니다.  
또한 추상 클래스는 상위 클래스와 하위 클래스로 나누어져서 하위 클래스는 더 구체화됩니다.  
반면에 인터페이스는 수평적 구조를 가지게 됩니다.   
수직적 구조를 갖는 추상 클래스는 하나의 상위 클래스에게만 상속 받을 수 있지만, 수평적 구조의 인터페이스는 하나의 클래스가 여러 인터페이스를 가져올 수 있습니다.  

## 17. 자바 GUI에서 AWT와 Swing의 차이
- AWT는 운영체제가 갖고 있는 각 컴포넌트를 이용합니다. 즉 운영체제의 종속적인 GUI로서 운영체제 종류에 따라 화면에 출력되는 모양이 다릅니다.  
스윙은 운영체제가 갖고 있는 GUI를 사용하지 않고 JVM의 스윙 패키지를 사용해 구현합니다. 따라서 운영체제가 다르더라도 동일한 화면을 출력합니다.  

## 18. 가비지 콜렉터
- 프로그램을 개발하다 보면 유효하지 않은 메모리인 가비지가 발생합니다.  
C언어를 사용할 때는 free()라는 함수를 통해 직접 메모리를 해제해주어야 하지만,  
java를 이용해 개발하면 개발자가 메모리를 해제하지 않고 JVM의 가비지 컬렉터가 불필요한 메모리를 알아서 정리해줍니다.