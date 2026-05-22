package models;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Tugas {
    private String id;
    private String namaTugas;
    private LocalDateTime tenggatWaktu;

    public Tugas(String id, String namaTugas, LocalDateTime tenggatWaktu) {
        this.id = id;
        this.namaTugas = namaTugas;
        this.tenggatWaktu = tenggatWaktu;
    }

    public abstract Duration hitungSisaWaktu();

    public String getId() { return id; }
    public String getNamaTugas() { return namaTugas; }
    public LocalDateTime getTenggatWaktu() { return tenggatWaktu; }
}