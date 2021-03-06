package com.xiongyingqi.springcloud.feign.command.controller;

import com.xiongyingqi.springcloud.feign.command.api.Command;
import com.xiongyingqi.springcloud.feign.command.vo.Request;
import com.xiongyingqi.springcloud.feign.command.vo.ReturnResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

/**
 * @author xiongyingqi
 * @since 2017/12/10
 */
@RestController
public class CommandController {
  private static final Logger logger = LoggerFactory.getLogger(CommandController.class);

  @Autowired
  private Command command;

  @GetMapping("/list")
  public ReturnResult list() {
    Request request = new Request();
    request.setId(UUID.randomUUID().toString());
    request.setCommand("list");
    request.setUser("controller");
    ReturnResult result = command.execute(request);
    logger.info("Execute request: {} and returns result: {}", request, result);
    return result;
  }
}
