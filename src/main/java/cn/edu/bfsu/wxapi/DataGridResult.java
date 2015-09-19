package cn.edu.bfsu.wxapi;

import java.util.List;

public class DataGridResult<E> {
	
	private int total;

	private List<E> rows;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<E> getRows() {
		return rows;
	}

	public void setRows(List<E> rows) {
		this.rows = rows;
	}

}