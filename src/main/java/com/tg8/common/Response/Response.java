/*
 * Copyright (c) 2015. 上海趣医网络科技有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package com.tg8.common.Response;

import lombok.Data;

/**
 * @ClassName: Response.java
 * @Description:
 *
 * @param <T>
 *
 * @version V1.0
 * @Date 16/06/06
 * @author penny
 */
@Data
@SuppressWarnings("all")
public class Response<T> {

    /**
     * status
     */
    private ResponseStatus status;

    /**
     * message
     */
    private String message;

    /**
     * data
     */
    private T data;

    public Response() {
    }

    public Response(ResponseStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public Response(ResponseStatus status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
