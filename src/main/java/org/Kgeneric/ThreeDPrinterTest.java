package org.Kgeneric;

public class ThreeDPrinterTest {

    public static void main(String[] args) {

        // Object 클래스로 generic 구현
        ThreeDPrinter printer = new ThreeDPrinter();

        // 최상위 클래스인 Object로 선언했기 때문에 Powder 객체를 넣을 수 있다.
        printer.setMaterial(new Powder());

        // Object 를 가져왔기 때문에 Powder 로 다운캐스팅한다.
        Powder powder = (Powder)printer.getMaterial();


        // 제네릭 타입 매개변수 <T> 로 구현
        // 사용할 타입을 지정한다.
        GThreeDPrinter<Powder> gprinter = new GThreeDPrinter<>();
        gprinter.setMaterial(new Powder());
        // 타입을 지정했기 때문에 다운캐스팅할 필요가 없다.
        Powder gpowder = gprinter.getMaterial();
        System.out.println(gpowder);

        GThreeDPrinter<Plastic> gplastic = new GThreeDPrinter<>();
        gplastic.setMaterial(new Plastic());
        System.out.println(gplastic);

        // Water는 Meterial을 상속받지 않았기때문에 사용할 수 없다.
//        GThreeDPrinter<Water> gwater = new GThreeDPrinter<>();
//        gwater.setMaterial(new Water());
//        System.out.println(gwater);
    }

}
