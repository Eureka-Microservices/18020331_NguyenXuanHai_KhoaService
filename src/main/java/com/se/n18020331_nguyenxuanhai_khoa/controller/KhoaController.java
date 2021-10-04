package com.se.n18020331_nguyenxuanhai_khoa.controller;

import com.se.n18020331_nguyenxuanhai_khoa.VO.ResponseTemplateVO;
import com.se.n18020331_nguyenxuanhai_khoa.entity.Khoa;
import com.se.n18020331_nguyenxuanhai_khoa.service.KhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/khoa")
public class KhoaController {
    @Autowired
    private KhoaService khoaService;

    @PostMapping("/")
    public Khoa saveKhoa(@RequestBody Khoa khoa){

        return khoaService.saveKhoa(khoa);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id")
                                                            Long khoaId){
        return khoaService.getUserWithDepartment(khoaId);
    }
}
