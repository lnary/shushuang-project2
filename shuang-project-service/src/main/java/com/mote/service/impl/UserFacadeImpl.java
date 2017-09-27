package com.mote.service.impl;

import com.mote.domain.User;
import com.mote.modules.UserServices;
import com.mote.service.facade.UserFacade;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by src on 2016/9/22 14 : 36.
 */
@Service
public class UserFacadeImpl  implements UserFacade {

    @Resource
    private UserServices userServices;

    public List<User> selectAll() {
        try{
            return userServices.selectAll();

        }catch (Exception e){
            return null;
        }
    }

    public User selectByPrimaryKey(Integer id) {
        return userServices.selectByPrimaryKey(id);
    }


    public  int insert(User user){
        return  userServices.insert(user);
    }

}
