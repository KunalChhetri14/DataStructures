package MultiThreading;

import java.util.Scanner;

class Thread1 extends Thread {

  private volatile boolean running = true;
  public void run() {
    while(running) {
      System.out.println("Running Hello");
    }
  }

  public void shutDown() {
    running = false;
  }

}


public class ThreadSync {

  public static void main(String args[]) {

    Thread1 t1 = new Thread1();
    t1.start();
    System.out.println("Enter Return to exit");
    Scanner sc = new Scanner(System.in);
    sc.nextLine();
    t1.shutDown();

  }

}
