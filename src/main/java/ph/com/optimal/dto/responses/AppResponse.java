package ph.com.optimal.dto.responses;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public abstract class AppResponse {

	private Boolean success;
	private List<String> fullMessage;
	
	public AppResponse(Boolean success) {
		this.success = success;
	}
	
	protected void addFullMessage(String message) {
		if(message==null) {
			return;
		}
		if(fullMessage==null) {
			fullMessage = new ArrayList<String>();
		}
		fullMessage.add(message);
	}
	
}
