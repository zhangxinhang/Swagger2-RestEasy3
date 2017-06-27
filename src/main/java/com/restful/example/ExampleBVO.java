package com.restful.example;

public class ExampleBVO {
	public ExampleBVO() {
	}

	private String example_id;
	private String example_bid;
	private String example_bname;

	public String getExample_bname() {
		return example_bname;
	}

	public void setExample_bname(String example_bname) {
		this.example_bname = example_bname;
	}

	public String getExample_id() {
		return example_id;
	}

	public void setExample_id(String example_id) {
		this.example_id = example_id;
	}

	public String getExample_bid() {
		return example_bid;
	}

	public void setExample_bid(String example_bid) {
		this.example_bid = example_bid;
	}
}
