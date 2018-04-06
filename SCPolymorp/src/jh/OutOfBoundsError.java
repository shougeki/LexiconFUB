package jh;

public class OutOfBoundsError extends UserErrors {

	private int low,hi;
	
	public OutOfBoundsError(int low, int hi) {
		this.low = low;
		this.hi = hi;
	}
	
	@Override
	public String UEMessage() {
		return ( String.format("Out of bounds error %1$d - %2$d", this.low, this.hi) );
	}

}
