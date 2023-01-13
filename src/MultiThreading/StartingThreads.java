package MultiThreading;

class Runner extends Thread {

  public void run() {
    for(int i=0;i< 10; i++) {
      System.out.println("Hellow"+ i);
      try {
        Thread.sleep(100);
      } catch(InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }

}

class RunnableImp implements Runnable {


  @Override
  public void run() {
    for(int i=0;i<10;i++) {
      System.out.println("Inside runnable interface "+ i);
    }
  }
}

public class StartingThreads {

  public static void main(String args[]) {
//    Runner runner = new Runner();
//    runner.start();
//    Runner runner1 = new Runner();
//    runner1.start();
//    Thread t1 = new Thread(new RunnableImp());
//    t1.start();
    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for(int i=0; i< 10; i++) {
          System.out.println("Using anonymous"+i);
          try {
            Thread.sleep(100);
          } catch(InterruptedException ex) {
            ex.printStackTrace();
          }
        }
      }
    });
    t2.start();
  }

}
