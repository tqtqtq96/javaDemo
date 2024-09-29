package jsu.ljt.javademo.pojo.ch06;

import java.util.ArrayList;
import java.util.List;

public class Account {
  private String accountId;
  private double balance;
  private List<Transaction> transactions;

  public Account(String accountId) {
    this.accountId = accountId;
    this.balance = 0.0;
    this.transactions = new ArrayList<>();
  }

  public String getAccountId() {
    return accountId;
  }

  public double getBalance() {
    return balance;
  }

  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void deposit(double amount) {
    balance += amount;
    transactions.add(new Transaction("存款", amount));
  }

  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      transactions.add(new Transaction("取款", amount));
    } else {
      transactions.add(new Transaction("取款失败", amount));
    }
  }

  // 成员内部类
  public class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
      this.type = type;
      this.amount = amount;
    }

    public String getType() {
      return type;
    }

    public double getAmount() {
      return amount;
    }

    @Override
    public String toString() {
      return "Transaction{" +
          "type='" + type + '\'' +
          ", amount=" + amount +
          '}';
    }
  }
}

