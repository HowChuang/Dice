package com.bihell.dice.service;

import com.bihell.dice.model.domain.AuthGroup;
import com.bihell.dice.model.params.QueryParam;

import java.util.List;

/**
 * @author haseochen
 */
public interface AuthGroupService {

    /**
     * @param param 查询参数
     * @return List<AuthGroup>
     */
    List<AuthGroup> getGroupList(QueryParam param);
}
