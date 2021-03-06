package com.hhb.dao;

import com.hhb.entity.Contact;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContactDao {

    /**
     * 删除联系人
     */
    void delete(Integer contact);

    /**
     * 通过用户获取联系人数量
     * @param userId 当前登陆用户Id
     * @return 联系人数
     */
    Integer getContactByUser(Integer userId);

    List<Contact> getAllContactPerPage(@Param("userId") Integer userId,@Param("offset") int page,@Param("limit") int maxResult);

    /**
     * 获取某用户的所有联系人
     * @param id 用户id
     * @return 联系人列表
     */
    List<Contact> getAllContactByUser(int id);

    /**
     * 下单所需要进行的保存操作
     * @param con 用于事务管理的连接对象
     * @param c 联系人对象
     * @return 插入的联系人的id值
     */
    Integer saveContact(Contact c);

    /**
     * 保存新的联系人
     * @param contact 联系人对象
     * @param userId  联系人对应的用户对象
     */
    void saveContactWithUserId(@Param("contact") Contact contact, @Param("userId") Integer userId);

    /**
     * 更新联系人
     * @param con 用于事务管理的连接对象
     * @param c 联系人对象
     * @return 更新的联系人的id值
     */
    Integer updateContact(Contact c);

    /**
     * 通过id获取联系人
     * @param id 联系人id值
     * @return 联系人对象
     */
    Contact getContactById(int id);

}
