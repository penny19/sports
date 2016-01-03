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
 * @author bchy
 * @version V1.0
 * @ClassName: ResultModel
 * @Description:
 * @Date 2015/6/28 15:08
 */
@Data
public class ResultModel {
    private List<ValueModel> value;
}
