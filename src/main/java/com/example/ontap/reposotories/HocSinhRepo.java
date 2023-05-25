package com.example.ontap.reposotories;

import com.example.ontap.entities.HocSinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface HocSinhRepo extends JpaRepository<HocSinh, String> {

//    @Query(value = "select id, name from hocsinh where lopid=?1", nativeQuery = true)
    List<HocSinh> findByLopID(String lhID);
}
