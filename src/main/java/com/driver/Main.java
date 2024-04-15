package com.driver;

public class Main {
  public static void main(String[] args){

      // Task 3
      B obj = new B();

      // Task 5
      obj.meth();
  }
}
// Task 1
class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
// Task 2
class B extends A{
    public B(){
        // Task 3
        super.meth();
    }
    // Task 4

    @Override
    public String meth() {
        return "Method is overridden in Extendend class B";
    }
}