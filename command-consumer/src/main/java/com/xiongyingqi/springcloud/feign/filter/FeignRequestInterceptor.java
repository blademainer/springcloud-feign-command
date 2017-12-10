package com.xiongyingqi.springcloud.feign.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiongyingqi.springcloud.feign.command.vo.Request;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

/**
 * @author xiongyingqi
 * @since 2017/12/10
 */
public class FeignRequestInterceptor implements RequestInterceptor {
  private static final Logger logger = LoggerFactory.getLogger(FeignRequestInterceptor.class);

  public void apply(RequestTemplate requestTemplate) {
    byte[] body = requestTemplate.body();
    if (body == null || body.length == 0) {
      return;
    }
    ObjectMapper mapper = new ObjectMapper();
    try {
      Map<String, String> request = mapper.readValue(body, Map.class);
      RequestTemplate resolve = requestTemplate.resolve(request);
    } catch (IOException e) {
      logger.error("", e);
    }
  }
}
