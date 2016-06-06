/*
 * Copyright (c) 2016. 上海趣医网络科技有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package com.tg8.entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;


/**
 * @author liang
 *
 */
@Inheritance(strategy=InheritanceType.JOINED)
@EntityListeners({AuditingEntityListener.class})
@Data
@MappedSuperclass
public abstract class IdEntity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

}