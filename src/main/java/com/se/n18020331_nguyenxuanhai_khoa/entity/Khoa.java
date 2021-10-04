package com.se.n18020331_nguyenxuanhai_khoa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Khoa {
    @Id
    @GeneratedValue
    private long id;
    private String khoaName;
    private Long studentId;
}
