package threads;

import java.util.concurrent.atomic.AtomicInteger;


public class Counter {
    private static AtomicInteger counter = new AtomicInteger(0);
    
    public int nextValue() {
        return counter.incrementAndGet();
    }
    
    public int getValue() {
        return counter.get();
    }
}
