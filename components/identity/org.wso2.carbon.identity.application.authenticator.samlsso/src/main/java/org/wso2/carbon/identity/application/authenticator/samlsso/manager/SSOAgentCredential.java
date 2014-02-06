/*
*  Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.identity.application.authenticator.samlsso.manager;


import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.Map;

import org.wso2.carbon.identity.application.authentication.framework.config.ExternalIdPConfig;
import org.wso2.carbon.identity.application.authenticator.samlsso.exception.SAMLSSOException;

public interface SSOAgentCredential {

    void init(ExternalIdPConfig externalIdPConfig) throws SAMLSSOException;

    PublicKey getPublicKey() throws SAMLSSOException;

    PrivateKey getPrivateKey()throws SAMLSSOException;

    X509Certificate getEntityCertificate() throws SAMLSSOException;

}
