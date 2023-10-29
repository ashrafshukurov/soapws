package com.test.soapws.service.impl;

import com.test.soapws.gen.GetStudentRequest;
import com.test.soapws.gen.GetStudentResponse;
import com.test.soapws.gen.Student;
import com.test.soapws.mapper.StudentMapper;
import com.test.soapws.model.StudentEntity;
import com.test.soapws.repository.StudentRepository;
import com.test.soapws.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

/**
 * @author Ashraf on 17-Jul-23
 * @project soapws
 */
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    @Override
    public GetStudentResponse getStudent(GetStudentRequest request) {
        StudentEntity studentEntity=studentRepository.findById(request.getId()).orElseThrow(()->new NoSuchElementException());
        return studentMapper.entityToResponse(studentEntity);

    }

    @Override
    public GetStudentResponse addStudent(GetStudentRequest request) {

        StudentEntity studentEntity=studentMapper.requestToEntity(request);
        studentRepository.save(studentEntity);
        GetStudentResponse studentResponse=studentMapper.entityToResponse(studentEntity);
        return studentResponse;
    }
}