/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paytech.WebSpring.Controller;

import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author denigunawan
 */
@Controller
public class WaktuController {
   @GetMapping("/waktu")
   @ResponseBody
  public String sekarang(){
       SimpleDateFormat formatwaktu = new SimpleDateFormat("EEEE. dd MM yyyy", new Locale("id", "ID"));
      return formatwaktu.format(new Date());
  }  
  
  @GetMapping("/appinfo")
  @ResponseBody
  public Map<String, String> info(@RequestParam String nama){
        Map<String, String> data = new LinkedHashMap<>();
            data.put("application.name", "Aplikasi SIUP");
            data.put("application.version", "1.0.0");
            data.put("application.update", "2020-01-01");
            data.put("author", nama);
            return data;
    }
}
