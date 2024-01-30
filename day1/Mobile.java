package week1.day1;


public class Mobile {

	public void makeCall(String mobileModel, float mobileWeight  ) {
		System.out.println("Mobile Model: "+mobileModel);
		System.out.println("Mobile Weight: "+mobileWeight);
		}
	public void sendMsg(boolean isFullCharged, int mobileCost) {
		System.out.println("Full Charge: "+isFullCharged);
		System.out.println("Mobile Weight: "+mobileCost);
		}
	public static void main(String[] args) {
		Mobile M = new Mobile();
		System.out.println("This is my mobile");
		M.makeCall("Nokia C", 150);
		M.sendMsg(true, 15000);
		}

	}


