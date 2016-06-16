
public class asgnmt_6_2 {
	public static void main(String[] args)
	{
		ElectricGuitar givson = new ElectricGuitar("Givson");
		givson.setNumberOfStrings(32);
		System.out.println(givson.name+"\n"+"No. of Strings = "+givson.getNumberOfStrings());
		givson.play();
		System.out.println("\n");
		ElectricBassGuitar casio = new ElectricBassGuitar("Casio");
		casio.setNumberOfStrings(54);
		System.out.println(casio.name+"\n"+"No. of Strings = "+casio.getNumberOfStrings());
		casio.play();
		
	}

}
