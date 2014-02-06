/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.identity.sso.saml.dto;

/**
 * This class is used as the DTO to send  the SSO Service Provider info + file path  of the
 * generated public cert. 
 */
public class SAMLSSOServiceProviderInfoDTO {

    private SAMLSSOServiceProviderDTO[] serviceProviders;
    private String pubCertFilePath;
    private boolean isTenantZero;

    public SAMLSSOServiceProviderDTO[] getServiceProviders() {
        return serviceProviders;
    }

    public void setServiceProviders(SAMLSSOServiceProviderDTO[] serviceProviders) {
        this.serviceProviders = serviceProviders;
    }

    public String getPubCertFilePath() {
        return pubCertFilePath;
    }

    public void setPubCertFilePath(String pubCertFilePath) {
        this.pubCertFilePath = pubCertFilePath;
    }

    public boolean isTenantZero() {
        return isTenantZero;
    }

    public void setTenantZero(boolean tenantZero) {
        isTenantZero = tenantZero;
    }
}
