package com.patika.kredinbizdeservice.model;

import com.patika.kredinbizdeservice.enums.LoanType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="House Loan")

public class HouseLoan extends Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private final LoanType loanType = LoanType.KONUT_KREDISI;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;


    @Override
    public void calculate(BigDecimal amount, int installment) {

    }


}

