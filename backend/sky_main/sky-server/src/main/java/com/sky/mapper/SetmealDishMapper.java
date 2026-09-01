package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper  // 这个注解不能丢！
public interface SetmealDishMapper {
    /**
     * 根据菜品id来查询对应的套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}