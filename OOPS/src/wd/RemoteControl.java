package wd;

public abstract class RemoteControl {
     abstract void onAc();
     abstract void offAc();
}
class DeviceOne extends RemoteControl {
	void onAc() {
		System.out.println("The Device one is on.");
	}
	void offAc() {
		System.out.println("The Device one is off.");
	}
}
class DeviceTwo extends RemoteControl {
	void onAc() {
		System.out.println("The Device Two is on.");
	}
	void offAc() {
		System.out.println("The Device Two is off.");
	}
}
