package hobbity2020.demo.Controller;

import hobbity2020.demo.Model.Hobbit;
import hobbity2020.demo.Repository.HobbitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HobbitController {
    private final HobbitRepository hobbitRepository;

    @Autowired
    public HobbitController(HobbitRepository hobbitRepository) {
        this.hobbitRepository = hobbitRepository;
    }

    @GetMapping("/hobbits/{id}")
    public Hobbit pobierzHobbita(@PathVariable Long id) {
        return hobbitRepository.findById(id).get();
    }
    @GetMapping("/hobbits")
    public Iterable<Hobbit> pobierzWszystkie() {
        return hobbitRepository.findAll();

    }

}
