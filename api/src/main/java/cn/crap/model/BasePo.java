package cn.crap.model;

import java.io.Serializable;
import java.util.Date;

public class BasePo implements Serializable{
    private static final long serialVersionUID = 1L;
    private String id;
    private Integer sequence;
    private Date createTime;
    private Date updateTime;
    private String attributes;

    /**
     * 新增PO时需要，如果返回null，则排序默认值为系统最大值
     * @return
     */
    public String getProjectId(){
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
}