package org.eu.miyaweb.itbaimaprojectserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.eu.miyaweb.itbaimaprojectserver.entity.Account;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM db_account WHERE username = #{str} OR email = #{str}")
    Account findAccountByUsernameOrEmail(String str);
}
