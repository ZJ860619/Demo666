package com.example.service.impl;

import com.example.entity.Worker;
import com.example.mapper.WorkerMapper;
import com.example.service.IWorkerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class WorkerServiceImpl extends ServiceImpl<WorkerMapper, Worker> implements IWorkerService {

    @Resource
    private WorkerMapper workerMapper;

    @Override
    public Integer insertW(Worker worker) {
        return workerMapper.insertWorker(worker);
    }

    @Override
    public List<Worker> findTitle() {
        return workerMapper.findListWorker();
    }

    @Override
    public Worker findWorker(Integer id) {
        return workerMapper.findWorkerInfoById(id);
    }

    @Override
    public Integer updateInfo(Worker worker) {
        return workerMapper.updateById(worker);
    }

    @Override
    public List<Worker> findListWorker() {
        return workerMapper.findListWorker();
    }

    @Override
    public Integer modiyByQx(Worker worker) {
        return workerMapper.updateByQx(worker);
    }

    @Override
    public Integer delDw(Integer wid) {
        return workerMapper.dw(wid);
    }

    @Override
    public List<Worker> findListWorkerTo() {
        return workerMapper.selectList(null);
    }
}
