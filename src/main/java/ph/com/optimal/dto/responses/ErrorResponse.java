package ph.com.optimal.dto.responses;

public class ErrorResponse extends AppResponse {

	public ErrorResponse(String message) {
		super(false);
		addFullMessage(message);
	}
	
	public ErrorResponse() {
		this(null);
	}

}
