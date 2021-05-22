package com.github.lab.dal;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhaojiejun
 * @date 2021/5/20 11:39 下午
 **/
@Setter
@Getter
@ToString
public class AbstractDO<T extends Model<T>> extends Model<T> implements Serializable {

    private static final long serialVersionUID = 8141763985058987273L;
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
    /**
     * 是否删除
     */
    private Integer isDeleted;
    /**
     * 创建人
     */
    private Long creator;
    /**
     * 修改人
     */
    private Long modifier;
    /**
     * 创建人姓名
     */
    private String creatorName;
    /**
     * 修改人姓名
     */
    private String modifierName;
    /**
     * 版本号
     */
    private Integer version;

}
