package example.demo.products.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductVo {
    private int id;
    private String name;
    private String categoryId;
    private String createdAt;
    private ProductDetailVo details;
}
