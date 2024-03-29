package com.adam.frame.jdbc.Mapper;

import com.adam.frame.jdbc.bean.User;
import com.adam.frame.jdbc.utils.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * Created by Think on 2017/12/14.
 */

public interface UserMapper extends MyMapper<User> {
    @Select("select * from user where name = #{name}")
    User findUserByName(@Param("name") String name);

    public List<User> findUserInfo();
}
