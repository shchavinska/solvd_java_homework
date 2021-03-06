package operations;

import exceptions.InputExceptions;
import port.CanoeToBuy;
import ship.Canoe;
import utils.ReadingFromFile;
import utils.WritingToFile;

public class BuyCanoe {
    public static void buyCanoe (CanoeToBuy canoeToBuy) throws InputExceptions {
        System.out.print("Do you want to bye canoe: (yes/no) ");
        String answer = Input.inputStr();

        if ("no".equals(answer)){
            System.out.print("Okay.");
        }
        else if ("yes".equals(answer)){
            System.out.print("Which canoe do you want to buy: ");
            String answer2 = Input.inputStr();
            Canoe boughtCanoe = canoeToBuy.removeCanoe(answer2);
            if (boughtCanoe!=null) {
                System.out.println("Okay, You just buy canoe " + answer2 + "!!!");
                WritingToFile wasBoughtWrite = new WritingToFile();
                wasBoughtWrite.writeToFile("boughtCanoe.txt", "Canoe " + boughtCanoe.getName() + " was bought.");
                ReadingFromFile wasBoughtRead = new ReadingFromFile();
                System.out.println(wasBoughtRead.readFromFile("boughtCanoe.txt"));
            }
            else {
                throw new InputExceptions("Can't found canoe " + answer2);
            }
        }
        else {
            throw new InputExceptions("Sorry, I don't know what you mean.");
        }
    }
}
