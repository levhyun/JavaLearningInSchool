package kr.hs.dgsw.java.DataType;

public class DataType {
    public static void main(String[] args) {
        // 정수
        byte byteValue = 1;
        // byte : 8비트(1바이트) 크기의 정수를 저장하는 자료형입니다.
        // 범위는 -128부터 127까지입니다.
        short shortValue = 1;
        // short : 16비트(2바이트) 크기의 정수를 저장하는 자료형입니다.
        // 범위는 -32,768부터 32,767까지입니다.
        int intValue = 1;
        // int : 32비트(4바이트) 크기의 정수를 저장하는 자료형입니다.
        // 범위는 -2,147,483,648부터 2,147,483,647까지입니다.
        // 자바에서 가장 많이 사용되는 자료형 중 하나입니다.
        long longValue = 1L;
        // long : 64비트(8바이트) 크기의 정수를 저장하는 자료형입니다.
        // 범위는 -9,223,372,036,854,775,808부터 9,223,372,036,854,775,807까지입니다.

        // 범위 출력
        System.out.printf("byte 범위 :  %d ~ %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short 범위 :  %d ~ %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int 범위 :  %d ~ %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long 범위 :  %d ~ %d\n", Long.MIN_VALUE, Long.MAX_VALUE);
        
        byte max= 127;
        max += 1;
        System.out.println("max = " + max); // -128

        shortValue = 128;
        byteValue = (byte) shortValue;
        System.out.println("byteValue = " + byteValue);


        // 실수
        float floatValue = 3.1415926535897932384626433832795F;
        // float : 32비트(4바이트) 크기의 부동소수점 수를 저장하는 자료형입니다.
        // 범위는 대략 ±3.4E-38부터 ±3.4E+38까지입니다. 뒤에 F 또는 f를 붙여야 합니다.
        double doubleValue = 3.1415926535897932384626433832795;
        // double : 64비트(8바이트) 크기의 부동소수점 수를 저장하는 자료형입니다.
        // 범위는 대략 ±1.7E-308부터 ±1.7E+308까지입니다.
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);

        float value = 0.00F;
        for(int i = 0; i < 1000; i++) {
            value += 0.001F;
        }
        System.out.println("value = " + value);


        // 불
        boolean bool = true;
        // boolean : true 또는 false 값을 저장하는 자료형입니다.
        System.out.println("bool = " + bool);
        bool = (2 == 2 && 3 == 4); // (true && false) -> false
        System.out.println("bool = " + bool);


        // 문자
        char c = 'A'; // A -> 65
        // char : 16비트(2바이트) 크기의 유니코드 문자 하나를 저장하는 자료형입니다.
        // 범위는 '\u0000'(널 문자)부터 '\uffff'(유니코드 최대 값)까지입니다.
        c = 66; // 66 -> B
        System.out.println("c = " + c);
        System.out.printf("(int) c = %d\n", (int) c);

        // print : A ~ Z
        for (int i = 65; i < 91; i++) {
            System.out.printf("%c ", (char) i);
            if (i == 90) {
                System.out.printf("\n");
            }
        }

        // print : a ~ z
        for (int i = 97; i < 123; i++) {
            System.out.printf("%c ", (char) i);
            if (i == 122) {
                System.out.printf("\n");
            }
        }

        // print : 가 ~ 힣
        for (char k = '가'; k <= '힣'; k++) {
            System.out.printf("%c ", k);
            if (k == '힣') {
                System.out.printf("\n");
            }
        }


        // Wrapper
        Integer integerValue = 3;
        Boolean booleanValue = true;
        Byte byteValue2 = 1;
        Short shortValue2 = 1;
        Long longValue2 = 1L;
        Float floatValue2 = 1.1F;
        Double doubleValue2 = 1.1;
        /*
            자바에서 기본 자료형(primitive type)은 객체가 아닌 값을 직접 저장하는 데이터 타입이다.
            하지만 객체지향 프로그래밍에서는 객체를 다루므로, 기본 자료형을 객체로 다루기 위해 wrapper 클래스가 제공된다.

            Wrapper 클래스를 사용하면 기본 자료형을 객체로 다룰 수 있으며, 이를 통해 객체지향 프로그래밍의 장점을 취할 수 있다.
            또한, wrapper 클래스는 자바에서 제공하는 라이브러리와 함께 사용할 때 유용하다.

            Boolean <-> boolean
            Character <-> char
            Byte <-> byte
            Short <-> short
            Integer <-> int
            Long <-> long
            Float <-> float
            Double <-> double
        */
    }
}
