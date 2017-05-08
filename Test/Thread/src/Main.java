public class Main{
	public static void main(String[] args){
		Thread firstThread = new MyThread("firstThread");
		Thread secondThread = new MyThread("secondThread");
		firstThread.setPriority(Thread.MAX_PRIORITY);
		firstThread.start();
		secondThread.start();
	}
}

class MyThread extends Thread{
	private String name = "Null";
	public MyThread(String newName){
		this.name = newName;
	}
	
	public void run(){
		for(int i = 0; i < 10; i++){
			try{
				Thread.currentThread().sleep(100);
			}
			catch(InterruptedException Exc){
			}
			 System.out.println(name + " continues... " + i); 
		}
		System.out.println(name + " END"); 
	}
}