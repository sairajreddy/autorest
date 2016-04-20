/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.implementation.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for postAsyncNoRetrySucceeded operation.
 */
public class LROsPostAsyncNoRetrySucceededHeadersInner {
    /**
     * Location to poll for result status: will be set to
     * /lro/putasync/retry/succeeded/operationResults/200.
     */
    @JsonProperty(value = "Azure-AsyncOperation")
    private String azureAsyncOperation;

    /**
     * Location to poll for result status: will be set to
     * /lro/putasync/retry/succeeded/operationResults/200.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Number of milliseconds until the next poll should be sent, will be set
     * to zero.
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /**
     * Get the azureAsyncOperation value.
     *
     * @return the azureAsyncOperation value
     */
    public String azureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set the azureAsyncOperation value.
     *
     * @param azureAsyncOperation the azureAsyncOperation value to set
     * @return the LROsPostAsyncNoRetrySucceededHeadersInner object itself.
     */
    public LROsPostAsyncNoRetrySucceededHeadersInner setAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the LROsPostAsyncNoRetrySucceededHeadersInner object itself.
     */
    public LROsPostAsyncNoRetrySucceededHeadersInner setLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the retryAfter value.
     *
     * @return the retryAfter value
     */
    public Integer retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the retryAfter value.
     *
     * @param retryAfter the retryAfter value to set
     * @return the LROsPostAsyncNoRetrySucceededHeadersInner object itself.
     */
    public LROsPostAsyncNoRetrySucceededHeadersInner setRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

}
