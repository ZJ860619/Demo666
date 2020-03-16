package com.example.mapper;

import com.example.entity.Apply;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
public interface ApplyMapper extends BaseMapper<Apply> {

    public List<Apply> selectDuoBiaoChaXun(Integer id);

    int da(Integer wid);

}
