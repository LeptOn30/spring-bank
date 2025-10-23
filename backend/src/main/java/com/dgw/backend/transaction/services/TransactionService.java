package com.dgw.backend.transaction.services;

import com.dgw.backend.res.Response;
import com.dgw.backend.transaction.dtos.TransactionDTO;
import com.dgw.backend.transaction.dtos.TransactionRequest;

import java.util.List;

public interface TransactionService {
    Response<?>createTransaction(TransactionRequest transactionRequest);
    Response<List<TransactionDTO>> getTransactionsForMyAccount(String accountNumber, int page, int size);
}
