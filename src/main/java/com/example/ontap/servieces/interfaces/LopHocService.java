package com.example.ontap.servieces.interfaces;

import com.example.ontap.entities.LopHoc;

import java.util.List;

public interface LopHocService {
    void add(LopHoc lh);
    void search(String name);

    List<LopHoc> findAll();
}
