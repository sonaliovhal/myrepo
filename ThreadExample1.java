package javaThread;

public class ThreadExample1 extends Thread {
	public void run() {
		int a = 10;
		int b= 12;
		int result = a+b;
		System.out.println("thread started runnig");
		System.out.println("Sum of two number:"+result);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample1 t1= new ThreadExample1();
		t1.start();

	}

}
