package com.project.shopapp.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class ProductResponse extends BaseResponse {
    String name;
    String description;
    Double price;
    List<String> thumbnail;
    Long categoryId;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
