package com.se.n18020331_nguyenxuanhai_khoa.VO;

import com.se.n18020331_nguyenxuanhai_khoa.entity.Khoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Khoa khoa;
    private Student student;
}
