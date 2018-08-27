package cn.itcast.shoa.domain;

import java.io.Serializable;

public class Person implements Serializable{
	private Long pid;  //标示符属性  在hibernate中根据标示符属性识别缓存中的对象
	private String name;
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
