package com.test.soapws.mapper;

import com.test.soapws.gen.GetStudentRequest;
import com.test.soapws.gen.GetStudentResponse;
import com.test.soapws.gen.Student;
import com.test.soapws.model.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

/**
 * @author Ashraf on 17-Jul-23
 * @project soapws
 */
@Component
@Mapper(componentModel = "spring")
public interface StudentMapper {

    StudentEntity requestToEntity(GetStudentRequest request);
    Student entityToStudent(StudentEntity entity);
    StudentEntity studentToEntity(Student student);
    @Mapping(target = "student.name",source = "name")
    @Mapping(target = "student.age",source = "age")
    @Mapping(target = "student.id",source = "id")
    @Mapping(target = "student.phoneNumber",source = "phoneNumber")

    GetStudentResponse entityToResponse(StudentEntity studentEntity);


}
