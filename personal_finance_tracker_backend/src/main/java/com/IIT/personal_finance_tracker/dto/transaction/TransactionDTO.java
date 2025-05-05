package com.IIT.personal_finance_tracker.dto.transaction;

import com.IIT.personal_finance_tracker.utill.enums.TransactionCategoryType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {

    private Long id;

    @NotNull(message = "Amount is required.")
    @Positive(message = "Amount must be positive.")
    private BigDecimal amount;

    @Size(min = 1, message = "Description must not be empty.")
    private String description;

    @NotNull(message = "Transaction date is required.")
    private LocalDate transactionDate;


    @NotNull(message = "Transaction type is required.")
    private TransactionCategoryType type;

    @NotNull(message = "Category ID is required.")
    private Long categoryId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public TransactionCategoryType getType() {
		return type;
	}

	public void setType(TransactionCategoryType type) {
		this.type = type;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	
}
