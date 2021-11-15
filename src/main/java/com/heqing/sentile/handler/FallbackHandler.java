package com.heqing.sentile.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author heqing
 * @date 2021/7/19 17:12
 */
public class FallbackHandler {

    private static final Logger log = LoggerFactory.getLogger(FallbackHandler.class);

    public static String fallbackHandler() {
        log.info("sentinel -> fallbackHandler");
        return "sentinel -> fallbackHandler";
    }
}
