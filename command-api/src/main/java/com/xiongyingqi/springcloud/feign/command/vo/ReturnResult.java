package com.xiongyingqi.springcloud.feign.command.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author xiongyingqi
 * @since 2017/12/10
 */
@Data
@ToString
@EqualsAndHashCode
public class ReturnResult {
  private String code;
  private String message;
  private String describe;
}
