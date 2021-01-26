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
		telaRetangulo.setTitle("Cálculos com Retangulo");
		telaRetangulo.setLayout(null);
		telaRetangulo.setLocationRelativeTo(null);
		
		// *** Criar um label e Textfiled da altura
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		labelAltura.setBounds(10, 10, 80, 30);
		// *** Define a posição e tamanho do label (x, e, f, g);
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70, 10, 100, 30);
		
		
		// *** Criar um label e Textfield da base
		JLabel labelBase = new JLabel();
		labelBase.setText("Base: ");
		labelBase.setBounds(10, 45, 80, 30);
		
		JTextField textBase = new JTextField();
		textBase.setBounds(70, 45, 100, 30);
		
		
		// *** Criando um botão para calcular
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		Color laranja = new Color(255, 128, 0);
		buttonCalcular.setBackground(laranja);
		buttonCalcular.setBounds(10, 95, 180, 30);
		
		
		// *** colocar o labelAltura dentro
		// *** do painel de conteudo -> contentPane
		telaRetangulo.getContentPane().add(labelAltura);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(labelBase);
		telaRetangulo.getContentPane().add(textBase);
		telaRetangulo.getContentPane().add(buttonCalcular);
		
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
