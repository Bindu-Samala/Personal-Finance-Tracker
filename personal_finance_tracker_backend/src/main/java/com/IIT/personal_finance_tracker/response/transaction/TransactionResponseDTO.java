package com.IIT.personal_finance_tracker.response.transaction;

import com.IIT.personal_finance_tracker.entity.transaction.Transaction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionResponseDTO {
    private int statusCode;
    private String error;
    private String message;
    private String Size;
    private BigDecimal amountofIncome;
    private BigDecimal amountofExpense;
    private Transaction transaction;
    private List<Transaction> transactionList;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public BigDecimal getAmountofIncome() {
		return amountofIncome;
	}
	public void setAmountofIncome(BigDecimal amountofIncome) {
		this.amountofIncome = amountofIncome;
	}
	public BigDecimal getAmountofExpense() {
		return amountofExpense;
	}
	public void setAmountofExpense(BigDecimal amountofExpense) {
		this.amountofExpense = amountofExpense;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public List<Transaction> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
}
