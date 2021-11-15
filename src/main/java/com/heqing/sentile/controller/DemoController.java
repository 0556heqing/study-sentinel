package com.heqing.sentile.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.heqing.sentile.handler.BlockHandler;
import com.heqing.sentile.handler.FallbackHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heqing
 * @date 2021/7/16 16:34
 */
@RestController
@RequestMapping("/study")
public class DemoController {

    private  final Logger log = LoggerFactory.getLogger(DemoController.class);

    @GetMapping("/sentinel")
    @SentinelResource(value = "study.sentinel",
            fallbackClass = FallbackHandler.class, fallback = "fallbackHandler",
            blockHandlerClass = BlockHandler.class, blockHandler = "blockHandler")
    public String sentinel(){
        log.info("Controller --> hello sentinel");
        return "hello sentinel !";
    }

}
