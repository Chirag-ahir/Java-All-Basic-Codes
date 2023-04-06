package producer_consumer_1;

import java.util.LinkedList;

//wait, notify and notifyall is object class methods
public class ProducerConsumerExample {

	private LinkedList<Integer> buffer = new LinkedList<>();
	private int bufferSize = 1;

	public void produce() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (buffer.size() == bufferSize) {
					wait();
				}
				int value = 1;
				buffer.add(value);
				System.out.println("Produced: " + value);
				notify();
				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (buffer.isEmpty()) {
					wait();
				}
				int value = buffer.removeFirst();
				System.out.println("Consumed: " + value);
				notify();
				Thread.sleep(1000);
			}
		}
	}

	public static void main(String[] args) {

		ProducerConsumerExample example = new ProducerConsumerExample();

		Thread producerThread = new Thread(new Runnable() {
			public void run() {
				try {
					example.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread consumerThread = new Thread(new Runnable() {
			public void run() {
				try {
					example.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		producerThread.start();
		consumerThread.start();
		
	}
}
