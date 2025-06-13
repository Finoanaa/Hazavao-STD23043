package com.hei.fy.endpoint.rest.controller;

import com.hei.fy.service.ChatGptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HazavaoController {

  private final ChatGptService chatGptService;

  public HazavaoController(ChatGptService chatGptService) {
    this.chatGptService = chatGptService;
  }

  @GetMapping("/hazavao")
  public String hazavao(@RequestParam String teny) {
    return chatGptService.getMalagasyDefinition(teny);
  }
}
