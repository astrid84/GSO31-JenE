/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.test;

import bank.internettoegang.BalieTest;
import bank.bankieren.BankTest;
import bank.bankieren.RekeningTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The JUnit test suite that contains tests from the test package bank.bankieren.
 *
 * @author Astrid
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ BankTest.class, RekeningTest.class })
public class SuiteBankieren {
    
}
