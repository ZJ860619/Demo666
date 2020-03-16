package com.example.service.impl;

import com.example.entity.Apply;
import com.example.mapper.ApplyMapper;
import com.example.service.IApplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanghao
 * @since 2020-03-04
 */
@Service
public class ApplyServiceImpl extends ServiceImpl<ApplyMapper, Apply> implements IApplyService {

    @Resource
    private ApplyMapper applyMapper;


    @Override
    public List<Apply> findApplyByDuoBiaoServices(Integer id) {
        return applyMapper.selectDuoBiaoChaXun(id);
    }

    @Override
    public Integer delDa(Integer wid) {
        return applyMapper.da(wid);
    }
}
