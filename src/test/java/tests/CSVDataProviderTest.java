package tests;

import annotations.CsvFileTestNG;
import org.testng.annotations.Test;
import providers.CsvDataProvider;

public class CSVDataProviderTest {

  @CsvFileTestNG(path = "csv/test_data.csv")
  @Test(dataProviderClass = CsvDataProvider.class, dataProvider = "CsvDataProvider")
  public void testWithCSV(String param1, String param2, String param3){
    System.out.println(String.format("%s; %s; %s", param1, param2, param3));
  }

  @CsvFileTestNG(path = "csv/test_data.csv", numLinesToSkip = 1)
  @Test(dataProviderClass = CsvDataProvider.class, dataProvider = "CsvDataProvider")
  public void testWithCSVSkipHeaders(String param1, String param2, String param3){
    System.out.println(String.format("%s; %s; %s", param1, param2, param3));
  }

}
