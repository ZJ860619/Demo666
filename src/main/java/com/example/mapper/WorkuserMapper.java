package com.example.mapper;

import com.example.entity.Workuser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wanghao
 * @since 2020-03-04
 */
@Mapper
public interface WorkuserMapper extends BaseMapper<Workuser> {

    Workuser findList();

    Workuser findWorkuser();


    Integer updateWorkuser(Workuser workuser);




}
