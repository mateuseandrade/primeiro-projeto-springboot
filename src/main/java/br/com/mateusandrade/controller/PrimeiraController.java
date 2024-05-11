package br.com.mateusandrade.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/PrimeiraController")
public class PrimeiraController {
  
  @GetMapping("/primeiroMetodo/{id}")
  public String getMethodName(@PathVariable String id) {
      return "O parametro é " + id;
  }

  @GetMapping("/metodoComQueryParams")
  public String metodoComQueryParams(@RequestParam String id) {
      return "O parametro com metodoComQueryParams é " + id;
  }

  @GetMapping("/metodoComQueryParams2")
  public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) {
      return "O parametro com metodoComQueryParams2 é " + allParams.entrySet();
  }
  
}
