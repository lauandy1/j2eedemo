package com.lauandy.j2eedemo.demo1.dao;

import com.lauandy.j2eedemo.demo1.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * Created by yangzhichao on 15/9/22.
 */
@Repository
public interface RoleDao {
    int insertRole(Role role);
}
