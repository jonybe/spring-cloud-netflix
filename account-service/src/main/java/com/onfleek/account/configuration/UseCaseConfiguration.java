package com.onfleek.account.configuration;

import com.onfleek.account.core.usecase.CreateAccount;
import com.onfleek.account.core.usecase.CreateAccountUseCase;
import com.onfleek.account.core.usecase.GetAccount;
import com.onfleek.account.core.usecase.GetAccountUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public CreateAccountUseCase createAccountUseCase(CreateAccount createAccount, GetAccount getAccount) {
        return new CreateAccountUseCase(createAccount, getAccount);
    }

    @Bean
    public GetAccountUseCase getAccountUseCase(GetAccount getAccount) {
        return new GetAccountUseCase(getAccount);
    }
}
