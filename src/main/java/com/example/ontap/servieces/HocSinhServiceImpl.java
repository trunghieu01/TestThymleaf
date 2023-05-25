package com.example.ontap.servieces;

import com.example.ontap.entities.HocSinh;
import com.example.ontap.reposotories.HocSinhRepo;
import com.example.ontap.servieces.interfaces.HocSinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HocSinhServiceImpl implements HocSinhService {

    @Autowired
    private HocSinhRepo hocSinhRepo;

    @Override
    public void add(HocSinh hs) {
        hocSinhRepo.save(hs);
    }

    @Override
    public void delete(String id) {
        hocSinhRepo.deleteById(id);
    }

    @Override
    public List<HocSinh> find(String lhId) {
        return hocSinhRepo.findByLopID(lhId);
    }
}
