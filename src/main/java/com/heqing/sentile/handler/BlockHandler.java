package com.heqing.sentile.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author heqing
 * @date 2021/7/19 17:14
 */
public class BlockHandler {

    private static final Logger log = LoggerFactory.getLogger(BlockHandler.class);

    public static String blockHandler() {
        log.info("sentinel -> blockHandler");
        return "sentinel -> blockHandler";
    }

}
