package com.welab.k8s_backend_post.common.exception;

public class NotFound extends ClientError{
    public NotFound(String message){
        this.errorCode = "Not Found";
        this.errorMessage = message;
    }
}
