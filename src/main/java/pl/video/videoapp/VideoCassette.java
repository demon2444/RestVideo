package pl.video.videoapp;

import java.time.LocalDate;

public class VideoCassette {

    private Long id;
    private String name;
    private LocalDate productionYear;

    public VideoCassette() {
    }

    public VideoCassette(Long id, String name, LocalDate productionYear) {
        this.id = id;
        this.name = name;
        this.productionYear = productionYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }
}
