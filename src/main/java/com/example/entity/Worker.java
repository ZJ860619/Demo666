package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

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
@TableName("rec_worker")
public class Worker implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "wid", type = IdType.AUTO)
    private Long wid;

    private String wname;

    private Integer sex;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate birth;

    private String wtype;

    private String title;

    private String skill;

    private Integer years;

    private String major;

    private String education;


    private Integer state;




    private Integer isPrivate;

    private Integer userid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
    }

    public void setWid(Long wid) {
        this.wid = wid;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public void setWtype(String wtype) {
        this.wtype = wtype;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getWid() {
        return wid;
    }

    public String getWname() {
        return wname;
    }

    public Integer getSex() {
        return sex;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public String getWtype() {
        return wtype;
    }

    public String getTitle() {
        return title;
    }

    public String getSkill() {
        return skill;
    }

    public Integer getYears() {
        return years;
    }

    public String getMajor() {
        return major;
    }

    public String getEducation() {
        return education;
    }


    public Integer getState() {
        return state;
    }


}
