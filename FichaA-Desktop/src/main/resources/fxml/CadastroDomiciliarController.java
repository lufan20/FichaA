/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

import Resources.MaterialButton;
import com.celso.fichaa.resources.Controller;
import com.celso.fichaa.resources.Core;
import com.celso.fichaa.view.CadastroDomiciliar;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Classe responsalvel para manter o controle entre a lógica e
 * a View
 * @author Celso Bomfim
 */
public class CadastroDomiciliarController implements Controller{
    
    private CadastroDomiciliar core;
    
    //Componentes
    
    //TextFields
    @FXML
    private TextField sus;
    @FXML
    private TextField cnes;
    @FXML
    private TextField ine;
    @FXML
    private TextField microarea;
    @FXML
    private TextField tipo_logradouro;
    @FXML
    private TextField nome_logradouro;
    @FXML
    private TextField numero;
    @FXML
    private TextField complemento;
    @FXML
    private TextField bairro;
    @FXML
    private TextField municipio;
    @FXML
    private TextField uf;
    @FXML
    private TextField cep;
    @FXML
    private TextField telefone_residencial;
    @FXML
    private TextField telefone_referencia;
    @FXML
    private TextField numero_moradores;
    @FXML
    private TextField numero_comodos;
    @FXML
    private TextField qtd_animais;
    
    //DatePicker
    @FXML
    private DatePicker data_cadastro;
    
    //RadioButton
    //Situação de Moradia
    @FXML
    private RadioButton proprio;
    @FXML
    private RadioButton financiado;
    @FXML
    private RadioButton alugado;
    @FXML
    private RadioButton arrendado;
    @FXML
    private RadioButton cedido;
    @FXML
    private RadioButton ocupacao;
    @FXML
    private RadioButton situacao_rua;
    @FXML
    private RadioButton outra_situacao;
    
    //Localização
    @FXML
    private RadioButton urbana;
    @FXML
    private RadioButton rural;
    
    //tipo de domicilio
    @FXML
    private RadioButton casa;
    @FXML
    private RadioButton apartamento;
    @FXML
    private RadioButton comodo;
    @FXML
    private RadioButton outro_tipo_domicilio;
    
    //area de produção rural
    @FXML
    private RadioButton proprietario;
    @FXML
    private RadioButton comodatario;
    @FXML
    private RadioButton parceiro;
    @FXML
    private RadioButton assentado;
    @FXML
    private RadioButton posseiro;
    @FXML
    private RadioButton arrendatario;
    @FXML
    private RadioButton beneficiario_banco;
    @FXML
    private RadioButton nao_se_aplica;
    
    //tipo de acesso
    @FXML
    private RadioButton asfalto;
    @FXML
    private RadioButton chao_batido;
    @FXML
    private RadioButton fluvial;
    @FXML
    private RadioButton outro_acesso;
    
    //Material da parede
    @FXML
    private RadioButton alvenaria_revestida;
    @FXML
    private RadioButton alvenaria_nao_revestida;
    @FXML
    private RadioButton taipa_revestida;
    @FXML
    private RadioButton taipa_nao_revestida;
    @FXML
    private RadioButton madeira_aparelhada;
    @FXML
    private RadioButton material_aproveitado;
    @FXML
    private RadioButton palha;
    @FXML
    private RadioButton outro_material;
    
    //Energia eletrica
    @FXML
    private RadioButton energia_sim;
    @FXML
    private RadioButton energia_nao;
    
    //abastecimento de agua
    @FXML
    private RadioButton rede_encanada;
    @FXML
    private RadioButton carro_pipa;
    @FXML
    private RadioButton poco;
    @FXML
    private RadioButton cisterna;
    @FXML
    private RadioButton outro_abastecimento;
    
    //Tratamento de agua
    @FXML
    private RadioButton filtracao;
    @FXML
    private RadioButton fervura;
    @FXML
    private RadioButton cloracao;
    @FXML
    private RadioButton sem_tratamento;
    
    //Forma de escoamento
    @FXML
    private RadioButton rede_coletora;
    @FXML
    private RadioButton direto_rio;
    @FXML
    private RadioButton fossa_septica;
    @FXML
    private RadioButton ceu_aberto;
    @FXML
    private RadioButton fossa_rudimentar;
    @FXML
    private RadioButton outra_forma;
    
    //destino do lixo
    @FXML
    private RadioButton coletado;
    @FXML
    private RadioButton queimado;
    @FXML
    private RadioButton lixo_ceu_aberto;
    @FXML
    private RadioButton outro_destino;
    
    //animais
    @FXML
    private RadioButton animais_sim;
    @FXML
    private RadioButton animais_nao;
    
    //CheckBox
    @FXML
    private CheckBox gato;
    @FXML
    private CheckBox cachorro;
    @FXML
    private CheckBox passaro;
    @FXML
    private CheckBox de_criação;
    @FXML
    private CheckBox outros_animais;
    
    /*
    * Botões do menu lateral
    */
    @FXML
    private MaterialButton bt_adicionar;
    @FXML
    private MaterialButton bt_salvar;
    @FXML
    private MaterialButton bt_alterar;
    @FXML
    private MaterialButton bt_pesquisar;
    @FXML
    private MaterialButton bt_cancelar;
    @FXML
    private MaterialButton bt_sair;

    @Override
    public void setMain(Core core) {
        this.core = (CadastroDomiciliar) core;
    }

    @Override
    public void setStage(Stage primaryStage) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @FXML
}
