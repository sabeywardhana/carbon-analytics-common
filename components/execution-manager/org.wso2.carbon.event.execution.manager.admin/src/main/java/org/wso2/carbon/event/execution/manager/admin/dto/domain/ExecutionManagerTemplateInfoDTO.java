/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
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
package org.wso2.carbon.event.execution.manager.admin.dto.domain;

/**
 * DTO class of TemplateDomainInfo for ExecutionManagerAdminService. This only consists required information to display
 */
public class ExecutionManagerTemplateInfoDTO {

    private String domain;
    private String description;
    private ScenarioInfoDTO[] scenarioInfoDTOs;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ScenarioInfoDTO[] getScenarioInfoDTOs() {
        return scenarioInfoDTOs;
    }

    public void setScenarioInfoDTOs(ScenarioInfoDTO[] scenarioInfoDTOs) {
        this.scenarioInfoDTOs = scenarioInfoDTOs;
    }
}
