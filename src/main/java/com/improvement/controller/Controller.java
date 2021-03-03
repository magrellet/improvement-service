package com.improvement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class Controller {

  @PostMapping("save")
  public ResponseEntity<String> save() {
    //TODO: Save day info
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @GetMapping("info")
  public ResponseEntity<String> get() {
    //TODO: Get day info
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
