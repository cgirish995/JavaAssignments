
public class BikeTesters {

	public static void main(String[] args) {
		
		Bike obj =new Bike("TATA");
		
		obj.TurningOnAndOff();
		obj.Fast();
		
		
		
		/*obj.company="Honda";
		obj.bikeName="Pulsar";
		obj.regNo=345678;
		obj.isGeared=false;*/
		
		
		System.out.println(obj.company);
		//System.out.println(obj.bikeName);
		System.out.println(obj.regNo);
		System.out.println(obj.isGeared);
	}

}
