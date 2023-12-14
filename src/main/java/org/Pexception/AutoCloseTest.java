package org.Pexception;

public class AutoCloseTest {

    public static void main(String[] args) {

        AutoCloseObj obj = new AutoCloseObj();
        // AutoCloseable 의 close가 호출되는지 확인
        try (obj) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception");
        }

    }

}
