package model.exceptions;

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// Allows you to instantiate the DomainException by sending a message to it.
	public DomainException(String msg) {
		super(msg);
	}
	
}
