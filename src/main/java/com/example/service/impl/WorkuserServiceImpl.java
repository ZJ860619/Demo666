package com.example.service.impl;

import com.example.entity.Workuser;
import com.example.mapper.WorkerMapper;
import com.example.mapper.WorkuserMapper;
import com.example.service.IWorkuserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanghao
 * @since 2020-03-04
 */
@Service
public class WorkuserServiceImpl extends ServiceImpl<WorkuserMapper, Workuser> implements IWorkuserService {

    @Resource
    private WorkuserMapper workuserMapper;

    @Override
    public Workuser findList() {
        return workuserMapper.selectOne(null);
    }

    @Override
    public Workuser findac() {
        return workuserMapper.findWorkuser();
    }

    @Override
    public Integer modify(Workuser workuser) {
        return workuserMapper.update(workuser,null);
    }
}
