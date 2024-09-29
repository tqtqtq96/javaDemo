package jsu.ljt.javademo.controller.ch06;

import jsu.ljt.javademo.pojo.ch06.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AccountController {
  private Map<String, Account> accounts = new HashMap<>();

  @PostMapping("/createAccount")
  public String createAccount(@RequestParam String accountId) {
    if (accounts.containsKey(accountId)) {
      return "账户已存在！";
    }
    accounts.put(accountId, new Account(accountId));
    return "账户创建成功！";
  }

  @PostMapping("/deposit")
  public String deposit(@RequestParam String accountId, @RequestParam double amount) {
    Account account = accounts.get(accountId);
    if (account == null) {
      return "账户不存在！";
    }
    account.deposit(amount);
    return "存款成功！ 新余额: " + account.getBalance();
  }

  @PostMapping("/withdraw")
  public String withdraw(@RequestParam String accountId, @RequestParam double amount) {
    Account account = accounts.get(accountId);
    if (account == null) {
      return "账户不存在！";
    }
    account.withdraw(amount);
    return "取款成功！ 新余额: " + account.getBalance();
  }

  @GetMapping("/transactions")
  public List<Account.Transaction> getTransactions(@RequestParam String accountId) {
    Account account = accounts.get(accountId);
    if (account == null) {
      return null;
    }
    return account.getTransactions();
  }
}
