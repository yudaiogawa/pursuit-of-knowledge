public abstract class AbstractClass {

  public abstract void method1();

  public abstract void method2();

  public final void templateMethod() {
    method1();
    method2();
  }
}
