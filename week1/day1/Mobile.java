package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel="Xiaomi 7 pro";
		float mobileWeight=180.3f;
		System.out.println(mobileModel+":"+ mobileWeight);
	}
	
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=8500;
		System.out.println("Charged:"+isFullCharged);
		System.out.println("Cost:"+mobileCost);
		
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
		
	}
}
