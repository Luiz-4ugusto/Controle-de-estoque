/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import modelo.Cadastrar;
import java.util.ArrayList;

/**
 *
 * @author luiz
 */
public class CadastrarDao {
    public static ArrayList<Cadastrar> Lista = new ArrayList<>();

    public static ArrayList<Cadastrar> getLista() {
        return Lista;
    }

    public static void setLista(ArrayList<Cadastrar> Lista) {
        CadastrarDao.Lista = Lista;
    }

    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getId() > maiorID) {
                maiorID = Lista.get(i).getId();
            }
        }
        return maiorID;
    }
    //Aqui vai inserir a Categoria na Lista
    public static boolean inserirCategoria(Cadastrar c) {
        return Lista.add(c);
    }
    //aqui eu fiz para ser possivel realizar uma busca de determinada categoria
    public static Cadastrar buscarCategoria(int id) {
        for (Cadastrar c : Lista) {
            if (c.getId() == id) return c;
        }
        return null;
    }
    //Aqui Remove a Categoria
    public static boolean removerCategoria(int id) {
        int Remover_ID = procurarID(id);
        if (Remover_ID != -1) {
            Lista.remove(Remover_ID);
            return true;
        }
        return false;
    }
    //Aqui atualiza a Categoria
    public static boolean atualizarCategoria(Cadastrar c) {
        int Atualizar_ID = procurarID(c.getId());
        if (Atualizar_ID != -1) {
            Lista.set(Atualizar_ID, c);
            return true;
        }
        return false;
    }
    //Aqui procura pelo id
    private static int procurarID(int id) {
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    //pegar nome das categorias
    public static ArrayList<String> getNomesCategorias() {
    ArrayList<String> nomes = new ArrayList<>();
    for (Cadastrar cat : Lista) {
        nomes.add(cat.getNome());
    }
    return nomes;
}
}

