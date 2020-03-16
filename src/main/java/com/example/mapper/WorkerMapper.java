package com.example.mapper;

import com.example.entity.Worker;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wanghao
 * @since 2020-03-04
 */
@Mapper
public interface WorkerMapper extends BaseMapper<Worker> {
    Integer insertWorker(Worker worker);

    List<Worker> findTitle();

    Worker findWorkerInfoById(Integer id);

    Integer updateInfo(Worker worker);

    List<Worker> findListWorker();

    Integer updateByQx(Worker worker);

    Integer dw(Integer wid);

}
