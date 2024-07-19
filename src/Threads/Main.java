package Threads;

/**
 * @author JiaheYu
 * @data 2024/7/19 16:19
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        for (int i = 0; i < 5; i ++ ) {
            //全部阻塞
            Worker worker = new Worker(object, true);
            worker.setName("thread-" + i);
            worker.start();
        }

        //不需要等
        Worker worker = new Worker(object, false);
        worker.setName("thread-" + 5);
        Thread.sleep(1000);
        worker.start();
    }

}