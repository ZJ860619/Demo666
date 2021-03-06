package com.example.service;

import com.example.entity.Workuser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wanghao
 * @since 2020-03-04
 */
public interface IWorkuserService extends IService<Workuser> {

    Workuser findList();

    Workuser findac();

    //更新用户信息
    Integer modify(Workuser workuser);



}
