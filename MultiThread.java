package javaThread;

public class MultiThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThread MT= new MultiThread();
		MT.setName("MTT");
		MultiThread MT1= new MultiThread();
		MT1.setName("MTT!");
		MultiThread MT2= new MultiThread();
		MT2.setName("MMT2");
		System.out.println("This is my multithreading programm");
		MT.start();
		MT1.start();
		MT2.start();
	}
		public void run() {
			for(int i=0;i<3;i++) {
				System.out.println("This method will get called many times:"+Thread.currentThread().getName()+"and counter is ;"+i);
			}
		

	}

}
