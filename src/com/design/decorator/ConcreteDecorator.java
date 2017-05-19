package com.design.decorator;

public class ConcreteDecorator implements Decorator,Component{
	
	Decorator wrapped;
	
	public ConcreteDecorator(Decorator co){
		this.wrapped=co;
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return wrapped.price()+1;
	}



	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		
	}

}
