package Splitwise.service;

import Splitwise.model.Expense;
import Splitwise.model.User;

import java.util.HashMap;
import java.util.List;

public class ExpenseGroup {
    class Pair{
        Double amount;
        Integer userId;

        public Pair(Double amount, Integer userId) {
            this.amount = amount;
            this.userId = userId;
        }
    }
    HashMap<Integer, User> users = new HashMap<>();
    HashMap<Integer, Expense> expenses = new HashMap<>();
    List<Pair> listOfPerUserBalance;

    public void addUser(User user){
        users.put(user.getId(), user);
    }

    public void addExpense(Expense expense){
        expenses.put(expense.getId(), expense);
    }

    public User getUser(Integer userId){
        return users.getOrDefault(userId, null);
    }

    public void addExpensesPerUser(List<Integer> expenseId, List<Integer> user, List<Double> expense){
        for(int i=0; i< expense.size(); i++){
            User expenseUser = getUser(user.get(i));
            Expense newExpense = new Expense(expenseId.get(i), null, expense.get(i));
            expenses.put(expenseId.get(i), newExpense);
        }
    }

    public void calculateExpenditure(){

    }

}
