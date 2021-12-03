package watermonitor.workshopspring.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import watermonitor.workshopspring.mappers.TipMapper;
import watermonitor.workshopspring.models.TipDao;
import watermonitor.workshopspring.models.TipDto;
import watermonitor.workshopspring.repositories.TipRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TipService {
    @Autowired
    private TipRepository tipRepo;

    //You do logic here
    public List<TipDto> getTip() {
        List<TipDao> tips = this.tipRepo.findAll();

        List<TipDto> tipDtos = TipMapper.INSTANCE.mapToDto(tips);

        return tipDtos;
    }
}
