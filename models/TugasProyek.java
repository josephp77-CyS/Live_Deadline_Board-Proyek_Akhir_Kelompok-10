package models;

import java.time.Duration;
import java.time.LocalDateTime;

public class TugasProyek extends Tugas implements Notifikasi {
    private String namaKelompok;

    public TugasProyek(String id, String namaTugas, LocalDateTime tenggatWaktu, String namaKelompok) {
        super(id, namaTugas, tenggatWaktu);
        this.namaKelompok = namaKelompok;
    }

    @Override
    public Duration hitungSisaWaktu() {
        return Duration.between(LocalDateTime.now(), getTenggatWaktu());
    }

    @Override
    public void picuPeringatan() {
        System.out.println("[ALARM PROYEK] Batas koordinasi tim '" + namaKelompok + "' telah berakhir!");
    }

    public String getNamaKelompok() { return namaKelompok; }
}