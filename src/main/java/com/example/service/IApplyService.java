package com.example.service;

import com.example.entity.Apply;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wanghao
 * @since 2020-03-04
 */
public interface IApplyService extends IService<Apply> {
    public List<Apply> findApplyByDuoBiaoServices(Integer id);

    Integer delDa(Integer wid);

}
