package example.demo.products.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDetailVo {
    private int id;
    private int productId;
    private String description;
    private String image;
    private int quantity;
    private String createdAt;
    private double price;
}
