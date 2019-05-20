package cn.kgc.tangcco.zhangqing.entity;

import lombok.Data;

@Data
public class StudentInfo {
	private int no;
	private String name;
	
	public void showTest() {
		System.out.println("你好！Again！");
	}
	
}
