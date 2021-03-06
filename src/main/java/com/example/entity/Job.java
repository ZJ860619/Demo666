package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wanghao
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("rec_job")
public class Job implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "jid", type = IdType.AUTO)
    private Long jid;

    private String jname;

    @TableField("educationReq")
    private String educationReq;

    @TableField("titleReq")
    private String titleReq;

    private String duty;

    private String taskdescription;

    private Integer pid;

    @TableField("yearsReq")
    private Integer yearsReq;

    private Integer state;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getJid() {
        return jid;
    }

    public void setJid(Long jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getEducationReq() {
        return educationReq;
    }

    public void setEducationReq(String educationReq) {
        this.educationReq = educationReq;
    }

    public String getTitleReq() {
        return titleReq;
    }

    public void setTitleReq(String titleReq) {
        this.titleReq = titleReq;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getTaskdescription() {
        return taskdescription;
    }

    public void setTaskdescription(String taskdescription) {
        this.taskdescription = taskdescription;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getYearsReq() {
        return yearsReq;
    }

    public void setYearsReq(Integer yearsReq) {
        this.yearsReq = yearsReq;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
