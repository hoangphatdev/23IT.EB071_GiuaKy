package dao;

import model.IEmployee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_AddEmployee {
    public  void addEmployee(IEmployee empl) throws IOException {
        File file = new File("controller.EmployeeList.xml");
        if(!file.isFile()){
            file.createNewFile();
        }
        FileOutputStream write = new FileOutputStream(file, true);
        String txt = empl.toString();
        write.write(txt.getBytes());
    }

}
