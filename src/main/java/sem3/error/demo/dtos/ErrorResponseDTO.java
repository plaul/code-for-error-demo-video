package sem3.error.demo.dtos;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class ErrorResponseDTO {
    @ApiModelProperty(notes = "HTTP-status code (same as returned with the response status code",example = "404")
    int status;
    String error;
    String message;
    String path;
}
