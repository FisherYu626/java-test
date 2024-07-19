package Threads;

/**
 * @author JiaheYu
 * @data 2024/7/19 16:17
 */
public class Worker extends Thread{

    private final Object object;
    private final boolean needWait;

    public Worker(Object object, boolean needWait) {
        this.object = object;
        this.needWait = needWait;
    }

    @Override
    public void run() {
        synchronized (object) {
            try {
                if (needWait) {
                    object.wait();
                    System.out.println(this.getName() + ": 被唤醒啦！");
                } else {
                    object.notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
