package Runnable;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runner());
        thread.start();
        //Thread.sleep(3000);
        System.out.println("Main finished work");
    }
}
class Runner implements Runnable{

    @Override
    public void run() {
        for (int i =0;i<10000; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Trojn works in  for "+ i);
        }
    }
}

