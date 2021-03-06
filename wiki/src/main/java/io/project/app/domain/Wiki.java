package io.project.app.domain;


import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 *
 * @author armena
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Document(collection = "wiki")
public class Wiki implements Serializable {

    @Id
    private String id;
    @Indexed
    @NotNull(message = "User id is mandatory")
    private String userId;
    private String title;
    private String header;
    private String content;
    private Date publishDate;
}
