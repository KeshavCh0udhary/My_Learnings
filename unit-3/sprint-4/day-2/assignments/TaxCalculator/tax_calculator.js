let TaxCalculator=(Salary)=> {
    if (Salary >= 250000 && Salary < 500000) {
        let Savings = Salary * 10 / 100;
        let Tax = Savings * 50 / 100;
        return Tax;
    } else if (Salary >= 500000 && Salary < 1000000) {
        let Savings = Salary * 20 / 100;
        let Tax = Savings * 30 / 100;
        return Tax;
    } else if (Salary >= 1000000) {
        let Savings = Salary * 30 / 100;
        let Tax = Savings * 10 / 100;
        if (Tax < 50000) {
            return Tax;
        }else{
            return 50000
        }
    }
}

export default TaxCalculator;