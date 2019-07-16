package com.jv.sysmanager.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author hejw
 * @since 2019-05-08
 */
@Data
//@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SecOperator {

    private static final long serialVersionUID = 1L;

    /**
     * 操作员Id
     */
    @TableId(value = "OperatorId", type = IdType.AUTO)
    private Integer OperatorId;

    /**
     * 操作员姓名
     */
    @TableField("OperatorName")
    private String OperatorName;

    /**
     * 上司ID
     */
    @TableField("MasterId")
    private Integer MasterId;

    @TableField("EffectDate")
    private LocalDateTime EffectDate;

    @TableField("ExpireDate")
    private LocalDateTime ExpireDate;

    /**
     * 状态
     */
    @TableField("State")
    private Integer State;

    @TableField("OpId")
    private Integer OpId;

    @TableField("UpdateDate")
    private LocalDateTime UpdateDate;

    /**
     * 手机号码
     */
    @TableField("Phone")
    private Integer Phone;

    /**
     * 身份证号码
     */
    @TableField("IdCard")
    private String IdCard;

    /**
     * 邮箱
     */
    @TableField("Mail")
    private String Mail;

    /**
     * 密码
     */
    @TableField("Password")
    private String Password;


}
