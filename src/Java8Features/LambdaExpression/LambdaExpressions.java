package Java8Features.LambdaExpression;



//Lambad expressions
//it is a anonymous functions
//Not having return type, name, without modifiers

//Functional interface
//An interface which contains only one abstract methods
//Runnable ==> run()
//Comparable ==> compareTo()
//Comparator ==> compare()
//Callable ==> call()

@FunctionalInterface
interface fnInterface {
  public void m1();
}

@FunctionalInterface
interface fnInterface2 {
  public void sum(int a, int b);

}

//This isn't valid fn interface
//If we try to write lambda fn for these it will given error saying multiple abstract cannot be defined for interface fnInt3
interface fnInterface3 {
  public void mul(int a, int b);
  public void sq(int a);
}

interface fnInterface4 {
  public int squareRoot(int a);
}

public class LambdaExpressions {



  public static void main(String args[]) {
    fnInterface fn = () -> System.out.println("Hellow World");
    fn.m1();
    fnInterface2 fn2 = (a,b) -> System.out.println(a+b);
    fn2.sum(2,20);
    fnInterface4 fn4 = a -> (int) Math.sqrt(a);
    int sqRoot = fn4.squareRoot(16);
    System.out.println("The sq root is :: "+ sqRoot);
//    fnInterface3 fn3 = (a,b) -> System.out.println("Inside fn3:: "+ a+b); Gives error

    //functional interface should only have on abstract methods as the compiler will get confused when multiple methods are there

  }
}
