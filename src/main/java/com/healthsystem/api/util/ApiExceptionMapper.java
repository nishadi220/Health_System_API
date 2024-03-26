
package com.healthsystem.api.util;

import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Provider
public class ApiExceptionMapper implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception exception) {
        // Implement exception handling logic here
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity("An error occurred: " + exception.getMessage())
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
}
