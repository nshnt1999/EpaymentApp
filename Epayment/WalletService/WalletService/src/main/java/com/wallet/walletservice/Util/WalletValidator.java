package com.wallet.walletservice.Util;

import com.shashi.walletservice.Model.Wallet;

public class WalletValidator {
    public boolean validateWalletRequest(Wallet wallet){
        if(wallet.getId()==NULL||wallet.getIsActive()==false)   return false;
        return true;
    }
}
