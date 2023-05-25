package com.example.ontap.reposotories;

import com.example.ontap.entities.LopHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LopHocRepo extends JpaRepository<LopHoc, String> {
    @Query(value = "select * from lophoc", nativeQuery = true)
    List<LopHoc> findAll();
}
