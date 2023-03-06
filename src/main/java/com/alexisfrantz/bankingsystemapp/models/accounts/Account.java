package com.alexisfrantz.bankingsystemapp.models.accounts;

import com.alexisfrantz.bankingsystemapp.models.tools.Money;
import com.alexisfrantz.bankingsystemapp.models.tools.Status;
import com.alexisfrantz.bankingsystemapp.models.users.AccountHolder;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public abstract class Account {

    @Id
    private int id;

    private Money balance;

    private AccountHolder primaryOwner;

    private AccountHolder secondaryOwner;

    private Money penaltyFee;

    private LocalDate creationDate;

    private Status status;
}
