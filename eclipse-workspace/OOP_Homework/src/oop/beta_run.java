package oop;

public class beta_run extends Tcom_abstract implements Tcom_interface,Tcom_interface2{

	@Override
	public void ntwork() {
		
		System.out.println("This is my network from  interface.");
		nttype();
		wifi();
		wifi_call();
	
		
	}

	@Override
	public void Incm() {
		
		
		
		System.out.println("This is my incoming from interface.  ");
		
	}

	@Override
	public void Otgn() {
		
		System.out.println("This is my  outgoing from  interface. ");
	
		
	}

	@Override
	public void camera() {
		
		System.out.println("This is my camera  from interface 2. ");
		
		
	}

	@Override
	public void micphone() {
		
		System.out.println("This is my  micphone from interface 2. ");
		micphoneq();
		size();
	
		
	}
	
}
