package pl.video.videoapp.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.video.videoapp.manager.VideoCassetteManager;
import pl.video.videoapp.model.VideoCassette;

import java.util.Optional;

@RestController
@RequestMapping("/api/cassettes")
public class VideoCassetteApi {


    private VideoCassetteManager videoCassettes;

    @Autowired
    public VideoCassetteApi(VideoCassetteManager videoCassettes) {
        this.videoCassettes = videoCassettes;
    }

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll() {
        return videoCassettes.findAll();
    }

    @GetMapping("/{id}")
    public Optional<VideoCassette> getById(@PathVariable Long id) {
        return videoCassettes.find(id);
    }

    @PostMapping
    public VideoCassette addVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassettes.save(videoCassette);

    }

    @PutMapping
    public VideoCassette updateVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassettes.save(videoCassette);

    }


    @DeleteMapping("/{id}")
    public void deleteVideo(@PathVariable Long id) {
        videoCassettes.deleteById(id);
    }




}


