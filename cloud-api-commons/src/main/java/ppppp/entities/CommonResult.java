package ppppp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pppppp
 * @date 2021/6/30 14:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{
    private Integer code;
    private String  msg;
    private T       data;

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
