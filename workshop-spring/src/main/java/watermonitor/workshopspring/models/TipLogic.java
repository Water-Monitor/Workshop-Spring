package watermonitor.workshopspring.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TipLogic {
    private long id;
    private String title;
    private String content;

    public void removeLettersThatYouMayNotUse() {
        //Searches into content and looks if their are signs like ">" and will remove that sign. (XSS)
    }
}