package com.ibm.application.projectibm.dto;

import java.io.Serializable;
import java.time.Instant;

public class Page implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer page;
	private Integer perPage;
	private Integer total;
	private Integer totalPages;
	private Instant date;

	public Page() {
	}

	public Page(Long id, Integer page, Integer perPage, Integer total, Integer totalPages, Instant date) {
		this.id = id;
		this.page = page;
		this.perPage = perPage;
		this.total = total;
		this.totalPages = totalPages;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Id: "
				+ id
				+ ", Pag: "
				+ page
				+ ", Per Page: " 
				+ perPage
				+ ", Total: "
				+ total
				+ ", Total Pages: "
				+ totalPages
				+ ", Date: "
				+ date;
	}
}