package com.uet.int2204.Week7;

import java.util.ArrayList;

public class Account {

    private double balance;

    private ArrayList<Transaction> transitionList = new ArrayList<>();

    private void deposit(double deposit) {
        if (deposit <= 0.0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        balance += deposit;
        transitionList.add(new Transaction(Transaction.DEPOSIT, deposit, balance));
    }

    private void withdraw(double withdraw) {
        if (withdraw <= 0.0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (withdraw > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        balance -= withdraw;
        transitionList.add(new Transaction(Transaction.WITHDRAW, withdraw, balance));
    }

    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT))
            deposit(amount);
        else if (operation.equals(Transaction.WITHDRAW))
            withdraw(amount);
        else
            System.out.println("Yeu cau khong hop le!");
    }

    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            int transactionId = i + 1;
            double amount = transitionList.get(i).getAmount();
            double balance = transitionList.get(i).getBalance();
            if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT))
                System.out.printf("Giao dich %d: Nap tien $%.2f. So du luc nay: $%.2f.\n", transactionId, amount, balance);
            else
                System.out.printf("Giao dich %d: Rut tien $%.2f. So du luc nay: $%.2f.\n", transactionId, amount, balance);
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.addTransaction(2000.255, "deposit");
        account.addTransaction(1000, "withdraw");
        account.printTransaction();
    }
}