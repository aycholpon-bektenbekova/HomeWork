package HomeWork3;

public class BankAccount {
    private Double amount;

    public BankAccount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {

        return amount;
    }

    public Double deposit(Double sum) {
        System.out.println("Теперь на вашем счете:" + (getAmount() + sum));
        return getAmount() + sum;
    }

    public double withDraw(Integer sum) throws LimitException {
        System.out.println("С вашего счета списано:" +  sum + " " +
                "Ваш текущий счет составляет:" +
                (getAmount() - sum));

        if (sum > amount || sum  < 0) {
            throw new LimitException("Ошибка.");
        }

        return getAmount() - sum;
    }
}


