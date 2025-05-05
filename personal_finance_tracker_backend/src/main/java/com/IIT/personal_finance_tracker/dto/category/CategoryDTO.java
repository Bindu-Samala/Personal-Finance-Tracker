package com.IIT.personal_finance_tracker.dto.category;

import com.IIT.personal_finance_tracker.utill.enums.TransactionCategoryType;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDTO {

    private Long id;
    @Size(min = 1, message = "name must not be empty.")
    private String name;
    private TransactionCategoryType type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TransactionCategoryType getType() {
		return type;
	}
	public void setType(TransactionCategoryType type) {
		this.type = type;
	}

}

