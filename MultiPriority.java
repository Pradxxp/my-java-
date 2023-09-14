package priority;

public class MultiPriority extends Thread {
	public void run() {
		System.out.println("Running thread is "+Thread.currentThread().getName()+". Priority is "+Thread.currentThread().getPriority());
		
	}
    public static void main(String[] args) {
    	MultiPriority m1 = new MultiPriority();
    	MultiPriority m2 = new MultiPriority();
    	MultiPriority m3 = new MultiPriority();
    	m1.setPriority(MIN_PRIORITY);
    	m2.setPriority(MAX_PRIORITY);
    	m3.setPriority(NORM_PRIORITY);
    	m1.start();
    	m2.start();
    	m3.start();
    }
}
