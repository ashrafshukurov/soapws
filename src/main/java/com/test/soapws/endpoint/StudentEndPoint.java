package com.test.soapws.endpoint;

import com.test.soapws.gen.GetStudentRequest;
import com.test.soapws.gen.GetStudentResponse;
import com.test.soapws.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * @author Ashraf on 17-Jul-23
 * @project soapws
 */

@Endpoint
@RequiredArgsConstructor
public class StudentEndPoint {

    private final StudentService studentService;
    private static final String NameSpace_URI="http://www.test.com/soapws/gen";
    @PayloadRoot(namespace = NameSpace_URI, localPart = "getStudentRequest")
    @ResponsePayload
    public GetStudentResponse getStudent(@RequestPayload GetStudentRequest request) {
        return studentService.getStudent(request);
    }
}
