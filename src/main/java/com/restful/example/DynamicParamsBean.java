package com.restful.example;

/**
 * 用于新增参数，便于前端了解对应字段
 * 
 * @author AMS
 *
 * @param <A>
 *            类名
 * @param <B>
 *            类名
 */
public class DynamicParamsBean<A, B> {
	private A avo;
	private B bvo;

	public A getAvo() {
		return avo;
	}

	public void setAvo(A avo) {
		this.avo = avo;
	}

	public B getBvo() {
		return bvo;
	}

	public void setBvo(B bvo) {
		this.bvo = bvo;
	}

}
