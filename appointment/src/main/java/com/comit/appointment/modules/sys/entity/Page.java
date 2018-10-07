package com.comit.appointment.modules.sys.entity;


import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * 处理分页
 * @author admin
 *
 */
public class Page implements Serializable {


    //当前页
    private Integer page=1;
    //页大小
    private Integer rows=5;
    // 总记录 数
    private Integer totalRecord;
    //总页数
    private Integer totalPage;
    //关键字类型
    private String keyType;
    //查询关键字
    private String keyWord;
    //开始记录位置
    private Integer start=0;
    //用户id
    private String userid;
    //开始时间
    private String startTime;
    //结束时间
    private String endTime;
    //留言状态
    private Integer status;
  //其他的参数封装成一个Map对象  
    private Map<String, Object> params = new HashMap<String, Object>();
    
    
    
    
    
    public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public Integer getTotalPage() {
        totalPage=(totalRecord-1)/rows+1;
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {

        this.totalPage = totalPage;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public Integer getStart() {
        start=(page-1)*rows;
        return start;
    }

    public void setStart(Integer start) {

        this.start = start;
    }

    /**
     * 分页
     * @param rows
     * @param start
     */
    public Page(Integer rows, Integer start) {
        this.rows = rows;
        this.start = start;
    }

    /**
     * 模糊查询
     * @param page
     * @param rows
     * @param keyWord
     * @param start
     */
    public Page(Integer page, Integer rows,  Integer start,String keyWord) {
        this.page = page;
        this.rows = rows;
        this.start = start;
        this.keyWord = keyWord;
    }

    public Page(String userid,Integer page, Integer rows, Integer start) {
        this.userid = userid;
        this.page = page;
        this.rows = rows;
        this.start = start;

    }

    public Page(Integer page, Integer rows, Integer totalRecord, Integer totalPage, String keyWord, Integer start) {
        this.page = page;
        this.rows = rows;
        this.totalRecord = totalRecord;
        this.totalPage = totalPage;
        this.keyWord = keyWord;
        this.start = start;
    }

    
    
   

	@Override
	public String toString() {
		return "Page [page=" + page + ", rows=" + rows + ", totalRecord="
				+ totalRecord + ", totalPage=" + totalPage + ", keyType="
				+ keyType + ", keyWord=" + keyWord + ", start=" + start
				+ ", userid=" + userid + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", status=" + status + "]";
	}

	public Page(Integer page, Integer rows, Integer totalRecord,
			Integer totalPage, String keyType, String keyWord, Integer start,
			String userid) {
		super();
		this.page = page;
		this.rows = rows;
		this.totalRecord = totalRecord;
		this.totalPage = totalPage;
		this.keyType = keyType;
		this.keyWord = keyWord;
		this.start = start;
		this.userid = userid;
	}

	public Page() {
    }

}

