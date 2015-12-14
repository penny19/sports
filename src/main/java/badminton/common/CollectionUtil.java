/*
 * Copyright (c) 2015. 上海趣医网络科技有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package badminton.common;


import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;

/**
 * 集合工具类.
 *
 * @author bchy
 * @version 1.0, 2015-04-29
 * @since 1.0
 */
public final class CollectionUtil {
    /**
     * 判断集合是否为空
     *
     * @param collection
     * @return true:集合为空,false:集合非空
     */
    public static boolean isEmpty(final Collection<?> collection) {
        return CollectionUtils.isEmpty(collection);
    }

    /**
     * 判断集合是否非空
     *
     * @param collection
     * @return true:集合为空,false:集合非空
     */
    public static boolean isNotEmpty(final Collection<?> collection) {
        return CollectionUtils.isNotEmpty(collection);
    }

    private CollectionUtil() {
        // left blank intentionally
    }
}
