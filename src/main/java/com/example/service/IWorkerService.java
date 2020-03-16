package com.example.service;

import com.example.entity.Worker;
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
public interface IWorkerService extends IService<Worker> {

    Integer insertW(Worker worker);

    List<Worker> findTitle();

    Worker findWorker(Integer id);

    Integer updateInfo(Worker worker);

    List<Worker> findListWorker();


    List<Worker> findListWorkerTo();

    Integer modiyByQx(Worker worker);


    Integer delDw(Integer wid);



}
