package com.song.flowable.controller;

import java.util.ArrayList;
import java.util.List;

import org.flowable.idm.api.User;
import org.flowable.idm.engine.impl.persistence.entity.UserEntityImpl;
import org.flowable.ui.common.model.UserRepresentation;
import org.flowable.ui.common.security.SecurityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gblfy
 * @ClassNme AdminRemoteAccountResource
 * @Description 实现内置admin用户免登陆
 * @Date 2019/11/10 15:13
 * @version1.0
 */
@RestController
@RequestMapping("/admin")
public class AdminRemoteAccountResource {
    /**
     * GET /rest/account -> get the current user.
     */
    @RequestMapping(value = "/rest/account", method = RequestMethod.GET, produces = "application/json")
    public UserRepresentation getAccount() {
        User user=new UserEntityImpl();
        user.setId("admin");
        SecurityUtils.assumeUser(user);
        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setId("admin");
        userRepresentation.setFirstName("admin");
        List<String> privileges=new ArrayList<>();
        privileges.add("flowable-idm");
        privileges.add("flowable-modeler");
        privileges.add("flowable-task");
        userRepresentation.setPrivileges(privileges);
        return  userRepresentation;

    }
}
