package com.alexisfrantz.bankingsystemapp.models.accounts;

import com.alexisfrantz.bankingsystemapp.models.tools.Money;

import java.math.BigDecimal;

public class CreditCard extends Account {
    private Money creditLimit;

    private BigDecimal interestRate;
}
