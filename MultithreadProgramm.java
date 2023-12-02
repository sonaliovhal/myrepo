package javaThread;

public class MultithreadProgramm extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultithreadProgramm mt1=new MultithreadProgramm();
		mt1.setName("Thread1");
		MultithreadProgramm mt2= new MultithreadProgramm();
		mt2.setName("Thread2");
		MultithreadProgramm mt3= new MultithreadProgramm();
mt3.setName("Thread");
mt1.start();
mt2.start();
mt3.start();
System.out.println("print message");{
	}
	for(int i=0;i<3;i++) {
		System.out.println("This message will print multiple times:Threadname"+Thread .currentThread() .getName()+"and counter is"+ i);
	}

}
}