package com.xulu.common.result;

import java.io.Serializable;
import java.util.List;

/**
 * @author xulu
 * @date 2018/8/29
 * @link https://github.com/xulu163
 */
public class PageResult<T> implements Serializable{
	private long total; // 总记录数
	private List<T> rows; // 返回每页的数据的集合
	
	public PageResult(long total, List<T> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	
}
