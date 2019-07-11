package com.dubbo.entity;/**
 * @program: prugeniusagent
 * @description
 * @author: Jerry Yi
 * @create: 2019-07-09 22:49
 **/

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Jerry Yi
 * @date: 2019/7/9 22:49
 * @description:
 */
@Data
public class User implements Serializable {
    //序列化自动生成
    private static final long serialVersionUID = 1749666453251148943L;

    private Integer id;
    private String username;
    private String password;
    private Integer age;
}
