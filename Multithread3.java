package javaThread;

public class Multithread3 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithread3 aat= new Multithread3();
		aat.setName("1");
		Multithread3 sst= new Multithread3();
		sst.setName("rahiya");
		Multithread3 rt= new Multithread3();
		rt.setName("1ss");
		aat.start();
		sst.start();
		rt.start();
		System.out.println("This will be third programm");
		for(int i=0;i<3;i++) {
			System.out.println("this message will print many times:"+Thread.currentThread().getName() +"counter is i");

	}
	
		
	
	

}
}