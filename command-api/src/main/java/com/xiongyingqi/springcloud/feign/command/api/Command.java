package com.xiongyingqi.springcloud.feign.command.api;

import com.xiongyingqi.springcloud.feign.command.vo.Request;
import com.xiongyingqi.springcloud.feign.command.vo.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiongyingqi
 * @since 2017/12/10
 */
@FeignClient
@RequestMapping({"/{command}", "/{app.command}"})
public interface Command {
  @PostMapping("/execute")
  ReturnResult execute(@RequestBody Request request);
}
