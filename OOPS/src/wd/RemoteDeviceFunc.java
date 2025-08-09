package wd;

public class RemoteDeviceFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl r1 = new DeviceOne();
		r1.onAc();
		r1.offAc();
		
		RemoteControl r2  = new DeviceTwo();
		r2.onAc();
		r2.offAc();

	}

}
