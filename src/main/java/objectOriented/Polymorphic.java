package objectOriented;

/**
 * 多态
 *
 * @author ：wangjianfeng
 * @date ：Created in 2020-03-01 15:55
 */
public class Polymorphic {
    public static void main(String[] args) {
        Income[] incomes = new Income[]{
                new Income(3000),
                new Income(7000),
                new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));

    }

    public static double totalTax(Income... incomes){
        double total = 0;
        for(Income income: incomes){
            total = total + income.getTax();
        }
        return total;
    }
}

class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1;
    }

}

class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        double limit = 5000;
        if (income <= limit) {
            return 0;
        }
        return (income - limit) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}