package pl.sda;

public interface TestInterface {
    void myTestMethod(int test) {
        System.out.println("Hi Mom");
        System.out.println(test);
    }
    default void otherMethod(String name) {
        System.out.println("Hi " + name);
    }
}
