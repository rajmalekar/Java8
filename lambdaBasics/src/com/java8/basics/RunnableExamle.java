/**
 * 
 */
package com.java8.basics;

/**
 * @author User
 *
 */
public class RunnableExamle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("inside runnable");
			}
		});
		t.start();
		// same functionality using java8 which demonstrates back word compatibility in
		// java8
		Runnable r = () -> System.out.println("inside lamda runnable");
		Thread t1 = new Thread(r);
		t1.start();
	}

}
