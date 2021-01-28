package cn.itcast.dtx.txmsgdemo.bank2.service;

import cn.itcast.dtx.txmsgdemo.bank2.model.AccountChangeEvent;

/**
 * Created by Administrator.
 */
public interface AccountInfoService {

    //更新账户，增加金额
    void addAccountInfoBalance(AccountChangeEvent accountChangeEvent);
}
