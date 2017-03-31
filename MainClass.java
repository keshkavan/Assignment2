// Using ConcurrentHashMap in threads
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
class Thread1 implements Runnable {
	Map<String, Integer> map;

	public Thread1(Map<String, Integer> map) {// thread1
		this.map = map;
		new Thread(this, "Thread1").start();
	}

	public void run() {
		map.put("One", 1);
		try {
			System.out.println("Thread1 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
 
class Thread2 implements Runnable {// Thread2
	Map<String, Integer> map;

	public Thread2(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "Thread2").start();
	}

	public void run() {
		map.put("Two", 2);
		try {
			System.out.println("Thread2 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

class Thread3 implements Runnable {// Thread3
	Map<String, Integer> map;

	public Thread3(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "Thread3").start();
	}

	public void run() {
		map.put("Three", 3);
		try {
			System.out.println("Thread3 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
class Thread4 implements Runnable { //Thread4
	Map<String, Integer> map;

	public Thread4(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "Thread4").start();
	}

	public void run() {
		map.put("Four", 4);
		try {
			System.out.println("Thread4 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
// ConcurrentHashMap in threads
public class MainClass {

	public static void main(String[] args) {
		Map<String, Integer> conMap = new ConcurrentHashMap<>();
		Thread1 Thread1 = new Thread1(conMap);
		Thread2 Thread2 = new Thread2(conMap);
		Thread3 Thread3 = new Thread3(conMap);
		Thread4 Thread4 = new Thread4(conMap);

		for (Map.Entry<String, Integer> e : conMap.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

	}

}
