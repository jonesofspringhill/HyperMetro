// You can experiment here, it won’t be checked
class NonGenericClass {

  private Object val;

  public NonGenericClass(Object val) {
    this.val = val;
  }

  public Object get() {
    return val;
  }
}

public class Task {
  public static void main(String[] args) {
    // put your code here
    NonGenericClass instance = new NonGenericClass("Hello");

    //String str = (String) instance.get();
    //String str = instance.get();
    Integer num = (Integer) instance.get();
    //Object obj = instance.get();
  }
}
