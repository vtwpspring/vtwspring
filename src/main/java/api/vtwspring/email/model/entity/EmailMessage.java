package api.vtwspring.email.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class EmailMessage {

    private String to;
    private String subject;
    private String message;

}
