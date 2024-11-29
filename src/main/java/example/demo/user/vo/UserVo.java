package example.demo.user.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserVo {
    private int id;
    private String name;
    private String email;
    private String password;
}
