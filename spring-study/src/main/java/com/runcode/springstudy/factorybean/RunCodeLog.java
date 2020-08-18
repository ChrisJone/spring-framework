package com.runcode.springstudy.factorybean;

public class RunCodeLog {
	//0-debug 1-info 2-error
	private int level;
	//日志时间
	private String time;
	//日志详情
	private String logDetail;
	//机器IP
	private String mechine;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLogDetail() {
		return logDetail;
	}

	public void setLogDetail(String logDetail) {
		this.logDetail = logDetail;
	}

	public String getMechine() {
		return mechine;
	}

	public void setMechine(String mechine) {
		this.mechine = mechine;
	}
}
