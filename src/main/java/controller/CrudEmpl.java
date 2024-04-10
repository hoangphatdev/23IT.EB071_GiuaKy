package controller;

import model.IEmployee;

import java.text.ParseException;
import java.util.List;

public interface CrudEmpl {
     IEmployee addEmpl() throws ParseException;
     IEmployee deleteEmpl();
     IEmployee editEmpl();
     List<IEmployee> selectAllEmpl();
}
