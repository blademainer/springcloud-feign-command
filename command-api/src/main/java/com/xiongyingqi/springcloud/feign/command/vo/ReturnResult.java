package com.xiongyingqi.springcloud.feign.command.vo;

import lombok.*;

/**
 * @author xiongyingqi
 * @since 2017/12/10
 */
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ReturnResult {
  private String code;
  private String message;
  private String describe;

  public static final ReturnResult SUCCESS = new ReturnResult("000", "SUCCESS", "SUCCESS");
}
