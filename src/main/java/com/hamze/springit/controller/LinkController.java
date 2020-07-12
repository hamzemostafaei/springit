package com.hamze.springit.controller;

import com.hamze.springit.domain.Link;
import com.hamze.springit.repository.LinkRepository;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/links")
public class LinkController {

    private LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @GetMapping("/")
    public List<Link> list() {
        return linkRepository.findAll();
    }

    @PostMapping("/create")
    public Link create(@ModelAttribute Link link) {
        return linkRepository.save(link);
    }

    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable long id) {
        return linkRepository.findById(id);
    }

    @PostMapping("/update")
    public Link update(@PathVariable long id, Link link) {
        return linkRepository.save(link);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        linkRepository.deleteById(id);
    }
}
