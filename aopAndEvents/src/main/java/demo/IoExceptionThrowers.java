package demo;

import java.io.IOException;

public class IoExceptionThrowers {
  public   void display() throws IOException {
        System.out.println("Display: Throwing IOException");
        throw new IOException();
    }
   public void info() throws IOException
    {
        System.out.println("Info: Throwing IOException");
        throw  new IOException();
    }
}
