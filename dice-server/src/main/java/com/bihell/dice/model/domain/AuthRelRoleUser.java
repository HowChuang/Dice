package com.bihell.dice.model.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author haseochen
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class AuthRelRoleUser extends BaseEntity<AuthRelRoleUser> {

    @TableId
    private Integer id;

    private Integer userId;

    private Integer roleId;

}
