package watermonitor.workshopspring.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import watermonitor.workshopspring.models.TipDao;
import watermonitor.workshopspring.models.TipDto;
import watermonitor.workshopspring.models.TipLogic;

import java.util.List;

@Mapper
public interface TipMapper {
    TipMapper INSTANCE = Mappers.getMapper(TipMapper.class);

    TipDto mapToDto(TipDao tip);
    List<TipDto> mapToDto(List<TipDao> tip);

    TipDao mapToDao(TipDto tip);
    TipLogic mapToLogic(TipDao tip);
    TipLogic mapToLogic(TipDto tip);
}
