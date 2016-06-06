/*
 * Copyright (c) 2015. 上海趣医网络科技有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package com.tg8.common.Util;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @ClassName: JsonUtil.java
 * @Description:
 *
 * @version V1.0
 * @Date 15/05/20
 * @author icy_eidos
 */
public final class JsonUtil {

    /**
     * GSON
     */
    private static final Gson GSON = new Gson();

    /**
     * 将json字符串转化成list
     * 
     * @param json
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> List<T> toList(final String json, final Class<T> tClass) {
        final List<T> result = Lists.newArrayList();

        if (StringUtils.isNotBlank(json)) {
            final JsonParser parser = new JsonParser();
            final JsonArray jsonArray = parser.parse(json).getAsJsonArray();
            jsonArray.forEach(node->{
                final T cse = GSON.fromJson(node, tClass);
                result.add(cse);
            });
        }

        return result;
    }

    /**
     * 将json字符串转化成指定java类
     * 
     * @param json
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T toObject(final String json, final Class<T> tClass) {
        return GSON.fromJson(json, tClass);
    }

    /**
     * 将java类转化成json字符串
     * 
     * @param object
     * @return
     */
    public static String toJson(final Object object) {
        return GSON.toJson(object);
    }

    private JsonUtil() {
    }
}
