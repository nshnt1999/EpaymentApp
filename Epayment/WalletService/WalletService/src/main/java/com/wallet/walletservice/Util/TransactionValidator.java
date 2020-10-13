package com.wallet.walletservice.Util;

import com.shashi.walletservice.Model.Transaction;

public class TransactionValidator {
    public boolean validateRequest (Transaction request){
        if(request.getSid()==NULL||request.getRid()==NULL)  return false;
        return true;
    }
}
