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
package com.github.peneksglazami.resources.v1;

import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Second version of service.
 */
@Api(hidden = true)
@Path("/")
public class GreetingResourceV1 {

    @Path("v1/sayHello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello!";
    }

    @Path("v1/sayAloha")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayAloha() {
        return "Aloha!";
    }
}
