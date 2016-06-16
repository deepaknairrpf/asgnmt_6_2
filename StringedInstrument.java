
public class StringedInstrument extends Instrument{
 private int numberOfStrings;
 StringedInstrument()
 {
	 
 }
 StringedInstrument(String name)
 {
	 super.name=name;
 }
 void play()
 {
	 System.out.println("Stringed instrument playing!!!!");
 }

void setNumberOfStrings(int numberOfStrings)
{
	this.numberOfStrings=numberOfStrings;
}
int getNumberOfStrings()
{
	return numberOfStrings;
}
}