package com.IIT.personal_finance_tracker.entity.transaction;


import com.IIT.personal_finance_tracker.dto.transaction.TransactionDTO;
import com.IIT.personal_finance_tracker.entity.category.Category;
import com.IIT.personal_finance_tracker.utill.enums.TransactionCategoryType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal amount;

    private String description;

    @Column(nullable = false)
    private LocalDate transactionDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransactionCategoryType type;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

	public void setCategory(Category category2) {
		this.category=category2;
		
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setAmount(BigDecimal amount2) {
		this.amount=amount2;
		
	}

	public void setDescription(String description2) {
		this.description=description2;
		
	}

	public void setTransactionDate(LocalDate transactionDate2) {
		this.transactionDate=transactionDate2;
		
	}

	public void setType(TransactionCategoryType type2) {
		this.type=type2;
		
	}

	

	public BigDecimal getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}

	public TransactionCategoryType getType() {
		return type;
	}

	public Category getCategory() {
		return category;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getTransactionDate() {
		
		return transactionDate;
	}


}

