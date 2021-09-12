package ChapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
  Date date = new Date(1, 10, 1996);

  @Test
  void daysCannotBeLowerThan1Test() {
      date.setDay(0);
      assertEquals(1, date.getDay());
  }

  @Test
  void februaryCannotExceed28DaysInANormalYearTest() {
      date.setYear(2001);
      date.setMonth(2);
      date.setDay(28);
      assertEquals(28, date.getDay());
  }

  @Test
  void februaryCannotExceed29DaysInALeapYearTest() {
      date.setYear(2020);
      date.setMonth(2);
      date.setDay(29);
      assertEquals(29, date.getDay());
  }

  @Test
  void septemberAprilJuneNovemberCannotExceed30DaysTest() {
      date.setMonth(4);
      date.setDay(31);
      assertEquals(30, date.getDay());
  }

  @Test
  void januaryMarchMayJulyAugustOctoberDecemberCannotExceed31DaysTest() {
      date.setMonth(10);
      date.setDay(32);
      assertEquals(31, date.getDay());
  }

  @Test
  void monthCannotBeLowerThan1Test(){
      date.setMonth(-1);
      assertEquals(1, date.getMonth());
  }

//  @Test
//  void monthCannotExceed12Test(){
//      date.setMonth(13);
//      assertEquals(12, date.getMonth());
//  }
//
//  @Test
//  void canDisplayDayMonthYearTest() {
//      date.setDay(6);
//      date.setMonth(9);
//      date.setYear(1994);
//      assertEquals("6/9/1994", date.displayDate());
//  }
}