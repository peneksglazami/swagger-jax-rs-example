/*
 * Copyright 2016 Andrey Grigorov
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.peneksglazami.swagger;

import io.swagger.jaxrs.config.BeanConfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * This servlet used for init Swagger's BeanConfig.
 *
 * @author Andrey Grigorov
 */
public class SwaggerBootstrap extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle("swagger-jax-rs-example");
        beanConfig.setDescription("Example of using Swagger for definition REST API of JAX-RS based application");
        beanConfig.setVersion("2.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setBasePath("/api");
        beanConfig.setResourcePackage("com.github.peneksglazami.resources.v1,com.github.peneksglazami.resources.v2");
        beanConfig.setScan(true);
        beanConfig.setPrettyPrint(true);
    }
}