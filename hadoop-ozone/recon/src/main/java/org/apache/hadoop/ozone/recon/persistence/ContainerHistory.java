/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.ozone.recon.persistence;

import java.io.Serializable;

/**
 * Some historical info about a container on a datanode.
 */
public class ContainerHistory implements Serializable {

  private long containerId;
  private String datanodeUuid;
  private String datanodeHost;
  private long firstSeenTime;
  private long lastSeenTime;
  private long lastBcsId;
  private String state;
  private long dataChecksum;

  @SuppressWarnings("parameternumber")
  public ContainerHistory(long containerId, String datanodeUuid,
                          String datanodeHost, long firstSeenTime,
                          long lastSeenTime, long lastBcsId, String state, long dataChecksum) {
    this.containerId = containerId;
    this.datanodeUuid = datanodeUuid;
    this.datanodeHost = datanodeHost;
    this.firstSeenTime = firstSeenTime;
    this.lastSeenTime = lastSeenTime;
    this.lastBcsId = lastBcsId;
    this.state = state;
    this.dataChecksum = dataChecksum;
  }

  // Default constructor, used by jackson lib for object deserialization.
  public ContainerHistory() {
  }

  public long getLastBcsId() {
    return lastBcsId;
  }

  public long getContainerId() {
    return containerId;
  }

  public void setContainerId(long containerId) {
    this.containerId = containerId;
  }

  public String getDatanodeUuid() {
    return datanodeUuid;
  }

  public void setDatanodeUuid(String datanodeUuid) {
    this.datanodeUuid = datanodeUuid;
  }

  public String getDatanodeHost() {
    return datanodeHost;
  }

  public void setDatanodeHost(String datanodeHost) {
    this.datanodeHost = datanodeHost;
  }

  public long getFirstSeenTime() {
    return firstSeenTime;
  }

  public void setFirstSeenTime(long firstSeenTime) {
    this.firstSeenTime = firstSeenTime;
  }

  public long getLastSeenTime() {
    return lastSeenTime;
  }

  public void setLastSeenTime(long lastSeenTime) {
    this.lastSeenTime = lastSeenTime;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public long getDataChecksum() {
    return dataChecksum;
  }

  public void setDataChecksum(long dataChecksum) {
    this.dataChecksum = dataChecksum;
  }
}
