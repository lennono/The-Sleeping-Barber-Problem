import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

public class Customer implements Runnable{

	private AtomicInteger spaces;
	private Semaphore bavailable;
	private Semaphore cavailable;
	private Random ran = new Random();


	public Customer(AtomicInteger spaces, Semaphore bavailable, Semaphore cavailable){
		this.spaces = spaces; 
		this.bavailable = bavailable;
		this.cavailable = cavailable;
	}

	@Override
	public void run(){
			
			try {
				cavailable.release();
				if(bavailable.hasQueuedThreads()){
					spaces.decrementAndGet();
					System.out.println("Customer in waiting area"); 
					bavailable.acquire();
					spaces.incrementAndGet(); 
				}
				else{
					bavailable.acquire();
				}

			} catch (InterruptedException e){}
	}
}