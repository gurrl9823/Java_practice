package org.Ostream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

    /*

    stream

    자료의 대상과 관계없이 동일한 연산을 수행
     - 배열, 컬랙션을 대상으로 동일한 연산을 수행함
     - 일관성 있는 연산으로 자료의 처리를 쉽고 간단하게 함

    한 번 생성하고 사용한 스트림은 재사용할 수 없음
     - 자료에 대한 스트림을 생성하여 연산을 수행하면 스트림은 소모됨
     - 다른 연산을 위해서는 새로운 스트림을 생성해야함

    스트림 연산은 기존 자료를 변경하지 않음
     - 자료에 대한 스트림을 생성하면
       별도의 메모리 공간을 사용하므로 기존 자료를 변경하지 않음

    스트림 연산은 중간 연산과 최종연산으로 구분 됨
     - 스트림에 중간 연산은 여러개 적용될 수 있지만
       최종 연산은 마지막에 한번만 적용됨
     - 최종 연산이 호출되어야 중간 연산의 결과가 모두 적용됨
     - 이를 '지연 연산' 이라고 함

    */


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        IntStream stream = Arrays.stream(arr);
        int sum1 = stream.sum();
        System.out.println(sum1);

//      int count = (int)stream.count(); // IllegalStateException: stream has already been operated upon or closed
                                         // 해당 스트림은 위에 stream.sum()으로 이미 사용되었기때문에 재사용할 수 없다.
        int count = (int)Arrays.stream(arr).count(); // 그래서 새로운 스트림을 다시 만들어서 사용해야한다.
        System.out.println(count);

    }

}
