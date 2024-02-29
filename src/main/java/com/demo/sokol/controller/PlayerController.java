package com.demo.sokol.controller;


import java.util.List;
import java.util.Optional;

import com.demo.sokol.model.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlayerController {

    @GetMapping("players")
    public ResponseEntity<List<Player>> getPlayers() {
        return null;
    }

    @GetMapping("players/{number}")
    public ResponseEntity<Optional<Player>> getPlayerByNumber(@PathVariable int number) {
        return null;
    }

    @PostMapping("players")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        return new ResponseEntity<>(player, HttpStatus.CREATED);
    }

    @PutMapping("players/{number}")
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player, @PathVariable int number) {
        return new ResponseEntity<>(player, HttpStatus.CREATED);
    }

    // @DeleteMapping("players/{number}")
}
