/*--
----This program write a file and read a file one character at a time.
 */
package file_loader_single_character_reading;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kiran
 */
public class Program {

    public static void main(String[] args) {
        String filename = "D:/java/File_Loader_Single_Character_Reading/companies.csv";
        try {
            //---write    
            FileWriter writer = new FileWriter(filename);
            writer.write("1,LinkPink Codemy, He hacks,1\r\n");    //--for new line \r \n
            writer.write("2,Kamaila Kashir, Behind the thou,1\r\n");
            writer.close();
            System.out.println("Completed writing");

            //--Read
            FileReader reader=new FileReader(filename);
            int i=0;
            while((i=reader.read())!=-1){ //-- for single reading.. return intergerby reader.read()
            System.out.print((char)i);
            }
            reader.close();
            
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

}
