package pl.video.videoapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.video.videoapp.model.VideoCassette;
import pl.video.videoapp.repository.VideoCassetteRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class VideoCassetteManager  {

    private VideoCassetteRepo cassetteRepo;

    @Autowired
    public VideoCassetteManager(VideoCassetteRepo cassetteRepo) {
        this.cassetteRepo = cassetteRepo;
    }

    public Optional<VideoCassette> find(Long id) {
        return cassetteRepo.findById(id);
    }


    public Iterable<VideoCassette> findAll() {
        return cassetteRepo.findAll();
    }


    public VideoCassette save(VideoCassette videoCassette) {
        return cassetteRepo.save(videoCassette);
    }


    public void deleteById(Long id) {
        cassetteRepo.deleteById(id);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {

        save(new VideoCassette(1L, "Titanic", LocalDate.of(1999, 1, 1)));
        save(new VideoCassette(2L, "Pulp Fiction", LocalDate.of(1994, 3, 1)));

    }

}
