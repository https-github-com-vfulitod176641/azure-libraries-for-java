// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.management.sql.JobStepAction;
import com.azure.management.sql.JobStepExecutionOptions;
import com.azure.management.sql.JobStepOutput;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JobStep model.
 */
@JsonFlatten
@Fluent
public class JobStepInner extends ProxyResource {
    /*
     * The job step's index within the job. If not specified when creating the
     * job step, it will be created as the last step. If not specified when
     * updating the job step, the step id is not modified.
     */
    @JsonProperty(value = "properties.stepId")
    private Integer stepId;

    /*
     * The resource ID of the target group that the job step will be executed
     * on.
     */
    @JsonProperty(value = "properties.targetGroup")
    private String targetGroup;

    /*
     * The resource ID of the job credential that will be used to connect to
     * the targets.
     */
    @JsonProperty(value = "properties.credential")
    private String credential;

    /*
     * The action payload of the job step.
     */
    @JsonProperty(value = "properties.action")
    private JobStepAction action;

    /*
     * Output destination properties of the job step.
     */
    @JsonProperty(value = "properties.output")
    private JobStepOutput output;

    /*
     * Execution options for the job step.
     */
    @JsonProperty(value = "properties.executionOptions")
    private JobStepExecutionOptions executionOptions;

    /**
     * Get the stepId property: The job step's index within the job. If not
     * specified when creating the job step, it will be created as the last
     * step. If not specified when updating the job step, the step id is not
     * modified.
     * 
     * @return the stepId value.
     */
    public Integer stepId() {
        return this.stepId;
    }

    /**
     * Set the stepId property: The job step's index within the job. If not
     * specified when creating the job step, it will be created as the last
     * step. If not specified when updating the job step, the step id is not
     * modified.
     * 
     * @param stepId the stepId value to set.
     * @return the JobStepInner object itself.
     */
    public JobStepInner withStepId(Integer stepId) {
        this.stepId = stepId;
        return this;
    }

    /**
     * Get the targetGroup property: The resource ID of the target group that
     * the job step will be executed on.
     * 
     * @return the targetGroup value.
     */
    public String targetGroup() {
        return this.targetGroup;
    }

    /**
     * Set the targetGroup property: The resource ID of the target group that
     * the job step will be executed on.
     * 
     * @param targetGroup the targetGroup value to set.
     * @return the JobStepInner object itself.
     */
    public JobStepInner withTargetGroup(String targetGroup) {
        this.targetGroup = targetGroup;
        return this;
    }

    /**
     * Get the credential property: The resource ID of the job credential that
     * will be used to connect to the targets.
     * 
     * @return the credential value.
     */
    public String credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The resource ID of the job credential that
     * will be used to connect to the targets.
     * 
     * @param credential the credential value to set.
     * @return the JobStepInner object itself.
     */
    public JobStepInner withCredential(String credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get the action property: The action payload of the job step.
     * 
     * @return the action value.
     */
    public JobStepAction action() {
        return this.action;
    }

    /**
     * Set the action property: The action payload of the job step.
     * 
     * @param action the action value to set.
     * @return the JobStepInner object itself.
     */
    public JobStepInner withAction(JobStepAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the output property: Output destination properties of the job step.
     * 
     * @return the output value.
     */
    public JobStepOutput output() {
        return this.output;
    }

    /**
     * Set the output property: Output destination properties of the job step.
     * 
     * @param output the output value to set.
     * @return the JobStepInner object itself.
     */
    public JobStepInner withOutput(JobStepOutput output) {
        this.output = output;
        return this;
    }

    /**
     * Get the executionOptions property: Execution options for the job step.
     * 
     * @return the executionOptions value.
     */
    public JobStepExecutionOptions executionOptions() {
        return this.executionOptions;
    }

    /**
     * Set the executionOptions property: Execution options for the job step.
     * 
     * @param executionOptions the executionOptions value to set.
     * @return the JobStepInner object itself.
     */
    public JobStepInner withExecutionOptions(JobStepExecutionOptions executionOptions) {
        this.executionOptions = executionOptions;
        return this;
    }
}
