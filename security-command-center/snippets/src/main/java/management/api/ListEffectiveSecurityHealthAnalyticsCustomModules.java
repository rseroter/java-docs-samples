/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package management.api;

// [START securitycenter_list_effective_security_health_analytics_custom_module]
import com.google.cloud.securitycentermanagement.v1.ListEffectiveSecurityHealthAnalyticsCustomModulesRequest;
import com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient;
import com.google.cloud.securitycentermanagement.v1.SecurityCenterManagementClient.ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse;
import java.io.IOException;

public class ListEffectiveSecurityHealthAnalyticsCustomModules {

  public static void main(String[] args) throws IOException {
    // https://cloud.google.com/security-command-center/docs/reference/security-center-management/rest/v1/organizations.locations.effectiveSecurityHealthAnalyticsCustomModules/list
    // TODO: Developer should replace project_id with a real project ID before running this code
    String projectId = "project_id";

    listEffectiveSecurityHealthAnalyticsCustomModules(projectId);
  }

  public static ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse
      listEffectiveSecurityHealthAnalyticsCustomModules(String projectId) throws IOException {

    // Initialize client that will be used to send requests. This client only needs
    // to be created
    // once, and can be reused for multiple requests.
    try (SecurityCenterManagementClient client = SecurityCenterManagementClient.create()) {

      ListEffectiveSecurityHealthAnalyticsCustomModulesRequest request =
          ListEffectiveSecurityHealthAnalyticsCustomModulesRequest.newBuilder()
              .setParent(String.format("projects/%s/locations/global", projectId))
              .build();

      ListEffectiveSecurityHealthAnalyticsCustomModulesPagedResponse response =
          client.listEffectiveSecurityHealthAnalyticsCustomModules(request);

      return response;
    }
  }
}
// [END securitycenter_list_effective_security_health_analytics_custom_module]
