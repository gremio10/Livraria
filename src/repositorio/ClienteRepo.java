package repositorio;

import classe.Livro;
import java.util.ArrayList;

public class ClienteRepo
{
    private ArrayList<Livro> livroArrayList;

    public ClienteRepo()
    {
        livroArrayList = new ArrayList<Livro>();
    }

    public void addLivro( Livro livro )
    {
        livroArrayList.add( livro );
    }

    public void removeLivro( int index )
    {
        livroArrayList.remove( index );
    }
}
