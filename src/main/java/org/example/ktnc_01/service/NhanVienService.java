package org.example.ktnc_01.service;

import org.example.ktnc_01.model.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {

    private List<NhanVien> list = new ArrayList<>();

    public void themNhanVien (NhanVien nhanVien) {
        list.add(nhanVien);
    }

    public List<NhanVien> findByFirstName (String firstName) {
        List<NhanVien> kq = new ArrayList<>();
        for (NhanVien nhanVien: list) {
            if (nhanVien.getFirstName().equalsIgnoreCase(firstName)) {
                kq.add(nhanVien);
            }
        }
        return kq;
    }
}
