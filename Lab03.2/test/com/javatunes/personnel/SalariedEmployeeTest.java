package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {

  private SalariedEmployee salariedEmployee;

  @Before
  public void setUp() throws Exception {
    salariedEmployee = new SalariedEmployee("John Smith", new Date(0), 1000.0);
  }

  @Test
  public void pay() {
    assertEquals(1000.0, salariedEmployee.pay(), .005);
  }

  @Test
  public void payTaxes() {
    assertEquals(1000 * TaxPayer.SALARIED_TAX_RATE, salariedEmployee.payTaxes(), 0.005);
  }

  @Test
  public void equals_same() {
    Employee salariedEmployee2 = new SalariedEmployee("John Smith", new Date(0), 1000.0);
    assertTrue(salariedEmployee.equals(salariedEmployee2));
  }
  @Test
  public void equals_different() {
    Employee salariedEmployee2 = new SalariedEmployee("Jane Smith", new Date(0), 1000.0);
    assertNotEquals(salariedEmployee, salariedEmployee2);
  }

  @Test
  public void hashCode_same() {
    Employee salariedEmployee2 = new SalariedEmployee("John Smith", new Date(0), 1000.0);
    assertEquals(salariedEmployee.hashCode(), salariedEmployee2.hashCode());
  }

  @Test
  public void hashCode_different() {
    Employee salariedEmployee2 = new SalariedEmployee("John Smith", new Date(1), 1000.0);
    assertNotEquals(salariedEmployee.hashCode(), salariedEmployee2.hashCode());
  }

}