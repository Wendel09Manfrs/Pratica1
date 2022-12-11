// Engenharia de Software Moderna
// https://engsoftmoderna.info
// Prof. Marco Tulio Valente

// Exemplo mínimo de uma aplicação Java que segue uma Arquitetura MVC, com motivação didática apenas

import Controladores.*;
import Modelo.*;
import Visao.*;

public class Main {
  public static void main(String[] args) {
    new ControladorPesquisaLivros(
          new ServicoPesquisaLivros(),   // classe do Modelo
          new PaginaDadosLivro()         // classe da Visao      
        ).start();
  }
}