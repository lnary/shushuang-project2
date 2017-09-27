package com.mote.service.facade;


import com.mote.domain.User;

import java.util.List;

/**
 * Created by src on 2016/9/22 14 : 34.
 */
public interface UserFacade {


    List<User> selectAll();

    User selectByPrimaryKey(Integer id);

    int insert(User user);

}
