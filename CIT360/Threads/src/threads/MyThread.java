package threads;

public class MyThread implements Runnable {
	
    private String threadName;
    private int count;
    Counter counter = new Counter();

    MyThread(String name, int newcount) {
        this.threadName = name;
        this.count = newcount;
    }

    @Override
    public void run() {
        int laps = 0;
        for (int i = 0; i <= this.count; i++) {
            laps =+ i;
        }
        System.out.println(threadName + " ran " + laps + " laps");
        try {
                counter.nextValue();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

}
