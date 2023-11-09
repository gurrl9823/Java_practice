package org.Kgeneric;

public class ThreeDPrinter {

    // ThreeDPrinter의 재료로 plastic이든 powder이던 상관없이
    // 받게 하려면 최상위 클래스인 Object 로 선언한다.
    private Object material;

    public Object getMaterial() {
        return material;
    }

    public void setMaterial(Object material) {
        this.material = material;
    }
}
