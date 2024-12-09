package bank.core;

import bank.entities.bank.Bank;
import bank.entities.bank.BranchBank;
import bank.entities.bank.CentralBank;
import bank.entities.client.Adult;
import bank.entities.client.Client;
import bank.entities.client.Student;
import bank.entities.loan.Loan;
import bank.entities.loan.MortgageLoan;
import bank.entities.loan.StudentLoan;
import bank.repositories.LoanRepository;

import java.util.*;
import java.util.stream.Collectors;

import static bank.common.ConstantMessages.*;
import static bank.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {
    private LoanRepository loans;
    private Map<String,Bank> banks;

    public ControllerImpl() {
        this.loans = new LoanRepository();
        this.banks = new LinkedHashMap<>();
    }

    @Override
    public String addBank(String type, String name) {
        Bank bank = null;
        switch (type) {
            case "BranchBank":
                bank = new BranchBank(name);
                break;
            case "CentralBank":
                bank = new CentralBank(name);
                break;
            default:
                throw new IllegalArgumentException(INVALID_BANK_TYPE);
        }
        banks.put(name,bank);
        return String.format(SUCCESSFULLY_ADDED_BANK_OR_LOAN_TYPE,type);
    }

    @Override
    public String addLoan(String type) {
        Loan loan = null;
        switch (type){
            case "StudentLoan":
                loan = new StudentLoan();
                break;
            case "MortgageLoan":
                loan = new MortgageLoan();
                break;
            default:
                throw new IllegalArgumentException(INVALID_LOAN_TYPE);
        }
        this.loans.addLoan(loan);
        return String.format(SUCCESSFULLY_ADDED_BANK_OR_LOAN_TYPE,type);
    }

    @Override
    public String returnedLoan(String bankName, String loanType) {
        Loan loanForService = this.loans.findFirst(loanType);

        if (loanForService == null){
            throw new IllegalArgumentException(String.format(NO_LOAN_FOUND,loanType));
        }
        Bank bank = this.banks.get(bankName);
        bank.addLoan(loanForService);
        this.loans.removeLoan(loanForService);

        return String.format(SUCCESSFULLY_ADDED_CLIENT_OR_LOAN_TO_BANK,loanType,bankName);
    }

    @Override
    public String addClient(String bankName, String clientType, String clientName, String clientID, double income) {
        Client client;
        switch (clientType){
            case "Student":
                client = new Student(clientName,clientID,income);
                break;
            case "Adult":
                client = new Adult(clientName,clientID,income);
                break;
            default:
                throw new IllegalArgumentException(INVALID_CLIENT_TYPE);
        }

        Bank bank = this.banks.get(bankName);
        String output;
        if (!isSuitable(clientType,bank)){
            output = UNSUITABLE_BANK;
        }else {
            bank.addClient(client);
            output = String.format(SUCCESSFULLY_ADDED_CLIENT_OR_LOAN_TO_BANK,clientType,bankName);
        }
        return output;
    }

    private boolean isSuitable(String clientType, Bank bank) {
        String bankType = bank.getClass().getSimpleName();

        if (clientType.equals("Student") && bankType.equals("BranchBank")){
            return true;
        } else if (clientType.equals("Adult") && bankType.equals("CentralBank")) {
            return true;
        }
        return false;
    }

    @Override
    public String finalCalculation(String bankName) {
        Bank bank = this.banks.get(bankName);

        double clientPrice = bank.getClients().stream()
                .mapToDouble(Client::getIncome).sum();
        double loanPrice = bank.getLoans().stream()
                .mapToDouble(Loan::getAmount).sum();

        return String.format(FUNDS_BANK,bankName,clientPrice + loanPrice);
    }

    @Override
    public String getStatistics() {
        return banks.values()
                .stream().map(Bank::getStatistics)
                .collect(Collectors.joining(System.lineSeparator())).trim();
    }
}
