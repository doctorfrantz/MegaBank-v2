package com.alexisfrantz.bankingsystemapp.models.accounts;

import com.alexisfrantz.bankingsystemapp.models.tools.Money;

public class Checking extends Account{
    private String secretKey;

    private Money monthlyMaintenanceFee;

    private Money minimumBalance;
}
