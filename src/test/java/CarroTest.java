import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    @Test
    void deveRetornarVersaoComAcessorios() {
        Acessorios acessorio1 = new Acessorios("Pacote 1");
        Acessorios acessorio2 = new Acessorios("Pacote 2");

        Item item1= new Item("Farol Nebrina", 2700.0F);
        Item item2= new Item("Calha de Chuva", 650.0F);
        Item item3= new Item("Maçaneta Cromada", 400.0F);
        Item item4= new Item("Bancos Couro", 1500.0F);

        acessorio1.addModelo(item1);
        acessorio1.addModelo(item3);

        acessorio2.addModelo(item1);
        acessorio2.addModelo(item2);
        acessorio2.addModelo(item3);
        acessorio2.addModelo(item4);

       Acessorios hatch= new Acessorios("Modelo Hatch");
       hatch.addModelo(acessorio1);
       hatch.addModelo(acessorio2);

       Carro onix= new Carro();
       onix.setVersao(hatch);



        assertEquals("Acessorio: Modelo Hatch\n" +
                        "Acessorio: Pacote 1\n" +
                        "Item: Farol Nebrina - Valor Unitario: 2700.0\n"+
                        "Item: Maçaneta Cromada - Valor Unitario: 400.0\n"+
                        "Acessorio: Pacote 2\n" +
                        "Item: Farol Nebrina - Valor Unitario: 2700.0\n"+
                        "Item: Calha de Chuva - Valor Unitario: 650.0\n"+
                        "Item: Maçaneta Cromada - Valor Unitario: 400.0\n"+
                        "Item: Bancos Couro - Valor Unitario: 1500.0\n", onix.getVersao());
    }
}