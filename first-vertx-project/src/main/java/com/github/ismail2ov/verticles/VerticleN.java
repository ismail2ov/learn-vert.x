package com.github.ismail2ov.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VerticleN extends AbstractVerticle {

  public static final Logger LOG = LoggerFactory.getLogger(VerticleN.class);

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    LOG.debug("Start {} with config {}", getClass().getName(), config());
    startPromise.complete();
  }
}
