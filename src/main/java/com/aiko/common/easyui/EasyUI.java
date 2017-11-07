package com.aiko.common.easyui;

import java.util.List;

/**
 * 传输分页数据
 * @author RenBowen
 * @date 2017年10月12日-下午1:05:30
 * @since 1.0.0
 * @aiko-crm
 */

public class EasyUI {
	private Long total; // 数据总和
	private List<?> rows; // 分页数据集合

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
