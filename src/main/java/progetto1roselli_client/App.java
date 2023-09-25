package progetto1roselli_client;

public class App 
{
    public static void main( String[] args )
    {
        Client cliente = new Client();
        cliente.connetti();
        cliente.comunica();
    }
}
