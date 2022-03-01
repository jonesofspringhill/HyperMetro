// You can experiment here, it won’t be checked
class Delegate {
  private String name = "";

  public Delegate(String name) {
    this.setName(name);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name == "Norman") {
      throw new IllegalArgumentException("Norman is an illegal name");
    }
    this.name = name;
  }
}

public class Task {
  public static void main(String[] args) {
    // put your code here
    Delegate d = new Delegate("Norman");
    System.out.println("Delegate's name is " + d.getName());

  }
}
