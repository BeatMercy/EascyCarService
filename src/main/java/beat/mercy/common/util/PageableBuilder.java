package beat.mercy.common.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

/**
 * 用于存放、生成分页请求的工具类
 * 
 * @author Mercy Wu(a3049) 2018年2月14日
 */
public class PageableBuilder {

	private Integer pageNum = 1; // 页码
	private Integer pageSize = 15; // 页面大小
	private String sort = "id"; // 默认id排序
	private String dir = "DESC"; // 默认降序

	public Integer getPageNum() {
		return pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public String getSort() {
		return sort;
	}

	public String getDir() {
		return dir;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public PageableBuilder buildPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		return this;
	}

	public PageableBuilder buildPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	public PageableBuilder buildSort(String sort) {
		this.sort = sort;
		return this;
	}

	public PageableBuilder buildSort(String sortm, String dir) {
		this.sort = sort;
		this.dir = dir;
		return this;
	}

	public PageableBuilder buildDir(String dir) {
		this.dir = dir;
		return this;
	}

	/**
	 * 根据类中字段返回处理后的 jpa分页查询需要的Pageable分页参数 author: Mercy Wu(a3049) 2018年2月14日
	 * 上午1:55:27
	 * 
	 * @return
	 */
	public Pageable getPageable() {

		// 排序项
		Sort sort = new Sort(Direction.ASC, this.sort);

		if (this.dir.equals("DESC")) {
			sort = new Sort(Direction.DESC, this.sort);
		}

		return new PageRequest(this.pageNum - 1, this.pageSize, sort);
	}

}
