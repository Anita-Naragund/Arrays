package com.xworkz.cockroach.event;

public class ExceptionEvent {

	public ExceptionEvent(){
		System.out.println("Exception event method");
	}
	
	public void exceptionEvent(boolean create)throws Throwable{
		System.out.println("Invoked exception event method");
		if(create) {
			System.out.println("Exception event");
			Throwable throwable=new Throwable();
			throw throwable;
		}else {
			System.out.println("no exception");
		}
	}
}
