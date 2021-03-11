package org.ict.di;

public class JavaMain {
	
	public static void main(String[] args) {
		
		Singer sin1 = new Singer();
		
		Stage sta1 = new Stage();
		
		Broadcast broad = new Broadcast(sta1);
		
		sin1.sing();
//		sta1.perform();
		broad.broad();
		
		
		
	}

}
