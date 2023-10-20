package rds.multiaz.demo;

import org.junit.Test;

import database.demo.JDBCConnectDemo;

public class DemoTest {

	@Test
	public void test1() {
		
		while (true) {

			JDBCConnectDemo.main(null);
			System.out.println("-------------------------------------");
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
