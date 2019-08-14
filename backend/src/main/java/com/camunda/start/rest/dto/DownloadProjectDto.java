/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. Camunda licenses this file to you under the Apache License,
 * Version 2.0; you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.camunda.start.rest.dto;

import java.util.Set;

public class DownloadProjectDto {

  public String username;
  public String password;

  public String database;

  public String group;
  public String artifact;
  public String version;

  public String camundaVersion;
  public String springBootVersion;
  public String javaVersion;

  public Set<String> modules;

  public String getGroup() {
    return group;
  }

  public String getDatabase() {
    return database;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getSpringBootVersion() {
    return springBootVersion;
  }

  public String getJavaVersion() {
    return javaVersion;
  }

  public String getArtifact() {
    return artifact;
  }

  public String getVersion() {
    return version;
  }

  public String getCamundaVersion() {
    return camundaVersion;
  }

  public Set<String> getModules() {
    return modules;
  }

}
