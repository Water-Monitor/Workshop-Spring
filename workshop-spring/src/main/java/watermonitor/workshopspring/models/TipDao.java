package watermonitor.workshopspring.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tip")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipDao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private long id;
    @NonNull
    @Column(length=100)
    private String title;
    @NonNull
    @Column(length=1000)
    private String content;
}
