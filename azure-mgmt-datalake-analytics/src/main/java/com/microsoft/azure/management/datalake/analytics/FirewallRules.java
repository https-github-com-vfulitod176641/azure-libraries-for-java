/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.datalake.analytics.models.FirewallRule;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in FirewallRules.
 */
public interface FirewallRules {
    /**
     * Lists the Data Lake Analytics firewall rules within the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;FirewallRule&gt; object if successful.
     */
    PagedList<FirewallRule> listByAccount(final String resourceGroupName, final String accountName);

    /**
     * Lists the Data Lake Analytics firewall rules within the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<FirewallRule>> listByAccountAsync(final String resourceGroupName, final String accountName, final ListOperationCallback<FirewallRule> serviceCallback);

    /**
     * Lists the Data Lake Analytics firewall rules within the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;FirewallRule&gt; object
     */
    Observable<Page<FirewallRule>> listByAccountAsync(final String resourceGroupName, final String accountName);

    /**
     * Lists the Data Lake Analytics firewall rules within the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;FirewallRule&gt; object
     */
    Observable<ServiceResponse<Page<FirewallRule>>> listByAccountWithServiceResponseAsync(final String resourceGroupName, final String accountName);

    /**
     * Creates or updates the specified firewall rule. During update, the firewall rule with the specified name will be replaced with this new firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to create or update.
     * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FirewallRule object if successful.
     */
    FirewallRule createOrUpdate(String resourceGroupName, String accountName, String firewallRuleName, String startIpAddress, String endIpAddress);

    /**
     * Creates or updates the specified firewall rule. During update, the firewall rule with the specified name will be replaced with this new firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to create or update.
     * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<FirewallRule> createOrUpdateAsync(String resourceGroupName, String accountName, String firewallRuleName, String startIpAddress, String endIpAddress, final ServiceCallback<FirewallRule> serviceCallback);

    /**
     * Creates or updates the specified firewall rule. During update, the firewall rule with the specified name will be replaced with this new firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to create or update.
     * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FirewallRule object
     */
    Observable<FirewallRule> createOrUpdateAsync(String resourceGroupName, String accountName, String firewallRuleName, String startIpAddress, String endIpAddress);

    /**
     * Creates or updates the specified firewall rule. During update, the firewall rule with the specified name will be replaced with this new firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to create or update.
     * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FirewallRule object
     */
    Observable<ServiceResponse<FirewallRule>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String accountName, String firewallRuleName, String startIpAddress, String endIpAddress);

    /**
     * Gets the specified Data Lake Analytics firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FirewallRule object if successful.
     */
    FirewallRule get(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Gets the specified Data Lake Analytics firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to retrieve.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<FirewallRule> getAsync(String resourceGroupName, String accountName, String firewallRuleName, final ServiceCallback<FirewallRule> serviceCallback);

    /**
     * Gets the specified Data Lake Analytics firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FirewallRule object
     */
    Observable<FirewallRule> getAsync(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Gets the specified Data Lake Analytics firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FirewallRule object
     */
    Observable<ServiceResponse<FirewallRule>> getWithServiceResponseAsync(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Updates the specified firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FirewallRule object if successful.
     */
    FirewallRule update(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Updates the specified firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to update.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<FirewallRule> updateAsync(String resourceGroupName, String accountName, String firewallRuleName, final ServiceCallback<FirewallRule> serviceCallback);

    /**
     * Updates the specified firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FirewallRule object
     */
    Observable<FirewallRule> updateAsync(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Updates the specified firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FirewallRule object
     */
    Observable<ServiceResponse<FirewallRule>> updateWithServiceResponseAsync(String resourceGroupName, String accountName, String firewallRuleName);
    /**
     * Updates the specified firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to update.
     * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FirewallRule object if successful.
     */
    FirewallRule update(String resourceGroupName, String accountName, String firewallRuleName, String startIpAddress, String endIpAddress);

    /**
     * Updates the specified firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to update.
     * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<FirewallRule> updateAsync(String resourceGroupName, String accountName, String firewallRuleName, String startIpAddress, String endIpAddress, final ServiceCallback<FirewallRule> serviceCallback);

    /**
     * Updates the specified firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to update.
     * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FirewallRule object
     */
    Observable<FirewallRule> updateAsync(String resourceGroupName, String accountName, String firewallRuleName, String startIpAddress, String endIpAddress);

    /**
     * Updates the specified firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to update.
     * @param startIpAddress The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @param endIpAddress The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FirewallRule object
     */
    Observable<ServiceResponse<FirewallRule>> updateWithServiceResponseAsync(String resourceGroupName, String accountName, String firewallRuleName, String startIpAddress, String endIpAddress);

    /**
     * Deletes the specified firewall rule from the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Deletes the specified firewall rule from the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to delete.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String resourceGroupName, String accountName, String firewallRuleName, final ServiceCallback<Void> serviceCallback);

    /**
     * Deletes the specified firewall rule from the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Deletes the specified firewall rule from the specified Data Lake Analytics account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Analytics account.
     * @param firewallRuleName The name of the firewall rule to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Lists the Data Lake Analytics firewall rules within the specified Data Lake Analytics account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;FirewallRule&gt; object if successful.
     */
    PagedList<FirewallRule> listByAccountNext(final String nextPageLink);

    /**
     * Lists the Data Lake Analytics firewall rules within the specified Data Lake Analytics account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<FirewallRule>> listByAccountNextAsync(final String nextPageLink, final ServiceFuture<List<FirewallRule>> serviceFuture, final ListOperationCallback<FirewallRule> serviceCallback);

    /**
     * Lists the Data Lake Analytics firewall rules within the specified Data Lake Analytics account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;FirewallRule&gt; object
     */
    Observable<Page<FirewallRule>> listByAccountNextAsync(final String nextPageLink);

    /**
     * Lists the Data Lake Analytics firewall rules within the specified Data Lake Analytics account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;FirewallRule&gt; object
     */
    Observable<ServiceResponse<Page<FirewallRule>>> listByAccountNextWithServiceResponseAsync(final String nextPageLink);

}