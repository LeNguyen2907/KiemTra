package service;

import org.example.ktnc_01.model.NhanVien;
import org.example.ktnc_01.service.NhanVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NhanVienTest {
    NhanVienService nhanVienService = new NhanVienService();

    @Test
    public void testThemNhanVien () {
        NhanVien nv = new NhanVien(1, "NV001", "Chu", "Ngan", "Giang vien", 3000.0);
        nhanVienService.themNhanVien(nv);

        Assertions.assertEquals(1, nhanVienService.findByFirstName("Chu").size());
    }
}
