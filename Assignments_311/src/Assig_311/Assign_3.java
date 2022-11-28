package Assig_311;
class Vehicle{
	public void Start() {
		System.out.println("Starting...");
	}
	public void Stop() {
		System.out.println("Stopinggg!!!");
	}
}
class TwoWheeler extends Vehicle{
	public TwoWheeler() {
		System.out.println("\n___Two Wheeler___\n ");
	}
	@Override
	public void Start() {
		super.Start();
	}
	@Override
	public void Stop() {
		super.Stop();
	}
}
class FourWheeler extends Vehicle{
	public FourWheeler() {
		System.out.println("\n___FOur WHeeler___\n");
	}
	@Override
	public void Start() {
		
		super.Start();
	}
	@Override
	public void Stop() {
		super.Stop();
	}
}
public class Assign_3 {
	public static void main(String[] args) {
		TwoWheeler Tw=new TwoWheeler();
		Tw.Start();
		Tw.Stop();
		FourWheeler Fw=new FourWheeler();
		Fw.Start();
		Fw.Stop();
	}

}
