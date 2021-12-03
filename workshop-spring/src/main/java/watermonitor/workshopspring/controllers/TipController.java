package watermonitor.workshopspring.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import watermonitor.workshopspring.models.TipDto;

@Controller
@RequestMapping("/tips")
public class TipController {

    @GetMapping("")
    public ResponseEntity getTips()  {
        TipDto tipDto = new TipDto(1, "This is the title", "Ignatio is amazing");

        return ResponseEntity.ok().body(tipDto);
    }
}