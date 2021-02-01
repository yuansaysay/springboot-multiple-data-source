package com.example.demo.dao.other;

import com.example.demo.model.TUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SecendTUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}