package com.xxbb.smybatis.session;

import java.sql.Connection;
import java.util.List;

/**
 * 进行数据库操作的主要接口
 *
 * @author xxbb
 */
public interface SqlSession {
    /**
     * 查询单条记录
     *
     * @param statement 封装好sql语句的唯一id
     * @param parameter 参数
     * @param <T>       实体类类型
     * @return 类对象
     */
    <T> T selectOne(String statement, Object parameter);

    /**
     * 查询多条记录
     *
     * @param statement 封装好sql语句的唯一id
     * @param parameter 参数
     * @param <E>       实体类类型
     * @return 集合
     */
    <E> List<E> selectList(String statement, Object parameter);

    /**
     * 更新
     *
     * @param statement 封装好sql语句的唯一id
     * @param parameter 参数
     * @return 受影响的行数
     */
    int update(String statement, Object parameter);

    /**
     * 插入
     *
     * @param statement 封装好sql语句的唯一id
     * @param parameter 参数
     * @return 受影响的行数
     */
    int insert(String statement, Object parameter);

    /**
     * 删除
     *
     * @param statement 封装好sql语句的唯一id
     * @param parameter 参数
     * @return 受影响的行数
     */
    int delete(String statement, Object parameter);

    /**
     * 获取mapper
     *
     * @param type 实体类字节码对象
     * @param <T>  mapper的接口类
     * @return 绑定到此Session的mapper
     */
    <T> T getMapper(Class<T> type);

    /**
     * 获取配置类
     *
     * @return 配置类
     */
    Configuration getConfiguration();

    /**
     * 获取连接
     *
     * @return 连接对象
     */
    Connection getConnection();
}
