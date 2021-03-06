/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/StartSmartHomeApplianceDiscovery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSmartHomeApplianceDiscoveryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The room where smart home appliance discovery was initiated.
     * </p>
     */
    private String roomArn;

    /**
     * <p>
     * The room where smart home appliance discovery was initiated.
     * </p>
     * 
     * @param roomArn
     *        The room where smart home appliance discovery was initiated.
     */

    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The room where smart home appliance discovery was initiated.
     * </p>
     * 
     * @return The room where smart home appliance discovery was initiated.
     */

    public String getRoomArn() {
        return this.roomArn;
    }

    /**
     * <p>
     * The room where smart home appliance discovery was initiated.
     * </p>
     * 
     * @param roomArn
     *        The room where smart home appliance discovery was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSmartHomeApplianceDiscoveryRequest withRoomArn(String roomArn) {
        setRoomArn(roomArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoomArn() != null)
            sb.append("RoomArn: ").append(getRoomArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSmartHomeApplianceDiscoveryRequest == false)
            return false;
        StartSmartHomeApplianceDiscoveryRequest other = (StartSmartHomeApplianceDiscoveryRequest) obj;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        return hashCode;
    }

    @Override
    public StartSmartHomeApplianceDiscoveryRequest clone() {
        return (StartSmartHomeApplianceDiscoveryRequest) super.clone();
    }

}
