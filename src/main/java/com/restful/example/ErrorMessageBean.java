package com.restful.example;

/**
 * 错误信息返回对象。为统一返回为JSON对象
 * 
 * @author AMS
 *
 */
public class ErrorMessageBean {
	private String code;
	private String message;
	private String detail;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public ErrorMessageBean(String code, String message, String detail) {
		super();
		this.code = code;
		this.message = message;
		this.detail = detail;
	}

	public ErrorMessageBean() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
