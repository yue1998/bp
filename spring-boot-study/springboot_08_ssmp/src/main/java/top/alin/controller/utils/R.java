package top.alin.controller.utils;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author CandyWall
 * @Date 2022/1/20--13:50
 * @Description 发给前端的统一数据格式
 */
@Data
@NoArgsConstructor
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg) {
        this(false, msg);
    }
}
