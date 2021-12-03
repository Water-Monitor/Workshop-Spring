package watermonitor.workshopspring.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TipDto {
    private long id;
    private String title;
    private String content;
}