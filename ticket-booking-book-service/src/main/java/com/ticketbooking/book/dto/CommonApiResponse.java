package com.ticketbooking.book.dto;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CommonApiResponse {

	private String responseMessage;

	private HttpStatus status;

	private boolean isSuccess;

	public CommonApiResponse(String responseMessage, HttpStatus status, boolean isSuccess) {
		super();
		this.responseMessage = responseMessage;
		this.status = status;
		this.isSuccess = isSuccess;
	}
	
	public CommonApiResponse() {
		super();
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public CommonApiResponse build() {
        CommonApiResponse response = new CommonApiResponse();
        response.setResponseMessage(this.responseMessage);
        response.setSuccess(this.isSuccess);
        response.setStatus(this.status);
        return response;
    }

}
