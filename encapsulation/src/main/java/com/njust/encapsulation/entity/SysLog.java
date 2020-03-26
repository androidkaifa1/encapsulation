package com.njust.encapsulation.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_log")
public class SysLog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 所属操作模块
     */
    private String module;

    /**
     * 操作数据
     */
    private String data;

    /**
     * 备注
     */
    private String memo;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public SysLog(Integer id, Integer userId, String module, String data, String memo, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.module = module;
        this.data = data;
        this.memo = memo;
        this.createTime = createTime;
    }

    public SysLog() {
        super();
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取所属操作模块
     *
     * @return module - 所属操作模块
     */
    public String getModule() {
        return module;
    }

    /**
     * 设置所属操作模块
     *
     * @param module 所属操作模块
     */
    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    /**
     * 获取操作数据
     *
     * @return data - 操作数据
     */
    public String getData() {
        return data;
    }

    /**
     * 设置操作数据
     *
     * @param data 操作数据
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", module=").append(module);
        sb.append(", data=").append(data);
        sb.append(", memo=").append(memo);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}