package com.example.ontap.servieces.interfaces;

import com.example.ontap.entities.HocSinh;

import java.util.List;

public interface HocSinhService  {
    void add(HocSinh hs);
    void delete(String id);

    List<HocSinh> find(String lhId);

}

