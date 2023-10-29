package com.test.soapws.service;

import com.test.soapws.gen.GetStudentRequest;
import com.test.soapws.gen.GetStudentResponse;

/**
 * @author Ashraf on 17-Jul-23
 * @project soapws
 */

public interface StudentService {
    GetStudentResponse getStudent(GetStudentRequest request);
    GetStudentResponse addStudent(GetStudentRequest request);
}
