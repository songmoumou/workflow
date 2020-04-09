package com.song.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author AJohn
 */
@RequestMapping("/modeler/")
@Controller
public class FlowWebController {
  @RequestMapping()
  public String index(){
    return "modeler/index";
  }
}
