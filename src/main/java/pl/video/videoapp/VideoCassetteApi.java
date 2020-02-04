package pl.video.videoapp;


import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassettes")
public class VideoCassetteApi {


    private List<VideoCassette> videoCassettes;

    public VideoCassetteApi() {
        videoCassettes = new ArrayList<>();
        videoCassettes.add(new VideoCassette(1L, "Titanic", LocalDate.of(1999, 1, 1)));
        videoCassettes.add(new VideoCassette(2L, "Pulp Fiction", LocalDate.of(1994, 3, 1)));

    }

    @GetMapping("/all")
    public List<VideoCassette> getAll() {
        return videoCassettes;
    }

    @GetMapping("/{id}")
    public VideoCassette getById(@PathVariable Long id) {
        Optional<VideoCassette> first = videoCassettes.stream().filter(element -> element.getId() == id).findFirst();
        return first.get();
    }

    @PostMapping
    public boolean addVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassettes.add(videoCassette);

    }

    @PutMapping
    public boolean updateVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassettes.add(videoCassette);

    }


    @DeleteMapping("/{id}")
    public boolean deleteVideo(@PathVariable Long id) {
        return videoCassettes.removeIf(element -> element.getId() == id);
    }




}


