/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import modelo.CadastrarProduto;
import java.util.ArrayList;
/**
 *
 * @author luiz
 */
public class ProdutoCadastrarDao {
    public static ArrayList<CadastrarProduto> ListaProdutos = new ArrayList<>();
    public static ArrayList<CadastrarProduto> getListaProdutos() {
        return ListaProdutos;
    }
    public static void setLista(ArrayList<CadastrarProduto> ListaProdutos) {
        ProdutoCadastrarDao.ListaProdutos = ListaProdutos;
    }
    public static boolean inserirProduto(CadastrarProduto c) {
        return ListaProdutos.add(c);
    }
    public static CadastrarProduto buscarProduto(int id) {
        for (CadastrarProduto c : ListaProdutos) {
            if (c.getId() == id) return c;
        }
        return null;
    }
    private static int procurarID(int id) {
        for (int i = 0; i < ListaProdutos.size(); i++) {
            if (ListaProdutos.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public static boolean removerProduto(int id) {
        int Remover_ID = procurarID(id);
        if (Remover_ID != -1) {
            ListaProdutos.remove(Remover_ID);
            return true;
        }
        return false;
    }
    public static boolean atualizarProduto(CadastrarProduto c) {
        int Atualizar_ID = procurarID(c.getId());
        if (Atualizar_ID != -1) {
            ListaProdutos.set(Atualizar_ID, c);
            return true;
        }
        return false;
    }
    public static ArrayList<String> getNomesProdutos() {
    ArrayList<String> nomes = new ArrayList<>();
        for (CadastrarProduto cat : ListaProdutos) {
            nomes.add(cat.getNome());
        }
    return nomes;
}
    public static CadastrarProduto buscarProdutoPorNome(String nome) {
    for (CadastrarProduto p : ListaProdutos) {
        if (p.getNome().equalsIgnoreCase(nome)) {
            return p;
        }
    }
    return null;
}
}
