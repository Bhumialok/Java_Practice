package com.practice;

public class DaemonThread extends Thread{
	public void run() {
		System.out.println("this is Child thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("parent Thread");
		Thread daemonThread =new Thread();
	}

}
