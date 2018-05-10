package com.springcloud.feign_consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ruikai.lin  on 2018/5/10 下午3:00.
 * Email: ruikai.lin@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@FeignClient(value = "server-provider")
public interface HelloService {
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    String hello();
}
