import TaxCalculator from "./tax_calculator.js";

test("Calculate Tax",()=>{
     expect(TaxCalculator(300000)).toBe(15000);
});

