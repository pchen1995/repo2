package cn.itcast.Dao;

import cn.itcast.domain.User;

import java.io.Serializable;
import java.util.List;

public interface UserMapper {
    // 提供一个查询所有的方法

    public List<User> findAll();

}
