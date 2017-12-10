package com.xiongyingqi.springcloud.feign.command;

import com.xiongyingqi.springcloud.feign.command.api.Command;
import com.xiongyingqi.springcloud.feign.command.vo.Request;
import com.xiongyingqi.springcloud.feign.command.vo.ReturnResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiongyingqi
 * @since 2017/12/10
 */
@RestController
public class ListCommand implements Command {
  private static final Logger logger = LoggerFactory.getLogger(ListCommand.class);

  public ReturnResult execute(Request request) {
    logger.info("Execute request: {}", request);
    return ReturnResult.SUCCESS;
  }
}
