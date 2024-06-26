package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 合同模块
 *
 * @author 
 * @email
 * @date 2021-03-24
 */
@TableName("hetong")
public class HetongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HetongEntity() {

	}

	public HetongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 合同名称
     */
    @TableField(value = "htname")

    private String htname;


    /**
     * 签订客户
     */
    @TableField(value = "kehu_id")

    private Integer kehuId;


    /**
     * 合同文件
     */
    @TableField(value = "httong_file")

    private String httongFile;


    /**
     * 合同详情
     */
    @TableField(value = "neirong_content")

    private String neirongContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：合同名称
	 */
    public String getHtname() {
        return htname;
    }


    /**
	 * 获取：合同名称
	 */

    public void setHtname(String htname) {
        this.htname = htname;
    }
    /**
	 * 设置：签订客户
	 */
    public Integer getKehuId() {
        return kehuId;
    }


    /**
	 * 获取：签订客户
	 */

    public void setKehuId(Integer kehuId) {
        this.kehuId = kehuId;
    }
    /**
	 * 设置：合同文件
	 */
    public String getHttongFile() {
        return httongFile;
    }


    /**
	 * 获取：合同文件
	 */

    public void setHttongFile(String httongFile) {
        this.httongFile = httongFile;
    }
    /**
	 * 设置：合同详情
	 */
    public String getNeirongContent() {
        return neirongContent;
    }


    /**
	 * 获取：合同详情
	 */

    public void setNeirongContent(String neirongContent) {
        this.neirongContent = neirongContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Hetong{" +
            "id=" + id +
            ", htname=" + htname +
            ", kehuId=" + kehuId +
            ", httongFile=" + httongFile +
            ", neirongContent=" + neirongContent +
            ", createTime=" + createTime +
        "}";
    }
}
