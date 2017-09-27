package com.mote.modules;

import com.mote.dao.UserMapper;
import com.mote.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserMapper userMapper;



    public int deleteByPrimaryKey(Integer id){
        return  userMapper.deleteByPrimaryKey(id);
    }

    public int insert(User record){
        return userMapper.insert(record);
    }

    public User selectByPrimaryKey(Integer id){
        return  userMapper.selectByPrimaryKey(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public List<User> selectAll(){
        //测试事务
     //   deleteByPrimaryKey(1);
       // throw new Exception();
     //   int i = 1/0;
        return  userMapper.selectAll();
    }

    public int updateByPrimaryKey(User record){
        return  userMapper.updateByPrimaryKey(record);
    }
}