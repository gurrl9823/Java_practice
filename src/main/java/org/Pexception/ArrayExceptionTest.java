package org.Pexception;

public class ArrayExceptionTest {

    /*

    에러 종류

    컴파일 에러(compile error) : 코드 작성 중 발생하는 문법적 에러. 바로 알 수 있음.
    런타임 에러(runtime error) : 코드 문법상에 이상은 없지만 의도하지 않은 동작에 의한 에러.
                               ex) division by 0, (null).getData()
    런타임 에러는 서비스 운영에 치명적
    로그를 남겨 추후 원인 분석


    최상위 : Throwable 클래스
     - 하위 : Error 클래스
     - 하위 : Exception 클래스

    Error 클래스의 하위 클래스들은 시스템 에러이기 때문에 핸들링 할 수 없음. 가상머신에서 발생.
    ex) stack overflow, memory leak 등

    Exception 클래스 하위의 클래스들을 핸들링함.

    */


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        try {
            for (int i = 0; i <= 5; i++) { // ArrayIndexOutOfBoundsException 발생. runtime exception
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e); // e.toString() 호출
            return;
        } finally { // 무조건 호출됨. 위의 catch에서 e 출력하고 return 되기 전에 finally 호출되고 return. 그래서 end는 출력되지 않음
            System.out.println("finally");
        }
        System.out.println("end");


    }

}
