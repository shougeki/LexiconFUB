package jh;

/**
 * @author JH
 *
 */
public class NumericInputError extends UserErrors {

	@Override
	public String UEMessage() {
		return "You tried to use a numrtic input in a text only field. This fired an error";
	}

}
