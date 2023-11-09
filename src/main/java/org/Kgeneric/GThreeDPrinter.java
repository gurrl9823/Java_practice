package org.Kgeneric;

public class GThreeDPrinter<T extends Material> {

    // <> 는 다이아몬드 연산자라고 한다.
    // <T>는 제네릭(Generics) 클래스를 선언할 때 사용되는 매개변수화된 타입이다.
    // 여기서 T는 임의의 타입을 가리키는 제네릭 타입 매개변수이다.
    // T는 이름 그 자체로 중요하지 않으며, 다른 문자나 단어로 대체할 수 있다.

    // 재료로 Powder, Plastic, Water가 있는데 Water는 못쓰게 하고 싶다면
    // Powder, Plastic 에 각각 extends Material 을 쓰고
    // <T extends Material> 을 쓰면 Material 을 상속받은 클래스만 가능하다는 뜻이다.

//    private static T material; // 클래스 변수에는 static을 쓸 수 없다.
    // 하지만 메소드에는 가능하다.
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return this.material.toString();
    }

}
