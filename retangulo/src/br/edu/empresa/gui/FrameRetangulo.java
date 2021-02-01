package br.edu.empresa.gui;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		textAltura.setBounds(70, 10, 50, 30);
		
		
		// *** Criar um label e Textfield da base
		JLabel labelBase = new JLabel();
		labelBase.setText("Base: ");
		labelBase.setBounds(10, 45, 80, 30);
		
		JTextField textBase = new JTextField();
		textBase.setBounds(70, 45, 50, 30);
		
		
		// *** Criando um botão para calcular
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		Color laranja = new Color(255, 128, 0);
		buttonCalcular.setBackground(laranja);
		buttonCalcular.setBounds(10, 95, 110, 30);
		
		// *** Construir o botão limpar
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		Color laranja1 = new Color(255, 128, 0);
		buttonLimpar.setBackground(laranja1);
		buttonLimpar.setBounds(10, 140, 110, 30);
		
		// *** Labels Resultados
		JLabel labelArea = new JLabel();
		labelArea.setText("Área: ");
		labelArea.setBounds(150, 10, 120, 30);
		
		JLabel labelPerimetro = new JLabel();
		labelPerimetro.setText("Perímetro: ");
		labelPerimetro.setBounds(150, 45, 120, 30);
		
		
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
		
		// *** Ouvintes de ações/eventos
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Retangulo r1 = new Retangulo();
				r1.setAltura(Double.parseDouble(textAltura.getText()));
				r1.setBase(Double.parseDouble(textBase.getText()));
				
				labelArea.setText("Área: " + String.valueOf(r1.CalcularArea()));
				labelPerimetro.setText("Perímetro: " + String.valueOf(r1.calcularPerimetro()));
				
			}
		});
		
	}
	
}
