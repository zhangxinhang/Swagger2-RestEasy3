package com.restful.example;

/**
 * 查询请求Bean,为前台提供明确的查询字段描述
 * 
 * @author AMS
 *
 * @param <T>
 */
public class QueryBean<T> {
	private Integer pageBegin;
	private Integer pageSize;
	private String searchValue;
	private T searchVO;

	public Integer getPageBegin() {
		return pageBegin;
	}

	public void setPageBegin(Integer pageBegin) {
		this.pageBegin = pageBegin;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getSearchValue() {
		return searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	public T getSearchVO() {
		return searchVO;
	}

	public void setSearchVO(T searchVO) {
		this.searchVO = searchVO;
	}

	public QueryBean() {
		super();
	}
}
