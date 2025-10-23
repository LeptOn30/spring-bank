package com.dgw.backend.account.services;

import com.dgw.backend.account.dtos.AccountDTO;
import com.dgw.backend.account.entity.Account;
import com.dgw.backend.auth_users.entity.User;
import com.dgw.backend.enums.AccountType;
import com.dgw.backend.res.Response;

import java.util.List;

public interface AccountService {
    Account createAccount(AccountType accountType, User user);

    Response<List<AccountDTO>> getMyAccounts();

    Response<?> closeAccount(String accountNumber);
}
