// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.cloudera.api.v4;

import com.cloudera.api.model.ApiBulkCommandList;
import com.cloudera.api.model.ApiRoleNameList;
import com.cloudera.api.v3.RoleCommandsResourceV3;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public interface RoleCommandsResourceV4 extends RoleCommandsResourceV3 {

  /**
   * Save namespace for namenodes
   * <p/>
   * Available since API v4.
   *
   * @param roleNames NameNodes for which to save namespace.
   * @return List of submitted commands.
   */
  @POST
  @Path("/hdfsSaveNamespace")
  public ApiBulkCommandList hdfsSaveNamespace(
      ApiRoleNameList roleNames);

  /**
   * Enter safemode for namenodes
   * <p/>
   * Available since API v4.
   *
   * @param roleNames NameNodes for which to enter safemode.
   * @return List of submitted commands.
   */
  @POST
  @Path("/hdfsEnterSafemode")
  public ApiBulkCommandList hdfsEnterSafemode(
      ApiRoleNameList roleNames);

  /**
   * Leave safemode for namenodes
   * <p/>
   * Available since API v4.
   *
   * @param roleNames NameNodes for which to leave safemode.
   * @return List of submitted commands.
   */
  @POST
  @Path("/hdfsLeaveSafemode")
  public ApiBulkCommandList hdfsLeaveSafemode(
      ApiRoleNameList roleNames);

}
