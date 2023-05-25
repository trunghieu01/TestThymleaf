package com.example.ontap.servieces;

import com.example.ontap.entities.LopHoc;
import com.example.ontap.reposotories.LopHocRepo;
import com.example.ontap.servieces.interfaces.LopHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LopHocServiceImpl implements LopHocService{

    @Autowired
    private LopHocRepo lopHocRepo;

    @Override
    public void add(LopHoc lh) {
        lopHocRepo.save(lh);
    }

    @Override
    public void search(String id) {
        lopHocRepo.findById(id);
    }

    @Override
    public List<LopHoc> findAll() {
        return lopHocRepo.findAll();
    }
}
