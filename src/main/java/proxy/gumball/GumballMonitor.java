package proxy.gumball;

import java.rmi.*;
 
public class GumballMonitor {
	GumballMachineRemote machine;
 
	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}
 
	public void report() {
		try {
			System.out.println("Gumball Machine: " + machine.getLocation());
			System.out.println("현재 재고: " + machine.getCount() + " 개");
			System.out.println("현재 상태: " + machine.getState());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
