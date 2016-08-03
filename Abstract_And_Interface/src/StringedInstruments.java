
public class StringedInstruments extends Instrument{
	public int numberOfStrings;

	public StringedInstruments() {
		this.numberOfStrings = 10;
	}

	@Override
	void play() {
		System.out.println(play);
	}

}
