package com.welab.k8s_backend_post.common.exception;

public class BadParameter extends ClientError{
    public BadParameter(String Message){
        this.errorCode = "BadParameter";
        this.errorMessage = Message;
    }
}
