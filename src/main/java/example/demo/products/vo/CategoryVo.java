package example.demo.products.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryVo {
    private int id;
    private String name;
    private List<ProductVo> products;
}
