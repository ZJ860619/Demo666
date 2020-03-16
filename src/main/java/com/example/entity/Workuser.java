package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
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
@TableName("rec_workuser")
public class Workuser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userid;

    private String wuser;

    private String wpassword;

    private String wphone;

    private String wemail;

    private LocalDate wregtime;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getWuser() {
        return wuser;
    }

    public void setWuser(String wuser) {
        this.wuser = wuser;
    }

    public String getWpassword() {
        return wpassword;
    }

    public void setWpassword(String wpassword) {
        this.wpassword = wpassword;
    }

    public String getWphone() {
        return wphone;
    }

    public void setWphone(String wphone) {
        this.wphone = wphone;
    }

    public String getWemail() {
        return wemail;
    }

    public void setWemail(String wemail) {
        this.wemail = wemail;
    }

    public LocalDate getWregtime() {
        return wregtime;
    }

    public void setWregtime(LocalDate wregtime) {
        this.wregtime = wregtime;
    }



    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
