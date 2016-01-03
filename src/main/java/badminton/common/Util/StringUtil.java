/*
 * Copyright (c) 2015. 上海趣医网络科技有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package badminton.common.Util;


import org.apache.commons.lang3.StringUtils;

/**
 * @author icy_eidos
 * @version 1.0, 2015-05-12
 * @since 1.0
 */
@SuppressWarnings("all")
public final class StringUtil {

    private StringUtil() {
        // left blank intentionally
    }

    /**
     * <p>
     * Checks if a String is empty ("") or null.
     * </p>
     *
     * @param str
     *            the String to check, may be null
     * @return <code>true</code> if the String is empty or null
     */
    public static boolean isEmpty(final String str) {
        return StringUtils.isEmpty(str);
    }

    /**
     * <p>
     * Checks if a String is not empty ("") and not null.
     * </p>
     *
     * @param obj
     *            the String to check, may be null
     * @return <code>true</code> if the String is not empty and not null
     */
    public static boolean isNotEmpty(final String obj) {
        return StringUtils.isNotEmpty(obj);
    }

    /**
     * 判断字符串是否为blank，包含长度不为0的空字符串
     *
     * @param str
     * @return true:字符串为blank,false:字符串非blank
     */
    public static boolean isBlank(final String str) {
        return StringUtils.isBlank(str);
    }

    /**
     * <p>
     * Returns either the passed in String, or if the String is empty or
     * <code>null</code>, the value of <code>defaultStr</code>.
     * </p>
     *
     * @param str
     *            the String to check, may be null
     * @param defaultStr
     *            the default String to return if the input is empty
     * @return the passed in String, or the default
     */
    public static String defaultIfEmpty(final String str, final String defaultStr) {
        return StringUtils.defaultIfEmpty(str, defaultStr);
    }

    /**
     * 判断字符串是否为blank，包含长度不为0的空字符串
     *
     * @param str
     * @param defaultStr
     * @return defaultStr:字符串为空,str:字符串非空
     */
    public static String defaultIfBlank(final String str, final String defaultStr) {
        return StringUtils.defaultIfBlank(str, defaultStr);
    }

    /**
     * <p>
     * Checks if the String contains only unicode digits. An empty String
     * (length()=0) will return <code>true</code>.
     * </p>
     *
     * @param str
     *            the String to check, may be null
     * @return <code>true</code> if only contains digits, and is non-null
     */
    public static boolean isNumeric(final String str) {
        return StringUtils.isNumeric(str);
    }
}
