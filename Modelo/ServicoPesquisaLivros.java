package Modelo;

import java.sql.*;

public class ServicoPesquisaLivros {

  public Livro pesquisaPorIsbn(String isbn) {
    try(Connection con = DriverManager.getConnection("jdbc:sqlite:BD/bib.db")) {
       String query = "select * from livros where isbn = ?"; 
       PreparedStatement stmt = con.prepareStatement(query);
       stmt.setString(1, isbn);
       ResultSet rs = stmt.executeQuery();
       String autor = rs.getString("autor");
       String titulo = rs.getString("titulo");
       return new Livro(isbn, autor, titulo);
    } catch (SQLException e) {
      System.out.println(e.getMessage());
      return null;
    } 
  }       
}
