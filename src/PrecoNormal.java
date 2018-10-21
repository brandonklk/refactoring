
public class PrecoNormal extends Preco {
   
      @Override
      public int getPreco() {
            return Filme.NORMAL;
      }
   
      @Override
      public double getValor(int diasAluguel) {
            double valor = 1.5;
            if (diasAluguel > 3)
                   valor += (diasAluguel - 3) * 1.5;
            return valor;
      }      
}
   
public class PrecoInfantil extends Preco {
   
      @Override
      public int getPreco() {
            return Filme.INFANTIL;
      }
        
      @Override
      public double getValor(int diasAluguel) {
            double valor = 2;
            if (diasAluguel > 2)
                   valor += (diasAluguel - 2) * 1.5;
            return valor;
      }
}
   
public class PrecoLancamento extends Preco {
   
      @Override
      public int getPreco() {
            return Filme.LANCAMENTO;
      }
        
      @Override
      public double getValor(int diasAluguel) {
            return diasAluguel * 3;
      }
}
