// You can experiment here, it won’t be checked
class MyClass<T> {

  private T t;

  public MyClass(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }
}

public class Task {
  public static void main(String[] args) {
    // put your code here
    MyClass instance = new MyClass("Hello!");
    System.out.println("Done");
  }
}
