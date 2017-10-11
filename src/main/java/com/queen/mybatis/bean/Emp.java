package com.queen.mybatis.bean;

/**
 * @since 2017-08-12
 * @author queen 定义一个Java类Emp
 *
 */
public class Emp {
	// ID，唯一性
	private Integer id;
	// 用户名
	private String empName;
	// 用户名
	private String empEmail;
	// 部门ID
	private Integer deptId;

	public Emp() {

	}

	public Emp(Integer id, String empName, String empEmail, Integer deptId) {
		this.id = id;
		this.empName = empName;
		this.empEmail = empEmail;
		this.deptId = deptId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", empName=" + empName + ", empEmail="
				+ empEmail + ", deptId=" + deptId + "]";
	}

}
