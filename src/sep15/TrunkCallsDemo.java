package sep15;

import java.util.Scanner;

public class TrunkCallsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrunkCall tc=new OrdinaryTrunkCall();
		tc.call();
		tc=new UrgentTrunkCall();
		tc.call();
	}

}

class TrunkCall{
	public void call() {
		
	}
}

class OrdinaryTrunkCall extends TrunkCall{
	public void call() {
		System.out.println("ordinary call");
	}
}

class UrgentTrunkCall extends TrunkCall{
	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("urgent trunk call");
	}
}
class LightningTrunkCall extends TrunkCall{
	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
		System.out.println("lightening trunk call");
	}
}
