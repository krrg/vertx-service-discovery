/*
 * Copyright (c) 2011-2016 The original author or authors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *      The Eclipse Public License is available at
 *      http://www.eclipse.org/legal/epl-v10.html
 *
 *      The Apache License v2.0 is available at
 *      http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */

package examples;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.servicediscovery.DiscoveryOptions;
import io.vertx.servicediscovery.DiscoveryService;

/**
 * Examples for documentation.
 *
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
public class Examples {

  public void configuration1(Vertx vertx) {
    DiscoveryService.create(vertx, new DiscoveryOptions().setBackendConfiguration(
        new JsonObject()
            .put("host", "127.0.0.1")
            .put("key", "records")
    ));
  }

}