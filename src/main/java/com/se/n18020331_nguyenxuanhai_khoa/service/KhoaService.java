package com.se.n18020331_nguyenxuanhai_khoa.service;

import com.se.n18020331_nguyenxuanhai_khoa.VO.ResponseTemplateVO;
import com.se.n18020331_nguyenxuanhai_khoa.VO.Student;
import com.se.n18020331_nguyenxuanhai_khoa.entity.Khoa;
import com.se.n18020331_nguyenxuanhai_khoa.repository.KhoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class KhoaService {
    @Autowired
    private KhoaRepository khoaRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Khoa saveKhoa(Khoa khoa) {
        return khoaRepository.save(khoa);
    }

    public ResponseTemplateVO getUserWithDepartment(Long khoaId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Khoa khoa = khoaRepository.findById(khoaId).get();
        vo.setKhoa(khoa);
        Student student =
                restTemplate.getForObject("http://localhost:9001/student/"
                                + khoa.getStudentId(),
                        Student.class);

        vo.setStudent(student);

        return vo;
    }
}
