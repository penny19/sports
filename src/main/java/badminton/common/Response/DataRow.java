/*
 * Copyright (c) 2015. 上海趣医网络科技有限公司 版权所有
 * Shanghai QuYi Network Technology Co., Ltd. All Rights Reserved.
 *
 * This is NOT a freeware,use is subject to license terms.
 */

package badminton.common.Response;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: DataRow.java
 * @Description:
 *
 * @param <T>
 *
 * @version V1.0
 * @Date 15/05/20
 * @author bchy
 */
@Data
@SuppressWarnings("all")
public class DataRow<T> {

    /**
     * total
     */
    private String total;

    /**
     * dateConditions
     */
    private List<String> dateConditions;

    /**
     * rows
     */
    private List<T> rows;
}
