package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class HourlyEmployeeTest {

  private HourlyEmployee hourlyEmployee;

  @Before
  public void setUp() throws Exception {
    hourlyEmployee = new HourlyEmployee("John Smith", new Date(0), 53.0, 40.0);
  }

  @Test
  public void pay() {
    assertEquals(2120.0, hourlyEmployee.pay(), 0.005);
  }

  @Test
  public void payTaxes() {
    assertEquals(2120 * TaxPayer.HOURLY_TAX_RATE, hourlyEmployee.payTaxes(), 0.005);
  }
}