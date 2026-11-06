void main ()
{
    String [] todo = new String[10];

    int val= 0;

    while (val != 3)
    {
        IO.println("1. Lägg till aktivitet.");
        IO.println("2. Visa aktiviteter.");
        IO.println("3. Avsluta");

        val = Integer.parseInt(IO.readln());

        if (val == 1)
        {
            for (int i=0; i< 10; i++)
            {
                if (todo[i]== null)
                {
                    IO.println("Skriv en aktivitet");
                    todo[i] = IO.readln();

                    break;
                }
            }
        }

        else if (val == 2)
        {
            for (int i=0; i<10; i++)
            {
                if (todo[i] != null)
                {
                    IO.println(todo[i]);
                }
            }
        }

        else if(val==3)
        {
            IO.println("Programmet avslutas.");
        }

        else {
            IO.println("Fel val");
        }

    }
}