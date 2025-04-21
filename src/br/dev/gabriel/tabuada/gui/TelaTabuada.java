package br.dev.gabriel.tabuada.gui;

import java.awt.Container;
<<<<<<< HEAD
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
>>>>>>> a86f7df (Painel e scroll adicionados)

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

<<<<<<< HEAD
=======
import br.dev.gabriel.tabuada.model.Tabuada;

>>>>>>> a86f7df (Painel e scroll adicionados)
public class TelaTabuada {
	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private JScrollPane scrollTabuada;
	private String tituloDaTela;

	public void criarTela(String tituloDaTela) {
		this.tituloDaTela = tituloDaTela;
		JFrame tela = new JFrame();
		tela.setTitle(this.tituloDaTela);
		tela.setSize(260, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);

		// Obtendo a referencia do painel de conteudo da tela
		Container container = tela.getContentPane();

		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(20, 20, 150, 30);

		// Texto Multiplicando
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(180, 20, 50, 30);

		// Criar o label minimo multiplicador
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Minimimo multiplicador:");
		labelMinMultiplicador.setBounds(20, 60, 150, 30);

		// Texto MinMultiplicador
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(180, 60, 50, 30);

		// Maximo multiplicador
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo multiplicador");
		labelMaxMultiplicador.setBounds(20, 100, 150, 30);

		// Texto MaxMultiplicador
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(180, 100, 50, 30);

		// Botão calcular
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular!");
		buttonCalcular.setBounds(20, 140, 100, 30);

		// Botão limpar
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar...");
		buttonLimpar.setBounds(130, 140, 100, 30);

<<<<<<< HEAD
=======
		// Criar JList na tela
		listTabuada = new JList();

		// Criar o ScrollPane
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 190, 210, 300);

>>>>>>> a86f7df (Painel e scroll adicionados)
		container.add(labelMultiplicando);
		container.add(labelMinMultiplicador);
		container.add(labelMaxMultiplicador);
		container.add(textMultiplicando);
		container.add(textMinMultiplicador);
		container.add(textMaxMultiplicador);
		container.add(buttonCalcular);
		container.add(buttonLimpar);
<<<<<<< HEAD
=======
		container.add(scrollTabuada);

		// Adicionar ouvintes de ação aos botões
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String multiplicando = textMultiplicando.getText();
				String min = textMinMultiplicador.getText();
				String max = textMaxMultiplicador.getText();

				Tabuada tabuada = new Tabuada();

				double multiplicandoDouble = Double.parseDouble(multiplicando);
				double minimoMultiplicandoDouble = Double.parseDouble(min);
				double maximoMultiplicandoDouble = Double.parseDouble(max);

				tabuada.setMultiplicando(multiplicandoDouble);
				tabuada.setMinimoMultiplicador(minimoMultiplicandoDouble);
				tabuada.setMaximoMultiplicador(maximoMultiplicandoDouble);

				String[] tabuadaResult = tabuada.mostrarTabuada();
				listTabuada.setListData(tabuadaResult);

			}
		});

>>>>>>> a86f7df (Painel e scroll adicionados)
		tela.setVisible(true);
	}

	private void exibirTabuada() {

	}

	private void limparTabuada() {

	}
}
