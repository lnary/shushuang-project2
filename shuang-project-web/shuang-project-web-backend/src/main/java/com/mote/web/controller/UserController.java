package com.mote.web.controller;

import com.mote.domain.User;
import com.mote.modules.UserServices;
import com.mote.service.facade.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by src on 2016/9/22 14 : 54.
 */
@Controller
@RequestMapping(value = { "/test" })
public class UserController {

    @Autowired
    private UserServices userServices;

    @Autowired
    private UserFacade userFacade;
    @RequestMapping("index.html")
    public  String test(Model model){


        List<User> f= userServices.selectAll();
        User use = new User();
        use.setAge1(3);
        use.setName1("3");
        int i = userFacade.insert(use);
        System.out.print(i);
        List<User> users = userFacade.selectAll();
        User u = userFacade.selectByPrimaryKey(1);
        model.addAttribute("users",users);
        model.addAttribute("t","66666666");
        return "/test/test";
    }
}
