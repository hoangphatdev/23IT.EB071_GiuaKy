package controller;

import model.IEmployee;

import java.text.ParseException;
import java.util.List;

public interface CrudEmpl {
     IEmployee addEmpl(IEmployee empl) throws ParseException;
     IEmployee deleteEmpl(IEmployee empl);
     IEmployee editEmpl(IEmployee empl);
     List<IEmployee> selectAllEmpl(IEmployee empl);
}
