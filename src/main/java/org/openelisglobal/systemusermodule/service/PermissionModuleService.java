package org.openelisglobal.systemusermodule.service;

import java.util.List;
import java.util.Set;

import org.openelisglobal.common.service.BaseObjectService;
import org.openelisglobal.systemusermodule.valueholder.PermissionModule;

public interface PermissionModuleService<T extends PermissionModule> extends BaseObjectService<T, String> {
    void getData(T permissionModule);

    List getAllPermissionModules();

    Integer getTotalPermissionModuleCount();

    List getPageOfPermissionModules(int startingRecNo);



    List getAllPermissionModulesByAgentId(int systemUserId);

    boolean doesUserHaveAnyModules(int userId);



    Set<String> getAllPermittedPagesFromAgentId(int roleId);
}
