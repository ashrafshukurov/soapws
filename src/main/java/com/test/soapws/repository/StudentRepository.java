package com.test.soapws.repository;

import com.test.soapws.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ashraf on 17-Jul-23
 * @project soapws
 */
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {


}
