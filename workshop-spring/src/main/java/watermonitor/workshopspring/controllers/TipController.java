package watermonitor.workshopspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import watermonitor.workshopspring.models.TipDto;
import watermonitor.workshopspring.services.TipService;

import java.util.List;

@Controller
@RequestMapping("/tips")
public class TipController {
    @Autowired
    private TipService tipService;

    @GetMapping("")
    public ResponseEntity getTips()  {
        List<TipDto> tips = this.tipService.getTip();

        return ResponseEntity.ok().body(tips);
    }
}