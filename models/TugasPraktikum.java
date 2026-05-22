package models;

import java.time.Duration;
import java.time.LocalDateTime;

public class TugasPraktikum extends Tugas implements Notifikasi {
    private String linkGCR;

    public TugasPraktikum(String id, String namaTugas, LocalDateTime tenggatWaktu, String linkGCR) {
        super(id, namaTugas, tenggatWaktu);
        this.linkGCR = linkGCR;
    }

    @Override
    public Duration hitungSisaWaktu() {
        return Duration.between(LocalDateTime.now(), getTenggatWaktu());
    }

    @Override
    public void picuPeringatan() {
        System.out.println("[ALARM GCR] Sesi praktikum '" + getNamaTugas() + "' memasuki batas kritis!");
    }

    public String getLinkGCR() { return linkGCR; }
}