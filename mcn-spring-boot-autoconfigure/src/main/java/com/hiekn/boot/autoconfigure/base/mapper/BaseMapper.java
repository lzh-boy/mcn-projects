package com.hiekn.boot.autoconfigure.base.mapper;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T,PK> {
    int insert(T pojo);
    int insertSelective(T record);
    int deleteByPrimaryKey(PK id);
    T selectByPrimaryKey(PK id);
    int updateByPrimaryKeySelective(T pojo);
    List<T> pageSelect(Map<String, Object> params);
    int pageCount(Map<String, Object> params);

}
