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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/DeleteSourceCredentials" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSourceCredentialsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the token.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the token.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the token.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the token.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the token.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the token.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSourceCredentialsResult withArn(String arn) {
        setArn(arn);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSourceCredentialsResult == false)
            return false;
        DeleteSourceCredentialsResult other = (DeleteSourceCredentialsResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSourceCredentialsResult clone() {
        try {
            return (DeleteSourceCredentialsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
