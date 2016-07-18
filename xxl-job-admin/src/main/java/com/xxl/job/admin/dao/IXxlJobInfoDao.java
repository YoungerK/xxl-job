package com.xxl.job.admin.dao;

import java.util.List;

import com.xxl.job.admin.core.model.XxlJobInfo;
import com.xxl.job.admin.core.model.XxlJobLog;


/**
 * job info
 * @author xuxueli 2016-1-12 18:03:45
 */
public interface IXxlJobInfoDao {

	public List<XxlJobInfo> pageList(int offset, int pagesize, String jobGroup, String jobDesc);
	public int pageListCount(int offset, int pagesize, String jobGroup, String jobDesc);
	
	public int save(XxlJobInfo info);
	
	public XxlJobInfo load(String jobGroup, String jobName);
	
	public int update(XxlJobInfo item);
	
	public int delete(String jobGroup, String jobName);

	public List<XxlJobLog> getJobsByGroup(String jobGroup);
}
