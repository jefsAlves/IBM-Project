package com.ibm.application.projectibm.response;

import java.util.List;

public class Page<T extends Object> {

	private Integer page;
	private Integer perPage;
	private Integer total;
	private Integer totalPages;

	private List<T> data;

	public Page() {
	}

	public Page(Integer page, Integer perPage, Integer total, Integer totalPages, List<T> data) {
		super();
		this.page = page;
		this.perPage = perPage;
		this.total = total;
		this.totalPages = totalPages;
		this.data = data;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPerPage() {
		return perPage;
	}

	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((page == null) ? 0 : page.hashCode());
		result = prime * result + ((perPage == null) ? 0 : perPage.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
		result = prime * result + ((totalPages == null) ? 0 : totalPages.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Page other = (Page) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (page == null) {
			if (other.page != null)
				return false;
		} else if (!page.equals(other.page))
			return false;
		if (perPage == null) {
			if (other.perPage != null)
				return false;
		} else if (!perPage.equals(other.perPage))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		if (totalPages == null) {
			if (other.totalPages != null)
				return false;
		} else if (!totalPages.equals(other.totalPages))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Page [page=" + page + ", perPage=" + perPage + ", total=" + total + ", totalPages=" + totalPages
				+ ", data=" + data + "]";
	}

}
