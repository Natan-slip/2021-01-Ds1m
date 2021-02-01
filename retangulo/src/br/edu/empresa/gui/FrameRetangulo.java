package br.edu.empresa.gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.empresa.model.Retangulo;

public class FrameRetangulo {

	public void criarTela() {
		
		JFrame telaRetangulo = new JFrame();
		telaRetangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaRetangulo.setSize(500, 300);
		telaRetangulo.setTitle("C�lculos com Retangulo");
		telaRetangulo.setLayout(null);
		telaRetangulo.setLocationRelativeTo(null);
		
		// *** Criar um label e Textfiled da altura
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(10, 10, 80, 30);
		// *** Define a posi��o e tamanho do label (x, e, f, g);
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70, 10, 100, 30);
		
		
		// *** Criar um label e Textfield da base
		JLabel labelBase = new JLabel();
		labelBase.setText("Base: ");
		labelBase.setBounds(10, 45, 80, 30);
		
		JTextField textBase = new JTextField();
		textBase.setBounds(70, 45, 100, 30);
		
		
		// *** Criando um bot�o para calcular
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		Color laranja = new Color(255, 128, 0);
		buttonCalcular.setBackground(laranja);
		buttonCalcular.setBounds(10, 95, 110, 30);
		
		// *** Construir o bot�o limpar
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		Color laranja1 = new Color(255, 128, 0);
		buttonLimpar.setBackground(laranja1);
		buttonLimpar.setBounds(10, 140, 110, 30);
		
		// *** Labels Resultados
		JLabel labelArea = new JLabel();
		labelArea.setText("�rea: ");
		labelArea.setBounds(200, 10, 70, 30);
		
		JLabel labelPerimetro = new JLabel();
		labelPerimetro.setText("Per�metro: ");
		labelPerimetro.setBounds(200, 45, 70, 30);
		
		
		// *** colocar o labelAltura dentro
		// *** do painel de conteudo -> contentPane
		telaRetangulo.getContentPane().add(labelAltura);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(labelBase);
		telaRetangulo.getContentPane().add(textBase);
		telaRetangulo.getContentPane().add(buttonCalcular);
		telaRetangulo.getContentPane().add(buttonLimpar);
		telaRetangulo.getContentPane().add(labelArea);
		telaRetangulo.getContentPane().add(labelPerimetro);
		telaRetangulo.setVisible(true);
		
		// *** Cliques na tela 
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Retangulo r = new Retangulo();
				r.setAltura(Double.parseDouble(textAltura.getText()));
				r.setBase(Double.parseDouble(textBase.getText()));
				
				labelAltura.setText(String.valueOf(r.CalcularArea()));
				labelBase.setText(String.valueOf(r.calcularPerimetro()));
				
			}
		});
		
		
	}
	
}
