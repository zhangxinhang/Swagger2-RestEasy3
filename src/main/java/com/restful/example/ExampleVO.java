package com.restful.example;

public class ExampleVO {
	private String example_id;
	private String example_name;

	public ExampleVO() {
	}

	public ExampleVO(String example_id, String example_name) {
		super();
		this.example_id = example_id;
		this.example_name = example_name;
	}

	public String getExample_id() {
		return example_id;
	}

	public void setExample_id(String example_id) {
		this.example_id = example_id;
	}

	public String getExample_name() {
		return example_name;
	}

	public void setExample_name(String example_name) {
		this.example_name = example_name;
	}
}
