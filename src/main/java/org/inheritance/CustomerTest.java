package org.inheritance;

public class CustomerTest {

    public static void main(String[] args) {

        /*
        Customer lee = new Customer();
        lee.setId(1001);
        lee.setName("Lee");

        VIPCustomer kim = new VIPCustomer(); // 상위 클래스의 메모리가 할당되고 그 다음 하위클래스의 메모리가 할당됨.
        kim.setId(1111);
        kim.setName("Kim");

        lee.showCustomerInfo();
        kim.showCustomerInfo();
         */

        Customer lee = new Customer(1001, "Lee");
        Customer kim = new VIPCustomer(1111, "Kim");
        lee.showCustomerInfo();
        kim.showCustomerInfo();
    }
}
